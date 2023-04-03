package com.onesignal;

public class OSNotificationAction {

    /* renamed from: a */
    public final ActionType f25967a;

    /* renamed from: b */
    public final String f25968b;

    public enum ActionType {
        Opened,
        ActionTaken
    }

    public OSNotificationAction(ActionType actionType, String str) {
        this.f25967a = actionType;
        this.f25968b = str;
    }
}
