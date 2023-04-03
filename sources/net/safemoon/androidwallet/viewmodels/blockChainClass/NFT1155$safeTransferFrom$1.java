package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155", mo48632f = "NFT1155.kt", mo48633l = {49, 54}, mo48634m = "safeTransferFrom")
/* compiled from: NFT1155.kt */
public final class NFT1155$safeTransferFrom$1 extends ContinuationImpl {
    public double D$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NFT1155 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT1155$safeTransferFrom$1(NFT1155 nft1155, ns0<? super NFT1155$safeTransferFrom$1> ns0) {
        super(ns0);
        this.this$0 = nft1155;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61843k((String) null, (BigInteger) null, (BigInteger) null, this);
    }
}
