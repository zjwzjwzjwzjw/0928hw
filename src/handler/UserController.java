package handler;

import entity.Goods;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.serviceImpl.GoodsServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private GoodsServiceImpl goodsService;
    @RequestMapping("checkname")
    @ResponseBody
    public String checkname(String name){
        List<User> list=userService.findUserByName(name);
        if(list.size()==0){
            return "";
        }
        return "right";
    }
    @RequestMapping("checkUser")
    @ResponseBody
    public String checkUser(String name,String password){
        User user=userService.findUserByNameAndPassword(name,password);
        if(user==null){
            return "";
        }
        return "right";
    }
    @RequestMapping("login")
    public String login(String name,String password,Model model){
        User user=userService.findUserByNameAndPassword(name,password);
        return "forward:/Goods/findAll";
    }
}
