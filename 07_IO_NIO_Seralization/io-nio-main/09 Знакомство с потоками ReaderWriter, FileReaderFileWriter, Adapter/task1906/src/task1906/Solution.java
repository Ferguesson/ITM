package task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader BFreader = new BufferedReader(new InputStreamReader(System.in));

        String fileFrom = "";
        String fileTo = "";
        try {
            fileFrom = BFreader.readLine();
            fileTo = BFreader.readLine();
            BFreader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader fileReader = new FileReader(fileFrom);
             FileWriter fileWriter = new FileWriter(fileTo)) {
            ArrayList<Integer> characters = new ArrayList<>();

            while (fileReader.ready()) {
                characters.add(fileReader.read());
            }

            for (int i = 1; i < characters.size(); i+=2) {
                fileWriter.write(characters.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
