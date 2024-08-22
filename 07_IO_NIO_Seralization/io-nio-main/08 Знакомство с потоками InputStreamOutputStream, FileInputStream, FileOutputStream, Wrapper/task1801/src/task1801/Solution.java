package task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт.
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        FileInputStream fis = new FileInputStream(fileName);

        int maxByte = 0;
        while (fis.available() > 0) {
            int current = fis.read();
            if (current > maxByte) {
                maxByte = current;
            }
        }
        fis.close();

        System.out.println(maxByte);
    }
}
