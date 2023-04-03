package org.web3j.abi.datatypes.generated;

import com.google.mlkit.common.MlKitException;
import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint200 extends Uint {
    public static final Uint200 DEFAULT = new Uint200(BigInteger.ZERO);

    public Uint200(BigInteger bigInteger) {
        super(MlKitException.CODE_SCANNER_UNAVAILABLE, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint200(long j) {
        this(BigInteger.valueOf(j));
    }
}
