package main.java.org.seckill.dao;

import main.java.org.seckill.entity.SuccessKilled;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
public interface SuccessKilledDao {

    /**
     * 插入秒杀成功明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询秒杀成功明细并携带Seckill对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);


}
