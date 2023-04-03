package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import p000.mo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u00100J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J+\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010.\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/multiNetwork/Bitcoin;", "Lmo2;", "", "contractAddress", "Ljava/math/BigInteger;", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "amount", "receiver", "estimateGas", "estimateGasPrice", "", "decimals", "b", "(DLjava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/lang/Double;ILns0;)Ljava/lang/Object;", "_recipient", "e", "(DLjava/lang/String;Ljava/lang/String;ILns0;)Ljava/lang/Object;", "T", "hash", "j", "_gasPriceInGWEI", "kotlin.jvm.PlatformType", "h", "(Ljava/lang/Double;)Ljava/math/BigInteger;", "g", "()Ljava/lang/Double;", "c", "(Lns0;)Ljava/lang/Object;", "newGasPriceInGWEI", "Lr37;", "i", "Lwallet/core/jni/proto/Bitcoin$SigningInput;", "k", "(DLjava/lang/String;ILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lnet/safemoon/androidwallet/common/TokenType;", "getTokenType", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "getWallet", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Lnet/safemoon/androidwallet/common/TokenType;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Bitcoin.kt */
public final class Bitcoin implements mo2 {

    /* renamed from: a */
    public final TokenType f43080a;

    /* renamed from: b */
    public final Wallet f43081b;

    public Bitcoin(TokenType tokenType, Wallet wallet2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(wallet2, "wallet");
        this.f43080a = tokenType;
        this.f43081b = wallet2;
    }

    /* renamed from: a */
    public String mo56291a(TokenType tokenType, Wallet wallet2) {
        return mo2.C7906a.m64364a(this, tokenType, wallet2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56292b(double r13, java.lang.String r15, java.lang.String r16, java.math.BigInteger r17, java.lang.Double r18, int r19, p000.ns0<? super java.lang.String> r20) {
        /*
            r12 = this;
            r0 = r20
            boolean r1 = r0 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$signAndSendTransaction$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$signAndSendTransaction$1 r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$signAndSendTransaction$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r8 = r12
            goto L_0x001c
        L_0x0016:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$signAndSendTransaction$1 r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$signAndSendTransaction$1
            r8 = r12
            r1.<init>(r12, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r9 = p000.wx2.m54101d()
            int r2 = r1.label
            r10 = 2
            r3 = 1
            r11 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 == r3) goto L_0x0039
            if (r2 != r10) goto L_0x0031
            p000.hg5.m45199b(r0)
            goto L_0x0089
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            p000.hg5.m45199b(r0)
            goto L_0x0050
        L_0x003d:
            p000.hg5.m45199b(r0)
            r1.label = r3
            r2 = r12
            r3 = r13
            r5 = r16
            r6 = r19
            r7 = r1
            java.lang.Object r0 = r2.mo61891k(r3, r5, r6, r7)
            if (r0 != r9) goto L_0x0050
            return r9
        L_0x0050:
            wallet.core.jni.proto.Bitcoin$SigningInput r0 = (wallet.core.jni.proto.Bitcoin.SigningInput) r0
            wallet.core.jni.CoinType r2 = wallet.core.jni.CoinType.BITCOIN
            im4 r3 = wallet.core.jni.proto.Bitcoin.SigningOutput.parser()
            com.google.protobuf.c0 r0 = wallet.core.java.AnySigner.sign(r0, r2, r3)
            wallet.core.jni.proto.Bitcoin$SigningOutput r0 = (wallet.core.jni.proto.Bitcoin.SigningOutput) r0
            r0.getError()
            wallet.core.jni.proto.Common$SigningError r2 = wallet.core.jni.proto.Common.SigningError.OK
            com.google.protobuf.ByteString r0 = r0.getEncoded()
            if (r0 == 0) goto L_0x006e
            byte[] r0 = r0.toByteArray()
            goto L_0x006f
        L_0x006e:
            r0 = r11
        L_0x006f:
            if (r0 == 0) goto L_0x0077
            r2 = 0
            java.lang.String r0 = p000.ol0.m70356e0(r0, r2)
            goto L_0x0078
        L_0x0077:
            r0 = r11
        L_0x0078:
            if (r0 == 0) goto L_0x0097
            ll1 r2 = p000.ll1.f40640a
            k90 r0 = r2.mo55921g(r0)
            r1.label = r10
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r1)
            if (r0 != r9) goto L_0x0089
            return r9
        L_0x0089:
            bg5 r0 = (p000.bg5) r0
            java.lang.Object r0 = r0.mo50578a()
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSendTxResponse r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSendTxResponse) r0
            if (r0 == 0) goto L_0x0097
            java.lang.String r11 = r0.getResult()
        L_0x0097:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin.mo56292b(double, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.Double, int, ns0):java.lang.Object");
    }

    /* renamed from: c */
    public Object mo56293c(ns0<? super Double> ns0) {
        return a40.m31671b(1.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56294e(double r7, java.lang.String r9, java.lang.String r10, int r11, p000.ns0<? super java.math.BigInteger> r12) {
        /*
            r6 = this;
            boolean r9 = r12 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getEstimateGas$1
            if (r9 == 0) goto L_0x0013
            r9 = r12
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getEstimateGas$1 r9 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getEstimateGas$1) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r9.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getEstimateGas$1 r9 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getEstimateGas$1
            r9.<init>(r6, r12)
        L_0x0018:
            r5 = r9
            java.lang.Object r9 = r5.result
            java.lang.Object r12 = p000.wx2.m54101d()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x002a
            p000.hg5.m45199b(r9)
            goto L_0x0042
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            p000.hg5.m45199b(r9)
            r5.label = r1
            r0 = r6
            r1 = r7
            r3 = r10
            r4 = r11
            java.lang.Object r9 = r0.mo61891k(r1, r3, r4, r5)
            if (r9 != r12) goto L_0x0042
            return r12
        L_0x0042:
            wallet.core.jni.proto.Bitcoin$SigningInput r9 = (wallet.core.jni.proto.Bitcoin.SigningInput) r9
            wallet.core.jni.proto.Bitcoin$TransactionPlan r7 = r9.getPlan()
            long r7 = r7.getFee()
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.lang.String r8 = "valueOf(this)"
            p000.vx2.m53590f(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin.mo56294e(double, java.lang.String, java.lang.String, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[Catch:{ Exception -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[Catch:{ Exception -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56295f(java.lang.String r4, p000.ns0<? super java.math.BigInteger> r5) throws java.lang.Exception {
        /*
            r3 = this;
            boolean r4 = r5 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getBalance$1
            if (r4 == 0) goto L_0x0013
            r4 = r5
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getBalance$1 r4 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getBalance$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r4.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getBalance$1 r4 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getBalance$1
            r4.<init>(r3, r5)
        L_0x0018:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            p000.hg5.m45199b(r5)     // Catch:{ Exception -> 0x006c }
            goto L_0x004e
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p000.hg5.m45199b(r5)
            net.safemoon.androidwallet.common.TokenType r5 = r3.f43080a     // Catch:{ Exception -> 0x006c }
            net.safemoon.androidwallet.model.wallets.Wallet r1 = r3.f43081b     // Catch:{ Exception -> 0x006c }
            java.lang.String r5 = r3.mo56291a(r5, r1)     // Catch:{ Exception -> 0x006c }
            ll1 r1 = p000.ll1.f40640a     // Catch:{ Exception -> 0x006c }
            p000.vx2.m53588d(r5)     // Catch:{ Exception -> 0x006c }
            k90 r5 = r1.mo55915a(r5)     // Catch:{ Exception -> 0x006c }
            r4.label = r2     // Catch:{ Exception -> 0x006c }
            java.lang.Object r5 = retrofit2.KotlinExtensions.m71521c(r5, r4)     // Catch:{ Exception -> 0x006c }
            if (r5 != r0) goto L_0x004e
            return r0
        L_0x004e:
            bg5 r5 = (p000.bg5) r5     // Catch:{ Exception -> 0x006c }
            java.lang.Object r4 = r5.mo50578a()     // Catch:{ Exception -> 0x006c }
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinBalanceResponse r4 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinBalanceResponse) r4     // Catch:{ Exception -> 0x006c }
            if (r4 == 0) goto L_0x0064
            java.lang.String r4 = r4.getBalance()     // Catch:{ Exception -> 0x006c }
            if (r4 == 0) goto L_0x0064
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ Exception -> 0x006c }
            r5.<init>(r4)     // Catch:{ Exception -> 0x006c }
            goto L_0x0066
        L_0x0064:
            java.math.BigInteger r5 = java.math.BigInteger.ZERO     // Catch:{ Exception -> 0x006c }
        L_0x0066:
            java.lang.String r4 = "{\n            val addres…BigInteger.ZERO\n        }"
            p000.vx2.m53590f(r5, r4)     // Catch:{ Exception -> 0x006c }
            goto L_0x0073
        L_0x006c:
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            java.lang.String r4 = "{\n            BigInteger.ZERO\n        }"
            p000.vx2.m53590f(r5, r4)
        L_0x0073:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin.mo56295f(java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: g */
    public Double mo56296g() {
        return Double.valueOf(1.0d);
    }

    /* renamed from: h */
    public BigInteger mo56297h(Double d) {
        return new BigDecimal(1.0d).multiply(BigDecimal.TEN.pow(10)).toBigInteger();
    }

    /* renamed from: i */
    public void mo56298i(double d) {
    }

    /* renamed from: j */
    public <T> Object mo56299j(String str, ns0<? super T> ns0) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61891k(double r19, java.lang.String r21, int r22, p000.ns0<? super wallet.core.jni.proto.Bitcoin.SigningInput> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getSignInputP2WPKH$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getSignInputP2WPKH$1 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getSignInputP2WPKH$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getSignInputP2WPKH$1 r2 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin$getSignInputP2WPKH$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0066
            if (r4 == r7) goto L_0x0046
            if (r4 != r6) goto L_0x003e
            java.lang.Object r3 = r2.L$2
            wallet.core.jni.proto.Bitcoin$SigningInput$Builder r3 = (wallet.core.jni.proto.Bitcoin.SigningInput.Builder) r3
            java.lang.Object r4 = r2.L$1
            byte[] r4 = (byte[]) r4
            java.lang.Object r2 = r2.L$0
            wallet.core.jni.CoinType r2 = (wallet.core.jni.CoinType) r2
            p000.hg5.m45199b(r1)
            goto L_0x012e
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            java.lang.Object r4 = r2.L$6
            byte[] r4 = (byte[]) r4
            java.lang.Object r9 = r2.L$5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$3
            byte[] r11 = (byte[]) r11
            java.lang.Object r12 = r2.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$1
            wallet.core.jni.CoinType r13 = (wallet.core.jni.CoinType) r13
            java.lang.Object r14 = r2.L$0
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            p000.hg5.m45199b(r1)
            goto L_0x00c9
        L_0x0066:
            p000.hg5.m45199b(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r4 = java.lang.String.valueOf(r19)
            r1.<init>(r4)
            r4 = r22
            java.math.BigInteger r14 = p000.ol0.m70362h0(r1, r4)
            wallet.core.jni.CoinType r1 = wallet.core.jni.CoinType.BITCOIN
            net.safemoon.androidwallet.common.TokenType r4 = r0.f43080a
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r0.f43081b
            java.lang.String r12 = r0.mo56291a(r4, r9)
            p000.vx2.m53588d(r12)
            net.safemoon.androidwallet.model.wallets.Wallet r4 = r0.f43081b
            int r9 = r1.value()
            byte[] r11 = r4.getPrivateKeyAsBytes(r9)
            wallet.core.jni.AnyAddress r4 = new wallet.core.jni.AnyAddress
            r9 = r21
            r4.<init>((java.lang.String) r9, (wallet.core.jni.CoinType) r1)
            java.lang.String r10 = r4.description()
            net.safemoon.androidwallet.common.TokenType r4 = r0.f43080a
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r0.f43081b
            java.lang.String r9 = r0.mo56291a(r4, r9)
            p000.vx2.m53588d(r9)
            wallet.core.jni.BitcoinScript r4 = wallet.core.jni.BitcoinScript.lockScriptForAddress(r12, r1)
            byte[] r4 = r4.data()
            r2.L$0 = r14
            r2.L$1 = r1
            r2.L$2 = r12
            r2.L$3 = r11
            r2.L$4 = r10
            r2.L$5 = r9
            r2.L$6 = r4
            r2.label = r7
            java.lang.Object r13 = r0.mo56295f(r8, r2)
            if (r13 != r3) goto L_0x00c4
            return r3
        L_0x00c4:
            r17 = r13
            r13 = r1
            r1 = r17
        L_0x00c9:
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r1 = r1.subtract(r14)
            r15 = 1
            java.math.BigInteger r15 = java.math.BigInteger.valueOf(r15)
            int r1 = r1.compareTo(r15)
            if (r1 > 0) goto L_0x00dd
            r1 = r7
            goto L_0x00de
        L_0x00dd:
            r1 = 0
        L_0x00de:
            wallet.core.jni.proto.Bitcoin$SigningInput$Builder r15 = wallet.core.jni.proto.Bitcoin.SigningInput.newBuilder()
            long r5 = r14.longValue()
            r15.setAmount(r5)
            wallet.core.jni.CoinType r5 = wallet.core.jni.CoinType.BITCOIN
            int r5 = wallet.core.jni.BitcoinScript.hashTypeForCoin(r5)
            r15.setHashType(r5)
            r15.setToAddress(r10)
            r15.setChangeAddress(r9)
            r5 = 33
            r15.setByteFee(r5)
            int r5 = r13.value()
            r15.setCoinType(r5)
            r15.setUseMaxAmount(r1)
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom((byte[]) r11)
            r15.addPrivateKey(r1)
            ll1 r1 = p000.ll1.f40640a
            k90 r1 = r1.mo55917c(r12)
            r2.L$0 = r13
            r2.L$1 = r4
            r2.L$2 = r15
            r2.L$3 = r8
            r2.L$4 = r8
            r2.L$5 = r8
            r2.L$6 = r8
            r5 = 2
            r2.label = r5
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)
            if (r1 != r3) goto L_0x012c
            return r3
        L_0x012c:
            r2 = r13
            r3 = r15
        L_0x012e:
            bg5 r1 = (p000.bg5) r1
            java.lang.Object r1 = r1.mo50578a()
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponse r1 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponse) r1
            if (r1 == 0) goto L_0x01b4
            java.util.Iterator r1 = r1.iterator()
        L_0x013c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = r1.next()
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponseItem r5 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponseItem) r5
            java.lang.String r6 = r5.getTxid()
            if (r6 == 0) goto L_0x0157
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r6 = 0
            goto L_0x0158
        L_0x0157:
            r6 = r7
        L_0x0158:
            if (r6 != 0) goto L_0x013c
            java.lang.Integer r6 = r5.getVout()
            if (r6 == 0) goto L_0x013c
            java.lang.String r6 = r5.getTxid()
            byte[] r6 = com.trustwallet.walletconnect.extensions.StringKt.hexStringToByteArray(r6)
            wallet.core.jni.proto.Bitcoin$OutPoint$Builder r8 = wallet.core.jni.proto.Bitcoin.OutPoint.newBuilder()
            byte[] r6 = kotlin.collections.ArraysKt___ArraysKt.m47275a0(r6)
            com.google.protobuf.ByteString r6 = com.google.protobuf.ByteString.copyFrom((byte[]) r6)
            r8.setHash(r6)
            java.lang.Integer r6 = r5.getVout()
            int r6 = r6.intValue()
            r8.setIndex(r6)
            r6 = -1
            r8.setSequence(r6)
            com.google.protobuf.GeneratedMessageLite r6 = r8.build()
            wallet.core.jni.proto.Bitcoin$OutPoint r6 = (wallet.core.jni.proto.Bitcoin.OutPoint) r6
            wallet.core.jni.proto.Bitcoin$UnspentTransaction$Builder r8 = wallet.core.jni.proto.Bitcoin.UnspentTransaction.newBuilder()
            java.lang.String r5 = r5.getValue()
            if (r5 == 0) goto L_0x019b
            long r9 = java.lang.Long.parseLong(r5)
            goto L_0x019d
        L_0x019b:
            r9 = 0
        L_0x019d:
            r8.setAmount(r9)
            r8.setOutPoint((wallet.core.jni.proto.Bitcoin.OutPoint) r6)
            com.google.protobuf.ByteString r5 = com.google.protobuf.ByteString.copyFrom((byte[]) r4)
            r8.setScript(r5)
            com.google.protobuf.GeneratedMessageLite r5 = r8.build()
            wallet.core.jni.proto.Bitcoin$UnspentTransaction r5 = (wallet.core.jni.proto.Bitcoin.UnspentTransaction) r5
            r3.addUtxo((wallet.core.jni.proto.Bitcoin.UnspentTransaction) r5)
            goto L_0x013c
        L_0x01b4:
            com.google.protobuf.GeneratedMessageLite r1 = r3.build()
            im4 r4 = wallet.core.jni.proto.Bitcoin.TransactionPlan.parser()
            com.google.protobuf.c0 r1 = wallet.core.java.AnySigner.plan(r1, r2, r4)
            wallet.core.jni.proto.Bitcoin$TransactionPlan r1 = (wallet.core.jni.proto.Bitcoin.TransactionPlan) r1
            r3.setPlan((wallet.core.jni.proto.Bitcoin.TransactionPlan) r1)
            com.google.protobuf.GeneratedMessageLite r1 = r3.build()
            java.lang.String r2 = "input.build()"
            p000.vx2.m53590f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin.mo61891k(double, java.lang.String, int, ns0):java.lang.Object");
    }
}
