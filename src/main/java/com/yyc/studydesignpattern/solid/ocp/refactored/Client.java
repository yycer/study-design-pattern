package com.yyc.studydesignpattern.solid.ocp.refactored;

import com.yyc.studydesignpattern.solid.ocp.example2.AlertConfiguration;
import com.yyc.studydesignpattern.solid.ocp.example2.EmailNotification;
import com.yyc.studydesignpattern.solid.ocp.example2.Notification;

/**
 * @author Frankie
 * @since 2022-07-14 7:23 PM
 */
public class Client {
    public static void main(String[] args) {
        AlertConfiguration alertConfiguration = new AlertConfiguration();
        Notification emailNotification = new EmailNotification();
        Alert alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertConfiguration, emailNotification));
        alert.addAlertHandler(new ErrorAlertHandler(alertConfiguration, emailNotification));
        alert.addAlertHandler(new TimeoutAlertHandler(alertConfiguration, emailNotification));
        alert.check(new AlertMetrics(90 + 20, 9999 + 2, 99 + 2, 10));
    }
}
