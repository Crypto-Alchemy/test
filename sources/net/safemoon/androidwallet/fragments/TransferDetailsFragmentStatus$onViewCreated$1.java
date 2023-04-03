package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferDetailsFragmentStatus.kt */
public final class TransferDetailsFragmentStatus$onViewCreated$1 extends Lambda implements rc2<List<? extends IToken>, r37> {
    public final /* synthetic */ TransferDetailsFragmentStatus this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferDetailsFragmentStatus$onViewCreated$1(TransferDetailsFragmentStatus transferDetailsFragmentStatus) {
        super(1);
        this.this$0 = transferDetailsFragmentStatus;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends IToken>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends IToken> list) {
        if (list != null) {
            TransferDetailsFragmentStatus transferDetailsFragmentStatus = this.this$0;
            if (!list.isEmpty()) {
                Result y = transferDetailsFragmentStatus.mo57871F();
                vx2.m53590f(y, "requestTransaction");
                TransferDetailsFragmentStatus.m67505N(transferDetailsFragmentStatus, y, (Result) null, 2, (Object) null);
                TransferViewModel z = transferDetailsFragmentStatus.mo57873H();
                String str = transferDetailsFragmentStatus.mo57871F().hash;
                vx2.m53590f(str, "requestTransaction.hash");
                z.mo61765n(str, transferDetailsFragmentStatus.mo57869D(), transferDetailsFragmentStatus.mo57868C());
            }
        }
    }
}
