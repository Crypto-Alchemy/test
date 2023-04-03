package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.adapter.TransactionAdapter;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import p000.jv6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/TransferHistoryFragment$transactionAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/TransferHistoryFragment$transactionAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$transactionAdapter$2 extends Lambda implements pc2<C8506a> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/TransferHistoryFragment$transactionAdapter$2$a", "Lnet/safemoon/androidwallet/adapter/TransactionAdapter;", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "o", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TransferHistoryFragment$transactionAdapter$2$a */
    /* compiled from: TransferHistoryFragment.kt */
    public static final class C8506a extends TransactionAdapter {

        /* renamed from: x */
        public final /* synthetic */ TransferHistoryFragment f42266x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8506a(TransferHistoryFragment transferHistoryFragment, Context context, C85052 r3) {
            super(context, r3);
            this.f42266x = transferHistoryFragment;
            vx2.m53590f(context, "requireContext()");
        }

        /* renamed from: o */
        public UserTokenItemDisplayModel mo57018o() {
            return this.f42266x.mo57901q0();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$transactionAdapter$2(TransferHistoryFragment transferHistoryFragment) {
        super(0);
        this.this$0 = transferHistoryFragment;
    }

    public final C8506a invoke() {
        Context requireContext = this.this$0.requireContext();
        final TransferHistoryFragment transferHistoryFragment = this.this$0;
        return new C8506a(this.this$0, requireContext, new rc2<Result, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result) obj);
                return r37.f33317a;
            }

            public final void invoke(Result result) {
                vx2.m53591g(result, "result");
                TransferHistoryFragment transferHistoryFragment = transferHistoryFragment;
                if (result.tokenDecimal == null) {
                    result.tokenDecimal = Integer.valueOf(transferHistoryFragment.mo57901q0().getDecimals());
                }
                TransferHistoryFragment transferHistoryFragment2 = transferHistoryFragment;
                jv6.C7317e e = jv6.m59579e(result, transferHistoryFragment2.mo57901q0().getChainId(), result.offlinePending);
                vx2.m53590f(e, "actionTransferHistoryFra… , result.offlinePending)");
                transferHistoryFragment2.mo50753j(e);
            }
        });
    }
}
