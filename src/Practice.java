import java.util.ArrayList;
import java.util.HashSet;

public class Practice {

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

// ArrayList
    public static String longestWord(ArrayList<String> words, char letter) {
        String longest = "";

        for (String word : words) {
            if (word.charAt(0) == letter) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        return longest;
    }

// HashSet
public static int countWords(HashSet<String> words, int n, int m) {
        int count = 0;

        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }

        return count;
    }

}



