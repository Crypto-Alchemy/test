package net.safemoon.androidwallet.fragments.collectibles;

import androidx.fragment.app.FragmentManager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.common.LoadingState;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/LoadingState;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/common/LoadingState;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$onViewCreated$4$5 extends Lambda implements rc2<LoadingState, r37> {
    public final /* synthetic */ ProgressLoading $loading;
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$onViewCreated$4$5(TransferNftFragment transferNftFragment, ProgressLoading progressLoading) {
        super(1);
        this.this$0 = transferNftFragment;
        this.$loading = progressLoading;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LoadingState) obj);
        return r37.f33317a;
    }

    public final void invoke(LoadingState loadingState) {
        boolean z;
        if (loadingState != null) {
            TransferNftFragment transferNftFragment = this.this$0;
            ProgressLoading progressLoading = this.$loading;
            eb2 z2 = transferNftFragment.f42351A;
            MaterialButton materialButton = z2 != null ? z2.f28531b : null;
            if (materialButton != null) {
                if (loadingState == LoadingState.Normal) {
                    Double G = transferNftFragment.mo58035I().mo61038G();
                    double doubleValue = G != null ? G.doubleValue() : Utils.DOUBLE_EPSILON;
                    Double z3 = transferNftFragment.mo58035I().mo61071z();
                    if (doubleValue <= (z3 != null ? z3.doubleValue() : -1.0d)) {
                        z = true;
                        materialButton.setEnabled(z);
                    }
                }
                z = false;
                materialButton.setEnabled(z);
            }
            try {
                if (loadingState == LoadingState.Loading) {
                    FragmentManager childFragmentManager = transferNftFragment.getChildFragmentManager();
                    vx2.m53590f(childFragmentManager, "childFragmentManager");
                    progressLoading.mo57295D(childFragmentManager);
                } else if (progressLoading.isVisible()) {
                    progressLoading.mo22266k();
                }
            } catch (Exception unused) {
            }
        }
    }
}
