package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: jo7 */
/* compiled from: XChaCha20Poly1305 */
public final class jo7 implements C5954id {

    /* renamed from: a */
    public final nv2 f30550a;

    public jo7(byte[] bArr) throws GeneralSecurityException {
        this.f30550a = new nv2(bArr);
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] c = y65.m54637c(24);
        allocate.put(c);
        this.f30550a.mo45299b(allocate, c, bArr, bArr2);
        return allocate.array();
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f30550a.mo45298a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
