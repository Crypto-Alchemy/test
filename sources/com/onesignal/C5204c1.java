package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.C5197b1;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.c1 */
/* compiled from: PushRegistratorADM */
public class C5204c1 implements C5197b1 {

    /* renamed from: a */
    public static C5197b1.C5198a f26216a = null;

    /* renamed from: b */
    public static boolean f26217b = false;

    /* renamed from: com.onesignal.c1$a */
    /* compiled from: PushRegistratorADM */
    public class C5205a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f26218a;

        /* renamed from: d */
        public final /* synthetic */ C5197b1.C5198a f26219d;

        public C5205a(Context context, C5197b1.C5198a aVar) {
            this.f26218a = context;
            this.f26219d = aVar;
        }

        public void run() {
            ADM adm = new ADM(this.f26218a);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40376a(log_level, "ADM Already registered with ID:" + registrationId);
                this.f26219d.mo38585a(registrationId, 1);
            }
            try {
                Thread.sleep(30000);
            } catch (InterruptedException unused) {
            }
            if (!C5204c1.f26217b) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                C5204c1.m40669c((String) null);
            }
        }
    }

    /* renamed from: c */
    public static void m40669c(String str) {
        C5197b1.C5198a aVar = f26216a;
        if (aVar != null) {
            f26217b = true;
            aVar.mo38585a(str, 1);
        }
    }

    /* renamed from: a */
    public void mo38706a(Context context, String str, C5197b1.C5198a aVar) {
        f26216a = aVar;
        new Thread(new C5205a(context, aVar)).start();
    }
}
