package p000;

/* renamed from: of0 */
/* compiled from: ClassLiteralValue.kt */
public final class of0 {

    /* renamed from: a */
    public final nf0 f43636a;

    /* renamed from: b */
    public final int f43637b;

    public of0(nf0 nf0, int i) {
        vx2.m53591g(nf0, "classId");
        this.f43636a = nf0;
        this.f43637b = i;
    }

    /* renamed from: a */
    public final nf0 mo62896a() {
        return this.f43636a;
    }

    /* renamed from: b */
    public final int mo62897b() {
        return this.f43637b;
    }

    /* renamed from: c */
    public final int mo62898c() {
        return this.f43637b;
    }

    /* renamed from: d */
    public final nf0 mo62899d() {
        return this.f43636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of0)) {
            return false;
        }
        of0 of0 = (of0) obj;
        return vx2.m53586b(this.f43636a, of0.f43636a) && this.f43637b == of0.f43637b;
    }

    public int hashCode() {
        return (this.f43636a.hashCode() * 31) + this.f43637b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f43637b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f43636a);
        int i3 = this.f43637b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
