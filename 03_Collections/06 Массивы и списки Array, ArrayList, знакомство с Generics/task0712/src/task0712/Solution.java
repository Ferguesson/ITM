package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Stream
        // Считывание 10 строк с клавиатуры
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        // Поиск самой короткой и самой длинной строки
        String minString = list.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");

        String maxString = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        // Определение, какая из них встретится первой в списке
        list.stream()
                .filter(s -> s.equals(minString) || s.equals(maxString))
                .findFirst()
                .ifPresent(System.out::println);



        //Классика
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < 10; i++) {
//            String buffer = br.readLine();
//            min = Math.min(min, buffer.length());
//            max = Math.max(max, buffer.length());
//            list.add(buffer);
//        }
//
//        for (String s : list) {
//            if (s.length() == min || s.length() == max) {
//                System.out.println(s);
//                break;
//            }
//        }
    }
}
