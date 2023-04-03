package net.safemoon.androidwallet.viewmodels.blockChainClass;

import android.app.Application;
import java.math.BigInteger;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b/\u00100J\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R#\u0010\u001f\u001a\n \u0003*\u0004\u0018\u00010\u001c0\u001c8FX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0004X\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0004X\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\"\u0010.\u001a\n \u0003*\u0004\u0018\u00010\t0\t8\u0004X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MyWeb3;", "", "Lvj7;", "kotlin.jvm.PlatformType", "g", "Lnet/safemoon/androidwallet/common/TokenType;", "f", "", "e", "Ljava/math/BigInteger;", "b", "(Lns0;)Ljava/lang/Object;", "Landroid/app/Application;", "a", "Landroid/app/Application;", "()Landroid/app/Application;", "application", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "c", "()Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iToken", "Lef3;", "d", "()Ljava/lang/String;", "privateKey", "getAddress", "address", "Lcw0;", "getCredentials", "()Lcw0;", "credentials", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "getGasPrice", "()Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "Lnet/safemoon/androidwallet/model/common/Gas;", "Lnet/safemoon/androidwallet/model/common/Gas;", "getGas", "()Lnet/safemoon/androidwallet/model/common/Gas;", "gas", "h", "Ljava/math/BigInteger;", "getGAS_LIMIT", "()Ljava/math/BigInteger;", "GAS_LIMIT", "<init>", "(Landroid/app/Application;Lnet/safemoon/androidwallet/model/token/abstraction/IToken;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyWeb3.kt */
public class MyWeb3 {

    /* renamed from: a */
    public final Application f43044a;

    /* renamed from: b */
    public final IToken f43045b;

    /* renamed from: c */
    public final ef3 f43046c = C6169a.m47232a(new MyWeb3$privateKey$2(this));

    /* renamed from: d */
    public final ef3 f43047d = C6169a.m47232a(new MyWeb3$address$2(this));

    /* renamed from: e */
    public final ef3 f43048e = C6169a.m47232a(new MyWeb3$credentials$2(this));

    /* renamed from: f */
    public final GasPrice f43049f = new GasPrice();

    /* renamed from: g */
    public final Gas f43050g = Gas.Standard;

    /* renamed from: h */
    public final BigInteger f43051h = BigInteger.valueOf(9000000);

    public MyWeb3(Application application, IToken iToken) {
        vx2.m53591g(application, "application");
        vx2.m53591g(iToken, "iToken");
        this.f43044a = application;
        this.f43045b = iToken;
    }

    /* renamed from: a */
    public Application mo61800a() {
        return this.f43044a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61835b(p000.ns0<? super java.math.BigInteger> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3$getBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3$getBalance$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3$getBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3$getBalance$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3$getBalance$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r7)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0056
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            p000.hg5.m45199b(r7)
            a14 r7 = p000.a14.f36348a     // Catch:{ Exception -> 0x0059 }
            net.safemoon.androidwallet.common.TokenType r2 = r6.mo61838f()     // Catch:{ Exception -> 0x0059 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r4 = r6.mo61801c()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = r4.getContractAddress()     // Catch:{ Exception -> 0x0059 }
            android.app.Application r5 = r6.mo61800a()     // Catch:{ Exception -> 0x0059 }
            net.safemoon.androidwallet.model.wallets.Wallet r5 = p000.ol0.m70351c(r5)     // Catch:{ Exception -> 0x0059 }
            p000.vx2.m53588d(r5)     // Catch:{ Exception -> 0x0059 }
            r0.label = r3     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r7 = r7.mo50041a(r2, r4, r5, r0)     // Catch:{ Exception -> 0x0059 }
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            java.math.BigInteger r7 = (java.math.BigInteger) r7     // Catch:{ Exception -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3.mo61835b(ns0):java.lang.Object");
    }

    /* renamed from: c */
    public IToken mo61801c() {
        return this.f43045b;
    }

    /* renamed from: d */
    public final String mo61836d() {
        return (String) this.f43046c.getValue();
    }

    /* renamed from: e */
    public final String mo61837e() {
        return ol0.m70384z(mo61801c().getChainId());
    }

    /* renamed from: f */
    public final TokenType mo61838f() {
        return TokenType.Companion.mo57099b(mo61801c().getChainId());
    }

    /* renamed from: g */
    public final vj7 mo61839g() {
        return uj7.m72805a(new hn2(mo61837e()));
    }
}
