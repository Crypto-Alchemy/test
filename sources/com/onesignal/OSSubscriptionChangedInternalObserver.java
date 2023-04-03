package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    /* renamed from: a */
    public static void m40244a(OSSubscriptionState oSSubscriptionState) {
        if (OneSignal.m40437u0().mo38950c(new le4(OneSignal.f26035g0, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            OneSignal.f26035g0 = oSSubscriptionState2;
            oSSubscriptionState2.mo38543f();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        m40244a(oSSubscriptionState);
    }
}
