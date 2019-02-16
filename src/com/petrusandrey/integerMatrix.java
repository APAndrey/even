package com.petrusandrey;

public class integerMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0}, {0, 0, 1}, {1, 0, 1}};

        System.out.println("Before");
        print(arr);
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = reverse(arr[i][j]);
            }
        }
        System.out.println("After");
        print(arr);
    }
    public static int reverse(int x) {
        return (x == 1 ? 0 : 1);
    }
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
