package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bT\u0010UJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0006\u0010\tR\"\u0010\u000e\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\tR\"\u0010\u0011\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0010\u0010\tR\"\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\tR\"\u0010\u0019\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\tR\"\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u001b\u0010\tR+\u0010$\u001a\u00020\u001d8\u0016@\u0016X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010'\u001a\u00020\u001d8\u0016@\u0016X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b\u001f\u0010#R\"\u0010*\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\b\"\u0004\b%\u0010\tR\"\u0010-\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\tR\"\u00101\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\tR\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b2\u0010\b\"\u0004\b\u001a\u0010\tR+\u00106\u001a\u0002048\u0016@\u0016X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0016\u0010!\"\u0004\b5\u0010#R\"\u0010<\u001a\u0002078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b\u0012\u0010:\"\u0004\b8\u0010;R\"\u0010B\u001a\u00020=8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@\"\u0004\b\u001e\u0010AR\"\u0010I\u001a\u00020C8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\bR\u0014\u0010M\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\bR$\u0010O\u001a\u0004\u0018\u00010N8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b\u000b\u0010Q\"\u0004\bR\u0010S\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, mo44877d2 = {"Lug5;", "Lnj2;", "Lr37;", "m", "", "a", "F", "q", "()F", "(F)V", "scaleX", "d", "D", "G", "scaleY", "e", "o", "alpha", "g", "z", "L", "translationX", "k", "w", "M", "translationY", "r", "H", "shadowElevation", "Luk0;", "s", "J", "b", "()J", "p", "(J)V", "ambientShadowColor", "x", "l", "spotShadowColor", "y", "A", "rotationX", "f", "C", "rotationY", "B", "i", "E", "rotationZ", "j", "cameraDistance", "Liw6;", "K", "transformOrigin", "Lqz5;", "I", "Lqz5;", "()Lqz5;", "(Lqz5;)V", "shape", "", "Z", "c", "()Z", "(Z)V", "clip", "Ldc1;", "Ldc1;", "getGraphicsDensity$ui_release", "()Ldc1;", "t", "(Ldc1;)V", "graphicsDensity", "getDensity", "density", "v", "fontScale", "Lbd5;", "renderEffect", "Lbd5;", "()Lbd5;", "u", "(Lbd5;)V", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ug5 */
/* compiled from: GraphicsLayerScope.kt */
public final class ug5 implements nj2 {

    /* renamed from: A */
    public float f18482A;

    /* renamed from: B */
    public float f18483B;

    /* renamed from: C */
    public float f18484C = 8.0f;

    /* renamed from: H */
    public long f18485H = iw6.f13402a.mo21645a();

    /* renamed from: I */
    public qz5 f18486I = e95.m15986a();

    /* renamed from: L */
    public boolean f18487L;

    /* renamed from: M */
    public dc1 f18488M = fc1.m16897b(1.0f, Utils.FLOAT_EPSILON, 2, (Object) null);

    /* renamed from: a */
    public float f18489a = 1.0f;

    /* renamed from: d */
    public float f18490d = 1.0f;

    /* renamed from: e */
    public float f18491e = 1.0f;

    /* renamed from: g */
    public float f18492g;

    /* renamed from: k */
    public float f18493k;

    /* renamed from: r */
    public float f18494r;

    /* renamed from: s */
    public long f18495s = oj2.m23836a();

    /* renamed from: x */
    public long f18496x = oj2.m23836a();

    /* renamed from: y */
    public float f18497y;

    /* renamed from: A */
    public float mo23692A() {
        return this.f18497y;
    }

    /* renamed from: B */
    public /* synthetic */ long mo18678B(long j) {
        return cc1.m11824c(this, j);
    }

    /* renamed from: C */
    public void mo26763C(float f) {
        this.f18482A = f;
    }

    /* renamed from: D */
    public float mo23693D() {
        return this.f18490d;
    }

    /* renamed from: E */
    public void mo26764E(float f) {
        this.f18483B = f;
    }

    /* renamed from: F */
    public void mo26765F(float f) {
        this.f18489a = f;
    }

