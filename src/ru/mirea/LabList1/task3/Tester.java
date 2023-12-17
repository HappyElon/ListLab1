package ru.mirea.LabList1.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        while (true) {
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить элемент");
            System.out.println("3. Удалить элемент");
            System.out.println("4. Вывести список");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить список на пустоту");
            System.out.println("7. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    list = new CircularLinkedList();
                    System.out.println("Пустой список создан.");
                }
                case 2 -> {
                    Node newNode = new Node("", 0);
                    newNode.readAttributes();
                    list.addNode(newNode);
                    System.out.println("Элемент добавлен в список.");
                }
                case 3 -> {
                    System.out.print("Введите имя элемента для удаления: ");
                    String nameToDelete = scanner.next();
                    list.deleteNode(nameToDelete);
                }
                case 4 -> {
                    System.out.println("Элементы списка:");
                    list.displayList();
                }
                case 5 -> list.clearList();
                case 6 -> {
                    if (list.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                }
                case 7 -> {
                    System.out.println("Выход из программы.");
                    System.exit(0);
                }
                default -> System.out.println("Некорректный ввод.");
            }
        }
    }
}

