package net.safemoon.androidwallet.utils;

import android.app.Application;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.utils.PreFetchData$loadPreFetchData$1", mo48632f = "PreFetchData.kt", mo48633l = {36}, mo48634m = "invokeSuspend")
/* compiled from: PreFetchData.kt */
public final class PreFetchData$loadPreFetchData$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Application $application;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreFetchData$loadPreFetchData$1(Application application, ns0<? super PreFetchData$loadPreFetchData$1> ns0) {
        super(2, ns0);
        this.$application = application;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new PreFetchData$loadPreFetchData$1(this.$application, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((PreFetchData$loadPreFetchData$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            PreFetch preFetch = new PreFetch(this.$application, C86361.INSTANCE, C86372.INSTANCE);
            this.label = 1;
            if (preFetch.mo60929d(this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
