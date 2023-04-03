package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$onViewCreated$1$1$5 extends Lambda implements rc2<List<? extends PriceAlertToken>, r37> {
    public final /* synthetic */ db2 $this_apply;
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$onViewCreated$1$1$5(db2 db2, TransferHistoryFragment transferHistoryFragment) {
        super(1);
        this.$this_apply = db2;
        this.this$0 = transferHistoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PriceAlertToken>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r4 == true) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken> r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0026
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x0023
        L_0x000c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0010:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x000a
            java.lang.Object r2 = r4.next()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r2 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r2
            boolean r2 = r2.isStatus()
            if (r2 == 0) goto L_0x0010
            r4 = r0
        L_0x0023:
            if (r4 != r0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x0042
            db2 r4 = r3.$this_apply
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f28130l
            net.safemoon.androidwallet.fragments.TransferHistoryFragment r0 = r3.this$0
            android.content.Context r0 = r0.requireContext()
            r1 = 2131099754(0x7f06006a, float:1.781187E38)
            int r0 = p000.zr0.m31440c(r0, r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r4.setImageTintList(r0)
            goto L_0x005a
        L_0x0042:
            db2 r4 = r3.$this_apply
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f28130l
            net.safemoon.androidwallet.fragments.TransferHistoryFragment r0 = r3.this$0
            android.content.Context r0 = r0.requireContext()
            r1 = 2131099990(0x7f060156, float:1.7812349E38)
            int r0 = p000.zr0.m31440c(r0, r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r4.setImageTintList(r0)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferHistoryFragment$onViewCreated$1$1$5.invoke(java.util.List):void");
    }
}
