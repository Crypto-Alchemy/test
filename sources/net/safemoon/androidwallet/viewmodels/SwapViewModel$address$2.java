package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$address$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapViewModel$address$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final String invoke() {
        Wallet c = ol0.m70351c(this.$application);
        if (c != null) {
            return c.getAddress(MyCoinType.ETHEREUM.getValue());
        }
        return null;
    }
}
