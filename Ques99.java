import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ques99{
    public static void main(String[] args) {
        // --- Sorting a standard Array ---
        String[] namesArray = {"Charlie", "Alice", "Eve", "Bob", "Dave"};
        
        // Arrays.sort modifies the original array in place
        Arrays.sort(namesArray);
        
        System.out.println("Sorted Array: " + Arrays.toString(namesArray));


        // --- Sorting a List (ArrayList) ---
        List<String> namesList = new ArrayList<>(Arrays.asList("Zack", "Yara", "Xander", "Willow"));
        
        // Collections.sort modifies the original list in place
        Collections.sort(namesList);
        
        System.out.println("Sorted List: " + namesList);
    }
}