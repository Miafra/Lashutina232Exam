package task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите количество чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }


        int[] temp = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                temp[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        int[] uniqueNumbers = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueNumbers[i] = temp[i];
        }

        System.out.println("отсортированные числа:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }
}
