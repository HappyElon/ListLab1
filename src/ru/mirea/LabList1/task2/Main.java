package ru.mirea.LabList1.task2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardList cardList = new CardList();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Вывести элемент");
            System.out.println("4. Очистить картотеку");
            System.out.println("5. Проверить на пустоту");
            System.out.println("6. Записать в файл");
            System.out.println("7. Прочитать из файла");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> cardList.addNode();
                case 2 -> cardList.removeNode();
                case 3 -> cardList.displayNode();
                case 4 -> cardList.clearList();
                case 5 -> System.out.println("Картотека " + (cardList.isEmpty() ? "пуста" : "не пуста"));
                case 6 -> {
                    try {
                        System.out.print("Введите имя файла: ");
                        String fileName = scanner.next();
                        cardList.writeToFile(fileName);
                    } catch (IOException e) {
                        System.out.println("Ошибка при записи в файл.");
                    }
                }
                case 7 -> {
                    try {
                        System.out.print("Введите имя файла: ");
                        String fileName = scanner.next();
                        cardList.readFromFile(fileName);
                    } catch (IOException e) {
                        System.out.println("Ошибка при чтении из файла.");
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Неверный выбор. Повторите ввод.");
            }
        }
    }
}
