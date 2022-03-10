package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.common.MinibusTargetService;
import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;

import java.time.LocalDateTime;

/**
 * @author Frankie
 * @since 2022-03-10 9:04 AM
 */
public class LotteryServiceImpl2 extends LotteryService2 {

    private final MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    public LotteryResult doDraw(int userId) {
        String message = minibusTargetService.lottery(userId);
        return new LotteryResult(userId, message, LocalDateTime.now());
    }
}
