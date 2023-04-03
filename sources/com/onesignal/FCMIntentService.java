package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.C5270k;

public class FCMIntentService extends IntentService {

    /* renamed from: com.onesignal.FCMIntentService$a */
    public class C5097a implements C5270k.C5275e {

        /* renamed from: a */
        public final /* synthetic */ Intent f25861a;

        public C5097a(Intent intent) {
            this.f25861a = intent;
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
            WakefulBroadcastReceiver.m5018b(this.f25861a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            OneSignal.m40338L0(this);
            C5270k.m41001h(this, extras, new C5097a(intent));
        }
    }
}
