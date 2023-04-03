package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.a */
/* compiled from: Configuration */
public final class C1515a {

    /* renamed from: a */
    public final Executor f7501a;

    /* renamed from: b */
    public final Executor f7502b;

    /* renamed from: c */
    public final in7 f7503c;

    /* renamed from: d */
    public final zu2 f7504d;

    /* renamed from: e */
    public final li5 f7505e;

    /* renamed from: f */
    public final eu2 f7506f;

    /* renamed from: g */
    public final String f7507g;

    /* renamed from: h */
    public final int f7508h;

    /* renamed from: i */
    public final int f7509i;

    /* renamed from: j */
    public final int f7510j;

    /* renamed from: k */
    public final int f7511k;

    /* renamed from: l */
    public final boolean f7512l;

    /* renamed from: androidx.work.a$a */
    /* compiled from: Configuration */
    public class C1516a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f7513a = new AtomicInteger(0);

        /* renamed from: d */
        public final /* synthetic */ boolean f7514d;

        public C1516a(boolean z) {
            this.f7514d = z;
        }

        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f7514d) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f7513a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* compiled from: Configuration */
    public static final class C1517b {

        /* renamed from: a */
        public Executor f7516a;

        /* renamed from: b */
        public in7 f7517b;

        /* renamed from: c */
        public zu2 f7518c;

        /* renamed from: d */
        public Executor f7519d;

        /* renamed from: e */
        public li5 f7520e;

        /* renamed from: f */
        public eu2 f7521f;

        /* renamed from: g */
        public String f7522g;

        /* renamed from: h */
        public int f7523h = 4;

        /* renamed from: i */
        public int f7524i = 0;

        /* renamed from: j */
        public int f7525j = Integer.MAX_VALUE;

        /* renamed from: k */
        public int f7526k = 20;

        /* renamed from: a */
        public C1515a mo10919a() {
            return new C1515a(this);
        }
    }

    /* renamed from: androidx.work.a$c */
    /* compiled from: Configuration */
    public interface C1518c {
        /* renamed from: a */
        C1515a mo10920a();
    }

    public C1515a(C1517b bVar) {
        Executor executor = bVar.f7516a;
        if (executor == null) {
            this.f7501a = mo10905a(false);
        } else {
            this.f7501a = executor;
        }
        Executor executor2 = bVar.f7519d;
        if (executor2 == null) {
            this.f7512l = true;
            this.f7502b = mo10905a(true);
        } else {
            this.f7512l = false;
            this.f7502b = executor2;
        }
        in7 in7 = bVar.f7517b;
        if (in7 == null) {
            this.f7503c = in7.m19728c();
        } else {
            this.f7503c = in7;
        }
        zu2 zu2 = bVar.f7518c;
        if (zu2 == null) {
            this.f7504d = zu2.m31505c();
        } else {
            this.f7504d = zu2;
        }
        li5 li5 = bVar.f7520e;
        if (li5 == null) {
            this.f7505e = new m91();
        } else {
            this.f7505e = li5;
        }
        this.f7508h = bVar.f7523h;
        this.f7509i = bVar.f7524i;
        this.f7510j = bVar.f7525j;
        this.f7511k = bVar.f7526k;
        this.f7506f = bVar.f7521f;
        this.f7507g = bVar.f7522g;
    }

    /* renamed from: a */
    public final Executor mo10905a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), mo10906b(z));
    }

    /* renamed from: b */
    public final ThreadFactory mo10906b(boolean z) {
        return new C1516a(z);
    }

    /* renamed from: c */
    public String mo10907c() {
        return this.f7507g;
    }

    /* renamed from: d */
    public eu2 mo10908d() {
        return this.f7506f;
    }

    /* renamed from: e */
    public Executor mo10909e() {
        return this.f7501a;
    }

    /* renamed from: f */
    public zu2 mo10910f() {
        return this.f7504d;
    }

    /* renamed from: g */
    public int mo10911g() {
        return this.f7510j;
    }

    /* renamed from: h */
    public int mo10912h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f7511k / 2;
        }
        return this.f7511k;
    }

    /* renamed from: i */
    public int mo10913i() {
        return this.f7509i;
    }

    /* renamed from: j */
    public int mo10914j() {
        return this.f7508h;
    }

    /* renamed from: k */
    public li5 mo10915k() {
        return this.f7505e;
    }

    /* renamed from: l */
    public Executor mo10916l() {
        return this.f7502b;
    }

    /* renamed from: m */
    public in7 mo10917m() {
        return this.f7503c;
    }
}
