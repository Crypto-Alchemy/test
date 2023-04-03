package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(I)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleFragment.kt */
public final class CollectibleFragment$onViewCreated$2$7$1 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ CollectibleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleFragment$onViewCreated$2$7$1(CollectibleFragment collectibleFragment) {
        super(1);
        this.this$0 = collectibleFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return r37.f33317a;
    }

    public final void invoke(int i) {
        switch (i) {
            case R.id.btnHiddenCollections:
                this.this$0.mo57959L().mo61057h0();
                return;
            case R.id.btnHideCollections:
                this.this$0.mo57959L().mo61046O().postValue(Boolean.valueOf(!vx2.m53586b(this.this$0.mo57959L().mo61046O().getValue(), Boolean.TRUE)));
                return;
            default:
                return;
        }
    }
}
