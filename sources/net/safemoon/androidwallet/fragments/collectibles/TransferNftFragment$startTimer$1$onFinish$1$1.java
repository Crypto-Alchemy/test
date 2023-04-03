package net.safemoon.androidwallet.fragments.collectibles;

import android.app.Dialog;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.CollectibleViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$startTimer$1$onFinish$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$startTimer$1$onFinish$1$1(TransferNftFragment transferNftFragment) {
        super(0);
        this.this$0 = transferNftFragment;
    }

    public final void invoke() {
        if (this.this$0.isVisible()) {
            WeakReference weakReference = new WeakReference(this.this$0.requireActivity());
            Integer valueOf = Integer.valueOf(R.string.gas_price_updated);
            String string = this.this$0.getString(R.string.gas_price_updated_content);
            Integer valueOf2 = Integer.valueOf(R.string.action_ok);
            final TransferNftFragment transferNftFragment = this.this$0;
            Dialog R = C9001np.m69933R(weakReference, valueOf, (String) null, (Integer) null, string, valueOf2, (Integer) null, (Integer) null, (Integer) null, new rc2<DialogInterface, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DialogInterface) obj);
                    return r37.f33317a;
                }

                public final void invoke(DialogInterface dialogInterface) {
                    vx2.m53591g(dialogInterface, "it");
                    try {
                        CollectibleViewModel A = transferNftFragment.mo58035I();
                        String H = transferNftFragment.mo58039M();
                        vx2.m53588d(H);
                        String tokenId = transferNftFragment.mo58037K().getTokenId();
                        vx2.m53588d(tokenId);
                        A.mo61066t(H, tokenId, transferNftFragment.f42353C);
                    } catch (Exception unused) {
                    }
                }
            }, (rc2<? super DialogInterface, r37>) null);
            vx2.m53588d(R);
            R.show();
        }
    }
}
