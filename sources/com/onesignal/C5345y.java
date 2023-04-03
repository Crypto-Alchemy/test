package com.onesignal;

import com.onesignal.OneSignal;

/* renamed from: com.onesignal.y */
/* compiled from: OSInAppMessagePrompt */
public abstract class C5345y {

    /* renamed from: a */
    public boolean f26578a = false;

    /* renamed from: a */
    public abstract String mo39157a();

    /* renamed from: b */
    public abstract void mo39158b(OneSignal.C5131c0 c0Var);

    /* renamed from: c */
    public boolean mo39165c() {
        return this.f26578a;
    }

    /* renamed from: d */
    public void mo39166d(boolean z) {
        this.f26578a = z;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + mo39157a() + " prompted=" + this.f26578a + '}';
    }
}
