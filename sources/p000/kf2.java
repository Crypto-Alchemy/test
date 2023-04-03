package p000;

import java.math.BigInteger;

/* renamed from: kf2 */
public class kf2 implements es4 {

    /* renamed from: a */
    public final c22 f38887a;

    /* renamed from: b */
    public final ds4 f38888b;

    public kf2(c22 c22, ds4 ds4) {
        this.f38887a = c22;
        this.f38888b = ds4;
    }

    /* renamed from: a */
    public int mo50778a() {
        return this.f38887a.mo50778a() * this.f38888b.mo51280b();
    }

    /* renamed from: b */
    public BigInteger mo50779b() {
        return this.f38887a.mo50779b();
    }

    /* renamed from: c */
    public ds4 mo51541c() {
        return this.f38888b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf2)) {
            return false;
        }
        kf2 kf2 = (kf2) obj;
        return this.f38887a.equals(kf2.f38887a) && this.f38888b.equals(kf2.f38888b);
    }

    public int hashCode() {
        return this.f38887a.hashCode() ^ gx2.m58283c(this.f38888b.hashCode(), 16);
    }
}
