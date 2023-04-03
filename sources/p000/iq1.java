package p000;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: iq1 */
/* compiled from: EngineWrapper */
public interface iq1<T> {

    /* renamed from: iq1$a */
    /* compiled from: EngineWrapper */
    public static class C5994a implements iq1<Cipher> {
        /* renamed from: b */
        public Cipher mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$b */
    /* compiled from: EngineWrapper */
    public static class C5995b implements iq1<KeyAgreement> {
        /* renamed from: b */
        public KeyAgreement mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$c */
    /* compiled from: EngineWrapper */
    public static class C5996c implements iq1<KeyFactory> {
        /* renamed from: b */
        public KeyFactory mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$d */
    /* compiled from: EngineWrapper */
    public static class C5997d implements iq1<KeyPairGenerator> {
        /* renamed from: b */
        public KeyPairGenerator mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$e */
    /* compiled from: EngineWrapper */
    public static class C5998e implements iq1<Mac> {
        /* renamed from: b */
        public Mac mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$f */
    /* compiled from: EngineWrapper */
    public static class C5999f implements iq1<MessageDigest> {
        /* renamed from: b */
        public MessageDigest mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: iq1$g */
    /* compiled from: EngineWrapper */
    public static class C6000g implements iq1<Signature> {
        /* renamed from: b */
        public Signature mo43886a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo43886a(String str, Provider provider) throws GeneralSecurityException;
}
