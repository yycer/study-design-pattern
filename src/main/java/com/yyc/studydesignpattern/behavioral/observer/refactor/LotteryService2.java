package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;

/**
 * @author Frankie
 * @since 2022-03-10 8:57 AM
 */
public abstract class LotteryService2 {

    private EventManager eventManager;

    public LotteryService2() {
        eventManager = new EventManager();
        eventManager.subscribe(new MessageEventListener());
        eventManager.subscribe(new WechatEventListener());
    }

    protected abstract LotteryResult doDraw(int userId);

    public LotteryResult draw(int userId) {
        LotteryResult result = doDraw(userId);
        eventManager.notify(result);
        return result;
    }
}
