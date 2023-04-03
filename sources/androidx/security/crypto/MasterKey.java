package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public final class MasterKey {

    /* renamed from: a */
    public final String f6934a;

    /* renamed from: b */
    public final KeyGenParameterSpec f6935b;

    public enum KeyScheme {
        AES256_GCM
    }

    /* renamed from: androidx.security.crypto.MasterKey$a */
    public static /* synthetic */ class C1378a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6937a;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            f6937a = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.security.crypto.MasterKey$b */
    public static final class C1379b {

        /* renamed from: a */
        public final String f6938a;

        /* renamed from: b */
        public KeyGenParameterSpec f6939b;

        /* renamed from: c */
        public KeyScheme f6940c;

        /* renamed from: d */
        public boolean f6941d;

        /* renamed from: e */
        public int f6942e;

        /* renamed from: f */
        public boolean f6943f;

        /* renamed from: g */
        public final Context f6944g;

        /* renamed from: androidx.security.crypto.MasterKey$b$a */
        public static class C1380a {

            /* renamed from: androidx.security.crypto.MasterKey$b$a$a */
            public static class C1381a {
                /* renamed from: a */
                public static void m9870a(KeyGenParameterSpec.Builder builder) {
                    io3.m19734a(builder, true);
                }
            }

            /* renamed from: androidx.security.crypto.MasterKey$b$a$b */
            public static class C1382b {
                /* renamed from: a */
                public static void m9871a(KeyGenParameterSpec.Builder builder, int i, int i2) {
                    jo3.m20319a(builder, i, i2);
                }
            }

            /* renamed from: a */
            public static MasterKey m9868a(C1379b bVar) throws GeneralSecurityException, IOException {
                KeyScheme keyScheme = bVar.f6940c;
                if (keyScheme == null && bVar.f6939b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (keyScheme == KeyScheme.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(bVar.f6938a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                    if (bVar.f6941d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C1382b.m9871a(keySize, bVar.f6942e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(bVar.f6942e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && bVar.f6943f && bVar.f6944g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C1381a.m9870a(keySize);
                    }
                    bVar.f6939b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = bVar.f6939b;
                if (keyGenParameterSpec != null) {
                    return new MasterKey(ko3.m20943c(keyGenParameterSpec), bVar.f6939b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            /* renamed from: b */
            public static String m9869b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C1379b(Context context, String str) {
            this.f6944g = context.getApplicationContext();
            this.f6938a = str;
        }

        /* renamed from: a */
        public MasterKey mo10208a() throws GeneralSecurityException, IOException {
            return C1380a.m9868a(this);
        }

        /* renamed from: b */
        public C1379b mo10209b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f6940c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            } else if (this.f6938a.equals(C1380a.m9869b(keyGenParameterSpec))) {
                this.f6939b = keyGenParameterSpec;
                return this;
            } else {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f6938a + " vs " + C1380a.m9869b(keyGenParameterSpec));
            }
        }

        /* renamed from: c */
        public C1379b mo10210c(KeyScheme keyScheme) {
            if (C1378a.f6937a[keyScheme.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
            } else if (this.f6939b == null) {
                this.f6940c = keyScheme;
                return this;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }
    }

    public MasterKey(String str, Object obj) {
        this.f6934a = str;
        this.f6935b = (KeyGenParameterSpec) obj;
    }

    /* renamed from: a */
    public String mo10205a() {
        return this.f6934a;
    }

    /* renamed from: b */
    public boolean mo10206b() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(this.f6934a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f6934a + ", isKeyStoreBacked=" + mo10206b() + "}";
    }
}
