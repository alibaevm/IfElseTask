import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин :");
        String login = scanner.nextLine();
        System.out.println("Введите пароль : ");
        String parol = scanner.nextLine();

        if (login.equals("alibaev_21@gmail.com") && parol.equals("12345")){
            System.out.println("Welcome"); }
        else if (!login.equals("alibaev_21@gmail.com") &&  !parol.equals("12345")) {
            System.out.println("Логин и пароль введен неправильно"); }
           else if ( login.equals("alibaev_21@gmail.com") &&  !parol.equals("12345")) {
               System.out.println("Пароль введен неправльно");}
        else if ( !login.equals("alibaev_21@gmail.com") &&  parol.equals("12345")) {
            System.out.println("Логин введен неправильно"); }
    }
        }





