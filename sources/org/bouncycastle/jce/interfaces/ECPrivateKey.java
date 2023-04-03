package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public interface ECPrivateKey extends PrivateKey {
    BigInteger getD();

    /* synthetic */ mm1 getParameters();
}
