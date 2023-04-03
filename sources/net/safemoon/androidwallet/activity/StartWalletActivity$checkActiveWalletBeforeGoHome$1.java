package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$checkActiveWalletBeforeGoHome$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$checkActiveWalletBeforeGoHome$1(StartWalletActivity startWalletActivity) {
        super(1);
        this.this$0 = startWalletActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (p000.vx2.m53586b(r1, r0.getName()) == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.wallets.Wallet> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "list"
            p000.vx2.m53591g(r6, r0)
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r5.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r0 = p000.ol0.m70351c(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0034
            java.util.Iterator r6 = r6.iterator()
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r6.next()
            r2 = r0
            net.safemoon.androidwallet.model.wallets.Wallet r2 = (net.safemoon.androidwallet.model.wallets.Wallet) r2
            boolean r2 = r2.isPrimaryWallet()
            if (r2 == 0) goto L_0x0012
            r1 = r0
        L_0x0026:
            net.safemoon.androidwallet.model.wallets.Wallet r1 = (net.safemoon.androidwallet.model.wallets.Wallet) r1
            if (r1 == 0) goto L_0x008b
            net.safemoon.androidwallet.activity.StartWalletActivity r6 = r5.this$0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r6 = r6.f8530x
            r6.mo61245D(r1)
            goto L_0x008b
        L_0x0034:
            java.util.Iterator r6 = r6.iterator()
        L_0x0038:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r6.next()
            r3 = r2
            net.safemoon.androidwallet.model.wallets.Wallet r3 = (net.safemoon.androidwallet.model.wallets.Wallet) r3
            java.lang.Long r3 = r3.getId()
            java.lang.Long r4 = r0.getId()
            boolean r3 = p000.vx2.m53586b(r3, r4)
            if (r3 == 0) goto L_0x0038
            goto L_0x0055
        L_0x0054:
            r2 = r1
        L_0x0055:
            net.safemoon.androidwallet.model.wallets.Wallet r2 = (net.safemoon.androidwallet.model.wallets.Wallet) r2
            java.lang.String r6 = r0.getU5B64()
            r3 = 1
            if (r6 == 0) goto L_0x0067
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r6 = 0
            goto L_0x0068
        L_0x0067:
            r6 = r3
        L_0x0068:
            if (r6 != 0) goto L_0x007a
            if (r2 == 0) goto L_0x0070
            java.lang.String r1 = r2.getName()
        L_0x0070:
            java.lang.String r6 = r0.getName()
            boolean r6 = p000.vx2.m53586b(r1, r6)
            if (r6 != 0) goto L_0x0080
        L_0x007a:
            if (r2 != 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            r2.setLinkedState(r3)
        L_0x0080:
            if (r2 == 0) goto L_0x008b
            net.safemoon.androidwallet.activity.StartWalletActivity r6 = r5.this$0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r6 = r6.f8530x
            r6.mo61245D(r2)
        L_0x008b:
            net.safemoon.androidwallet.activity.StartWalletActivity r6 = r5.this$0
            r6.mo56896a1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.StartWalletActivity$checkActiveWalletBeforeGoHome$1.invoke(java.util.List):void");
    }
}
