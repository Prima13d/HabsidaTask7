package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(String userFirstName, String userFamilyName);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();

}
