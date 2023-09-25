package main.java.br.ifsp.edu;

public class ArrayInterleaving {
    public int[] interleave(int[] a, int[] b){

        if(a.length == 0 && b.length == 0) return new int[]{};

        return new int[]{a[0], b[0]};
    }
}
