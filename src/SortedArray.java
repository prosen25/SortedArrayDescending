import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int length) {

        int[] unsortedArray = new int[length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + length + " integer values:\r");

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = scanner.nextInt();
        }

        return unsortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {

        int[] sortedArray = new int[unsortedArray.length];
        Arrays.sort(unsortedArray);
        int j = unsortedArray.length - 1;
        for (int item : unsortedArray) {
            sortedArray[j] = item;
            j--;
        }

        return sortedArray;
    }
}
