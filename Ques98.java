import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques98 {

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) return result;

        // Take the first word as our reference point
        String firstWord = words[0];

        // Iterate through each character of the first word
        for (int i = 0; i < firstWord.length(); i++) {
            String currentChar = String.valueOf(firstWord.charAt(i));
            boolean isCommon = true;

            // Check if this character is present in all other words
            for (int j = 1; j < words.length; j++) {
                if (words[j].contains(currentChar)) {
                    // "Cross out" the FIRST occurrence of the letter to handle duplicates
                    words[j] = words[j].replaceFirst(currentChar, "");
                } else {
                    // If it's missing from even one word, it's not a common character
                    isCommon = false;
                    break;
                }
            }

            // If it survived the loop, it was found in every word
            if (isCommon) {
                result.add(currentChar);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println("Original Words: " + Arrays.toString(words));
        
        List<String> common = commonChars(words);
        System.out.println("Common Characters: " + common);
    }
}