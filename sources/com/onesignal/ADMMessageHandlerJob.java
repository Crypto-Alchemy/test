package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.C5270k;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\u0011"}, mo44877d2 = {"Lcom/onesignal/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lr37;", "onMessage", "", "newRegistrationId", "onRegistered", "registrationId", "onUnregistered", "error", "onRegistrationError", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: ADMMessageHandlerJob.kt */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"com/onesignal/ADMMessageHandlerJob$a", "Lcom/onesignal/k$e;", "Lcom/onesignal/k$f;", "processedResult", "Lr37;", "a", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.ADMMessageHandlerJob$a */
    /* compiled from: ADMMessageHandlerJob.kt */
    public static final class C5093a implements C5270k.C5275e {

        /* renamed from: a */
        public final /* synthetic */ Bundle f25854a;

        /* renamed from: b */
        public final /* synthetic */ Context f25855b;

        public C5093a(Bundle bundle, Context context) {
            this.f25854a = bundle;
            this.f25855b = context;
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
            if (fVar == null || !fVar.mo38943c()) {
                JSONObject a = C5270k.m40994a(this.f25854a);
                vx2.m53590f(a, "NotificationBundleProces…undleAsJSONObject(bundle)");
                C5211d0 d0Var = new C5211d0(a);
                md4 md4 = new md4(this.f25855b);
                md4.mo45759q(a);
                md4.mo45757o(this.f25855b);
                md4.mo45760r(d0Var);
                C5270k.m41004k(md4, true);
            }
        }
    }

    public void onMessage(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        C5270k.m41001h(context, bundle, new C5093a(bundle, context));
    }

    public void onRegistered(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "ADM registration ID: " + str);
        C5204c1.m40669c(str);
    }

    public void onRegistrationError(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.m40376a(log_level, "ADM:onRegistrationError: " + str);
        if (vx2.m53586b("INVALID_SENDER", str)) {
            OneSignal.m40376a(log_level, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C5204c1.m40669c((String) null);
    }

    public void onUnregistered(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "ADM:onUnregistered: " + str);
    }
}
