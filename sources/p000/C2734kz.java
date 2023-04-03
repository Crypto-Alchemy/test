package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p000.C2734kz;

/* renamed from: kz */
/* compiled from: BaseRequestOptions */
public abstract class C2734kz<T extends C2734kz<T>> implements Cloneable {

    /* renamed from: A */
    public int f14354A = -1;

    /* renamed from: B */
    public int f14355B = -1;

    /* renamed from: C */
    public z93 f14356C = zo1.m31408c();

    /* renamed from: H */
    public boolean f14357H;

    /* renamed from: I */
    public boolean f14358I = true;

    /* renamed from: L */
    public Drawable f14359L;

    /* renamed from: M */
    public int f14360M;

    /* renamed from: P */
    public xi4 f14361P = new xi4();

    /* renamed from: Q */
    public Map<Class<?>, mw6<?>> f14362Q = new k80();

    /* renamed from: U */
    public Class<?> f14363U = Object.class;

    /* renamed from: X */
    public boolean f14364X;

    /* renamed from: Y */
    public Resources.Theme f14365Y;

    /* renamed from: Z */
    public boolean f14366Z;

    /* renamed from: a */
    public int f14367a;

    /* renamed from: b1 */
    public boolean f14368b1;

    /* renamed from: d */
    public float f14369d = 1.0f;

    /* renamed from: e */
    public xg1 f14370e = xg1.f19831e;

    /* renamed from: e0 */
    public boolean f14371e0;

    /* renamed from: g */
    public Priority f14372g = Priority.NORMAL;

    /* renamed from: k */
    public Drawable f14373k;

    /* renamed from: k0 */
    public boolean f14374k0;

    /* renamed from: r */
    public int f14375r;

    /* renamed from: s */
    public Drawable f14376s;

    /* renamed from: v0 */
    public boolean f14377v0 = true;

    /* renamed from: x */
    public int f14378x;

    /* renamed from: y */
    public boolean f14379y = true;

