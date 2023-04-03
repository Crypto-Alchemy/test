package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lxy0;", "invoke", "()Lxy0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel$customTokenDataSource$2 extends Lambda implements pc2<xy0> {
    public final /* synthetic */ CustomContractTokenViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomContractTokenViewModel$customTokenDataSource$2(CustomContractTokenViewModel customContractTokenViewModel) {
        super(0);
        this.this$0 = customContractTokenViewModel;
    }

    public final xy0 invoke() {
        yy0 yy0 = yy0.f46294a;
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        return yy0.mo67189a(b);
    }
}
