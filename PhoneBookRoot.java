package phoneBookApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookRoot {

	public static void main(String[] args) {
//		displayMenu();
		
		Address addressContact1 = new Address("114 Market St", "St. Louis", "Missouri", "63403");
		Address addressContact2 = new Address("324 Main St", "St. Charles", "Washington", "63303");
		Address addressContact3 = new Address("574 Pole ave", "St. Peters", "Nebraska", "63333");
		
		Person person1 = new Person("John", "Doe", "6366435698", addressContact1);
		Person person2 = new Person("Jake", "West", "8475390126", addressContact2);
		Person person3 = new Person("Adam", "Smith", "5628592375", addressContact3);
		
		ArrayList<Person>peopleArrayList = new ArrayList<>();
		
		peopleArrayList.add(person1);
		peopleArrayList.add(person2);
		peopleArrayList.add(person3);
	
	//Display the Option menu
	while(true) {
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		Scanner contactZipInput  = new Scanner(System.in);
		
	
		System.out.println("Hello, What would you like to do");
		System.out.println("1. Add a new contact");
		System.out.println("2. Search by First name");
		System.out.println("3. Search by Last name");
		System.out.println("4. Search by Street Name");
		System.out.println("5. Delete a record by phone number");
		System.out.println("6. Search Contact by City");
		System.out.println("7. Search Contact by State");
		System.out.println("8. Update contact first name");
		System.out.println("9. Show all contacts");
		System.out.println("10. Exit the program");
		
		int choice = userInput.nextInt();
		
		switch (choice){
			
		case 1: // User wants to add a new contact to their phone book
			System.out.println("\n What is the First name of the person you would like to add? (firstName");
			String firstName = userInput.next();
			
			System.out.println("\n What is the Last name  of the contact you would like to add? (lastName)");
			String lastName = userInput.next();
			
			System.out.println("\n What is the phone number of your new contact (contactNum)");
			String contactNumber = userInput.next();
			
			System.out.println("\n What street does your new contact live on? (contactStreet)");
			String streetName = userInput2.nextLine();
			
			System.out.println("What city does your new contact live in?");
			String City = userInput.next();
			
			System.out.println("What state does your new contact live in?");
			String State = userInput.next();
			
			System.out.println("What is your new contacts zip code?");
			String zipCode = contactZipInput.next();
			
//			
			Person p = new Person();
			p.setFirstName(firstName);
			p.setLastName(lastName);
			p.setContactNumber(contactNumber);
//			
			
			Address a = new Address();
			a.setStreetName(streetName);
			a.setCity(City);
			a.setState(State);
			a.setZipCode(zipCode);
			
			System.out.println();
			
			Person b = new Person(firstName, lastName, contactNumber, new Address(streetName, City, State, zipCode));
			
			peopleArrayList.add(b);
			
			System.out.println("you added " + firstName + " " + lastName + " " + contactNumber + " " + streetName + " " + City + " " + State + " " + zipCode);
			
			break;
			
		case 2: //user wants to Search their contacts by first name
			System.out.println("What is the first name of the contact you wish to search for?");
			String userFirstName = userInput.next();

			Address c = new Address();
			c.getStreetName();
			c.getCity();
			c.getState();
			c.getZipCode();
			
			//Search Phone book by first name
			for(int i = 0; i < peopleArrayList.size(); i++) {
				if(peopleArrayList.get(i) != null) {
				if(peopleArrayList.get(i).getFirstName().trim().equals(userFirstName)) {
					System.out.print(peopleArrayList.get(i) + " " + peopleArrayList.get(i).getAddress());
					System.out.println();
				}
			}
		}
				
			break;
			
		case 3: // user wants to search their contacts by last name
			System.out.println("What is the last name of the contact you wish to search for?");
			
			String userLastName = userInput.next();
			//Search Contacts by last name 
			for(int i = 0; i < peopleArrayList.size(); i++) {
				if(peopleArrayList.get(i) != null) {
				if(peopleArrayList.get(i).getLastName().trim().equals(userLastName)) {
					System.out.println(peopleArrayList.get(i).getFirstName() + " " + peopleArrayList.get(i).getLastName() + " " + peopleArrayList.get(i).getContactNumber() + " " + peopleArrayList.get(i).getAddress());
					System.out.println();
				}
			}
		}
			break;
			
		case 4: //User wants to search by Street Name eg: 4460 parcel st
			System.out.println("Enter your contacts Street Address to search eg: 4460 spoon dr");
			
			String userAddress = userInput2.nextLine();
			
			//Search by StreetName
			for(int i = 0; i < peopleArrayList.size(); i++) {
				if(peopleArrayList.get(i) != null) {
				if(peopleArrayList.get(i).getAddress().getStreetName().equals(userAddress)) {
					System.out.println(peopleArrayList.get(i).getFirstName() + " " + peopleArrayList.get(i).getLastName() + " " + peopleArrayList.get(i).getContactNumber() + " " + peopleArrayList.get(i).getAddress());
					System.out.println();
				}
			}
		}
			break;
			
		case 5: // User  wants to delete a record by Phone number
			System.out.println("what is the phone number of the contact you would like to delete");
			
			String deleteByPhoneNumber = userInput2.nextLine();
			
//			Person[] targetArray = new Person[peopleArrayList.size()-1];
//			for (int i = 0; i < peopleArrayList.size(); i++) {
//				String convertPhoneNumber = peopleArrayList).getContactNumber().replaceAll(" ", "");
//				if (!deleteByPhoneNumber.equals(contactNumber)){
//					targetArray[count] = peopleList[i];
//					count1++;
//				} 
//			}
//			System.out.println("Record deleted.");
//			return targetArray;
			
//			int count1 = 0;
//
//			Person[] targetArray = new Person[peopleArrayList.size()-1];
//
//			for(int i = 0; i < targetArray.length; i++)
//			{
//				if(peopleArrayList.get(i).getContactNumber().equals(deleteByPhoneNumber)) 
//				{	
//					peopleArrayList.remove(i);
//					count1--;					
//					System.out.println(targetArray);			
//
//				}
//
//			}
//			break;
			
		int countOne = 0;
		
		
			
			Person[] targetArray = new Person[peopleArrayList.size()-1];

			for(int i = 0; i < peopleArrayList.size(); i++)
			{
				if(deleteByPhoneNumber.equals(peopleArrayList.get(i).getContactNumber())) 
				{
					targetArray[countOne] = peopleArrayList.get(i);
					
					countOne--;
					
					peopleArrayList.remove(i);
					
					System.out.println(" removed ");
				}

			}
				break;
				
		case 6: //User wants to Search Contacts by City
			System.out.println("What is the City Of the contact you would like to search for");
			String searchByContactCity = userInput2.nextLine();
			
			for(int i = 0; i < peopleArrayList.size(); i++) {
				if(peopleArrayList.get(i) != null) {
					if(peopleArrayList.get(i).getAddress().getCity().equals(searchByContactCity)) {
						System.out.println(peopleArrayList.get(i).getFirstName() + " " + peopleArrayList.get(i).getLastName() + " " + peopleArrayList.get(i).getContactNumber() + " " + peopleArrayList.get(i).getAddress());
						System.out.println();
					}
				}
			}
				break;
		
		case 7: // User Wants to search contacts by State
			System.out.println("What is the State your contact lives in");
			String searchByContactState = userInput2.nextLine();
			
			for(int i = 0; i < peopleArrayList.size(); i++) {
				if(peopleArrayList.get(i) !=null) {
					if(peopleArrayList.get(i).getAddress().getState().contentEquals(searchByContactState)) {
						System.out.println(peopleArrayList.get(i).getFirstName() + " " + peopleArrayList.get(i).getLastName() + " " + peopleArrayList.get(i).getContactNumber() + " " + peopleArrayList.get(i).getAddress());
						System.out.println();
					}
				}
			}
				break;
			
		case 8: //User wants to update a contacts first name using the contacts number
			System.out.println("What is the phone number of the contact you want to update?");
			String updateByContactPhone = userInput2.next();
			
			System.out.println("What is the new name you would change to?");
			String contactNewName = userInput2.next();
			
			for(int i = 0; i<peopleArrayList.size(); i++) {
				
				if(peopleArrayList.get(i) != null) {
					
					if(peopleArrayList.get(i).getContactNumber().equals(updateByContactPhone)) {
						
						peopleArrayList.get(i).setFirstName(contactNewName);
						
						System.out.println("contact updated successful");
					}
				}
			}
				break;
		
		case 9: //User wants to view all of the contacts in their phone book
			int count = 0;
			for(int i = 0; i<peopleArrayList.size(); i++) {
			if(peopleArrayList.get(i) != null) {
				count++;
			}
		}
			String[] personName = new String[count];
			
			for(int i = 0; i<personName.length; i++) {
				personName[i] = peopleArrayList.get(i).getFirstName();
			}
			
//			Collections.sort(peopleArrayList);
			Arrays.sort(personName);
			
			for(int i =0; i < peopleArrayList.size(); i++) {
			 
				System.out.println(peopleArrayList.get(i)+ " " + peopleArrayList.get(i).getAddress());
			}
			
			break;
			
		case 10: //User wants to exit the program
			System.out.println("\n Good Bye!!!");
			System.exit(10);
			
			
		default: 
		
		}

	}
	
	}
}
