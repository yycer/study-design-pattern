package com.yyc.studydesignpattern.solid.ocp.refactored;

import com.yyc.studydesignpattern.solid.ocp.example2.AlertConfiguration;
import com.yyc.studydesignpattern.solid.ocp.example2.Notification;

/**
 * @author Frankie
 * @since 2022-07-14 7:27 PM
 */
public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertConfiguration alertConfiguration, Notification notification) {
        super(alertConfiguration, notification);
    }

    @Override
    public void check(AlertMetrics metrics) {
        long requestCount = metrics.getRequestCount();
        long durationOfSeconds = metrics.getDurationOfSeconds();
        long tps = requestCount / durationOfSeconds;
        long maxTps = alertConfiguration.getMaxTps();
        if (tps > maxTps) {
            notification.send(String.format("tps=%d exceeds the maximum value=%d.", tps, maxTps));
        }
    }
}
