package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a */
    public Context f7469a;

    /* renamed from: d */
    public WorkerParameters f7470d;

    /* renamed from: e */
    public volatile boolean f7471e;

    /* renamed from: g */
    public boolean f7472g;

    /* renamed from: k */
    public boolean f7473k;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1509a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1510a extends C1509a {

            /* renamed from: a */
            public final C1519b f7474a;

            public C1510a() {
                this(C1519b.f7528c);
            }

            /* renamed from: e */
            public C1519b mo10881e() {
                return this.f7474a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1510a.class != obj.getClass()) {
                    return false;
                }
                return this.f7474a.equals(((C1510a) obj).f7474a);
            }

            public int hashCode() {
                return (C1510a.class.getName().hashCode() * 31) + this.f7474a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f7474a + '}';
            }

            public C1510a(C1519b bVar) {
                this.f7474a = bVar;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1511b extends C1509a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1511b.class != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return C1511b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1512c extends C1509a {

            /* renamed from: a */
            public final C1519b f7475a;

            public C1512c() {
                this(C1519b.f7528c);
            }

            /* renamed from: e */
            public C1519b mo10888e() {
                return this.f7475a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1512c.class != obj.getClass()) {
                    return false;
                }
                return this.f7475a.equals(((C1512c) obj).f7475a);
            }

            public int hashCode() {
                return (C1512c.class.getName().hashCode() * 31) + this.f7475a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f7475a + '}';
            }

            public C1512c(C1519b bVar) {
                this.f7475a = bVar;
            }
        }

        /* renamed from: a */
        public static C1509a m10432a() {
            return new C1510a();
        }

        /* renamed from: b */
        public static C1509a m10433b() {
            return new C1511b();
        }

        /* renamed from: c */
        public static C1509a m10434c() {
            return new C1512c();
        }

        /* renamed from: d */
        public static C1509a m10435d(C1519b bVar) {
            return new C1512c(bVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f7469a = context;
            this.f7470d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    /* renamed from: a */
    public final Context mo10869a() {
        return this.f7469a;
    }

    /* renamed from: c */
    public Executor mo10870c() {
        return this.f7470d.mo10899a();
    }

    /* renamed from: d */
    public hi3<w72> mo10850d() {
        ry5 t = ry5.m26468t();
        t.mo11045q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t;
    }

    /* renamed from: e */
    public final UUID mo10871e() {
        return this.f7470d.mo10901c();
    }

    /* renamed from: g */
    public final C1519b mo10872g() {
        return this.f7470d.mo10902d();
    }

    /* renamed from: h */
    public bm6 mo10873h() {
        return this.f7470d.mo10903e();
    }

    /* renamed from: i */
    public in7 mo10874i() {
        return this.f7470d.mo10904f();
    }

    /* renamed from: j */
    public boolean mo10875j() {
        return this.f7473k;
    }

    /* renamed from: k */
    public final boolean mo10876k() {
        return this.f7471e;
    }

    /* renamed from: l */
    public final boolean mo10877l() {
        return this.f7472g;
    }

    /* renamed from: m */
    public void mo10851m() {
    }

    /* renamed from: n */
    public void mo10878n(boolean z) {
        this.f7473k = z;
    }

    /* renamed from: o */
    public final void mo10879o() {
        this.f7472g = true;
    }

    /* renamed from: p */
    public abstract hi3<C1509a> mo10852p();

    /* renamed from: q */
    public final void mo10880q() {
        this.f7471e = true;
        mo10851m();
    }
}
