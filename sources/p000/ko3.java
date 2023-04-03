package p000;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@Deprecated
/* renamed from: ko3 */
/* compiled from: MasterKeys */
public final class ko3 {

    /* renamed from: a */
    public static final KeyGenParameterSpec f14239a = m20941a("_androidx_security_master_key_");

    /* renamed from: a */
    public static KeyGenParameterSpec m20941a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
    }

    /* renamed from: b */
    public static void m20942b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(keyGenParameterSpec);
            instance.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m20943c(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        m20945e(keyGenParameterSpec);
        if (!m20944d(keyGenParameterSpec.getKeystoreAlias())) {
            m20942b(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    public static boolean m20944d(String str) throws GeneralSecurityException, IOException {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance.containsAlias(str);
    }

    /* renamed from: e */
    public static void m20945e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        } else if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }
}
