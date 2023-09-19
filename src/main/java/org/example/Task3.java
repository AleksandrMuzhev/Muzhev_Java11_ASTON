package org.example;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 9, 12};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
