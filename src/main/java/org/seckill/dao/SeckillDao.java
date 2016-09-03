package main.java.org.seckill.dao;

import main.java.org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
public interface SeckillDao {

    /**
     * �����
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId,Date killTime);

    /**
     * ����id��ѯ��ɱ��Ʒ
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * ����ƫ������ѯ��ɱ��Ʒ�б�
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);





}
