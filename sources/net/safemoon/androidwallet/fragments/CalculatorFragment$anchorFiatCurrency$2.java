package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.fragments.CalculatorFragment$defaultCurrencyAdapter$2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/CalculatorFragment$anchorFiatCurrency$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/CalculatorFragment$anchorFiatCurrency$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$anchorFiatCurrency$2 extends Lambda implements pc2<C8371a> {
    public final /* synthetic */ CalculatorFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/CalculatorFragment$anchorFiatCurrency$2$a", "Lmg;", "", "text", "Lr37;", "f", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.CalculatorFragment$anchorFiatCurrency$2$a */
    /* compiled from: CalculatorFragment.kt */
    public static final class C8371a extends C7901mg {

        /* renamed from: f */
        public final /* synthetic */ CalculatorFragment f41925f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8371a(CalculatorFragment calculatorFragment, Context context, CalculatorFragment$defaultCurrencyAdapter$2.C8372a aVar, ScrollView scrollView, C83702 r5) {
            super(context, aVar, scrollView, r5);
            this.f41925f = calculatorFragment;
            vx2.m53590f(context, "requireContext()");
        }

        /* renamed from: f */
        public void mo56249f(String str) {
            if (str != null) {
                CalculatorFragment calculatorFragment = this.f41925f;
                calculatorFragment.mo57453k0().mo66152d(calculatorFragment.mo57455m0().mo61377l(str));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$anchorFiatCurrency$2(CalculatorFragment calculatorFragment) {
        super(0);
        this.this$0 = calculatorFragment;
    }

    public final C8371a invoke() {
        Context requireContext = this.this$0.requireContext();
        CalculatorFragment$defaultCurrencyAdapter$2.C8372a O = this.this$0.mo57453k0();
        e92 M = this.this$0.f41921y;
        return new C8371a(this.this$0, requireContext, O, M != null ? M.mo42169b() : null, C83702.INSTANCE);
    }
}
