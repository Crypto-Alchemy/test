package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f25321id;

    /* access modifiers changed from: public */
    DeliveryMechanism(int i) {
        this.f25321id = i;
    }

    public static DeliveryMechanism determineFrom(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int getId() {
        return this.f25321id;
    }

    public String toString() {
        return Integer.toString(this.f25321id);
    }
}
