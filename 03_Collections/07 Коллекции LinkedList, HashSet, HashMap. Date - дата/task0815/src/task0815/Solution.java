package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> names = new HashMap<>();
        names.put("Smith", "John");
        names.put("Johnson", "Emily");
        names.put("Brown", "Michael");
        names.put("Williams", "John");
        names.put("Jones", "David");
        names.put("Brown", "Maria");
        names.put("Miller", "John");
        names.put("Davis", "Sarah");
        names.put("Martinez", "Robert");
        names.put("Wilson", "Laura");

        return names;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "John"));
        System.out.println(getCountTheSameLastName(map, "Smith"));
    }
}
