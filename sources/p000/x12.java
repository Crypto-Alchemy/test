package p000;

/* renamed from: x12 */
public class x12 {

    /* renamed from: b */
    public static char[] f45830b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public final byte[] f45831a;

    public x12(byte[] bArr) {
        this(bArr, 160);
    }

    public x12(byte[] bArr, int i) {
        this.f45831a = m73805a(bArr, i);
    }

    /* renamed from: a */
    public static byte[] m73805a(byte[] bArr, int i) {
        if (i % 8 == 0) {
            gj5 gj5 = new gj5(256);
            gj5.update(bArr, 0, bArr.length);
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            gj5.mo51935f(bArr2, 0, i2);
            return bArr2;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x12) {
            return C9367tq.m72417a(((x12) obj).f45831a, this.f45831a);
        }
        return false;
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f45831a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.f45831a.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f45830b[(this.f45831a[i] >>> 4) & 15]);
            stringBuffer.append(f45830b[this.f45831a[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
