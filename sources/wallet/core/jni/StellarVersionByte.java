package wallet.core.jni;

public enum StellarVersionByte {
    ACCOUNTID(48),
    SEED(192),
    PREAUTHTX(200),
    SHA256HASH(280);
    
    private final short value;

    private StellarVersionByte(short s) {
        this.value = s;
    }

    public static StellarVersionByte createFromValue(short s) {
        if (s == 48) {
            return ACCOUNTID;
        }
        if (s == 192) {
            return SEED;
        }
        if (s == 200) {
            return PREAUTHTX;
        }
        if (s != 280) {
            return null;
        }
        return SHA256HASH;
    }

    public short value() {
        return this.value;
    }
}
