package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "charSequence", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$onViewCreated$4 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ CalculatorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$onViewCreated$4(CalculatorFragment calculatorFragment) {
        super(1);
        this.this$0 = calculatorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        vx2.m53591g(str, "charSequence");
        this.this$0.mo57442B0();
        try {
            if (str.length() == 0) {
                e92 M = this.this$0.f41921y;
                vx2.m53588d(M);
                M.f28436D.setText("");
                return;
            }
            String v = ol0.m70380v(str);
            if (this.this$0.mo57444Y(ol0.m70331K(v))) {
                e92 M2 = this.this$0.f41921y;
                vx2.m53588d(M2);
                M2.f28436D.setText(v);
                e92 M3 = this.this$0.f41921y;
                vx2.m53588d(M3);
                M3.f28445b.fullScroll(66);
            }
        } catch (Exception unused) {
        }
    }
}
