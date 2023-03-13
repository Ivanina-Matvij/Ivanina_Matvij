package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Створюємо колекцію з випадковими числами
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            numbers.add(random.nextInt(10000));
        }

        // Створюємо чергу команд
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        
        // Додаємо команди в чергу
        queue.put(() -> System.out.println("Min: " + Collections.min(numbers)));
        queue.put(() -> System.out.println("Max: " + Collections.max(numbers)));
        queue.put(() -> System.out.println("Avg: " + numbers.stream().mapToInt(Integer::intValue).average().getAsDouble()));
        queue.put(() -> {
            List<Integer> filtered = new ArrayList<>();
            for (int num : numbers) {
                if (num % 2 == 0) {
                    filtered.add(num);
                }
            }
            System.out.println("Filtered: " + filtered);
        });

        // Створюємо п'ять робочих потоків
        for (int i = 0; i < 5; i++) {
            new WorkerThread(queue).start();
        }
    }
}