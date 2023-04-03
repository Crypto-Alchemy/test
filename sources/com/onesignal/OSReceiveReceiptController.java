package com.onesignal;

import android.content.Context;
import androidx.work.C1519b;
import androidx.work.C1521c;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import p000.nq0;

public class OSReceiveReceiptController {

    /* renamed from: d */
    public static OSReceiveReceiptController f25974d;

    /* renamed from: a */
    public int f25975a = 0;

    /* renamed from: b */
    public int f25976b = 25;

    /* renamed from: c */
    public final C5305o0 f25977c = OneSignal.m40407k0();

    public static class ReceiveReceiptWorker extends Worker {

        /* renamed from: com.onesignal.OSReceiveReceiptController$ReceiveReceiptWorker$a */
        public class C5124a extends C5355z0.C5362g {

            /* renamed from: a */
            public final /* synthetic */ String f25978a;

            public C5124a(String str) {
                this.f25978a = str;
            }

            /* renamed from: a */
            public void mo38414a(int i, String str, Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.m40376a(log_level, "Receive receipt failed with statusCode: " + i + " response: " + str);
            }

            /* renamed from: b */
            public void mo38415b(String str) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40376a(log_level, "Receive receipt sent for notificationID: " + this.f25978a);
            }
        }

        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* renamed from: r */
        public ListenableWorker.C1509a mo10897r() {
            mo38535s(mo10872g().mo10927l("os_notification_id"));
            return ListenableWorker.C1509a.m10434c();
        }

        /* renamed from: s */
        public void mo38535s(String str) {
            String str2;
            String str3 = OneSignal.f26034g;
            if (str3 == null || str3.isEmpty()) {
                str2 = OneSignal.m40419o0();
            } else {
                str2 = OneSignal.f26034g;
            }
            String str4 = str2;
            String z0 = OneSignal.m40452z0();
            Integer num = null;
            C5295n0 n0Var = new C5295n0();
            try {
                num = Integer.valueOf(new OSUtils().mo38560e());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Integer num2 = num;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "ReceiveReceiptWorker: Device Type is: " + num2);
            n0Var.mo38994a(str4, z0, num2, str, new C5124a(str));
        }
    }

    /* renamed from: c */
    public static synchronized OSReceiveReceiptController m40236c() {
        OSReceiveReceiptController oSReceiveReceiptController;
        synchronized (OSReceiveReceiptController.class) {
            if (f25974d == null) {
                f25974d = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = f25974d;
        }
        return oSReceiveReceiptController;
    }

    /* renamed from: a */
    public void mo38533a(Context context, String str) {
        if (!this.f25977c.mo39044j()) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int j = OSUtils.m40278j(this.f25975a, this.f25976b);
        C1519b a = new C1519b.C1520a().mo10937h("os_notification_id", str).mo10930a();
        nq0 b = mo38534b();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + j + " seconds");
        mm7 a2 = te4.m52273a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_receive_receipt");
        a2.mo23238d(sb.toString(), ExistingWorkPolicy.KEEP, (C1521c) ((C1521c.C1522a) ((C1521c.C1522a) ((C1521c.C1522a) new C1521c.C1522a(ReceiveReceiptWorker.class).mo10947e(b)).mo10948f((long) j, TimeUnit.SECONDS)).mo10949g(a)).mo10946b());
    }

    /* renamed from: b */
    public nq0 mo38534b() {
        return new nq0.C2917a().mo23778b(NetworkType.CONNECTED).mo23777a();
    }
}
