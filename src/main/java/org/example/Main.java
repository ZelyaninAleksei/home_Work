package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human ivan = new Human("Иванов Иван Иванович", "1990-2-22","male");
        Human olga = new Human("Ольга Ивановна Иванова", "2010-5-9", "female");
        Human fedr = new Human("Иванов Фёдр Иванович", "2019-9-1","male");
        Human svetlana = new Human("Оксана Ивановна Иванова", "1989-6-9", "female");

        List<Human> people = new ArrayList<>();
        people.add(ivan);
        people.add(olga);
        people.add(fedr);
        people.add(svetlana);


        Menu menu = new Menu();
        menu.displayMenu(people);
        int choice = menu.getChoice();

        if (choice == 4) {

            System.out.println("Родитель: \n" + menu.getTree().getRoot());
            System.out.println(" \n Дети:");
            List<Human> lst = menu.getTree().getRoot().getChildren();
            for (Human child: lst)
            {
                System.out.println(child);
            }
        }



    }

}

