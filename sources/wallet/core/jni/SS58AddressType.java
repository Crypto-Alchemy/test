package wallet.core.jni;

public enum SS58AddressType {
    POLKADOT((byte) 0),
    KUSAMA((byte) 2);
    
    private final byte value;

    private SS58AddressType(byte b) {
        this.value = b;
    }

    public static SS58AddressType createFromValue(byte b) {
        if (b == 0) {
            return POLKADOT;
        }
        if (b != 2) {
            return null;
        }
        return KUSAMA;
    }

    public byte value() {
        return this.value;
    }
}
