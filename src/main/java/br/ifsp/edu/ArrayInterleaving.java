package main.java.br.ifsp.edu;

public class ArrayInterleaving {
    public int[] interleave(int[] a, int[] b){

        int[] interleavedArray = new int[a.length + b.length];
        int j = 0;

        for(int i = 0; i < 2 * a.length; i += 2){
            interleavedArray[i] = a[j];
            interleavedArray[i + 1] = b[j];

            j++;
        }

        return interleavedArray;
    }
}
