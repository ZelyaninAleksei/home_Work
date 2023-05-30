package org.example;

import java.util.*;

public class Human {
   private String name;
    private String dateOfBirth;
    private String gender;

    private List<Human> children;

    Human(String name, String dateOfBirth, String gender)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
    public List<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return   "Имя: " + name + ";" +
                " Дата рождения: " + dateOfBirth +
                " Пол : " + gender;
    }
}
