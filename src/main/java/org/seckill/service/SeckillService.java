package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;

import java.util.List;

/**
 * Created by kingfu on 2016/9/17 0017.
 *
 * 业务接口：站在 ‘使用者’ 的角度设计接口
 * 方法定义粒度，参数，返回值类型
 */
public interface SeckillService {

    /**
     * 查询所有秒杀对象
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀对象
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */
    SeckillExecution executeSeckill(long seckillId,long userPhone,String md5);

}
