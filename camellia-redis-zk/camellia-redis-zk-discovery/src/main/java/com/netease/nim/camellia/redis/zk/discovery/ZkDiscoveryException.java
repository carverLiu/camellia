package com.netease.nim.camellia.redis.zk.discovery;

/**
 *
 * Created by caojiajun on 2020/8/11
 */
public class ZkDiscoveryException extends RuntimeException {

    public ZkDiscoveryException() {
    }

    public ZkDiscoveryException(String message) {
        super(message);
    }

    public ZkDiscoveryException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZkDiscoveryException(Throwable cause) {
        super(cause);
    }

    public ZkDiscoveryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
