package p000;

/* renamed from: b11 */
public class b11 {

    /* renamed from: a */
    public int f36627a;

    /* renamed from: b */
    public byte[] f36628b;

    /* renamed from: c */
    public int f36629c;

    public b11(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public b11(byte[] bArr, int i, int i2) {
        this.f36628b = C9367tq.m72422f(bArr);
        this.f36629c = i;
        this.f36627a = i2;
    }

    /* renamed from: a */
    public int mo50441a() {
        return this.f36629c;
    }

    /* renamed from: b */
    public byte[] mo50442b() {
        return C9367tq.m72422f(this.f36628b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11 = (b11) obj;
        if (b11.f36629c != this.f36629c) {
            return false;
        }
        return C9367tq.m72417a(this.f36628b, b11.f36628b);
    }

    public int hashCode() {
        return this.f36629c ^ C9367tq.m72437u(this.f36628b);
    }
}
