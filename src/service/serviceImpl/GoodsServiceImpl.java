package service.serviceImpl;

import dao.GoodsDao;
import entity.Goods;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsService;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void saveGoods(Goods goods) {
        goodsDao.saveGoods(goods);
    }

    @Override
    public void delGoods(Integer id) {
        goodsDao.delGoods(id);
    }

    @Override
    public Goods findGoodsById(Integer id) {
        return goodsDao.findGoodsById(id);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }

    @Override
    public List<Goods> fingAllGoods() {
        return goodsDao.fingAllGoods();
    }
}
