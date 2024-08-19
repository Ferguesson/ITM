package task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Requirements:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat grandFather = new Cat(grandFatherName);
        Cat grandMother = new Cat(grandMotherName);
        Cat father = Cat.withFather(fatherName, grandFather);
        Cat mother = Cat.withMother(motherName, grandMother);
        Cat son = Cat.withParents(sonName, father, mother);
        Cat daughter = Cat.withParents(daughterName, father, mother);



        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(son);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        public Cat(String name) {
            this.name = name;
        }

        private Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        public static Cat withFather(String name, Cat father) {
            return new Cat(name, father, null);
        }

        public static Cat withMother(String name, Cat mother) {
            return new Cat(name, null, mother);
        }

        public static Cat withParents(String name, Cat father, Cat mother) {
            return new Cat(name, father, mother);
        }


        @Override
        public String toString() {
            String motherStr = (mother == null) ? "no mother" : "mother is " + mother.name;
            String fatherStr = (father == null) ? "no father" : "father is " + father.name;
            return String.format("The cat's name is %s, %s, %s.", name, motherStr, fatherStr);
        }
    }
}
