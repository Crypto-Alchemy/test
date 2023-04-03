package net.safemoon.androidwallet.fragments.collectibles;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C0714d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.zv0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Lzv0;", "invoke", "()Lzv0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class CollectibleFragment$special$$inlined$viewModels$default$4 extends Lambda implements pc2<zv0> {
    public final /* synthetic */ pc2 $extrasProducer;
    public final /* synthetic */ ef3 $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleFragment$special$$inlined$viewModels$default$4(pc2 pc2, ef3 ef3) {
        super(0);
        this.$extrasProducer = pc2;
        this.$owner$delegate = ef3;
    }

    public final zv0 invoke() {
        zv0 zv0;
        pc2 pc2 = this.$extrasProducer;
        if (pc2 != null && (zv0 = (zv0) pc2.invoke()) != null) {
            return zv0;
        }
        hd7 a = FragmentViewModelLazyKt.m4813d(this.$owner$delegate);
        C0714d dVar = a instanceof C0714d ? (C0714d) a : null;
        zv0 defaultViewModelCreationExtras = dVar != null ? dVar.getDefaultViewModelCreationExtras() : null;
        return defaultViewModelCreationExtras == null ? zv0.C3764a.f20690b : defaultViewModelCreationExtras;
    }
}
