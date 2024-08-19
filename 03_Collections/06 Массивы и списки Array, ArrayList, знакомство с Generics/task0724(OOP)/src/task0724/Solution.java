package task0724;

/* 
Семейная перепись.
Создай класс Human с полями
имя(String),
пол(boolean),
возраст(int),
отец(Human),
мать(Human).

Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<Human>();
        Human sirius = new Human("Sirius", true, 456);
        Human minerva  = new Human("Minerva", false, 254);

        humans.add(sirius);
        humans.add(minerva);
        humans.add(new Human("Albus", true, 1455));
        humans.add(new Human("Voland", true, 78));

        humans.add(new Human("Harry", true, 17, sirius, minerva));
        humans.add(new Human("Hermione", true, 16, sirius, minerva));
        humans.add(new Human("Ron", true, 17, sirius, minerva));
        humans.add(new Human("Jinny", true, 15, sirius, minerva));
        humans.add(new Human("Luna", true, 16, sirius, minerva));

        humans.forEach(System.out::println);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            StringBuilder text = new StringBuilder();
            text.append("Имя: ").append(this.name);
            text.append(", пол: ").append(this.sex ? "мужской" : "женский");
            text.append(", возраст: ").append(this.age);

            if (this.father != null) {
                text.append(", отец: ").append(this.father.name);
            }

            if (this.mother != null) {
                text.append(", мать: ").append(this.mother.name);
            }

            return text.toString();
        }
    }
}