package net.safemoon.androidwallet.repository.dataSource.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource", mo48632f = "NftDataSource.kt", mo48633l = {101, 109}, mo48634m = "clearCacheForSolana")
/* compiled from: NftDataSource.kt */
public final class NftDataSource$clearCacheForSolana$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NftDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NftDataSource$clearCacheForSolana$1(NftDataSource nftDataSource, ns0<? super NftDataSource$clearCacheForSolana$1> ns0) {
        super(ns0);
        this.this$0 = nftDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60800a((List<SolanaNfts>) null, 0, this);
    }
}
