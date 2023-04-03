package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.C5270k;
import com.onesignal.OneSignal;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    /* renamed from: com.onesignal.ADMMessageHandler$a */
    public class C5092a implements C5270k.C5275e {

        /* renamed from: a */
        public final /* synthetic */ Bundle f25851a;

        /* renamed from: b */
        public final /* synthetic */ Context f25852b;

        public C5092a(Bundle bundle, Context context) {
            this.f25851a = bundle;
            this.f25852b = context;
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
            if (!fVar.mo38943c()) {
                JSONObject a = C5270k.m40994a(this.f25851a);
                C5211d0 d0Var = new C5211d0(a);
                md4 md4 = new md4(this.f25852b);
                md4.mo45759q(a);
                md4.mo45757o(this.f25852b);
                md4.mo45760r(d0Var);
                C5270k.m41004k(md4, true);
            }
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        C5270k.m41001h(applicationContext, extras, new C5092a(extras, applicationContext));
    }

    public void onRegistered(String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "ADM registration ID: " + str);
        C5204c1.m40669c(str);
    }

    public void onRegistrationError(String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.m40376a(log_level, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            OneSignal.m40376a(log_level, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C5204c1.m40669c((String) null);
    }

    public void onUnregistered(String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "ADM:onUnregistered: " + str);
    }
}
