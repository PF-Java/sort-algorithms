package InsertionSort;

import java.util.Scanner;

public class InsertionSortByStep {
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
        System.out.println("\nBegin sort processing...");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    private static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println("Move " +list[k] + " at index " + k + " to index " + (k + 1));
            }

            System.out.println("Insert " + currentElement + " in index " + (k + 1));
            list[k + 1] = currentElement;
            System.out.println("List after insert " + (i+1) + " element");
            for (int j = 0; j <= i; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
