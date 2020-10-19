package com.artyomgeta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long value = new Scanner(System.in).nextLong();
        String string = String.valueOf(value);
        int[] array = new int[string.length()];
        int[] returnableMAX = new int[array.length];
        int[] returnableMIN = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            returnableMAX[i] = Integer.parseInt(string.charAt(i) + "");
            returnableMIN[i] = returnableMAX[i];
        }

        int times;
        do {
            times = 0;
            for (int i = 0; i < returnableMAX.length - 1; i++) {
                if (returnableMAX[i + 1] > returnableMAX[i]) {
                    int x = returnableMAX[i];
                    returnableMAX[i] = returnableMAX[i + 1];
                    returnableMAX[i + 1] = x;
                    times++;
                }
            }
        } while (times != 0);

        do {
            times = 0;
            for (int i = 0; i < returnableMIN.length - 1; i++) {
                if (returnableMIN[i + 1] < returnableMIN[i]) {
                    int x = returnableMIN[i];
                    returnableMIN[i] = returnableMIN[i + 1];
                    returnableMIN[i + 1] = x;
                    times++;
                }
            }
        } while (times != 0);

        System.out.println("MIN: " + Arrays.toString(returnableMIN));
        System.out.println("MAX: " + Arrays.toString(returnableMAX));

    }
}
