package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import java.security.PrivateKey;

public interface NHPrivateKey extends Key, PrivateKey {
    short[] getSecretData();
}
