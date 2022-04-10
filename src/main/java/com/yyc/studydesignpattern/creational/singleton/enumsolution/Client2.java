package com.yyc.studydesignpattern.creational.singleton.enumsolution;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

/**
 * @author Frankie
 * @since 2022-04-10 7:57 PM
 *
 * 测试反射对枚举单例的影响
 * 1. 获取私有构造函数(string.class, int.class)
 * 2. 获取单例
 */
@Slf4j
public class Client2 {
    public static void main(String[] args) throws Exception {
        // 无默认私有无参构造函数
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Singleton instance1 = constructor.newInstance("instance1", 1);
        log.info("instance1={}", instance1);


        // Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
	    // at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:493)
        //     at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
        //     at com.yyc.studydesignpattern.creational.singleton.enumsolution.Client2.main(Client2.java:20)
    }
}
