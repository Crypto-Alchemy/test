package p000;

import java.util.concurrent.Executor;

/* renamed from: xp */
/* compiled from: ArchTaskExecutor */
public class C3634xp extends cm6 {

    /* renamed from: c */
    public static volatile C3634xp f19943c;

    /* renamed from: d */
    public static final Executor f19944d = new C3635a();

    /* renamed from: e */
    public static final Executor f19945e = new C3636b();

    /* renamed from: a */
    public cm6 f19946a;

    /* renamed from: b */
    public cm6 f19947b;

    /* renamed from: xp$a */
    /* compiled from: ArchTaskExecutor */
    public static class C3635a implements Executor {
        public void execute(Runnable runnable) {
            C3634xp.m30269f().mo135d(runnable);
        }
    }

    /* renamed from: xp$b */
    /* compiled from: ArchTaskExecutor */
    public static class C3636b implements Executor {
        public void execute(Runnable runnable) {
            C3634xp.m30269f().mo133a(runnable);
        }
    }

    public C3634xp() {
        aa1 aa1 = new aa1();
        this.f19947b = aa1;
        this.f19946a = aa1;
    }

    /* renamed from: e */
    public static Executor m30268e() {
        return f19945e;
    }

    /* renamed from: f */
    public static C3634xp m30269f() {
        if (f19943c != null) {
            return f19943c;
        }
        synchronized (C3634xp.class) {
            if (f19943c == null) {
                f19943c = new C3634xp();
            }
        }
        return f19943c;
    }

    /* renamed from: a */
    public void mo133a(Runnable runnable) {
        this.f19946a.mo133a(runnable);
    }

    /* renamed from: c */
    public boolean mo134c() {
        return this.f19946a.mo134c();
    }

    /* renamed from: d */
    public void mo135d(Runnable runnable) {
        this.f19946a.mo135d(runnable);
    }
}
