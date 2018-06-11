public class Initialization{
	// DOES NOT COMPILE
	//int num, String value; 
	
	// DOES NOT COMPILE
	//double d1, double d2;
	
	String s1, s2;
	String s3 = "yes", s4 = "no";
	
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
	//Only i3 has the value 3
	// Class Variables (fields) initialize the default value
	int i1, i2, i3 = 3;
	{
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
	
	/**
	* CLASS VARIABLES INITIALIZATION
	* fields initialize the default value
	* 
	* Default values:
	* boolean				 	false
	* byte, short, int, long 	0 (in the type’s bit-length)
	* float, double			 	0.0 (in the type’s bit-length)
	* char					 	'\u0000' (NUL)
	* All object references  	null
	*/
	
	
	public static void main(String[] args){
		
		new Initialization();
		
	}
	
	/**
	* LOCAL VARIABLES
	* Must be initialized before use
	*/
	public int returnMyInt(){
		int y = 10;
		int x = 1;
		int reply = x + y; // DOES NOT COMPILE
		return reply;
	}
}