package net.safemoon.androidwallet.fragments;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/Intent;", "intent", "Lr37;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$onClick$3 extends Lambda implements rc2<Intent, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$onClick$3(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return r37.f33317a;
    }

    public final void invoke(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("result")) != null) {
            TokenType M = this.this$0.mo57676h0();
            vx2.m53588d(M);
            if (M.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                try {
                    Common common = Common.f42577a;
                    TokenType M2 = this.this$0.mo57676h0();
                    vx2.m53588d(M2);
                    stringExtra = common.mo60913t(M2, stringExtra);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                vx2.m53588d(stringExtra);
                if (yb6.m74336M(stringExtra, "0x", false, 2, (Object) null)) {
                    ta2 G = this.this$0.f42125y;
                    vx2.m53588d(G);
                    G.f34187j.setText(stringExtra);
                    return;
                }
                FragmentActivity requireActivity = this.this$0.requireActivity();
                vx2.m53590f(requireActivity, "requireActivity()");
                ol0.m70345Y(requireActivity, R.string.not_valid_address);
                return;
            }
            ta2 G2 = this.this$0.f42125y;
            vx2.m53588d(G2);
            G2.f34187j.setText(stringExtra);
        }
    }
}
