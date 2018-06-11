/**
* In casting it always tries to fit on the number size
* SHORT =>>  					MAX   | MIN
*						   <<<< 21767 | -21768 >>>>>

* SHORT are automatically promoted to INT applying any arithmetic operator


Compound operators automatically cast values
ex:
long x2 = 10;
int y2 = 5;
//y2 = y2 * x2; // DOES NOT COMPILE
y2 *= x2; //Compiles
*/

public class Overflow{
	public static void main(String... args){
		short x = Short.MAX_VALUE;
		System.out.println(x); //32767
		System.out.println((short)(x + 1)); //-32768
		System.out.println((short)(x + 1000)); //-31769
		
		System.out.println((short)1921222); //20678
		
		int z = (int)9l;
		long t = 192301398193810323L;
		
		System.out.println(z); //20678
		System.out.println(t); //20678
		
		/*
		short x1 = 10;
		short y1 = 3;
		short z1 = x1 * y1; // DOES NOT COMPILE
		*/
		
		long x2 = 10;
		int y2 = 5;
		//y2 = y2 * x2; // DOES NOT COMPILE
		y2 *= x2;		
		
		
		long a = 5;
		long b = (a=3+5*(1+1));
		System.out.println(a); // Outputs 3
		System.out.println(b); // Also, outputs 3
		
		
		/**
		* RELATIONAL OPERATORS
		*/
		int a1 = 10, b1 = 20, c1 = 10;
		System.out.println(a1 < b1); // Outputs true
		System.out.println(a1 <= b1); // Outputs true
		System.out.println(a1 >= c1); // Outputs true
		System.out.println(a1 > c1); // Outputs false
		
		int a2 = 10;
		double b2 = 20.0;
		System.out.println(a1 < b1); // Outputs true
		
		/**
		* LOGICAL OPERATORS
		* Has true and false in both sides
		* x ^ y (EXCLUSIVE OR)
		*
		* && || Prevents to execute the right-hand side if the first is solved
		*/		
		int k = 6;
		//The right-hand side of the expression is never evaluated
		boolean l = (k >= 6) || (++k <= 7);
		System.out.println(k); //Prints 6
		
		/**
		* Equality OPERATORS
		* 1 - Comparing two numeric primitive types;
		* 2 - Comparing two boolean values.
		* 3 - Comparing two objects, including null and String values;
		*/
		//boolean a3 = true == 3; // DOES NOT COMPILE
		//boolean b3 = false != "Giraffe"; // DOES NOT COMPILE
		//boolean c3 = 3 == "Kangaroo"; // DOES NOT COMPILE
		
		// For object comparison, is applied on the REFERENCE
		String p = new String("myFile.txt");
		String q = new String("myFile.txt");
		String r = p;
		System.out.println(p == q); // Outputs false
		System.out.println(p == r); // Outputs true
		
	}
}