    /* renamed from: R */
    public static boolean m21105R(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: B */
    public final int mo22550B() {
        return this.f14378x;
    }

    /* renamed from: C */
    public final Priority mo22551C() {
        return this.f14372g;
    }

    /* renamed from: D */
    public final Class<?> mo22552D() {
        return this.f14363U;
    }

    /* renamed from: E */
    public final z93 mo22553E() {
        return this.f14356C;
    }

    /* renamed from: F */
    public final float mo22554F() {
        return this.f14369d;
    }

    /* renamed from: G */
    public final Resources.Theme mo22555G() {
        return this.f14365Y;
    }

    /* renamed from: H */
    public final Map<Class<?>, mw6<?>> mo22556H() {
        return this.f14362Q;
    }

    /* renamed from: I */
    public final boolean mo22557I() {
        return this.f14368b1;
    }

    /* renamed from: J */
    public final boolean mo22558J() {
        return this.f14371e0;
    }

    /* renamed from: K */
    public final boolean mo22559K() {
        return this.f14366Z;
    }

    /* renamed from: L */
    public final boolean mo22560L() {
        return mo22564P(4);
    }

    /* renamed from: M */
    public final boolean mo22561M() {
        return this.f14379y;
    }

    /* renamed from: N */
    public final boolean mo22562N() {
        return mo22564P(8);
    }

    /* renamed from: O */
    public boolean mo22563O() {
        return this.f14377v0;
    }

    /* renamed from: P */
    public final boolean mo22564P(int i) {
        return m21105R(this.f14367a, i);
    }

    /* renamed from: S */
    public final boolean mo22565S() {
        return mo22564P(256);
    }

    /* renamed from: T */
    public final boolean mo22566T() {
        return this.f14358I;
    }

    /* renamed from: U */
    public final boolean mo22567U() {
        return this.f14357H;
    }

    /* renamed from: V */
    public final boolean mo22568V() {
        return mo22564P(2048);
    }

    /* renamed from: Y */
    public final boolean mo22569Y() {
        return p67.m24692t(this.f14355B, this.f14354A);
    }

    /* renamed from: Z */
    public T mo22570Z() {
        this.f14364X = true;
        return mo22590l0();
    }

    /* renamed from: a */
    public T mo11567a(C2734kz<?> kzVar) {
        if (this.f14366Z) {
            return clone().mo11567a(kzVar);
        }
        if (m21105R(kzVar.f14367a, 2)) {
            this.f14369d = kzVar.f14369d;
        }
        if (m21105R(kzVar.f14367a, 262144)) {
            this.f14371e0 = kzVar.f14371e0;
        }
        if (m21105R(kzVar.f14367a, 1048576)) {
            this.f14368b1 = kzVar.f14368b1;
        }
        if (m21105R(kzVar.f14367a, 4)) {
            this.f14370e = kzVar.f14370e;
        }
        if (m21105R(kzVar.f14367a, 8)) {
            this.f14372g = kzVar.f14372g;
        }
        if (m21105R(kzVar.f14367a, 16)) {
            this.f14373k = kzVar.f14373k;
            this.f14375r = 0;
            this.f14367a &= -33;
        }
        if (m21105R(kzVar.f14367a, 32)) {
            this.f14375r = kzVar.f14375r;
            this.f14373k = null;
            this.f14367a &= -17;
        }
        if (m21105R(kzVar.f14367a, 64)) {
            this.f14376s = kzVar.f14376s;
            this.f14378x = 0;
            this.f14367a &= -129;
        }
        if (m21105R(kzVar.f14367a, 128)) {
            this.f14378x = kzVar.f14378x;
            this.f14376s = null;
            this.f14367a &= -65;
        }
        if (m21105R(kzVar.f14367a, 256)) {
            this.f14379y = kzVar.f14379y;
        }
        if (m21105R(kzVar.f14367a, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN)) {
            this.f14355B = kzVar.f14355B;
            this.f14354A = kzVar.f14354A;
        }
        if (m21105R(kzVar.f14367a, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE)) {
            this.f14356C = kzVar.f14356C;
        }
        if (m21105R(kzVar.f14367a, 4096)) {
            this.f14363U = kzVar.f14363U;
        }
        if (m21105R(kzVar.f14367a, 8192)) {
            this.f14359L = kzVar.f14359L;
            this.f14360M = 0;
            this.f14367a &= -16385;
        }
        if (m21105R(kzVar.f14367a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f14360M = kzVar.f14360M;
            this.f14359L = null;
            this.f14367a &= -8193;
        }
        if (m21105R(kzVar.f14367a, 32768)) {
            this.f14365Y = kzVar.f14365Y;
        }
        if (m21105R(kzVar.f14367a, 65536)) {
            this.f14358I = kzVar.f14358I;
        }
        if (m21105R(kzVar.f14367a, 131072)) {
            this.f14357H = kzVar.f14357H;
        }
        if (m21105R(kzVar.f14367a, 2048)) {
            this.f14362Q.putAll(kzVar.f14362Q);
            this.f14377v0 = kzVar.f14377v0;
        }
        if (m21105R(kzVar.f14367a, 524288)) {
            this.f14374k0 = kzVar.f14374k0;
        }
        if (!this.f14358I) {
            this.f14362Q.clear();
            this.f14357H = false;
            this.f14367a = this.f14367a & -2049 & -131073;
            this.f14377v0 = true;
        }
        this.f14367a |= kzVar.f14367a;
        this.f14361P.mo27761d(kzVar.f14361P);
        return mo22592m0();
    }

    /* renamed from: a0 */
    public T mo22571a0() {
        return mo22579f0(DownsampleStrategy.f8925e, new kc0());
    }

    /* renamed from: b */
    public T mo22572b() {
        if (!this.f14364X || this.f14366Z) {
            this.f14366Z = true;
            return mo22570Z();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: c0 */
    public T mo22573c0() {
        return mo22576e0(DownsampleStrategy.f8924d, new lc0());
    }

    /* renamed from: d */
    public T mo22574d() {
        return mo22603t0(DownsampleStrategy.f8925e, new kc0());
    }

    /* renamed from: d0 */
    public T mo22575d0() {
        return mo22576e0(DownsampleStrategy.f8923c, new g32());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22576e0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, p000.mw6<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            kz r2 = r1.mo22588k0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22576e0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, mw6):kz");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2734kz)) {
            return false;
        }
        C2734kz kzVar = (C2734kz) obj;
        if (Float.compare(kzVar.f14369d, this.f14369d) == 0 && this.f14375r == kzVar.f14375r && p67.m24676d(this.f14373k, kzVar.f14373k) && this.f14378x == kzVar.f14378x && p67.m24676d(this.f14376s, kzVar.f14376s) && this.f14360M == kzVar.f14360M && p67.m24676d(this.f14359L, kzVar.f14359L) && this.f14379y == kzVar.f14379y && this.f14354A == kzVar.f14354A && this.f14355B == kzVar.f14355B && this.f14357H == kzVar.f14357H && this.f14358I == kzVar.f14358I && this.f14371e0 == kzVar.f14371e0 && this.f14374k0 == kzVar.f14374k0 && this.f14370e.equals(kzVar.f14370e) && this.f14372g == kzVar.f14372g && this.f14361P.equals(kzVar.f14361P) && this.f14362Q.equals(kzVar.f14362Q) && this.f14363U.equals(kzVar.f14363U) && p67.m24676d(this.f14356C, kzVar.f14356C) && p67.m24676d(this.f14365Y, kzVar.f14365Y)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public T mo22578f() {
        return mo22587j0(DownsampleStrategy.f8924d, new lc0());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22579f0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, p000.mw6<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f14366Z
            if (r0 == 0) goto L_0x000d
            kz r0 = r1.clone()
            kz r2 = r0.mo22579f0(r2, r3)
            return r2
        L_0x000d:
            r1.mo22589l(r2)
            r2 = 0
            kz r2 = r1.mo22601s0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22579f0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, mw6):kz");
    }

    /* renamed from: g */
    public T mo22580g() {
        return mo22603t0(DownsampleStrategy.f8924d, new xe0());
    }

    /* renamed from: g0 */
    public T mo22581g0(int i, int i2) {
        if (this.f14366Z) {
            return clone().mo22581g0(i, i2);
        }
        this.f14355B = i;
        this.f14354A = i2;
        this.f14367a |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        return mo22592m0();
    }

    /* renamed from: h */
    public T clone() {
        try {
            T t = (C2734kz) super.clone();
            xi4 xi4 = new xi4();
            t.f14361P = xi4;
            xi4.mo27761d(this.f14361P);
            k80 k80 = new k80();
            t.f14362Q = k80;
            k80.putAll(this.f14362Q);
            t.f14364X = false;
            t.f14366Z = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h0 */
    public T mo22582h0(int i) {
        if (this.f14366Z) {
            return clone().mo22582h0(i);
        }
        this.f14378x = i;
        this.f14376s = null;
        this.f14367a = (this.f14367a | 128) & -65;
        return mo22592m0();
    }

    public int hashCode() {
        return p67.m24687o(this.f14365Y, p67.m24687o(this.f14356C, p67.m24687o(this.f14363U, p67.m24687o(this.f14362Q, p67.m24687o(this.f14361P, p67.m24687o(this.f14372g, p67.m24687o(this.f14370e, p67.m24688p(this.f14374k0, p67.m24688p(this.f14371e0, p67.m24688p(this.f14358I, p67.m24688p(this.f14357H, p67.m24686n(this.f14355B, p67.m24686n(this.f14354A, p67.m24688p(this.f14379y, p67.m24687o(this.f14359L, p67.m24686n(this.f14360M, p67.m24687o(this.f14376s, p67.m24686n(this.f14378x, p67.m24687o(this.f14373k, p67.m24686n(this.f14375r, p67.m24684l(this.f14369d)))))))))))))))))))));
    }

    /* renamed from: i */
    public T mo22584i(Class<?> cls) {
        if (this.f14366Z) {
            return clone().mo22584i(cls);
        }
        this.f14363U = (Class) zt4.m31500d(cls);
        this.f14367a |= 4096;
        return mo22592m0();
    }

    /* renamed from: i0 */
    public T mo22585i0(Priority priority) {
        if (this.f14366Z) {
            return clone().mo22585i0(priority);
        }
        this.f14372g = (Priority) zt4.m31500d(priority);
        this.f14367a |= 8;
        return mo22592m0();
    }

    /* renamed from: j */
    public T mo22586j(xg1 xg1) {
        if (this.f14366Z) {
            return clone().mo22586j(xg1);
        }
        this.f14370e = (xg1) zt4.m31500d(xg1);
        this.f14367a |= 4;
        return mo22592m0();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22587j0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, p000.mw6<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            kz r2 = r1.mo22588k0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22587j0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, mw6):kz");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22588k0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1, p000.mw6<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            kz r1 = r0.mo22603t0(r1, r2)
            goto L_0x000b
        L_0x0007:
            kz r1 = r0.mo22579f0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f14377v0 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22588k0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, mw6, boolean):kz");
    }

    /* renamed from: l */
    public T mo22589l(DownsampleStrategy downsampleStrategy) {
        return mo22593n0(DownsampleStrategy.f8928h, zt4.m31500d(downsampleStrategy));
    }

    /* renamed from: l0 */
    public final T mo22590l0() {
        return this;
    }

    /* renamed from: m */
    public T mo22591m(int i) {
        if (this.f14366Z) {
            return clone().mo22591m(i);
        }
        this.f14375r = i;
        this.f14373k = null;
        this.f14367a = (this.f14367a | 32) & -17;
        return mo22592m0();
    }

    /* renamed from: m0 */
    public final T mo22592m0() {
        if (!this.f14364X) {
            return mo22590l0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [pi4<Y>, java.lang.Object, pi4] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo22593n0(p000.pi4<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f14366Z
            if (r0 == 0) goto L_0x000d
            kz r0 = r1.clone()
            kz r2 = r0.mo22593n0(r2, r3)
            return r2
        L_0x000d:
            p000.zt4.m31500d(r2)
            p000.zt4.m31500d(r3)
            xi4 r0 = r1.f14361P
            r0.mo27762e(r2, r3)
            kz r2 = r1.mo22592m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22593n0(pi4, java.lang.Object):kz");
    }

    /* renamed from: o */
    public final xg1 mo22594o() {
        return this.f14370e;
    }

    /* renamed from: o0 */
    public T mo22595o0(z93 z93) {
        if (this.f14366Z) {
            return clone().mo22595o0(z93);
        }
        this.f14356C = (z93) zt4.m31500d(z93);
        this.f14367a |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        return mo22592m0();
    }

    /* renamed from: p */
    public final int mo22596p() {
        return this.f14375r;
    }

    /* renamed from: p0 */
    public T mo22597p0(float f) {
        if (this.f14366Z) {
            return clone().mo22597p0(f);
        }
        if (f < Utils.FLOAT_EPSILON || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f14369d = f;
        this.f14367a |= 2;
        return mo22592m0();
    }

    /* renamed from: q0 */
    public T mo22598q0(boolean z) {
        if (this.f14366Z) {
            return clone().mo22598q0(true);
        }
        this.f14379y = !z;
        this.f14367a |= 256;
        return mo22592m0();
    }

    /* renamed from: r */
    public final Drawable mo22599r() {
        return this.f14373k;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo22600r0(p000.mw6<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            kz r2 = r1.mo22601s0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22600r0(mw6):kz");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo22601s0(p000.mw6<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f14366Z
            if (r0 == 0) goto L_0x000d
            kz r0 = r2.clone()
            kz r3 = r0.mo22601s0(r3, r4)
            return r3
        L_0x000d:
            rj1 r0 = new rj1
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo22605u0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo22605u0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            mw6 r0 = r0.mo25392c()
            r2.mo22605u0(r1, r0, r4)
            java.lang.Class<jg2> r0 = p000.jg2.class
            ng2 r1 = new ng2
            r1.<init>(r3)
            r2.mo22605u0(r0, r1, r4)
            kz r3 = r2.mo22592m0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22601s0(mw6, boolean):kz");
    }

    /* renamed from: t */
    public final Drawable mo22602t() {
        return this.f14359L;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22603t0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, p000.mw6<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f14366Z
            if (r0 == 0) goto L_0x000d
            kz r0 = r1.clone()
            kz r2 = r0.mo22603t0(r2, r3)
            return r2
        L_0x000d:
            r1.mo22589l(r2)
            kz r2 = r1.mo22600r0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22603t0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, mw6):kz");
    }

    /* renamed from: u */
    public final int mo22604u() {
        return this.f14360M;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [mw6<Y>, java.lang.Object, mw6] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo22605u0(java.lang.Class<Y> r2, p000.mw6<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f14366Z
            if (r0 == 0) goto L_0x000d
            kz r0 = r1.clone()
            kz r2 = r0.mo22605u0(r2, r3, r4)
            return r2
        L_0x000d:
            p000.zt4.m31500d(r2)
            p000.zt4.m31500d(r3)
            java.util.Map<java.lang.Class<?>, mw6<?>> r0 = r1.f14362Q
            r0.put(r2, r3)
            int r2 = r1.f14367a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f14358I = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f14367a = r2
            r0 = 0
            r1.f14377v0 = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f14367a = r2
            r1.f14357H = r3
        L_0x0030:
            kz r2 = r1.mo22592m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2734kz.mo22605u0(java.lang.Class, mw6, boolean):kz");
    }

    /* renamed from: v */
    public final boolean mo22606v() {
        return this.f14374k0;
    }

    /* renamed from: v0 */
    public T mo22607v0(boolean z) {
        if (this.f14366Z) {
            return clone().mo22607v0(z);
        }
        this.f14368b1 = z;
        this.f14367a |= 1048576;
        return mo22592m0();
    }

    /* renamed from: w */
    public final xi4 mo22608w() {
        return this.f14361P;
    }

    /* renamed from: x */
    public final int mo22609x() {
        return this.f14354A;
    }

    /* renamed from: y */
    public final int mo22610y() {
        return this.f14355B;
    }

    /* renamed from: z */
    public final Drawable mo22611z() {
        return this.f14376s;
    }
}
