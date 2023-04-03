package p000;

/* renamed from: xv */
/* compiled from: AuxEffectInfo */
public final class C3645xv {

    /* renamed from: a */
    public final int f19983a;

    /* renamed from: b */
    public final float f19984b;

    public C3645xv(int i, float f) {
        this.f19983a = i;
        this.f19984b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3645xv.class != obj.getClass()) {
            return false;
        }
        C3645xv xvVar = (C3645xv) obj;
        if (this.f19983a == xvVar.f19983a && Float.compare(xvVar.f19984b, this.f19984b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f19983a) * 31) + Float.floatToIntBits(this.f19984b);
    }
}
