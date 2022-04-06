package com.yyc.studydesignpattern.creational.builder2;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Frankie
 * @since 2022-04-06 8:07 PM
 */
@Getter
public class Builder {
    private static final int DEFAULT_MAX_THREAD_COUNT = 8;
    private static final int DEFAULT_MIN_THREAD_COUNT = 1;

    private String name;
    private int maxThreadCount = DEFAULT_MAX_THREAD_COUNT;
    private int minThreadCount = DEFAULT_MIN_THREAD_COUNT;

    public ThreadPoolConfig build() {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Please enter the name property!");
        }
        if (minThreadCount > maxThreadCount) {
            throw new IllegalArgumentException("minThreadCount must not be greater than maxThreadCount!");
        }
        return new ThreadPoolConfig(this);
    }

    public Builder setName(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Please enter the name property!");
        }
        this.name = name;
        return this;
    }

    public Builder setMaxThreadCount(int maxThreadCount) {
        this.maxThreadCount = maxThreadCount;
        return this;
    }

    public Builder setMinThreadCount(int minThreadCount) {
        this.minThreadCount = minThreadCount;
        return this;
    }
}
