package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$registerDevice$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$registerDevice$1(SettingNotificationViewModel settingNotificationViewModel) {
        super(1);
        this.this$0 = settingNotificationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        if (z) {
            Application b = this.this$0.mo27549b();
            Boolean bool = Boolean.TRUE;
            f06.m57523n(b, "FCM_TOKEN", bool);
            this.this$0.mo61404H().postValue(bool);
            return;
        }
        Application b2 = this.this$0.mo27549b();
        Boolean bool2 = Boolean.FALSE;
        f06.m57523n(b2, "FCM_TOKEN", bool2);
        this.this$0.mo61404H().postValue(bool2);
    }
}
