package com.yyc.studydesignpattern.solid.ocp.refactored;

import com.yyc.studydesignpattern.solid.ocp.example2.AlertConfiguration;
import com.yyc.studydesignpattern.solid.ocp.example2.Notification;

/**
 * @author Frankie
 * @since 2022-07-14 7:23 PM
 */
public abstract class AlertHandler {
    protected AlertConfiguration alertConfiguration;
    protected Notification notification;

    public AlertHandler(AlertConfiguration alertConfiguration, Notification notification) {
        this.alertConfiguration = alertConfiguration;
        this.notification = notification;
    }

    public abstract void check(AlertMetrics metrics);
}
