package p000;

import java.net.IDN;
import java.util.Arrays;
import org.web3j.ens.EnsResolutionException;

/* renamed from: s24 */
/* compiled from: NameHash */
public class s24 {
    private static final byte[] EMPTY = new byte[32];

    public static String nameHash(String str) {
        return pc4.toHexString(nameHash(normalise(str).split("\\.")));
    }

    public static byte[] nameHashAsBytes(String str) {
        return pc4.hexStringToByteArray(nameHash(str));
    }

    public static String normalise(String str) {
        try {
            return IDN.toASCII(str, 2).toLowerCase();
        } catch (IllegalArgumentException unused) {
            throw new EnsResolutionException("Invalid ENS name provided: " + str);
        }
    }

    private static byte[] nameHash(String[] strArr) {
        String[] strArr2;
        if (strArr.length == 0 || strArr[0].equals("")) {
            return EMPTY;
        }
        if (strArr.length == 1) {
            strArr2 = new String[0];
        } else {
            strArr2 = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
        }
        byte[] copyOf = Arrays.copyOf(nameHash(strArr2), 64);
        byte[] sha3 = jl2.sha3(strArr[0].getBytes(yl0.UTF_8));
        System.arraycopy(sha3, 0, copyOf, 32, sha3.length);
        return jl2.sha3(copyOf);
    }
}
