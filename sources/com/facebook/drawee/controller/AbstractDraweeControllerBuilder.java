package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements g26 {

    /* renamed from: r */
    public static final mt0<Object> f9518r = new C1931a();

    /* renamed from: s */
    public static final NullPointerException f9519s = new NullPointerException("No image request was specified!");

    /* renamed from: t */
    public static final AtomicLong f9520t = new AtomicLong();

    /* renamed from: a */
    public final Context f9521a;

    /* renamed from: b */
    public final Set<mt0> f9522b;

    /* renamed from: c */
    public final Set<lt0> f9523c;

    /* renamed from: d */
    public Object f9524d;

    /* renamed from: e */
    public REQUEST f9525e;

    /* renamed from: f */
    public REQUEST f9526f;

    /* renamed from: g */
    public REQUEST[] f9527g;

    /* renamed from: h */
    public boolean f9528h;

    /* renamed from: i */
    public td6<z11<IMAGE>> f9529i;

    /* renamed from: j */
    public mt0<? super INFO> f9530j;

    /* renamed from: k */
    public al3 f9531k;

    /* renamed from: l */
    public nt0 f9532l;

    /* renamed from: m */
    public boolean f9533m;

    /* renamed from: n */
    public boolean f9534n;

    /* renamed from: o */
    public boolean f9535o;

    /* renamed from: p */
    public String f9536p;

    /* renamed from: q */
    public ak1 f9537q;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    public static class C1931a extends C2931ny<Object> {
        /* renamed from: d */
        public void mo13247d(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    public class C1932b implements td6<z11<IMAGE>> {

        /* renamed from: a */
        public final /* synthetic */ ak1 f9539a;

        /* renamed from: b */
        public final /* synthetic */ String f9540b;

        /* renamed from: c */
        public final /* synthetic */ Object f9541c;

        /* renamed from: d */
        public final /* synthetic */ Object f9542d;

        /* renamed from: e */
        public final /* synthetic */ CacheLevel f9543e;

        public C1932b(ak1 ak1, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f9539a = ak1;
            this.f9540b = str;
            this.f9541c = obj;
            this.f9542d = obj2;
            this.f9543e = cacheLevel;
        }

        /* renamed from: a */
        public z11<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo13229i(this.f9539a, this.f9540b, this.f9541c, this.f9542d, this.f9543e);
        }

        public String toString() {
            return hf4.m18862c(this).mo21158b("request", this.f9541c.toString()).toString();
        }
    }

    public AbstractDraweeControllerBuilder(Context context, Set<mt0> set, Set<lt0> set2) {
        this.f9521a = context;
        this.f9522b = set;
        this.f9523c = set2;
        mo13239s();
    }

    /* renamed from: e */
    public static String m13354e() {
        return String.valueOf(f9520t.getAndIncrement());
    }

    /* renamed from: A */
    public BUILDER mo13218A(mt0<? super INFO> mt0) {
        this.f9530j = mt0;
        return mo13238r();
    }

    /* renamed from: B */
    public BUILDER mo13219B(REQUEST request) {
        this.f9525e = request;
        return mo13238r();
    }

    /* renamed from: C */
    public BUILDER mo13222b(ak1 ak1) {
        this.f9537q = ak1;
        return mo13238r();
    }

    /* renamed from: D */
    public void mo13221D() {
        boolean z;
        boolean z2 = false;
        if (this.f9527g == null || this.f9525e == null) {
            z = true;
        } else {
            z = false;
        }
        au4.m10795j(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f9529i == null || (this.f9527g == null && this.f9525e == null && this.f9526f == null)) {
            z2 = true;
        }
        au4.m10795j(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* renamed from: c */
    public C1606b6 build() {
        REQUEST request;
        mo13221D();
        if (this.f9525e == null && this.f9527g == null && (request = this.f9526f) != null) {
            this.f9525e = request;
            this.f9526f = null;
        }
        return mo13225d();
    }

    /* renamed from: d */
    public C1606b6 mo13225d() {
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeControllerBuilder#buildController");
        }
        C1606b6 w = mo13243w();
        w.mo11393d0(mo13237q());
        w.mo11388Z(mo13227g());
        w.mo11390b0(mo13228h());
        mo13242v(w);
        mo13240t(w);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return w;
    }

    /* renamed from: f */
    public Object mo13226f() {
        return this.f9524d;
    }

    /* renamed from: g */
    public String mo13227g() {
        return this.f9536p;
    }

    /* renamed from: h */
    public nt0 mo13228h() {
        return this.f9532l;
    }

    /* renamed from: i */
    public abstract z11<IMAGE> mo13229i(ak1 ak1, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    /* renamed from: j */
    public td6<z11<IMAGE>> mo13230j(ak1 ak1, String str, REQUEST request) {
        return mo13231k(ak1, str, request, CacheLevel.FULL_FETCH);
    }

    /* renamed from: k */
    public td6<z11<IMAGE>> mo13231k(ak1 ak1, String str, REQUEST request, CacheLevel cacheLevel) {
        return new C1932b(ak1, str, request, mo13226f(), cacheLevel);
    }

    /* renamed from: l */
    public td6<z11<IMAGE>> mo13232l(ak1 ak1, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST k : requestArr) {
                arrayList.add(mo13231k(ak1, str, k, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST j : requestArr) {
            arrayList.add(mo13230j(ak1, str, j));
        }
        return d32.m14681b(arrayList);
    }

    /* renamed from: m */
    public REQUEST[] mo13233m() {
        return this.f9527g;
    }

    /* renamed from: n */
    public REQUEST mo13234n() {
        return this.f9525e;
    }

    /* renamed from: o */
    public REQUEST mo13235o() {
        return this.f9526f;
    }

    /* renamed from: p */
    public ak1 mo13236p() {
        return this.f9537q;
    }

    /* renamed from: q */
    public boolean mo13237q() {
        return this.f9535o;
    }

    /* renamed from: r */
    public final BUILDER mo13238r() {
        return this;
    }

    /* renamed from: s */
    public final void mo13239s() {
        this.f9524d = null;
        this.f9525e = null;
        this.f9526f = null;
        this.f9527g = null;
        this.f9528h = true;
        this.f9530j = null;
        this.f9531k = null;
        this.f9532l = null;
        this.f9533m = false;
        this.f9534n = false;
        this.f9537q = null;
        this.f9536p = null;
    }

    /* renamed from: t */
    public void mo13240t(C1606b6 b6Var) {
        Set<mt0> set = this.f9522b;
        if (set != null) {
            for (mt0 l : set) {
                b6Var.mo11398l(l);
            }
        }
        Set<lt0> set2 = this.f9523c;
        if (set2 != null) {
            for (lt0 m : set2) {
                b6Var.mo11399m(m);
            }
        }
        mt0<? super INFO> mt0 = this.f9530j;
        if (mt0 != null) {
            b6Var.mo11398l(mt0);
        }
        if (this.f9534n) {
            b6Var.mo11398l(f9518r);
        }
    }

    /* renamed from: u */
    public void mo13241u(C1606b6 b6Var) {
        if (b6Var.mo11410w() == null) {
            b6Var.mo11391c0(pf2.m24858c(this.f9521a));
        }
    }

    /* renamed from: v */
    public void mo13242v(C1606b6 b6Var) {
        if (this.f9533m) {
            b6Var.mo11365C().mo25376d(this.f9533m);
            mo13241u(b6Var);
        }
    }

    /* renamed from: w */
    public abstract C1606b6 mo13243w();

    /* renamed from: x */
    public td6<z11<IMAGE>> mo13244x(ak1 ak1, String str) {
        td6<z11<IMAGE>> td6 = this.f9529i;
        if (td6 != null) {
            return td6;
        }
        td6<z11<IMAGE>> td62 = null;
        REQUEST request = this.f9525e;
        if (request != null) {
            td62 = mo13230j(ak1, str, request);
        } else {
            REQUEST[] requestArr = this.f9527g;
            if (requestArr != null) {
                td62 = mo13232l(ak1, str, requestArr, this.f9528h);
            }
        }
        if (!(td62 == null || this.f9526f == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(td62);
            arrayList.add(mo13230j(ak1, str, this.f9526f));
            td62 = ot2.m24042c(arrayList, false);
        }
        if (td62 == null) {
            return c21.m11691a(f9519s);
        }
        return td62;
    }

    /* renamed from: y */
    public BUILDER mo13245y(boolean z) {
        this.f9534n = z;
        return mo13238r();
    }

    /* renamed from: z */
    public BUILDER mo13246z(Object obj) {
        this.f9524d = obj;
        return mo13238r();
    }
}
