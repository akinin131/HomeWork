package Lesson6.Task2;

public class Test {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        int arr[] = {2, 4, 6, 7, 9, 4,};

        arrayOperations.Max(arr);
        arrayOperations.Min(arr);
        arrayOperations.sum(arr);
        arrayOperations.replace(arr,4,7);
        System.out.println(arrayOperations.indexOf(arr,2));
    }
}
