package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0011"}, mo44877d2 = {"Lcom/onesignal/f;", "", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "fcmPayload", "Lze2;", "a", "", "shouldOpenApp", "c", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "b", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.f */
/* compiled from: GenerateNotificationOpenIntentFromPushPayload.kt */
public final class C5223f {

    /* renamed from: a */
    public static final C5223f f26308a = new C5223f();

    /* renamed from: a */
    public final ze2 mo38813a(Context context, JSONObject jSONObject) {
        vx2.m53591g(context, "context");
        vx2.m53591g(jSONObject, "fcmPayload");
        od4 od4 = new od4(context, jSONObject);
        return new ze2(context, mo38814b(od4.mo46383b()), mo38815c(od4.mo46382a(), jSONObject));
    }

    /* renamed from: b */
    public final Intent mo38814b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.m40266O(uri);
    }

    /* renamed from: c */
    public final boolean mo38815c(boolean z, JSONObject jSONObject) {
        boolean z2;
        if (ed4.m43928a(jSONObject) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z | z2;
    }
}
