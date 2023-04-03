package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.wallets.Wallet;
import org.web3j.protocol.core.DefaultBlockParameterName;
import p000.mo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\bH\u0010IJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJK\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u000e\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0015\u0010#\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001fJ\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001d\u00105\u001a\u0004\u0018\u00010\u00028FX\u0002¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104R#\u00109\u001a\n \u0017*\u0004\u0018\u000106068FX\u0002¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020:8\u0004X\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010C\u001a\u00020?8\u0004X\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\"\u0010G\u001a\n \u0017*\u0004\u0018\u00010\u00040\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u001c\u0010D\u001a\u0004\bE\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/multiNetwork/EVM;", "Lmo2;", "", "contractAddress", "Ljava/math/BigInteger;", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "amount", "_recipient", "", "decimals", "e", "(DLjava/lang/String;Ljava/lang/String;ILns0;)Ljava/lang/Object;", "receiver", "estimateGas", "estimateGasPrice", "b", "(DLjava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/lang/Double;ILns0;)Ljava/lang/Object;", "T", "hash", "j", "Lvj7;", "kotlin.jvm.PlatformType", "q", "_gasPriceInGWEI", "h", "(Ljava/lang/Double;)Ljava/math/BigInteger;", "g", "()Ljava/lang/Double;", "c", "(Lns0;)Ljava/lang/Object;", "gasPriceInGWEI", "Lr37;", "i", "l", "gasLimit", "Lnet/safemoon/androidwallet/ERC20;", "d", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lnet/safemoon/androidwallet/common/TokenType;", "o", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "p", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lef3;", "m", "()Ljava/lang/String;", "privateKey", "Lcw0;", "k", "()Lcw0;", "credentials", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "getGasPrice", "()Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "Lnet/safemoon/androidwallet/model/common/Gas;", "Lnet/safemoon/androidwallet/model/common/Gas;", "getGas", "()Lnet/safemoon/androidwallet/model/common/Gas;", "gas", "Ljava/math/BigInteger;", "getGAS_LIMIT", "()Ljava/math/BigInteger;", "GAS_LIMIT", "<init>", "(Lnet/safemoon/androidwallet/common/TokenType;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EVM.kt */
public final class EVM implements mo2 {

    /* renamed from: a */
    public final TokenType f43084a;

    /* renamed from: b */
    public final Wallet f43085b;

    /* renamed from: c */
    public final ef3 f43086c = C6169a.m47232a(new EVM$privateKey$2(this));

    /* renamed from: d */
    public final ef3 f43087d = C6169a.m47232a(new EVM$credentials$2(this));

    /* renamed from: e */
    public final GasPrice f43088e = new GasPrice();

    /* renamed from: f */
    public final Gas f43089f = Gas.Standard;

    /* renamed from: g */
    public final BigInteger f43090g = BigInteger.valueOf(9000000);

    public EVM(TokenType tokenType, Wallet wallet2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(wallet2, "wallet");
        this.f43084a = tokenType;
        this.f43085b = wallet2;
    }

