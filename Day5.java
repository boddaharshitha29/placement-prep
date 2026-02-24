import java.util.Arrays;
import java.util.Scanner;

public class Day5 {

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] marks = {72, 85, 90, 60, 78, 95, 55};

        System.out.println("Array: " + Arrays.toString(marks));
        System.out.println("Max: " + findMax(marks));
        System.out.println("Search 90: index " + linearSearch(marks, 90));
        System.out.println("Search 99: index " + linearSearch(marks, 99));

        reverseArray(marks);
        System.out.println("Reversed: " + Arrays.toString(marks));
    }
}