package task4;

public class TaskList {
    private Task start = null;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (start == null) {
            start = newTask;
        } else {
            Task current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void printTasks() {
        Task current = start;
        int count = 1;
        while (current != null) {
            System.out.println(count + " " + current.description);
            current = current.next;
            count++;
        }
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void removeByNumber(int number) {
        if (number == 1) {
            start = start.next;
            return;
        }
        Task prev = start;
        for (int i = 1; i < number - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }
    }
}