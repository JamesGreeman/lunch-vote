package com.zanvork.models;

/**
 * @author James
 */
public class Vote {

    private final int priority;
    private final LunchChoice lunchChoice;

    public Vote(int priority, LunchChoice lunchChoice) {
        this.priority = priority;
        this.lunchChoice = lunchChoice;
    }

    public int getPriority() {
        return priority;
    }

    public LunchChoice getLunchChoice() {
        return lunchChoice;
    }
}
