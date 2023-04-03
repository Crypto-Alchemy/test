package com.onesignal;

import android.content.Context;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, mo44877d2 = {"Lcom/onesignal/h0;", "", "Landroid/content/Context;", "context", "", "a", "b", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.h0 */
/* compiled from: OSNotificationOpenAppSettings.kt */
public final class C5243h0 {

    /* renamed from: a */
    public static final C5243h0 f26338a = new C5243h0();

    /* renamed from: a */
    public final boolean mo38832a(Context context) {
        vx2.m53591g(context, "context");
        return !vx2.m53586b("DISABLE", OSUtils.m40275f(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    /* renamed from: b */
    public final boolean mo38833b(Context context) {
        vx2.m53591g(context, "context");
        return OSUtils.m40276g(context, "com.onesignal.suppressLaunchURLs");
    }
}
