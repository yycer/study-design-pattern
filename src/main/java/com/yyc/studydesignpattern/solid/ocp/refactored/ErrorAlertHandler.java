package com.yyc.studydesignpattern.solid.ocp.refactored;

import com.yyc.studydesignpattern.solid.ocp.example2.AlertConfiguration;
import com.yyc.studydesignpattern.solid.ocp.example2.Notification;

/**
 * @author Frankie
 * @since 2022-07-14 7:30 PM
 */
public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertConfiguration alertConfiguration, Notification notification) {
        super(alertConfiguration, notification);
    }

    @Override
    public void check(AlertMetrics metrics) {
        long errorCount = metrics.getErrorCount();
        long maxErrorCount = alertConfiguration.getMaxErrorCount();
        if (errorCount > maxErrorCount) {
            notification.send(String.format("errorCount=%d exceeds the maximum value=%d", errorCount, maxErrorCount));
        }
    }
}
