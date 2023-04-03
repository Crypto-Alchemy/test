package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Context;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTTransferResponse;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/nft/NFTTransferResponse;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$onViewCreated$2 extends Lambda implements rc2<NFTTransferResponse, r37> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$onViewCreated$2(TransferNftFragment transferNftFragment) {
        super(1);
        this.this$0 = transferNftFragment;
    }

    /* renamed from: b */
    public static final void m67907b(TransferNftFragment transferNftFragment, DialogInterface dialogInterface) {
        vx2.m53591g(transferNftFragment, "this$0");
        ho2 C = transferNftFragment.mo58053m();
        if (C != null) {
            C.mo52265d(R.id.navigation_collectibles);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NFTTransferResponse) obj);
        return r37.f33317a;
    }

    public final void invoke(NFTTransferResponse nFTTransferResponse) {
        if (nFTTransferResponse != null) {
            TransferNftFragment transferNftFragment = this.this$0;
            if (nFTTransferResponse.getError() != null) {
                Context requireContext = transferNftFragment.requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                ol0.m70346Z(requireContext, nFTTransferResponse.getError());
            } else if (nFTTransferResponse.getHash() != null) {
                Common common = Common.f42577a;
                TokenType.C8246a aVar = TokenType.Companion;
                Integer chainID = transferNftFragment.mo58037K().getChainID();
                vx2.m53588d(chainID);
                String r = common.mo60911r(aVar.mo57099b(chainID.intValue()));
                String hash = nFTTransferResponse.getHash();
                wf1.m73588e(new WeakReference(transferNftFragment.requireActivity()), r + hash, new C8557b(transferNftFragment));
            }
        }
    }
}
