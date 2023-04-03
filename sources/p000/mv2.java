package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: mv2 */
/* compiled from: InsecureNonceXChaCha20 */
public class mv2 extends jv2 {
    public mv2(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: g */
    public static int[] m48505g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        sc0.m51707c(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        sc0.m51708d(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* renamed from: b */
    public int[] mo43953b(int[] iArr, int i) {
        if (iArr.length == mo43956e() / 4) {
            int[] iArr2 = new int[16];
            sc0.m51707c(iArr2, m48505g(this.f30651a, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ byte[] mo43954c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.mo43954c(bArr, byteBuffer);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo43955d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.mo43955d(byteBuffer, bArr, bArr2);
    }

    /* renamed from: e */
    public int mo43956e() {
        return 24;
    }
}
