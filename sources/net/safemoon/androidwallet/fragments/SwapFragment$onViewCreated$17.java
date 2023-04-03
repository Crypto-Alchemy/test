package net.safemoon.androidwallet.fragments;

import com.google.android.material.chip.Chip;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$17 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$17(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return r37.f33317a;
    }

    public final void invoke(Integer num) {
        xa2 u0 = this.this$0.f42150X;
        if (u0 == null) {
            vx2.m53605u("binding");
            u0 = null;
        }
        Chip chip = u0.f35574l;
        cb6 cb6 = cb6.f21669a;
        Locale locale = Locale.getDefault();
        String string = this.this$0.getString(R.string.text_swap_min_txn);
        vx2.m53590f(string, "getString(R.string.text_swap_min_txn)");
        String format = String.format(locale, string, Arrays.copyOf(new Object[]{num}, 1));
        vx2.m53590f(format, "format(locale, format, *args)");
        chip.setText(format);
    }
}
