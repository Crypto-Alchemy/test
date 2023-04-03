package net.safemoon.androidwallet.fragments;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$19 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$19(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        xa2 u0 = this.this$0.f42150X;
        xa2 xa2 = null;
        if (u0 == null) {
            vx2.m53605u("binding");
            u0 = null;
        }
        MaterialTextView materialTextView = u0.f35560C;
        vx2.m53590f(str, "it");
        int i = 0;
        if (str.length() == 0) {
            i = 8;
        }
        materialTextView.setVisibility(i);
        xa2 u02 = this.this$0.f42150X;
        if (u02 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = u02;
        }
        xa2.f35560C.setText(str);
    }
}
