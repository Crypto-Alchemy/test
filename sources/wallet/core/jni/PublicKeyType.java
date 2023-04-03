package wallet.core.jni;

public enum PublicKeyType {
    SECP256K1(0),
    SECP256K1EXTENDED(1),
    NIST256P1(2),
    NIST256P1EXTENDED(3),
    ED25519(4),
    ED25519BLAKE2B(5),
    CURVE25519(6),
    ED25519CARDANO(7);
    
    private final int value;

    private PublicKeyType(int i) {
        this.value = i;
    }

    public static PublicKeyType createFromValue(int i) {
        switch (i) {
            case 0:
                return SECP256K1;
            case 1:
                return SECP256K1EXTENDED;
            case 2:
                return NIST256P1;
            case 3:
                return NIST256P1EXTENDED;
            case 4:
                return ED25519;
            case 5:
                return ED25519BLAKE2B;
            case 6:
                return CURVE25519;
            case 7:
                return ED25519CARDANO;
            default:
                return null;
        }
    }

    public int value() {
        return this.value;
    }
}
