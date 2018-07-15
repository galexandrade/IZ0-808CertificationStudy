/**
* Supported types:
* int and Integer
* byte and Byte
* short and Short
* char andh Character
* int and Integer
* String
* enum values
*/

public class Switch{
	public static void main(String... args){
		System.out.println("AKIIII");
		
		/*
		int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		*/
		
		/*
		If a BREAK is missing, it jumps to the next case;
		*/
		int dayOfWeek = 0;
		switch(dayOfWeek) {
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 4:
				System.out.println("Saturday0");
			case 6:
				System.out.println("Saturday");
				break;
		}
		
		/*
		1 - the data type for case statements must all match the data type of the switch variable;
		2 - the case statement value must also be a literal, enum constant, or final constant variable.
		*/
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		String firstName = "Alex";
		switch(firstName) {
			case "Test":
				id = 52;
				/*
			case middleName: // DOES NOT COMPILE
				id = 5;
				break;
			case suffix:
				id = 0;
				break;
			case lastName: // DOES NOT COMPILE
				id = 8;
				break;
			case 5: // DOES NOT COMPILE
				id = 7;
				break;
			case 'J': // DOES NOT COMPILE
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
				id=15;
				break;
				*/
		}
	}
	
	
}