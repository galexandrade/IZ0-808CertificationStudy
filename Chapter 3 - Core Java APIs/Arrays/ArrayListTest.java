import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays

/**
* ArrayList implements an interface called List
* Include everithing, except primitives
*/
public class ArrayListTest{
	public static void main(String... args){
		System.out.println("AKISIISIS");
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2); //Copy of annother ArrayList
		
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		
		//You can store an ArrayList in a List reference variable but not vice versa
		List<String> list6 = new ArrayList<>();
		//ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
		
		/**
		* add()
		* boolean add(E element)
		* void add(int index, E element)
		*/
		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]
		
		System.out.println("############################");
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		
		/**
		* It removes the fist element found
		* remove()
		* boolean remove(Object object)
		* E remove(int index)
		*/
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		birds2.add("hawk"); // [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // prints false
		System.out.println(birds2.remove("hawk")); // prints true
		System.out.println(birds2);
		System.out.println(birds2.remove(0)); // prints hawk
		System.out.println(birds2); // []
		
		/**
		* It changes one of the elements of the ArrayList without changing the size
		* set()
		* E set(int index, E newElement)
		
		* The E return type is the element that got replaced
		*/
		List<String> birds4 = new ArrayList<>();
		birds4.add("hawk"); // [hawk]
		System.out.println(birds4.size()); // 1
		birds4.set(0, "robin"); // [robin]
		System.out.println(birds4.size()); // 1
		//birds4.set(1, "robin"); // IndexOutOfBoundsException
		
		/**
		* isEmpty() and size()
		* boolean isEmpty()
		* int size()
		*/
		List<String> birds5 = new ArrayList<>();
		System.out.println(birds5.isEmpty()); // true
		System.out.println(birds5.size()); // 0
		birds5.add("hawk"); // [hawk]
		birds5.add("hawk"); // [hawk, hawk]
		System.out.println(birds5.isEmpty()); // false
		System.out.println(birds5.size()); // 2
		
		/**
		* clear()
		* void clear()
		*/
		List<String> birds6 = new ArrayList<>();
		birds6.add("hawk"); // [hawk]
		birds6.add("hawk"); // [hawk, hawk]
		System.out.println(birds6.isEmpty()); // false
		System.out.println(birds6.size()); // 2
		birds6.clear(); // []
		System.out.println(birds6.isEmpty()); // true
		System.out.println(birds6.size()); // 0
		
		/**
		* contains()
		* boolean contains(Object object)
		*/
		List<String> birds7 = new ArrayList<>();
		birds7.add("hawk"); // [hawk]
		System.out.println(birds7.contains("hawk")); // true
		System.out.println(birds7.contains("robin")); // false
		
		/**
		* You can compare two lists to see if they contain the same elements in the same order.
		* equals()
		* boolean contains(Object object)
		*/
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true
		one.add("b"); // [a,b]
		two.add(0, "b"); // [b,a]
		System.out.println(one.equals(two)); // false
		
		/**
		* Sorting
		* void Collections.sort(List);
		*/
		List<Integer> numbers11 = new ArrayList<>();
		numbers11.add(99);
		numbers11.add(5);
		numbers11.add(81);
		Collections.sort(numbers11);
		System.out.println(numbers11); //[5, 81, 99]
				
		/**
		* CONVERTING FROM ArrayList TO Array
		*/
		System.out.println("Converting");
		List<String> list10 = new ArrayList<>();
		list10.add("hawk");
		list10.add("robin");
		//Default is Object
		Object[] objectArray = list10.toArray();
		System.out.println(objectArray.length); // 2
		//Specif a String type for the array
		String[] stringArray = list10.toArray(new String[0]);
		System.out.println(stringArray.length); // 2
		
		/**
		* CONVERTING FROM Array TO ArrayList
		*/
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list11 = Arrays.asList(array); // returns fixed size list
		System.out.println(list11.size()); // 2
		list11.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) 
			System.out.print(b + " "); // new test
		
		//Not allowed to change the size of the list
		//list11.add("Alex"); // throws UnsupportedOperation Exception
		//list11.remove(1); // throws UnsupportedOperation Exception
		
	}
}