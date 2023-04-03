package com.onesignal;

import android.app.Activity;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import kotlin.Metadata;
import p000.C6765ze;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, mo44877d2 = {"Lcom/onesignal/j;", "Lcom/onesignal/PermissionsActivity$c;", "", "fallbackToSettings", "", "androidPermissionString", "Lr37;", "d", "a", "b", "Lcom/onesignal/OneSignal$PromptActionResult;", "result", "c", "e", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.j */
/* compiled from: LocationPermissionController.kt */
public final class C5264j implements PermissionsActivity.C5165c {

    /* renamed from: a */
    public static final C5264j f26409a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"com/onesignal/j$a", "Lze$a;", "Lr37;", "a", "b", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.j$a */
    /* compiled from: LocationPermissionController.kt */
    public static final class C5265a implements C6765ze.C6766a {

        /* renamed from: a */
        public final /* synthetic */ Activity f26410a;

        public C5265a(Activity activity) {
            this.f26410a = activity;
        }

        /* renamed from: a */
        public void mo38923a() {
            s44.f33711a.mo47628a(this.f26410a);
            LocationController.m40105n(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
        }

        /* renamed from: b */
        public void mo38924b() {
            LocationController.m40105n(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
        }
    }

    static {
        C5264j jVar = new C5264j();
        f26409a = jVar;
        PermissionsActivity.m40505e("LOCATION", jVar);
    }

    /* renamed from: a */
    public void mo38610a() {
        mo38920c(OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.m40107p();
    }

    /* renamed from: b */
    public void mo38611b(boolean z) {
        mo38920c(OneSignal.PromptActionResult.PERMISSION_DENIED);
        if (z) {
            mo38922e();
        }
        LocationController.m40096e();
    }

    /* renamed from: c */
    public final void mo38920c(OneSignal.PromptActionResult promptActionResult) {
        LocationController.m40105n(true, promptActionResult);
    }

    /* renamed from: d */
    public final void mo38921d(boolean z, String str) {
        vx2.m53591g(str, "androidPermissionString");
        PermissionsActivity.m40506i(z, "LOCATION", str, C5264j.class);
    }

    /* renamed from: e */
    public final void mo38922e() {
        Activity Q = OneSignal.m40352Q();
        if (Q != null) {
            vx2.m53590f(Q, "OneSignal.getCurrentActivity() ?: return");
            C6765ze zeVar = C6765ze.f36124a;
            String string = Q.getString(z45.location_permission_name_for_title);
            vx2.m53590f(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = Q.getString(z45.location_permission_settings_message);
            vx2.m53590f(string2, "activity.getString(R.str…mission_settings_message)");
            zeVar.mo49824a(Q, string, string2, new C5265a(Q));
        }
    }
}
