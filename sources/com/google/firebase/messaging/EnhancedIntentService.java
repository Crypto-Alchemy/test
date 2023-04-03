package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.C4811f;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: a */
    public final ExecutorService f25390a = nz1.m49102c();

    /* renamed from: d */
    public Binder f25391d;

    /* renamed from: e */
    public final Object f25392e = new Object();

    /* renamed from: g */
    public int f25393g;

    /* renamed from: k */
    public int f25394k = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class C4799a implements C4811f.C4812a {
        public C4799a() {
        }

        /* renamed from: a */
        public tl6<Void> mo36207a(Intent intent) {
            return EnhancedIntentService.this.mo36202h(intent);
        }
    }

    /* renamed from: b */
    public final void mo36196b(Intent intent) {
        if (intent != null) {
            cg7.m32986b(intent);
        }
        synchronized (this.f25392e) {
            int i = this.f25394k - 1;
            this.f25394k = i;
            if (i == 0) {
                mo36203i(this.f25393g);
            }
        }
    }

    /* renamed from: c */
    public Intent mo36197c(Intent intent) {
        return intent;
    }

    /* renamed from: d */
    public abstract void mo36198d(Intent intent);

    /* renamed from: e */
    public boolean mo36199e(Intent intent) {
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo36200f(Intent intent, tl6 tl6) {
        mo36196b(intent);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo36201g(Intent intent, xl6 xl6) {
        try {
            mo36198d(intent);
        } finally {
            xl6.mo49505c(null);
        }
    }

    /* renamed from: h */
    public final tl6<Void> mo36202h(Intent intent) {
        if (mo36199e(intent)) {
            return jm6.m46619e(null);
        }
        xl6 xl6 = new xl6();
        this.f25390a.execute(new jq1(this, intent, xl6));
        return xl6.mo49503a();
    }

    /* renamed from: i */
    public boolean mo36203i(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.f25391d == null) {
            this.f25391d = new C4811f(new C4799a());
        }
        return this.f25391d;
    }

    public void onDestroy() {
        this.f25390a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f25392e) {
            this.f25393g = i2;
            this.f25394k++;
        }
        Intent c = mo36197c(intent);
        if (c == null) {
            mo36196b(intent);
            return 2;
        }
        tl6<Void> h = mo36202h(c);
        if (h.mo48144o()) {
            mo36196b(intent);
            return 2;
        }
        h.mo48132c(kq1.f31000a, new lq1(this, intent));
        return 3;
    }
}
