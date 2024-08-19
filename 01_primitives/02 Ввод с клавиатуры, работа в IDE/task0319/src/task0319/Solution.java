package task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.


Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный текст должен полностью соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int number = Integer.parseInt(br.readLine());
        int period = Integer.parseInt(br.readLine());
        System.out.println(name + " получает " + number + " через " + period + " лет." );
    }
}
