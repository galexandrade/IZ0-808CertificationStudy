/**
* Must iterate a collection whose class implements java.lang.Iterable
*/

public class ForEach{
	public static void main(String... args){
		System.out.println("AKIIII");	

		/*
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.print(name + ", ");
		}	
		*/
	
		/*
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
			System.out.print(value + ", ");
		}
		*/
		
		/*
		String names = "Lisa";
		for(String name : names) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}
		*/
		
		/*
		String[] names = new String[3];
		for(int name : names) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}
		*/
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
			for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
	}	
}