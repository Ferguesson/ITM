package task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String buffer = list.removeLast();
            list.add(0, buffer);
        }

        list.forEach(System.out::println);
    }
}
