package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: MyTokensListFragment.kt */
public final class MyTokensListFragment$setupAdapter$1 extends Lambda implements rc2<UserTokenItemDisplayModel, r37> {
    public final /* synthetic */ MyTokensListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListFragment$setupAdapter$1(MyTokensListFragment myTokensListFragment) {
        super(1);
        this.this$0 = myTokensListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UserTokenItemDisplayModel) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[EDGE_INSN: B:18:0x005f->B:13:0x005f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "it"
            p000.vx2.m53591g(r9, r0)
            net.safemoon.androidwallet.fragments.MyTokensListFragment r0 = r8.this$0
            net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r0 = r0.mo57503J()
            java.util.ArrayList r0 = r0.mo61294F()
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x0017:
            boolean r1 = r0.hasPrevious()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.previous()
            r4 = r1
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            java.lang.Integer r5 = r4.chainId
            int r6 = r9.getChainId()
            if (r5 != 0) goto L_0x002f
            goto L_0x005a
        L_0x002f:
            int r5 = r5.intValue()
            if (r5 != r6) goto L_0x005a
            java.lang.String r4 = r4.address
            java.lang.String r5 = "swap.address"
            p000.vx2.m53590f(r4, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r6)
            java.lang.String r7 = r9.getContractAddress()
            java.lang.String r5 = r7.toLowerCase(r5)
            p000.vx2.m53590f(r5, r6)
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r3
        L_0x005b:
            if (r4 == 0) goto L_0x0017
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            net.safemoon.androidwallet.model.swap.Swap r1 = (net.safemoon.androidwallet.model.swap.Swap) r1
            if (r1 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            r9.setAllowSwap(r2)
            net.safemoon.androidwallet.fragments.MyTokensListFragment r0 = r8.this$0
            s14$a r9 = p000.s14.m71754d(r9)
            java.lang.String r1 = "actionMyTokensListFragme…     it\n                )"
            p000.vx2.m53590f(r9, r1)
            r0.mo50753j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.MyTokensListFragment$setupAdapter$1.invoke(net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel):void");
    }
}
