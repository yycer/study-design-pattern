package com.yyc.studydesignpattern.solid.ocp.example1;

/**
 * @author Frankie
 * @since 2022-07-14 6:50 PM
 */
public class AlertConfiguration {

    public long getMaxTps() {
        return 10L;
    }

    public long getMaxErrorCount() {
        return 10_000L;
    }
}
