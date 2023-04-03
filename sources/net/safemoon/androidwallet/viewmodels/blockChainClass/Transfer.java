package net.safemoon.androidwallet.viewmodels.blockChainClass;

import android.app.Application;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.gson.GsonToken;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Dogecoin;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana;
import p000.mo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020!\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\n¢\u0006\u0004\bA\u0010BJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00060\u0006J\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0015\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\nJ\u0019\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010\u00028FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b&\u0010)R\u001b\u0010>\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b5\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010?\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/Transfer;", "", "", "n", "", "s", "Ljava/math/BigInteger;", "g", "(Lns0;)Ljava/lang/Object;", "h", "", "i", "()Ljava/lang/Double;", "kotlin.jvm.PlatformType", "r", "t", "hash", "Lks1;", "o", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "l", "b", "newGasPriceInGWEI", "Lr37;", "a", "_gasPriceInGWEI", "j", "(Ljava/lang/Double;)Ljava/math/BigInteger;", "Landroid/app/Application;", "Landroid/app/Application;", "e", "()Landroid/app/Application;", "application", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "getIToken", "()Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iToken", "c", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "receiver", "d", "D", "()D", "amount", "Lnet/safemoon/androidwallet/common/TokenType;", "Lnet/safemoon/androidwallet/common/TokenType;", "q", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lmo2;", "f", "Lmo2;", "m", "()Lmo2;", "iMultiNetwork", "Lef3;", "address", "Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "()Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "chainGasToken", "Ljava/math/BigInteger;", "estimateGas", "<init>", "(Landroid/app/Application;Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Ljava/lang/String;D)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Transfer.kt */
public final class Transfer {

    /* renamed from: a */
    public final Application f43062a;

    /* renamed from: b */
    public final IToken f43063b;

    /* renamed from: c */
    public final String f43064c;

    /* renamed from: d */
    public final double f43065d;

    /* renamed from: e */
    public final TokenType f43066e;

    /* renamed from: f */
    public final mo2 f43067f;

    /* renamed from: g */
    public final ef3 f43068g;

    /* renamed from: h */
    public final ef3 f43069h;

