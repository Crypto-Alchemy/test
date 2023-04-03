package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: oc0 */
/* compiled from: ChaCha20Poly1305 */
public final class oc0 implements C5954id {

    /* renamed from: a */
    public final kv2 f32353a;

    public oc0(byte[] bArr) throws GeneralSecurityException {
        this.f32353a = new kv2(bArr);
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] c = y65.m54637c(12);
        allocate.put(c);
        this.f32353a.mo45299b(allocate, c, bArr, bArr2);
        return allocate.array();
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f32353a.mo45298a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
