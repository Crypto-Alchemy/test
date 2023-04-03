package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* renamed from: uu4 */
/* compiled from: PrfAesCmac */
public final class uu4 implements tu4 {

    /* renamed from: d */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f34723d = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* renamed from: a */
    public final SecretKey f34724a;

    /* renamed from: b */
    public byte[] f34725b;

    /* renamed from: c */
    public byte[] f34726c;

    public uu4(byte[] bArr) throws GeneralSecurityException {
        a87.m31749a(bArr.length);
        this.f34724a = new SecretKeySpec(bArr, "AES");
        mo48532b();
    }

    /* renamed from: c */
    public static Cipher m53024c() throws GeneralSecurityException {
        if (f34723d.isCompatible()) {
            return cq1.f27858e.mo41605a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public byte[] mo48232a(byte[] bArr, int i) throws GeneralSecurityException {
        boolean z;
        byte[] bArr2;
        if (i <= 16) {
            Cipher c = m53024c();
            c.init(1, this.f34724a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 == bArr.length) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bArr2 = g70.m44639d(bArr, (max - 1) * 16, this.f34725b, 0, 16);
            } else {
                bArr2 = g70.m44640e(C6601ve.m53360a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f34726c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = c.doFinal(g70.m44639d(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(c.doFinal(g70.m44640e(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    /* renamed from: b */
    public final void mo48532b() throws GeneralSecurityException {
        Cipher c = m53024c();
        c.init(1, this.f34724a);
        byte[] b = C6601ve.m53361b(c.doFinal(new byte[16]));
        this.f34725b = b;
        this.f34726c = C6601ve.m53361b(b);
    }
}
