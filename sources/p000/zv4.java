package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.C1956a;
import com.facebook.imagepipeline.producers.C1962b;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;

/* renamed from: zv4 */
/* compiled from: ProducerFactory */
public class zv4 {

    /* renamed from: a */
    public ContentResolver f20691a;

    /* renamed from: b */
    public Resources f20692b;

    /* renamed from: c */
    public AssetManager f20693c;

    /* renamed from: d */
    public final j60 f20694d;

    /* renamed from: e */
    public final nq2 f20695e;

    /* renamed from: f */
    public final qw4 f20696f;

    /* renamed from: g */
    public final boolean f20697g;

    /* renamed from: h */
    public final boolean f20698h;

    /* renamed from: i */
    public final boolean f20699i;

    /* renamed from: j */
    public final yu1 f20700j;

    /* renamed from: k */
    public final qs4 f20701k;

    /* renamed from: l */
    public final t40 f20702l;

    /* renamed from: m */
    public final t40 f20703m;

    /* renamed from: n */
    public final ys3<f80, PooledByteBuffer> f20704n;

    /* renamed from: o */
    public final ys3<f80, kh0> f20705o;

    /* renamed from: p */
    public final g80 f20706p;

    /* renamed from: q */
    public final z30<f80> f20707q;

    /* renamed from: r */
    public final z30<f80> f20708r;

    /* renamed from: s */
    public final xo4 f20709s;

    /* renamed from: t */
    public final int f20710t;

    /* renamed from: u */
    public final int f20711u;

    /* renamed from: v */
    public boolean f20712v;

    /* renamed from: w */
    public final oh0 f20713w;

    /* renamed from: x */
    public final int f20714x;

    /* renamed from: y */
    public final boolean f20715y;

    public zv4(Context context, j60 j60, nq2 nq2, qw4 qw4, boolean z, boolean z2, boolean z3, yu1 yu1, qs4 qs4, ys3<f80, kh0> ys3, ys3<f80, PooledByteBuffer> ys32, t40 t40, t40 t402, g80 g80, xo4 xo4, int i, int i2, boolean z4, int i3, oh0 oh0, boolean z5, int i4) {
        int i5 = i4;
        this.f20691a = context.getApplicationContext().getContentResolver();
        this.f20692b = context.getApplicationContext().getResources();
        this.f20693c = context.getApplicationContext().getAssets();
        this.f20694d = j60;
        this.f20695e = nq2;
        this.f20696f = qw4;
        this.f20697g = z;
        this.f20698h = z2;
        this.f20699i = z3;
        this.f20700j = yu1;
        this.f20701k = qs4;
        this.f20705o = ys3;
        this.f20704n = ys32;
        this.f20702l = t40;
        this.f20703m = t402;
        this.f20706p = g80;
        this.f20709s = xo4;
        this.f20707q = new z30<>(i5);
        this.f20708r = new z30<>(i5);
        this.f20710t = i;
        this.f20711u = i2;
        this.f20712v = z4;
        this.f20714x = i3;
        this.f20713w = oh0;
        this.f20715y = z5;
    }

    /* renamed from: a */
    public static C2657kc m31522a(vv4<gp1> vv4) {
        return new C2657kc(vv4);
    }

    /* renamed from: h */
    public static b40 m31523h(vv4<gp1> vv4, vv4<gp1> vv42) {
        return new b40(vv4, vv42);
    }

    /* renamed from: A */
    public qt4 mo28584A(vv4<nh0<kh0>> vv4) {
        return new qt4(this.f20705o, this.f20706p, vv4);
    }

    /* renamed from: B */
    public st4 mo28585B(vv4<nh0<kh0>> vv4) {
        return new st4(vv4, this.f20709s, this.f20700j.mo27975e());
    }

    /* renamed from: C */
    public nz4 mo28586C() {
        return new nz4(this.f20700j.mo27976f(), this.f20701k, this.f20691a);
    }

    /* renamed from: D */
    public C1962b mo28587D(vv4<gp1> vv4, boolean z, zr2 zr2) {
        return new C1962b(this.f20700j.mo27975e(), this.f20701k, vv4, z, zr2);
    }

    /* renamed from: E */
    public <T> op6<T> mo28588E(vv4<T> vv4) {
        return new op6<>(5, this.f20700j.mo27971a(), vv4);
    }

    /* renamed from: F */
    public vp6 mo28589F(wp6<gp1>[] wp6Arr) {
        return new vp6(wp6Arr);
    }

