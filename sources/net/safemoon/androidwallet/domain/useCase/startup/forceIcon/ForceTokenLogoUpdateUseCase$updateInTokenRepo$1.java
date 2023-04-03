package net.safemoon.androidwallet.domain.useCase.startup.forceIcon;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase", mo48632f = "ForceTokenLogoUpdateUseCase.kt", mo48633l = {27}, mo48634m = "updateInTokenRepo")
/* compiled from: ForceTokenLogoUpdateUseCase.kt */
public final class ForceTokenLogoUpdateUseCase$updateInTokenRepo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ForceTokenLogoUpdateUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForceTokenLogoUpdateUseCase$updateInTokenRepo$1(ForceTokenLogoUpdateUseCase forceTokenLogoUpdateUseCase, ns0<? super ForceTokenLogoUpdateUseCase$updateInTokenRepo$1> ns0) {
        super(ns0);
        this.this$0 = forceTokenLogoUpdateUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo57372e(this);
    }
}
