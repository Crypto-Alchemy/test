package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: vu8 */
public final class vu8 extends lr8<vu8> implements Cloneable {

    /* renamed from: e */
    public byte[] f35174e = ws8.f35426h;

    /* renamed from: g */
    public String f35175g = "";

    /* renamed from: k */
    public byte[][] f35176k = ws8.f35425g;

    /* renamed from: r */
    public boolean f35177r = false;

    public vu8() {
        this.f31388d = null;
        this.f20992a = -1;
    }

    /* renamed from: a */
    public final void mo29047a(gr8 gr8) throws IOException {
        if (!Arrays.equals(this.f35174e, ws8.f35426h)) {
            gr8.mo42959d(1, this.f35174e);
        }
        byte[][] bArr = this.f35176k;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f35176k;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    gr8.mo42959d(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f35175g;
        if (str != null && !str.equals("")) {
            gr8.mo42957b(4, this.f35175g);
        }
        super.mo29047a(gr8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vu8)) {
            return false;
        }
        vu8 vu8 = (vu8) obj;
        if (!Arrays.equals(this.f35174e, vu8.f35174e)) {
            return false;
        }
        String str = this.f35175g;
        if (str == null) {
            if (vu8.f35175g != null) {
                return false;
            }
        } else if (!str.equals(vu8.f35175g)) {
            return false;
        }
        if (!xr8.m54532i(this.f35176k, vu8.f35176k)) {
            return false;
        }
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            return this.f31388d.equals(vu8.f31388d);
        }
        qr8 qr82 = vu8.f31388d;
        return qr82 == null || qr82.mo47262a();
    }

    /* renamed from: f */
    public final int mo29050f() {
        int f = super.mo29050f();
        if (!Arrays.equals(this.f35174e, ws8.f35426h)) {
            f += gr8.m44865i(1, this.f35174e);
        }
        byte[][] bArr = this.f35176k;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f35176k;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += gr8.m44870s(bArr3);
                }
                i++;
            }
            f = f + i2 + (i3 * 1);
        }
        String str = this.f35175g;
        return (str == null || str.equals("")) ? f : f + gr8.m44863g(4, this.f35175g);
    }

    /* renamed from: g */
    public final /* synthetic */ as8 mo29051g() throws CloneNotSupportedException {
        return (vu8) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ lr8 mo45497h() throws CloneNotSupportedException {
        return (vu8) clone();
    }

    public final int hashCode() {
        int hashCode = (((vu8.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f35174e)) * 31;
        String str = this.f35175g;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + xr8.m54530g(this.f35176k)) * 31) + 1237) * 31;
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            i = this.f31388d.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final vu8 clone() {
        try {
            vu8 vu8 = (vu8) super.clone();
            byte[][] bArr = this.f35176k;
            if (bArr != null && bArr.length > 0) {
                vu8.f35176k = (byte[][]) bArr.clone();
            }
            return vu8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
