package wallet.core.jni;

public enum PrivateKeyType {
    DEFAULT(0),
    CARDANO(1);
    
    private final int value;

    private PrivateKeyType(int i) {
        this.value = i;
    }

    public static PrivateKeyType createFromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return CARDANO;
    }

    public int value() {
        return this.value;
    }
}
