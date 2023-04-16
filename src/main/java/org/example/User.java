package org.example;

import java.util.Scanner;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String date_of_birthday;
    private String telephone;
    private char gender;

    public User(String surname, String name, String patronymic, String date_of_birthday, String telephone, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date_of_birthday = date_of_birthday;
        this.telephone = telephone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDate_of_birthday() {
        return date_of_birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public char getGender() {
        return gender;
    }

    public String getPatronymic() {
        return patronymic;
    }


}
