package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

public interface XMSSMTPrivateKey extends PrivateKey {
    XMSSMTPrivateKey extractKeyShard(int i);

    /* synthetic */ int getHeight();

    long getIndex();

    /* synthetic */ int getLayers();

    /* synthetic */ String getTreeDigest();

    long getUsagesRemaining();
}
