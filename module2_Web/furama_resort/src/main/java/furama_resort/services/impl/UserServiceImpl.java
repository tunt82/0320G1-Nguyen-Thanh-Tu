package furama_resort.services.impl;

import furama_resort.models.Login;
import furama_resort.models.User;
import furama_resort.repositorys.UserRepository;
import furama_resort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void saveUser(User user) {
        user.setIsDelete(false);
        userRepository.save(user);
    }

    @Override
    public Page<User> findAllUer(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public User checkLogin(Login login) {
        List<User>userList =userRepository.findAll();
        for (User user:userList){
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
