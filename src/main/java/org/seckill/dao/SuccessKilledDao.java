package main.java.org.seckill.dao;

import main.java.org.seckill.entity.SuccessKilled;

/**
 * Created by Kingfu on 2016/9/3 0003.
 */
public interface SuccessKilledDao {

    /**
     * ������ɱ�ɹ���ϸ���ɹ����ظ�
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * ����id��ѯ��ɱ�ɹ���ϸ��Я��Seckill����
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);


}
