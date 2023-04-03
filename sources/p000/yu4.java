package p000;

import java.math.BigInteger;

/* renamed from: yu4 */
public class yu4 implements c22 {

    /* renamed from: a */
    public final BigInteger f46269a;

    public yu4(BigInteger bigInteger) {
        this.f46269a = bigInteger;
    }

    /* renamed from: a */
    public int mo50778a() {
        return 1;
    }

    /* renamed from: b */
    public BigInteger mo50779b() {
        return this.f46269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu4)) {
            return false;
        }
        return this.f46269a.equals(((yu4) obj).f46269a);
    }

    public int hashCode() {
        return this.f46269a.hashCode();
    }
}
