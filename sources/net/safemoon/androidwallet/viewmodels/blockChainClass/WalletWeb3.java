package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.wallets.Wallet;
import org.web3j.protocol.core.DefaultBlockParameterName;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020\u001c\u0012\u0006\u0010)\u001a\u00020%¢\u0006\u0004\bI\u0010JJ\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0013\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0013\u0010\u001a\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\tJ#\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R%\u0010/\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010+0+0*8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001f\u00109\u001a\n \u0003*\u0004\u0018\u00010\u00070\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010CR#\u0010H\u001a\n \u0003*\u0004\u0018\u00010E0E8FX\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bF\u0010G\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/WalletWeb3;", "", "Lvj7;", "kotlin.jvm.PlatformType", "w", "", "r", "Ljava/math/BigInteger;", "e", "(Lns0;)Ljava/lang/Object;", "getGasPrice", "", "m", "c", "gasPriceInGWEI", "Lr37;", "b", "gasLimit", "Lit0;", "n", "Lorg/web3j/protocol/core/DefaultBlockParameterName;", "defaultBlockParameterName", "o", "Li75;", "v", "Ljava/math/BigDecimal;", "t", "contractAddress", "", "decimal", "f", "(Ljava/lang/String;ILns0;)Ljava/lang/Object;", "a", "I", "g", "()I", "chainId", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "s", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lk04;", "Lnet/safemoon/androidwallet/model/common/Gas;", "Lk04;", "getGas", "()Lk04;", "gas", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "d", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "l", "()Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "Ljava/math/BigInteger;", "j", "()Ljava/math/BigInteger;", "GAS_LIMIT", "Lzr1;", "Lzr1;", "i", "()Lzr1;", "u", "(Lzr1;)V", "ethEstimateGas", "Lef3;", "q", "()Ljava/lang/String;", "privateKey", "Lcw0;", "h", "()Lcw0;", "credentails", "<init>", "(ILnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletWeb3.kt */
public class WalletWeb3 {

    /* renamed from: a */
    public final int f43072a;

    /* renamed from: b */
    public final Wallet f43073b;

    /* renamed from: c */
    public final k04<Gas> f43074c = new k04<>(Gas.Standard);

    /* renamed from: d */
    public final GasPrice f43075d = new GasPrice();

    /* renamed from: e */
    public final BigInteger f43076e = BigInteger.valueOf(9000000);

    /* renamed from: f */
    public zr1 f43077f;

    /* renamed from: g */
    public final ef3 f43078g = C6169a.m47232a(new WalletWeb3$privateKey$2(this));

    /* renamed from: h */
    public final ef3 f43079h = C6169a.m47232a(new WalletWeb3$credentails$2(this));

    public WalletWeb3(int i, Wallet wallet2) {
        vx2.m53591g(wallet2, "wallet");
        this.f43072a = i;
        this.f43073b = wallet2;
    }

