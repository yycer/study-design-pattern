package com.yyc.studydesignpattern.solid.ocp.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Frankie
 * @since 2022-07-14 7:06 PM
 */
@Slf4j
public class EmailNotification implements Notification {
    @Override
    public void send(String msg) {
        log.info("Mocked Email: {}", msg);
    }
}
