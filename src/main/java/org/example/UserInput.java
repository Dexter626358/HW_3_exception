package org.example;

public class UserInput {

    /**
     * Метод выбрасывает исклчение в результате введения некорректных данных по количеству или содержанию
     * @return возвращает объект типа user
     */
    public User askData(){
        ReadData reader = new ReadData();
        String data = reader.readUserData();
        System.out.println(data);
        Parser parser = new Parser();
        User user;
        try {
           user = parser.parseData(data);
            return user;
        }
        catch (MySizeException e){
            if(e.getX() == 1){
                System.out.printf("%s\nВведен %d элемент, а необходимо 6.\n", e.getMessage(), e.getX());
            }else {
                System.out.printf("%s\nВведено %d элементов, а необходимо 6.\n", e.getMessage(), e.getX());
            }
        }
        catch (MyDataException e){
            System.out.printf("Введенные данные содержат ошибку.\n%s\n", e.getMessage());
        }

        return null;
    }
}
