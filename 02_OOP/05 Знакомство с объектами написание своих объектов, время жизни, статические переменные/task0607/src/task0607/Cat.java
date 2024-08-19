package task0607;

/* 
Классовый счетчик
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.


Requirements:
1. Добавь в класс Cat конструктор.
2. Конструктор должен быть public.
3. Добавь в класс Cat поле catCount.
4. Поле catCount должно быть типа int.
5. Поле catCount должно быть статическим.
6. Конструктор класса должен на 1 увеличивать значение переменной catCount.*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {
        new Cat();
        new Cat();
        new Cat();

        System.out.println(Cat.catCount);
    }
}
