package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    private static final String DELIMITER1 = "<";
    private static final String DELIMITER2 = ">";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "<surName><name><patronymic><birthdate> <phone><gender>";

    public static void writeCSV(List<User> users) {

        String fileName = "Users.csv";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            fileWriter.append(FILE_HEADER.toString());
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (User user : users) {
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getSurname());
                fileWriter.append(DELIMITER2);
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getName());
                fileWriter.append(DELIMITER2);
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getPatronymic());
                fileWriter.append(DELIMITER2);
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getDate_of_birthday());
                fileWriter.append(DELIMITER2);
                fileWriter.append(" ");
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getTelephone());
                fileWriter.append(DELIMITER2);
                fileWriter.append(DELIMITER1);
                fileWriter.append(user.getGender());
                fileWriter.append(DELIMITER2);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Users.csv файл создан успешно!");

        } catch (IOException e) {
            System.out.println("Ошибка записи в файл Users.csv!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файлового потока!");
                e.printStackTrace();
            }
        }
    }
}