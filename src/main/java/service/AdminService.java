package service;

import database.UserDatabase;
import model.Admin;

public class AdminService {
    private UserDatabase userDatabase;

    public AdminService(){
        userDatabase = new UserDatabase();
    }

    public void createAdmin(Admin admin){
        userDatabase.createUser(admin);
    }

    public Admin getAdmin(int id){
        return (Admin) userDatabase.getUserById(id);
    }

    public void updateAdmin(Admin admin){
        userDatabase.updateUser(admin);
    }

    public void deleteAdmin(int id){
        userDatabase.deleteUser(id);
    }
}