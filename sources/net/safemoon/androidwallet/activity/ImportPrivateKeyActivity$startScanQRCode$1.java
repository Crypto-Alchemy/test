package net.safemoon.androidwallet.activity;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/Intent;", "intent", "Lr37;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ImportPrivateKeyActivity.kt */
public final class ImportPrivateKeyActivity$startScanQRCode$1 extends Lambda implements rc2<Intent, r37> {
    public final /* synthetic */ ImportPrivateKeyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImportPrivateKeyActivity$startScanQRCode$1(ImportPrivateKeyActivity importPrivateKeyActivity) {
        super(1);
        this.this$0 = importPrivateKeyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return r37.f33317a;
    }

    public final void invoke(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("result")) != null) {
            this.this$0.mo56846t0().f28797d.setText(stringExtra);
        }
    }
}
