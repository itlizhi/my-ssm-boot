package com.enreach.ssm.utils.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadUtil {

    /**
     * sleep等待, 单位为毫秒, 已捕捉并处理InterruptedException.
     */
    public static void sleep(long durationMillis) {
        try {
            Thread.sleep(durationMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * sleep等待，已捕捉并处理InterruptedException.
     */
    public static void sleep(long duration, TimeUnit unit) {
        try {
            Thread.sleep(unit.toMillis(duration));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * 纯粹为了提醒下处理InterruptedException的正确方式，除非你是在写不可中断的任务.
     */
    public static void handleInterruptedException() {
        Thread.currentThread().interrupt();
    }


}