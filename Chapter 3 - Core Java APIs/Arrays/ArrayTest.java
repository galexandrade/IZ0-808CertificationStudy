import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays

public class ArrayTest{
	public static void main(String... args){
		System.out.println("AKISIISIS");
		
		//All the elements is setted with the default value type
		int[] numbers1 = new int[3];
		
		int[] numbers2 = new int[] {42, 55, 99};
		int[] numbers3 = {42, 55, 99};
		
		int[] numAnimals;
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		
		//Two variables of int Array
		int[] ids, types;
		
		//Only var ids2 is an array
		int ids2[], types2;
		
		
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		//It looks the reference
		System.out.println(bugs.equals(alias)); // true
		//L... means it is an array
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		
		//It throws an Exception at runTime because the elements is a string
		//objects[0] = new StringBuilder(); // careful!
		
		
		//SORTING
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.println (numbers[i] + " ");
		
		System.out.println("-----------------------");
		
		String[] strings2 = { "10", "9", "100" };
		Arrays.sort(strings2);
		for (String string : strings2)
			System.out.println(string + " "); //10 100 9
		
		System.out.println("-----------------------");
		
		// SEARCHING
		// It is only for sorted arrays
		int[] numbers4 = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers4, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers4, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers4, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers4, 3)); // -2
		//The number does not existe, it could be inserted int position 4, so -4 -1 = -5
		System.out.println(Arrays.binarySearch(numbers4, 9)); // -5
		
		System.out.println("-----------------------");
		
		//Unsorted Array, the result migth be unpredictable
		int[] numbers5 = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers5, 2));
		System.out.println(Arrays.binarySearch(numbers5, 3));
	}
}