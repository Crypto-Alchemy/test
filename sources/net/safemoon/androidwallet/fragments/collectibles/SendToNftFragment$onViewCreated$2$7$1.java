package net.safemoon.androidwallet.fragments.collectibles;

import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$onViewCreated$2$7$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ SendToNftFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$onViewCreated$2$7$1$a", "Lkp2;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$onViewCreated$2$7$1$a */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8553a implements kp2 {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42350a;

        public C8553a(SendToNftFragment sendToNftFragment) {
            this.f42350a = sendToNftFragment;
        }

        /* renamed from: a */
        public void mo55760a(Wallet wallet2) {
            AppCompatEditText appCompatEditText;
            vx2.m53591g(wallet2, "wallet");
            ra2 E = this.f42350a.f42336A;
            if (!(E == null || (appCompatEditText = E.f33376f) == null)) {
                appCompatEditText.setText(wallet2.getAddress(this.f42350a.mo58016V().getCoinType().getValue()));
            }
            C9639yg J = this.f42350a.f42339s;
            vx2.m53588d(J);
            J.mo67094d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$onViewCreated$2$7$1(SendToNftFragment sendToNftFragment) {
        super(1);
        this.this$0 = sendToNftFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "list");
        if (list.size() > 1) {
            this.this$0.f42339s = new C9639yg(list);
            C9639yg J = this.this$0.f42339s;
            if (J != null) {
                FragmentActivity requireActivity = this.this$0.requireActivity();
                vx2.m53590f(requireActivity, "requireActivity()");
                ra2 E = this.this$0.f42336A;
                ScrollView scrollView = null;
                AppCompatEditText appCompatEditText = E != null ? E.f33376f : null;
                vx2.m53588d(appCompatEditText);
                ra2 E2 = this.this$0.f42336A;
                if (E2 != null) {
                    scrollView = E2.f33380j;
                }
                J.mo67096f(requireActivity, appCompatEditText, scrollView, this.this$0.mo58016V().getChainId(), new C8553a(this.this$0));
            }
        }
    }
}
