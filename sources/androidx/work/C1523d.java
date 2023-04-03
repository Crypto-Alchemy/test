package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.d */
/* compiled from: WorkRequest */
public abstract class C1523d {

    /* renamed from: a */
    public UUID f7531a;

    /* renamed from: b */
    public an7 f7532b;

    /* renamed from: c */
    public Set<String> f7533c;

    /* renamed from: androidx.work.d$a */
    /* compiled from: WorkRequest */
    public static abstract class C1524a<B extends C1524a<?, ?>, W extends C1523d> {

        /* renamed from: a */
        public boolean f7534a = false;

        /* renamed from: b */
        public UUID f7535b = UUID.randomUUID();

        /* renamed from: c */
        public an7 f7536c;

        /* renamed from: d */
        public Set<String> f7537d = new HashSet();

        /* renamed from: e */
        public Class<? extends ListenableWorker> f7538e;

        public C1524a(Class<? extends ListenableWorker> cls) {
            this.f7538e = cls;
            this.f7536c = new an7(this.f7535b.toString(), cls.getName());
            mo10945a(cls.getName());
        }

        /* renamed from: a */
        public final B mo10945a(String str) {
            this.f7537d.add(str);
            return mo10939d();
        }

        /* renamed from: b */
        public final W mo10946b() {
            boolean z;
            W c = mo10938c();
            nq0 nq0 = this.f7536c.f213j;
            if ((Build.VERSION.SDK_INT < 24 || !nq0.mo23762e()) && !nq0.mo23764f() && !nq0.mo23765g() && !nq0.mo23766h()) {
                z = false;
            } else {
                z = true;
            }
            an7 an7 = this.f7536c;
            if (an7.f220q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (an7.f210g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f7535b = UUID.randomUUID();
            an7 an72 = new an7(this.f7536c);
            this.f7536c = an72;
            an72.f204a = this.f7535b.toString();
            return c;
        }

        /* renamed from: c */
        public abstract W mo10938c();

        /* renamed from: d */
        public abstract B mo10939d();

        /* renamed from: e */
        public final B mo10947e(nq0 nq0) {
            this.f7536c.f213j = nq0;
            return mo10939d();
        }

        /* renamed from: f */
        public B mo10948f(long j, TimeUnit timeUnit) {
            this.f7536c.f210g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f7536c.f210g) {
                return mo10939d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: g */
        public final B mo10949g(C1519b bVar) {
            this.f7536c.f208e = bVar;
            return mo10939d();
        }
    }

    public C1523d(UUID uuid, an7 an7, Set<String> set) {
        this.f7531a = uuid;
        this.f7532b = an7;
        this.f7533c = set;
    }

    /* renamed from: a */
    public String mo10942a() {
        return this.f7531a.toString();
    }

    /* renamed from: b */
    public Set<String> mo10943b() {
        return this.f7533c;
    }

    /* renamed from: c */
    public an7 mo10944c() {
        return this.f7532b;
    }
}
