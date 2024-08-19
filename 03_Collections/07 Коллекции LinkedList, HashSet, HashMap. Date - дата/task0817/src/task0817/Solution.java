package task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> names = new HashMap<>();
        names.put("Smith", "John");
        names.put("Johnson", "Emily");
        names.put("Brown", "Michael");
        names.put("Williams", "John");
        names.put("Jones", "David");
        names.put("Miles", "Maria");
        names.put("Miller", "John");
        names.put("Davis", "Sarah");
        names.put("Martinez", "Robert");
        names.put("Wilson", "Laura");

        return names;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> uniqueValues = map.values().stream()
                .filter(value -> map.values().stream()
                        .filter(v -> v.equals(value)).count() > 1)
                .collect(Collectors.toSet());

        String firstDuplicate = uniqueValues.stream().findFirst().get();
        removeItemFromMapByValue(map, firstDuplicate);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        map.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println();

        removeTheFirstNameDuplicates(map);
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
