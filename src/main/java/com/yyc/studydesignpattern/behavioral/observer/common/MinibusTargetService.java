package com.yyc.studydesignpattern.behavioral.observer.common;

/**
 * @author Frankie
 * @since 2022-03-09 9:31 AM
 */
public class MinibusTargetService {

    public String lottery(int userId) {
        return userId % 2 == 0 ?
                "恭喜你，用户:".concat(String.valueOf(userId)).concat("，在本次摇号中签") :
                "很遗憾，用户:".concat(String.valueOf(userId)).concat("，在本次摇号未中签");
    }
}
