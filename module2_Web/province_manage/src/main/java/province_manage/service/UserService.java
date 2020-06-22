package province_manage.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import province_manage.model.Login;
import province_manage.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    Page<User> findAllUer(Pageable pageable);
    void deleteUserById(Long id);
    public User checkLogin(Login login);
//    Page<User> findAllUserByName(Pageable pageable, String s);
}
