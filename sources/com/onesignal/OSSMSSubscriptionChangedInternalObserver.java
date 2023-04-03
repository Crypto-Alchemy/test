package com.onesignal;

class OSSMSSubscriptionChangedInternalObserver {
    /* renamed from: a */
    public static void m40243a(he4 he4) {
        if (OneSignal.m40416n0().mo38950c(new ie4(OneSignal.f26047m0, (he4) he4.clone()))) {
            he4 he42 = (he4) he4.clone();
            OneSignal.f26047m0 = he42;
            he42.mo43172d();
        }
    }

    public void changed(he4 he4) {
        m40243a(he4);
    }
}
