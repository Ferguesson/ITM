package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //Стримы
        strings = new ArrayList<>();
        Scanner sc = new Scanner((System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
        }

        // Поиск максимальной длины строки
        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        // Вывод строк с максимальной длиной
        strings.stream()
                .filter(s -> s.length() == maxLength)
                .forEach(System.out::println);





        /*
        //Классический подход
        // Считывание 5 строк с клавиатуры и добавление их в список

        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            maxLength = Math.max(maxLength, s.length());
            strings.add(s);
        }

        for (String s : strings) {
            if (s.length() == maxLength) {
                System.out.println(s);
            }
        }
        */


    }
}
