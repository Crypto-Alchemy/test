package p000;

import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

@Immutable
/* renamed from: e70 */
/* compiled from: Bytes */
public final class e70 {

    /* renamed from: a */
    public final byte[] f28411a;

    public e70(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f28411a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static e70 m43803a(byte[] bArr) {
        if (bArr != null) {
            return m43804b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: b */
    public static e70 m43804b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new e70(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: c */
    public int mo42138c() {
        return this.f28411a.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e70)) {
            return false;
        }
        return Arrays.equals(((e70) obj).f28411a, this.f28411a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28411a);
    }

    public String toString() {
        return "Bytes(" + yl2.m54811b(this.f28411a) + ")";
    }
}
