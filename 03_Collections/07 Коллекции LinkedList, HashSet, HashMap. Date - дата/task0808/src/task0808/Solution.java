package task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.*/

public class Solution {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Время выполнения для ArrayList: " + duration + " наносекунд");


        startTime = System.nanoTime();

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время выполнения для LinkedList: " + duration + " наносекунд");

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(i);
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.set(i, i);
        }

    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.remove(0);
        }

    }
}
