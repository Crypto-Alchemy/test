package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C0714d;
import androidx.lifecycle.C0729l;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Landroidx/lifecycle/l$b;", "invoke", "()Landroidx/lifecycle/l$b;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class SwapMigrationFragment$special$$inlined$viewModels$default$10 extends Lambda implements pc2<C0729l.C0733b> {
    public final /* synthetic */ ef3 $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$special$$inlined$viewModels$default$10(Fragment fragment, ef3 ef3) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = ef3;
    }

    public final C0729l.C0733b invoke() {
        C0729l.C0733b bVar;
        hd7 a = FragmentViewModelLazyKt.m4813d(this.$owner$delegate);
        C0714d dVar = a instanceof C0714d ? (C0714d) a : null;
        if (dVar == null || (bVar = dVar.getDefaultViewModelProviderFactory()) == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        vx2.m53590f(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
        return bVar;
    }
}
