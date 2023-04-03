package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;

@ii1
public class AnimatedFactoryV2Impl implements C2475hk {

    /* renamed from: a */
    public final xo4 f9585a;

    /* renamed from: b */
    public final yu1 f9586b;

    /* renamed from: c */
    public final nu0<f80, kh0> f9587c;

    /* renamed from: d */
    public final boolean f9588d;

    /* renamed from: e */
    public C2840mk f9589e;

    /* renamed from: f */
    public C2297fk f9590f;

    /* renamed from: g */
    public C2388gk f9591g;

    /* renamed from: h */
    public lj1 f9592h;

    /* renamed from: i */
    public ow5 f9593i;

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    public class C1937a implements nq2 {
        public C1937a() {
        }

        /* renamed from: a */
        public kh0 mo13314a(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
            return AnimatedFactoryV2Impl.this.mo13313k().mo23206b(gp1, lq2, lq2.f14646h);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    public class C1938b implements nq2 {
        public C1938b() {
        }

        /* renamed from: a */
        public kh0 mo13314a(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
            return AnimatedFactoryV2Impl.this.mo13313k().mo23205a(gp1, lq2, lq2.f14646h);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    public class C1939c implements td6<Integer> {
        public C1939c() {
        }

        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$d */
    public class C1940d implements td6<Integer> {
        public C1940d() {
        }

        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$e */
    public class C1941e implements C2297fk {
        public C1941e() {
        }

        /* renamed from: a */
        public C1637bk mo13317a(C3078pk pkVar, Rect rect) {
            return new C2232ek(AnimatedFactoryV2Impl.this.mo13312j(), pkVar, rect, AnimatedFactoryV2Impl.this.f9588d);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$f */
    public class C1942f implements C2297fk {
        public C1942f() {
        }

        /* renamed from: a */
        public C1637bk mo13317a(C3078pk pkVar, Rect rect) {
            return new C2232ek(AnimatedFactoryV2Impl.this.mo13312j(), pkVar, rect, AnimatedFactoryV2Impl.this.f9588d);
        }
    }

    @ii1
    public AnimatedFactoryV2Impl(xo4 xo4, yu1 yu1, nu0<f80, kh0> nu0, boolean z, ow5 ow5) {
        this.f9585a = xo4;
        this.f9586b = yu1;
        this.f9587c = nu0;
        this.f9588d = z;
        this.f9593i = ow5;
    }

    /* renamed from: a */
    public lj1 mo13306a(Context context) {
        if (this.f9592h == null) {
            this.f9592h = mo13310h();
        }
        return this.f9592h;
    }

    /* renamed from: b */
    public nq2 mo13307b() {
        return new C1938b();
    }

    /* renamed from: c */
    public nq2 mo13308c() {
        return new C1937a();
    }

    /* renamed from: g */
    public final C2840mk mo13309g() {
        return new C2903nk(new C1942f(), this.f9585a);
    }

    /* renamed from: h */
    public final ix1 mo13310h() {
        C1939c cVar = new C1939c();
        ExecutorService executorService = this.f9593i;
        if (executorService == null) {
            executorService = new v91(this.f9586b.mo27974d());
        }
        C1940d dVar = new C1940d();
        td6<Boolean> td6 = ud6.f18435b;
        return new ix1(mo13311i(), j37.m19948g(), executorService, RealtimeSinceBootClock.get(), this.f9585a, this.f9587c, cVar, dVar, td6);
    }

    /* renamed from: i */
    public final C2297fk mo13311i() {
        if (this.f9590f == null) {
            this.f9590f = new C1941e();
        }
        return this.f9590f;
    }

    /* renamed from: j */
    public final C2388gk mo13312j() {
        if (this.f9591g == null) {
            this.f9591g = new C2388gk();
        }
        return this.f9591g;
    }

    /* renamed from: k */
    public final C2840mk mo13313k() {
        if (this.f9589e == null) {
            this.f9589e = mo13309g();
        }
        return this.f9589e;
    }
}