    /* renamed from: p */
    public static /* synthetic */ BigInteger m69231p(WalletWeb3 walletWeb3, DefaultBlockParameterName defaultBlockParameterName, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                defaultBlockParameterName = DefaultBlockParameterName.PENDING;
            }
            return walletWeb3.mo61884o(defaultBlockParameterName);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNonce");
    }

    /* renamed from: b */
    public final void mo61873b(double d) {
        GasPrice gasPrice = this.f43075d;
        int g = mo61841g();
        Gas value = this.f43074c.getValue();
        vx2.m53588d(value);
        gasPrice.applyNewGas(g, d, value);
    }

    /* renamed from: c */
    public final Object mo61874c(ns0<? super Double> ns0) {
        return this.f43075d.fetchGasSuspended(mo61841g(), this.f43074c.getValue(), ns0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61875e(p000.ns0<? super java.math.BigInteger> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$fetchGasSuspended$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$fetchGasSuspended$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$fetchGasSuspended$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$fetchGasSuspended$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$fetchGasSuspended$1
            r0.<init>(r7, r8)
        L_0x0018:
            r4 = r0
            java.lang.Object r8 = r4.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r0 = r4.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3) r0
            p000.hg5.m45199b(r8)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            p000.hg5.m45199b(r8)
            net.safemoon.androidwallet.model.common.GasPrice r1 = r7.f43075d
            int r8 = r7.mo61841g()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r7
            r4.label = r2
            r2 = r8
            java.lang.Object r8 = net.safemoon.androidwallet.model.common.GasPrice.fetchGasSuspended$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r0 = r7
        L_0x004f:
            java.math.BigInteger r8 = r0.getGasPrice()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3.mo61875e(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61876f(java.lang.String r6, int r7, p000.ns0<? super java.math.BigDecimal> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$getBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$getBalance$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$getBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$getBalance$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$getBalance$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            int r7 = r0.I$0
            p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x005d }
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p000.hg5.m45199b(r8)
            net.safemoon.androidwallet.common.TokenType$a r8 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x005d }
            int r2 = r5.mo61841g()     // Catch:{ Exception -> 0x005d }
            net.safemoon.androidwallet.common.TokenType r8 = r8.mo57099b(r2)     // Catch:{ Exception -> 0x005d }
            a14 r2 = p000.a14.f36348a     // Catch:{ Exception -> 0x005d }
            net.safemoon.androidwallet.model.wallets.Wallet r4 = r5.mo61844s()     // Catch:{ Exception -> 0x005d }
            r0.I$0 = r7     // Catch:{ Exception -> 0x005d }
            r0.label = r3     // Catch:{ Exception -> 0x005d }
            java.lang.Object r8 = r2.mo50041a(r8, r6, r4, r0)     // Catch:{ Exception -> 0x005d }
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.math.BigInteger r8 = (java.math.BigInteger) r8     // Catch:{ Exception -> 0x005d }
            java.math.BigDecimal r6 = p000.ol0.m70376r(r8, r7)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = "{\n//            if (cont…romWEI(decimal)\n        }"
            p000.vx2.m53590f(r6, r7)     // Catch:{ Exception -> 0x005d }
            goto L_0x0064
        L_0x005d:
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            java.lang.String r7 = "{\n            BigDecimal.ZERO\n        }"
            p000.vx2.m53590f(r6, r7)
        L_0x0064:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3.mo61876f(java.lang.String, int, ns0):java.lang.Object");
    }

    /* renamed from: g */
    public int mo61841g() {
        return this.f43072a;
    }

    public final BigInteger getGasPrice() {
        GasPrice gasPrice = this.f43075d;
        Gas value = this.f43074c.getValue();
        vx2.m53588d(value);
        BigInteger bigInteger = new BigDecimal(gasPrice.getPrice(value, mo61841g())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        vx2.m53590f(bigInteger, "BigDecimal(gasPrice.getP…EN.pow(9)).toBigInteger()");
        return bigInteger;
    }

    /* renamed from: h */
    public final cw0 mo61878h() {
        return (cw0) this.f43079h.getValue();
    }

    /* renamed from: i */
    public final zr1 mo61879i() {
        return this.f43077f;
    }

    /* renamed from: j */
    public final BigInteger mo61880j() {
        return this.f43076e;
    }

    /* renamed from: l */
    public final GasPrice mo61881l() {
        return this.f43075d;
    }

    /* renamed from: m */
    public final double mo61882m() {
        GasPrice gasPrice = this.f43075d;
        Gas value = this.f43074c.getValue();
        vx2.m53588d(value);
        return gasPrice.getPrice(value, mo61841g());
    }

    /* renamed from: n */
    public final it0 mo61883n(BigInteger bigInteger) {
        vx2.m53591g(bigInteger, "gasLimit");
        return new h96(getGasPrice(), bigInteger);
    }

    /* renamed from: o */
    public final BigInteger mo61884o(DefaultBlockParameterName defaultBlockParameterName) {
        vx2.m53591g(defaultBlockParameterName, "defaultBlockParameterName");
        BigInteger transactionCount = mo61890w().ethGetTransactionCount(mo61878h().getAddress(), defaultBlockParameterName).send().getTransactionCount();
        vx2.m53590f(transactionCount, "ethGetTransactionCount.transactionCount");
        return transactionCount;
    }

    /* renamed from: q */
    public final String mo61885q() {
        return (String) this.f43078g.getValue();
    }

    /* renamed from: r */
    public final String mo61886r() {
        return ol0.m70384z(mo61841g());
    }

    /* renamed from: s */
    public Wallet mo61844s() {
        return this.f43073b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61887t(p000.ns0<? super java.math.BigDecimal> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$nativeBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$nativeBalance$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$nativeBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$nativeBalance$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3$nativeBalance$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.common.TokenType r0 = (net.safemoon.androidwallet.common.TokenType) r0
            p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            p000.hg5.m45199b(r8)
            net.safemoon.androidwallet.common.TokenType$a r8 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0067 }
            int r2 = r7.mo61841g()     // Catch:{ Exception -> 0x0067 }
            net.safemoon.androidwallet.common.TokenType r8 = r8.mo57099b(r2)     // Catch:{ Exception -> 0x0067 }
            a14 r2 = p000.a14.f36348a     // Catch:{ Exception -> 0x0067 }
            r4 = 0
            net.safemoon.androidwallet.model.wallets.Wallet r5 = r7.mo61844s()     // Catch:{ Exception -> 0x0067 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0067 }
            r0.label = r3     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r0 = r2.mo50041a(r8, r4, r5, r0)     // Catch:{ Exception -> 0x0067 }
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0057:
            java.math.BigInteger r8 = (java.math.BigInteger) r8     // Catch:{ Exception -> 0x0067 }
            int r0 = r0.getDecimals()     // Catch:{ Exception -> 0x0067 }
            java.math.BigDecimal r8 = p000.ol0.m70376r(r8, r0)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r0 = "{\n            val tokenT…nce.fromWEI(18)\n        }"
            p000.vx2.m53590f(r8, r0)     // Catch:{ Exception -> 0x0067 }
            goto L_0x006e
        L_0x0067:
            java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
            java.lang.String r0 = "{\n            BigDecimal.ZERO\n        }"
            p000.vx2.m53590f(r8, r0)
        L_0x006e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3.mo61887t(ns0):java.lang.Object");
    }

    /* renamed from: u */
    public final void mo61888u(zr1 zr1) {
        this.f43077f = zr1;
    }

    /* renamed from: v */
    public final i75 mo61889v() {
        return new i75(mo61890w(), mo61878h(), (long) mo61841g());
    }

    /* renamed from: w */
    public final vj7 mo61890w() {
        return uj7.m72805a(new hn2(mo61886r()));
    }
}
