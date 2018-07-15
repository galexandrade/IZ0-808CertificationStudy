/**
* String has a special type of initialization
* Ex:
* String name = "Alex";				// USE THE STRING POOL
* String name = new String("Alex"); // DONT USE THE STRING POOL, IT CREATES A NEW OBJECT

* String pool is used to save memory reusing common literals

* Once a String object is created, it is not allowed to change.
* String is IMMUTABLE.
*/

public class StringTest{
	public static void main(String... args){
		System.out.println("AKIIII");
		
		/**
		* Concatenation:
		* 1. If both operands are numeric, + means numeric addition.
		* 2. If either operand is a String, + means concatenation.
		* 3. The expression is evaluated left to right.
		*/
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); //It won't apply, because it just return a new String
		System.out.println(s2);
		
		/**
		*String methods
		*/
		String st = "animals";
		
		//length
		System.out.println(st.length()); //7
		
		//charAt
		System.out.println(st.charAt(6)); // s
		//System.out.println(st.charAt(7)); // throws exception IndexOutOfBoundsException
		
		/**
		* indexOf		
		* int indexOf(char ch)
		* int indexOf(char ch, index fromIndex)
		* int indexOf(String str)
		* int indexOf(String str, index fromIndex)
		
		* DIFERENCIATE CASE
		* DOES NOT THROW EXCEPTION, returns -1 if it does not find
		*/
		System.out.println(st.indexOf('a')); // 0
		System.out.println(st.indexOf("al")); // 4
		System.out.println(st.indexOf('a', 4)); // 4
		System.out.println(st.indexOf("al", 5)); // -1
		
		/**
		* substring
		* String substring(int beginIndex)
		* String substring(int beginIndex, int endIndex)
		
		* THROWS EXCEPTION if the index is out
		*/
		System.out.println(st.substring(3)); // mals
		System.out.println(st.substring(st.indexOf('m'))); // mals
		System.out.println(st.substring(3, 4)); // m -> STOPS BEFORE CHAR INDEX 4 (a)
		System.out.println(st.substring(3, 7)); // mals
		
		System.out.println(st.substring(3, 3)); // empty string
		//System.out.println(st.substring(3, 2)); // throws exception
		//System.out.println(st.substring(3, 8)); // throws exception
		
		/**
		* toLowerCase() and toUpperCase()
		* String toLowerCase()
		* String toUpperCase()
		*/
		System.out.println(st.toUpperCase()); // ANIMALS
		System.out.println("Abc123".toLowerCase()); // abc123
		
		/**
		* equals() and equalsIgnoreCase()
		* boolean equals(String str)
		* boolean equalsIgnoreCase(String str)
		*/
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		
		/**
		* startsWith() and endsWith()
		* boolean startsWith(String prefix)
		* boolean endsWith(String suffix)
		*/
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		
		/**
		* contains()
		* boolean contains(String str)
		*/
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		
		/**
		* replace()
		* String replace(char oldChar, char newChar)
		* String replace(CharSequence oldChar, CharSequence newChar)
		*/
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		
		/**
		* trim()
		* public String trim()
		* 
		* It leaves the single spaces that are in the middle of the string.
		*/	
		System.out.println("abc".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c
		
		/*###*/
		String result = "AniMaL  ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
	}
}