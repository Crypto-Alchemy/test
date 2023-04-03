package wallet.core.jni;

public enum StoredKeyEncryption {
    AES128CTR(0),
    AES128CBC(1),
    AES192CTR(2),
    AES256CTR(3);
    
    private final int value;

    private StoredKeyEncryption(int i) {
        this.value = i;
    }

    public static StoredKeyEncryption createFromValue(int i) {
        if (i == 0) {
            return AES128CTR;
        }
        if (i == 1) {
            return AES128CBC;
        }
        if (i == 2) {
            return AES192CTR;
        }
        if (i != 3) {
            return null;
        }
        return AES256CTR;
    }

    public int value() {
        return this.value;
    }
}
