package Lesson7.Task2;

public class BinarySearch {
    public static void main(String[] args) {
        String[] languagesList = new String []{"ADA", "ALGOL", "B2", "BASIC", "C", "C++"};
        System.out.println(binarySearch(languagesList,"B2"));
    }
    public static int binarySearch(String[] arr, String search) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle].charAt(0) < search.charAt(0)) {
                if(!arr[middle].equals(search))
                left = middle + 1;
            } else if (arr[middle].charAt(0) > search.charAt(0)) {
                if(!arr[middle].equals(search))
                right = middle - 1;
            } else
                return middle;
        }
        return -1;
    }
}

