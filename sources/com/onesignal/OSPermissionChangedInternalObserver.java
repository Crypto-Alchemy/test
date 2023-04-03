package com.onesignal;

class OSPermissionChangedInternalObserver {
    /* renamed from: a */
    public static void m40234a(C5292m0 m0Var) {
        if (OneSignal.m40398h0().mo38950c(new ge4(OneSignal.f26029d0, (C5292m0) m0Var.clone()))) {
            C5292m0 m0Var2 = (C5292m0) m0Var.clone();
            OneSignal.f26029d0 = m0Var2;
            m0Var2.mo38988d();
        }
    }

    /* renamed from: b */
    public static void m40235b(C5292m0 m0Var) {
        if (!m0Var.mo38985a()) {
            C5186b.m40597d(0, OneSignal.f26030e);
        }
        OneSignalStateSynchronizer.m40495t(OneSignal.m40304A());
    }

    public void changed(C5292m0 m0Var) {
        m40235b(m0Var);
        m40234a(m0Var);
    }
}
