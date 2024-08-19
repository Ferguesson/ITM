package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа.
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int equality = arr[0];
        int matches = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] == arr[j]) {
                    equality = arr[i];
                    matches++;
                }
            }
        }
        if (matches == 0) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] != equality) {
                System.out.println(i + 1);
            }
        }
    }
}
