package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, mo44877d2 = {"Ltk7;", "", "", "c", "()[F", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "F", "()F", "x", "b", "y", "<init>", "(FF)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tk7 */
/* compiled from: WhitePoint.kt */
public final class tk7 {

    /* renamed from: a */
    public final float f18185a;

    /* renamed from: b */
    public final float f18186b;

    public tk7(float f, float f2) {
        this.f18185a = f;
        this.f18186b = f2;
    }

    /* renamed from: a */
    public final float mo26499a() {
        return this.f18185a;
    }

    /* renamed from: b */
    public final float mo26500b() {
        return this.f18186b;
    }

    /* renamed from: c */
    public final float[] mo26501c() {
        float f = this.f18185a;
        float f2 = this.f18186b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk7)) {
            return false;
        }
        tk7 tk7 = (tk7) obj;
        return vx2.m53586b(Float.valueOf(this.f18185a), Float.valueOf(tk7.f18185a)) && vx2.m53586b(Float.valueOf(this.f18186b), Float.valueOf(tk7.f18186b));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f18185a) * 31) + Float.floatToIntBits(this.f18186b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f18185a + ", y=" + this.f18186b + ')';
    }
}
