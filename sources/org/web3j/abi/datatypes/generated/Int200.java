package org.web3j.abi.datatypes.generated;

import com.google.mlkit.common.MlKitException;
import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int200 extends Int {
    public static final Int200 DEFAULT = new Int200(BigInteger.ZERO);

    public Int200(BigInteger bigInteger) {
        super(MlKitException.CODE_SCANNER_UNAVAILABLE, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int200(long j) {
        this(BigInteger.valueOf(j));
    }
}
