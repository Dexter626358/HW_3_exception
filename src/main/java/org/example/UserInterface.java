package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public void menu() {
        String inputUserData = "1. Ввести данные пользователя.";
        String exit = "2. Сохранение данных и выход из программы.";
        String pattern = "Введите через пробел следующие данные:\nфамилия\nимя\nотчество\nдата рождения(формат: XX.XX.XXXX)" +
                "\nномер телефона(формат: 8XXXXXXXXXX)\nпол(формат: m - мужской, f - женский)\n";
        String incorrectInput = "Некорректный ввод.";
        UserInput ui = new UserInput();
        List<User> users = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(inputUserData);
            System.out.println(exit);
            String choose = scan.nextLine();
            if ("1".equals(choose)) {
                System.out.println(pattern);
                User user = ui.askData();
                users.add(user);
            } else if ("2".equals(choose)) {
                if(users.size() != 0){
                    CSVWriter.writeCSV(users);
                }
                break;
            } else {
                System.out.println(incorrectInput);
            }
        }
    }
}
