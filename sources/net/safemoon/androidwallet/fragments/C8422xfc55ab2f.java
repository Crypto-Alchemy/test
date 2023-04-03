package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Lzv0;", "invoke", "()Lzv0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.fragments.ReflectionsFragment$special$$inlined$activityViewModels$default$2 */
/* compiled from: FragmentViewModelLazy.kt */
public final class C8422xfc55ab2f extends Lambda implements pc2<zv0> {
    public final /* synthetic */ pc2 $extrasProducer;
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8422xfc55ab2f(pc2 pc2, Fragment fragment) {
        super(0);
        this.$extrasProducer = pc2;
        this.$this_activityViewModels = fragment;
    }

    public final zv0 invoke() {
        zv0 zv0;
        pc2 pc2 = this.$extrasProducer;
        if (pc2 != null && (zv0 = (zv0) pc2.invoke()) != null) {
            return zv0;
        }
        zv0 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        vx2.m53590f(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
