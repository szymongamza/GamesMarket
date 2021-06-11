package view;

import controller.ApplicationController;
import model.Address;
import model.Customer;
import model.Item;
import model.Platform;
import model.User;

import java.util.Scanner;

public class UI {
    //TODO

    private User loggedUser;
    private Scanner scanner;

    public UI (){
        this.scanner = new Scanner(System.in);
        this.loggedUser = new User();
    }

    public void showBasicMenu(){

        boolean isLogged = false;

        System.out.println("Witaj w Games Market!");

        while (loggedUser.getId() == 0){
            System.out.println("Jeśli jesteś zarejestrowanym użytkownikiem, wybierz 1, jeśli nie masz konta i chcesz się zarejestrować wybierz 2");
            System.out.println("1 - login");
            System.out.println("2 - register");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    LoginForm loginForm = fillLoginForm();
                    this.loggedUser = ApplicationController.getInstance().login(loginForm.getLogin(), loginForm.getPassword());

                    if (loggedUser.getId() != 0) {
                        showCustomerMenu();
                    }

                    break;
                case "2":
                    RegisterForm registerForm = fillRegistrationForm();
                    ApplicationController.getInstance().register(
                            registerForm.getCustomer().getEmail(),
                            registerForm.getCustomer().getPassword(),
                            registerForm.getConfirmPassword(),
                            registerForm.getCustomer().getFirstName(),
                            registerForm.getCustomer().getLastName(),
                            registerForm.getCustomer().getTelephone(),
                            registerForm.getAddress());
                    break;
                default:
                    System.out.println("Elo ZIomek, zły input");
                    break;
            }
        }
    }

    public void showCustomerMenu(){

        System.out.println("1 - szukaj gier");
        System.out.println("2 - dodaj aukcję");
        System.out.println("2 - wyloguj się");
        String input = scanner.nextLine();

        switch (input){
            case "1":
                showGameMenu();
                break;
            case "2":
//                showAuctionMenu();
                break;
            default:
                System.out.println("Elo Ziom, zapraszamy ponownie");
                break;
        }
    }

    private void showGameMenu() {
        System.out.println("Wpisz szukaną frazę");
        System.out.println(ApplicationController.getInstance().searchItems(scanner.nextLine()));
        System.out.println("Wybierz id gry, którą chcesz dodać do koszyka");
//        ApplicationController.getInstance().
    }

    public RegisterForm fillRegistrationForm(){
        RegisterForm registerForm = new RegisterForm();

        System.out.println("Podaj email");
        registerForm.getCustomer().setEmail(scanner.nextLine());
        System.out.println("Podaj hasło");
        registerForm.getCustomer().setPassword(scanner.nextLine());
        System.out.println("Potwierdz hasło");
        registerForm.setConfirmPassword(scanner.nextLine());
        System.out.println("Podaj Imie");
        registerForm.getCustomer().setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko");
        registerForm.getCustomer().setLastName(scanner.nextLine());
        System.out.println("Podaj kod kraju");
        registerForm.getAddress().setCountryCode(scanner.nextLine());
        System.out.println("Podaj kod pocztowy");
        registerForm.getAddress().setPostcode(scanner.nextLine());
        System.out.println("Podaj miasto");
        registerForm.getAddress().setCity(scanner.nextLine());
        System.out.println("Podaj ulicę");
        registerForm.getAddress().setStreet(scanner.nextLine());
        System.out.println("Podaj numer budynku/mieszkania");
        registerForm.getAddress().setBuildingNumber(scanner.nextLine());

        return registerForm;
    }

    public Item fillItemForm(){
        Item item = new Item();
        boolean isCorrect = false;

        System.out.println("Podaj nazwe");
        item.setName(scanner.nextLine());
        System.out.println("Podaj klucz (tylko w przypadku dystrybucji cyfrowej, w przypadku fizycznej opcjonalne)");
        item.setKey(scanner.nextLine());
        System.out.println("Podaj rok produkcji");
        item.setYear(scanner.nextLine());
        System.out.println("Podaj opis");
        item.setDescription(scanner.nextLine());
        System.out.println("Podaj gatunek");
        item.setGenre(scanner.nextLine());
        System.out.println("Podaj cene w formacie zzgg");
        item.setPrice(scanner.nextInt());
        System.out.println("Wybierz platforme");
        System.out.println("-PLaystation");
        System.out.println("-PC");
        System.out.println("-Nintendo");
        System.out.println("-Xbox");

        while (!isCorrect) {
            switch (scanner.nextLine()) {
                case "Playstation":
                    item.setPlatform(Platform.PLaystation);
                    isCorrect = true;
                    break;
                case "Xbox":
                    item.setPlatform(Platform.Xbox);
                    isCorrect = true;
                    break;
                case "PC":
                    item.setPlatform(Platform.PC);
                    isCorrect = true;
                    break;
                case "Nintendo":
                    item.setPlatform(Platform.Nintendo);
                    isCorrect = true;
                    break;
                default:
                    System.out.println("Nie ma takiej platformy");
                    isCorrect = false;
                    break;
            }
        }

        System.out.println("Czy gra jest nowa?");

        while (!isCorrect) {
            switch (scanner.nextLine()) {
                case "tak":
                    item.setNew(true);
                    isCorrect = true;
                    break;
                case "nie":
                    item.setNew(false);
                    isCorrect = true;
                    break;
                default:
                    System.out.println("Odpowiedz tak lub nie");
                    isCorrect = false;
                    break;
            }
        }
        return item;
    }

    public Address fillAddressForm(){
        Address address = new Address();

        System.out.println("Podaj kod kraju");
        address.setCountryCode(scanner.nextLine());
        System.out.println("Podaj kod pocztowy");
        address.setPostcode(scanner.nextLine());
        System.out.println("Podaj miasto");
        address.setCity(scanner.nextLine());
        System.out.println("Podaj ulicę");
        address.setStreet(scanner.nextLine());
        System.out.println("Podaj numer budynku/mieszkania");
        address.setBuildingNumber(scanner.nextLine());

        return address;
    }

    public LoginForm fillLoginForm(){
        LoginForm loginForm = new LoginForm();

        System.out.println("Podaj login");
        loginForm.setLogin(scanner.nextLine());
        System.out.println("haslo");
        loginForm.setPassword(scanner.nextLine());
        return loginForm;
    }

}
