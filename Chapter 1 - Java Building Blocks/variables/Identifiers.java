public class Identifiers{
	/**
	* There are only three rules to remember for legal identifiers:
	* 1 - The name must begin with a letter or the symbol $ or _.
	* 2 - Subsequent characters may also be numbers.
	* 3 - You cannot use the same name as a Java reserved word.
	*/
	
	/**
	* RESERVED WORDS
	* abstract	assert 		boolean 	break 			byte
	* case 		catch 		char 		class 			const*
	* continue 	default 	do 			double 			else
	* enum 		extends 	false 		final 			finally
	* float 	for 		goto* 		if 				implements
	* import 	instanceof 	int 		interface 		long
	* native 	new 		null 		package 		private
	* protected public 		return 		short 			static
	* strictfp 	super 		switch 		synchronized 	this
	* throw 	throws 		transient 	true 			try
	* void 		volatile 	while
	*/
	
	//Legal
	String okidentifier;
	String $OK2Identifier;
	String _alsoOK1d3ntifi3r;
	String __SStillOkbutKnotsonice$;
	String Public;
	String _9;
	
	//Not Legal
	//String 3DPointClass; // identifiers cannot begin with a number
	//String hollywood@vine; // @ is not a letter, digit, $ or _
	//String *$coffee; // * is not a letter, digit, $ or _
	//String public; // public is a reserved word
	
	public static void main(String[] args){
		
		new Identifiers();
		
	}
}