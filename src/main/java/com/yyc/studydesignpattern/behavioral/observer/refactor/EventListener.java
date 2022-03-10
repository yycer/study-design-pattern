package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;

/**
 * @author Frankie
 * @since 2022-03-10 8:48 AM
 */
public interface EventListener {
    void doEvent(LotteryResult result);
}
