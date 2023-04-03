package net.safemoon.androidwallet.dialogs;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ConfirmSwapTransactionFragment.kt */
public final class ConfirmSwapTransactionFragment$onViewCreated$1$2 extends Lambda implements rc2<Long, r37> {
    public final /* synthetic */ j92 $this_run;
    public final /* synthetic */ ConfirmSwapTransactionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmSwapTransactionFragment$onViewCreated$1$2(j92 j92, ConfirmSwapTransactionFragment confirmSwapTransactionFragment) {
        super(1);
        this.$this_run = j92;
        this.this$0 = confirmSwapTransactionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return r37.f33317a;
    }

    public final void invoke(Long l) {
        if (l != null) {
            j92 j92 = this.$this_run;
            ConfirmSwapTransactionFragment confirmSwapTransactionFragment = this.this$0;
            long longValue = l.longValue();
            j92.f30269m.setText(confirmSwapTransactionFragment.getString(R.string.cst_recalculate_in, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(longValue))));
        }
    }
}
