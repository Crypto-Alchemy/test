package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: re */
/* compiled from: AesSiv */
public final class C6435re implements ge1 {

    /* renamed from: c */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f33409c = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* renamed from: d */
    public static final Collection<Integer> f33410d = Arrays.asList(new Integer[]{64});

    /* renamed from: e */
    public static final byte[] f33411e = new byte[16];

    /* renamed from: f */
    public static final byte[] f33412f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final uu4 f33413a;

    /* renamed from: b */
    public final byte[] f33414b;

    public C6435re(byte[] bArr) throws GeneralSecurityException {
        if (!f33409c.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (f33410d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f33414b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f33413a = new uu4(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    /* renamed from: a */
    public byte[] mo42881a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher a = cq1.f27858e.mo41605a("AES/CTR/NoPadding");
            byte[] c = mo47390c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.f33414b, "AES"), new IvParameterSpec(bArr3));
            return g70.m44636a(c, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo42882b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 16) {
            Cipher a = cq1.f27858e.mo41605a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.f33414b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && hd6.m45163b()) {
                doFinal = new byte[0];
            }
            if (g70.m44637b(copyOfRange, mo47390c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    /* renamed from: c */
    public final byte[] mo47390c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.f33413a.mo48232a(f33412f, 16);
        }
        byte[] a = this.f33413a.mo48232a(f33411e, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr3 = bArr[i];
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            a = g70.m44640e(C6601ve.m53361b(a), this.f33413a.mo48232a(bArr3, 16));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            bArr2 = g70.m44641f(bArr4, a);
        } else {
            bArr2 = g70.m44640e(C6601ve.m53360a(bArr4), C6601ve.m53361b(a));
        }
        return this.f33413a.mo48232a(bArr2, 16);
    }
}
