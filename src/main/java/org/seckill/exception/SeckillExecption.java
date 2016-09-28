package org.seckill.exception;

/**
 * Created by jinfu on 2016/9/21.
 */
public class SeckillExecption extends RuntimeException {
    public SeckillExecption(String message) {
        super(message);
    }

    public SeckillExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
