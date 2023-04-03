package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lac5;", "invoke", "()Lac5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$registerDeviceTokenUseCase$2 extends Lambda implements pc2<ac5> {
    public final /* synthetic */ MultiWalletViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$registerDeviceTokenUseCase$2(MultiWalletViewModel multiWalletViewModel) {
        super(0);
        this.this$0 = multiWalletViewModel;
    }

    public final ac5 invoke() {
        tk5 o = C9384u3.m72574o();
        vx2.m53590f(o, "getSafeMoonClient()");
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        return new ac5(o, b);
    }
}
