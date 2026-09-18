package practice_9;

public class TaskTwo implements Runnable {
    public char letter;
    TaskTwo(char letter) {
        this.letter = letter;
    }
//2. Задача: создание двух потоков
    //Условие задачи: Создайте два потока.
    // Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + letter);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaskTwo taskTwoA = new TaskTwo('A');
        TaskTwo taskTwoB = new TaskTwo('B');

        Thread t1 = new Thread(taskTwoA);
        Thread t2 = new Thread(taskTwoB);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
