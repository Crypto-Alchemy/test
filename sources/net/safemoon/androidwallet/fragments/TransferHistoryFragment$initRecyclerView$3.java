package net.safemoon.androidwallet.fragments;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LoadingState;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/LoadingState;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/common/LoadingState;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$initRecyclerView$3 extends Lambda implements rc2<LoadingState, r37> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$initRecyclerView$3(TransferHistoryFragment transferHistoryFragment) {
        super(1);
        this.this$0 = transferHistoryFragment;
    }

    /* renamed from: b */
    public static final void m67616b(TransferHistoryFragment transferHistoryFragment, LoadingState loadingState) {
        SwipeRefreshLayout swipeRefreshLayout;
        TextView textView;
        int i;
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(loadingState, "$it");
        db2 R = transferHistoryFragment.f42262s;
        if (!(R == null || (textView = R.f28139u) == null)) {
            if (loadingState == LoadingState.Loading) {
                i = R.string.loading;
            } else {
                i = R.string.transactions_not_found;
            }
            textView.setText(i);
        }
        db2 R2 = transferHistoryFragment.f42262s;
        TextView textView2 = null;
        if (R2 != null) {
            swipeRefreshLayout = R2.f28135q;
        } else {
            swipeRefreshLayout = null;
        }
        boolean z = false;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        db2 R3 = transferHistoryFragment.f42262s;
        if (R3 != null) {
            textView2 = R3.f28139u;
        }
        if (textView2 != null) {
            if (transferHistoryFragment.mo57898n0().getItemCount() == transferHistoryFragment.f42260k) {
                z = true;
            }
            textView2.setVisibility(ol0.m70370l0(z));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LoadingState) obj);
        return r37.f33317a;
    }

    public final void invoke(LoadingState loadingState) {
        if (loadingState != null) {
            TransferHistoryFragment transferHistoryFragment = this.this$0;
            new Handler(Looper.getMainLooper()).postDelayed(new C8573i(transferHistoryFragment, loadingState), transferHistoryFragment.f42261r);
        }
    }
}
