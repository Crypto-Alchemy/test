package com.onesignal;

class OSEmailSubscriptionChangedInternalObserver {
    /* renamed from: a */
    public static void m40112a(xc4 xc4) {
        if (OneSignal.m40374Z().mo38950c(new yc4(OneSignal.f26041j0, (xc4) xc4.clone()))) {
            xc4 xc42 = (xc4) xc4.clone();
            OneSignal.f26041j0 = xc42;
            xc42.mo49447d();
        }
    }

    public void changed(xc4 xc4) {
        m40112a(xc4);
    }
}
