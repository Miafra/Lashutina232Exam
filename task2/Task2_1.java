package task2;

import java.util.Scanner;

public class Task2_1 {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);

            System.out.print("введите количество чисел: ");
            n = scanner.nextInt();

            int[] numbers = new int[n];

            System.out.println("введите " + n + " чисел");
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

            System.out.println("отсортированные числа:");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

