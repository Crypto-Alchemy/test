package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: kv2 */
/* compiled from: InsecureNonceChaCha20Poly1305 */
public final class kv2 extends lv2 {
    public kv2(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ byte[] mo45298a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.mo45298a(byteBuffer, bArr, bArr2);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo45299b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.mo45299b(byteBuffer, bArr, bArr2, bArr3);
    }

    /* renamed from: e */
    public jv2 mo45300e(byte[] bArr, int i) throws InvalidKeyException {
        return new iv2(bArr, i);
    }
}
