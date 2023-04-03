package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Lth0;", "Luh0;", "", "a", "b", "", "c", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "F", "_start", "d", "_endInclusive", "()Ljava/lang/Float;", "start", "endInclusive", "<init>", "(FF)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: th0 */
/* compiled from: Ranges.kt */
public final class th0 implements uh0<Float> {

    /* renamed from: a */
    public final float f34265a;

    /* renamed from: d */
    public final float f34266d;

    public th0(float f, float f2) {
        this.f34265a = f;
        this.f34266d = f2;
    }

    /* renamed from: a */
    public Float mo47513k() {
        return Float.valueOf(this.f34266d);
    }

    /* renamed from: b */
    public Float mo47512e() {
        return Float.valueOf(this.f34265a);
    }

    /* renamed from: c */
    public boolean mo48117c(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof th0) {
            if (isEmpty() && ((th0) obj).isEmpty()) {
                return true;
            }
            th0 th0 = (th0) obj;
            if (this.f34265a == th0.f34265a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f34266d == th0.f34266d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f34265a).hashCode() * 31) + Float.valueOf(this.f34266d).hashCode();
    }

    public boolean isEmpty() {
        if (this.f34265a > this.f34266d) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo48120j(Comparable comparable, Comparable comparable2) {
        return mo48117c(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f34265a + ".." + this.f34266d;
    }
}
