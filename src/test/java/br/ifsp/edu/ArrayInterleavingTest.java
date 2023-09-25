package test.java.br.ifsp.edu;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;

public class ArrayInterleavingTest {
    @Test
    @DisplayName("Should result in an empty array")
    public void ShouldResultEmptyInArrayInterleaving(){
        ArrayInterleaving arrayInterleaving = new ArrayInterleaving();

        int[] a = {};
        int[] b = {};

        int[] expectedResult = {};

        assertArrayEquals(expectedResult, arrayInterleaving.interleave(a, b));
    }
}
