package net.safemoon.androidwallet.fragments;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$initSource$3 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$initSource$3(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        fe7 j0 = this.this$0.f42184M;
        String str = null;
        if (j0 == null) {
            vx2.m53605u("bindingSource");
            j0 = null;
        }
        SwapMigrationFragment swapMigrationFragment = this.this$0;
        AppCompatTextView appCompatTextView = j0.f28836i;
        cb6 cb6 = cb6.f21669a;
        Locale locale = Locale.getDefault();
        String string = swapMigrationFragment.getString(R.string.text_swap_coin_bal);
        vx2.m53590f(string, "getString(R.string.text_swap_coin_bal)");
        Object[] objArr = new Object[1];
        Context context = swapMigrationFragment.getContext();
        if (context != null) {
            double doubleValue = bigDecimal.doubleValue();
            vx2.m53590f(context, "it1");
            str = ol0.m70383y(doubleValue, context);
        }
        objArr[0] = str;
        String format = String.format(locale, string, Arrays.copyOf(objArr, 1));
        vx2.m53590f(format, "format(locale, format, *args)");
        appCompatTextView.setText(format);
    }
}
