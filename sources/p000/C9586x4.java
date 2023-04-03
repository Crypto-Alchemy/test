package p000;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p000.C9367tq;

/* renamed from: x4 */
public abstract class C9586x4 extends C9326t4 implements Iterable {

    /* renamed from: e */
    public static final C7119g5 f45843e = new C9587a(C9586x4.class, 17);

    /* renamed from: a */
    public final C6843b4[] f45844a;

    /* renamed from: d */
    public final boolean f45845d;

    /* renamed from: x4$a */
    public static class C9587a extends C7119g5 {
        public C9587a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return w4Var.mo50765S();
        }
    }

    public C9586x4() {
        this.f45844a = C6923c4.f37064d;
        this.f45845d = true;
    }

    public C9586x4(C6923c4 c4Var, boolean z) {
        C6843b4[] b4VarArr;
        if (c4Var != null) {
            if (!z || c4Var.mo50809f() < 2) {
                b4VarArr = c4Var.mo50810g();
            } else {
                b4VarArr = c4Var.mo50806c();
                m73867M(b4VarArr);
            }
            this.f45844a = b4VarArr;
            this.f45845d = z || b4VarArr.length < 2;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public C9586x4(boolean z, C6843b4[] b4VarArr) {
        this.f45844a = b4VarArr;
        this.f45845d = z || b4VarArr.length < 2;
    }

    /* renamed from: H */
    public static byte[] m73864H(C6843b4 b4Var) {
        try {
            return b4Var.mo50158n().mo56353q("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: J */
    public static C9586x4 m73865J(C6848b5 b5Var, boolean z) {
        return (C9586x4) f45843e.mo51869e(b5Var, z);
    }

    /* renamed from: L */
    public static boolean m73866L(byte[] bArr, byte[] bArr2) {
        byte b = bArr[0] & -33;
        byte b2 = bArr2[0] & -33;
        if (b != b2) {
            return b < b2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i = 1; i < min; i++) {
            byte b3 = bArr[i];
            byte b4 = bArr2[i];
            if (b3 != b4) {
                return (b3 & 255) < (b4 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    /* renamed from: M */
    public static void m73867M(C6843b4[] b4VarArr) {
        int length = b4VarArr.length;
        if (length >= 2) {
            C6843b4 b4Var = b4VarArr[0];
            C6843b4 b4Var2 = b4VarArr[1];
            byte[] H = m73864H(b4Var);
            byte[] H2 = m73864H(b4Var2);
            if (m73866L(H2, H)) {
                C6843b4 b4Var3 = b4Var2;
                b4Var2 = b4Var;
                b4Var = b4Var3;
                byte[] bArr = H2;
                H2 = H;
                H = bArr;
            }
            for (int i = 2; i < length; i++) {
                C6843b4 b4Var4 = b4VarArr[i];
                byte[] H3 = m73864H(b4Var4);
                if (m73866L(H2, H3)) {
                    b4VarArr[i - 2] = b4Var;
                    b4Var = b4Var2;
                    H = H2;
                    b4Var2 = b4Var4;
                    H2 = H3;
                } else if (m73866L(H, H3)) {
                    b4VarArr[i - 2] = b4Var;
                    b4Var = b4Var4;
                    H = H3;
                } else {
                    int i2 = i - 1;
                    while (true) {
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        C6843b4 b4Var5 = b4VarArr[i2 - 1];
                        if (m73866L(m73864H(b4Var5), H3)) {
                            break;
                        }
                        b4VarArr[i2] = b4Var5;
                    }
                    b4VarArr[i2] = b4Var4;
                }
            }
            b4VarArr[length - 2] = b4Var;
            b4VarArr[length - 1] = b4Var2;
        }
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        C6843b4[] b4VarArr;
        if (this.f45845d) {
            b4VarArr = this.f45844a;
        } else {
            b4VarArr = (C6843b4[]) this.f45844a.clone();
            m73867M(b4VarArr);
        }
        return new d01(true, b4VarArr);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new v01(this.f45845d, this.f45844a);
    }

    /* renamed from: N */
    public C6843b4[] mo66828N() {
        return C6923c4.m56299b(this.f45844a);
    }

    public int hashCode() {
        int length = this.f45844a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f45844a[length].mo50158n().hashCode();
        }
    }

    public Iterator<C6843b4> iterator() {
        return new C9367tq.C9368a(mo66828N());
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9586x4)) {
            return false;
        }
        C9586x4 x4Var = (C9586x4) t4Var;
        int size = size();
        if (x4Var.size() != size) {
            return false;
        }
        d01 d01 = (d01) mo50472E();
        d01 d012 = (d01) x4Var.mo50472E();
        for (int i = 0; i < size; i++) {
            C9326t4 n = d01.f45844a[i].mo50158n();
            C9326t4 n2 = d012.f45844a[i].mo50158n();
            if (n != n2 && !n.mo50485r(n2)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.f45844a.length;
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return true;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f45844a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
