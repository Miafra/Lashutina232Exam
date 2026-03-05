
import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 23; i++) {
            int value = random.nextInt(201) - 100;
            numbers.add(value);
        }
        System.out.println(numbers);

        boolean negative = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                negative = true;
                break;
            }
        }

        if (negative) {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                if (numbers.get(i) < 0) {
                    numbers.remove(i);
                }
            }
        } else {
            if (numbers.size() >= 10) {
                numbers.remove(9);
            } else {
                System.out.println("меньше 10 элементов");
            }
        }

        System.out.println(numbers);
    }
}