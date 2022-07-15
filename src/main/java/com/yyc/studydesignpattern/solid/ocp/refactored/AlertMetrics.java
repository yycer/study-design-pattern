package com.yyc.studydesignpattern.solid.ocp.refactored;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Frankie
 * @since 2022-07-14 7:24 PM
 */
@Data
@AllArgsConstructor
public class AlertMetrics {
    private long requestCount;
    private long errorCount;
    private long timeoutCount;
    private long durationOfSeconds;
}
