package InsertionSort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " +list.length +" value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("List: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        insertionSort(list);
        System.out.println("\nInsertion Sort: ");
        for (int aList : list) {
            System.out.print(aList + " ");
        }
    }

    private static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}
