package practice_9;

public class TaskOne implements Runnable {
    //1. Задача: создание одного потока
    //Условие задачи: Напишите программу, в которой создается отдельный поток,
    // выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        Thread t1 = new Thread(taskOne);
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
