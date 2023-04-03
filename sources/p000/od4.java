package p000;

import android.content.Context;
import android.net.Uri;
import com.onesignal.C5243h0;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lod4;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "b", "Lorg/json/JSONObject;", "fcmPayload", "", "()Z", "shouldOpenApp", "Landroid/net/Uri;", "()Landroid/net/Uri;", "uri", "<init>", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: od4 */
/* compiled from: OSNotificationOpenBehaviorFromPushPayload.kt */
public final class od4 {

    /* renamed from: a */
    public final Context f32360a;

    /* renamed from: b */
    public final JSONObject f32361b;

    public od4(Context context, JSONObject jSONObject) {
        vx2.m53591g(context, "context");
        vx2.m53591g(jSONObject, "fcmPayload");
        this.f32360a = context;
        this.f32361b = jSONObject;
    }

    /* renamed from: a */
    public final boolean mo46382a() {
        if (!C5243h0.f26338a.mo38832a(this.f32360a) || mo46383b() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Uri mo46383b() {
        int i;
        boolean z;
        C5243h0 h0Var = C5243h0.f26338a;
        if (!h0Var.mo38832a(this.f32360a) || h0Var.mo38833b(this.f32360a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.f32361b.optString("custom"));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!vx2.m53586b(optString, "")) {
                vx2.m53590f(optString, "url");
                int length = optString.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (vx2.m53593i(optString.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                return Uri.parse(optString.subSequence(i2, length + 1).toString());
            }
        }
        return null;
    }
}
