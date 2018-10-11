package service.serviceImpl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByNameAndPassword(String name, String password) {
        return userDao.findUserByNameAndPassword(name,password);
    }

    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
