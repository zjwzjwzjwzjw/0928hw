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
@RequestMapping("Goods")
@Controller
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    @RequestMapping("del")
    @ResponseBody
    public String delGoods(Integer id) {
        goodsService.delGoods(id);
        return "del";
    }
    @RequestMapping("addGoods")
    public String addGoods(Goods goods, Model model) {
        List<Goods> list = goodsService.fingAllGoods();
        for (Goods g : list) {
            if (g.getName().equals(goods.getName()) && g.getType().equals(goods.getType()) && (g.getPrice() + "").equals(goods.getPrice() + "")) {
                g.setCount(g.getCount() + goods.getCount());
                goodsService.updateGoods(g);
            } else {
                goodsService.saveGoods(goods);
            }
        }
        return "forward:findAll";
    }

    @RequestMapping("add")
    public String add() {
        return "add";
    }


    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Goods> list = goodsService.fingAllGoods();
        int sunCount = 0;//保存所有商品总件数
        Double allSunPrice = 0.0;//保存所有商品总价格
        for (Goods g : list) {
            g.setSumPrice(g.getPrice() * g.getCount());//某商品的总价
            sunCount += g.getCount();
            allSunPrice += g.getSumPrice();
        }
        model.addAttribute("sunCount", sunCount);
        model.addAttribute("allSunPrice", allSunPrice);
        model.addAttribute("goods", list);
        return "showAll";
    }
}
