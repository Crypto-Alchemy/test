package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.C5270k;

public class FCMIntentJobService extends JobIntentService {

    /* renamed from: com.onesignal.FCMIntentJobService$a */
    public class C5096a implements C5270k.C5275e {
        public C5096a() {
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
        }
    }

    /* renamed from: j */
    public static void m40039j(Context context, Intent intent) {
        JobIntentService.m40084d(context, FCMIntentJobService.class, 123890, intent, false);
    }

    /* renamed from: g */
    public void mo38383g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            OneSignal.m40338L0(this);
            C5270k.m41001h(this, extras, new C5096a());
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo38384h() {
        return super.mo38384h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
