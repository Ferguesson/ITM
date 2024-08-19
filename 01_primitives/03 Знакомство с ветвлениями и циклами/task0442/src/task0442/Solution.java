package task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;

        while (true) {
            int number = Integer.parseInt(br.readLine());
            summ += number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(summ);
    }
}
