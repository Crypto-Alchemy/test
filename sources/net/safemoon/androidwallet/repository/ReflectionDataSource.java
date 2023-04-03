package net.safemoon.androidwallet.repository;

import androidx.lifecycle.LiveData;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsData;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsTokenAndData;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010:\u001a\u000208¢\u0006\u0004\b;\u0010<J;\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0!H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0!0&2\u0006\u0010%\u001a\u00020$J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0!0&2\b\u0010%\u001a\u0004\u0018\u00010$J\u001c\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0!\u0018\u00010&2\u0006\u0010+\u001a\u00020*J\u001b\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b/\u0010\u000eJ\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0004J\u001d\u00101\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b1\u0010 J\u001b\u00102\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u000eJ\u0013\u00103\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b3\u0010#J\u001b\u00104\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b4\u0010 J\u0018\u00107\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000fH\u0002R\u0014\u0010:\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00109\u0002\u0004\n\u0002\b\u0019¨\u0006="}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "", "nativeBalance", "", "firstTimeStamp", "latestBalance", "latestTimeStamp", "n", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Ljava/lang/String;JJJLns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "m", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Lns0;)Ljava/lang/Object;", "", "cmcId", "symbolWithType", "Lr37;", "o", "(ILjava/lang/String;Lns0;)Ljava/lang/Object;", "", "priceUsd", "p", "(DLjava/lang/String;Lns0;)Ljava/lang/Object;", "q", "(JJLjava/lang/String;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "data", "l", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;Lns0;)Ljava/lang/Object;", "i", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "g", "(Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "param", "Landroidx/lifecycle/LiveData;", "d", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsTokenAndData;", "e", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$a;", "reflectionParam", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "f", "rrt", "r", "b", "c", "a", "k", "j", "field", "amount", "h", "Llb5;", "Llb5;", "reflectionDao", "<init>", "(Llb5;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionDataSource.kt */
public final class ReflectionDataSource {

