package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.onesignal.C5217e;
import com.onesignal.C5270k;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0003¨\u0006\u0013"}, mo44877d2 = {"Led4;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "", "c", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "jsonData", "b", "payload", "", "a", "d", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ed4 */
/* compiled from: OSInAppMessagePreviewHandler.kt */
public final class ed4 {

    /* renamed from: a */
    public static final ed4 f28579a = new ed4();

    /* renamed from: a */
    public static final String m43928a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        vx2.m53591g(jSONObject, "payload");
        try {
            JSONObject b = C5270k.m40995b(jSONObject);
            vx2.m53590f(b, "NotificationBundleProces…CustomJSONObject(payload)");
            if (b.has("a") && (optJSONObject = b.optJSONObject("a")) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m43929b(Activity activity, JSONObject jSONObject) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(jSONObject, "jsonData");
        String a = m43928a(jSONObject);
        if (a == null) {
            return false;
        }
        OneSignal.m40390e1(activity, new JSONArray().put(jSONObject));
        OneSignal.m40383c0().mo38478G(a);
        return true;
    }

    /* renamed from: c */
    public static final boolean m43930c(Context context, Bundle bundle) {
        JSONObject a = C5270k.m40994a(bundle);
        vx2.m53590f(a, "NotificationBundleProces…undleAsJSONObject(bundle)");
        String a2 = m43928a(a);
        if (a2 == null) {
            return false;
        }
        if (OneSignal.m40344N0()) {
            OneSignal.m40383c0().mo38478G(a2);
            return true;
        } else if (!f28579a.mo42270d()) {
            return true;
        } else {
            C5217e.m40795m(new md4(context, a));
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo42270d() {
        return true;
    }
}
