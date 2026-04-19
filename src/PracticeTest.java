import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    
        @Test
        void testMaxDiffAllPositive() {
            // Arrange 
            int [] numbers = {3, 7, 1, 9, 4};

            // Act
            int actual = Practice.maxDiff(numbers);

            // Assert
            assertEquals(8, actual);

        }

        @Test
        void testMaxDiffAllNegative() {
            // Arrange 
            int [] numbers = {-5, -3, -7};

            // Act
            int actual = Practice.maxDiff(numbers);


            // Assert
            assertEquals(4, actual);

        }

    @Test
    void testLongestWordBasic() {
        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("blueberry");
        words.add("bat");
        String actual = Practice.longestWord(words, 'b');
        assertEquals("blueberry", actual);
    }


    @Test
    void testCountWords() {
        // Arrange
    HashSet<String> words = new HashSet<>();
    words.add("hi");        
    words.add("hey");      
    words.add("hello");     
    words.add("helicopter");  

        // Act
        int actual = Practice.countWords(words, 2, 6);

        
        // Assert
        assertEquals(2, actual);
    }



}


