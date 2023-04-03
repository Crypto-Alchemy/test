package net.safemoon.androidwallet.viewmodels.blockChainClass;

import android.app.Application;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.Migration;
import net.safemoon.androidwallet.Safemoon;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;
import org.web3j.protocol.core.DefaultBlockParameterName;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020)¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\t0\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\n \u0003*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\n \u0003*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\n \u0003*\u0004\u0018\u00010\u00120\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0013\u0010\u0015\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001c\u001a\n \u0003*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001fH@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0016J\u0015\u0010\"\u001a\u0004\u0018\u00010!H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0016J\u0015\u0010$\u001a\u0004\u0018\u00010#H@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0016R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00102R\u001d\u00107\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001d\u00109\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b8\u00106R#\u0010=\u001a\n \u0003*\u0004\u0018\u00010:0:8BX\u0002¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010?R\u001c\u0010B\u001a\n \u0003*\u0004\u0018\u00010\t0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010AR%\u0010H\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010D0D0C8\u0006¢\u0006\f\n\u0004\b\"\u0010E\u001a\u0004\bF\u0010GR%\u0010K\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010I0I0C8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bJ\u0010GR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010M\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MigrationToV2;", "", "Lvj7;", "kotlin.jvm.PlatformType", "w", "", "r", "", "p", "Ljava/math/BigInteger;", "l", "gasLimit", "Lit0;", "m", "Lnet/safemoon/androidwallet/Migration;", "u", "Lnet/safemoon/androidwallet/Safemoon;", "v", "Lnet/safemoon/androidwallet/ERC20;", "h", "f", "n", "(Lns0;)Ljava/lang/Object;", "t", "s", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$a;", "amountIn", "Ljava/math/BigDecimal;", "i", "(Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$a;Lns0;)Ljava/lang/Object;", "q", "Lss1;", "e", "Lzr1;", "k", "Lau6;", "g", "Landroid/app/Application;", "a", "Landroid/app/Application;", "application", "Lnet/safemoon/androidwallet/model/swap/Swap;", "b", "Lnet/safemoon/androidwallet/model/swap/Swap;", "inToken", "c", "outToken", "d", "Z", "isValid", "Ljava/lang/String;", "ADDRESS_MIGRATION", "Lef3;", "o", "()Ljava/lang/String;", "privateKey", "getAddress", "address", "Lcw0;", "j", "()Lcw0;", "credentails", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "Ljava/math/BigInteger;", "GAS_LIMIT", "Lk04;", "Lnet/safemoon/androidwallet/model/common/Gas;", "Lk04;", "getGas", "()Lk04;", "gas", "", "getDeadTime", "deadTime", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$a;", "Lzr1;", "estimateGasPrice", "<init>", "(Landroid/app/Application;Lnet/safemoon/androidwallet/model/swap/Swap;Lnet/safemoon/androidwallet/model/swap/Swap;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MigrationToV2.kt */
public final class MigrationToV2 {

