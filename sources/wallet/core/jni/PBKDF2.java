package wallet.core.jni;

public class PBKDF2 {
    private byte[] bytes;

    private PBKDF2() {
    }

    public static PBKDF2 createFromNative(byte[] bArr) {
        PBKDF2 pbkdf2 = new PBKDF2();
        pbkdf2.bytes = bArr;
        return pbkdf2;
    }

    public static native byte[] hmacSha256(byte[] bArr, byte[] bArr2, int i, int i2);

    public static native byte[] hmacSha512(byte[] bArr, byte[] bArr2, int i, int i2);
}
