package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        int lineLength = 0;

        for (String s : list) {
            if (s.length() < lineLength) {
                System.out.println(s);
                break;
            }
            lineLength = Math.max(lineLength, s.length());
        }

        //Streams
//        // Проверка упорядоченности по возрастанию длины строки
//        OptionalInt firstOutOfOrderIndex = IntStream.range(1, list.size())
//                .filter(i -> list.get(i).length() < list.get(i - 1).length())
//                .findFirst();
//
//        // Вывод индекса первого элемента, нарушающего упорядоченность
//        firstOutOfOrderIndex.ifPresent(System.out::println);
    }
}

