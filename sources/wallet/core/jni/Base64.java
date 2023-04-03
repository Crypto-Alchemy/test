package wallet.core.jni;

public class Base64 {
    private byte[] bytes;

    private Base64() {
    }

    public static Base64 createFromNative(byte[] bArr) {
        Base64 base64 = new Base64();
        base64.bytes = bArr;
        return base64;
    }

    public static native byte[] decode(String str);

    public static native byte[] decodeUrl(String str);

    public static native String encode(byte[] bArr);

    public static native String encodeUrl(byte[] bArr);
}
