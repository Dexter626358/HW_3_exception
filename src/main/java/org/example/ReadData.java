package org.example;

import java.util.Scanner;

public class ReadData {
    /**
     * Метод считывания данных, которые вводит пользовател
     * @return строка данных
     */
    public String readUserData(){
        Scanner scan = new Scanner(System.in);
        String userData = scan.nextLine();
        return userData;
    }


}
