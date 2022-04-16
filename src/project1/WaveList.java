package project1;

import java.util.Arrays;

public class WaveList {
    public static void main(String[] args) {
        int[] vasya = new int[]{1, 2, 34, 4, 5, 5, 5, 65, 6, 65, 5454, 4};
        waveSort(vasya);
    }

    public static void waveSort(int[] array) {
        int temp;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                }
//            }
//        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i = i + 2) {
            temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;


        }
        System.out.println(Arrays.toString(array));
    }
}

