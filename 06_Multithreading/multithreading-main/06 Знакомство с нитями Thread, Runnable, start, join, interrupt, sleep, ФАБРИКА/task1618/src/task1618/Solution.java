package task1618;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().


Requirements:
1. Класс TestThread должен быть унаследован от Thread.
2. Класс TestThread должен иметь public void метод run.
3. Метод main должен создавать объект типа TestThread.
4. Метод main должен вызывать метод start у объекта типа TestThread.
5. Метод main должен вызывать метод interrupt у объекта типа TestThread.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread t = new TestThread();
        t.start();
        System.out.println("Thread started");
        Thread.sleep(1000);
        t.interrupt();
        System.out.println("Thread interrupted");
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (isInterrupted()) {
                    System.out.println("I was interrupted");
                    break;
                }
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    interrupt();
                    System.out.println("I was interrupted during sleep");
                    break;
                }
            }
        }
    }
}