    /* renamed from: a */
    public final lb5 f42522a;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.repository.ReflectionDataSource$a */
    /* compiled from: ReflectionDataSource.kt */
    public /* synthetic */ class C8610a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeSpan[] r0 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeSpan.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeSpan r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeSpan.LOW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeSpan r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeSpan.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeSpan r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeSpan.HIGH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42523a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.ReflectionDataSource.C8610a.<clinit>():void");
        }
    }

    public ReflectionDataSource(lb5 lb5) {
        vx2.m53591g(lb5, "reflectionDao");
        this.f42522a = lb5;
    }

    /* renamed from: a */
    public final Object mo60740a(RoomReflectionsToken roomReflectionsToken, ns0<? super r37> ns0) {
        Object f = this.f42522a.mo55861f(roomReflectionsToken, ns0);
        if (f == wx2.m54101d()) {
            return f;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public final LiveData<RoomReflectionsTokenAndData> mo60741b(String str) {
        vx2.m53591g(str, "symbolWithType");
        return this.f42522a.mo55864i(str);
    }

    /* renamed from: c */
    public final Object mo60742c(String str, ns0<? super RoomReflectionsToken> ns0) {
        return this.f42522a.mo55872q(str, ns0);
    }

    /* renamed from: d */
    public final LiveData<List<RoomReflectionsToken>> mo60743d(TokenType tokenType) {
        vx2.m53591g(tokenType, "param");
        return this.f42522a.mo55859d(tokenType.getChainId());
    }

    /* renamed from: e */
    public final LiveData<List<RoomReflectionsTokenAndData>> mo60744e(TokenType tokenType) {
        if (tokenType != null) {
            return this.f42522a.mo55856a(tokenType.getChainId());
        }
        return new k04();
    }

    /* renamed from: f */
    public final LiveData<List<RoomReflectionsDataAndToken>> mo60745f(ReflectionTrackerViewModel.C8722a aVar) {
        long j;
        vx2.m53591g(aVar, "reflectionParam");
        if (aVar.mo61355b() == ReflectionTrackerViewModel.TimeMode.DAILY) {
            int i = C8610a.f42523a[aVar.mo61356c().ordinal()];
            if (i == 1) {
                j = mo60747h(6, -1);
            } else if (i == 2) {
                j = mo60747h(6, -7);
            } else if (i == 3) {
                j = mo60747h(6, -30);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            j = 0;
        }
        if (aVar.mo61355b() == ReflectionTrackerViewModel.TimeMode.WEEKLY || aVar.mo61355b() == ReflectionTrackerViewModel.TimeMode.MONTHLY) {
            int i2 = C8610a.f42523a[aVar.mo61356c().ordinal()];
            if (i2 == 1) {
                j = mo60747h(2, -3);
            } else if (i2 == 2) {
                j = mo60747h(2, -6);
            } else if (i2 == 3) {
                j = mo60747h(2, -12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (j > 0) {
            return this.f42522a.mo55857b(aVar.mo61354a(), j);
        }
        return this.f42522a.mo55863h(aVar.mo61354a());
    }

    /* renamed from: g */
    public final Object mo60746g(ns0<? super List<RoomReflectionsToken>> ns0) {
        return this.f42522a.mo55865j(ns0);
    }

    /* renamed from: h */
    public final long mo60747h(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(i, i2);
        Common common = Common.f42577a;
        Date time = instance.getTime();
        vx2.m53590f(time, "timeNow.time");
        return common.mo60893C(time);
    }

    /* renamed from: i */
    public final Object mo60748i(String str, ns0<? super RoomReflectionsData> ns0) {
        return this.f42522a.mo55858c(str, ns0);
    }

    /* renamed from: j */
    public final Object mo60749j(String str, ns0<? super r37> ns0) {
        Object l = this.f42522a.mo55867l(str, ns0);
        if (l == wx2.m54101d()) {
            return l;
        }
        return r37.f33317a;
    }

    /* renamed from: k */
    public final Object mo60750k(ns0<? super r37> ns0) {
        Object p = this.f42522a.mo55871p(ns0);
        if (p == wx2.m54101d()) {
            return p;
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60751l(net.safemoon.androidwallet.model.reflections.RoomReflectionsData r8, p000.ns0<? super p000.r37> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.repository.ReflectionDataSource$saveData$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.repository.ReflectionDataSource$saveData$1 r0 = (net.safemoon.androidwallet.repository.ReflectionDataSource$saveData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.ReflectionDataSource$saveData$1 r0 = new net.safemoon.androidwallet.repository.ReflectionDataSource$saveData$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r9)
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r8 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsData) r8
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r2 = (net.safemoon.androidwallet.repository.ReflectionDataSource) r2
            p000.hg5.m45199b(r9)
            goto L_0x005b
        L_0x0040:
            p000.hg5.m45199b(r9)
            lb5 r9 = r7.f42522a
            java.lang.String r2 = r8.getSymbolWithType()
            long r5 = r8.getTimeStamp()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.mo55862g(r2, r5, r0)
            if (r9 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r7
        L_0x005b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0076
            lb5 r9 = r2.f42522a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.mo55870o(r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r37 r8 = p000.r37.f33317a
            return r8
        L_0x0076:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.ReflectionDataSource.mo60751l(net.safemoon.androidwallet.model.reflections.RoomReflectionsData, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60752m(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r7, p000.ns0<? super java.lang.Long> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.repository.ReflectionDataSource$saveToken$2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.repository.ReflectionDataSource$saveToken$2 r0 = (net.safemoon.androidwallet.repository.ReflectionDataSource$saveToken$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.ReflectionDataSource$saveToken$2 r0 = new net.safemoon.androidwallet.repository.ReflectionDataSource$saveToken$2
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r8)
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r7 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r7
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r2 = (net.safemoon.androidwallet.repository.ReflectionDataSource) r2
            p000.hg5.m45199b(r8)
            goto L_0x005b
        L_0x0040:
            p000.hg5.m45199b(r8)
            lb5 r8 = r6.f42522a
            java.lang.String r2 = r7.getSymbolWithType()
            int r5 = r7.getChainId()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo55866k(r2, r5, r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r6
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0074
            lb5 r8 = r2.f42522a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.mo55860e(r7, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            return r8
        L_0x0074:
            r7 = 0
            java.lang.Long r7 = p000.a40.m31674e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.ReflectionDataSource.mo60752m(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken, ns0):java.lang.Object");
    }

    /* renamed from: n */
    public final Object mo60753n(IToken iToken, String str, long j, long j2, long j3, ns0<? super Long> ns0) {
        String symbolWithType = iToken.getSymbolWithType();
        String name = iToken.getName();
        String contractAddress = iToken.getContractAddress();
        String symbol = iToken.getSymbol();
        int chainId = iToken.getChainId();
        int decimals = iToken.getDecimals();
        RoomReflectionsToken roomReflectionsToken = r0;
        RoomReflectionsToken roomReflectionsToken2 = new RoomReflectionsToken((Long) null, symbolWithType, symbol, name, iToken.getIconResName(), contractAddress, chainId, decimals, str, a40.m31674e(j), false, a40.m31674e(j2), a40.m31674e(j3), (Long) null, (Double) null, 25601, (DefaultConstructorMarker) null);
        return mo60752m(roomReflectionsToken, ns0);
    }

    /* renamed from: o */
    public final Object mo60754o(int i, String str, ns0<? super r37> ns0) {
        Object s = this.f42522a.mo55874s(i, str, ns0);
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: p */
    public final Object mo60755p(double d, String str, ns0<? super r37> ns0) {
        Object m = this.f42522a.mo55868m(d, str, ns0);
        if (m == wx2.m54101d()) {
            return m;
        }
        return r37.f33317a;
    }

    /* renamed from: q */
    public final Object mo60756q(long j, long j2, String str, ns0<? super r37> ns0) {
        Object r = this.f42522a.mo55873r(j, j2, str, ns0);
        if (r == wx2.m54101d()) {
            return r;
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60757r(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r7, p000.ns0<? super p000.r37> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.repository.ReflectionDataSource$toggleReflectionEnable$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.repository.ReflectionDataSource$toggleReflectionEnable$1 r0 = (net.safemoon.androidwallet.repository.ReflectionDataSource$toggleReflectionEnable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.ReflectionDataSource$toggleReflectionEnable$1 r0 = new net.safemoon.androidwallet.repository.ReflectionDataSource$toggleReflectionEnable$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r8)
            goto L_0x004e
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p000.hg5.m45199b(r8)
            java.lang.Long r8 = r7.getId()
            if (r8 == 0) goto L_0x004e
            long r4 = r8.longValue()
            lb5 r8 = r6.f42522a
            boolean r7 = r7.getEnableAdvanceMode()
            r7 = r7 ^ r3
            r0.label = r3
            java.lang.Object r7 = r8.mo55869n(r4, r7, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.ReflectionDataSource.mo60757r(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken, ns0):java.lang.Object");
    }
}
