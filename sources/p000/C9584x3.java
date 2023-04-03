package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: x3 */
public abstract class C9584x3 extends C9326t4 implements C9623y3 {

    /* renamed from: d */
    public static final C7119g5 f45840d = new C9585a(C9584x3.class, 3);

    /* renamed from: e */
    public static final char[] f45841e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final byte[] f45842a;

    /* renamed from: x3$a */
    public static class C9585a extends C7119g5 {
        public C9585a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return w4Var.mo50762O();
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9584x3.m73850H(yz0.mo65418M());
        }
    }

    public C9584x3(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f45842a = C9367tq.m72415D(bArr, (byte) i);
        }
    }

    public C9584x3(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            } else if (bArr.length >= 1) {
                byte b = bArr[0] & 255;
                if (b > 0) {
                    if (bArr.length < 2) {
                        throw new IllegalArgumentException("zero length data with non-zero pad bits");
                    } else if (b > 7) {
                        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                    }
                }
            } else {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
        }
        this.f45842a = bArr;
    }

    /* renamed from: H */
    public static C9584x3 m73850H(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            byte b = bArr[0] & 255;
            if (b > 0) {
                if (b > 7 || length < 2) {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
                byte b2 = bArr[length - 1];
                if (b2 != ((byte) ((255 << b) & b2))) {
                    return new o01(bArr, false);
                }
            }
            return new pz0(bArr, false);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* renamed from: L */
    public static C9584x3 m73851L(C6848b5 b5Var, boolean z) {
        return (C9584x3) f45840d.mo51869e(b5Var, z);
    }

    /* renamed from: M */
    public static C9584x3 m73852M(Object obj) {
        if (obj == null || (obj instanceof C9584x3)) {
            return (C9584x3) obj;
        }
        if (obj instanceof C6843b4) {
            C9326t4 n = ((C6843b4) obj).mo50158n();
            if (n instanceof C9584x3) {
                return (C9584x3) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C9584x3) f45840d.mo51868b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new pz0(this.f45842a, false);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new o01(this.f45842a, false);
    }

    /* renamed from: J */
    public byte[] mo66824J() {
        byte[] bArr = this.f45842a;
        if (bArr.length == 1) {
            return C9203q4.f44152e;
        }
        byte[] n = C9367tq.m72430n(bArr, 1, bArr.length);
        int length = n.length - 1;
        n[length] = (byte) (((byte) (255 << (bArr[0] & 255))) & n[length]);
        return n;
    }

    /* renamed from: N */
    public byte[] mo66825N() {
        byte[] bArr = this.f45842a;
        if (bArr[0] == 0) {
            return C9367tq.m72430n(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    /* renamed from: O */
    public String mo66826O() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = f45841e;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    public int hashCode() {
        byte[] bArr = this.f45842a;
        if (bArr.length < 2) {
            return 1;
        }
        int length = bArr.length - 1;
        return (C9367tq.m72438v(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << (bArr[0] & 255))));
    }

    /* renamed from: j */
    public int mo52539j() {
        return this.f45842a[0] & 255;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() {
        return mo50158n();
    }

    /* renamed from: o */
    public InputStream mo52540o() throws IOException {
        byte[] bArr = this.f45842a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9584x3)) {
            return false;
        }
        byte[] bArr = this.f45842a;
        byte[] bArr2 = ((C9584x3) t4Var).f45842a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    public String toString() {
        return mo66826O();
    }
}
