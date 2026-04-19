import static org.junit.Assert.*;

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








}


