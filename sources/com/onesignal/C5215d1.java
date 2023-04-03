package com.onesignal;

import android.content.Context;
import com.onesignal.C5197b1;
import com.onesignal.OneSignal;
import java.io.IOException;

/* renamed from: com.onesignal.d1 */
/* compiled from: PushRegistratorAbstractGoogle */
public abstract class C5215d1 implements C5197b1 {

    /* renamed from: d */
    public static int f26284d = 5;

    /* renamed from: e */
    public static int f26285e = 10000;

    /* renamed from: a */
    public C5197b1.C5198a f26286a;

    /* renamed from: b */
    public Thread f26287b;

    /* renamed from: c */
    public boolean f26288c;

    /* renamed from: com.onesignal.d1$a */
    /* compiled from: PushRegistratorAbstractGoogle */
    public class C5216a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26289a;

        public C5216a(String str) {
            this.f26289a = str;
        }

        public void run() {
            int i = 0;
            while (i < C5215d1.f26284d && !C5215d1.this.mo38795e(this.f26289a, i)) {
                i++;
                OSUtils.m40273V(C5215d1.f26285e * i);
            }
        }
    }

    /* renamed from: j */
    public static int m40762j(Throwable th) {
        String l = OSUtils.m40280l(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(l)) {
            return -9;
        }
        if ("AUTHENTICATION_FAILED".equals(l)) {
            return -29;
        }
        return -11;
    }

    /* renamed from: a */
    public void mo38706a(Context context, String str, C5197b1.C5198a aVar) {
        this.f26286a = aVar;
        if (mo38799i(str, aVar)) {
            mo38798h(str);
        }
    }

    /* renamed from: e */
    public final boolean mo38795e(String str, int i) {
        boolean z;
        try {
            String g = mo38797g(str);
            OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "Device registered, push token = " + g);
            this.f26286a.mo38585a(g, 1);
            return true;
        } catch (IOException e) {
            int j = m40762j(e);
            String l = OSUtils.m40280l(e);
            if ("SERVICE_NOT_AVAILABLE".equals(l) || "AUTHENTICATION_FAILED".equals(l)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Exception exc = new Exception(e);
                if (i >= f26284d - 1) {
                    OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Retry count of " + f26284d + " exceed! Could not get a " + mo38796f() + " Token.", exc);
                } else {
                    OneSignal.m40379b(OneSignal.LOG_LEVEL.INFO, "'Google Play services' returned " + l + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        this.f26286a.mo38585a((String) null, j);
                        this.f26288c = true;
                        return true;
                    }
                }
                return false;
            }
            Exception exc2 = new Exception(e);
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error Getting " + mo38796f() + " Token", exc2);
            if (!this.f26288c) {
                this.f26286a.mo38585a((String) null, j);
            }
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int j2 = m40762j(th);
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Unknown error getting " + mo38796f() + " Token", exc3);
            this.f26286a.mo38585a((String) null, j2);
            return true;
        }
    }

    /* renamed from: f */
    public abstract String mo38796f();

    /* renamed from: g */
    public abstract String mo38797g(String str) throws Throwable;

    /* renamed from: h */
    public final void mo38798h(String str) {
        try {
            if (OSUtils.m40255D()) {
                mo38800k(str);
                return;
            }
            C5231g.m40844d();
            OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.f26286a.mo38585a((String) null, -7);
        } catch (Throwable th) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.m40379b(log_level, "Could not register with " + mo38796f() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f26286a.mo38585a((String) null, -8);
        }
    }

    /* renamed from: i */
    public final boolean mo38799i(String str, C5197b1.C5198a aVar) {
        boolean z;
        try {
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.mo38585a((String) null, -6);
        return false;
    }

    /* renamed from: k */
    public final synchronized void mo38800k(String str) {
        Thread thread = this.f26287b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new C5216a(str));
            this.f26287b = thread2;
            thread2.start();
        }
    }
}
