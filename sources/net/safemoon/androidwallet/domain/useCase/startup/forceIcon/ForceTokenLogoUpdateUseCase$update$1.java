package net.safemoon.androidwallet.domain.useCase.startup.forceIcon;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$update$1", mo48632f = "ForceTokenLogoUpdateUseCase.kt", mo48633l = {20, 21}, mo48634m = "invokeSuspend")
/* compiled from: ForceTokenLogoUpdateUseCase.kt */
public final class ForceTokenLogoUpdateUseCase$update$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ ForceTokenLogoUpdateUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForceTokenLogoUpdateUseCase$update$1(ForceTokenLogoUpdateUseCase forceTokenLogoUpdateUseCase, ns0<? super ForceTokenLogoUpdateUseCase$update$1> ns0) {
        super(2, ns0);
        this.this$0 = forceTokenLogoUpdateUseCase;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ForceTokenLogoUpdateUseCase$update$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ForceTokenLogoUpdateUseCase$update$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ForceTokenLogoUpdateUseCase forceTokenLogoUpdateUseCase = this.this$0;
            this.label = 1;
            if (forceTokenLogoUpdateUseCase.mo57372e(this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ForceTokenLogoUpdateUseCase forceTokenLogoUpdateUseCase2 = this.this$0;
        this.label = 2;
        if (forceTokenLogoUpdateUseCase2.mo57371d(this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
