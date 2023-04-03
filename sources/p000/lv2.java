package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* renamed from: lv2 */
/* compiled from: InsecureNonceChaCha20Poly1305Base */
public abstract class lv2 {

    /* renamed from: c */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f31416c = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* renamed from: a */
    public final jv2 f31417a;

    /* renamed from: b */
    public final jv2 f31418b;

    public lv2(byte[] bArr) throws GeneralSecurityException {
        if (f31416c.isCompatible()) {
            this.f31417a = mo45300e(bArr, 1);
            this.f31418b = mo45300e(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: d */
    public static byte[] m47953d(byte[] bArr, ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (bArr.length % 16 == 0) {
            i = bArr.length;
        } else {
            i = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        if (i3 == 0) {
            i2 = remaining;
        } else {
            i2 = (remaining + 16) - i3;
        }
        int i4 = i2 + i;
        ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i);
        order.put(byteBuffer);
        order.position(i4);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* renamed from: a */
    public byte[] mo45298a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                bs4.m32702f(mo45537c(bArr), m47953d(bArr2, byteBuffer), bArr3);
                byteBuffer.position(position);
                return this.f31417a.mo43954c(bArr, byteBuffer);
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: b */
    public void mo45299b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f31417a.mo43955d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] a = bs4.m32697a(mo45537c(bArr), m47953d(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] mo45537c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f31418b.mo44618a(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: e */
    public abstract jv2 mo45300e(byte[] bArr, int i) throws InvalidKeyException;
}
