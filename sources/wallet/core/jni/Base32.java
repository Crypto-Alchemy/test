package wallet.core.jni;

public class Base32 {
    private byte[] bytes;

    private Base32() {
    }

    public static Base32 createFromNative(byte[] bArr) {
        Base32 base32 = new Base32();
        base32.bytes = bArr;
        return base32;
    }

    public static native byte[] decode(String str);

    public static native byte[] decodeWithAlphabet(String str, String str2);

    public static native String encode(byte[] bArr);

    public static native String encodeWithAlphabet(byte[] bArr, String str);
}
