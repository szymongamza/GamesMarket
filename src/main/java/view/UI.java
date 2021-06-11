package view;

import model.Customer;
import model.User;

import java.util.Scanner;

public class UI {
    //TODO

    private User loggedUser;
    private Scanner scanner;

    public UI (){
        this.scanner = new Scanner(System.in);
    }

    public void showbasicMenu(){
        System.out.println("Witaj w Games Market!");
        System.out.println("Jeśli jesteś zarejestrowanym użytkownikiem, wybierz 1, jeśli nie masz konta i chcesz się zarejestrować wybierz 2");
        System.out.println("1 - login");
        System.out.println("2 - register");
    }

    public void showRegistrationForm(){
        User user = new Customer();
        String input;

        System.out.println("Podaj email");
        user.setEmail(scanner.nextLine());
        System.out.println("Podaj hasło");
        user.setPassword(scanner.nextLine());
        System.out.println("Potwierdz hasło");

        System.out.println("Podaj Imie");
        System.out.println("Podaj nazwisko");
        System.out.println("Podaj hasło");
    }
}
