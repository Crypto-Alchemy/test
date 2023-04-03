package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import p000.C6765ze;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/onesignal/p;", "Lcom/onesignal/PermissionsActivity$c;", "", "fallbackToSettings", "Lcom/onesignal/OneSignal$h0;", "callback", "Lr37;", "h", "a", "b", "g", "i", "accepted", "e", "f", "", "Ljava/util/Set;", "callbacks", "Z", "awaitingForReturnFromSystemSettings", "c", "getSupportsNativePrompt", "()Z", "supportsNativePrompt", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.p */
/* compiled from: NotificationPermissionController.kt */
public final class C5306p implements PermissionsActivity.C5165c {

    /* renamed from: a */
    public static final Set<OneSignal.C5141h0> f26498a = new HashSet();

    /* renamed from: b */
    public static boolean f26499b;

    /* renamed from: c */
    public static final boolean f26500c;

    /* renamed from: d */
    public static final C5306p f26501d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"com/onesignal/p$a", "Lze$a;", "Lr37;", "a", "b", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.p$a */
    /* compiled from: NotificationPermissionController.kt */
    public static final class C5307a implements C6765ze.C6766a {

        /* renamed from: a */
        public final /* synthetic */ Activity f26502a;

        public C5307a(Activity activity) {
            this.f26502a = activity;
        }

        /* renamed from: a */
        public void mo38923a() {
            t44.f34111a.mo47979a(this.f26502a);
            C5306p.f26499b = true;
        }

        /* renamed from: b */
        public void mo38924b() {
            C5306p.f26501d.mo39055e(false);
        }
    }

    static {
        boolean z;
        C5306p pVar = new C5306p();
        f26501d = pVar;
        PermissionsActivity.m40505e("NOTIFICATION", pVar);
        if (Build.VERSION.SDK_INT <= 32 || OSUtils.m40283o(OneSignal.f26030e) <= 32) {
            z = false;
        } else {
            z = true;
        }
        f26500c = z;
    }

    /* renamed from: a */
    public void mo38610a() {
        OneSignal.m40405j1();
        mo39055e(true);
    }

    /* renamed from: b */
    public void mo38611b(boolean z) {
        boolean z2;
        if (z) {
            z2 = mo39059i();
        } else {
            z2 = false;
        }
        if (!z2) {
            mo39055e(false);
        }
    }

    /* renamed from: e */
    public final void mo39055e(boolean z) {
        for (OneSignal.C5141h0 a : f26498a) {
            a.mo38582a(z);
        }
        f26498a.clear();
    }

    /* renamed from: f */
    public final boolean mo39056f() {
        return OSUtils.m40274a(OneSignal.f26030e);
    }

    /* renamed from: g */
    public final void mo39057g() {
        if (f26499b) {
            f26499b = false;
            mo39055e(mo39056f());
        }
    }

    /* renamed from: h */
    public final void mo39058h(boolean z, OneSignal.C5141h0 h0Var) {
        if (h0Var != null) {
            f26498a.add(h0Var);
        }
        if (mo39056f()) {
            mo39055e(true);
        } else if (f26500c) {
            PermissionsActivity.m40506i(z, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", C5306p.class);
        } else if (z) {
            mo39059i();
        } else {
            mo39055e(false);
        }
    }

    /* renamed from: i */
    public final boolean mo39059i() {
        Activity Q = OneSignal.m40352Q();
        if (Q == null) {
            return false;
        }
        vx2.m53590f(Q, "OneSignal.getCurrentActivity() ?: return false");
        C6765ze zeVar = C6765ze.f36124a;
        String string = Q.getString(z45.notification_permission_name_for_title);
        vx2.m53590f(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = Q.getString(z45.notification_permission_settings_message);
        vx2.m53590f(string2, "activity.getString(R.str…mission_settings_message)");
        zeVar.mo49824a(Q, string, string2, new C5307a(Q));
        return true;
    }
}
