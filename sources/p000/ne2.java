package p000;

/* renamed from: ne2 */
public class ne2 implements ds4 {

    /* renamed from: a */
    public final int[] f41163a;

    public ne2(int[] iArr) {
        this.f41163a = C9367tq.m72423g(iArr);
    }

    /* renamed from: a */
    public int[] mo51279a() {
        return C9367tq.m72423g(this.f41163a);
    }

    /* renamed from: b */
    public int mo51280b() {
        int[] iArr = this.f41163a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        return C9367tq.m72419c(this.f41163a, ((ne2) obj).f41163a);
    }

    public int hashCode() {
        return C9367tq.m72440x(this.f41163a);
    }
}
