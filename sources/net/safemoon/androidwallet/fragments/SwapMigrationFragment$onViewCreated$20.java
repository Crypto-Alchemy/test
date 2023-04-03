package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$20 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$20(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.Double r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00b8
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r8.this$0
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r0.mo57762F0()
            k04 r0 = r0.mo61464d0()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x00b8
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r8.this$0
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r0.mo57762F0()
            k04 r0 = r0.mo61464d0()
            java.lang.Object r0 = r0.getValue()
            p000.vx2.m53588d(r0)
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r0 = (net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel.C8738a) r0
            boolean r0 = r0.mo61485b()
            if (r0 != 0) goto L_0x00b8
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r8.this$0
            fe7 r0 = r0.f42185P
            java.lang.String r1 = "bindingDestination"
            r2 = 0
            if (r0 != 0) goto L_0x003a
            p000.vx2.m53605u(r1)
            r0 = r2
        L_0x003a:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28840m
            android.text.Editable r0 = r0.getText()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0051
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004c
            r0 = r3
            goto L_0x004d
        L_0x004c:
            r0 = r4
        L_0x004d:
            if (r0 != r3) goto L_0x0051
            r0 = r3
            goto L_0x0052
        L_0x0051:
            r0 = r4
        L_0x0052:
            java.lang.String r5 = "bindingSource"
            if (r0 != 0) goto L_0x0095
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r8.this$0
            fe7 r0 = r0.f42185P
            if (r0 != 0) goto L_0x0062
            p000.vx2.m53605u(r1)
            r0 = r2
        L_0x0062:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28840m
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0071
            boolean r0 = p000.yb6.m74325B(r0)
            if (r0 != r3) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r4
        L_0x0072:
            if (r3 == 0) goto L_0x0075
            goto L_0x0095
        L_0x0075:
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r8.this$0
            fe7 r0 = r0.f42184M
            if (r0 != 0) goto L_0x0081
            p000.vx2.m53605u(r5)
            goto L_0x0082
        L_0x0081:
            r2 = r0
        L_0x0082:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r2.f28840m
            double r1 = r9.doubleValue()
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 3
            r7 = 0
            java.lang.String r9 = p000.ol0.m70374p(r1, r3, r4, r5, r6, r7)
            r0.setText(r9)
            goto L_0x00a9
        L_0x0095:
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r9 = r8.this$0
            fe7 r9 = r9.f42184M
            if (r9 != 0) goto L_0x00a1
            p000.vx2.m53605u(r5)
            goto L_0x00a2
        L_0x00a1:
            r2 = r9
        L_0x00a2:
            net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r9 = r2.f28840m
            java.lang.String r0 = ""
            r9.setText(r0)
        L_0x00a9:
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r9 = r8.this$0
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r9 = r9.mo57762F0()
            k04 r9 = r9.mo61442H()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.setValue(r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapMigrationFragment$onViewCreated$20.invoke(java.lang.Double):void");
    }
}
