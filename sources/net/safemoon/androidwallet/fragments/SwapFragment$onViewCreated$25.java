package net.safemoon.androidwallet.fragments;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$25 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$25(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        xa2 xa2 = null;
        if (str != null) {
            xa2 u0 = this.this$0.f42150X;
            if (u0 == null) {
                vx2.m53605u("binding");
                u0 = null;
            }
            MaterialButton materialButton = u0.f35566d;
            vx2.m53590f(materialButton, "binding.btnSwap");
            materialButton.setVisibility(8);
            xa2 u02 = this.this$0.f42150X;
            if (u02 == null) {
                vx2.m53605u("binding");
                u02 = null;
            }
            Chip chip = u02.f35586x;
            vx2.m53590f(chip, "binding.requireGasFee");
            chip.setVisibility(0);
            xa2 u03 = this.this$0.f42150X;
            if (u03 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = u03;
            }
            xa2.f35586x.setText(str);
            return;
        }
        xa2 u04 = this.this$0.f42150X;
        if (u04 == null) {
            vx2.m53605u("binding");
            u04 = null;
        }
        MaterialButton materialButton2 = u04.f35566d;
        vx2.m53590f(materialButton2, "binding.btnSwap");
        materialButton2.setVisibility(0);
        xa2 u05 = this.this$0.f42150X;
        if (u05 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = u05;
        }
        Chip chip2 = xa2.f35586x;
        vx2.m53590f(chip2, "binding.requireGasFee");
        chip2.setVisibility(8);
    }
}
