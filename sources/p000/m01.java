package p000;

/* renamed from: m01 */
public class m01 {

    /* renamed from: a */
    public byte[] f40729a;

    /* renamed from: b */
    public int f40730b;

    public m01(byte[] bArr, int i) {
        this.f40729a = C9367tq.m72422f(bArr);
        this.f40730b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m01)) {
            return false;
        }
        m01 m01 = (m01) obj;
        if (m01.f40730b != this.f40730b) {
            return false;
        }
        return C9367tq.m72417a(this.f40729a, m01.f40729a);
    }

    public int hashCode() {
        return this.f40730b ^ C9367tq.m72437u(this.f40729a);
    }
}
