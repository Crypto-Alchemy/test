package androidx.biometric;

import android.annotation.SuppressLint;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.BiometricPrompt;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import p000.a22;

/* renamed from: androidx.biometric.f */
/* compiled from: CryptoObjectUtils */
public class C0319f {

    /* renamed from: androidx.biometric.f$a */
    /* compiled from: CryptoObjectUtils */
    public static class C0320a {
        /* renamed from: a */
        public static KeyGenParameterSpec m1767a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static KeyGenParameterSpec.Builder m1768b(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        /* renamed from: c */
        public static void m1769c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        /* renamed from: d */
        public static void m1770d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(new String[]{"CBC"});
        }

        /* renamed from: e */
        public static void m1771e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
        }
    }

    /* renamed from: androidx.biometric.f$b */
    /* compiled from: CryptoObjectUtils */
    public static class C0321b {
        /* renamed from: a */
        public static BiometricPrompt.CryptoObject m1772a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        /* renamed from: b */
        public static BiometricPrompt.CryptoObject m1773b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        /* renamed from: c */
        public static BiometricPrompt.CryptoObject m1774c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        /* renamed from: d */
        public static Cipher m1775d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        /* renamed from: e */
        public static Mac m1776e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        /* renamed from: f */
        public static Signature m1777f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* renamed from: androidx.biometric.f$c */
    /* compiled from: CryptoObjectUtils */
    public static class C0322c {
        /* renamed from: a */
        public static BiometricPrompt.CryptoObject m1778a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        /* renamed from: b */
        public static IdentityCredential m1779b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: a */
    public static BiometricPrompt.C0279c m1762a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b = C0320a.m1768b("androidxBiometric", 3);
            C0320a.m1770d(b);
            C0320a.m1771e(b);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            C0320a.m1769c(instance2, C0320a.m1767a(b));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new BiometricPrompt.C0279c(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static BiometricPrompt.C0279c m1763b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential b;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d = C0321b.m1775d(cryptoObject);
        if (d != null) {
            return new BiometricPrompt.C0279c(d);
        }
        Signature f = C0321b.m1777f(cryptoObject);
        if (f != null) {
            return new BiometricPrompt.C0279c(f);
        }
        Mac e = C0321b.m1776e(cryptoObject);
        if (e != null) {
            return new BiometricPrompt.C0279c(e);
        }
        if (Build.VERSION.SDK_INT < 30 || (b = C0322c.m1779b(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.C0279c(b);
    }

    /* renamed from: c */
    public static BiometricPrompt.C0279c m1764c(a22.C0006e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher a = eVar.mo30a();
        if (a != null) {
            return new BiometricPrompt.C0279c(a);
        }
        Signature c = eVar.mo32c();
        if (c != null) {
            return new BiometricPrompt.C0279c(c);
        }
        Mac b = eVar.mo31b();
        if (b != null) {
            return new BiometricPrompt.C0279c(b);
        }
        return null;
    }

    /* renamed from: d */
    public static BiometricPrompt.CryptoObject m1765d(BiometricPrompt.C0279c cVar) {
        IdentityCredential b;
        if (cVar == null) {
            return null;
        }
        Cipher a = cVar.mo2634a();
        if (a != null) {
            return C0321b.m1773b(a);
        }
        Signature d = cVar.mo2637d();
        if (d != null) {
            return C0321b.m1772a(d);
        }
        Mac c = cVar.mo2636c();
        if (c != null) {
            return C0321b.m1774c(c);
        }
        if (Build.VERSION.SDK_INT < 30 || (b = cVar.mo2635b()) == null) {
            return null;
        }
        return C0322c.m1778a(b);
    }

    /* renamed from: e */
    public static a22.C0006e m1766e(BiometricPrompt.C0279c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher a = cVar.mo2634a();
        if (a != null) {
            return new a22.C0006e(a);
        }
        Signature d = cVar.mo2637d();
        if (d != null) {
            return new a22.C0006e(d);
        }
        Mac c = cVar.mo2636c();
        if (c != null) {
            return new a22.C0006e(c);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            cVar.mo2635b();
        }
        return null;
    }
}
