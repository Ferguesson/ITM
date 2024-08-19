package task0930;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Логирование состояний и ошибок в работе программы.
 * Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main.
 * Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно.
 */

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Starting the application");

        try {
            // Вызов метода, который выбрасывает проверяемое исключение
            throw new IOException();
        } catch (IOException e) {
            // Логирование исключения на уровне WARNING
            LOGGER.log(Level.WARNING, "An exception occurred: ", e);
        }
    }
}