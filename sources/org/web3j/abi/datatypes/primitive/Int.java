package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Int32;

public final class Int extends Number<Integer> {
    public Int(int i) {
        super(Integer.valueOf(i));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public NumericType toSolidityType() {
        return new Int32((long) ((Integer) getValue()).intValue());
    }
}
