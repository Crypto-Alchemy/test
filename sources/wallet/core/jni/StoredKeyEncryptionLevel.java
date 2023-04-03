package wallet.core.jni;

public enum StoredKeyEncryptionLevel {
    DEFAULT(0),
    MINIMAL(1),
    WEAK(2),
    STANDARD(3);
    
    private final int value;

    private StoredKeyEncryptionLevel(int i) {
        this.value = i;
    }

    public static StoredKeyEncryptionLevel createFromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return MINIMAL;
        }
        if (i == 2) {
            return WEAK;
        }
        if (i != 3) {
            return null;
        }
        return STANDARD;
    }

    public int value() {
        return this.value;
    }
}
