package wallet.core.jni;

public enum BitcoinSigHashType {
    ALL(1),
    NONE(2),
    SINGLE(3),
    FORK(64),
    FORKBTG(20288);
    
    private final int value;

    private BitcoinSigHashType(int i) {
        this.value = i;
    }

    public static BitcoinSigHashType createFromValue(int i) {
        if (i == 1) {
            return ALL;
        }
        if (i == 2) {
            return NONE;
        }
        if (i == 3) {
            return SINGLE;
        }
        if (i == 64) {
            return FORK;
        }
        if (i != 20288) {
            return null;
        }
        return FORKBTG;
    }

    public native boolean isNone();

    public native boolean isSingle();

    public int value() {
        return this.value;
    }
}
