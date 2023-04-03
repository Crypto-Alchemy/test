package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lel5;", "invoke", "()Lel5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandlesProvider$viewModel$2 extends Lambda implements pc2<el5> {
    public final /* synthetic */ hd7 $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(hd7 hd7) {
        super(0);
        this.$viewModelStoreOwner = hd7;
    }

    public final el5 invoke() {
        return SavedStateHandleSupport.m5077e(this.$viewModelStoreOwner);
    }
}
