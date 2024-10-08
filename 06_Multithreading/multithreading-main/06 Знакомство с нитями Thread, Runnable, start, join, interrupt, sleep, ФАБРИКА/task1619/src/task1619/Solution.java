package task1619;

/* 
А без interrupt слабо?
Разберись, как работает программа.
Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread. Исправь остальной код программы, если это необходимо. Нельзя использовать метод interrupt.


Requirements:
1. В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
2. Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
3. Необходимо изменить условие цикла while в методе run.
4. Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
5. Метод main должен вызывать метод start у объекта типа Thread.
6. Метод main должен вызывать метод ourInterruptMethod.*/

public class Solution {
    public static boolean isRunning = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        System.out.println("new thread started");
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isRunning = false;
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            while (isRunning) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread is interrupted");
                }
            }
        }
    }
}
