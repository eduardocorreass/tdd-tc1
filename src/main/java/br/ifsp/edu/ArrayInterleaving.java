package main.java.br.ifsp.edu;

public class ArrayInterleaving {
    public int[] interleave(int[] a, int[] b, int n){

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
