package WorkingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RunnerClass {

	private static ArrayList<String> names;
	private static ArrayList<Integer> ages;
	private static ArrayList<String> jobs;
	private static ArrayList<Person> personList;
	private static ArrayList<Person> newPersonList;
	
	public static void main(String[] args) {
		names = new ArrayList<String>();
		ages = new ArrayList<Integer>();
		jobs = new ArrayList<String>();
		personList = new ArrayList<Person>();
		names.addAll(Arrays.asList("Peter", "John", "Steve", "Mike", "Luke"));
		ages.addAll(Arrays.asList(22, 31, 55, 75, 26));
		jobs.addAll(Arrays.asList("Postman", "QA Consultant", "Sysadmin", "Programmer", "CEO"));

		for(int i = 0; i < names.size(); i++) {
			personList.add(new Person(names.get(i), ages.get(i), jobs.get(i)));
			System.out.println(personList.get(i));
		}
		
		findRandomPerson();
		writePeopleToFile();
		newPersonList = new ArrayList<Person>();
		readPeopleFromFile();
		
		
	}
	
	private static Person searchName(String name) {
		 for (Person person : personList) {
             if(person.toString().contains("Name: "+ name)){
                 return person;
             }
         }
		 return null;
	}
	
	private static void findRandomPerson() {

		Random rand = new Random();
		int n = rand.nextInt(5);
		System.out.println("You were looking for " + names.get(n) + ", you found: " + searchName(names.get(n)));
	
	}
	
	private static void writePeopleToFile() {
		for(Person person : personList) {
			BufferedWriter bw;
			try {
				bw = new BufferedWriter(new FileWriter(person.getName() + ".txt"));
				bw.write(person.toString());
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void readPeopleFromFile() {
		//assumes that we still have access to the people from the personList
		for(Person person : personList) {
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(person.getName() + ".txt"));
				String personInfo = br.readLine();
				//assumes that all inputs do not have spaces
				String[] personSplit = personInfo.split(" ");
				newPersonList.add(new Person(personSplit[1], Integer.parseInt(personSplit[3]), personSplit[5]));
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("These people were made using the files");
		for(Person person : newPersonList) {
			System.out.println(person.toString());
		}
	}

	
}
