package net.safemoon.androidwallet.fragments.contact;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/Intent;", "intent", "Lr37;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$bindContactWrapper$4$1 extends Lambda implements rc2<Intent, r37> {
    public final /* synthetic */ jt2 $binding;
    public final /* synthetic */ int $chainId;
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$bindContactWrapper$4$1(int i, jt2 jt2, BaseContactFragment baseContactFragment) {
        super(1);
        this.$chainId = i;
        this.$binding = jt2;
        this.this$0 = baseContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return r37.f33317a;
    }

    public final void invoke(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (stringExtra != null) {
                try {
                    stringExtra = Common.f42577a.mo60913t(TokenType.Companion.mo57099b(this.$chainId), stringExtra);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (stringExtra != null) {
                jt2 jt2 = this.$binding;
                BaseContactFragment baseContactFragment = this.this$0;
                try {
                    jt2.f30602d.setText(stringExtra);
                } catch (Exception unused) {
                    Context requireContext = baseContactFragment.requireContext();
                    vx2.m53590f(requireContext, "requireContext()");
                    String string = baseContactFragment.getString(R.string.err_invalid_wc);
                    vx2.m53590f(string, "getString(R.string.err_invalid_wc)");
                    ol0.m70346Z(requireContext, string);
                }
            }
        }
    }
}
