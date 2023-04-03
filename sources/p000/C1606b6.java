package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.drawee.components.DraweeEventTracker;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.ab1;
import p000.lt0;
import p000.pf2;

/* renamed from: b6 */
/* compiled from: AbstractDraweeController */
public abstract class C1606b6<T, INFO> implements ak1, ab1.C0017a, pf2.C3053a {

    /* renamed from: x */
    public static final Map<String, Object> f7949x = ImmutableMap.m13301of("component_tag", "drawee");

    /* renamed from: y */
    public static final Map<String, Object> f7950y = ImmutableMap.m13302of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: z */
    public static final Class<?> f7951z = C1606b6.class;

    /* renamed from: a */
    public final DraweeEventTracker f7952a = DraweeEventTracker.m13352a();

    /* renamed from: b */
    public final ab1 f7953b;

    /* renamed from: c */
    public final Executor f7954c;

    /* renamed from: d */
    public rg5 f7955d;

    /* renamed from: e */
    public pf2 f7956e;

    /* renamed from: f */
    public nt0 f7957f;

    /* renamed from: g */
    public mt0<INFO> f7958g;

    /* renamed from: h */
    public f82<INFO> f7959h = new f82<>();

    /* renamed from: i */
    public al3 f7960i;

    /* renamed from: j */
    public qy5 f7961j;

    /* renamed from: k */
    public Drawable f7962k;

    /* renamed from: l */
    public String f7963l;

    /* renamed from: m */
    public Object f7964m;

    /* renamed from: n */
    public boolean f7965n;

    /* renamed from: o */
    public boolean f7966o;

    /* renamed from: p */
    public boolean f7967p;

    /* renamed from: q */
    public boolean f7968q;

    /* renamed from: r */
    public boolean f7969r;

    /* renamed from: s */
    public String f7970s;

    /* renamed from: t */
    public z11<T> f7971t;

    /* renamed from: u */
    public T f7972u;

    /* renamed from: v */
    public boolean f7973v = true;

    /* renamed from: w */
    public Drawable f7974w;

    /* renamed from: b6$a */
    /* compiled from: AbstractDraweeController */
    public class C1607a implements fh4 {
        public C1607a() {
        }

        /* renamed from: a */
        public void mo11414a() {
            C1606b6 b6Var = C1606b6.this;
            al3 al3 = b6Var.f7960i;
            if (al3 != null) {
                al3.mo365b(b6Var.f7963l);
            }
        }

        /* renamed from: b */
        public void mo11415b() {
        }

        /* renamed from: c */
        public void mo11416c() {
            C1606b6 b6Var = C1606b6.this;
            al3 al3 = b6Var.f7960i;
            if (al3 != null) {
                al3.mo364a(b6Var.f7963l);
            }
        }
    }

    /* renamed from: b6$b */
    /* compiled from: AbstractDraweeController */
    public class C1608b extends C3102py<T> {

        /* renamed from: a */
        public final /* synthetic */ String f7976a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7977b;

        public C1608b(String str, boolean z) {
            this.f7976a = str;
            this.f7977b = z;
        }

        /* renamed from: a */
        public void mo11417a(z11<T> z11) {
            boolean b = z11.mo13190b();
            C1606b6.this.mo11377O(this.f7976a, z11, z11.mo13193d(), b);
        }

        /* renamed from: e */
        public void mo11418e(z11<T> z11) {
            C1606b6.this.mo11374L(this.f7976a, z11, z11.mo13191c(), true);
        }

        /* renamed from: f */
        public void mo11419f(z11<T> z11) {
            boolean b = z11.mo13190b();
            boolean f = z11.mo13195f();
            float d = z11.mo13193d();
            T result = z11.getResult();
            if (result != null) {
                C1606b6.this.mo11376N(this.f7976a, z11, result, d, b, this.f7977b, f);
            } else if (b) {
                C1606b6.this.mo11374L(this.f7976a, z11, new NullPointerException(), true);
            }
        }
    }

    /* renamed from: b6$c */
    /* compiled from: AbstractDraweeController */
    public static class C1609c<INFO> extends g82<INFO> {
        /* renamed from: j */
        public static <INFO> C1609c<INFO> m11127j(mt0<? super INFO> mt0, mt0<? super INFO> mt02) {
            if (lc2.m21369d()) {
                lc2.m21366a("AbstractDraweeController#createInternal");
            }
            C1609c<INFO> cVar = new C1609c<>();
            cVar.mo20422g(mt0);
            cVar.mo20422g(mt02);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            return cVar;
        }
    }

