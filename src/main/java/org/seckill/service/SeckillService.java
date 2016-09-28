package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;

import java.util.List;

/**
 * Created by kingfu on 2016/9/17 0017.
 *
 * ҵ��ӿڣ�վ�� ��ʹ���ߡ� �ĽǶ���ƽӿ�
 * �����������ȣ�����������ֵ����
 */
public interface SeckillService {

    /**
     * ��ѯ������ɱ����
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * ��ѯ������ɱ����
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * ��ɱ����ʱ�����ɱ�ӿڵ�ַ���������ϵͳʱ�����ɱʱ��
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * ִ����ɱ����
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */
    SeckillExecution executeSeckill(long seckillId,long userPhone,String md5)
            throws RuntimeException,RepeatKillException,SeckillCloseException;

}
