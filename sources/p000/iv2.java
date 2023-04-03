package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: iv2 */
/* compiled from: InsecureNonceChaCha20 */
public class iv2 extends jv2 {
    public iv2(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: b */
    public int[] mo43953b(int[] iArr, int i) {
        if (iArr.length == mo43956e() / 4) {
            int[] iArr2 = new int[16];
            sc0.m51707c(iArr2, this.f30651a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
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
        return 12;
    }
}
