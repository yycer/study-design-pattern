package com.yyc.studydesignpattern.creational.singleton.enumsolution;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;

/**
 * @author Frankie
 * @since 2022-04-10 8:00 PM
 *
 * 测试(反)序列化对于枚举单例的影响
 */
@Slf4j
public class Client3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;

        byte[] serialize = SerializationUtils.serialize(instance);
        Object instance2 = SerializationUtils.deserialize(serialize);

        log.info("instance={}", instance);   // instance=INSTANCE
        log.info("instance2={}", instance2); // instance2=INSTANCE
        log.info("instance=instance2? {}", (instance == instance2)); // instance=instance2? true
    }
}
