package org.web3j.crypto.transaction.type;

public enum TransactionType {
    LEGACY((String) null),
    EIP1559((byte) 2);
    
    public Byte type;

    private TransactionType(Byte b) {
        this.type = b;
    }

    public Byte getRlpType() {
        return this.type;
    }

    public boolean isEip1559() {
        return equals(EIP1559);
    }

    public boolean isLegacy() {
        return equals(LEGACY);
    }
}