    /* renamed from: i */
    public BigInteger f43070i;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$a */
    /* compiled from: Transfer.kt */
    public /* synthetic */ class C8879a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43071a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f43071a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer.C8879a.<clinit>():void");
        }
    }

    public Transfer(Application application, IToken iToken, String str, double d) {
        mo2 mo2;
        vx2.m53591g(application, "application");
        vx2.m53591g(iToken, "iToken");
        vx2.m53591g(str, "receiver");
        this.f43062a = application;
        this.f43063b = iToken;
        this.f43064c = str;
        this.f43065d = d;
        TokenType b = TokenType.Companion.mo57099b(iToken.getChainId());
        this.f43066e = b;
        int i = C8879a.f43071a[b.ordinal()];
        if (i == 1) {
            Wallet c = ol0.m70351c(application);
            vx2.m53588d(c);
            mo2 = new Solana(b, c);
        } else if (i == 2) {
            Wallet c2 = ol0.m70351c(application);
            vx2.m53588d(c2);
            mo2 = new Bitcoin(b, c2);
        } else if (i != 3) {
            Wallet c3 = ol0.m70351c(application);
            vx2.m53588d(c3);
            mo2 = new EVM(b, c3);
        } else {
            Wallet c4 = ol0.m70351c(application);
            vx2.m53588d(c4);
            mo2 = new Dogecoin(b, c4);
        }
        this.f43067f = mo2;
        this.f43068g = C6169a.m47232a(new Transfer$address$2(this));
        this.f43069h = C6169a.m47232a(Transfer$chainGasToken$2.INSTANCE);
    }

    /* renamed from: k */
    public static /* synthetic */ BigInteger m69210k(Transfer transfer, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        return transfer.mo61863j(d);
    }

    /* renamed from: a */
    public final void mo61854a(double d) {
        this.f43067f.mo56298i(d);
    }

    /* renamed from: b */
    public final Object mo61855b(ns0<? super Double> ns0) {
        return this.f43067f.mo56293c(ns0);
    }

    /* renamed from: c */
    public final String mo61856c() {
        return (String) this.f43068g.getValue();
    }

    /* renamed from: d */
    public final double mo61857d() {
        return this.f43065d;
    }

    /* renamed from: e */
    public final Application mo61858e() {
        return this.f43062a;
    }

    /* renamed from: f */
    public final GsonToken mo61859f() {
        return (GsonToken) this.f43069h.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61860g(p000.ns0<? super java.math.BigInteger> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getEstimateGas$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getEstimateGas$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getEstimateGas$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getEstimateGas$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getEstimateGas$1
            r0.<init>(r9, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r7.label
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r0 = r7.L$1
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer) r0
            java.lang.Object r1 = r7.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer) r1
            p000.hg5.m45199b(r10)     // Catch:{ Exception -> 0x0073 }
            goto L_0x006d
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003b:
            p000.hg5.m45199b(r10)
            mo2 r1 = r9.f43067f     // Catch:{ Exception -> 0x0073 }
            double r3 = r9.f43065d     // Catch:{ Exception -> 0x0073 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r10 = r9.f43063b     // Catch:{ Exception -> 0x0073 }
            java.lang.String r10 = r10.getContractAddress()     // Catch:{ Exception -> 0x0073 }
            int r5 = r10.length()     // Catch:{ Exception -> 0x0073 }
            if (r5 != 0) goto L_0x0050
            r5 = r2
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0054
            r10 = r8
        L_0x0054:
            java.lang.String r5 = r9.f43064c     // Catch:{ Exception -> 0x0073 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r6 = r9.f43063b     // Catch:{ Exception -> 0x0073 }
            int r6 = r6.getDecimals()     // Catch:{ Exception -> 0x0073 }
            r7.L$0 = r9     // Catch:{ Exception -> 0x0073 }
            r7.L$1 = r9     // Catch:{ Exception -> 0x0073 }
            r7.label = r2     // Catch:{ Exception -> 0x0073 }
            r2 = r3
            r4 = r10
            java.lang.Object r10 = r1.mo56294e(r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0073 }
            if (r10 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r9
            r1 = r0
        L_0x006d:
            java.math.BigInteger r10 = (java.math.BigInteger) r10     // Catch:{ Exception -> 0x0073 }
            r0.f43070i = r10     // Catch:{ Exception -> 0x0073 }
            java.math.BigInteger r8 = r1.f43070i     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer.mo61860g(ns0):java.lang.Object");
    }

    /* renamed from: h */
    public final BigInteger mo61861h() {
        BigInteger bigInteger = this.f43070i;
        if (bigInteger != null) {
            return ol0.m70329I(bigInteger);
        }
        return null;
    }

    /* renamed from: i */
    public final Double mo61862i() {
        BigInteger I;
        BigInteger multiply;
        BigDecimal r;
        BigInteger bigInteger = this.f43070i;
        if (bigInteger == null || (I = ol0.m70329I(bigInteger)) == null || (multiply = I.multiply(mo2.C7906a.m64366c(this.f43067f, (Double) null, 1, (Object) null))) == null || (r = ol0.m70376r(multiply, mo61859f().getDecimals())) == null) {
            return null;
        }
        return Double.valueOf(r.doubleValue());
    }

    /* renamed from: j */
    public final BigInteger mo61863j(Double d) {
        return this.f43067f.mo56297h(d);
    }

    /* renamed from: l */
    public final Double mo61864l() {
        return this.f43067f.mo56296g();
    }

    /* renamed from: m */
    public final mo2 mo61865m() {
        return this.f43067f;
    }

    /* renamed from: n */
    public final String mo61866n() {
        return this.f43066e.getNativeToken();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61867o(java.lang.String r5, p000.ns0<? super p000.ks1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getReceipt$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getReceipt$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getReceipt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getReceipt$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$getReceipt$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r6)     // Catch:{ Exception -> 0x0042 }
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p000.hg5.m45199b(r6)
            mo2 r6 = r4.f43067f     // Catch:{ Exception -> 0x0042 }
            r0.label = r3     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r6 = r6.mo56299j(r5, r0)     // Catch:{ Exception -> 0x0042 }
            if (r6 != r1) goto L_0x003f
            return r1
        L_0x003f:
            ks1 r6 = (p000.ks1) r6     // Catch:{ Exception -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer.mo61867o(java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: p */
    public final String mo61868p() {
        return this.f43064c;
    }

    /* renamed from: q */
    public final TokenType mo61869q() {
        return this.f43066e;
    }

    /* renamed from: r */
    public final BigInteger mo61870r() {
        return ol0.m70362h0(new BigDecimal(String.valueOf(this.f43065d)), this.f43063b.getDecimals());
    }

    /* renamed from: s */
    public final boolean mo61871s() {
        if (this.f43063b.getContractAddress().length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61872t(p000.ns0<? super java.lang.String> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$transfer$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$transfer$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$transfer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$transfer$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer$transfer$1
            r0.<init>(r11, r12)
        L_0x0018:
            r9 = r0
            java.lang.Object r12 = r9.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r10 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0065
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0033:
            p000.hg5.m45199b(r12)
            mo2 r1 = r11.f43067f     // Catch:{ Exception -> 0x0068 }
            double r3 = r11.f43065d     // Catch:{ Exception -> 0x0068 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r12 = r11.f43063b     // Catch:{ Exception -> 0x0068 }
            java.lang.String r12 = r12.getContractAddress()     // Catch:{ Exception -> 0x0068 }
            int r5 = r12.length()     // Catch:{ Exception -> 0x0068 }
            if (r5 != 0) goto L_0x0048
            r5 = r2
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            r12 = r10
        L_0x004c:
            java.lang.String r5 = r11.f43064c     // Catch:{ Exception -> 0x0068 }
            java.math.BigInteger r6 = r11.f43070i     // Catch:{ Exception -> 0x0068 }
            java.lang.Double r7 = r11.mo61862i()     // Catch:{ Exception -> 0x0068 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r8 = r11.f43063b     // Catch:{ Exception -> 0x0068 }
            int r8 = r8.getDecimals()     // Catch:{ Exception -> 0x0068 }
            r9.label = r2     // Catch:{ Exception -> 0x0068 }
            r2 = r3
            r4 = r12
            java.lang.Object r12 = r1.mo56292b(r2, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0068 }
            if (r12 != r0) goto L_0x0065
            return r0
        L_0x0065:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0068 }
            r10 = r12
        L_0x0068:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer.mo61872t(ns0):java.lang.Object");
    }
}
