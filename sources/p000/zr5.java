package p000;

import java.security.SecureRandom;
import org.web3j.crypto.LinuxSecureRandom;

/* renamed from: zr5 */
/* compiled from: SecureRandomUtils */
public final class zr5 {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private static int isAndroid = -1;

    static {
        if (isAndroidRuntime()) {
            new LinuxSecureRandom();
        }
    }

    private zr5() {
    }

    public static boolean isAndroidRuntime() {
        int i;
        if (isAndroid == -1) {
            String property = System.getProperty("java.runtime.name");
            if (property == null || !property.equals("Android Runtime")) {
                i = 0;
            } else {
                i = 1;
            }
            isAndroid = i;
        }
        if (isAndroid == 1) {
            return true;
        }
        return false;
    }

    public static SecureRandom secureRandom() {
        return SECURE_RANDOM;
    }
}
