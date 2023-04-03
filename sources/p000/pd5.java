package p000;

/* renamed from: pd5 */
/* compiled from: RendererConfiguration */
public final class pd5 {

    /* renamed from: b */
    public static final pd5 f16390b = new pd5(false);

    /* renamed from: a */
    public final boolean f16391a;

    public pd5(boolean z) {
        this.f16391a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pd5.class != obj.getClass()) {
            return false;
        }
        if (this.f16391a == ((pd5) obj).f16391a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f16391a ^ true ? 1 : 0;
    }
}
