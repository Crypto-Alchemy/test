package wallet.core.jni;

public class AES {
    private byte[] bytes;

    private AES() {
    }

    public static AES createFromNative(byte[] bArr) {
        AES aes = new AES();
        aes.bytes = bArr;
        return aes;
    }

    public static native byte[] decryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3, AESPaddingMode aESPaddingMode);

    public static native byte[] decryptCTR(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] encryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3, AESPaddingMode aESPaddingMode);

    public static native byte[] encryptCTR(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
