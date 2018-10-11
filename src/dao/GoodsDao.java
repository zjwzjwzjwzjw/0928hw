package dao;

import entity.Goods;

import java.util.List;

/**
 * Created by user on 2018/9/28.
 */
public interface GoodsDao {
    void saveGoods(Goods goods);
    void delGoods(Integer id);
    Goods findGoodsById(Integer id);
    void updateGoods(Goods goods);
    List<Goods> fingAllGoods();
}
