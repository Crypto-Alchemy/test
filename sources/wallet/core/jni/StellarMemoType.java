package wallet.core.jni;

public enum StellarMemoType {
    NONE(0),
    TEXT(1),
    ID(2),
    HASH(3),
    RETURN(4);
    
    private final int value;

    private StellarMemoType(int i) {
        this.value = i;
    }

    public static StellarMemoType createFromValue(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return TEXT;
        }
        if (i == 2) {
            return ID;
        }
        if (i == 3) {
            return HASH;
        }
        if (i != 4) {
            return null;
        }
        return RETURN;
    }

    public int value() {
        return this.value;
    }
}
