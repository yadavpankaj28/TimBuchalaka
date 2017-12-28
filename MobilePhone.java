package JavaTimPractice;

import java.util.Scanner;

public class MobilePhone {

	private static Scanner scanner = new Scanner(System.in);
	private static Contacts con = new Contacts();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		options();
		int choice = 0;
		boolean quit = true;
		
		while(quit) {
			
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			System.out.println();
			scanner.nextLine();
			
			switch(choice) {
			
			case 0:
				options();
				break;
				
			case 1:
				con.storeName();
				break;
				
			case 2:
				con.Modify();
				break;
				
			case 3:
				con.Remove();
				break;
			
			case 4:
				con.Display();
				break;
				
			case 5:
				quit = false;
				break;
				
			}
			
		}

	}


	private static void options() {
		
		System.out.println("0.Display all the available options");
		System.out.println("1.Store a Contact");
		System.out.println("2.Modify a contact");
		System.out.println("3.Remove a contact");
		System.out.println("4.Display  Contact");
		System.out.println("5.Exit the menu");	
		System.out.println();
		
	}

}
