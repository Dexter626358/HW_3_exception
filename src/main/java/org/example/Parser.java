package org.example;

public class Parser {
    public String [] parseData(String str) throws MySizeException, MyDataException {
        String [] data = str.split(" ");

        if(data.length < 6){
            throw new MySizeException("Введено меньше данных, чем требуется.", data.length);
        }
        if(data.length > 6){
            throw new MySizeException("Введено больше данных, чем требуется.", data.length);
        }
        if(!data[0].matches("^[a-zA-Zа-яА-Я]+$")){
            throw new MyDataException("Фамилия содержит недопустимые символы.", 1);
        }
        if(!data[1].matches("^[a-zA-Zа-яА-Я]+$")){
            throw new MyDataException("Имя содержит недопустимые символы.", 2);
        }
        if(!data[2].matches("^[a-zA-Zа-яА-Я]+$")){
            throw new MyDataException("Отчество содержит недопустимые символы.", 3);
        }
        Checker checkData = new Checker();
        if(!checkData.isDateValid(data[3], "dd.MM.yyyy")){
            throw new MyDataException("Неверный формат даты.", 4);
        }
        if(!data[4].matches("8\\d{10}")){
            throw new MyDataException("Некорректный формат ввода номера телефона.", 5);
        }
        if(!(data[5].equals("f") || data[5].equals("m"))){
            throw new MyDataException("Некорректный формат ввода пола.", 6);
        }
        return data;
    }
}
