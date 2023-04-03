package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.NumericType;

public class Float extends Number<Float> {
    public Float(float f) {
        super(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public NumericType toSolidityType() {
        throw new UnsupportedOperationException("Fixed types are not supported");
    }
}
