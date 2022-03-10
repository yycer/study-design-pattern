package com.yyc.studydesignpattern.behavioral.observer.old;

import com.yyc.studydesignpattern.behavioral.observer.common.MinibusTargetService;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * @author Frankie
 * @since 2022-03-09 9:34 AM
 *
 * 这种实现的缺点: 除了摇号之外，后面两部分是非核心功能，而且会随之后续的业务需求发展而不断的调整和补充。因此需要将核心、非核心功能隔离开。
 *
 */
@Slf4j
public class LotteryServiceImpl implements LotteryService {

    private final MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    public LotteryResult doDraw(int userId) {
        // 1. 摇号
        String result = minibusTargetService.lottery(userId);

        // 2. 发短信
        log.info("[短信] 尊敬的用户:{}, 内容:{}", userId, result);

        // 3. 发微信
        log.info("[微信] 尊敬的用户:{}, 内容:{}", userId, result);
        return new LotteryResult(userId, result, LocalDateTime.now());
    }
}
