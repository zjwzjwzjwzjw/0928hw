package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
public interface UserDao {
    User findUserByNameAndPassword(@Param("name") String name, @Param("password") String password);
    List<User> findUserByName(String name);
}
