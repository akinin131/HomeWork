package Lesson6.Task2;
public final class ArrayOperations {
    static void Max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println(max);
    }
    static void Min(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.println(min);
    }

    static int indexOf(int[] arr, int a) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return i;
        }
        return -1;
    }

    public static void sum(int[] arr) {
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
