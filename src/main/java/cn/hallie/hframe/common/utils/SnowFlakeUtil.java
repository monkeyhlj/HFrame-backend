package cn.hallie.hframe.common.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Hallie
 * @date 2024-01-12
 */
@Slf4j
public class SnowFlakeUtil {
    private static SnowFlakeWorkerUtil snowflake = new SnowFlakeWorkerUtil(0, 0);

    public static Long nextId() {
        return snowflake.nextId();
    }
}
