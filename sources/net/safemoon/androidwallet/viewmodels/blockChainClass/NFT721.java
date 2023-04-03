package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.ERC721;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R#\u0010)\u001a\n $*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFT721;", "Lno2;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/WalletWeb3;", "Ljava/math/BigInteger;", "tokenId", "", "z", "(Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "", "toAddress", "amount", "shouldFetchGas", "Lzr1;", "d", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;ZLns0;)Ljava/lang/Object;", "Lss1;", "k", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "", "getChain", "i", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "contractAddress", "j", "I", "g", "()I", "chainId", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "s", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lnet/safemoon/androidwallet/ERC721;", "kotlin.jvm.PlatformType", "l", "Lef3;", "y", "()Lnet/safemoon/androidwallet/ERC721;", "erc721", "<init>", "(Ljava/lang/String;ILnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NFT721.kt */
public final class NFT721 extends WalletWeb3 implements no2 {

    /* renamed from: i */
    public final String f43056i;

    /* renamed from: j */
    public final int f43057j;

    /* renamed from: k */
    public final Wallet f43058k;

    /* renamed from: l */
    public final ef3 f43059l = C6169a.m47232a(new NFT721$erc721$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT721(String str, int i, Wallet wallet2) {
        super(i, wallet2);
        vx2.m53591g(str, "contractAddress");
        vx2.m53591g(wallet2, "wallet");
        this.f43056i = str;
        this.f43057j = i;
        this.f43058k = wallet2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61840d(java.lang.String r9, java.math.BigInteger r10, java.math.BigInteger r11, boolean r12, p000.ns0<? super p000.zr1> r13) {
        /*
            r8 = this;
            boolean r11 = r13 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$estimateGas$1
            if (r11 == 0) goto L_0x0013
            r11 = r13
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$estimateGas$1 r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$estimateGas$1) r11
            int r0 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r11.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$estimateGas$1 r11 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$estimateGas$1
            r11.<init>(r8, r13)
        L_0x0018:
            java.lang.Object r13 = r11.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r2) goto L_0x0038
            java.lang.Object r9 = r11.L$2
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            java.lang.Object r10 = r11.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r11.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721) r11
            p000.hg5.m45199b(r13)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            p000.hg5.m45199b(r13)
            if (r12 == 0) goto L_0x0054
            r11.L$0 = r8
            r11.L$1 = r9
            r11.L$2 = r10
            r11.label = r2
            java.lang.Object r11 = r8.mo61875e(r11)
            if (r11 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r11 = r8
        L_0x0055:
            r2 = r9
            r3 = r10
            net.safemoon.androidwallet.ERC721 r0 = r11.mo61849y()
            cw0 r9 = r11.mo61878h()
            java.lang.String r1 = r9.getAddress()
            org.web3j.protocol.core.DefaultBlockParameterName r9 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.math.BigInteger r4 = r11.mo61884o(r9)
            java.math.BigInteger r5 = r11.getGasPrice()
            java.math.BigInteger r6 = r11.mo61880j()
            qt6 r9 = r0.mo56485q(r1, r2, r3, r4, r5, r6)
            vj7 r10 = r11.mo61890w()
            zd5 r9 = r10.ethEstimateGas(r9)
            ag5 r9 = r9.send()
            zr1 r9 = (p000.zr1) r9
            r11.mo61888u(r9)
            zr1 r9 = r11.mo61879i()
            p000.vx2.m53588d(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721.mo61840d(java.lang.String, java.math.BigInteger, java.math.BigInteger, boolean, ns0):java.lang.Object");
    }

    /* renamed from: g */
    public int mo61841g() {
        return this.f43057j;
    }

    public int getChain() {
        return mo61841g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61843k(java.lang.String r17, java.math.BigInteger r18, java.math.BigInteger r19, p000.ns0<? super p000.ss1> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$safeTransferFrom$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$safeTransferFrom$1 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$safeTransferFrom$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$safeTransferFrom$1 r2 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721$safeTransferFrom$1
            r2.<init>(r0, r1)
        L_0x001c:
            r8 = r2
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = p000.wx2.m54101d()
            int r3 = r8.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0064
            if (r3 == r5) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r2 = r8.L$2
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r4 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721) r4
            p000.hg5.m45199b(r1)
            r5 = r2
            r6 = r3
            goto L_0x00b5
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            double r5 = r8.D$0
            java.lang.Object r3 = r8.L$3
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.Object r7 = r8.L$2
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.lang.Object r9 = r8.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r10 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721) r10
            p000.hg5.m45199b(r1)
            r11 = r3
            r14 = r5
            r5 = r1
            r1 = r9
            r9 = r7
            r6 = r14
            goto L_0x0087
        L_0x0064:
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
            if (r5 != r2) goto L_0x0084
            return r2
        L_0x0084:
            r10 = r0
            r11 = r9
            r9 = r3
        L_0x0087:
            java.lang.Double r5 = (java.lang.Double) r5
            r3 = 0
            if (r5 == 0) goto L_0x00e4
            double r12 = r5.doubleValue()
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00e4
            double r5 = r5.doubleValue()
            r10.mo61873b(r5)
            r7 = 0
            r8.L$0 = r10
            r8.L$1 = r1
            r8.L$2 = r9
            r8.L$3 = r3
            r8.label = r4
            r3 = r10
            r4 = r1
            r5 = r9
            r6 = r11
            java.lang.Object r3 = r3.mo61840d(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x00b1
            return r2
        L_0x00b1:
            r6 = r1
            r1 = r3
            r5 = r9
            r4 = r10
        L_0x00b5:
            zr1 r1 = (p000.zr1) r1
            i75 r10 = r4.mo61889v()
            net.safemoon.androidwallet.ERC721 r2 = r4.mo61849y()
            cw0 r3 = r4.mo61878h()
            java.lang.String r3 = r3.getAddress()
            org.web3j.protocol.core.DefaultBlockParameterName r7 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.math.BigInteger r7 = r4.mo61884o(r7)
            java.math.BigInteger r8 = r4.getGasPrice()
            java.math.BigInteger r1 = r1.getAmountUsed()
            java.math.BigInteger r9 = java.math.BigInteger.ZERO
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            h75 r1 = r2.mo56484p(r3, r4, r5, r6, r7, r8, r9)
            ss1 r1 = r10.signAndSend(r1)
            return r1
        L_0x00e4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721.mo61843k(java.lang.String, java.math.BigInteger, java.math.BigInteger, ns0):java.lang.Object");
    }

    /* renamed from: s */
    public Wallet mo61844s() {
        return this.f43058k;
    }

    /* renamed from: x */
    public final String mo61848x() {
        return this.f43056i;
    }

    /* renamed from: y */
    public final ERC721 mo61849y() {
        return (ERC721) this.f43059l.getValue();
    }

    /* renamed from: z */
    public final Object mo61850z(BigInteger bigInteger, ns0<? super Boolean> ns0) {
        String send = mo61849y().mo56483o(bigInteger).send();
        vx2.m53590f(send, "erc721.ownerOf(tokenId).send()");
        Locale locale = Locale.ROOT;
        String lowerCase = send.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String address = mo61878h().getAddress();
        vx2.m53590f(address, "credentails.address");
        String lowerCase2 = address.toLowerCase(locale);
        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return a40.m31670a(vx2.m53586b(lowerCase, lowerCase2));
    }
}
