package com.yyc.studydesignpattern.solid.ocp.refactored;

import com.yyc.studydesignpattern.solid.ocp.example2.AlertConfiguration;
import com.yyc.studydesignpattern.solid.ocp.example2.Notification;

/**
 * @author Frankie
 * @since 2022-07-14 7:31 PM
 */
public class TimeoutAlertHandler extends AlertHandler {

    public TimeoutAlertHandler(AlertConfiguration alertConfiguration, Notification notification) {
        super(alertConfiguration, notification);
    }

    @Override
    public void check(AlertMetrics metrics) {
        long timeoutCount = metrics.getTimeoutCount();
        long maxTimeoutCount = alertConfiguration.getMaxTimeoutCount();
        if (timeoutCount > maxTimeoutCount) {
            notification.send(String.format("timeoutCount=%d exceeds the maximum value=%d",
                    timeoutCount, maxTimeoutCount));
        }
    }
}