    /* renamed from: a */
    public String mo56291a(TokenType tokenType, Wallet wallet2) {
        return mo2.C7906a.m64364a(this, tokenType, wallet2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56292b(double r22, java.lang.String r24, java.lang.String r25, java.math.BigInteger r26, java.lang.Double r27, int r28, p000.ns0<? super java.lang.String> r29) throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r28
            r7 = r29
            boolean r8 = r7 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$signAndSendTransaction$1
            if (r8 == 0) goto L_0x0021
            r8 = r7
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$signAndSendTransaction$1 r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$signAndSendTransaction$1) r8
            int r9 = r8.label
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L_0x0021
            int r9 = r9 - r10
            r8.label = r9
            goto L_0x0026
        L_0x0021:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$signAndSendTransaction$1 r8 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$signAndSendTransaction$1
            r8.<init>(r0, r7)
        L_0x0026:
            java.lang.Object r7 = r8.result
            java.lang.Object r9 = p000.wx2.m54101d()
            int r10 = r8.label
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r10 == 0) goto L_0x0097
            if (r10 == r13) goto L_0x0072
            if (r10 == r12) goto L_0x005b
            if (r10 != r11) goto L_0x0053
            java.lang.Object r1 = r8.L$4
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.lang.Object r2 = r8.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r8.L$2
            net.safemoon.androidwallet.ERC20 r3 = (net.safemoon.androidwallet.ERC20) r3
            java.lang.Object r4 = r8.L$1
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r5 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r5
            p000.hg5.m45199b(r7)
            goto L_0x00d6
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            int r1 = r8.I$0
            java.lang.Object r2 = r8.L$3
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.lang.Object r3 = r8.L$2
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.Object r4 = r8.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r5
            p000.hg5.m45199b(r7)
            goto L_0x0183
        L_0x0072:
            double r1 = r8.D$1
            int r3 = r8.I$0
            double r4 = r8.D$0
            java.lang.Object r6 = r8.L$3
            java.lang.Double r6 = (java.lang.Double) r6
            java.lang.Object r10 = r8.L$2
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r15 = r8.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r15 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r15
            p000.hg5.m45199b(r7)
            r18 = r6
            r6 = r3
            r3 = r18
            r19 = r1
            r1 = r4
            r4 = r19
            goto L_0x013d
        L_0x0097:
            p000.hg5.m45199b(r7)
            if (r3 == 0) goto L_0x0115
            int r7 = r24.length()
            if (r7 != 0) goto L_0x00a4
            r7 = r13
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            if (r7 == 0) goto L_0x00a8
            goto L_0x0115
        L_0x00a8:
            java.math.BigInteger r7 = p000.ol0.m70329I(r26)
            p000.vx2.m53588d(r7)
            net.safemoon.androidwallet.ERC20 r3 = r0.mo61893d(r7, r3)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r22)
            r7.<init>(r1)
            java.math.BigInteger r1 = p000.ol0.m70362h0(r7, r6)
            r8.L$0 = r0
            r8.L$1 = r5
            r8.L$2 = r3
            r8.L$3 = r4
            r8.L$4 = r1
            r8.label = r11
            java.lang.Object r7 = r0.mo61895l(r8)
            if (r7 != r9) goto L_0x00d3
            return r9
        L_0x00d3:
            r2 = r4
            r4 = r5
            r5 = r0
        L_0x00d6:
            r6 = r7
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.math.BigInteger r7 = p000.mo2.C7906a.m64366c(r5, r14, r13, r14)
            java.math.BigInteger r4 = p000.ol0.m70329I(r4)
            r22 = r3
            r23 = r2
            r24 = r1
            r25 = r6
            r26 = r7
            r27 = r4
            h75 r1 = r22.mo56481s(r23, r24, r25, r26, r27)
            i75 r2 = new i75
            vj7 r3 = r5.mo61900q()
            cw0 r4 = r5.mo61894k()
            net.safemoon.androidwallet.common.TokenType r5 = r5.f43084a
            int r5 = r5.getChainId()
            long r5 = (long) r5
            r2.<init>(r3, r4, r5)
            ss1 r1 = r2.signAndSend(r1)
            ag5$a r2 = r1.getError()
            if (r2 != 0) goto L_0x01b8
            java.lang.String r14 = r1.getTransactionHash()
            goto L_0x01b8
        L_0x0115:
            p000.vx2.m53588d(r27)
            double r10 = r27.doubleValue()
            double r10 = r10 + r1
            r8.L$0 = r0
            r8.L$1 = r4
            r8.L$2 = r5
            r3 = r27
            r8.L$3 = r3
            r8.D$0 = r1
            r8.I$0 = r6
            r8.D$1 = r10
            r8.label = r13
            java.lang.Object r7 = p000.mo2.C7906a.m64365b(r0, r14, r8, r13, r14)
            if (r7 != r9) goto L_0x0136
            return r9
        L_0x0136:
            r15 = r0
            r18 = r10
            r11 = r4
            r10 = r5
            r4 = r18
        L_0x013d:
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            net.safemoon.androidwallet.common.TokenType r13 = r15.f43084a
            int r13 = r13.getDecimals()
            java.math.BigDecimal r7 = p000.ol0.m70376r(r7, r13)
            double r16 = r7.doubleValue()
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x0162
            java.math.BigDecimal r4 = new java.math.BigDecimal
            double r16 = r3.doubleValue()
            double r1 = r1 - r16
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.<init>(r1)
            r2 = r4
            goto L_0x016c
        L_0x0162:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            r2 = r3
        L_0x016c:
            r8.L$0 = r15
            r8.L$1 = r11
            r8.L$2 = r10
            r8.L$3 = r2
            r8.I$0 = r6
            r8.label = r12
            java.lang.Object r7 = r15.mo61895l(r8)
            if (r7 != r9) goto L_0x017f
            return r9
        L_0x017f:
            r1 = r6
            r3 = r10
            r4 = r11
            r5 = r15
        L_0x0183:
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            r6 = 1
            java.math.BigInteger r6 = p000.mo2.C7906a.m64366c(r5, r14, r6, r14)
            java.math.BigInteger r3 = p000.ol0.m70329I(r3)
            java.math.BigInteger r1 = p000.ol0.m70362h0(r2, r1)
            h75 r1 = p000.h75.createEtherTransaction(r7, r6, r3, r4, r1)
            i75 r2 = new i75
            vj7 r3 = r5.mo61900q()
            cw0 r4 = r5.mo61894k()
            net.safemoon.androidwallet.common.TokenType r5 = r5.f43084a
            int r5 = r5.getChainId()
            long r5 = (long) r5
            r2.<init>(r3, r4, r5)
            ss1 r1 = r2.signAndSend(r1)
            ag5$a r2 = r1.getError()
            if (r2 != 0) goto L_0x01b8
            java.lang.String r14 = r1.getTransactionHash()
        L_0x01b8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM.mo56292b(double, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.Double, int, ns0):java.lang.Object");
    }

    /* renamed from: c */
    public Object mo56293c(ns0<? super Double> ns0) {
        return this.f43088e.fetchGasSuspended(this.f43084a.getChainId(), this.f43089f, ns0);
    }

    /* renamed from: d */
    public final ERC20 mo61893d(BigInteger bigInteger, String str) {
        ERC20 r = ERC20.m64654r(str, mo61900q(), mo61894k(), new h96(mo2.C7906a.m64366c(this, (Double) null, 1, (Object) null), bigInteger));
        vx2.m53590f(r, "load(contractAddress, we…getGasPrice(), gasLimit))");
        return r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0180 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56294e(double r24, java.lang.String r26, java.lang.String r27, int r28, p000.ns0<? super java.math.BigInteger> r29) throws java.lang.Exception {
        /*
            r23 = this;
            r0 = r23
            r1 = r29
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$getEstimateGas$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$getEstimateGas$1 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$getEstimateGas$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$getEstimateGas$1 r2 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM$getEstimateGas$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = p000.wx2.m54101d()
            int r3 = r2.label
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            if (r3 == 0) goto L_0x00b1
            if (r3 == r13) goto L_0x0096
            if (r3 == r12) goto L_0x0079
            if (r3 == r11) goto L_0x005d
            if (r3 != r10) goto L_0x0055
            java.lang.Object r3 = r2.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$3
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r5 = r2.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$1
            net.safemoon.androidwallet.ERC20 r6 = (net.safemoon.androidwallet.ERC20) r6
            java.lang.Object r2 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r2
            p000.hg5.m45199b(r1)
            r18 = r6
            r6 = r3
            r3 = r18
            r19 = r5
            r5 = r4
            r4 = r19
            goto L_0x012c
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            int r3 = r2.I$0
            java.lang.Object r4 = r2.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$2
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r2
            p000.hg5.m45199b(r1)
            r18 = r6
            r6 = r5
            r5 = r18
            goto L_0x01d2
        L_0x0079:
            double r3 = r2.D$2
            double r5 = r2.D$1
            int r7 = r2.I$0
            double r11 = r2.D$0
            java.lang.Object r8 = r2.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r2.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r15 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r15 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r15
            p000.hg5.m45199b(r1)
            r13 = r11
            r11 = r5
            r6 = r8
            r5 = r10
            goto L_0x0191
        L_0x0096:
            int r3 = r2.I$0
            double r4 = r2.D$0
            java.lang.Object r6 = r2.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM) r11
            p000.hg5.m45199b(r1)
            r14 = r4
            r1 = r11
            r11 = r8
            goto L_0x00eb
        L_0x00b1:
            p000.hg5.m45199b(r1)
            net.safemoon.androidwallet.common.TokenType r1 = r0.f43084a
            net.safemoon.androidwallet.model.wallets.Wallet r3 = r0.f43085b
            java.lang.String r1 = r0.mo56291a(r1, r3)
            net.safemoon.androidwallet.model.common.GasPrice r3 = r0.f43088e
            net.safemoon.androidwallet.common.TokenType r4 = r0.f43084a
            int r4 = r4.getChainId()
            r5 = 0
            r7 = 2
            r8 = 0
            r2.L$0 = r0
            r11 = r26
            r2.L$1 = r11
            r15 = r27
            r2.L$2 = r15
            r2.L$3 = r1
            r14 = r24
            r2.D$0 = r14
            r6 = r28
            r2.I$0 = r6
            r2.label = r13
            r6 = r2
            java.lang.Object r3 = net.safemoon.androidwallet.model.common.GasPrice.fetchGasSuspended$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x00e5
            return r9
        L_0x00e5:
            r7 = r27
            r3 = r28
            r6 = r1
            r1 = r0
        L_0x00eb:
            if (r11 == 0) goto L_0x013c
            int r4 = r11.length()
            if (r4 != 0) goto L_0x00f5
            r4 = r13
            goto L_0x00f6
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            if (r4 == 0) goto L_0x00f9
            goto L_0x013c
        L_0x00f9:
            java.math.BigInteger r4 = r1.f43090g
            java.lang.String r5 = "GAS_LIMIT"
            p000.vx2.m53590f(r4, r5)
            net.safemoon.androidwallet.ERC20 r4 = r1.mo61893d(r4, r11)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.lang.String r8 = java.lang.String.valueOf(r14)
            r5.<init>(r8)
            java.math.BigInteger r3 = p000.ol0.m70362h0(r5, r3)
            r2.L$0 = r1
            r2.L$1 = r4
            r2.L$2 = r7
            r2.L$3 = r3
            r2.L$4 = r6
            r2.label = r10
            java.lang.Object r2 = r1.mo61895l(r2)
            if (r2 != r9) goto L_0x0124
            return r9
        L_0x0124:
            r5 = r3
            r3 = r4
            r4 = r7
            r18 = r2
            r2 = r1
            r1 = r18
        L_0x012c:
            r7 = r1
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            r1 = 0
            java.math.BigInteger r8 = p000.mo2.C7906a.m64366c(r2, r1, r13, r1)
            java.math.BigInteger r9 = r2.f43090g
            qt6 r1 = r3.mo56482t(r4, r5, r6, r7, r8, r9)
            goto L_0x01f0
        L_0x013c:
            r4 = 0
            java.math.BigInteger r5 = p000.mo2.C7906a.m64366c(r1, r4, r13, r4)
            r4 = 21000(0x5208, float:2.9427E-41)
            long r12 = (long) r4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r12)
            java.lang.String r12 = "valueOf(this.toLong())"
            p000.vx2.m53590f(r4, r12)
            java.math.BigInteger r4 = r5.multiply(r4)
            java.lang.String r5 = "getGasPrice().multiply(21000.toBigInteger())"
            p000.vx2.m53590f(r4, r5)
            net.safemoon.androidwallet.common.TokenType r5 = r1.f43084a
            int r5 = r5.getDecimals()
            java.math.BigDecimal r4 = p000.ol0.m70376r(r4, r5)
            double r4 = r4.doubleValue()
            double r12 = r14 + r4
            r2.L$0 = r1
            r2.L$1 = r7
            r2.L$2 = r6
            r8 = 0
            r2.L$3 = r8
            r2.D$0 = r14
            r2.I$0 = r3
            r2.D$1 = r4
            r2.D$2 = r12
            r8 = 2
            r2.label = r8
            java.lang.Object r8 = r1.mo56295f(r11, r2)
            if (r8 != r9) goto L_0x0181
            return r9
        L_0x0181:
            r18 = r14
            r15 = r1
            r1 = r8
            r20 = r7
            r7 = r3
            r21 = r4
            r5 = r20
            r3 = r12
            r13 = r18
            r11 = r21
        L_0x0191:
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            net.safemoon.androidwallet.common.TokenType r8 = r15.f43084a
            int r8 = r8.getDecimals()
            java.math.BigDecimal r1 = p000.ol0.m70376r(r1, r8)
            double r16 = r1.doubleValue()
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x01b0
            java.math.BigDecimal r1 = new java.math.BigDecimal
            double r13 = r13 - r11
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r1.<init>(r3)
            goto L_0x01b9
        L_0x01b0:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r1.<init>(r3)
        L_0x01b9:
            r2.L$0 = r15
            r2.L$1 = r5
            r2.L$2 = r1
            r2.L$3 = r6
            r2.I$0 = r7
            r3 = 3
            r2.label = r3
            java.lang.Object r2 = r15.mo61895l(r2)
            if (r2 != r9) goto L_0x01cd
            return r9
        L_0x01cd:
            r4 = r6
            r3 = r7
            r6 = r1
            r1 = r2
            r2 = r15
        L_0x01d2:
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            r7 = 1
            r8 = 0
            java.math.BigInteger r7 = p000.mo2.C7906a.m64366c(r2, r8, r7, r8)
            java.math.BigInteger r8 = r2.f43090g
            java.math.BigInteger r3 = p000.ol0.m70362h0(r6, r3)
            r24 = r4
            r25 = r1
            r26 = r7
            r27 = r8
            r28 = r5
            r29 = r3
            qt6 r1 = p000.qt6.createEtherTransaction(r24, r25, r26, r27, r28, r29)
        L_0x01f0:
            vj7 r2 = r2.mo61900q()
            zd5 r1 = r2.ethEstimateGas(r1)
            ag5 r1 = r1.send()
            zr1 r1 = (p000.zr1) r1
            java.math.BigInteger r1 = r1.getAmountUsed()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM.mo56294e(double, java.lang.String, java.lang.String, int, ns0):java.lang.Object");
    }

    /* renamed from: f */
    public Object mo56295f(String str, ns0<? super BigInteger> ns0) throws Exception {
        boolean z;
        String a = mo56291a(this.f43084a, this.f43085b);
        String n = mo61897n(this.f43084a, this.f43085b);
        vj7 a2 = uj7.m72805a(new hn2(ol0.m70384z(this.f43084a.getChainId())));
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                BigInteger send = ERC20.m64654r(str, a2, cw0.create(n), new i81()).mo56479p(a).send();
                vx2.m53590f(send, "load(contractAddress, we…balanceOf(address).send()");
                return send;
            }
        }
        BigInteger balance = a2.ethGetBalance(a, DefaultBlockParameterName.LATEST).send().getBalance();
        vx2.m53590f(balance, "web3Service.ethGetBalanc…me.LATEST).send().balance");
        return balance;
    }

    /* renamed from: g */
    public Double mo56296g() {
        return Double.valueOf(this.f43088e.getPrice(this.f43089f, this.f43084a.getChainId()));
    }

    /* renamed from: h */
    public BigInteger mo56297h(Double d) {
        if (d == null) {
            d = mo56296g();
        }
        BigInteger bigInteger = new BigDecimal(d.doubleValue()).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        vx2.m53590f(bigInteger, "BigDecimal(gasPriceInGWE…EN.pow(9)).toBigInteger()");
        return bigInteger;
    }

    /* renamed from: i */
    public void mo56298i(double d) {
        this.f43088e.applyNewGas(this.f43084a.getChainId(), d, this.f43089f);
    }

    /* renamed from: j */
    public <T> Object mo56299j(String str, ns0<? super T> ns0) throws Exception {
        ks1 send = mo61900q().ethGetTransactionReceipt(str).send();
        if (send == null) {
            return null;
        }
        return send;
    }

    /* renamed from: k */
    public final cw0 mo61894k() {
        return (cw0) this.f43087d.getValue();
    }

    /* renamed from: l */
    public final Object mo61895l(ns0<? super BigInteger> ns0) {
        try {
            return mo61900q().ethGetTransactionCount(mo56291a(this.f43084a, this.f43085b), DefaultBlockParameterName.PENDING).send().getTransactionCount();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final String mo61896m() {
        return (String) this.f43086c.getValue();
    }

    /* renamed from: n */
    public String mo61897n(TokenType tokenType, Wallet wallet2) {
        return mo2.C7906a.m64367d(this, tokenType, wallet2);
    }

    /* renamed from: o */
    public final TokenType mo61898o() {
        return this.f43084a;
    }

    /* renamed from: p */
    public final Wallet mo61899p() {
        return this.f43085b;
    }

    /* renamed from: q */
    public final vj7 mo61900q() {
        return uj7.m72805a(new hn2(ol0.m70384z(this.f43084a.getChainId())));
    }
}
