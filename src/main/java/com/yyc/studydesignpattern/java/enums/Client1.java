package com.yyc.studydesignpattern.java.enums;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Frankie
 * @since 2022-04-11 8:35 AM
 */
@Slf4j
public class Client1 {
    public static void main(String[] args) {
        UrnComposition urnComposition = UrnComposition.RADD;
        if (urnComposition.isRadd()) {
            System.out.println("This is RADD");
        } else {
            System.out.println("This is not RADD");
        }
    }
}
