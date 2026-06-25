import java.util.Arrays;
import java.util.Comparator;

public class Ques100 {

    public static void main(String[] args) {
        String[] words = {"strawberry", "pie", "apple", "banana", "kiwi"};
        
        System.out.println("Original: " + Arrays.toString(words));

        // Sort ascending by length using a Comparator
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println("Sorted (Short to Long): " + Arrays.toString(words));

        // Sort descending by length (Longest to Shortest)
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Sorted (Long to Short): " + Arrays.toString(words));
    }
}