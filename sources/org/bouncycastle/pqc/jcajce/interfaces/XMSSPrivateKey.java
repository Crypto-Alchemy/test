package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

public interface XMSSPrivateKey extends PrivateKey {
    XMSSPrivateKey extractKeyShard(int i);

    /* synthetic */ int getHeight();

    long getIndex();

    /* synthetic */ String getTreeDigest();

    long getUsagesRemaining();
}
