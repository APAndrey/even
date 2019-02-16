package com.petrusandrey;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 25);

        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even numbers = " + a[i] + ";");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("odd numbers = " + a[i] + ";");

            }
        }
    }
}
