package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: zd */
/* compiled from: AesCtrJceCipher */
public final class C6763zd implements pt2 {

    /* renamed from: d */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f36114d = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e */
    public static final ThreadLocal<Cipher> f36115e = new C6764a();

    /* renamed from: a */
    public final SecretKeySpec f36116a;

    /* renamed from: b */
    public final int f36117b;

    /* renamed from: c */
    public final int f36118c;

    /* renamed from: zd$a */
    /* compiled from: AesCtrJceCipher */
    public class C6764a extends ThreadLocal<Cipher> {
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return cq1.f27858e.mo41605a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C6763zd(byte[] bArr, int i) throws GeneralSecurityException {
        if (f36114d.isCompatible()) {
            a87.m31749a(bArr.length);
            this.f36116a = new SecretKeySpec(bArr, "AES");
            int blockSize = f36115e.get().getBlockSize();
            this.f36118c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f36117b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public byte[] mo46879a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f36117b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] c = y65.m54637c(i);
            System.arraycopy(c, 0, bArr2, 0, this.f36117b);
            mo49818c(bArr, 0, bArr.length, bArr2, this.f36117b, c, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f36117b));
    }

    /* renamed from: b */
    public byte[] mo46880b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f36117b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f36117b;
            byte[] bArr3 = new byte[(length2 - i2)];
            mo49818c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: c */
    public final void mo49818c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = f36115e.get();
        byte[] bArr4 = new byte[this.f36118c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f36117b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f36116a, ivParameterSpec);
        } else {
            cipher.init(2, this.f36116a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
