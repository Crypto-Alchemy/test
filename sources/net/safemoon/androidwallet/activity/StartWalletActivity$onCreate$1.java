package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$onCreate$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$onCreate$1(StartWalletActivity startWalletActivity) {
        super(1);
        this.this$0 = startWalletActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        if ((r1.length() > 0) == true) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.wallets.Wallet> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "list"
            p000.vx2.m53591g(r8, r0)
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r7.this$0
            boolean r1 = r8 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0015
        L_0x0013:
            r1 = r3
            goto L_0x0038
        L_0x0015:
            java.util.Iterator r1 = r8.iterator()
        L_0x0019:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0013
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.wallets.Wallet r4 = (net.safemoon.androidwallet.model.wallets.Wallet) r4
            java.lang.String r4 = r4.getU5B64()
            if (r4 == 0) goto L_0x0034
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r3
            goto L_0x0035
        L_0x0034:
            r4 = r2
        L_0x0035:
            if (r4 == 0) goto L_0x0019
            r1 = r2
        L_0x0038:
            r0.f41486H = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r8.next()
            r4 = r1
            net.safemoon.androidwallet.model.wallets.Wallet r4 = (net.safemoon.androidwallet.model.wallets.Wallet) r4
            java.lang.String r4 = r4.getU5B64()
            if (r4 == 0) goto L_0x0064
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x005f
            r4 = r2
            goto L_0x0060
        L_0x005f:
            r4 = r3
        L_0x0060:
            if (r4 != r2) goto L_0x0064
            r4 = r2
            goto L_0x0065
        L_0x0064:
            r4 = r3
        L_0x0065:
            if (r4 == 0) goto L_0x0044
            r0.add(r1)
            goto L_0x0044
        L_0x006b:
            net.safemoon.androidwallet.activity.StartWalletActivity r8 = r7.this$0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0076:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "error"
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r0.next()
            r6 = r4
            net.safemoon.androidwallet.model.wallets.Wallet r6 = (net.safemoon.androidwallet.model.wallets.Wallet) r6
            java.lang.String r6 = r6.getPrivateKey()
            java.lang.String r6 = p000.C9377u.m72499d(r8, r6)
            boolean r5 = p000.vx2.m53586b(r6, r5)
            if (r5 == 0) goto L_0x0076
            r1.add(r4)
            goto L_0x0076
        L_0x0097:
            java.util.Iterator r8 = r1.iterator()
        L_0x009b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r8.next()
            net.safemoon.androidwallet.model.wallets.Wallet r0 = (net.safemoon.androidwallet.model.wallets.Wallet) r0
            net.safemoon.androidwallet.activity.StartWalletActivity r1 = r7.this$0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r1 = r1.f8530x
            r1.mo61255q(r0)
            goto L_0x009b
        L_0x00b1:
            net.safemoon.androidwallet.activity.StartWalletActivity r8 = r7.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r8 = p000.ol0.m70351c(r8)
            if (r8 == 0) goto L_0x00e3
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r7.this$0
            java.lang.String r1 = r8.getU5B64()
            if (r1 == 0) goto L_0x00cd
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x00c9
            r1 = r2
            goto L_0x00ca
        L_0x00c9:
            r1 = r3
        L_0x00ca:
            if (r1 != r2) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r2 = r3
        L_0x00ce:
            if (r2 == 0) goto L_0x00e3
            java.lang.String r8 = r8.getPrivateKey()
            java.lang.String r8 = p000.C9377u.m72499d(r0, r8)
            boolean r8 = p000.vx2.m53586b(r8, r5)
            if (r8 == 0) goto L_0x00e3
            java.lang.String r8 = "SAFEMOON_ACTIVE_WALLET"
            p000.f06.m57520k(r0, r8)
        L_0x00e3:
            net.safemoon.androidwallet.activity.StartWalletActivity r8 = r7.this$0
            java.lang.String r0 = r8.mo56894Y0()
            java.lang.String r1 = "masterMnemonic"
            p000.vx2.m53590f(r0, r1)
            r8.mo56902h1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.StartWalletActivity$onCreate$1.invoke(java.util.List):void");
    }
}
