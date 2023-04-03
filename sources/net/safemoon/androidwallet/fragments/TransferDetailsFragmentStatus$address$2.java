package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferDetailsFragmentStatus.kt */
public final class TransferDetailsFragmentStatus$address$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ TransferDetailsFragmentStatus this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferDetailsFragmentStatus$address$2(TransferDetailsFragmentStatus transferDetailsFragmentStatus) {
        super(0);
        this.this$0 = transferDetailsFragmentStatus;
    }

    public final String invoke() {
        Wallet c;
        Context context = this.this$0.getContext();
        if (context == null || (c = ol0.m70351c(context)) == null) {
            return null;
        }
        return c.getAddress(this.this$0.mo57869D().getCoinType().getValue());
    }
}
