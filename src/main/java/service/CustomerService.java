package service;

import database.UserDatabase;
import model.Customer;
import model.User;

import java.util.List;

public class CustomerService {
    private UserDatabase userDatabase;

    public CustomerService(){
        this.userDatabase = new UserDatabase();
    }

    public void createCustomer(Customer customer){
        userDatabase.createUser(customer);
    }

    public Customer getCustomer(int id){
        return (Customer) userDatabase.getUserById(id);
    }

    public void updateCustomer(Customer customer){
        userDatabase.updateUser(customer);
    }

    public void deleteCustomer(int id){
        userDatabase.deleteUser(id);
    }

    public User getCustomerByEmail(String email){
        return userDatabase.getUserByEmail(email);
    }

    public List<User> searchCustomers(String data){
        return userDatabase.searchUsers(data);
    }
}
