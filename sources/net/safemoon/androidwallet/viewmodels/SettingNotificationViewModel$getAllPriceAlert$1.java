package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {187, 187}, mo48634m = "getAllPriceAlert")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$getAllPriceAlert$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$getAllPriceAlert$1(SettingNotificationViewModel settingNotificationViewModel, ns0<? super SettingNotificationViewModel$getAllPriceAlert$1> ns0) {
        super(ns0);
        this.this$0 = settingNotificationViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61417u(this);
    }
}
