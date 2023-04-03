package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ri */
/* compiled from: AndroidKeystoreAesGcm */
public final class C6439ri implements C5954id {

    /* renamed from: a */
    public final SecretKey f33439a;

    public C6439ri(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f33439a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
    }

    /* renamed from: e */
    public static void m51101e() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return mo47419d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            m51101e();
            return mo47419d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return mo47418c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            m51101e();
            return mo47418c(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] mo47418c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f33439a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] mo47419d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f33439a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
