package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Context;
import android.os.CountDownTimer;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/TransferNftFragment$startTimer$1", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lr37;", "onTick", "onFinish", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$startTimer$1 extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ TransferNftFragment f42364a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$startTimer$1(TransferNftFragment transferNftFragment, long j, long j2) {
        super(j, j2);
        this.f42364a = transferNftFragment;
    }

    public void onFinish() {
        this.f42364a.f42355I.setValue(0L);
        CountDownTimer B = this.f42364a.f42356L;
        if (B != null) {
            B.cancel();
        }
        try {
            Context requireContext = this.f42364a.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            ol0.m70325E(requireContext);
            k04<NFTTransferResponse> L = this.f42364a.mo58038L();
            if (L != null) {
                TransferNftFragment transferNftFragment = this.f42364a;
                transferNftFragment.mo58035I().mo61059j0(transferNftFragment.mo58039M(), transferNftFragment.mo58037K().getTokenId(), transferNftFragment.f42353C, L, new TransferNftFragment$startTimer$1$onFinish$1$1(transferNftFragment));
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                Context requireContext2 = this.f42364a.requireContext();
                vx2.m53590f(requireContext2, "requireContext()");
                ol0.m70346Z(requireContext2, message);
            }
        }
    }

    public void onTick(long j) {
        this.f42364a.f42355I.setValue(Long.valueOf((((long) 50) + this.f42364a.f42354H) - j));
    }
}
