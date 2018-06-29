package menu;

import java.util.Scanner;

public class Menu {
	
	boolean exit;
	
	public static void main(String[] args) {		

	Menu menu = new Menu();
	menu.runMenu();	
	}
	public void runMenu() {
		printHeader();
		while (!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice); 	
		}
	}
	private void printHeader() {
			System.out.println("+-----------------------------------------------+");
			System.out.println("              You Have Entered"					  );
			System.out.println("               Leiland's Mind"					  );
			System.out.println("+-----------------------------------------------+");
	}		
	private void printMenu() {
			System.out.println("\n...........Please Make a Selection...............");
			System.out.println("1) What the, How did I get here?!");
			System.out.println("2) Sweet, what is on your mind Leiland?");
			System.out.println("3) Tell me something interesting..");
			System.out.println("4) How do I get out of here??!");
			System.out.println("+-----------------------------------------------+");
	}	
	private int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 0 || choice > 4) {
			try {
				System.out.print("\nEnter your selection:");
				choice = Integer.parseInt(kb.nextLine());
				
			}
			catch (NumberFormatException e) {
				System.out.println("The instructions were pretty simple... please try again.");
				
			}
		}
		return choice;		
	}
	private void performAction(int choice) {
		switch(choice) {
			case 0:
				exit = true;
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nIt was a pleasure to have you inside of my mind. Until we meet again.");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 1:
				pickExplain();
				break;
			case 2:
				pickThought();
				break;
			case 3:
				pickMystery();
				break;
			case 4:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nI won't force you to have fun or learn. Select the magic number 0 to leave. Good day sir");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			default:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
		}
	}
	private void pickExplain() {
		int num  = (int)(Math.random()* 3);
		switch (num) {
			case 0:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nYou're not really here");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 1:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nYou were abducted by aliens");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 2:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nYou are actually Lucid Dreaming right now");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 3:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nThe magic of science");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
				break;
			default:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
		}
		
	}
	private void pickThought() {
		System.out.println("It depends on your age... how old are you?");	
			Scanner sc = new Scanner(System.in);			
			int choice = sc.nextInt();
			if (choice  >18 && choice < 105) {
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nMy great great Uncle Henry used to say, 'Be careful with a man who will come to you"
					+ "	\nwith stories of another, because he will surely leave with a new story to tell'");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else if (choice <18) {
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\n'As you think, so shall you become -Bruce Lee'");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else {
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		
				System.out.println("\nHmm. Interesting choice, I think I'll keep my thoughts to myself.");	
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			sc.close();	
			}
			
	}
	private void pickMystery() {
		int num  = (int)(Math.random() * 3);
		switch (num) {
			case 0:
				System.out.println("\nReal living is living for others -Bruce Lee");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 1:
				System.out.println("\nAssume the good and doubt the bad");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 2:
				System.out.println("\nHave you done any good in the world today? Have you helped someone else in need?");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 3:
				System.out.println("\nWhy do we call horned toads toads, when they are quite obviously lizards?");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			default:
				System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
		}
		
	}

} 
