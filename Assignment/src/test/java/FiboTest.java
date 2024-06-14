/*
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboTest {

    Fibo fibo = new Fibo();

    @Test
    void fibonacci_numbers_below_10_should_be_0_1_1_2_3_5_8_13_21(){


    }

}*/
import org.junit.Assert;
import org.junit.Test; 
import java.io.ByteArrayOutputStream; 
import java.io.PrintStream; 
import static org.junit.Assert.assertEquals; 

public class FiboTest {
    @Test public void testFibonacciSeries() { 
        // Arrange 
        
        int[] expectedSeries = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        // Act 
        Fibo.main(new String[]{});
        System.setOut(originalOut);
        // Reset System.out //
        String[] outputNumbers = outputStream.toString().trim().split("\\s+");
        assertEquals(expectedSeries.length, outputNumbers.length); 
        for (int i = 0; i < expectedSeries.length; i++) { 
            int expectedNumber = expectedSeries[i]; 
            int actualNumber = Integer.parseInt(outputNumbers[i]); 
            assertEquals(expectedNumber, actualNumber); 
        }
    }
}