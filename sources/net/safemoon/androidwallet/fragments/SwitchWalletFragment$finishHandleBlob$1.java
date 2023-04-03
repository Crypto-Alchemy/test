package net.safemoon.androidwallet.fragments;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletFragment.kt */
public final class SwitchWalletFragment$finishHandleBlob$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ SwitchWalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletFragment$finishHandleBlob$1(SwitchWalletFragment switchWalletFragment) {
        super(1);
        this.this$0 = switchWalletFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        T t;
        vx2.m53591g(list, "list");
        boolean z = true;
        for (Wallet next : list) {
            if (next.isPrimaryWallet()) {
                if (!next.isLinked()) {
                    this.this$0.mo57822o0().mo61247F(next, 1, (pc2<r37>) null);
                }
            } else if (!CollectionsKt___CollectionsKt.m47320R(this.this$0.f42200B, Wallet.getAddress$default(next, 0, 1, (Object) null))) {
                this.this$0.mo57822o0().mo61247F(next, 0, (pc2<r37>) null);
                z = false;
            } else if (!this.this$0.f42201C.containsKey(Wallet.getAddress$default(next, 0, 1, (Object) null)) || vx2.m53586b(next.getName(), this.this$0.f42201C.get(Wallet.getPrivateKey$default(next, 0, 1, (Object) null)))) {
                this.this$0.mo57822o0().mo61247F(next, 1, (pc2<r37>) null);
            } else {
                MultiWalletViewModel P = this.this$0.mo57822o0();
                Object obj = this.this$0.f42201C.get(Wallet.getAddress$default(next, 0, 1, (Object) null));
                vx2.m53588d(obj);
                P.mo61248G(next, (String) obj, 1, (pc2<r37>) null);
            }
        }
        g06 g06 = g06.f37938a;
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        g06.mo51839h(requireContext, z);
        FragmentActivity activity = this.this$0.getActivity();
        Wallet c = activity != null ? ol0.m70351c(activity) : null;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (vx2.m53586b(((Wallet) t).getId(), c != null ? c.getId() : null)) {
                break;
            }
        }
        Wallet wallet2 = (Wallet) t;
        if (wallet2 != null) {
            SwitchWalletFragment switchWalletFragment = this.this$0;
            if (CollectionsKt___CollectionsKt.m47320R(switchWalletFragment.f42200B, Wallet.getAddress$default(wallet2, 0, 1, (Object) null))) {
                wallet2.setLinkedState(1);
                if (switchWalletFragment.f42201C.containsKey(Wallet.getAddress$default(wallet2, 0, 1, (Object) null))) {
                    Object obj2 = switchWalletFragment.f42201C.get(Wallet.getAddress$default(wallet2, 0, 1, (Object) null));
                    vx2.m53588d(obj2);
                    wallet2.setName((String) obj2);
                }
            }
            switchWalletFragment.mo57822o0().mo61245D(wallet2);
        }
    }
}
