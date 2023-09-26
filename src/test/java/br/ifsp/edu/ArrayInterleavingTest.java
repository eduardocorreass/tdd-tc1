package test.java.br.ifsp.edu;

import main.java.br.ifsp.edu.ArrayInterleaving;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;

public class ArrayInterleavingTest {
    @Test
    @DisplayName("Should result in an empty array")
    public void ShouldResultEmptyInArrayInterleaving(){
        ArrayInterleaving arrayInterleaving = new ArrayInterleaving();

        int n = 0;
        int[] a = {};
        int[] b = {};

        int[] expectedResult = {};

        assertArrayEquals(expectedResult, arrayInterleaving.interleave(a, b, n));
    }

    @Test
    @DisplayName("Should result in [A, B] array if N is equal to one")
    public void ShouldResultInABArrayIfNIsEqualToOne(){
        ArrayInterleaving arrayInterleaving = new ArrayInterleaving();

        int n = 1;
        int[] a = {3};
        int[] b = {5};

        int[] expectedResult = {3, 5};

        assertArrayEquals(expectedResult, arrayInterleaving.interleave(a, b, n));
    }

    @Test
    @DisplayName("Should result in an interleaved array")
    public void ShouldResultInAnInterleavedArray(){
        ArrayInterleaving arrayInterleaving = new ArrayInterleaving();

        int n = 4;
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};

        int[] expectedResult = {1,2,3,4,5,6,7,8};

        assertArrayEquals(expectedResult, arrayInterleaving.interleave(a, b, n));
    }
}
