package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/swap/Swap;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$3 extends Lambda implements rc2<List<? extends Swap>, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$3(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends Swap>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (p000.vx2.m53586b(r0 != null ? r0.getSymbol() : null, "WETH") != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<? extends net.safemoon.androidwallet.model.swap.Swap> r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0145
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r0 = r0.mo57758B0()
            java.lang.String r1 = "it.address"
            r2 = -1
            java.lang.String r3 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00a4
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r0 = r0.mo57758B0()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r0.getContractAddress()
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0028
            r0 = r5
            goto L_0x0029
        L_0x0028:
            r0 = r6
        L_0x0029:
            if (r0 != r5) goto L_0x002d
            r0 = r5
            goto L_0x002e
        L_0x002d:
            r0 = r6
        L_0x002e:
            if (r0 == 0) goto L_0x00a4
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r0 = r0.mo57758B0()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.getSymbol()
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            java.lang.String r7 = "WBNB"
            boolean r0 = p000.vx2.m53586b(r0, r7)
            if (r0 != 0) goto L_0x005c
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r0 = r0.mo57758B0()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.getSymbol()
            goto L_0x0054
        L_0x0053:
            r0 = r4
        L_0x0054:
            java.lang.String r7 = "WETH"
            boolean r0 = p000.vx2.m53586b(r0, r7)
            if (r0 == 0) goto L_0x00a4
        L_0x005c:
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            java.util.Iterator r7 = r13.iterator()
            r8 = r6
        L_0x0063:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x009e
            java.lang.Object r9 = r7.next()
            net.safemoon.androidwallet.model.swap.Swap r9 = (net.safemoon.androidwallet.model.swap.Swap) r9
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r10 = r0.mo57758B0()
            if (r10 == 0) goto L_0x0085
            java.lang.String r10 = r10.getContractAddress()
            if (r10 == 0) goto L_0x0085
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            p000.vx2.m53590f(r10, r3)
            goto L_0x0086
        L_0x0085:
            r10 = r4
        L_0x0086:
            java.lang.String r9 = r9.address
            p000.vx2.m53590f(r9, r1)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r11)
            p000.vx2.m53590f(r9, r3)
            boolean r9 = p000.vx2.m53586b(r10, r9)
            if (r9 == 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            int r8 = r8 + 1
            goto L_0x0063
        L_0x009e:
            r8 = r2
        L_0x009f:
            int r0 = p000.d75.m43382d(r8, r6)
            goto L_0x00a5
        L_0x00a4:
            r0 = r6
        L_0x00a5:
            if (r0 != 0) goto L_0x0113
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r7 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r7 = r7.mo57758B0()
            if (r7 == 0) goto L_0x0113
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r7 = r12.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r7 = r7.mo57758B0()
            if (r7 == 0) goto L_0x00ca
            java.lang.String r7 = r7.getContractAddress()
            if (r7 == 0) goto L_0x00ca
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00c5
            r7 = r5
            goto L_0x00c6
        L_0x00c5:
            r7 = r6
        L_0x00c6:
            if (r7 != r5) goto L_0x00ca
            r7 = r5
            goto L_0x00cb
        L_0x00ca:
            r7 = r6
        L_0x00cb:
            if (r7 == 0) goto L_0x0113
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r7 = r12.this$0
            java.util.Iterator r8 = r13.iterator()
        L_0x00d3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x010f
            java.lang.Object r9 = r8.next()
            net.safemoon.androidwallet.model.swap.Swap r9 = (net.safemoon.androidwallet.model.swap.Swap) r9
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r10 = r7.mo57758B0()
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = r10.getContractAddress()
            if (r10 == 0) goto L_0x00f5
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            p000.vx2.m53590f(r10, r3)
            goto L_0x00f6
        L_0x00f5:
            r10 = r4
        L_0x00f6:
            java.lang.String r9 = r9.address
            p000.vx2.m53590f(r9, r1)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r11)
            p000.vx2.m53590f(r9, r3)
            boolean r9 = p000.vx2.m53586b(r10, r9)
            if (r9 == 0) goto L_0x010c
            r2 = r6
            goto L_0x010f
        L_0x010c:
            int r6 = r6 + 1
            goto L_0x00d3
        L_0x010f:
            int r5 = p000.d75.m43382d(r2, r5)
        L_0x0113:
            int r1 = r13.size()
            if (r1 <= r0) goto L_0x012c
            java.lang.Object r0 = r13.get(r0)
            net.safemoon.androidwallet.model.swap.Swap r0 = (net.safemoon.androidwallet.model.swap.Swap) r0
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r1 = r12.this$0
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r1 = r1.mo57762F0()
            k04 r1 = r1.mo61459Y()
            r1.setValue(r0)
        L_0x012c:
            int r0 = r13.size()
            if (r0 <= r5) goto L_0x0145
            java.lang.Object r13 = r13.get(r5)
            net.safemoon.androidwallet.model.swap.Swap r13 = (net.safemoon.androidwallet.model.swap.Swap) r13
            net.safemoon.androidwallet.fragments.SwapMigrationFragment r0 = r12.this$0
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r0.mo57762F0()
            k04 r0 = r0.mo61446L()
            r0.setValue(r13)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapMigrationFragment$onViewCreated$3.invoke(java.util.List):void");
    }
}
