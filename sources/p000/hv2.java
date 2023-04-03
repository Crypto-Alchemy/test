package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: hv2 */
/* compiled from: InsecureNonceAesGcmJce */
public final class hv2 {

    /* renamed from: c */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f29739c = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: d */
    public static final ThreadLocal<Cipher> f29740d = new C5940a();

    /* renamed from: a */
    public final SecretKey f29741a;

    /* renamed from: b */
    public final boolean f29742b;

    /* renamed from: hv2$a */
    /* compiled from: InsecureNonceAesGcmJce */
    public class C5940a extends ThreadLocal<Cipher> {
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return cq1.f27858e.mo41605a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public hv2(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (f29739c.isCompatible()) {
            a87.m31749a(bArr.length);
            this.f29741a = new SecretKeySpec(bArr, "AES");
            this.f29742b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m45390c(byte[] bArr) throws GeneralSecurityException {
        return m45391d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m45391d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (!hd6.m45163b() || hd6.m45162a() > 19) {
            return new GCMParameterSpec(128, bArr, i, i2);
        }
        return new IvParameterSpec(bArr, i, i2);
    }

    /* renamed from: a */
    public byte[] mo43401a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int i2;
        if (bArr.length == 12) {
            boolean z = this.f29742b;
            if (z) {
                i = 28;
            } else {
                i = 16;
            }
            if (bArr2.length >= i) {
                int i3 = 0;
                if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec c = m45390c(bArr);
                    ThreadLocal<Cipher> threadLocal = f29740d;
                    threadLocal.get().init(2, this.f29741a, c);
                    if (!(bArr3 == null || bArr3.length == 0)) {
                        threadLocal.get().updateAAD(bArr3);
                    }
                    boolean z2 = this.f29742b;
                    if (z2) {
                        i3 = 12;
                    }
                    if (z2) {
                        i2 = bArr2.length - 12;
                    } else {
                        i2 = bArr2.length;
                    }
                    return threadLocal.get().doFinal(bArr2, i3, i2);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    /* renamed from: b */
    public byte[] mo43402b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int i2;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        } else if (bArr2.length <= 2147483619) {
            boolean z = this.f29742b;
            if (z) {
                i = bArr2.length + 12;
            } else {
                i = bArr2.length;
            }
            byte[] bArr4 = new byte[(i + 16)];
            if (z) {
                System.arraycopy(bArr, 0, bArr4, 0, 12);
            }
            AlgorithmParameterSpec c = m45390c(bArr);
            ThreadLocal<Cipher> threadLocal = f29740d;
            threadLocal.get().init(1, this.f29741a, c);
            if (!(bArr3 == null || bArr3.length == 0)) {
                threadLocal.get().updateAAD(bArr3);
            }
            if (this.f29742b) {
                i2 = 12;
            } else {
                i2 = 0;
            }
            int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i2);
            if (doFinal == bArr2.length + 16) {
                return bArr4;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr2.length)}));
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }
}
