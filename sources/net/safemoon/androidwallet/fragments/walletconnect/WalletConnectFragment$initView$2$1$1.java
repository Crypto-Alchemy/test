package net.safemoon.androidwallet.fragments.walletconnect;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/Intent;", "intent", "Lr37;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectFragment.kt */
public final class WalletConnectFragment$initView$2$1$1 extends Lambda implements rc2<Intent, r37> {
    public final /* synthetic */ lb2 $this_apply;
    public final /* synthetic */ WalletConnectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectFragment$initView$2$1$1(lb2 lb2, WalletConnectFragment walletConnectFragment) {
        super(1);
        this.$this_apply = lb2;
        this.this$0 = walletConnectFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return r37.f33317a;
    }

    public final void invoke(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("result")) != null) {
            try {
                this.$this_apply.f31274b.setEnabled(false);
                if (StringsKt__StringsKt.m63081R(stringExtra, "relay-protocol", false, 2, (Object) null)) {
                    this.this$0.mo58166S().mo62039c(stringExtra);
                } else {
                    this.this$0.mo58164Q().mo61995e(stringExtra);
                }
            } catch (Exception unused) {
                Context requireContext = this.this$0.requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                String string = this.this$0.getString(R.string.err_invalid_wc);
                vx2.m53590f(string, "getString(R.string.err_invalid_wc)");
                ol0.m70346Z(requireContext, string);
            }
        }
    }
}
