package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
@Repository
public interface SeckillDao {

    /**
     * �����
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);

    /**
     * ����id��ѯ��ɱ��Ʒ
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * ����ƫ������ѯ��ɱ��Ʒ�б�
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset")int offset,@Param("limit")int limit);





}
