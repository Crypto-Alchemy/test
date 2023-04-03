package p000;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ne */
/* compiled from: AesGcmSiv */
public final class C6281ne implements C5954id {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f32101b = new C6282a();

    /* renamed from: a */
    public final SecretKey f32102a;

    /* renamed from: ne$a */
    /* compiled from: AesGcmSiv */
    public class C6282a extends ThreadLocal<Cipher> {
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return cq1.f27858e.mo41605a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C6281ne(byte[] bArr) throws GeneralSecurityException {
        a87.m31749a(bArr.length);
        this.f32102a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m48744c(byte[] bArr) throws GeneralSecurityException {
        return m48745d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m48745d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i, i2);
        } catch (ClassNotFoundException unused) {
            if (hd6.m45163b()) {
                return new IvParameterSpec(bArr, i, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] c = y65.m54637c(12);
            System.arraycopy(c, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c2 = m48744c(c);
            ThreadLocal<Cipher> threadLocal = f32101b;
            threadLocal.get().init(1, this.f32102a, c2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec d = m48745d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f32101b;
            threadLocal.get().init(2, this.f32102a, d);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
