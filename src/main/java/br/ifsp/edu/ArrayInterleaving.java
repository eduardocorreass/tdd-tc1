package main.java.br.ifsp.edu;

public class ArrayInterleaving {
    public int[] interleave(int[] a, int[] b, int n){

        if (n < 0) {
            throw new IllegalArgumentException("N must be greater or equal to 0");
        }

        int[] interleavedArray = new int[2 * n];
        int j = 0;

        for(int i = 0; i < 2 * n; i += 2){
            interleavedArray[i] = a[j];
            interleavedArray[i + 1] = b[j];

            j++;
        }

        return interleavedArray;
    }
}
