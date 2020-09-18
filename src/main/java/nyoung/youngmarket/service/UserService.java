package nyoung.youngmarket.service;

import nyoung.youngmarket.domain.User;
import nyoung.youngmarket.model.UserModel;
import nyoung.youngmarket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findByUserId(String id) {
        return userRepository.findByid(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User signup(UserModel userModel) {
        User user = new User();
        user.setId(userModel.getId());
        user.setPassword(userModel.getPassword());
        user.setUsername(userModel.getUsername());
        user.setAddress(userModel.getAddress());
        user.setPhone(userModel.getPhone());

        return user;
    }


}
