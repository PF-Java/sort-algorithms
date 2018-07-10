package SelectionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        System.out.println("Enter list: ");
        double[] list = new double[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextDouble();
        }

        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
