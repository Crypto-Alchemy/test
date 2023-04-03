package com.facebook.imagepipeline.common;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    public static Priority getHigherPriority(Priority priority, Priority priority2) {
        if (priority.ordinal() > priority2.ordinal()) {
            return priority;
        }
        return priority2;
    }
}
