package com.yyc.studydesignpattern.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Frankie
 * @since 2022-04-06 8:14 PM
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 1. Happy case
        ThreadPoolConfig quartzPool = new Builder()
                .setName("QuartzPool")
                .setMaxThreadCount(20)
                .setMinThreadCount(3)
                .build();
        log.info("quartzPool={}", quartzPool);

        // 2. No name
        // ThreadPoolConfig pool2 = new Builder()
        //         .setMinThreadCount(10)
        //         .build();

        // 3. minThreadCount > maxThreadCount
        // ThreadPoolConfig pool3 = new Builder()
        //         .setName("pool3")
        //         .setMaxThreadCount(10)
        //         .setMinThreadCount(30)
        //         .build();
    }
}
