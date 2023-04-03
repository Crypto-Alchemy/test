package net.safemoon.androidwallet.model.common;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J)\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/GasPrice;", "", "Lnet/safemoon/androidwallet/model/common/Gas;", "gas", "", "chainId", "", "getPrice", "fetchGasSuspended", "(ILnet/safemoon/androidwallet/model/common/Gas;Lns0;)Ljava/lang/Object;", "gasPriceInGWEI", "Lr37;", "applyNewGas", "<init>", "()V", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Gas.kt */
public final class GasPrice {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Double average;
    /* access modifiers changed from: private */
    public static Double fast;
    /* access modifiers changed from: private */
    public static Double fastest;

    @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/GasPrice$Companion;", "", "()V", "average", "", "getAverage", "()Ljava/lang/Double;", "setAverage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "fast", "getFast", "setFast", "fastest", "getFastest", "setFastest", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Gas.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Double getAverage() {
            return GasPrice.average;
        }

        public final Double getFast() {
            return GasPrice.fast;
        }

        public final Double getFastest() {
            return GasPrice.fastest;
        }

        public final void setAverage(Double d) {
            GasPrice.average = d;
        }

        public final void setFast(Double d) {
            GasPrice.fast = d;
        }

        public final void setFastest(Double d) {
            GasPrice.fastest = d;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Gas.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.model.common.Gas[] r0 = net.safemoon.androidwallet.model.common.Gas.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Standard     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Fast     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Lightning     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.common.GasPrice.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ Object fetchGasSuspended$default(GasPrice gasPrice, int i, Gas gas, ns0 ns0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gas = null;
        }
        return gasPrice.fetchGasSuspended(i, gas, ns0);
    }

