package net.safemoon.androidwallet.dialogs;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: G2FAVerfication.kt */
public final class G2FAVerfication$onViewCreated$4 extends Lambda implements rc2<Long, r37> {
    public final /* synthetic */ G2FAVerfication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G2FAVerfication$onViewCreated$4(G2FAVerfication g2FAVerfication) {
        super(1);
        this.this$0 = g2FAVerfication;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return r37.f33317a;
    }

    public final void invoke(Long l) {
        ib2 B = this.this$0.f41735U;
        if (B == null) {
            vx2.m53605u("binding");
            B = null;
        }
        MaterialTextView materialTextView = B.f29877g;
        materialTextView.setText(":" + l + " sec.");
    }
}
