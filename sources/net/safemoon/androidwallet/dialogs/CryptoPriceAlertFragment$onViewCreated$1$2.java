package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$2 extends Lambda implements rc2<PriceAlertToken, r37> {
    public final /* synthetic */ m92 $this_with;
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$2(m92 m92, CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(1);
        this.$this_with = m92;
        this.this$0 = cryptoPriceAlertFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PriceAlertToken) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ee, code lost:
        if ((r1 != null ? r1.doubleValue() : 0.0d) <= com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0204, code lost:
        if ((r1 != null ? r1.doubleValue() : 0.0d) <= com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x0206;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0217
            m92 r0 = r9.$this_with
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f31582o
            boolean r1 = r10.isStatus()
            r0.setChecked(r1)
            m92 r0 = r9.$this_with
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f31571d
            boolean r1 = r10.isStatus()
            r0.setEnabled(r1)
            m92 r0 = r9.$this_with
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f31580m
            boolean r1 = r10.isStatus()
            r0.setEnabled(r1)
            m92 r0 = r9.$this_with
            com.google.android.material.button.MaterialButton r0 = r0.f31569b
            net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment r1 = r9.this$0
            java.lang.Integer r2 = r10.getId()
            if (r2 != 0) goto L_0x0033
            r2 = 2131951886(0x7f13010e, float:1.95402E38)
            goto L_0x0036
        L_0x0033:
            r2 = 2131951894(0x7f130116, float:1.9540215E38)
        L_0x0036:
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            m92 r0 = r9.$this_with
            et2 r0 = r0.f31577j
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r0.f28664e
            java.lang.String r2 = "newValue"
            p000.vx2.m53590f(r1, r2)
            java.lang.String r3 = r10.getIncreasePercentString()
            p000.tc7.m72270w(r1, r3)
            com.google.android.material.slider.Slider r1 = r0.f28665f
            java.lang.String r3 = r10.getIncreasePercentString()
            java.math.BigDecimal r3 = p000.ol0.m70331K(r3)
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0066
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_DOWN
            java.math.BigDecimal r3 = r3.setScale(r6, r7)
            if (r3 != 0) goto L_0x006a
        L_0x0066:
            java.lang.Double r3 = java.lang.Double.valueOf(r4)
        L_0x006a:
            float r3 = r3.floatValue()
            r1.setValue(r3)
            boolean r1 = r10.getEnableIncreasePercent()
            com.google.android.material.checkbox.MaterialCheckBox r3 = r0.f28661b
            r3.setChecked(r1)
            com.google.android.material.checkbox.MaterialCheckBox r3 = r0.f28661b
            boolean r7 = r10.isStatus()
            r3.setEnabled(r7)
            com.google.android.material.slider.Slider r3 = r0.f28665f
            r7 = 0
            if (r1 == 0) goto L_0x0090
            boolean r8 = r10.isStatus()
            if (r8 == 0) goto L_0x0090
            r8 = r6
            goto L_0x0091
        L_0x0090:
            r8 = r7
        L_0x0091:
            r3.setEnabled(r8)
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28664e
            if (r1 == 0) goto L_0x00a0
            boolean r1 = r10.isStatus()
            if (r1 == 0) goto L_0x00a0
            r1 = r6
            goto L_0x00a1
        L_0x00a0:
            r1 = r7
        L_0x00a1:
            r0.setEnabled(r1)
            m92 r0 = r9.$this_with
            et2 r0 = r0.f31570c
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r0.f28664e
            p000.vx2.m53590f(r1, r2)
            java.lang.String r3 = r10.getDecreasePercentString()
            p000.tc7.m72270w(r1, r3)
            com.google.android.material.slider.Slider r1 = r0.f28665f
            java.lang.String r3 = r10.getDecreasePercentString()
            java.math.BigDecimal r3 = p000.ol0.m70331K(r3)
            if (r3 == 0) goto L_0x00c8
            java.math.RoundingMode r8 = java.math.RoundingMode.HALF_DOWN
            java.math.BigDecimal r3 = r3.setScale(r6, r8)
            if (r3 != 0) goto L_0x00cc
        L_0x00c8:
            java.lang.Double r3 = java.lang.Double.valueOf(r4)
        L_0x00cc:
            float r3 = r3.floatValue()
            r1.setValue(r3)
            boolean r1 = r10.getEnableDecreasePercent()
            com.google.android.material.checkbox.MaterialCheckBox r3 = r0.f28661b
            r3.setChecked(r1)
            com.google.android.material.checkbox.MaterialCheckBox r3 = r0.f28661b
            boolean r8 = r10.isStatus()
            r3.setEnabled(r8)
            com.google.android.material.slider.Slider r3 = r0.f28665f
            if (r1 == 0) goto L_0x00f1
            boolean r8 = r10.isStatus()
            if (r8 == 0) goto L_0x00f1
            r8 = r6
            goto L_0x00f2
        L_0x00f1:
            r8 = r7
        L_0x00f2:
            r3.setEnabled(r8)
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28664e
            if (r1 == 0) goto L_0x0101
            boolean r1 = r10.isStatus()
            if (r1 == 0) goto L_0x0101
            r1 = r6
            goto L_0x0102
        L_0x0101:
            r1 = r7
        L_0x0102:
            r0.setEnabled(r1)
            m92 r0 = r9.$this_with
            et2 r0 = r0.f31572e
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r0.f28664e
            p000.vx2.m53590f(r1, r2)
            java.lang.String r2 = r10.getPriceReachesString()
            p000.tc7.m72270w(r1, r2)
            com.google.android.material.checkbox.MaterialCheckBox r1 = r0.f28661b
            boolean r2 = r10.isStatus()
            r1.setEnabled(r2)
            com.google.android.material.slider.Slider r1 = r0.f28665f
            boolean r2 = r10.isStatus()
            r1.setEnabled(r2)
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r0.f28664e
            boolean r2 = r10.isStatus()
            if (r2 == 0) goto L_0x013d
            boolean r2 = r10.getPriceReachesOrHigher()
            if (r2 != 0) goto L_0x013b
            boolean r2 = r10.getPriceReachesOrLower()
            if (r2 == 0) goto L_0x013d
        L_0x013b:
            r2 = r6
            goto L_0x013e
        L_0x013d:
            r2 = r7
        L_0x013e:
            r1.setEnabled(r2)
            com.google.android.material.checkbox.MaterialCheckBox r1 = r0.f28662c
            boolean r2 = r10.getPriceReachesOrHigher()
            r1.setChecked(r2)
            com.google.android.material.checkbox.MaterialCheckBox r1 = r0.f28663d
            boolean r2 = r10.getPriceReachesOrLower()
            r1.setChecked(r2)
            com.google.android.material.checkbox.MaterialCheckBox r1 = r0.f28662c
            boolean r2 = r10.isStatus()
            r1.setEnabled(r2)
            com.google.android.material.checkbox.MaterialCheckBox r1 = r0.f28663d
            boolean r2 = r10.isStatus()
            r1.setEnabled(r2)
            com.google.android.material.textview.MaterialTextView r0 = r0.f28666g
            java.lang.String r1 = r10.getCurrencySymbol()
            if (r1 == 0) goto L_0x0174
            rz1$a r2 = p000.rz1.f44501a
            java.lang.String r1 = r2.mo65773c(r1)
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            r0.setText(r1)
            m92 r0 = r9.$this_with
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f31580m
            boolean r1 = r10.isPersistent()
            r0.setChecked(r1)
            int r0 = r10.getRepeat()
            m92 r1 = r9.$this_with
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r1.f31571d
            java.lang.String r2 = "edtMaximum"
            p000.vx2.m53590f(r1, r2)
            if (r0 <= 0) goto L_0x0197
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0199
        L_0x0197:
            java.lang.String r0 = ""
        L_0x0199:
            p000.tc7.m72270w(r1, r0)
            m92 r0 = r9.$this_with
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f31571d
            p000.vx2.m53590f(r0, r2)
            boolean r1 = r10.isPersistent()
            r2 = 8
            if (r1 == 0) goto L_0x01ad
            r1 = r7
            goto L_0x01ae
        L_0x01ad:
            r1 = r2
        L_0x01ae:
            r0.setVisibility(r1)
            m92 r0 = r9.$this_with
            com.google.android.material.textview.MaterialTextView r0 = r0.f31583p
            java.lang.String r1 = "txtMaximumHint"
            p000.vx2.m53590f(r0, r1)
            boolean r1 = r10.isPersistent()
            if (r1 == 0) goto L_0x01c1
            r2 = r7
        L_0x01c1:
            r0.setVisibility(r2)
            m92 r0 = r9.$this_with
            com.google.android.material.button.MaterialButton r0 = r0.f31569b
            java.lang.Integer r1 = r10.getId()
            if (r1 != 0) goto L_0x0214
            boolean r1 = r10.isStatus()
            if (r1 == 0) goto L_0x01f0
            java.lang.Integer r1 = r10.getId()
            if (r1 != 0) goto L_0x01f0
            boolean r1 = r10.getEnableDecreasePercent()
            if (r1 == 0) goto L_0x01f0
            java.lang.Double r1 = r10.getDecreasePercent()
            if (r1 == 0) goto L_0x01eb
            double r1 = r1.doubleValue()
            goto L_0x01ec
        L_0x01eb:
            r1 = r4
        L_0x01ec:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0214
        L_0x01f0:
            boolean r1 = r10.getEnableIncreasePercent()
            if (r1 == 0) goto L_0x0206
            java.lang.Double r1 = r10.getIncreasePercent()
            if (r1 == 0) goto L_0x0201
            double r1 = r1.doubleValue()
            goto L_0x0202
        L_0x0201:
            r1 = r4
        L_0x0202:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0214
        L_0x0206:
            boolean r1 = r10.getPriceReachesOrHigher()
            if (r1 != 0) goto L_0x0214
            boolean r10 = r10.getPriceReachesOrLower()
            if (r10 == 0) goto L_0x0213
            goto L_0x0214
        L_0x0213:
            r6 = r7
        L_0x0214:
            r0.setEnabled(r6)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment$onViewCreated$1$2.invoke(net.safemoon.androidwallet.model.priceAlert.PriceAlertToken):void");
    }
}
