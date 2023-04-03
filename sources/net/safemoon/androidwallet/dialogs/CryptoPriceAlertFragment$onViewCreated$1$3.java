package net.safemoon.androidwallet.dialogs;

import android.view.View;
import android.widget.Button;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$3 extends Lambda implements rc2<List<? extends PriceAlertToken>, r37> {
    public final /* synthetic */ m92 $this_with;
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$3(m92 m92, CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(1);
        this.$this_with = m92;
        this.this$0 = cryptoPriceAlertFragment;
    }

    /* renamed from: b */
    public static final void m66024b(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view, View view2) {
        Integer num;
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        k04<Integer> u = cryptoPriceAlertFragment.mo57192Q().mo61139u();
        Object tag = ((Button) view).getTag();
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        u.postValue(num);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PriceAlertToken>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[LOOP:1: B:29:0x0071->B:30:0x0073, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken> r13) {
        /*
            r12 = this;
            m92 r0 = r12.$this_with
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f31578k
            r0.removeAllViews()
            if (r13 == 0) goto L_0x0109
            m92 r0 = r12.$this_with
            com.google.android.material.imageview.ShapeableImageView r0 = r0.f31574g
            boolean r1 = r13.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x0033
        L_0x0017:
            java.util.Iterator r1 = r13.iterator()
        L_0x001b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0015
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r4 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r4
            java.lang.Integer r4 = r4.getId()
            if (r4 != 0) goto L_0x002f
            r4 = r3
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            if (r4 == 0) goto L_0x001b
            r1 = r3
        L_0x0033:
            if (r1 != 0) goto L_0x003e
            int r1 = r13.size()
            r4 = 5
            if (r1 >= r4) goto L_0x003e
            r1 = r3
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            r0.setEnabled(r1)
            m92 r0 = r12.$this_with
            com.google.android.material.imageview.ShapeableImageView r0 = r0.f31575h
            int r1 = r13.size()
            r4 = 0
            if (r1 > r3) goto L_0x0060
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r13)
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r1
            if (r1 == 0) goto L_0x005a
            java.lang.Integer r1 = r1.getId()
            goto L_0x005b
        L_0x005a:
            r1 = r4
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r1 = r2
            goto L_0x0061
        L_0x0060:
            r1 = r3
        L_0x0061:
            r0.setEnabled(r1)
            int r13 = r13.size()
            int[] r0 = new int[r13]
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            r5 = r2
            r6 = r5
        L_0x0071:
            if (r5 >= r13) goto L_0x0082
            r7 = r0[r5]
            int r7 = r6 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
            int r5 = r5 + 1
            r6 = r7
            goto L_0x0071
        L_0x0082:
            net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment r13 = r12.this$0
            m92 r0 = r12.$this_with
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            android.content.Context r6 = r13.requireContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131558648(0x7f0d00f8, float:1.8742618E38)
            android.view.View r6 = r6.inflate(r7, r4)
            boolean r7 = r6 instanceof android.widget.Button
            if (r7 == 0) goto L_0x008a
            r7 = r6
            android.widget.Button r7 = (android.widget.Button) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7.setTag(r8)
            net.safemoon.androidwallet.dialogs.b r7 = new net.safemoon.androidwallet.dialogs.b
            r7.<init>(r13, r6)
            r6.setOnClickListener(r7)
            androidx.appcompat.widget.LinearLayoutCompat r7 = r0.f31578k
            r8 = r6
            android.widget.Button r8 = (android.widget.Button) r8
            int r5 = r5 + r3
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r8.setText(r5)
            r5 = 2
            int[][] r9 = new int[r5][]
            int[] r10 = new int[r3]
            r11 = 16842913(0x10100a1, float:2.369401E-38)
            r10[r2] = r11
            r9[r2] = r10
            int[] r10 = new int[r3]
            r11 = -16842913(0xfffffffffefeff5f, float:-1.6947494E38)
            r10[r2] = r11
            r9[r3] = r10
            int[] r5 = new int[r5]
            android.content.Context r10 = r13.requireContext()
            r11 = 2131099752(0x7f060068, float:1.7811866E38)
            int r10 = p000.zr0.m31440c(r10, r11)
            r5[r2] = r10
            android.content.Context r10 = r13.requireContext()
            r11 = 2131099986(0x7f060152, float:1.781234E38)
            int r10 = p000.zr0.m31440c(r10, r11)
            r5[r3] = r10
            android.content.res.ColorStateList r10 = new android.content.res.ColorStateList
            r10.<init>(r9, r5)
            r8.setTextColor(r10)
            r7.addView(r6)
            goto L_0x008a
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment$onViewCreated$1$3.invoke(java.util.List):void");
    }
}
