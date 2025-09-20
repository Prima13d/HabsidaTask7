package web.service;

import org.springframework.stereotype.Service;
import web.model.User;
import java.util.List;


@Service
public interface UserService {

    void saveUser(String userFirstName, String userFamilyName);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();



}
