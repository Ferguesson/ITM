package task0127;

/* 
Число в квадрате
Напиши программу, которая выводит на экран квадрат числа 5 с помощью метода sqr.

Подсказка:
В class Solution уже есть метод sqr, который считает квадрат числа.

Requirements:
1. Программа должна выводить число.
2. Метод main должен вызывать метод sqr с параметром 5.
3. Метод main должен выводить результат метода sqr.
4. Метод sqr изменять нельзя.
5. Выводимое число должно соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(sqr(5));
    }

    public static int sqr(int a) {
        return a * a;
    }
}
