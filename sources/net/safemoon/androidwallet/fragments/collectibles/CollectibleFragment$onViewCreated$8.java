package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleFragment.kt */
public final class CollectibleFragment$onViewCreated$8 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ CollectibleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleFragment$onViewCreated$8(CollectibleFragment collectibleFragment) {
        super(1);
        this.this$0 = collectibleFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r1 = r1.f29473h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(net.safemoon.androidwallet.common.TokenType r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0040
            net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment r0 = r7.this$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r1 = r0.mo57959L()
            int r2 = r8.getChainId()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel.m68440W(r1, r2, r3, r4, r5, r6)
            h92 r1 = r0.mo57958K()
            if (r1 == 0) goto L_0x0020
            cf3 r1 = r1.f29473h
            if (r1 == 0) goto L_0x0020
            com.google.android.material.textview.MaterialTextView r1 = r1.f21731f
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 != 0) goto L_0x0024
            goto L_0x002b
        L_0x0024:
            java.lang.String r2 = r8.getPlaneName()
            r1.setText(r2)
        L_0x002b:
            h92 r0 = r0.mo57958K()
            if (r0 == 0) goto L_0x0040
            cf3 r0 = r0.f29473h
            if (r0 == 0) goto L_0x0040
            android.widget.ImageView r0 = r0.f21730e
            if (r0 == 0) goto L_0x0040
            int r8 = r8.getIcon()
            r0.setImageResource(r8)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$onViewCreated$8.invoke(net.safemoon.androidwallet.common.TokenType):void");
    }
}
