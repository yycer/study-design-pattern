package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Frankie
 * @since 2022-03-10 8:48 AM
 */
public class EventManager {
    private static List<EventListener> listeners = new LinkedList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(LotteryResult result) {
        listeners.forEach(x -> x.doEvent(result));
    }
}
