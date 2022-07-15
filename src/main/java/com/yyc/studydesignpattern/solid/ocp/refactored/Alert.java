package com.yyc.studydesignpattern.solid.ocp.refactored;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frankie
 * @since 2022-07-14 7:32 PM
 */
public class Alert {

    private final List<AlertHandler> alertHandlers = new ArrayList<>(3);

    public void addAlertHandler(AlertHandler handler) {
        this.alertHandlers.add(handler);
    }

    public void check(AlertMetrics metrics) {
        alertHandlers.forEach(handler -> handler.check(metrics));
    }
}