    public C1606b6(ab1 ab1, Executor executor, String str, Object obj) {
        this.f7953b = ab1;
        this.f7954c = executor;
        mo11366D(str, obj);
    }

    /* renamed from: A */
    public abstract INFO mo11363A(T t);

    /* renamed from: B */
    public Uri mo11364B() {
        return null;
    }

    /* renamed from: C */
    public rg5 mo11365C() {
        if (this.f7955d == null) {
            this.f7955d = new rg5();
        }
        return this.f7955d;
    }

    /* renamed from: D */
    public final synchronized void mo11366D(String str, Object obj) {
        ab1 ab1;
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeController#init");
        }
        this.f7952a.mo13216b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
        if (!this.f7973v && (ab1 = this.f7953b) != null) {
            ab1.mo138a(this);
        }
        this.f7965n = false;
        this.f7967p = false;
        mo11379Q();
        this.f7969r = false;
        rg5 rg5 = this.f7955d;
        if (rg5 != null) {
            rg5.mo25373a();
        }
        pf2 pf2 = this.f7956e;
        if (pf2 != null) {
            pf2.mo24548a();
            this.f7956e.mo24552f(this);
        }
        mt0<INFO> mt0 = this.f7958g;
        if (mt0 instanceof C1609c) {
            ((C1609c) mt0).mo20423h();
        } else {
            this.f7958g = null;
        }
        this.f7957f = null;
        qy5 qy5 = this.f7961j;
        if (qy5 != null) {
            qy5.reset();
            this.f7961j.mo20547f((Drawable) null);
            this.f7961j = null;
        }
        this.f7962k = null;
        if (oy1.m24426m(2)) {
            oy1.m24430q(f7951z, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f7963l, str);
        }
        this.f7963l = str;
        this.f7964m = obj;
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        if (this.f7960i != null) {
            mo11394e0();
        }
    }

    /* renamed from: E */
    public void mo11367E(String str, Object obj) {
        mo11366D(str, obj);
        this.f7973v = false;
    }

    /* renamed from: F */
    public final boolean mo11368F(String str, z11<T> z11) {
        if (z11 == null && this.f7971t == null) {
            return true;
        }
        if (!str.equals(this.f7963l) || z11 != this.f7971t || !this.f7966o) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final void mo11369G(String str, Throwable th) {
        if (oy1.m24426m(2)) {
            oy1.m24431r(f7951z, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f7963l, str, th);
        }
    }

    /* renamed from: H */
    public final void mo11370H(String str, T t) {
        if (oy1.m24426m(2)) {
            oy1.m24432s(f7951z, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f7963l, str, mo11412y(t), Integer.valueOf(mo11413z(t)));
        }
    }

    /* renamed from: I */
    public final lt0.C2787a mo11371I(z11<T> z11, INFO info2, Uri uri) {
        Map<String, Object> map;
        if (z11 == null) {
            map = null;
        } else {
            map = z11.getExtras();
        }
        return mo11372J(map, mo11373K(info2), uri);
    }

    /* renamed from: J */
    public final lt0.C2787a mo11372J(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        PointF pointF;
        String str;
        qy5 qy5 = this.f7961j;
        if (qy5 instanceof gf2) {
            gf2 gf2 = (gf2) qy5;
            String valueOf = String.valueOf(gf2.mo20554m());
            pointF = gf2.mo20553l();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return sv3.m27135a(f7949x, f7950y, map, mo11409v(), str, pointF, map2, mo11403q(), uri);
    }

    /* renamed from: K */
    public abstract Map<String, Object> mo11373K(INFO info2);

    /* renamed from: L */
    public final void mo11374L(String str, z11<T> z11, Throwable th, boolean z) {
        DraweeEventTracker.Event event;
        Drawable drawable;
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeController#onFailureInternal");
        }
        if (!mo11368F(str, z11)) {
            mo11369G("ignore_old_datasource @ onFailure", th);
            z11.close();
            if (lc2.m21369d()) {
                lc2.m21367b();
                return;
            }
            return;
        }
        DraweeEventTracker draweeEventTracker = this.f7952a;
        if (z) {
            event = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE;
        } else {
            event = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT;
        }
        draweeEventTracker.mo13216b(event);
        if (z) {
            mo11369G("final_failed @ onFailure", th);
            this.f7971t = null;
            this.f7968q = true;
            qy5 qy5 = this.f7961j;
            if (qy5 != null) {
                if (this.f7969r && (drawable = this.f7974w) != null) {
                    qy5.mo20546e(drawable, 1.0f, true);
                } else if (mo11396g0()) {
                    qy5.mo20543a(th);
                } else {
                    qy5.mo20544b(th);
                }
            }
            mo11382T(th, z11);
        } else {
            mo11369G("intermediate_failed @ onFailure", th);
            mo11383U(th);
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: M */
    public void mo11375M(String str, T t) {
    }

    /* renamed from: N */
    public final void mo11376N(String str, z11<T> z11, T t, float f, boolean z, boolean z2, boolean z3) {
        DraweeEventTracker.Event event;
        Drawable n;
        T t2;
        Drawable drawable;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("AbstractDraweeController#onNewResultInternal");
            }
            if (!mo11368F(str, z11)) {
                mo11370H("ignore_old_datasource @ onNewResult", t);
                mo11380R(t);
                z11.close();
                if (lc2.m21369d()) {
                    lc2.m21367b();
                    return;
                }
                return;
            }
            DraweeEventTracker draweeEventTracker = this.f7952a;
            if (z) {
                event = DraweeEventTracker.Event.ON_DATASOURCE_RESULT;
            } else {
                event = DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT;
            }
            draweeEventTracker.mo13216b(event);
            try {
                n = mo11400n(t);
                t2 = this.f7972u;
                drawable = this.f7974w;
                this.f7972u = t;
                this.f7974w = n;
                if (z) {
                    mo11370H("set_final_result @ onNewResult", t);
                    this.f7971t = null;
                    this.f7961j.mo20546e(n, 1.0f, z2);
                    mo11387Y(str, t, z11);
                } else if (z3) {
                    mo11370H("set_temporary_result @ onNewResult", t);
                    this.f7961j.mo20546e(n, 1.0f, z2);
                    mo11387Y(str, t, z11);
                } else {
                    mo11370H("set_intermediate_result @ onNewResult", t);
                    this.f7961j.mo20546e(n, f, z2);
                    mo11384V(str, t);
                }
                if (!(drawable == null || drawable == n)) {
                    mo11378P(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    mo11370H("release_previous_result @ onNewResult", t2);
                    mo11380R(t2);
                }
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            } catch (Exception e) {
                mo11370H("drawable_failed @ onNewResult", t);
                mo11380R(t);
                mo11374L(str, z11, e, z);
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        } catch (Throwable th) {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            throw th;
        }
    }

    /* renamed from: O */
    public final void mo11377O(String str, z11<T> z11, float f, boolean z) {
        if (!mo11368F(str, z11)) {
            mo11369G("ignore_old_datasource @ onProgress", (Throwable) null);
            z11.close();
        } else if (!z) {
            this.f7961j.mo20545c(f, false);
        }
    }

    /* renamed from: P */
    public abstract void mo11378P(Drawable drawable);

    /* renamed from: Q */
    public final void mo11379Q() {
        Map<String, Object> map;
        boolean z = this.f7966o;
        this.f7966o = false;
        this.f7968q = false;
        z11<T> z11 = this.f7971t;
        Map<String, Object> map2 = null;
        if (z11 != null) {
            map = z11.getExtras();
            this.f7971t.close();
            this.f7971t = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f7974w;
        if (drawable != null) {
            mo11378P(drawable);
        }
        if (this.f7970s != null) {
            this.f7970s = null;
        }
        this.f7974w = null;
        T t = this.f7972u;
        if (t != null) {
            Map<String, Object> K = mo11373K(mo11363A(t));
            mo11370H("release", this.f7972u);
            mo11380R(this.f7972u);
            this.f7972u = null;
            map2 = K;
        }
        if (z) {
            mo11385W(map, map2);
        }
    }

    /* renamed from: R */
    public abstract void mo11380R(T t);

    /* renamed from: S */
    public void mo11381S(lt0<INFO> lt0) {
        this.f7959h.mo19719i(lt0);
    }

    /* renamed from: T */
    public final void mo11382T(Throwable th, z11<T> z11) {
        lt0.C2787a I = mo11371I(z11, (Object) null, (Uri) null);
        mo11404r().mo20418b(this.f7963l, th);
        mo11405s().mo18889e(this.f7963l, th, I);
    }

    /* renamed from: U */
    public final void mo11383U(Throwable th) {
        mo11404r().mo20421f(this.f7963l, th);
        mo11405s().mo22966b(this.f7963l);
    }

    /* renamed from: V */
    public final void mo11384V(String str, T t) {
        Object A = mo11363A(t);
        mo11404r().mo20417a(str, A);
        mo11405s().mo18885a(str, A);
    }

    /* renamed from: W */
    public final void mo11385W(Map<String, Object> map, Map<String, Object> map2) {
        mo11404r().mo20419c(this.f7963l);
        mo11405s().mo18888d(this.f7963l, mo11372J(map, map2, (Uri) null));
    }

    /* renamed from: X */
    public void mo11386X(z11<T> z11, INFO info2) {
        mo11404r().mo20420e(this.f7963l, this.f7964m);
        mo11405s().mo18890f(this.f7963l, this.f7964m, mo11371I(z11, info2, mo11364B()));
    }

    /* renamed from: Y */
    public final void mo11387Y(String str, T t, z11<T> z11) {
        Object A = mo11363A(t);
        mo11404r().mo13247d(str, A, mo11401o());
        mo11405s().mo18886c(str, A, mo11371I(z11, A, (Uri) null));
    }

    /* renamed from: Z */
    public void mo11388Z(String str) {
        this.f7970s = str;
    }

    /* renamed from: a */
    public void mo140a() {
        this.f7952a.mo13216b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        rg5 rg5 = this.f7955d;
        if (rg5 != null) {
            rg5.mo25375c();
        }
        pf2 pf2 = this.f7956e;
        if (pf2 != null) {
            pf2.mo24551e();
        }
        qy5 qy5 = this.f7961j;
        if (qy5 != null) {
            qy5.reset();
        }
        mo11379Q();
    }

    /* renamed from: a0 */
    public void mo11389a0(Drawable drawable) {
        this.f7962k = drawable;
        qy5 qy5 = this.f7961j;
        if (qy5 != null) {
            qy5.mo20547f(drawable);
        }
    }

    /* renamed from: b */
    public boolean mo342b(MotionEvent motionEvent) {
        if (oy1.m24426m(2)) {
            oy1.m24430q(f7951z, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f7963l, motionEvent);
        }
        pf2 pf2 = this.f7956e;
        if (pf2 == null) {
            return false;
        }
        if (!pf2.mo24549b() && !mo11395f0()) {
            return false;
        }
        this.f7956e.mo24550d(motionEvent);
        return true;
    }

    /* renamed from: b0 */
    public void mo11390b0(nt0 nt0) {
        this.f7957f = nt0;
    }

    /* renamed from: c */
    public void mo343c(bk1 bk1) {
        DraweeEventTracker.Event event;
        if (oy1.m24426m(2)) {
            oy1.m24430q(f7951z, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f7963l, bk1);
        }
        DraweeEventTracker draweeEventTracker = this.f7952a;
        if (bk1 != null) {
            event = DraweeEventTracker.Event.ON_SET_HIERARCHY;
        } else {
            event = DraweeEventTracker.Event.ON_CLEAR_HIERARCHY;
        }
        draweeEventTracker.mo13216b(event);
        if (this.f7966o) {
            this.f7953b.mo138a(this);
            mo140a();
        }
        qy5 qy5 = this.f7961j;
        if (qy5 != null) {
            qy5.mo20547f((Drawable) null);
            this.f7961j = null;
        }
        if (bk1 != null) {
            au4.m10787b(Boolean.valueOf(bk1 instanceof qy5));
            qy5 qy52 = (qy5) bk1;
            this.f7961j = qy52;
            qy52.mo20547f(this.f7962k);
        }
        if (this.f7960i != null) {
            mo11394e0();
        }
    }

    /* renamed from: c0 */
    public void mo11391c0(pf2 pf2) {
        this.f7956e = pf2;
        if (pf2 != null) {
            pf2.mo24552f(this);
        }
    }

    /* renamed from: d */
    public boolean mo11392d() {
        if (oy1.m24426m(2)) {
            oy1.m24429p(f7951z, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f7963l);
        }
        if (!mo11396g0()) {
            return false;
        }
        this.f7955d.mo25374b();
        this.f7961j.reset();
        mo11397h0();
        return true;
    }

    /* renamed from: d0 */
    public void mo11393d0(boolean z) {
        this.f7969r = z;
    }

    /* renamed from: e */
    public void mo344e() {
        String str;
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeController#onAttach");
        }
        if (oy1.m24426m(2)) {
            Class<?> cls = f7951z;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f7963l;
            if (this.f7966o) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            oy1.m24430q(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f7952a.mo13216b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        au4.m10792g(this.f7961j);
        this.f7953b.mo138a(this);
        this.f7965n = true;
        if (!this.f7966o) {
            mo11397h0();
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: e0 */
    public final void mo11394e0() {
        qy5 qy5 = this.f7961j;
        if (qy5 instanceof gf2) {
            ((gf2) qy5).mo20561s(new C1607a());
        }
    }

    /* renamed from: f */
    public void mo345f() {
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeController#onDetach");
        }
        if (oy1.m24426m(2)) {
            oy1.m24429p(f7951z, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f7963l);
        }
        this.f7952a.mo13216b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f7965n = false;
        this.f7953b.mo139d(this);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: f0 */
    public boolean mo11395f0() {
        return mo11396g0();
    }

    /* renamed from: g */
    public bk1 mo346g() {
        return this.f7961j;
    }

    /* renamed from: g0 */
    public final boolean mo11396g0() {
        rg5 rg5;
        if (!this.f7968q || (rg5 = this.f7955d) == null || !rg5.mo25377e()) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public void mo11397h0() {
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractDraweeController#submitRequest");
        }
        Object p = mo11402p();
        if (p != null) {
            if (lc2.m21369d()) {
                lc2.m21366a("AbstractDraweeController#submitRequest->cache");
            }
            this.f7971t = null;
            this.f7966o = true;
            this.f7968q = false;
            this.f7952a.mo13216b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            mo11386X(this.f7971t, mo11363A(p));
            mo11375M(this.f7963l, p);
            mo11376N(this.f7963l, this.f7971t, p, 1.0f, true, true, true);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            if (lc2.m21369d()) {
                lc2.m21367b();
                return;
            }
            return;
        }
        this.f7952a.mo13216b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        this.f7961j.mo20545c(Utils.FLOAT_EPSILON, true);
        this.f7966o = true;
        this.f7968q = false;
        z11<T> u = mo11408u();
        this.f7971t = u;
        mo11386X(u, (Object) null);
        if (oy1.m24426m(2)) {
            oy1.m24430q(f7951z, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f7963l, Integer.valueOf(System.identityHashCode(this.f7971t)));
        }
        this.f7971t.mo13194e(new C1608b(this.f7963l, this.f7971t.mo13189a()), this.f7954c);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: l */
    public void mo11398l(mt0<? super INFO> mt0) {
        au4.m10792g(mt0);
        mt0<INFO> mt02 = this.f7958g;
        if (mt02 instanceof C1609c) {
            ((C1609c) mt02).mo20422g(mt0);
        } else if (mt02 != null) {
            this.f7958g = C1609c.m11127j(mt02, mt0);
        } else {
            this.f7958g = mt0;
        }
    }

    /* renamed from: m */
    public void mo11399m(lt0<INFO> lt0) {
        this.f7959h.mo19717g(lt0);
    }

    /* renamed from: n */
    public abstract Drawable mo11400n(T t);

    /* renamed from: o */
    public Animatable mo11401o() {
        Drawable drawable = this.f7974w;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* renamed from: p */
    public T mo11402p() {
        return null;
    }

    /* renamed from: q */
    public Object mo11403q() {
        return this.f7964m;
    }

    /* renamed from: r */
    public mt0<INFO> mo11404r() {
        mt0<INFO> mt0 = this.f7958g;
        if (mt0 == null) {
            return C2931ny.m23504g();
        }
        return mt0;
    }

    /* renamed from: s */
    public lt0<INFO> mo11405s() {
        return this.f7959h;
    }

    /* renamed from: t */
    public Drawable mo11406t() {
        return this.f7962k;
    }

    public String toString() {
        return hf4.m18862c(this).mo21159c("isAttached", this.f7965n).mo21159c("isRequestSubmitted", this.f7966o).mo21159c("hasFetchFailed", this.f7968q).mo21157a("fetchedImage", mo11413z(this.f7972u)).mo21158b("events", this.f7952a.toString()).toString();
    }

    /* renamed from: u */
    public abstract z11<T> mo11408u();

    /* renamed from: v */
    public final Rect mo11409v() {
        qy5 qy5 = this.f7961j;
        if (qy5 == null) {
            return null;
        }
        return qy5.getBounds();
    }

    /* renamed from: w */
    public pf2 mo11410w() {
        return this.f7956e;
    }

    /* renamed from: x */
    public String mo11411x() {
        return this.f7963l;
    }

    /* renamed from: y */
    public String mo11412y(T t) {
        if (t != null) {
            return t.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* renamed from: z */
    public int mo11413z(T t) {
        return System.identityHashCode(t);
    }
}
