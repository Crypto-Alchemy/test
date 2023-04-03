package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.onesignal.C5197b1;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.f1 */
/* compiled from: PushRegistratorHMS */
public class C5229f1 implements C5197b1 {

    /* renamed from: a */
    public static boolean f26318a;

    /* renamed from: b */
    public static C5197b1.C5198a f26319b;

    /* renamed from: com.onesignal.f1$a */
    /* compiled from: PushRegistratorHMS */
    public class C5230a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f26320a;

        /* renamed from: d */
        public final /* synthetic */ C5197b1.C5198a f26321d;

        public C5230a(Context context, C5197b1.C5198a aVar) {
            this.f26320a = context;
            this.f26321d = aVar;
        }

        public void run() {
            int i;
            try {
                C5229f1.this.mo38822d(this.f26320a, this.f26321d);
            } catch (ApiException e) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "HMS ApiException getting Huawei push token!", e);
                if (e.getStatusCode() == 907135000) {
                    i = -26;
                } else {
                    i = -27;
                }
                this.f26321d.mo38585a((String) null, i);
            }
        }
    }

    /* renamed from: c */
    public static void m40837c() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a */
    public void mo38706a(Context context, String str, C5197b1.C5198a aVar) {
        f26319b = aVar;
        new Thread(new C5230a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo38822d(android.content.Context r4, com.onesignal.C5197b1.C5198a r5) throws com.huawei.hms.common.ApiException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.onesignal.OSUtils.m40284p()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000f
            r4 = 0
            r0 = -28
            r5.mo38585a(r4, r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            return
        L_0x000f:
            com.huawei.agconnect.config.AGConnectServicesConfig r0 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "client/app_id"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0049 }
            com.huawei.hms.aaid.HmsInstanceId r4 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "HCM"
            java.lang.String r4 = r4.getToken(r0, r1)     // Catch:{ all -> 0x0049 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            com.onesignal.OneSignal$LOG_LEVEL r0 = com.onesignal.OneSignal.LOG_LEVEL.INFO     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "Device registered for HMS, push token = "
            r1.append(r2)     // Catch:{ all -> 0x0049 }
            r1.append(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0049 }
            com.onesignal.OneSignal.m40376a(r0, r1)     // Catch:{ all -> 0x0049 }
            r0 = 1
            r5.mo38585a(r4, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0044:
            r3.mo38823e(r5)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r3)
            return
        L_0x0049:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5229f1.mo38822d(android.content.Context, com.onesignal.b1$a):void");
    }

    /* renamed from: e */
    public final void mo38823e(C5197b1.C5198a aVar) {
        m40837c();
        if (!f26318a) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
            aVar.mo38585a((String) null, -25);
        }
    }
}
