package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: sp1 */
/* compiled from: EncryptThenAuthenticate */
public final class sp1 implements C5954id {

    /* renamed from: a */
    public final pt2 f33976a;

    /* renamed from: b */
    public final lm3 f33977b;

    /* renamed from: c */
    public final int f33978c;

    public sp1(pt2 pt2, lm3 lm3, int i) {
        this.f33976a = pt2;
        this.f33977b = lm3;
        this.f33978c = i;
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f33976a.mo46879a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return g70.m44636a(a, this.f33977b.mo45450b(g70.m44636a(bArr2, a, copyOf)));
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f33978c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f33978c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f33977b.mo45449a(copyOfRange2, g70.m44636a(bArr2, copyOfRange, copyOf));
            return this.f33976a.mo46880b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
