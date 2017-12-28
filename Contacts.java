package JavaTimPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	
	private ArrayList<String> contactName = new ArrayList<String>();
	private ArrayList<String> contactNumber = new ArrayList<String>();
	private static Scanner scan = new Scanner(System.in);
	
	

	public void storeName() {
		
		
		System.out.print("Enter the name of the contact: ");
		String name = scan.nextLine();
		int index = FindContact(name);
		if(index < 0) {
		contactName.add(name);
		System.out.print("Enter the number of the contact: ");
		contactNumber.add(scan.nextLine());
		System.out.println("Contact Added");
		}
		
		else {
			System.out.println("Contact Exist");
		}
		
	}

	public void Display() {
		
		if(contactName.size()>0) {
			for(int i=0 ; i< contactName.size() ; i++) {
				System.out.println((i+1)+" Contact Name: "+ contactName.get(i) + " Contact Number: "+ contactNumber.get(i));
				
			}
		}
		
		else {
			System.out.println("Contact List Empty");
		}
		
	}

	public void Remove() {
		
		System.out.print("Enter the Name of the contact you want to Remove: ");
		String name = scan.nextLine();
		int index = FindContact(name);
		if(index == -1) {
			
			System.out.println("Element doesn't exist");
								
		}
		
		else {
			contactName.remove(index);
			contactNumber.remove(index);
			System.out.println("Contact removed");
			
		}
		
		
	}

	public void Modify() {
		
		System.out.print("Enter the Name of the contact you want to edit: ");
		String name = scan.nextLine();
		int index = FindContact(name);
		if(index >= 0) {
			System.out.println("Enter the new name:");
			name = scan.nextLine();
			contactName.set(index, name);
			System.out.println("Enter new number:");
			String number = scan.nextLine();
			contactNumber.set(index, number);
						
		}
		
		else {
			System.out.println("Element doesn't exist");
		}		
		
	}
	
	private int FindContact(String name) {
		
		int index = contactName.indexOf(name);
		if(index >= 0) {
			return index;
		}
		return index;
				
	}

}
