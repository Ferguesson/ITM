package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(file1);
             FileOutputStream fos = new FileOutputStream(file2);
        ) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            for (int i = buffer.length - 1; i >= 0; i--) {
                fos.write(buffer[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
