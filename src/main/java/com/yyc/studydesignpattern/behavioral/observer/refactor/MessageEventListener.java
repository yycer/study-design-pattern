package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Frankie
 * @since 2022-03-10 8:48 AM
 */
@Slf4j
public class MessageEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult result) {
        log.info("[短信] 尊敬的用户:{}, 内容:{}", result.getUserId(), result.getMessage());
    }
}
