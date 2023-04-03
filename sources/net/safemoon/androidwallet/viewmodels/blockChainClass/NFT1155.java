package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.ERC1155;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R#\u0010)\u001a\n $*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFT1155;", "Lno2;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/WalletWeb3;", "Ljava/math/BigInteger;", "tokenId", "x", "(Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "", "toAddress", "amount", "", "shouldFetchGas", "Lzr1;", "d", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;ZLns0;)Ljava/lang/Object;", "Lss1;", "k", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "", "getChain", "i", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "contractAddress", "j", "I", "g", "()I", "chainId", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "s", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lnet/safemoon/androidwallet/ERC1155;", "kotlin.jvm.PlatformType", "l", "Lef3;", "z", "()Lnet/safemoon/androidwallet/ERC1155;", "erc1155", "<init>", "(Ljava/lang/String;ILnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NFT1155.kt */
public final class NFT1155 extends WalletWeb3 implements no2 {

    /* renamed from: i */
    public final String f43052i;

    /* renamed from: j */
    public final int f43053j;

    /* renamed from: k */
    public final Wallet f43054k;

    /* renamed from: l */
    public final ef3 f43055l = C6169a.m47232a(new NFT1155$erc1155$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT1155(String str, int i, Wallet wallet2) {
        super(i, wallet2);
        vx2.m53591g(str, "contractAddress");
        vx2.m53591g(wallet2, "wallet");
        this.f43052i = str;
        this.f43053j = i;
        this.f43054k = wallet2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61840d(java.lang.String r11, java.math.BigInteger r12, java.math.BigInteger r13, boolean r14, p000.ns0<? super p000.zr1> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$estimateGas$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$estimateGas$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$estimateGas$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$estimateGas$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$estimateGas$1
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r11 = r0.L$3
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r0.L$2
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r14 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155) r14
            p000.hg5.m45199b(r15)
            r9 = r13
            r13 = r11
            r11 = r9
            goto L_0x005b
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            p000.hg5.m45199b(r15)
            if (r14 == 0) goto L_0x005a
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.L$3 = r13
            r0.label = r3
            java.lang.Object r14 = r10.mo61875e(r0)
            if (r14 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r14 = r10
        L_0x005b:
            r2 = r11
            r3 = r12
            r4 = r13
            net.safemoon.androidwallet.ERC1155 r0 = r14.mo61847z()
            cw0 r11 = r14.mo61878h()
            java.lang.String r1 = r11.getAddress()
            java.lang.String r11 = "0x01"
            byte[] r5 = p000.pc4.hexStringToByteArray(r11)
            org.web3j.protocol.core.DefaultBlockParameterName r11 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.math.BigInteger r6 = r14.mo61884o(r11)
            java.math.BigInteger r7 = r14.getGasPrice()
            java.math.BigInteger r8 = r14.mo61880j()
            qt6 r11 = r0.mo56476r(r1, r2, r3, r4, r5, r6, r7, r8)
            vj7 r12 = r14.mo61890w()
            zd5 r11 = r12.ethEstimateGas(r11)
            ag5 r11 = r11.send()
            zr1 r11 = (p000.zr1) r11
            r14.mo61888u(r11)
            zr1 r11 = r14.mo61879i()
            p000.vx2.m53588d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155.mo61840d(java.lang.String, java.math.BigInteger, java.math.BigInteger, boolean, ns0):java.lang.Object");
    }

    /* renamed from: g */
    public int mo61841g() {
        return this.f43053j;
    }

    public int getChain() {
        return mo61841g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61843k(java.lang.String r17, java.math.BigInteger r18, java.math.BigInteger r19, p000.ns0<? super p000.ss1> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$safeTransferFrom$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$safeTransferFrom$1 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$safeTransferFrom$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$safeTransferFrom$1 r2 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155$safeTransferFrom$1
            r2.<init>(r0, r1)
        L_0x001c:
            r8 = r2
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = p000.wx2.m54101d()
            int r3 = r8.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0069
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r2 = r8.L$3
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.lang.Object r3 = r8.L$2
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.Object r4 = r8.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155) r5
            p000.hg5.m45199b(r1)
            r6 = r2
            r9 = r3
            goto L_0x00b9
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            double r5 = r8.D$0
            java.lang.Object r3 = r8.L$3
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.Object r7 = r8.L$2
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.lang.Object r9 = r8.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r10 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155) r10
            p000.hg5.m45199b(r1)
            r11 = r10
            r10 = r3
            r14 = r5
            r5 = r1
            r1 = r9
            r9 = r7
            r6 = r14
            goto L_0x008c
        L_0x0069:
            p000.hg5.m45199b(r1)
            double r6 = r16.mo61882m()
            r8.L$0 = r0
            r1 = r17
            r8.L$1 = r1
            r3 = r18
            r8.L$2 = r3
            r9 = r19
            r8.L$3 = r9
            r8.D$0 = r6
            r8.label = r5
            java.lang.Object r5 = r0.mo61874c(r8)
            if (r5 != r2) goto L_0x0089
            return r2
        L_0x0089:
            r11 = r0
            r10 = r9
            r9 = r3
        L_0x008c:
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 == 0) goto L_0x00ed
            double r12 = r5.doubleValue()
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x00ed
            double r5 = r5.doubleValue()
            r11.mo61873b(r5)
            r7 = 0
            r8.L$0 = r11
            r8.L$1 = r1
            r8.L$2 = r9
            r8.L$3 = r10
            r8.label = r4
            r3 = r11
            r4 = r1
            r5 = r9
            r6 = r10
            java.lang.Object r3 = r3.mo61840d(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x00b5
            return r2
        L_0x00b5:
            r4 = r1
            r1 = r3
            r6 = r10
            r5 = r11
        L_0x00b9:
            zr1 r1 = (p000.zr1) r1
            i75 r12 = r5.mo61889v()
            net.safemoon.androidwallet.ERC1155 r2 = r5.mo61847z()
            cw0 r3 = r5.mo61878h()
            java.lang.String r3 = r3.getAddress()
            java.lang.String r7 = "0x01"
            byte[] r7 = p000.pc4.hexStringToByteArray(r7)
            org.web3j.protocol.core.DefaultBlockParameterName r8 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.math.BigInteger r8 = r5.mo61884o(r8)
            java.math.BigInteger r10 = r5.getGasPrice()
            java.math.BigInteger r1 = r1.getAmountUsed()
            java.math.BigInteger r11 = java.math.BigInteger.ZERO
            r5 = r9
            r9 = r10
            r10 = r1
            h75 r1 = r2.mo56475q(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            ss1 r1 = r12.signAndSend(r1)
            return r1
        L_0x00ed:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155.mo61843k(java.lang.String, java.math.BigInteger, java.math.BigInteger, ns0):java.lang.Object");
    }

    /* renamed from: s */
    public Wallet mo61844s() {
        return this.f43054k;
    }

    /* renamed from: x */
    public final Object mo61845x(BigInteger bigInteger, ns0<? super BigInteger> ns0) {
        BigInteger send = mo61847z().mo56473n(mo61878h().getAddress(), bigInteger).send();
        vx2.m53590f(send, "erc1155.balanceOf(creden….address, tokenId).send()");
        return send;
    }

    /* renamed from: y */
    public final String mo61846y() {
        return this.f43052i;
    }

    /* renamed from: z */
    public final ERC1155 mo61847z() {
        return (ERC1155) this.f43055l.getValue();
    }
}
