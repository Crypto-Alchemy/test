package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Int16;

public final class Short extends Number<Short> {
    public Short(short s) {
        super(Short.valueOf(s));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public NumericType toSolidityType() {
        return new Int16((long) ((Short) getValue()).shortValue());
    }
}
