package task0940;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Трай с ресурсами
 * Для примера и упрощения, вам уже даны 2 класса имплементирующие интерфейс AutoCloseable
 * Любой класс, который имплементит данный интерфейс или интерфейс Closeable, является ресурсом.
 * Так же ресурсами в JAVA являются практически всё IO/NIO и классы требующие закрытия (напр. при работе с БД)
 *
 * Задача:
 * 1. Используя конструкцию "Трай с ресурсами", ОДНОВРЕМЕННО вызвать оба этих класса и посмотреть на то, каким образом
 * ресурсы будут сначала открыты, отработаны, а затем закрыты.
 * 2. Заменить вывод сообщений в консоль, на логирование уровня INFO
 */
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (AutoCloseableResourcesFirst first = new AutoCloseableResourcesFirst();
        AutoCloseableResourcesSecond second = new AutoCloseableResourcesSecond()) {
            first.doSomething();
            second.doSomething();
        }
        catch (Exception e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }

    }
}

class AutoCloseableResourcesFirst implements AutoCloseable {
    private static final Logger LOGGER = Logger.getLogger(AutoCloseableResourcesFirst.class.getName());

    public AutoCloseableResourcesFirst() {
        LOGGER.info("Вызов конструктора -> AutoCloseableResources_First");
    }

    public void doSomething() {
        LOGGER.info("Какой то метод -> AutoCloseableResources_First");
    }

    @Override
    public void close() throws Exception {
        LOGGER.info("ЗАКРЫВАЕМ ресурс -> AutoCloseableResources_First");
    }
}


class AutoCloseableResourcesSecond implements AutoCloseable {
    private static final Logger LOGGER = Logger.getLogger(AutoCloseableResourcesSecond.class.getName());

    public AutoCloseableResourcesSecond() {
        LOGGER.info("Вызов конструктора -> AutoCloseableResources_Second");
    }

    public void doSomething() {
        LOGGER.info("Какой то метод -> AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        LOGGER.info("ЗАКРЫВАЕМ ресурс -> AutoCloseableResources_Second");
    }
}