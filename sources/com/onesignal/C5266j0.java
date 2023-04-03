package com.onesignal;

import com.onesignal.OneSignal;

/* renamed from: com.onesignal.j0 */
/* compiled from: OSNotificationReceivedEvent */
public class C5266j0 {

    /* renamed from: a */
    public final C5220e0 f26411a;

    /* renamed from: b */
    public final C5331t0 f26412b;

    /* renamed from: c */
    public final Runnable f26413c;

    /* renamed from: d */
    public final C5211d0 f26414d;

    /* renamed from: e */
    public boolean f26415e = false;

    /* renamed from: com.onesignal.j0$a */
    /* compiled from: OSNotificationReceivedEvent */
    public class C5267a implements Runnable {
        public C5267a() {
        }

        public void run() {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            C5266j0 j0Var = C5266j0.this;
            j0Var.mo38925b(j0Var.mo38926c());
        }
    }

    /* renamed from: com.onesignal.j0$b */
    /* compiled from: OSNotificationReceivedEvent */
    public class C5268b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5211d0 f26417a;

        public C5268b(C5211d0 d0Var) {
            this.f26417a = d0Var;
        }

        public void run() {
            C5266j0.this.mo38927e(this.f26417a);
        }
    }

    public C5266j0(C5220e0 e0Var, C5211d0 d0Var) {
        this.f26414d = d0Var;
        this.f26411a = e0Var;
        C5331t0 b = C5331t0.m41330b();
        this.f26412b = b;
        C5267a aVar = new C5267a();
        this.f26413c = aVar;
        b.mo39119c(25000, aVar);
    }

    /* renamed from: d */
    public static boolean m40981d() {
        return OSUtils.m40259H();
    }

    /* renamed from: b */
    public synchronized void mo38925b(C5211d0 d0Var) {
        this.f26412b.mo39118a(this.f26413c);
        if (this.f26415e) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f26415e = true;
        if (m40981d()) {
            new Thread(new C5268b(d0Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            mo38927e(d0Var);
        }
    }

    /* renamed from: c */
    public C5211d0 mo38926c() {
        return this.f26414d;
    }

    /* renamed from: e */
    public final void mo38927e(C5211d0 d0Var) {
        C5211d0 d0Var2;
        C5220e0 e0Var = this.f26411a;
        C5211d0 c = this.f26414d.mo38742c();
        if (d0Var != null) {
            d0Var2 = d0Var.mo38742c();
        } else {
            d0Var2 = null;
        }
        e0Var.mo38807f(c, d0Var2);
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f26415e + ", notification=" + this.f26414d + '}';
    }
}
