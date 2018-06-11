public class Operators{
	public static void main(String... args){
		short x = +14;
		float y = 13;
		double z = 30;
		
		System.out.println(x * y / z);
		
		/*
		int x = !5; // DOES NOT COMPILE
		boolean y = -true; // DOES NOT COMPILE
		boolean z = !0; // DOES NOT COMPILE
		*/
		
		/**
		* PRE-OPERATORS / POST-OPERATORS
		* --var ++var => Process and return the value
		* var-- var++ => Return the old value and then process		
		*/
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter); // Outputs 1
		System.out.println(counter); // Outputs 1
		System.out.println(counter--); // Outputs 1
		System.out.println(counter); // Outputs 0
	}
}