package androidx.fragment.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Lzv0;", "invoke", "()Lzv0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt$createViewModelLazy$1 extends Lambda implements pc2<zv0> {
    public final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$1(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    public final zv0 invoke() {
        zv0 defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
        vx2.m53590f(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
