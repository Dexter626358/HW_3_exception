package org.example;

public class Parser {
    public User parseData(String str) throws MySizeException, MyDataException {
        String surname = null;
        String name = null;
        String patronymic = null;
        String dateOfBirth = null;
        long phoneNumber = 0;
        char gender = '\u0000';

        String [] data = str.split(" ");

        if(data.length < 6){
            throw new MySizeException("Введено меньше данных, чем требуется.", data.length);
        }
        if(data.length > 6){
            throw new MySizeException("Введено больше данных, чем требуется.", data.length);
        }
        for (String item: data) {
            //System.out.println(item);
            if (item.matches("^[а-яА-Я]+$")){
                if(surname == null) {
                    surname = item;
                    //System.out.println(surname);
                }else if(name == null){
                    name = item;
                    //System.out.println(name);
                }else {
                    patronymic = item;
                    //System.out.println(patronymic);
                }
            }else if (item.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                dateOfBirth = item;
                //System.out.println(dateOfBirth);
            } else if (item.matches("8\\d{10}")) {
                phoneNumber = Long.parseLong(item);
                ///System.out.println(phoneNumber);
            }else if((item.equals("f") || item.equals("m") || (item.equals("M") || item.equals("F")))) {
                //System.out.println(item);
                gender = item.charAt(0);
                //System.out.println(gender);
            }else {
                //System.out.println(" ");
            }
        }
        if (surname == null) {
            throw new MyDataException("Фамилия содержит недопустимые символы.", 1);
        }else if (name == null) {
            throw new MyDataException("Имя содержит недопустимые символы.", 2);
        } else if (patronymic == null) {
            throw new MyDataException("Отчество содержит недопустимые символы.", 3);
        } else if (dateOfBirth == null) {
            throw new MyDataException("Неверный формат даты.", 4);
        } else if (phoneNumber == 0) {
            throw new MyDataException("Некорректный формат ввода номера телефона.", 5);
        } else if(gender == '\u0000'){
            throw new MyDataException("Некорректный формат ввода пола.", 6);
        }else{
            System.out.println(surname);
            System.out.println(name);
            System.out.println(patronymic);
            System.out.println(dateOfBirth);
            System.out.println(phoneNumber);
            System.out.println(gender);
            return new User(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
        }


    }
}
