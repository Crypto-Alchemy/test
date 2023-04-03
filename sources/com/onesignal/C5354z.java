package com.onesignal;

import com.onesignal.OneSignal;

/* renamed from: com.onesignal.z */
/* compiled from: OSInAppMessagePushPrompt */
public class C5354z extends C5345y {
    /* renamed from: f */
    public static /* synthetic */ void m41433f(OneSignal.C5131c0 c0Var, boolean z) {
        OneSignal.PromptActionResult promptActionResult;
        if (z) {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_GRANTED;
        } else {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
        }
        c0Var.mo38528a(promptActionResult);
    }

    /* renamed from: a */
    public String mo39157a() {
        return "push";
    }

    /* renamed from: b */
    public void mo39158b(OneSignal.C5131c0 c0Var) {
        OneSignal.m40393f1(true, new fd4(c0Var));
    }
}
