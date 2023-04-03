package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$fetchTokenList$1", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {131}, mo48634m = "invokeSuspend")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$fetchTokenList$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$fetchTokenList$1(SettingNotificationViewModel settingNotificationViewModel, ns0<? super SettingNotificationViewModel$fetchTokenList$1> ns0) {
        super(2, ns0);
        this.this$0 = settingNotificationViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SettingNotificationViewModel$fetchTokenList$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SettingNotificationViewModel$fetchTokenList$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            SettingNotificationViewModel settingNotificationViewModel = this.this$0;
            this.label = 1;
            obj = settingNotificationViewModel.mo61417u(this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f42830k.postValue((List) obj);
        return r37.f33317a;
    }
}
