package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList myTracker = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. добавить задачу");
            System.out.println("2. показать задачи");
            System.out.println("3. удалить запись");
            System.out.print("выбор: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("введите задачу: ");
                myTracker.addTask(scanner.nextLine());
            }
            else if (choice.equals("2")) {
                if (myTracker.isEmpty()) {
                    System.out.println("список задач пуст");
                } else {
                    myTracker.printTasks();
                }
            }
            else if (choice.equals("3")) {
                if (myTracker.isEmpty()) {
                    System.out.println("список задач пуст");
                } else {
                    myTracker.printTasks();
                    System.out.print("введите номер задачи для удаления: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    myTracker.removeByNumber(num);
                }
            }
        }
    }
}