    /* renamed from: G */
    public void mo26766G(float f) {
        this.f18490d = f;
    }

    /* renamed from: H */
    public void mo26767H(float f) {
        this.f18494r = f;
    }

    /* renamed from: I */
    public void mo26768I(qz5 qz5) {
        vx2.m53591g(qz5, "<set-?>");
        this.f18486I = qz5;
    }

    /* renamed from: J */
    public void mo26769J(long j) {
        this.f18496x = j;
    }

    /* renamed from: K */
    public void mo26770K(long j) {
        this.f18485H = j;
    }

    /* renamed from: L */
    public void mo26771L(float f) {
        this.f18492g = f;
    }

    /* renamed from: M */
    public void mo26772M(float f) {
        this.f18493k = f;
    }

    /* renamed from: a */
    public float mo26773a() {
        return this.f18491e;
    }

    /* renamed from: b */
    public long mo26774b() {
        return this.f18495s;
    }

    /* renamed from: c */
    public boolean mo26775c() {
        return this.f18487L;
    }

    /* renamed from: d */
    public bd5 mo26776d() {
        return null;
    }

    /* renamed from: e */
    public float mo26777e() {
        return this.f18494r;
    }

    /* renamed from: f */
    public float mo23694f() {
        return this.f18482A;
    }

    /* renamed from: g */
    public qz5 mo26778g() {
        return this.f18486I;
    }

    public float getDensity() {
        return this.f18488M.getDensity();
    }

    /* renamed from: i */
    public float mo23695i() {
        return this.f18483B;
    }

    /* renamed from: j */
    public float mo23696j() {
        return this.f18484C;
    }

    /* renamed from: k */
    public long mo23697k() {
        return this.f18485H;
    }

    /* renamed from: l */
    public long mo26779l() {
        return this.f18496x;
    }

    /* renamed from: m */
    public final void mo26780m() {
        mo26765F(1.0f);
        mo26766G(1.0f);
        mo26781o(1.0f);
        mo26771L(Utils.FLOAT_EPSILON);
        mo26772M(Utils.FLOAT_EPSILON);
        mo26767H(Utils.FLOAT_EPSILON);
        mo26782p(oj2.m23836a());
        mo26769J(oj2.m23836a());
        mo26787x(Utils.FLOAT_EPSILON);
        mo26763C(Utils.FLOAT_EPSILON);
        mo26764E(Utils.FLOAT_EPSILON);
        mo26783r(8.0f);
        mo26770K(iw6.f13402a.mo21645a());
        mo26768I(e95.m15986a());
        mo26784s(false);
        mo26786u((bd5) null);
    }

    /* renamed from: n */
    public /* synthetic */ float mo18679n(long j) {
        return cc1.m11822a(this, j);
    }

    /* renamed from: o */
    public void mo26781o(float f) {
        this.f18491e = f;
    }

    /* renamed from: p */
    public void mo26782p(long j) {
        this.f18495s = j;
    }

    /* renamed from: q */
    public float mo23698q() {
        return this.f18489a;
    }

    /* renamed from: r */
    public void mo26783r(float f) {
        this.f18484C = f;
    }

    /* renamed from: s */
    public void mo26784s(boolean z) {
        this.f18487L = z;
    }

    /* renamed from: t */
    public final void mo26785t(dc1 dc1) {
        vx2.m53591g(dc1, "<set-?>");
        this.f18488M = dc1;
    }

    /* renamed from: u */
    public void mo26786u(bd5 bd5) {
    }

    /* renamed from: v */
    public float mo3631v() {
        return this.f18488M.mo3631v();
    }

    /* renamed from: w */
    public float mo23699w() {
        return this.f18493k;
    }

    /* renamed from: x */
    public void mo26787x(float f) {
        this.f18497y = f;
    }

    /* renamed from: y */
    public /* synthetic */ float mo18680y(float f) {
        return cc1.m11823b(this, f);
    }

    /* renamed from: z */
    public float mo23700z() {
        return this.f18492g;
    }
}
