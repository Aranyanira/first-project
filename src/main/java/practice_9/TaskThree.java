package practice_9;

public class TaskThree implements Runnable {
    private volatile boolean stop = false;
    private int counter = 0;
    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
    //В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

    public void stop(){
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            counter++;
            System.out.println("counter = " + counter + ", thread = " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaskThree taskThree = new TaskThree();
        Thread t1 = new Thread(taskThree);

        t1.start();
        Thread.sleep(2000);
        taskThree.stop();
    }

}
