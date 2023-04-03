package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.repository.FcmDataSource$updateIfPendingToSaveToken$1$1", mo48632f = "FcmDataSource.kt", mo48633l = {88}, mo48634m = "invokeSuspend")
/* compiled from: FcmDataSource.kt */
public final class FcmDataSource$updateIfPendingToSaveToken$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ FcmDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FcmDataSource$updateIfPendingToSaveToken$1$1(FcmDataSource fcmDataSource, String str, ns0<? super FcmDataSource$updateIfPendingToSaveToken$1$1> ns0) {
        super(2, ns0);
        this.this$0 = fcmDataSource;
        this.$it = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new FcmDataSource$updateIfPendingToSaveToken$1$1(this.this$0, this.$it, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((FcmDataSource$updateIfPendingToSaveToken$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            FcmDataSource fcmDataSource = this.this$0;
            String str = this.$it;
            this.label = 1;
            if (fcmDataSource.mo60729i(str, this) == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
