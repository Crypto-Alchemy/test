package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$30 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$30(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.Double r17) {
        /*
            r16 = this;
            r0 = r16
            if (r17 == 0) goto L_0x00fc
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r1 = r1.mo57712g1()
            k04 r1 = r1.mo61561G0()
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x00fc
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r1 = r1.mo57712g1()
            k04 r1 = r1.mo61561G0()
            java.lang.Object r1 = r1.getValue()
            p000.vx2.m53588d(r1)
            net.safemoon.androidwallet.viewmodels.SwapViewModel$a r1 = (net.safemoon.androidwallet.viewmodels.SwapViewModel.C8786a) r1
            boolean r1 = r1.mo61635b()
            if (r1 != 0) goto L_0x00fc
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42162r1
            java.lang.String r2 = "bindingDestination"
            r3 = 0
            if (r1 != 0) goto L_0x003c
            p000.vx2.m53605u(r2)
            r1 = r3
        L_0x003c:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r1.f28840m
            android.text.Editable r1 = r1.getText()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0053
            int r1 = r1.length()
            if (r1 != 0) goto L_0x004e
            r1 = r4
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            if (r1 != r4) goto L_0x0053
            r1 = r4
            goto L_0x0054
        L_0x0053:
            r1 = r5
        L_0x0054:
            r6 = 8
            java.lang.String r7 = "bindingSource.hintNewValue"
            java.lang.String r8 = "bindingSource"
            if (r1 != 0) goto L_0x00c5
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42162r1
            if (r1 != 0) goto L_0x0068
            p000.vx2.m53605u(r2)
            r1 = r3
        L_0x0068:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r1.f28840m
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0077
            boolean r1 = p000.yb6.m74325B(r1)
            if (r1 != r4) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r4 = r5
        L_0x0078:
            if (r4 == 0) goto L_0x007b
            goto L_0x00c5
        L_0x007b:
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42160q1
            if (r1 != 0) goto L_0x0087
            p000.vx2.m53605u(r8)
            r1 = r3
        L_0x0087:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r1.f28840m
            double r9 = r17.doubleValue()
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 3
            r15 = 0
            java.lang.String r4 = p000.ol0.m70374p(r9, r11, r12, r13, r14, r15)
            r1.setText(r4)
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42160q1
            if (r1 != 0) goto L_0x00a5
            p000.vx2.m53605u(r8)
            r1 = r3
        L_0x00a5:
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f28838k
            p000.vx2.m53590f(r1, r7)
            r1.setVisibility(r5)
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42162r1
            if (r1 != 0) goto L_0x00b9
            p000.vx2.m53605u(r2)
            goto L_0x00ba
        L_0x00b9:
            r3 = r1
        L_0x00ba:
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f28838k
            java.lang.String r2 = "bindingDestination.hintNewValue"
            p000.vx2.m53590f(r1, r2)
            r1.setVisibility(r6)
            goto L_0x00ed
        L_0x00c5:
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42160q1
            if (r1 != 0) goto L_0x00d1
            p000.vx2.m53605u(r8)
            r1 = r3
        L_0x00d1:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r1 = r1.f28840m
            java.lang.String r2 = ""
            r1.setText(r2)
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            fe7 r1 = r1.f42160q1
            if (r1 != 0) goto L_0x00e4
            p000.vx2.m53605u(r8)
            goto L_0x00e5
        L_0x00e4:
            r3 = r1
        L_0x00e5:
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f28838k
            p000.vx2.m53590f(r1, r7)
            r1.setVisibility(r6)
        L_0x00ed:
            net.safemoon.androidwallet.fragments.SwapFragment r1 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r1 = r1.mo57712g1()
            k04 r1 = r1.mo61588U()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapFragment$onViewCreated$30.invoke(java.lang.Double):void");
    }
}
