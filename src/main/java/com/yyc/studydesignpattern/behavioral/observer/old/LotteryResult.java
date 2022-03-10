package com.yyc.studydesignpattern.behavioral.observer.old;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Frankie
 * @since 2022-03-09 9:33 AM
 */
@Data
@AllArgsConstructor
public class LotteryResult {
    private int userId;
    private String message;
    private LocalDateTime dateTime;
}
