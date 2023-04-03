package net.safemoon.androidwallet.fragments;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$11 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$11(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        xa2 h0 = this.this$0.f42181H;
        xa2 xa2 = null;
        if (h0 == null) {
            vx2.m53605u("binding");
            h0 = null;
        }
        MaterialTextView materialTextView = h0.f35560C;
        vx2.m53590f(str, "it");
        int i = 0;
        if (str.length() == 0) {
            i = 8;
        }
        materialTextView.setVisibility(i);
        xa2 h02 = this.this$0.f42181H;
        if (h02 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = h02;
        }
        xa2.f35560C.setText(str);
    }
}
