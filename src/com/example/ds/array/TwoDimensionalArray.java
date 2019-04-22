package com.example.ds.array;

public class TwoDimensionalArray {


    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; a[i] != null && j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        int[][] a = new int[3][5];
        printArray(a);
        int[][] b = new int[3][];
        printArray(b);
        int[][] c = new int[2][];
        c[0] = new int[8];
        c[1] = new int[12];
        printArray(c);
    }

}
