//Import only Ramdom class
//import java.util.Random;

//Import all utils package
//Child packages are not imported here
//you can only have one wildcard - not "import java.nio.*.*;"
import java.util.*;

// java.lang is automatically imported
//import java.lang.*;

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random(); // DOES NOT COMPILE
		
		// print a number between 0 and 9
		System.out.println(r.nextInt(10));
	}
}