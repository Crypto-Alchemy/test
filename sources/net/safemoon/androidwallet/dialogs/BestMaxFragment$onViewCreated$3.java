package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import com.google.android.material.button.MaterialButton;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BestMaxFragment.kt */
public final class BestMaxFragment$onViewCreated$3 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ BestMaxFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BestMaxFragment$onViewCreated$3(BestMaxFragment bestMaxFragment) {
        super(1);
        this.this$0 = bestMaxFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            BestMaxFragment bestMaxFragment = this.this$0;
            df1 C = bestMaxFragment.f41711P;
            if (C == null) {
                vx2.m53605u("binding");
                C = null;
            }
            C.f28173c.setVisibility(ol0.m70370l0(bigDecimal.compareTo(BigDecimal.ZERO) > 0));
            df1 C2 = bestMaxFragment.f41711P;
            if (C2 == null) {
                vx2.m53605u("binding");
                C2 = null;
            }
            C2.f28172b.setVisibility(ol0.m70366j0(bigDecimal.compareTo(BigDecimal.ZERO) > 0));
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                df1 C3 = bestMaxFragment.f41711P;
                if (C3 == null) {
                    vx2.m53605u("binding");
                    C3 = null;
                }
                MaterialButton materialButton = C3.f28173c;
                BigDecimal scale = bigDecimal.setScale(5, RoundingMode.UP);
                vx2.m53590f(scale, "it.setScale(5, RoundingMode.UP)");
                materialButton.setText(ol0.m70360g0(scale, 0, 1, (Object) null));
                return;
            }
            Context context = bestMaxFragment.getContext();
            if (context != null) {
                vx2.m53590f(context, "context");
                ol0.m70346Z(context, "Please try with lower value we unable to find best max value for you.");
            }
        }
    }
}
