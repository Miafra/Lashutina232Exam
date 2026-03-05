package task4;

public class Task {
        public String description;
        public Task next;

        public Task(String description) {
            this.description = description;
            this.next = null;
        }
    }
