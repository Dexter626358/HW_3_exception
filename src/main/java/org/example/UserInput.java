package org.example;

public class UserInput {

    public User askData(){
        ReadData reader = new ReadData();
        String data = reader.readUserData();
        System.out.println(data);
        Parser parser = new Parser();

        try {
            String[] userData = parser.parseData(data);
            User user = new User(userData[0], userData[1], userData[2], userData[3], userData[4], userData[5].charAt(0));
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
