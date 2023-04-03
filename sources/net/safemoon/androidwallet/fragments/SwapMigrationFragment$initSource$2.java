package net.safemoon.androidwallet.fragments;

import com.bumptech.glide.C1710a;
import com.google.android.material.textview.MaterialTextView;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Swap;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/swap/Swap;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$initSource$2 extends Lambda implements rc2<Swap, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$initSource$2(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Swap) obj);
        return r37.f33317a;
    }

    public final void invoke(Swap swap) {
        if (swap != null) {
            SwapMigrationFragment swapMigrationFragment = this.this$0;
            fe7 j0 = swapMigrationFragment.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            String str = swap.logoURI;
            vx2.m53590f(str, "it.logoURI");
            if ((str.length() > 0) || swap.imageResource > 0) {
                String str2 = swap.logoURI;
                String str3 = swap.symbol;
                vx2.m53590f(str3, "it.symbol");
                ((be5) C1710a.m12225u(j0.f28839l).mo23163x(q70.m71190f(new zh0(str2, str3, Integer.valueOf(swap.imageResource)))).mo22581g0(swapMigrationFragment.f42179B, swapMigrationFragment.f42180C)).mo11567a(qe5.m25623x0()).mo11553K0(j0.f28839l);
            }
            MaterialTextView materialTextView = j0.f28845r;
            String str4 = swap.name;
            String str5 = swap.symbol;
            materialTextView.setText(str4 + " (" + str5 + ")");
            SwapMigrationViewModel.C8738a value = swapMigrationFragment.mo57762F0().mo61464d0().getValue();
            if (value != null && value.mo61485b()) {
                j0.f28840m.setText("");
                k04<SwapMigrationViewModel.C8738a> d0 = swapMigrationFragment.mo57762F0().mo61464d0();
                BigDecimal bigDecimal = BigDecimal.ZERO;
                vx2.m53590f(bigDecimal, "ZERO");
                d0.postValue(new SwapMigrationViewModel.C8738a(true, bigDecimal));
            }
        }
    }
}
