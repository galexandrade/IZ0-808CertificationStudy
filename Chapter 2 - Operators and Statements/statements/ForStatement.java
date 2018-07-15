/**
* Order of initialization
* 1 - Initialization statement executes;
* 2 - If booleanExpression is true continue, else exit loop;
* 3 - Body executes;
* 4 - Execute updateStatements;
* 5 - Return to Step 2
*
* The initialization and update sections may contain multiple statements, separated by commas
*/

public class ForStatement{
	public static void main(String... args){
		System.out.println("AKIIII");	
		
		/*
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		*/		
		
		//Create an Infinite Loop
		/*
		for(;;) {
			System.out.println("Hello World");
		}
		*/
		
		//Multiple Terms
		/*
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.println(x);
		*/
		
		//Redeclaring a Variable in the Initialization Block
		/*
		int x = 0;
		// DOES NOT COMPILE
		for(int y = 0, x = 4; x < 5 && y < 10; x++, y++) { 
			System.out.print(x + " ");
		}
		*/
		
		//Using Incompatible Data Types in the Initialization Block
		/*
		// DOES NOT COMPILE
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { 
			System.out.print(x + " ");
		}
		*/
		
		//Using Loop Variables Outside the Loop
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x); // DOES NOT COMPILE
	}	
}