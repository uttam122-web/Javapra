package collectionexampleList;
import java.util.*;

public class EvenNumbersTotal {
    public static void main(String[] args) {
    	
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<=10 ;i++) {
            numbers.add(i);
        }

        int evenTotal1 = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenTotal1 = evenTotal1 + num;
            }
        }

        System.out.println("Total of all even numbers: " + evenTotal1);
    }
}
