package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;
import org.springframework.stereotype.Repository;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
@Repository
public interface SuccessKilledDao {

    /**
     * ������ɱ�ɹ���ϸ���ɹ����ظ�
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);

    /**
     * ����id��ѯ��ɱ�ɹ���ϸ��Я��Seckill����
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);


}
