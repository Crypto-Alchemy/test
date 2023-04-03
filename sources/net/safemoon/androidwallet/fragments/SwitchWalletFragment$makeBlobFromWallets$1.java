package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletFragment.kt */
public final class SwitchWalletFragment$makeBlobFromWallets$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ StringBuilder $blobBuilder;
    public final /* synthetic */ Wallet $selected;
    public final /* synthetic */ SwitchWalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletFragment$makeBlobFromWallets$1(Wallet wallet2, SwitchWalletFragment switchWalletFragment, StringBuilder sb) {
        super(1);
        this.$selected = wallet2;
        this.this$0 = switchWalletFragment;
        this.$blobBuilder = sb;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0084 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.wallets.Wallet> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "list"
            p000.vx2.m53591g(r11, r0)
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r10.$selected
            boolean r0 = r0.isPrimaryWallet()
            java.lang.String r1 = "|"
            java.lang.String r2 = ","
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0087
            g06 r0 = p000.g06.f37938a
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r5 = r10.this$0
            android.content.Context r5 = r5.requireContext()
            java.lang.String r6 = "requireContext()"
            p000.vx2.m53590f(r5, r6)
            boolean r0 = r0.mo51835d(r5)
            if (r0 != 0) goto L_0x0108
            int r0 = r11.size()
            r5 = r3
        L_0x002b:
            if (r5 >= r0) goto L_0x0108
            java.lang.Object r6 = r11.get(r5)
            net.safemoon.androidwallet.model.wallets.Wallet r6 = (net.safemoon.androidwallet.model.wallets.Wallet) r6
            boolean r7 = r6.isPrimaryWallet()
            if (r7 != 0) goto L_0x0084
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r7 = r10.this$0
            androidx.fragment.app.FragmentActivity r7 = r7.getActivity()
            java.lang.String r8 = r6.getPrivateKey()
            java.lang.String r7 = p000.C9377u.m72499d(r7, r8)
            java.lang.StringBuilder r8 = r10.$blobBuilder
            java.lang.String r9 = r6.getName()
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r6.getKA()
            if (r7 == 0) goto L_0x0069
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0064
            r7 = r4
            goto L_0x0065
        L_0x0064:
            r7 = r3
        L_0x0065:
            if (r7 != r4) goto L_0x0069
            r7 = r4
            goto L_0x006a
        L_0x0069:
            r7 = r3
        L_0x006a:
            if (r7 == 0) goto L_0x0078
            java.lang.StringBuilder r7 = r10.$blobBuilder
            r7.append(r2)
            java.lang.String r6 = r6.getKA()
            r7.append(r6)
        L_0x0078:
            int r6 = r11.size()
            int r6 = r6 - r4
            if (r5 >= r6) goto L_0x0084
            java.lang.StringBuilder r6 = r10.$blobBuilder
            r6.append(r1)
        L_0x0084:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x0087:
            int r0 = r11.size()
            r5 = r3
        L_0x008c:
            if (r5 >= r0) goto L_0x0108
            java.lang.Object r6 = r11.get(r5)
            net.safemoon.androidwallet.model.wallets.Wallet r6 = (net.safemoon.androidwallet.model.wallets.Wallet) r6
            boolean r7 = r6.isPrimaryWallet()
            if (r7 != 0) goto L_0x0105
            java.lang.Long r7 = r6.getId()
            net.safemoon.androidwallet.model.wallets.Wallet r8 = r10.$selected
            java.lang.Long r8 = r8.getId()
            boolean r7 = p000.vx2.m53586b(r7, r8)
            if (r7 == 0) goto L_0x00b3
            net.safemoon.androidwallet.model.wallets.Wallet r7 = r10.$selected
            boolean r7 = r7.isLinked()
            if (r7 == 0) goto L_0x00ba
            goto L_0x0105
        L_0x00b3:
            boolean r7 = r6.isLinked()
            if (r7 != 0) goto L_0x00ba
            goto L_0x0105
        L_0x00ba:
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r7 = r10.this$0
            androidx.fragment.app.FragmentActivity r7 = r7.getActivity()
            java.lang.String r8 = r6.getPrivateKey()
            java.lang.String r7 = p000.C9377u.m72499d(r7, r8)
            java.lang.StringBuilder r8 = r10.$blobBuilder
            java.lang.String r9 = r6.getName()
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r6.getKA()
            if (r7 == 0) goto L_0x00ea
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00e5
            r7 = r4
            goto L_0x00e6
        L_0x00e5:
            r7 = r3
        L_0x00e6:
            if (r7 != r4) goto L_0x00ea
            r7 = r4
            goto L_0x00eb
        L_0x00ea:
            r7 = r3
        L_0x00eb:
            if (r7 == 0) goto L_0x00f9
            java.lang.StringBuilder r7 = r10.$blobBuilder
            r7.append(r2)
            java.lang.String r6 = r6.getKA()
            r7.append(r6)
        L_0x00f9:
            int r6 = r11.size()
            int r6 = r6 - r4
            if (r5 >= r6) goto L_0x0105
            java.lang.StringBuilder r6 = r10.$blobBuilder
            r6.append(r1)
        L_0x0105:
            int r5 = r5 + 1
            goto L_0x008c
        L_0x0108:
            java.lang.StringBuilder r11 = r10.$blobBuilder
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "blobBuilder.toString()"
            p000.vx2.m53590f(r11, r0)
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r0 = r10.this$0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            java.lang.String r11 = p000.C9377u.m72497b(r0, r11)
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r0 = r10.this$0
            java.lang.String r1 = "encryptBlob"
            p000.vx2.m53590f(r11, r1)
            java.lang.String r11 = r0.mo57813f0(r11)
            net.safemoon.androidwallet.fragments.SwitchWalletFragment r0 = r10.this$0
            r0.mo57799I0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwitchWalletFragment$makeBlobFromWallets$1.invoke(java.util.List):void");
    }
}