    public final void applyNewGas(int i, double d, Gas gas) {
        vx2.m53591g(gas, "gas");
        boolean z = true;
        if (!(i == 1 || i == 137 || i == TokenType.AVALANCHE_C.getChainId())) {
            z = false;
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[gas.ordinal()];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: net.safemoon.androidwallet.model.common.Gas} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: net.safemoon.androidwallet.model.common.Gas} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[Catch:{ Exception -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155 A[Catch:{ Exception -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchGasSuspended(int r7, net.safemoon.androidwallet.model.common.Gas r8, p000.ns0<? super java.lang.Double> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.model.common.GasPrice$fetchGasSuspended$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.model.common.GasPrice$fetchGasSuspended$1 r0 = (net.safemoon.androidwallet.model.common.GasPrice$fetchGasSuspended$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.model.common.GasPrice$fetchGasSuspended$1 r0 = new net.safemoon.androidwallet.model.common.GasPrice$fetchGasSuspended$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            r8 = r7
            net.safemoon.androidwallet.model.common.Gas r8 = (net.safemoon.androidwallet.model.common.Gas) r8
            p000.hg5.m45199b(r9)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x0145
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.L$0
            r8 = r7
            net.safemoon.androidwallet.model.common.Gas r8 = (net.safemoon.androidwallet.model.common.Gas) r8
            p000.hg5.m45199b(r9)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x0074
        L_0x0044:
            p000.hg5.m45199b(r9)
            if (r7 != r5) goto L_0x004b
        L_0x0049:
            r9 = r5
            goto L_0x0051
        L_0x004b:
            r9 = 137(0x89, float:1.92E-43)
            if (r7 != r9) goto L_0x0050
            goto L_0x0049
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r9 == 0) goto L_0x00ed
            net.safemoon.androidwallet.common.TokenType$a r9 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.common.TokenType r2 = r9.mo57099b(r7)     // Catch:{ Exception -> 0x01a5 }
            i30 r2 = p000.ol0.m70377s(r2)     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.common.TokenType r7 = r9.mo57099b(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r7 = p000.ol0.m70382x(r7)     // Catch:{ Exception -> 0x01a5 }
            k90 r7 = r2.mo52379b(r7)     // Catch:{ Exception -> 0x01a5 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x01a5 }
            r0.label = r5     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r7, r0)     // Catch:{ Exception -> 0x01a5 }
            if (r9 != r1) goto L_0x0074
            return r1
        L_0x0074:
            bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r7 = r9.mo50578a()     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.model.EthGasPrice r7 = (net.safemoon.androidwallet.model.EthGasPrice) r7     // Catch:{ Exception -> 0x01a5 }
            if (r7 == 0) goto L_0x01a5
            net.safemoon.androidwallet.model.Result r7 = r7.getResult()     // Catch:{ Exception -> 0x01a5 }
            if (r7 == 0) goto L_0x01a5
            if (r8 != 0) goto L_0x00b2
            java.lang.String r8 = r7.getSafeGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r8 = p000.a40.m31671b(r8)     // Catch:{ Exception -> 0x01a5 }
            average = r8     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = r7.getProposeGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r8 = p000.a40.m31671b(r8)     // Catch:{ Exception -> 0x01a5 }
            fast = r8     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r7 = r7.getFastGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            fastest = r7     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a5
        L_0x00b2:
            int[] r9 = net.safemoon.androidwallet.model.common.GasPrice.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x01a5 }
            int r8 = r8.ordinal()     // Catch:{ Exception -> 0x01a5 }
            r8 = r9[r8]     // Catch:{ Exception -> 0x01a5 }
            if (r8 == r5) goto L_0x00e0
            if (r8 == r4) goto L_0x00d3
            if (r8 != r3) goto L_0x00cd
            java.lang.String r7 = r7.getFastGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x00ec
        L_0x00cd:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x01a5 }
            r7.<init>()     // Catch:{ Exception -> 0x01a5 }
            throw r7     // Catch:{ Exception -> 0x01a5 }
        L_0x00d3:
            java.lang.String r7 = r7.getProposeGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x00ec
        L_0x00e0:
            java.lang.String r7 = r7.getSafeGasPrice()     // Catch:{ Exception -> 0x01a5 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
        L_0x00ec:
            return r7
        L_0x00ed:
            r9 = 56
            if (r7 != r9) goto L_0x011c
            if (r8 == 0) goto L_0x01a5
            int[] r7 = net.safemoon.androidwallet.model.common.GasPrice.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x01a5 }
            int r8 = r8.ordinal()     // Catch:{ Exception -> 0x01a5 }
            r7 = r7[r8]     // Catch:{ Exception -> 0x01a5 }
            if (r7 == r5) goto L_0x0115
            if (r7 == r4) goto L_0x010e
            if (r7 != r3) goto L_0x0108
            r7 = 4619567317775286272(0x401c000000000000, double:7.0)
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x011b
        L_0x0108:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x01a5 }
            r7.<init>()     // Catch:{ Exception -> 0x01a5 }
            throw r7     // Catch:{ Exception -> 0x01a5 }
        L_0x010e:
            r7 = 4618441417868443648(0x4018000000000000, double:6.0)
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x011b
        L_0x0115:
            r7 = 4617315517961601024(0x4014000000000000, double:5.0)
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
        L_0x011b:
            return r7
        L_0x011c:
            net.safemoon.androidwallet.common.TokenType r9 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_C     // Catch:{ Exception -> 0x01a5 }
            int r9 = r9.getChainId()     // Catch:{ Exception -> 0x01a5 }
            if (r7 != r9) goto L_0x01a5
            net.safemoon.androidwallet.common.TokenType$a r9 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.common.TokenType r2 = r9.mo57099b(r7)     // Catch:{ Exception -> 0x01a5 }
            i30 r2 = p000.ol0.m70377s(r2)     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.common.TokenType r7 = r9.mo57099b(r7)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r7 = p000.ol0.m70382x(r7)     // Catch:{ Exception -> 0x01a5 }
            k90 r7 = r2.getGasPrice(r7)     // Catch:{ Exception -> 0x01a5 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x01a5 }
            r0.label = r4     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r7, r0)     // Catch:{ Exception -> 0x01a5 }
            if (r9 != r1) goto L_0x0145
            return r1
        L_0x0145:
            bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r7 = r9.mo50578a()     // Catch:{ Exception -> 0x01a5 }
            net.safemoon.androidwallet.model.EthBasGasPrice r7 = (net.safemoon.androidwallet.model.EthBasGasPrice) r7     // Catch:{ Exception -> 0x01a5 }
            if (r7 == 0) goto L_0x01a5
            java.math.BigDecimal r7 = r7.getResult()     // Catch:{ Exception -> 0x01a5 }
            if (r7 == 0) goto L_0x01a5
            if (r8 != 0) goto L_0x0176
            double r8 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r8 = p000.a40.m31671b(r8)     // Catch:{ Exception -> 0x01a5 }
            average = r8     // Catch:{ Exception -> 0x01a5 }
            double r8 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r8 = p000.a40.m31671b(r8)     // Catch:{ Exception -> 0x01a5 }
            fast = r8     // Catch:{ Exception -> 0x01a5 }
            double r7 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            fastest = r7     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a5
        L_0x0176:
            int[] r9 = net.safemoon.androidwallet.model.common.GasPrice.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x01a5 }
            int r8 = r8.ordinal()     // Catch:{ Exception -> 0x01a5 }
            r8 = r9[r8]     // Catch:{ Exception -> 0x01a5 }
            if (r8 == r5) goto L_0x019c
            if (r8 == r4) goto L_0x0193
            if (r8 != r3) goto L_0x018d
            double r7 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a4
        L_0x018d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x01a5 }
            r7.<init>()     // Catch:{ Exception -> 0x01a5 }
            throw r7     // Catch:{ Exception -> 0x01a5 }
        L_0x0193:
            double r7 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a4
        L_0x019c:
            double r7 = r7.doubleValue()     // Catch:{ Exception -> 0x01a5 }
            java.lang.Double r7 = p000.a40.m31671b(r7)     // Catch:{ Exception -> 0x01a5 }
        L_0x01a4:
            return r7
        L_0x01a5:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.common.GasPrice.fetchGasSuspended(int, net.safemoon.androidwallet.model.common.Gas, ns0):java.lang.Object");
    }

    public final double getPrice(Gas gas, int i) {
        boolean z;
        vx2.m53591g(gas, "gas");
        if (i == 56) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[gas.ordinal()];
            if (i2 == 1) {
                return 5.0d;
            }
            if (i2 == 2) {
                return 6.0d;
            }
            if (i2 == 3) {
                return 7.0d;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 1 || i == 3 || i == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[gas.ordinal()];
            if (i3 == 1) {
                Double d = average;
                if (d != null) {
                    return d.doubleValue();
                }
                return 68.0d;
            } else if (i3 == 2) {
                Double d2 = fast;
                if (d2 != null) {
                    return d2.doubleValue();
                }
                return 84.0d;
            } else if (i3 == 3) {
                Double d3 = fastest;
                if (d3 != null) {
                    return d3.doubleValue();
                }
                return 112.0d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 97) {
            return 10.0d;
        } else {
            if (i == 137) {
                int i4 = WhenMappings.$EnumSwitchMapping$0[gas.ordinal()];
                if (i4 == 1) {
                    Double d4 = average;
                    if (d4 != null) {
                        return d4.doubleValue();
                    }
                    return 38.1d;
                } else if (i4 == 2) {
                    Double d5 = fast;
                    if (d5 != null) {
                        return d5.doubleValue();
                    }
                    return 50.1d;
                } else if (i4 == 3) {
                    Double d6 = fastest;
                    if (d6 != null) {
                        return d6.doubleValue();
                    }
                    return 54.6d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i != TokenType.AVALANCHE_C.getChainId()) {
                return Utils.DOUBLE_EPSILON;
            } else {
                int i5 = WhenMappings.$EnumSwitchMapping$0[gas.ordinal()];
                if (i5 == 1) {
                    Double d7 = average;
                    if (d7 != null) {
                        return d7.doubleValue();
                    }
                    return 35.0d;
                } else if (i5 == 2) {
                    Double d8 = fast;
                    if (d8 != null) {
                        return d8.doubleValue();
                    }
                    return 40.0d;
                } else if (i5 == 3) {
                    Double d9 = fastest;
                    if (d9 != null) {
                        return d9.doubleValue();
                    }
                    return 45.0d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }
}
