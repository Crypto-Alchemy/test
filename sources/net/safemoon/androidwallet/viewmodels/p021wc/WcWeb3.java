package net.safemoon.androidwallet.viewmodels.p021wc;

import android.app.Activity;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import java.math.BigInteger;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wc/WcWeb3;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/WalletWeb3;", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "payload", "Lss1;", "z", "(Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;Lns0;)Ljava/lang/Object;", "Ljava/math/BigInteger;", "y", "x", "Landroid/app/Activity;", "i", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "", "j", "I", "g", "()I", "chainId", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "k", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "s", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Landroid/app/Activity;ILnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WcWeb3 */
/* compiled from: WcWeb3.kt */
public final class WcWeb3 extends WalletWeb3 {

    /* renamed from: i */
    public final Activity f43171i;

    /* renamed from: j */
    public final int f43172j;

    /* renamed from: k */
    public final Wallet f43173k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WcWeb3(Activity activity, int i, Wallet wallet2) {
        super(i, wallet2);
        vx2.m53591g(activity, "activity");
        vx2.m53591g(wallet2, "wallet");
        this.f43171i = activity;
        this.f43172j = i;
        this.f43173k = wallet2;
    }

    /* renamed from: g */
    public int mo61841g() {
        return this.f43172j;
    }

    /* renamed from: s */
    public Wallet mo61844s() {
        return this.f43173k;
    }

    /* renamed from: x */
    public final BigInteger mo62015x(WCEthereumTransaction wCEthereumTransaction) {
        BigInteger bigInteger;
        vx2.m53591g(wCEthereumTransaction, "payload");
        if (wCEthereumTransaction.getGasLimit() != null) {
            bigInteger = pc4.decodeQuantity(wCEthereumTransaction.getGasLimit());
        } else if (wCEthereumTransaction.getGas() != null) {
            bigInteger = pc4.decodeQuantity(wCEthereumTransaction.getGas());
        } else {
            zr1 send = mo61890w().ethEstimateGas(qt6.createEthCallTransaction(wCEthereumTransaction.getFrom(), wCEthereumTransaction.getTo(), wCEthereumTransaction.getData())).send();
            if (send.getError() == null) {
                bigInteger = send.getAmountUsed();
            } else {
                bigInteger = BigInteger.valueOf(90000);
            }
        }
        vx2.m53590f(bigInteger, "payload.run {\n          …)\n            }\n        }");
        return bigInteger;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62016y(com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r8, p000.ns0<? super java.math.BigInteger> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3$fetchGasPrice$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3$fetchGasPrice$1 r0 = (net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3$fetchGasPrice$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3$fetchGasPrice$1 r0 = new net.safemoon.androidwallet.viewmodels.wc.WcWeb3$fetchGasPrice$1
            r0.<init>(r7, r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r4.L$0
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3 r8 = (net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3) r8
            p000.hg5.m45199b(r9)
            goto L_0x0060
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p000.hg5.m45199b(r9)
            java.lang.String r9 = r8.getGasPrice()
            if (r9 == 0) goto L_0x0048
            java.lang.String r8 = r8.getGasPrice()
            java.math.BigInteger r8 = p000.pc4.decodeQuantity(r8)
            goto L_0x0064
        L_0x0048:
            net.safemoon.androidwallet.model.common.GasPrice r1 = r7.mo61881l()
            int r8 = r7.mo61841g()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r7
            r4.label = r2
            r2 = r8
            java.lang.Object r8 = net.safemoon.androidwallet.model.common.GasPrice.fetchGasSuspended$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r8 = r7
        L_0x0060:
            java.math.BigInteger r8 = r8.getGasPrice()
        L_0x0064:
            java.lang.String r9 = "payload.run {\n          …getGasPrice() }\n        }"
            p000.vx2.m53590f(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3.mo62016y(com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62017z(com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r9, p000.ns0<? super p000.ss1> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3$sendTransaction$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3$sendTransaction$1 r0 = (net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3$sendTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3$sendTransaction$1 r0 = new net.safemoon.androidwallet.viewmodels.wc.WcWeb3$sendTransaction$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r9 = r0.L$2
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            java.lang.Object r1 = r0.L$1
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r1 = (com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction) r1
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3 r0 = (net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3) r0
            p000.hg5.m45199b(r10)
            r6 = r0
            r0 = r9
            r9 = r1
            goto L_0x006a
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            p000.hg5.m45199b(r10)
            java.lang.String r10 = r9.getNonce()
            if (r10 == 0) goto L_0x0052
            java.lang.String r10 = r9.getNonce()
            java.math.BigInteger r10 = p000.pc4.decodeQuantity(r10)
            goto L_0x0057
        L_0x0052:
            r10 = 0
            java.math.BigInteger r10 = net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3.m69231p(r8, r10, r3, r10)
        L_0x0057:
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r3
            java.lang.Object r0 = r8.mo62016y(r9, r0)
            if (r0 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r6 = r8
            r7 = r0
            r0 = r10
            r10 = r7
        L_0x006a:
            r1 = r10
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.lang.String r10 = r9.getValue()
            if (r10 == 0) goto L_0x007c
            java.lang.String r10 = r9.getValue()
            java.math.BigInteger r10 = p000.pc4.decodeQuantity(r10)
            goto L_0x007e
        L_0x007c:
            java.math.BigInteger r10 = java.math.BigInteger.ZERO
        L_0x007e:
            r4 = r10
            java.math.BigInteger r2 = r6.mo62015x(r9)
            java.lang.String r3 = r9.getTo()
            java.lang.String r5 = r9.getData()
            h75 r9 = p000.h75.createTransaction(r0, r1, r2, r3, r4, r5)
            int r10 = r6.mo61841g()
            long r0 = (long) r10
            cw0 r10 = r6.mo61878h()
            byte[] r9 = p000.vt6.signMessage((p000.h75) r9, (long) r0, (p000.cw0) r10)
            java.lang.String r9 = p000.pc4.toHexString(r9)
            vj7 r10 = r6.mo61890w()
            zd5 r9 = r10.ethSendRawTransaction(r9)
            ag5 r9 = r9.send()
            ss1 r9 = (p000.ss1) r9
            java.lang.String r10 = "payload.run {\n          …    transaction\n        }"
            p000.vx2.m53590f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.p021wc.WcWeb3.mo62017z(com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction, ns0):java.lang.Object");
    }
}
