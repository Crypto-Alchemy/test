package net.safemoon.androidwallet.dialogs;

import android.widget.TextView;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: GraphFragment.kt */
public final class GraphFragment$observePriceByAddress$1 extends Lambda implements rc2<CurrencyTokenInfo, r37> {
    public final /* synthetic */ GraphFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphFragment$observePriceByAddress$1(GraphFragment graphFragment) {
        super(1);
        this.this$0 = graphFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CurrencyTokenInfo) obj);
        return r37.f33317a;
    }

    public final void invoke(CurrencyTokenInfo currencyTokenInfo) {
        if (currencyTokenInfo != null) {
            GraphFragment graphFragment = this.this$0;
            String priceUsd = currencyTokenInfo.getPriceUsd();
            qi2 qi2 = null;
            Double valueOf = priceUsd != null ? Double.valueOf(Double.parseDouble(priceUsd)) : null;
            rz1.C9291a aVar = rz1.f44501a;
            String t = ol0.m70378t(aVar.mo65772b());
            if (valueOf != null) {
                valueOf.doubleValue();
                qi2 O = graphFragment.f41765e1;
                if (O == null) {
                    vx2.m53605u("binding");
                } else {
                    qi2 = O;
                }
                TextView textView = qi2.f33112C;
                cb6 cb6 = cb6.f21669a;
                String format = String.format(Locale.getDefault(), t, Arrays.copyOf(new Object[]{aVar.mo65772b(), ol0.m70374p(sz1.m72124a(valueOf.doubleValue()), 5, (RoundingMode) null, false, 6, (Object) null)}, 2));
                vx2.m53590f(format, "format(locale, format, *args)");
                textView.setText(format);
            }
        }
    }
}
