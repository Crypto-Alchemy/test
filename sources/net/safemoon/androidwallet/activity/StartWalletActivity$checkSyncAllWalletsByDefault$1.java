package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$checkSyncAllWalletsByDefault$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ StringBuilder $blobBuilder;
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$checkSyncAllWalletsByDefault$1(StartWalletActivity startWalletActivity, StringBuilder sb) {
        super(1);
        this.this$0 = startWalletActivity;
        this.$blobBuilder = sb;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.wallets.Wallet> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "list"
            p000.vx2.m53591g(r10, r0)
            int r0 = r10.size()
            r1 = 1
            if (r0 <= r1) goto L_0x00f2
            int r0 = r10.size()
            r2 = 0
            r3 = r2
        L_0x0012:
            if (r3 >= r0) goto L_0x00c9
            java.lang.Object r4 = r10.get(r3)
            net.safemoon.androidwallet.model.wallets.Wallet r4 = (net.safemoon.androidwallet.model.wallets.Wallet) r4
            boolean r5 = r4.isPrimaryWallet()
            if (r5 != 0) goto L_0x00c5
            net.safemoon.androidwallet.activity.StartWalletActivity r5 = r9.this$0
            java.util.Map r5 = r5.f41497k0
            r6 = 0
            java.lang.String r7 = net.safemoon.androidwallet.model.wallets.Wallet.getAddress$default(r4, r2, r1, r6)
            boolean r5 = r5.containsKey(r7)
            if (r5 == 0) goto L_0x007a
            java.lang.String r5 = r4.getName()
            net.safemoon.androidwallet.activity.StartWalletActivity r7 = r9.this$0
            java.util.Map r7 = r7.f41497k0
            java.lang.String r8 = net.safemoon.androidwallet.model.wallets.Wallet.getAddress$default(r4, r2, r1, r6)
            java.lang.Object r7 = r7.get(r8)
            boolean r5 = p000.vx2.m53586b(r5, r7)
            if (r5 != 0) goto L_0x007a
            net.safemoon.androidwallet.activity.StartWalletActivity r5 = r9.this$0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r5 = r5.f8530x
            net.safemoon.androidwallet.activity.StartWalletActivity r7 = r9.this$0
            java.util.Map r7 = r7.f41497k0
            java.lang.String r8 = net.safemoon.androidwallet.model.wallets.Wallet.getAddress$default(r4, r2, r1, r6)
            java.lang.Object r7 = r7.get(r8)
            p000.vx2.m53588d(r7)
            java.lang.String r7 = (java.lang.String) r7
            r5.mo61248G(r4, r7, r1, r6)
            net.safemoon.androidwallet.activity.StartWalletActivity r5 = r9.this$0
            java.util.Map r5 = r5.f41497k0
            java.lang.String r6 = net.safemoon.androidwallet.model.wallets.Wallet.getAddress$default(r4, r2, r1, r6)
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x007a
            r4.setName(r5)
        L_0x007a:
            net.safemoon.androidwallet.activity.StartWalletActivity r5 = r9.this$0
            java.lang.String r6 = r4.getPrivateKey()
            java.lang.String r5 = p000.C9377u.m72499d(r5, r6)
            java.lang.StringBuilder r6 = r9.$blobBuilder
            java.lang.String r7 = r4.getName()
            r6.append(r7)
            java.lang.String r7 = ","
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r4.getKA()
            if (r5 == 0) goto L_0x00a8
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x00a3
            r5 = r1
            goto L_0x00a4
        L_0x00a3:
            r5 = r2
        L_0x00a4:
            if (r5 != r1) goto L_0x00a8
            r5 = r1
            goto L_0x00a9
        L_0x00a8:
            r5 = r2
        L_0x00a9:
            if (r5 == 0) goto L_0x00b7
            java.lang.StringBuilder r5 = r9.$blobBuilder
            r5.append(r7)
            java.lang.String r4 = r4.getKA()
            r5.append(r4)
        L_0x00b7:
            int r4 = r10.size()
            int r4 = r4 - r1
            if (r3 >= r4) goto L_0x00c5
            java.lang.StringBuilder r4 = r9.$blobBuilder
            java.lang.String r5 = "|"
            r4.append(r5)
        L_0x00c5:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x00c9:
            java.lang.StringBuilder r10 = r9.$blobBuilder
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "blobBuilder.toString()"
            p000.vx2.m53590f(r10, r0)
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r9.this$0
            java.lang.String r10 = p000.C9377u.m72497b(r0, r10)
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r9.this$0
            java.lang.String r1 = "encryptBlob"
            p000.vx2.m53590f(r10, r1)
            java.lang.String r10 = r0.mo56890S0(r10)
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r9.this$0
            net.safemoon.androidwallet.utils.Common$RequestSocketState r1 = net.safemoon.androidwallet.utils.Common.RequestSocketState.PUT_BLOB
            r0.f41489M = r1
            net.safemoon.androidwallet.activity.StartWalletActivity r0 = r9.this$0
            r0.mo56903i1(r10)
            goto L_0x00f7
        L_0x00f2:
            net.safemoon.androidwallet.activity.StartWalletActivity r10 = r9.this$0
            r10.mo56887N0()
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.StartWalletActivity$checkSyncAllWalletsByDefault$1.invoke(java.util.List):void");
    }
}
