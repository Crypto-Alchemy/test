package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AKTSelectCurrencyActivity.kt */
public final class AKTSelectCurrencyActivity$loader$2 extends Lambda implements pc2<ProgressLoading> {
    public final /* synthetic */ AKTSelectCurrencyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSelectCurrencyActivity$loader$2(AKTSelectCurrencyActivity aKTSelectCurrencyActivity) {
        super(0);
        this.this$0 = aKTSelectCurrencyActivity;
    }

    public final ProgressLoading invoke() {
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = this.this$0.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        return aVar.mo57297a(false, string, "");
    }
}
