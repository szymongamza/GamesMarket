package controller;

import model.Address;
import model.Customer;
import model.User;
import service.*;

import java.util.Random;

public final class ApplicationController {

    private AdminService adminService;
    private ItemService itemService;
    private OrderService orderService;
    private AuctionService auctionService;
    private CustomerService customerService;
    private AddressService addressService;

    //Singleton pattern
    private static ApplicationController applicationControllerInstance;

    private ApplicationController(){
        this.adminService = new AdminService();
        this.itemService = new ItemService();
        this.orderService = new OrderService();
        this.auctionService = new AuctionService();
        this.customerService = new CustomerService();
        this.addressService = new AddressService();
    }

    public static ApplicationController getInstance(){
        if (applicationControllerInstance == null){
            applicationControllerInstance = new ApplicationController();
        }
        return applicationControllerInstance;
    }

    public void register(String email, String password, String confirmPass, String firstName, String lastName, String telephone, Address address){
        if (password.equals(confirmPass)){
            if (!isUserWithEmailInDb(email)){
                Customer newCustomer = new Customer(generateId(), email, password, firstName, lastName, telephone, address);
                customerService.createCustomer(newCustomer);
            }else{
                System.out.println("Email already used");
            }
        }else{
            System.out.println("Passwords are unmatched");
        }
    }

    public User login(String email, String password){

        User outputUser = new User();

        if(isUserWithEmailInDb(email)){
            if(customerService.getCustomerByEmail(email).getPassword().equals(password)){
                System.out.println("Succesfully logged in");
                outputUser = customerService.getCustomerByEmail(email);
            }else{
                System.out.println("Incorrect password");
            }
        }
        return outputUser;
    }

    private boolean isUserWithEmailInDb(String email){
        User user = customerService.getCustomerByEmail(email);
        if (user.getId() == 0) return false;
        else return true;
    }

    //placeholder utility
    private int generateId(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
