package com.yyc.studydesignpattern.creational.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Frankie
 * @since 2022-04-06 8:07 PM
 */
@Getter
@ToString
public class ThreadPoolConfig {
    private String name;
    private int maxThreadCount;
    private int minThreadCount;

    public ThreadPoolConfig(Builder builder) {
        this.name = builder.getName();
        this.maxThreadCount = builder.getMaxThreadCount();
        this.minThreadCount = builder.getMinThreadCount();
    }
}
