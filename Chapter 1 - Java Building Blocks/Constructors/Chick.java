public class Chick {
	//DOES NOT COMPILE
	//You can’t refer to a variable before it has been initialized
	//{ System.out.println(name); }
	
	// initialize on line
	int numEggs = 1;
	String name;
	
	{
		numEggs = 2;
		System.out.println(numEggs);
	}
	
	//public void Chick() { //NOT A CONSTRUCTOR, IT IS A COMMON METHOD
	public Chick() {
		// initialize in constructor
		name = "Duke";
		System.out.println("in constructor: " + numEggs);
	}
	
	public static void main(String[] args){
		Chick chick = new Chick();
	}
	
	{
		numEggs = 3;
		System.out.println(numEggs);
	}
}