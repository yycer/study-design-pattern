package com.yyc.studydesignpattern.solid.ocp.example1;

/**
 * @author Frankie
 * @since 2022-07-14 7:06 PM
 */
public class Client {
    public static void main(String[] args) {
        AlertConfiguration alertConfiguration = new AlertConfiguration();
        Notification emailNotification = new EmailNotification();
        Alert alert = new Alert(alertConfiguration, emailNotification);
        alert.check(90 - 20, 9999 + 2, 10);
    }
}
