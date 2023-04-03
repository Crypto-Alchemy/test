package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.NumericType;

public final class Double extends Number<Double> {
    public Double(double d) {
        super(Double.valueOf(d));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public NumericType toSolidityType() {
        throw new UnsupportedOperationException("Fixed types are not supported");
    }
}
