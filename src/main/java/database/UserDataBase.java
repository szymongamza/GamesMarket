package database;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDataBase {
    private List<User> userList;

    public void createUser(User user){
        userList.add(user);
    }

    public void updateUser(User user){
        for (int i=0; i<userList.size(); i++) {
            if (userList.get(i).getId() == user.getId())
                userList.set(i, user);
        }
    }

    public void deleteUser(int id){
        for (int i=0; i<userList.size(); i++){
            if(userList.get(i).getId() == id) userList.remove(i);
        }
    }

    public User getUserByEmail(String email){
        User outputUser = new User();
        for (User user : userList) {
            if(user.getEmail().equals(email)) outputUser = user;
        }
        return outputUser;
    }

    public List<User> searchUsers(String data){
        List<User> outputList = new ArrayList<>();
        for (User user : userList){
            if (user.getEmail().contains(data)) outputList.add(user);
        }
        return outputList;
    }
}
