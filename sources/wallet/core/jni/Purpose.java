package wallet.core.jni;

public enum Purpose {
    BIP44(44),
    BIP49(49),
    BIP84(84),
    BIP1852(1852);
    
    private final int value;

    private Purpose(int i) {
        this.value = i;
    }

    public static Purpose createFromValue(int i) {
        if (i == 44) {
            return BIP44;
        }
        if (i == 49) {
            return BIP49;
        }
        if (i == 84) {
            return BIP84;
        }
        if (i != 1852) {
            return null;
        }
        return BIP1852;
    }

    public int value() {
        return this.value;
    }
}
