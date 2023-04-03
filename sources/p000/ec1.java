package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lec1;", "Ldc1;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "F", "getDensity", "()F", "density", "d", "v", "fontScale", "<init>", "(FF)V", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ec1 */
/* compiled from: Density.kt */
public final class ec1 implements dc1 {

    /* renamed from: a */
    public final float f11126a;

    /* renamed from: d */
    public final float f11127d;

    public ec1(float f, float f2) {
        this.f11126a = f;
        this.f11127d = f2;
    }

    /* renamed from: B */
    public /* synthetic */ long mo18678B(long j) {
        return cc1.m11824c(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec1)) {
            return false;
        }
        ec1 ec1 = (ec1) obj;
        return vx2.m53586b(Float.valueOf(getDensity()), Float.valueOf(ec1.getDensity())) && vx2.m53586b(Float.valueOf(mo3631v()), Float.valueOf(ec1.mo3631v()));
    }

    public float getDensity() {
        return this.f11126a;
    }

    public int hashCode() {
        return (Float.floatToIntBits(getDensity()) * 31) + Float.floatToIntBits(mo3631v());
    }

    /* renamed from: n */
    public /* synthetic */ float mo18679n(long j) {
        return cc1.m11822a(this, j);
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + mo3631v() + ')';
    }

    /* renamed from: v */
    public float mo3631v() {
        return this.f11127d;
    }

    /* renamed from: y */
    public /* synthetic */ float mo18680y(float f) {
        return cc1.m11823b(this, f);
    }
}
