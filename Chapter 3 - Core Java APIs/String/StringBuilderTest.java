/**
* StringBuilder
* NOT IMMUTABLE -> You can change its value
* StringBuilder changes its own state and returns a reference to itself
* 
*/

public class StringBuilderTest{
	public static void main(String... args){
		System.out.println("AKIIII");
		
		/*Initialization*/
		//Empty string
		StringBuilder sb1 = new StringBuilder();
		//Initialize with String
		StringBuilder sb2 = new StringBuilder("animal");
		//Alocate 10 characters in the memory
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3); //''
		
		StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);
		
		/* Reference */
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a); //abcdefg
		System.out.println("b=" + b); //abcdefg
		
		/**
		* insert()
		* StringBuilder insert(int offset, String str)
		*/
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-"); // sb = animals-
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb);
		
		/**
		* delete() and deleteCharAt()
		* StringBuilder delete(int start, int end)
		* StringBuilder deleteCharAt(int index)
		*/
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); // sb = adef
		//sb4.deleteCharAt(5); // throws an exception
		System.out.println(sb4);		
		
		/**
		* reverse()
		* StringBuilder reverse()
		*/
		StringBuilder sb5 = new StringBuilder("ABC");
		sb5.reverse();
		System.out.println(sb5);
	}
}