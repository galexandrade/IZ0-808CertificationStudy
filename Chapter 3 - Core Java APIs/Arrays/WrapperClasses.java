import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays

/**
* ArrayList implements an interface called List
* Primitive type 	Wrapper class 	Example of constructing
* ---------------+----------------+---------------------------
* boolean 			Boolean 		new Boolean(true)
* byte 				Byte 			new Byte((byte) 1)
* short 			Short 			new Short((short) 1)
* int 				Integer 		new Integer(1)
* long 				Long 			new Long(1)
* float 			Float 			new Float(1.0)
* double 			Double 			new Double(1.0)
* char 				Character 		new Character('c')

* CONVERTING STRINGS
* Wrapper class 	Converting String to primitive	Converting String to wrapper class
* -----------------+-------------------------------+------------------------------------
* Boolean 			Boolean.parseBoolean("true"); 	Boolean.valueOf("TRUE");
* Byte 				Byte.parseByte("1"); 			Byte.valueOf("2");
* Short 			Short.parseShort("1"); 			Short.valueOf("2");
* Integer 			Integer.parseInt("1"); 			Integer.valueOf("2");
* Long 				Long.parseLong("1"); 			Long.valueOf("2");
* Float 			Float.parseFloat("1"); 			Float.valueOf("2.2");
* Double 			Double.parseDouble("1"); 		Double.valueOf("2.2");
* Character 		None 							None
*/
public class WrapperClasses{
	public static void main(String... args){
		System.out.println("AKISIISIS");
		
		//Returns a primitive
		int primitive = Integer.parseInt("123");
		//Returns a Wrapper Class
		Integer wrapper = Integer.valueOf("123");

		//int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException		
		
		/**
		* Autoboxing
		* You can just type the primitive value and Java will convert it to the
		* relevant wrapper class for you
		*/
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0); // 60.0
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0); // NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1); // Index 1
		System.out.println(numbers); //[1]
	}
}