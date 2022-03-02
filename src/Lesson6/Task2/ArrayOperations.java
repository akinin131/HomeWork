package Lesson6.Task2;

import java.util.Arrays;

public final class ArrayOperations {
    static void Max(int [] arr){
        System.out.println(Arrays.stream(arr).max());
    }
    static void Min(int [] arr){
        System.out.println(Arrays.stream(arr).min());
    }
    static int indexOf(int [] arr, int a){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return i;
        }
        return -1;}


    public static void sum(int [] arr) {
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        System.out.println(sumArr);
    }
    public static void replace(int[] arr, int oldInt, int newInt) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldInt) {
                arr[i] = newInt;
            }
        }
    }

    }
