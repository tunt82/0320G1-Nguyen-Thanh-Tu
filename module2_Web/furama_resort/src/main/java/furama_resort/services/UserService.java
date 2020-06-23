package furama_resort.services;

import furama_resort.models.Login;
import furama_resort.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

public interface UserService {
    void saveUser(User user);
    Page<User> findAllUer(Pageable pageable);
    void deleteUserById(Long id);
    public User checkLogin(Login login);
//    Page<User> findAllUserByName(Pageable pageable, String s);
}
