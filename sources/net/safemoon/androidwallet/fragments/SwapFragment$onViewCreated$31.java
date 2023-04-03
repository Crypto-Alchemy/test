package net.safemoon.androidwallet.fragments;

import androidx.appcompat.widget.AppCompatTextView;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$31 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$31(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        SwapViewModel.C8786a value;
        vx2.m53590f(bool, "it");
        if (bool.booleanValue() && (value = this.this$0.mo57712g1().mo61561G0().getValue()) != null) {
            SwapFragment swapFragment = this.this$0;
            fe7 fe7 = null;
            if (value.mo61635b()) {
                fe7 w0 = swapFragment.f42160q1;
                if (w0 == null) {
                    vx2.m53605u("bindingSource");
                    w0 = null;
                }
                AppCompatTextView appCompatTextView = w0.f28838k;
                vx2.m53590f(appCompatTextView, "bindingSource.hintNewValue");
                appCompatTextView.setVisibility(8);
                fe7 w02 = swapFragment.f42160q1;
                if (w02 == null) {
                    vx2.m53605u("bindingSource");
                    w02 = null;
                }
                w02.f28840m.requestFocus();
                fe7 w03 = swapFragment.f42160q1;
                if (w03 == null) {
                    vx2.m53605u("bindingSource");
                } else {
                    fe7 = w03;
                }
                fe7.f28840m.setText(ol0.m70374p(value.mo61634a().doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null));
                return;
            }
            fe7 v0 = swapFragment.f42162r1;
            if (v0 == null) {
                vx2.m53605u("bindingDestination");
                v0 = null;
            }
            AppCompatTextView appCompatTextView2 = v0.f28838k;
            vx2.m53590f(appCompatTextView2, "bindingDestination.hintNewValue");
            appCompatTextView2.setVisibility(8);
            fe7 v02 = swapFragment.f42162r1;
            if (v02 == null) {
                vx2.m53605u("bindingDestination");
                v02 = null;
            }
            v02.f28840m.requestFocus();
            fe7 v03 = swapFragment.f42162r1;
            if (v03 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = v03;
            }
            fe7.f28840m.setText(ol0.m70374p(value.mo61634a().doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null));
        }
    }
}
