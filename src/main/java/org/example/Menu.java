package org.example;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Tree tree;
    private int choice;

    public Tree getTree() {
        return this.tree;
    }

    public int getChoice(){
        return this.choice;
    }
    public void displayMenu(List<Human> people) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("\n ==== Генеалогическое древо ====");
            System.out.println("1. Вывести список людей");
            System.out.println("2. Добавить нового человека");
            System.out.println("3. Добавить 'родителя'");
            System.out.println("4. Вывести генеалогическое дерево");
            System.out.println("5. Выход");

            System.out.print("Введите номер выбранной опции: ");

            int choice = scanner.nextInt();

            this.choice = choice;

            switch (choice) {
                case 1:
                    displayPeople(people);
                    break;
                case 2:
                    people.add(addPerson());
                    break;
                case 3:
                    this.tree = addParent(people);
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }


    private void displayPeople(List<Human> people) {
        int number = 0;
        for (Human person : people) {
            number++;
            System.out.println(number + ". " + person.toString());
        }
    }

    private Human addPerson() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = sc.nextLine();
        System.out.print("Введите дату рождения (ГГГГ - ММ - ДД): ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Введите пол: ");
        String gender = sc.nextLine();

        return new Human(name, dateOfBirth, gender);
    }

    private Tree addParent(List <Human> childList) {

        Human parent = addPerson();
        parent.setChildren(childList);

        return new Tree(parent);

    }

    private void printTree(Tree tree) {

    }


}


