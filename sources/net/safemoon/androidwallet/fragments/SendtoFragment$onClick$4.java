package net.safemoon.androidwallet.fragments;

import android.widget.EditText;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$onClick$4 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$onClick$4$a", "Lkp2;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$onClick$4$a */
    /* compiled from: SendtoFragment.kt */
    public static final class C8456a implements kp2 {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42132a;

        public C8456a(SendtoFragment sendtoFragment) {
            this.f42132a = sendtoFragment;
        }

        /* renamed from: a */
        public void mo55760a(Wallet wallet2) {
            Integer num;
            MyCoinType coinType;
            vx2.m53591g(wallet2, "wallet");
            ta2 G = this.f42132a.f42125y;
            vx2.m53588d(G);
            EditText editText = G.f34187j;
            TokenType M = this.f42132a.mo57676h0();
            if (M == null || (coinType = M.getCoinType()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(coinType.getValue());
            }
            vx2.m53588d(num);
            editText.setText(wallet2.getAddress(num.intValue()));
            C9639yg N = this.f42132a.f42112C;
            vx2.m53588d(N);
            N.mo67094d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$onClick$4(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "list");
        if (list.size() > 1) {
            this.this$0.f42112C = new C9639yg(list);
            C9639yg N = this.this$0.f42112C;
            vx2.m53588d(N);
            FragmentActivity requireActivity = this.this$0.requireActivity();
            vx2.m53590f(requireActivity, "requireActivity()");
            ta2 G = this.this$0.f42125y;
            vx2.m53588d(G);
            EditText editText = G.f34187j;
            vx2.m53590f(editText, "binding!!.etAddress");
            ta2 G2 = this.this$0.f42125y;
            vx2.m53588d(G2);
            ScrollView scrollView = G2.f34197t;
            UserTokenItemDisplayModel I = this.this$0.f42110A;
            Integer valueOf = I != null ? Integer.valueOf(I.getChainId()) : null;
            vx2.m53588d(valueOf);
            N.mo67096f(requireActivity, editText, scrollView, valueOf.intValue(), new C8456a(this.this$0));
        }
    }
}
