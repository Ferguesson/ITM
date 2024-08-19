package task0410;

/* 
Попадём-не-попадём
Напиши метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100
и сообщить результат на экран в следующем виде: "Число number не содержится в интервале."
или "Число number содержится в интервале.", где number - аргумент метода.

Пример для числа 112:
Число 112 не содержится в интервале.

Пример для числа 60:
Число 60 содержится в интервале.


Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println() или System.out.print().
3. Метод main должен вызывать метод checkInterval.
4. Метод checkInterval должен быть static void.
5. Метод checkInterval должен выводить текст на экран согласно заданию.*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        }
        else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
    }
}