    /* renamed from: o */
    public static final C8878a f43025o = new C8878a((DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final String f43026p;

    /* renamed from: q */
    public static final String f43027q;

    /* renamed from: r */
    public static final String f43028r;

    /* renamed from: s */
    public static final String f43029s;

    /* renamed from: a */
    public final Application f43030a;

    /* renamed from: b */
    public final Swap f43031b;

    /* renamed from: c */
    public final Swap f43032c;

    /* renamed from: d */
    public boolean f43033d;

    /* renamed from: e */
    public final String f43034e;

    /* renamed from: f */
    public final ef3 f43035f;

    /* renamed from: g */
    public final ef3 f43036g;

    /* renamed from: h */
    public final ef3 f43037h;

    /* renamed from: i */
    public final GasPrice f43038i;

    /* renamed from: j */
    public final BigInteger f43039j;

    /* renamed from: k */
    public final k04<Gas> f43040k;

    /* renamed from: l */
    public final k04<Integer> f43041l;

    /* renamed from: m */
    public SwapMigrationViewModel.C8738a f43042m;

    /* renamed from: n */
    public zr1 f43043n;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MigrationToV2$a;", "", "", "SafeMoon", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SafeMoonV2", "b", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$a */
    /* compiled from: MigrationToV2.kt */
    public static final class C8878a {
        public C8878a() {
        }

        public /* synthetic */ C8878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo61833a() {
            return MigrationToV2.f43028r;
        }

        /* renamed from: b */
        public final String mo61834b() {
            return MigrationToV2.f43029s;
        }
    }

    static {
        String str;
        String str2;
        int i;
        Boolean bool = y40.f35761c;
        vx2.m53590f(bool, "IS_TEST_NET");
        if (bool.booleanValue()) {
            str = "0xDD6999Ec25948811d7c671051f5B4E44B175239e";
        } else {
            str = "0x8076c74c5e3f5852037f31ff0093eeb8c8add8d3";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f43026p = lowerCase;
        vx2.m53590f(bool, "IS_TEST_NET");
        if (bool.booleanValue()) {
            str2 = "0x409b3718F4090EBf7dAc8185a6e8336407d9d3a3";
        } else {
            str2 = "0x42981d0bfbAf196529376EE702F2a9Eb9092fcB5";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f43027q = lowerCase2;
        vx2.m53590f(bool, "IS_TEST_NET");
        int i2 = 97;
        if (bool.booleanValue()) {
            i = 97;
        } else {
            i = 56;
        }
        f43028r = "{ \"name\": \"SafeMoon\", \"symbolWithType\": \"BEP_SAFEMOON\", \"symbol\": \"SAFEMOON\", \"address\": \"" + lowerCase + "\", \"icon\": \"safemoon\", \"chainId\": " + i + ", \"decimals\": 9, \"allowSwap\": true, \"logoURI\":\"https://swap.safemoon.com/images/SAFEMOON.png\" }";
        vx2.m53590f(bool, "IS_TEST_NET");
        if (!bool.booleanValue()) {
            i2 = 56;
        }
        f43029s = "{ \"name\": \"SafeMoonV2\", \"symbolWithType\": \"BEP_SAFEMOON_V2\", \"symbol\": \"SFM\", \"address\": \"" + lowerCase2 + "\", \"icon\": \"safemoon\", \"chainId\": " + i2 + ", \"decimals\": 9, \"allowSwap\": true, \"logoURI\":\"https://swap.safemoon.com/images/SAFEMOON.png\" }";
    }

    public MigrationToV2(Application application, Swap swap, Swap swap2) {
        String str;
        vx2.m53591g(application, "application");
        vx2.m53591g(swap, "inToken");
        vx2.m53591g(swap2, "outToken");
        this.f43030a = application;
        this.f43031b = swap;
        this.f43032c = swap2;
        Boolean bool = y40.f35761c;
        vx2.m53590f(bool, "IS_TEST_NET");
        if (bool.booleanValue()) {
            str = "0x1f3E730542610ac6c16b00b9931535A2DD39844F";
        } else {
            str = "0x9d50518de14f89836f2b9b9ac05f177de7bf521a";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f43034e = lowerCase;
        this.f43035f = C6169a.m47232a(new MigrationToV2$privateKey$2(this));
        this.f43036g = C6169a.m47232a(new MigrationToV2$address$2(this));
        this.f43037h = C6169a.m47232a(new MigrationToV2$credentails$2(this));
        this.f43038i = new GasPrice();
        this.f43039j = BigInteger.valueOf(9000000);
        this.f43040k = new k04<>(Gas.Standard);
        this.f43041l = new k04<>(20);
        this.f43033d = mo61815f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61814e(p000.ns0<? super p000.ss1> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$approve$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$approve$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$approve$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$approve$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$approve$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r1 = r0.L$2
            zr1 r1 = (p000.zr1) r1
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2) r0
            p000.hg5.m45199b(r14)
            r7 = r2
            goto L_0x00bd
        L_0x003a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0042:
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2) r5
            p000.hg5.m45199b(r14)
            r6 = r2
            r2 = r4
            goto L_0x0088
        L_0x0054:
            p000.hg5.m45199b(r14)
            net.safemoon.androidwallet.ERC20 r14 = r13.mo61817h()
            java.lang.String r2 = r13.f43034e
            java.math.BigInteger r5 = java.math.BigInteger.ONE
            r6 = 256(0x100, float:3.59E-43)
            java.math.BigInteger r6 = r5.shiftLeft(r6)
            java.math.BigInteger r5 = r6.subtract(r5)
            java.lang.String r14 = r14.mo56480q(r2, r5)
            cw0 r2 = r13.mo61819j()
            java.lang.String r2 = r2.getAddress()
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r4 = r13.mo61823n(r0)
            if (r4 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r5 = r13
            r6 = r2
            r2 = r14
            r14 = r4
        L_0x0088:
            r7 = r14
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.math.BigInteger r8 = r5.mo61821l()
            java.math.BigInteger r9 = r5.f43039j
            net.safemoon.androidwallet.model.swap.Swap r14 = r5.f43031b
            java.lang.String r10 = r14.address
            java.math.BigInteger r11 = java.math.BigInteger.ZERO
            r12 = r2
            qt6 r14 = p000.qt6.createFunctionCallTransaction(r6, r7, r8, r9, r10, r11, r12)
            vj7 r4 = r5.mo61832w()
            zd5 r14 = r4.ethEstimateGas(r14)
            ag5 r14 = r14.send()
            zr1 r14 = (p000.zr1) r14
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r14
            r0.label = r3
            java.lang.Object r0 = r5.mo61823n(r0)
            if (r0 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r1 = r14
            r14 = r0
            r7 = r2
            r0 = r5
        L_0x00bd:
            r2 = r14
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r3 = r0.mo61821l()
            java.math.BigInteger r4 = r1.getAmountUsed()
            net.safemoon.androidwallet.ERC20 r14 = r0.mo61817h()
            java.lang.String r5 = r14.getContractAddress()
            java.math.BigInteger r6 = java.math.BigInteger.ZERO
            h75 r14 = p000.h75.createTransaction(r2, r3, r4, r5, r6, r7)
            i75 r1 = new i75
            vj7 r2 = r0.mo61832w()
            cw0 r0 = r0.mo61819j()
            r1.<init>(r2, r0)
            ss1 r14 = r1.signAndSend(r14)
            java.lang.String r0 = "transactionManager.signAndSend(approveTransaction)"
            p000.vx2.m53590f(r14, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2.mo61814e(ns0):java.lang.Object");
    }

    /* renamed from: f */
    public final boolean mo61815f() {
        String str = this.f43031b.address;
        vx2.m53590f(str, "inToken.address");
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str2 = this.f43031b.address;
        vx2.m53590f(str2, "inToken.address");
        String lowerCase2 = str2.toLowerCase(locale);
        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (vx2.m53586b(lowerCase, lowerCase2)) {
            String str3 = this.f43032c.address;
            vx2.m53590f(str3, "outToken.address");
            String lowerCase3 = str3.toLowerCase(locale);
            vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String str4 = this.f43032c.address;
            vx2.m53590f(str4, "outToken.address");
            String lowerCase4 = str4.toLowerCase(locale);
            vx2.m53590f(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (vx2.m53586b(lowerCase3, lowerCase4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final Object mo61816g(ns0<? super au6> ns0) {
        zr1 zr1;
        SwapMigrationViewModel.C8738a aVar = this.f43042m;
        if (aVar == null || (zr1 = this.f43043n) == null) {
            return null;
        }
        BigInteger amountUsed = zr1.getAmountUsed();
        vx2.m53590f(amountUsed, "it1.amountUsed");
        Migration u = mo61830u(amountUsed);
        BigDecimal a = aVar.mo61484a();
        Integer num = this.f43031b.decimals;
        vx2.m53590f(num, "inToken.decimals");
        return u.mo56488p(ol0.m70362h0(a, num.intValue())).send();
    }

    /* renamed from: h */
    public final ERC20 mo61817h() {
        String str = this.f43031b.address;
        vx2.m53590f(str, "inToken.address");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        vj7 w = mo61832w();
        cw0 j = mo61819j();
        BigInteger bigInteger = this.f43039j;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        return ERC20.m64654r(lowerCase, w, j, mo61822m(bigInteger));
    }

    /* renamed from: i */
    public final Object mo61818i(SwapMigrationViewModel.C8738a aVar, ns0<? super BigDecimal> ns0) {
        return aVar.mo61484a().divide(new BigDecimal(1000));
    }

    /* renamed from: j */
    public final cw0 mo61819j() {
        return (cw0) this.f43037h.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61820k(p000.ns0<? super p000.zr1> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$getEstimateGas$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$getEstimateGas$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$getEstimateGas$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$getEstimateGas$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2$getEstimateGas$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r7 = p000.wx2.m54101d()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 == r2) goto L_0x004d
            if (r1 != r8) goto L_0x0045
            java.lang.Object r1 = r0.L$5
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2) r1
            java.lang.Object r2 = r0.L$4
            vj7 r2 = (p000.vj7) r2
            java.lang.Object r3 = r0.L$3
            net.safemoon.androidwallet.Migration r3 = (net.safemoon.androidwallet.Migration) r3
            java.lang.Object r4 = r0.L$2
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2) r0
            p000.hg5.m45199b(r10)
            goto L_0x00c7
        L_0x0045:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x004d:
            java.lang.Object r1 = r0.L$1
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r1 = (net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel.C8738a) r1
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2) r2
            p000.hg5.m45199b(r10)
            r10 = r1
            r1 = r2
            goto L_0x0085
        L_0x005b:
            p000.hg5.m45199b(r10)
            net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r10 = r9.f43042m
            if (r10 == 0) goto L_0x00e1
            net.safemoon.androidwallet.model.common.GasPrice r1 = r9.f43038i
            net.safemoon.androidwallet.model.swap.Swap r3 = r9.f43031b
            java.lang.Integer r3 = r3.chainId
            java.lang.String r4 = "inToken.chainId"
            p000.vx2.m53590f(r3, r4)
            int r3 = r3.intValue()
            r4 = 0
            r5 = 2
            r6 = 0
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r2
            r2 = r3
            r3 = r4
            r4 = r0
            java.lang.Object r1 = net.safemoon.androidwallet.model.common.GasPrice.fetchGasSuspended$default(r1, r2, r3, r4, r5, r6)
            if (r1 != r7) goto L_0x0084
            return r7
        L_0x0084:
            r1 = r9
        L_0x0085:
            vj7 r2 = r1.mo61832w()
            java.math.BigInteger r3 = r1.f43039j
            java.lang.String r4 = "GAS_LIMIT"
            p000.vx2.m53590f(r3, r4)
            net.safemoon.androidwallet.Migration r3 = r1.mo61830u(r3)
            java.math.BigDecimal r10 = r10.mo61484a()
            net.safemoon.androidwallet.model.swap.Swap r4 = r1.f43031b
            java.lang.Integer r4 = r4.decimals
            java.lang.String r5 = "inToken.decimals"
            p000.vx2.m53590f(r4, r5)
            int r4 = r4.intValue()
            java.math.BigInteger r4 = p000.ol0.m70362h0(r10, r4)
            cw0 r10 = r1.mo61819j()
            java.lang.String r5 = r10.getAddress()
            r0.L$0 = r1
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r3
            r0.L$4 = r2
            r0.L$5 = r1
            r0.label = r8
            java.lang.Object r10 = r1.mo61823n(r0)
            if (r10 != r7) goto L_0x00c6
            return r7
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            r6 = r10
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.math.BigInteger r7 = r0.mo61821l()
            java.math.BigInteger r8 = r0.f43039j
            qt6 r10 = r3.mo56489q(r4, r5, r6, r7, r8)
            zd5 r10 = r2.ethEstimateGas(r10)
            ag5 r10 = r10.send()
            zr1 r10 = (p000.zr1) r10
            r1.f43043n = r10
            goto L_0x00e2
        L_0x00e1:
            r0 = r9
        L_0x00e2:
            zr1 r10 = r0.f43043n
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2.mo61820k(ns0):java.lang.Object");
    }

    /* renamed from: l */
    public final BigInteger mo61821l() {
        if (mo61827r()) {
            GasPrice gasPrice = this.f43038i;
            Gas value = this.f43040k.getValue();
            vx2.m53588d(value);
            Integer num = this.f43031b.chainId;
            vx2.m53590f(num, "inToken.chainId");
            return new BigDecimal(gasPrice.getPrice(value, num.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        }
        GasPrice gasPrice2 = this.f43038i;
        Gas value2 = this.f43040k.getValue();
        vx2.m53588d(value2);
        Integer num2 = this.f43031b.chainId;
        vx2.m53590f(num2, "inToken.chainId");
        return new BigDecimal(gasPrice2.getPrice(value2, num2.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
    }

    /* renamed from: m */
    public final it0 mo61822m(BigInteger bigInteger) {
        return new h96(mo61821l(), bigInteger);
    }

    /* renamed from: n */
    public final Object mo61823n(ns0<? super BigInteger> ns0) {
        BigInteger transactionCount = mo61832w().ethGetTransactionCount(mo61819j().getAddress(), DefaultBlockParameterName.PENDING).send().getTransactionCount();
        vx2.m53590f(transactionCount, "ethGetTransactionCount.transactionCount");
        return transactionCount;
    }

    /* renamed from: o */
    public final String mo61824o() {
        return (String) this.f43035f.getValue();
    }

    /* renamed from: p */
    public final String mo61825p() {
        Integer num = this.f43031b.chainId;
        vx2.m53590f(num, "inToken.chainId");
        return ol0.m70384z(num.intValue());
    }

    /* renamed from: q */
    public final Object mo61826q(SwapMigrationViewModel.C8738a aVar, ns0<? super Boolean> ns0) {
        boolean z;
        this.f43042m = aVar;
        BigDecimal a = aVar.mo61484a();
        Integer num = this.f43031b.decimals;
        vx2.m53590f(num, "inToken.decimals");
        if (mo61817h().mo56477n(mo61819j().getAddress(), this.f43034e).send().compareTo(ol0.m70362h0(a, num.intValue())) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return a40.m31670a(z);
    }

    /* renamed from: r */
    public final boolean mo61827r() {
        Integer num = this.f43031b.chainId;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (num != null && num.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final Object mo61828s(ns0<? super Boolean> ns0) {
        BigInteger bigInteger = this.f43039j;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        return mo61830u(bigInteger).mo56487n().send();
    }

    /* renamed from: t */
    public final Object mo61829t(ns0<? super Boolean> ns0) {
        BigInteger bigInteger = this.f43039j;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        return mo61831v(bigInteger).mo56495n().send();
    }

    /* renamed from: u */
    public final Migration mo61830u(BigInteger bigInteger) {
        return Migration.m64665o(this.f43034e, mo61832w(), mo61819j(), mo61822m(bigInteger));
    }

    /* renamed from: v */
    public final Safemoon mo61831v(BigInteger bigInteger) {
        String str = this.f43032c.address;
        vx2.m53590f(str, "outToken.address");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Safemoon.m64674o(lowerCase, mo61832w(), mo61819j(), mo61822m(bigInteger));
    }

    /* renamed from: w */
    public final vj7 mo61832w() {
        return uj7.m72805a(new hn2(mo61825p()));
    }
}
