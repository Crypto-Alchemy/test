package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel", mo48632f = "CollectibleViewModel.kt", mo48633l = {688, 712, 715}, mo48634m = "fetchNFTsBySlug")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$fetchNFTsBySlug$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$fetchNFTsBySlug$1(CollectibleViewModel collectibleViewModel, ns0<? super CollectibleViewModel$fetchNFTsBySlug$1> ns0) {
        super(ns0);
        this.this$0 = collectibleViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61068v(0, 0, (String) null, 0, 0, this);
    }
}
