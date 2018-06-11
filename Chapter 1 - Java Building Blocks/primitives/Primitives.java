public class Primitives{
	public static void main(String[] args){
		//DOES NOT COMPILE: Integer number too large
		long max = 3123456789L;
		
		long max2 = 123;
		
		//PRIMITIVES CANNOT BE NULL
		//Null means it does not refer to an object, but primitives are not objects
		int cannotBeNull = null;
		
		System.out.println(56); // 56
		
		/* ADD Underscores to be easier to read */
		//double notAtStart = _1000.00; // DOES NOT COMPILE
		//double notAtEnd = 1000.00_; // DOES NOT COMPILE
		//double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // this one compiles
		
		/*
		BINARY
		** From back to front
		2^5 2^4 2^3 2^2 2^1 2^0
		32  16   8   4   2   1
		------------------------
		             1   1   0  = 6
		1	0	 1	 1   1   1  = 47
		*/
		System.out.println(0b11); // 3
		System.out.println(0b101111); // 47
		
		/*
		OCTAL
		** From back to front
		8^3 8^2 8^1 8^0
		512  64   8   1
		-----------------
		          3   7  = 3*8 + 7*1 = 31
				  6   0  = 6*8 + 0*1 = 48
		*/
		System.out.println(037); // 31
		System.out.println(060); // 48
		
		/*
		HEXADECIMAL
		HEX 0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F
		DEC 0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
		----------------------------------------------------
		
		Tell sequences used, for instance:
		15(dec) = F
		16(dec) = 10
		30(dec) = 1F
		*/
		System.out.println(0x10); // 16
		System.out.println(0x1F); // 31
		System.out.println(0x2F); // 47
	}
}