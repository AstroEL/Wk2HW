package menu;

/* Leiland Tanner
 Promineo wk 2 Homework - 
 --------------------------------------------Research Portion:-------------------------------------------
 *	Directions:	Explain the different loops (For, while, do while) and give examples of when to use them
 * 
 *	While: The while-loop will run its code as long as its boolean expression is 'true', or 
 *		in other words it loops through a set of instructions while a specified condition is 
 *		true - it stops when the condition is no longer true or is met. Here is the syntax:
 *		
 *		while (condition) {
 *   	code block to be executed
 *		}
 *
 *		EX.WHEN.TO.USE: While-loops are best suited when you do not know ahead of time the 
 *						number of iterations that you need to do. If you do know, use the 
 *						'for-loop'. So counting a number of objects that is variable would
 *						be an example, like how many buses are running - to display how many 
 *						people enter a building v. capacity, to count lights on in a house, etc. 
 *			
 * 	For: Loops through a block of code a number of times and is ideal to use for loops where
 * 		incrementing or decrementing a variable is useful. It uses the following syntax:
 *
 *		for (statement 1; statement 2; statement 3) {
 *   	code block to be executed
 *		}
 *
 *		where statement 1 is performed only the first time and sets rule for where the 
 *		loop is going to start, statement 2 defines the condition and statement 3 is 
 *		performed every loop but not until AFTER the code has been executed, usually to 
 *		increment the variable up or down.
 * 
 * 		EX.WHEN.TO.USE: A good example of when to use a for-loop is to simply count 
 * 						through a list of values by different increments or to shorten
 * 						the amount of typing it would take to write repeating code that
 * 						goes up or down in increments.
 * 
 *	Do/While: The do/while-loop is much like the 'while-loop', but the difference is that the 
 * 		do/while-loop will run the block of code initially without checking if the condition is 
 * 		true or false (the while loop will only run if the condition is true), then it will
 * 		repeat and continue with the loop if and as long as the condition is true. Syntax:
 * 
 * 		do {
 *   		code block to be executed
 *		}
 *		while (condition);
 * 
 * 		EX.WHEN.TO.USE: A guessing game would be a great example of when to use the do/while, 
 * 						because it would prompt the players at least once at the beginning to 
 * 						guess and loop until the correct answer was given. I found a great 
 * 						example online of this:
 * 			
 * 			Scanner scanner = new Scanner(System.in);
 *			String guess;
 *			do {
 *   			System.out.print("Guess my name: ");
 *   			guess = scanner.nextLine();
 *			}
 *			while (!"Leiland Tanner".equals(guess));
 *			System.out.println("Congratulations, you guessed my name correctly!");
 * 
 *	Sources:www.pluralsight.com - "The Labyrinth of Loops
 *			https://www.w3schools.com/js/js_loop_for.asp
 *			https://www.sitepoint.com/javas-while-and-do-while-loops-tutorial/#dowhileloop		
 *
 ---------------------------------------------Coding Portion:----------------------------------------------
 *			Create a menu driven application with at least 4 options in addition to the exit option. 
 *			Each option should do something unique and include some conditionals (boolean logic) 
 *
 *
 *
 *
 *
 *
*/
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
		int num  = (int) (Math.random()* 6);
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
			}	
			//sc.close();
			
	}
	private void pickMystery() {
		int num  = (int)(Math.random() * 3);
		switch (num) {
			case 0:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nReal living is living for others -Bruce Lee");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 1:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nAssume the good and doubt the bad");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 2:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nHave you done any good in the world today? Have you helped someone else in need?");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			case 3:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nWhy do we call horned toads toads, when they are quite obviously lizards?");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
			default:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
		}
		
	}

} 
