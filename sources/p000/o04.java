package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lo04;", "", "", "left", "top", "right", "bottom", "Lr37;", "e", "g", "", "toString", "a", "F", "b", "()F", "i", "(F)V", "d", "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "<init>", "(FFFF)V", "ui-geometry_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: o04 */
/* compiled from: MutableRect.kt */
public final class o04 {

    /* renamed from: a */
    public float f15768a;

    /* renamed from: b */
    public float f15769b;

    /* renamed from: c */
    public float f15770c;

    /* renamed from: d */
    public float f15771d;

    public o04(float f, float f2, float f3, float f4) {
        this.f15768a = f;
        this.f15769b = f2;
        this.f15770c = f3;
        this.f15771d = f4;
    }

    /* renamed from: a */
    public final float mo23875a() {
        return this.f15771d;
    }

    /* renamed from: b */
    public final float mo23876b() {
        return this.f15768a;
    }

    /* renamed from: c */
    public final float mo23877c() {
        return this.f15770c;
    }

    /* renamed from: d */
    public final float mo23878d() {
        return this.f15769b;
    }

    /* renamed from: e */
    public final void mo23879e(float f, float f2, float f3, float f4) {
        this.f15768a = Math.max(f, this.f15768a);
        this.f15769b = Math.max(f2, this.f15769b);
        this.f15770c = Math.min(f3, this.f15770c);
        this.f15771d = Math.min(f4, this.f15771d);
    }

    /* renamed from: f */
    public final boolean mo23880f() {
        if (this.f15768a >= this.f15770c || this.f15769b >= this.f15771d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo23881g(float f, float f2, float f3, float f4) {
        this.f15768a = f;
        this.f15769b = f2;
        this.f15770c = f3;
        this.f15771d = f4;
    }

    /* renamed from: h */
    public final void mo23882h(float f) {
        this.f15771d = f;
    }

    /* renamed from: i */
    public final void mo23883i(float f) {
        this.f15768a = f;
    }

    /* renamed from: j */
    public final void mo23884j(float f) {
        this.f15770c = f;
    }

    /* renamed from: k */
    public final void mo23885k(float f) {
        this.f15769b = f;
    }

    public String toString() {
        return "MutableRect(" + mf2.m22276a(this.f15768a, 1) + ", " + mf2.m22276a(this.f15769b, 1) + ", " + mf2.m22276a(this.f15770c, 1) + ", " + mf2.m22276a(this.f15771d, 1) + ')';
    }
}
