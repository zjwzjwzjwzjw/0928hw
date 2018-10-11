package service;

import entity.User;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
public interface UserService {
    User findUserByNameAndPassword(String name, String password);
    List<User> findUserByName(String name);
}
