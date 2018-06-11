/**
* System.gc() is not guaranteed to run (only a suggerstion)
* Elegible to garbage collection:
* 1 - The object no longer has any references pointing to it.
* 2 - All references to the object have gone out of scope.
*
* Finalizer() *** Runs 0 or 1 time
* 1 - It might not get called
* 2 - It definitely won’t be called twice
* 3 - Is only run when the object is eligible for garbage collection.
*/

public class Garbage{
	/*Produces no output because program ends before*/
	protected void finalize() {
		System.out.println("Calling finalize");
	}
	public static void main(String[] args){
		Garbage g = new Garbage();
	}
}