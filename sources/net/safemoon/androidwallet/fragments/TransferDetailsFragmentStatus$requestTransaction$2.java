package net.safemoon.androidwallet.fragments;

import com.google.gson.Gson;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.transaction.history.Result;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferDetailsFragmentStatus.kt */
public final class TransferDetailsFragmentStatus$requestTransaction$2 extends Lambda implements pc2<Result> {
    public final /* synthetic */ TransferDetailsFragmentStatus this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferDetailsFragmentStatus$requestTransaction$2(TransferDetailsFragmentStatus transferDetailsFragmentStatus) {
        super(0);
        this.this$0 = transferDetailsFragmentStatus;
    }

    public final Result invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("result");
        vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.model.transaction.history.Result");
        return (Result) new Gson().fromJson(new Gson().toJson((Object) (Result) serializable), Result.class);
    }
}