    /* renamed from: G */
    public gk7 mo28590G(vv4<gp1> vv4) {
        return new gk7(this.f20700j.mo27975e(), this.f20701k, vv4);
    }

    /* renamed from: b */
    public <T> vv4<T> mo28591b(vv4<T> vv4, fp6 fp6) {
        return new ep6(vv4, fp6);
    }

    /* renamed from: c */
    public n20 mo28592c(vv4<nh0<kh0>> vv4) {
        return new n20(this.f20705o, this.f20706p, vv4);
    }

    /* renamed from: d */
    public p20 mo28593d(vv4<nh0<kh0>> vv4) {
        return new p20(this.f20706p, vv4);
    }

    /* renamed from: e */
    public q20 mo28594e(vv4<nh0<kh0>> vv4) {
        return new q20(this.f20705o, this.f20706p, vv4);
    }

    /* renamed from: f */
    public w20 mo28595f(vv4<nh0<kh0>> vv4) {
        return new w20(vv4, this.f20710t, this.f20711u, this.f20712v);
    }

    /* renamed from: g */
    public x20 mo28596g(vv4<nh0<kh0>> vv4) {
        return new x20(this.f20704n, this.f20702l, this.f20703m, this.f20706p, this.f20707q, this.f20708r, vv4);
    }

    /* renamed from: i */
    public q11 mo28597i() {
        return new q11(this.f20701k);
    }

    /* renamed from: j */
    public C1956a mo28598j(vv4<gp1> vv4) {
        return new C1956a(this.f20694d, this.f20700j.mo27974d(), this.f20695e, this.f20696f, this.f20697g, this.f20698h, this.f20699i, vv4, this.f20714x, this.f20713w, (Runnable) null, ud6.f18435b);
    }

    /* renamed from: k */
    public kb1 mo28599k(vv4<nh0<kh0>> vv4) {
        return new kb1(vv4, this.f20700j.mo27973c());
    }

    /* renamed from: l */
    public wg1 mo28600l(vv4<gp1> vv4) {
        return new wg1(this.f20702l, this.f20703m, this.f20706p, vv4);
    }

    /* renamed from: m */
    public zg1 mo28601m(vv4<gp1> vv4) {
        return new zg1(this.f20702l, this.f20703m, this.f20706p, vv4);
    }

    /* renamed from: n */
    public dp1 mo28602n(vv4<gp1> vv4) {
        return new dp1(this.f20706p, this.f20715y, vv4);
    }

    /* renamed from: o */
    public ip1 mo28603o(vv4<gp1> vv4) {
        return new ip1(this.f20704n, this.f20706p, vv4);
    }

    /* renamed from: p */
    public kp1 mo28604p(vv4<gp1> vv4) {
        return new kp1(this.f20702l, this.f20703m, this.f20706p, this.f20707q, this.f20708r, vv4);
    }

    /* renamed from: q */
    public fj3 mo28605q() {
        return new fj3(this.f20700j.mo27976f(), this.f20701k, this.f20693c);
    }

    /* renamed from: r */
    public hj3 mo28606r() {
        return new hj3(this.f20700j.mo27976f(), this.f20701k, this.f20691a);
    }

    /* renamed from: s */
    public ij3 mo28607s() {
        return new ij3(this.f20700j.mo27976f(), this.f20701k, this.f20691a);
    }

    /* renamed from: t */
    public LocalExifThumbnailProducer mo28608t() {
        return new LocalExifThumbnailProducer(this.f20700j.mo27977g(), this.f20701k, this.f20691a);
    }

    /* renamed from: u */
    public kj3 mo28609u() {
        return new kj3(this.f20700j.mo27976f(), this.f20701k);
    }

    /* renamed from: v */
    public lj3 mo28610v() {
        return new lj3(this.f20700j.mo27976f(), this.f20701k, this.f20692b);
    }

    /* renamed from: w */
    public nj3 mo28611w() {
        return new nj3(this.f20700j.mo27975e(), this.f20691a);
    }

    /* renamed from: x */
    public pj3 mo28612x() {
        return new pj3(this.f20700j.mo27976f(), this.f20691a);
    }

    /* renamed from: y */
    public vv4<gp1> mo28613y(q54 q54) {
        return new p54(this.f20701k, this.f20694d, q54);
    }

    /* renamed from: z */
    public pm4 mo28614z(vv4<gp1> vv4) {
        return new pm4(this.f20702l, this.f20706p, this.f20701k, this.f20694d, vv4);
    }
}
