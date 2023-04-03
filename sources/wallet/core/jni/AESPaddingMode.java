package wallet.core.jni;

public enum AESPaddingMode {
    ZERO(0),
    PKCS7(1);
    
    private final int value;

    private AESPaddingMode(int i) {
        this.value = i;
    }

    public static AESPaddingMode createFromValue(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i != 1) {
            return null;
        }
        return PKCS7;
    }

    public int value() {
        return this.value;
    }
}
