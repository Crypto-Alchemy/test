package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: jv2 */
/* compiled from: InsecureNonceChaCha20Base */
public abstract class jv2 {

    /* renamed from: a */
    public int[] f30651a;

    /* renamed from: b */
    public final int f30652b;

    public jv2(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f30651a = sc0.m51709e(bArr);
            this.f30652b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public ByteBuffer mo44618a(byte[] bArr, int i) {
        int[] b = mo43953b(sc0.m51709e(bArr), i);
        int[] iArr = (int[]) b.clone();
        sc0.m51708d(iArr);
        for (int i2 = 0; i2 < b.length; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: b */
    public abstract int[] mo43953b(int[] iArr, int i);

    /* renamed from: c */
    public byte[] mo43954c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        mo44619f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    /* renamed from: d */
    public void mo43955d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            mo44619f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    public abstract int mo43956e();

    /* renamed from: f */
    public final void mo44619f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == mo43956e()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a = mo44618a(bArr, this.f30652b + i2);
                if (i2 == i - 1) {
                    g70.m44638c(byteBuffer, byteBuffer2, a, remaining % 64);
                } else {
                    g70.m44638c(byteBuffer, byteBuffer2, a, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo43956e());
    }
}
