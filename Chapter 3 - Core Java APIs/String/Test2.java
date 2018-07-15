import java.util.stream.*;

public class Test2{
	public static void main(String... args){
		java.util.List<String> names = java.util.Arrays.asList("Alex", "Yuri");
		
		//names.stream().forEach(System.out::println);
		java.util.List<String> names2 = names.parallelStream()
		.filter(el -> el.startsWith("A"))
		.map(String::toUpperCase)
		//.forEach(el -> System.out.println(el))
		.collect(Collectors.toList());
		
		for(String n: names2){
			System.out.println(n);
		}
		
		Stream.
	}
}