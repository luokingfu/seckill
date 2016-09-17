package org.seckill.exception;

/**
 * Created by kingfu on 2016/9/17 0017.
 *
 * ÷ÿ∏¥√Î…±“Ï≥£
 */
public class RepeatKillException extends RuntimeException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
