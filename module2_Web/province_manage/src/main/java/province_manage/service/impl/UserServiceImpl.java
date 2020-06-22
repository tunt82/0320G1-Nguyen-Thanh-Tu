package province_manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import province_manage.model.Login;
import province_manage.model.User;
import province_manage.repository.UserRepository;
import province_manage.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void saveUser(User user) {
        user.setIs_delete(false);
        userRepository.save(user);
    }

    @Override
    public Page<User> findAllUer(Pageable pageable) {
        return userRepository.findAllUer(pageable);
    }

    @Override
    public void deleteUserById(Long id) {
        User user=userRepository.findById(id).orElse(null);
        if(user!=null) {
            user.setIs_delete(true);
            userRepository.save(user);
        }
    }

    @Override
    public User checkLogin(Login login) {
        List<User> userList=userRepository.findAll();
        for (User u: userList) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword()))
            { return u; }
        }
        return null;
    }

//    @Override
//    public Page<User> findAllUserByName(Pageable pageable, String s) {
//        pageable= PageRequest.of(pageable.getPageNumber(),2, Sort.by("name"));
//        return userRepository.findAllByIs_deleteIsFalseAndNameContaining(pageable,s);
//    }

}
