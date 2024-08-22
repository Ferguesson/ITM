package task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) {
        final String WORLD = "world";
        int worldWordCount = 0;

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String fileFrom = "";
        try {
            fileFrom = console.readLine();
            console.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader fileReader = new FileReader(fileFrom);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String read = "";
            while ((read = bufferedReader.readLine()) != null) {
                String[] words = read.split("\\p{P}");
                for (String word : words) {
                    if (word.equalsIgnoreCase(WORLD)) {
                        worldWordCount++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(worldWordCount);
    }
}
