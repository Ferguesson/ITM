package task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isReader);
        String fileName = reader.readLine();

        Set<Integer> byteSet = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteSet.add(fileInputStream.read());
            }
        }

        for (Integer currentByte : byteSet) {
            System.out.print(currentByte + " ");
        }
    }
}
