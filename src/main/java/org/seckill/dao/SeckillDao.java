package main.java.org.seckill.dao;

import main.java.org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId,Date killTime);

    /**
     * 根据id查询秒杀商品
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);





}
