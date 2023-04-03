package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.ScannedCodeActivity;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$onViewCreated$2$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ra2 $this_run;
    public final /* synthetic */ SendToNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$onViewCreated$2$1(SendToNftFragment sendToNftFragment, ra2 ra2) {
        super(0);
        this.this$0 = sendToNftFragment;
        this.$this_run = ra2;
    }

    public final void invoke() {
        ji4 m;
        ho2 G = this.this$0.mo58053m();
        if (G != null && (m = G.mo52268m()) != null) {
            final ra2 ra2 = this.$this_run;
            final SendToNftFragment sendToNftFragment = this.this$0;
            C3529wa<Intent> b = m.mo52724b(new rc2<Intent, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Intent) obj);
                    return r37.f33317a;
                }

                public final void invoke(Intent intent) {
                    String stringExtra;
                    if (intent != null && (stringExtra = intent.getStringExtra("result")) != null) {
                        try {
                            ra2.f33376f.setText(Common.f42577a.mo60913t(sendToNftFragment.mo58016V(), stringExtra));
                        } catch (Exception unused) {
                            Context requireContext = sendToNftFragment.requireContext();
                            vx2.m53590f(requireContext, "requireContext()");
                            String string = sendToNftFragment.getString(R.string.err_invalid_wc);
                            vx2.m53590f(string, "getString(R.string.err_invalid_wc)");
                            ol0.m70346Z(requireContext, string);
                        }
                    }
                }
            });
            if (b != null) {
                b.mo27473a(new Intent(this.this$0.requireActivity(), ScannedCodeActivity.class));
            }
        }
    }
}
