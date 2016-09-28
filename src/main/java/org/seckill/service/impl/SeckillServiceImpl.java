package org.seckill.service.impl;

import org.seckill.dao.SeckillDao;
import org.seckill.dao.SuccessKilledDao;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by jinfu on 2016/9/21.
 */
public class SeckillServiceImpl implements SeckillService {
    //md5盐值字符串，用于混淆md5
    private final String slat = "seckillsklakdfiofs20-023';v--32ofl;a-2";

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SeckillDao seckillDao;

    private SuccessKilledDao successKilledDao;



    public List<Seckill> getSeckillList() {
        return seckillDao.queryAll(0, 4);
    }

    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }

    public Exposer exportSeckillUrl(long seckillId) {
        Seckill seckill = seckillDao.queryById(seckillId);
        if(seckill == null){
            return new Exposer(false,seckillId);
        }

        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date now = new Date();//系统当前时间
        if (now.getTime()<startTime.getTime() || now.getTime()>endTime.getTime()){
            return new Exposer(false,seckillId,now.getTime(),startTime.getTime(),endTime.getTime());
        }
        String md5 = getMD5(seckillId);
        return new Exposer(true,seckillId,md5);
    }

    private String getMD5(long seckillId){
        String base = seckillId + "/" +slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws RuntimeException, RepeatKillException, SeckillCloseException {
        return null;
    }
}
