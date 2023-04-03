package p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: jl2 */
/* compiled from: Hash */
public class jl2 {
    private jl2() {
    }

    public static byte[] blake2b256(byte[] bArr) {
        return new f30().digest(bArr);
    }

    public static byte[] hash(byte[] bArr, String str) {
        try {
            return MessageDigest.getInstance(str.toUpperCase()).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Couldn't find a " + str + " provider", e);
        }
    }

    public static byte[] hmacSha512(byte[] bArr, byte[] bArr2) {
        lk2 lk2 = new lk2(new fj5());
        lk2.mo50314c(new va3(bArr));
        lk2.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[64];
        lk2.mo50312a(bArr3, 0);
        return bArr3;
    }

    public static byte[] sha256(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Couldn't find a SHA-256 provider", e);
        }
    }

    public static byte[] sha256hash160(byte[] bArr) {
        byte[] sha256 = sha256(bArr);
        l65 l65 = new l65();
        l65.update(sha256, 0, sha256.length);
        byte[] bArr2 = new byte[20];
        l65.mo50198a(bArr2, 0);
        return bArr2;
    }

    public static String sha3(String str) {
        return pc4.toHexString(sha3(pc4.hexStringToByteArray(str)));
    }

    public static String sha3String(String str) {
        return pc4.toHexString(sha3(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static byte[] sha3(byte[] bArr, int i, int i2) {
        s93 s93 = new s93();
        s93.update(bArr, i, i2);
        return s93.digest();
    }

    public static byte[] sha3(byte[] bArr) {
        return sha3(bArr, 0, bArr.length);
    }
}
