package wallet.core.jni;

public class Hash {
    private byte[] bytes;

    private Hash() {
    }

    public static native byte[] blake256(byte[] bArr);

    public static native byte[] blake256Blake256(byte[] bArr);

    public static native byte[] blake256RIPEMD(byte[] bArr);

    public static native byte[] blake2b(byte[] bArr, int i);

    public static Hash createFromNative(byte[] bArr) {
        Hash hash = new Hash();
        hash.bytes = bArr;
        return hash;
    }

    public static native byte[] groestl512(byte[] bArr);

    public static native byte[] groestl512Groestl512(byte[] bArr);

    public static native byte[] keccak256(byte[] bArr);

    public static native byte[] keccak512(byte[] bArr);

    public static native byte[] ripemd(byte[] bArr);

    public static native byte[] sha1(byte[] bArr);

    public static native byte[] sha256(byte[] bArr);

    public static native byte[] sha256RIPEMD(byte[] bArr);

    public static native byte[] sha256SHA256(byte[] bArr);

    public static native byte[] sha3256(byte[] bArr);

    public static native byte[] sha3256RIPEMD(byte[] bArr);

    public static native byte[] sha3512(byte[] bArr);

    public static native byte[] sha512(byte[] bArr);

    public static native byte[] sha512256(byte[] bArr);
}
