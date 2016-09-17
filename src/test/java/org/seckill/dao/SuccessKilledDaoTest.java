package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by devin on 2016/9/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//∏ÊÀﬂjunit spring≈‰÷√Œƒº˛
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() throws Exception {
        int count = successKilledDao.insertSuccessKilled(1001,13000000000l);
        System.out.println(count);
    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception {
        SuccessKilled s = successKilledDao.queryByIdWithSeckill(1001,13000000000l);
System.out.print(s);
    }
}