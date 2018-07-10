package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        System.out.println("Enter list: ");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        bubbleSort(list);
        System.out.println("Bubble Sort: ");
        for (int aList : list) {
            System.out.print(aList + " ");
        }
    }

    private static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] < list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}

