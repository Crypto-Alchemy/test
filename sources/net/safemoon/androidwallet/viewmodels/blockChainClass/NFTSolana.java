package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFTSolana;", "Lno2;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/multiNetwork/Solana;", "Ljava/math/BigInteger;", "C", "(Lns0;)Ljava/lang/Object;", "", "toAddress", "tokenId", "amount", "", "shouldFetchGas", "Lzr1;", "d", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;ZLns0;)Ljava/lang/Object;", "Lss1;", "k", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "getGasPrice", "", "getChain", "f", "Ljava/lang/String;", "getContractAddress", "()Ljava/lang/String;", "contractAddress", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "g", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "y", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Ljava/lang/String;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NFTSolana.kt */
public final class NFTSolana extends Solana implements no2 {

    /* renamed from: f */
    public final String f43060f;

    /* renamed from: g */
    public final Wallet f43061g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFTSolana(String str, Wallet wallet2) {
        super(TokenType.SOLANA, wallet2);
        vx2.m53591g(str, "contractAddress");
        vx2.m53591g(wallet2, "wallet");
        this.f43060f = str;
        this.f43061g = wallet2;
    }

    /* renamed from: C */
    public final Object mo61851C(ns0<? super BigInteger> ns0) {
        return mo56295f(this.f43060f, ns0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61840d(java.lang.String r8, java.math.BigInteger r9, java.math.BigInteger r10, boolean r11, p000.ns0<? super p000.zr1> r12) {
        /*
            r7 = this;
            boolean r9 = r12 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$estimateGas$1
            if (r9 == 0) goto L_0x0013
            r9 = r12
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$estimateGas$1 r9 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$estimateGas$1) r9
            int r10 = r9.label
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r10 & r11
            if (r0 == 0) goto L_0x0013
            int r10 = r10 - r11
            r9.label = r10
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$estimateGas$1 r9 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$estimateGas$1
            r9.<init>(r7, r12)
        L_0x0018:
            r6 = r9
            java.lang.Object r9 = r6.result
            java.lang.Object r10 = p000.wx2.m54101d()
            int r11 = r6.label
            r12 = 1
            if (r11 == 0) goto L_0x003a
            if (r11 != r12) goto L_0x0032
            java.lang.Object r8 = r6.L$1
            zr1 r8 = (p000.zr1) r8
            java.lang.Object r10 = r6.L$0
            zr1 r10 = (p000.zr1) r10
            p000.hg5.m45199b(r9)
            goto L_0x0059
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            p000.hg5.m45199b(r9)
            zr1 r9 = new zr1
            r9.<init>()
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r3 = r7.f43060f
            r5 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.label = r12
            r0 = r7
            r4 = r8
            java.lang.Object r8 = r0.mo56294e(r1, r3, r4, r5, r6)
            if (r8 != r10) goto L_0x0056
            return r10
        L_0x0056:
            r10 = r9
            r9 = r8
            r8 = r10
        L_0x0059:
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            if (r9 == 0) goto L_0x0062
            java.lang.String r9 = r9.toString()
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            r8.setResult(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana.mo61840d(java.lang.String, java.math.BigInteger, java.math.BigInteger, boolean, ns0):java.lang.Object");
    }

    public int getChain() {
        return TokenType.SOLANA.getChainId();
    }

    public BigInteger getGasPrice() {
        return mo56297h((Double) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61843k(java.lang.String r10, java.math.BigInteger r11, java.math.BigInteger r12, p000.ns0<? super p000.ss1> r13) {
        /*
            r9 = this;
            boolean r11 = r13 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$safeTransferFrom$1
            if (r11 == 0) goto L_0x0013
            r11 = r13
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$safeTransferFrom$1 r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$safeTransferFrom$1) r11
            int r0 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r11.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$safeTransferFrom$1 r11 = new net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana$safeTransferFrom$1
            r11.<init>(r9, r13)
        L_0x0018:
            r8 = r11
            java.lang.Object r11 = r8.result
            java.lang.Object r13 = p000.wx2.m54101d()
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x002a
            p000.hg5.m45199b(r11)
            goto L_0x004a
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            p000.hg5.m45199b(r11)
            double r11 = r12.doubleValue()
            java.lang.String r3 = r9.f43060f
            r5 = 0
            r6 = 0
            r7 = 0
            r8.label = r1
            r0 = r9
            r1 = r11
            r4 = r10
            java.lang.Object r11 = r0.mo56292b(r1, r3, r4, r5, r6, r7, r8)
            if (r11 != r13) goto L_0x004a
            return r13
        L_0x004a:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x0050
            r10 = 0
            return r10
        L_0x0050:
            ss1 r10 = new ss1
            r10.<init>()
            r10.setResult(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana.mo61843k(java.lang.String, java.math.BigInteger, java.math.BigInteger, ns0):java.lang.Object");
    }

    /* renamed from: y */
    public Wallet mo61853y() {
        return this.f43061g;
    }
}
