import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceTestHappyPath(){

        //1A
        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //1A
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        //3A
        Assert.assertArrayEquals(expectedResult, actualResult);

    }
    @Test

    public void testAscendingSequenceZeroCase(){

        int startNumber = 0;
        int endNumber = 10;
        int[] expectedResult = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

     @Test

    public void testAscendingSequenceNegativeNumbersCase(){

        int startNumber = -8;
        int endNumber = -4;
        int[] expectedResult = {-8, -7, -6, -5, -4};

   //     buildAscendingArray();
        AscendingSequence ascendingSequence = new AscendingSequence();
         int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

             Assert.assertArrayEquals(expectedResult, actualResult);

     }
    @Test

    public void testAscendingSequenceNegativePositiveCase() {

        int startNumber = -2;
        int endNumber = 3;
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();

        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
