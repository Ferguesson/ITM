package task0316;

/* 
Экранирование символов
Вывести на экран следующий текст - две строки:
It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Больше про экранирование символов и Escape-последовательности в Java читай в статье.


Requirements:
1. Программа должна выводить текст.
2. Должно быть выведено две строки.
3. Текст первый строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
4. Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
