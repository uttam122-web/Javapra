package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		Stream <Integer> m = Stream.of(12,678,90,24,435);
		m.forEach(System.out::println);
		
		Integer [] arr1 = {5,6,89,0,12};
		Stream sarr =Arrays.stream(arr1);
	    System.out.println(  sarr.count());
		
		Arrays.stream(arr1).forEach(System.out::println);


	}

}
