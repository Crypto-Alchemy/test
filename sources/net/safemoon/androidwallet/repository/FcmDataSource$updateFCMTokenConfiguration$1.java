package net.safemoon.androidwallet.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.repository.FcmDataSource$updateFCMTokenConfiguration$1", mo48632f = "FcmDataSource.kt", mo48633l = {62, 63}, mo48634m = "invokeSuspend")
/* compiled from: FcmDataSource.kt */
public final class FcmDataSource$updateFCMTokenConfiguration$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<Boolean, r37> $callBack;
    public final /* synthetic */ String $currency;
    public final /* synthetic */ boolean $isSendPushPriceAlert;
    public final /* synthetic */ String $lang;
    public int label;
    public final /* synthetic */ FcmDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FcmDataSource$updateFCMTokenConfiguration$1(FcmDataSource fcmDataSource, String str, String str2, boolean z, rc2<? super Boolean, r37> rc2, ns0<? super FcmDataSource$updateFCMTokenConfiguration$1> ns0) {
        super(2, ns0);
        this.this$0 = fcmDataSource;
        this.$lang = str;
        this.$currency = str2;
        this.$isSendPushPriceAlert = z;
        this.$callBack = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new FcmDataSource$updateFCMTokenConfiguration$1(this.this$0, this.$lang, this.$currency, this.$isSendPushPriceAlert, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((FcmDataSource$updateFCMTokenConfiguration$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            long millis = TimeUnit.SECONDS.toMillis(1);
            this.label = 1;
            if (jb1.m59336a(millis, this) == d) {
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
        FcmDataSource fcmDataSource = this.this$0;
        String str = this.$lang;
        String str2 = this.$currency;
        boolean z = this.$isSendPushPriceAlert;
        rc2<Boolean, r37> rc2 = this.$callBack;
        this.label = 2;
        if (fcmDataSource.mo60726e(str, str2, z, rc2, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
