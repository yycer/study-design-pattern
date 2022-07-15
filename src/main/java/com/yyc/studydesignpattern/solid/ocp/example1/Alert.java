package com.yyc.studydesignpattern.solid.ocp.example1;

/**
 * @author Frankie
 * @since 2022-07-14 6:46 PM
 */
public class Alert {
    private AlertConfiguration alertConfiguration;
    private Notification notification;

    public Alert(AlertConfiguration alertRule, Notification notification) {
        this.alertConfiguration = alertRule;
        this.notification = notification;
    }

    public void check(long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        long maxTps = alertConfiguration.getMaxTps();
        long maxErrorCount = alertConfiguration.getMaxErrorCount();
        if (tps > maxTps) {
            notification.send(String.format("tps=%d exceeds the maximum value=%d.", tps, maxTps));
        }
        if (errorCount > maxErrorCount) {
            notification.send(String.format("errorCount=%d exceeds the maximum value=%d", errorCount, maxErrorCount));
        }
    }
}
