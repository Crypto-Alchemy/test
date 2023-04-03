package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Int64;

public final class Long extends Number<Long> {
    public Long(long j) {
        super(Long.valueOf(j));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public NumericType toSolidityType() {
        return new Int64(((Long) getValue()).longValue());
    }
}
