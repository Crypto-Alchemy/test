package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Google2FABackup.kt */
public final class Google2FABackup$onViewCreated$3 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ Google2FABackup this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Google2FABackup$onViewCreated$3(Google2FABackup google2FABackup) {
        super(1);
        this.this$0 = google2FABackup;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        u92 D = this.this$0.f41744P;
        if (D == null) {
            vx2.m53605u("binding");
            D = null;
        }
        D.f34491j.setText(str);
    }
}
