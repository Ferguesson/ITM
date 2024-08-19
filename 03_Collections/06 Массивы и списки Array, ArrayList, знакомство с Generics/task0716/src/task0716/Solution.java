package task0716;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("поза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        return strings.stream()
                .flatMap(s -> {
                    boolean containsR = s.contains("р");
                    boolean containsL = s.contains("л");

                    if (containsR && !containsL) {
                        // Удалить слова, содержащие "р", но не содержащие "л"
                        return Stream.empty();
                    } else if (containsL && !containsR) {
                        // Удваиваем слова, содержащие "л", но не содержащие "р"
                        return Stream.of(s, s);
                    } else {
                        // Оставить слово без изменений
                        return Stream.of(s);
                    }
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}