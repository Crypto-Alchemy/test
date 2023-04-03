package net.safemoon.androidwallet.model.collectible;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/TYPE_DELETE_NFT;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "VISIBLE", "HIDE", "DELETE_FOREVER", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TYPE_DELETE_NFT.kt */
public enum TYPE_DELETE_NFT {
    VISIBLE(0),
    HIDE(1),
    DELETE_FOREVER(2);
    
    private final int value;

    private TYPE_DELETE_NFT(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
