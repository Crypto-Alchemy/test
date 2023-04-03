package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$updateAllPriceAlert$1", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {176}, mo48634m = "invokeSuspend")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$updateAllPriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$updateAllPriceAlert$1(SettingNotificationViewModel settingNotificationViewModel, ns0<? super SettingNotificationViewModel$updateAllPriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = settingNotificationViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SettingNotificationViewModel$updateAllPriceAlert$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SettingNotificationViewModel$updateAllPriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        k04 k04;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            k04 l = this.this$0.f42830k;
            SettingNotificationViewModel settingNotificationViewModel = this.this$0;
            this.L$0 = l;
            this.label = 1;
            Object h = settingNotificationViewModel.mo61417u(this);
            if (h == d) {
                return d;
            }
            k04 = l;
            obj = h;
        } else if (i == 1) {
            k04 = (k04) this.L$0;
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k04.postValue(obj);
        return r37.f33317a;
    }
}
