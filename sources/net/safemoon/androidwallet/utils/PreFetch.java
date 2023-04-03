package net.safemoon.androidwallet.utils;

import android.app.Application;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\b\u0012\"\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b \u0010!J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR3\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\t\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/PreFetch;", "", "Lr37;", "d", "(Lns0;)Ljava/lang/Object;", "e", "b", "c", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lw70;", "Lkotlin/collections/ArrayList;", "Lrc2;", "getCallbackList", "()Lrc2;", "callbackList", "getCallback", "callback", "Ljava/util/ArrayList;", "getTmpSwapListMap", "()Ljava/util/ArrayList;", "tmpSwapListMap", "Lnet/safemoon/androidwallet/common/TokenType;", "Lnet/safemoon/androidwallet/common/TokenType;", "()Lnet/safemoon/androidwallet/common/TokenType;", "selectedChain", "<init>", "(Landroid/app/Application;Lrc2;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PreFetchData.kt */
public final class PreFetch {

    /* renamed from: a */
    public final Application f42587a;

    /* renamed from: b */
    public final rc2<ArrayList<w70>, r37> f42588b;

    /* renamed from: c */
    public final rc2<w70, r37> f42589c;

    /* renamed from: d */
    public final ArrayList<w70> f42590d = new ArrayList<>();

    /* renamed from: e */
    public final TokenType f42591e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.utils.PreFetch$a */
    /* compiled from: Comparisons.kt */
    public static final class C8635a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ PreFetch f42592a;

        public C8635a(PreFetch preFetch) {
            this.f42592a = preFetch;
        }

        public final int compare(T t, T t2) {
            boolean z;
            boolean z2 = true;
            if (this.f42592a.mo60926a().getChainId() == ((w70) t2).mo66643b()) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (this.f42592a.mo60926a().getChainId() != ((w70) t).mo66643b()) {
                z2 = false;
            }
            return xl0.m54426a(valueOf, Boolean.valueOf(z2));
        }
    }

    public PreFetch(Application application, rc2<? super ArrayList<w70>, r37> rc2, rc2<? super w70, r37> rc22) {
        vx2.m53591g(application, "application");
        vx2.m53591g(rc2, "callbackList");
        vx2.m53591g(rc22, "callback");
        this.f42587a = application;
        this.f42588b = rc2;
        this.f42589c = rc22;
        this.f42591e = ol0.m70355e(application);
    }

    /* renamed from: a */
    public final TokenType mo60926a() {
        return this.f42591e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60927b(p000.ns0<? super p000.r37> r20) {
        /*
            r19 = this;
            r0 = r19
            net.safemoon.androidwallet.utils.Common r1 = net.safemoon.androidwallet.utils.Common.f42577a
            r2 = 0
            r3 = 1
            r4 = 0
            java.util.List r1 = net.safemoon.androidwallet.utils.Common.m68290b(r1, r2, r3, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.common.TokenType r4 = (net.safemoon.androidwallet.common.TokenType) r4
            rr r5 = new rr
            android.app.Application r6 = r0.f42587a
            r5.<init>(r6)
            java.util.List r4 = r5.mo65690c(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x002f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0050
            java.lang.Object r6 = r4.next()
            r7 = r6
            net.safemoon.androidwallet.model.token.gson.GsonToken r7 = (net.safemoon.androidwallet.model.token.gson.GsonToken) r7
            if (r7 == 0) goto L_0x0049
            r7.getCmcId()
            java.lang.String r7 = r7.getCmcSlug()
            if (r7 == 0) goto L_0x0049
            r7 = r3
            goto L_0x004a
        L_0x0049:
            r7 = r2
        L_0x004a:
            if (r7 == 0) goto L_0x002f
            r5.add(r6)
            goto L_0x002f
        L_0x0050:
            java.util.Iterator r4 = r5.iterator()
        L_0x0054:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x000f
            java.lang.Object r5 = r4.next()
            net.safemoon.androidwallet.model.token.gson.GsonToken r5 = (net.safemoon.androidwallet.model.token.gson.GsonToken) r5
            java.util.ArrayList<w70> r6 = r0.f42590d
            w70 r14 = new w70
            java.lang.String r8 = r5.getContractAddress()
            int r7 = r5.getCmcId()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            java.lang.String r10 = r5.getCmcSlug()
            java.lang.String r11 = r5.getSymbol()
            int r12 = r5.getDecimals()
            int r13 = r5.getChainId()
            r15 = 0
            boolean r5 = r5.getAllowSwap()
            r17 = 64
            r18 = 0
            r7 = r14
            r2 = r14
            r14 = r15
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            r6.add(r2)
            r2 = 0
            goto L_0x0054
        L_0x0097:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.PreFetch.mo60927b(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60928c(p000.ns0<? super p000.r37> r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1 instanceof net.safemoon.androidwallet.utils.PreFetch$loadBalance$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.utils.PreFetch$loadBalance$1 r2 = (net.safemoon.androidwallet.utils.PreFetch$loadBalance$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.utils.PreFetch$loadBalance$1 r2 = new net.safemoon.androidwallet.utils.PreFetch$loadBalance$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0065
            if (r4 == r7) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r4 = r2.L$4
            w70 r4 = (p000.w70) r4
            java.lang.Object r8 = r2.L$3
            w70 r8 = (p000.w70) r8
            java.lang.Object r9 = r2.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.L$1
            z57 r10 = (p000.z57) r10
            java.lang.Object r11 = r2.L$0
            net.safemoon.androidwallet.utils.PreFetch r11 = (net.safemoon.androidwallet.utils.PreFetch) r11
            p000.hg5.m45199b(r1)
            goto L_0x0120
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004e:
            java.lang.Object r4 = r2.L$3
            w70 r4 = (p000.w70) r4
            java.lang.Object r8 = r2.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.L$1
            z57 r9 = (p000.z57) r9
            java.lang.Object r10 = r2.L$0
            net.safemoon.androidwallet.utils.PreFetch r10 = (net.safemoon.androidwallet.utils.PreFetch) r10
            p000.hg5.m45199b(r1)
            r11 = r10
            r10 = r9
            r9 = r8
            goto L_0x00b6
        L_0x0065:
            p000.hg5.m45199b(r1)
            net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r1 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
            android.app.Application r4 = r0.f42587a
            net.safemoon.androidwallet.database.room.ApplicationRoomDatabase r1 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.C8270m.m65847c(r1, r4, r5, r6, r5)
            z57 r1 = r1.mo57118Z()
            java.util.ArrayList<w70> r4 = r0.f42590d
            net.safemoon.androidwallet.utils.PreFetch$a r8 = new net.safemoon.androidwallet.utils.PreFetch$a
            r8.<init>(r0)
            java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r4, r8)
            java.util.Iterator r4 = r4.iterator()
            r8 = r0
        L_0x0084:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0143
            java.lang.Object r9 = r4.next()
            w70 r9 = (p000.w70) r9
            int r10 = r9.mo66643b()
            java.lang.String r11 = r9.mo66642a()
            r2.L$0 = r8
            r2.L$1 = r1
            r2.L$2 = r4
            r2.L$3 = r9
            r2.L$4 = r5
            r2.label = r7
            java.lang.Object r10 = r1.mo50081h(r10, r11, r2)
            if (r10 != r3) goto L_0x00ab
            return r3
        L_0x00ab:
            r11 = r8
            r29 = r10
            r10 = r1
            r1 = r29
            r30 = r9
            r9 = r4
            r4 = r30
        L_0x00b6:
            net.safemoon.androidwallet.model.token.room.RoomToken r1 = (net.safemoon.androidwallet.model.token.room.RoomToken) r1
            if (r1 == 0) goto L_0x00c8
            double r12 = r1.getNativeBalance()
            r4.mo66652i(r12)
            rc2<w70, r37> r1 = r11.f42589c
            r1.invoke(r4)
            goto L_0x013d
        L_0x00c8:
            boolean r1 = r4.mo66648f()
            if (r1 == 0) goto L_0x013d
            java.lang.String r1 = r4.mo66642a()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x00da
            r1 = r7
            goto L_0x00db
        L_0x00da:
            r1 = 0
        L_0x00db:
            if (r1 == 0) goto L_0x013d
            net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3 r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3
            android.app.Application r8 = r11.f42587a
            int r18 = r4.mo66643b()
            java.lang.String r17 = r4.mo66642a()
            int r19 = r4.mo66646e()
            java.lang.String r15 = r4.mo66650h()
            net.safemoon.androidwallet.model.DefaultIToken r14 = new net.safemoon.androidwallet.model.DefaultIToken
            r12 = r14
            r13 = 0
            r16 = 0
            r5 = r14
            r14 = r16
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 1931(0x78b, float:2.706E-42)
            r28 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            r1.<init>(r8, r5)
            r2.L$0 = r11
            r2.L$1 = r10
            r2.L$2 = r9
            r2.L$3 = r4
            r2.L$4 = r4
            r2.label = r6
            java.lang.Object r1 = r1.mo61835b(r2)
            if (r1 != r3) goto L_0x011f
            return r3
        L_0x011f:
            r8 = r4
        L_0x0120:
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            if (r1 == 0) goto L_0x0133
            int r5 = r8.mo66646e()
            java.math.BigDecimal r1 = p000.ol0.m70376r(r1, r5)
            if (r1 == 0) goto L_0x0133
            double r12 = r1.doubleValue()
            goto L_0x0135
        L_0x0133:
            r12 = 0
        L_0x0135:
            r4.mo66652i(r12)
            rc2<w70, r37> r1 = r11.f42589c
            r1.invoke(r8)
        L_0x013d:
            r4 = r9
            r1 = r10
            r8 = r11
            r5 = 0
            goto L_0x0084
        L_0x0143:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.PreFetch.mo60928c(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60929d(p000.ns0<? super p000.r37> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof net.safemoon.androidwallet.utils.PreFetch$loadPreFetchData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            net.safemoon.androidwallet.utils.PreFetch$loadPreFetchData$1 r0 = (net.safemoon.androidwallet.utils.PreFetch$loadPreFetchData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.PreFetch$loadPreFetchData$1 r0 = new net.safemoon.androidwallet.utils.PreFetch$loadPreFetchData$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            p000.hg5.m45199b(r7)
            goto L_0x0079
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.utils.PreFetch r2 = (net.safemoon.androidwallet.utils.PreFetch) r2
            p000.hg5.m45199b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.utils.PreFetch r2 = (net.safemoon.androidwallet.utils.PreFetch) r2
            p000.hg5.m45199b(r7)
            goto L_0x005b
        L_0x0047:
            p000.hg5.m45199b(r7)
            java.util.ArrayList<w70> r7 = r6.f42590d
            r7.clear()
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo60927b(r0)
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r6
        L_0x005b:
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r2.mo60930e(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            rc2<java.util.ArrayList<w70>, r37> r7 = r2.f42588b
            java.util.ArrayList<w70> r4 = r2.f42590d
            r7.invoke(r4)
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.mo60928c(r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.PreFetch.mo60929d(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0282 A[Catch:{ Exception -> 0x034c }, LOOP:4: B:95:0x023d->B:108:0x0282, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a2 A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02cb A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02cd A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02d0 A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0281 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0319 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5 A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0194 A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0220 A[Catch:{ Exception -> 0x034c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0232 A[Catch:{ Exception -> 0x034c }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60930e(p000.ns0<? super p000.r37> r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            boolean r2 = r1 instanceof net.safemoon.androidwallet.utils.PreFetch$loadTokens$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.utils.PreFetch$loadTokens$1 r2 = (net.safemoon.androidwallet.utils.PreFetch$loadTokens$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.utils.PreFetch$loadTokens$1 r2 = new net.safemoon.androidwallet.utils.PreFetch$loadTokens$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            java.lang.String r8 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r11 = 1
            if (r4 == 0) goto L_0x008c
            if (r4 == r11) goto L_0x0084
            if (r4 == r7) goto L_0x0070
            if (r4 == r6) goto L_0x0055
            if (r4 != r5) goto L_0x004d
            java.lang.Object r4 = r2.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.L$2
            xy0 r7 = (p000.xy0) r7
            java.lang.Object r12 = r2.L$1
            ip2 r12 = (p000.ip2) r12
            java.lang.Object r13 = r2.L$0
            java.util.List r13 = (java.util.List) r13
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x034c }
            r1 = r4
            r14 = r8
            r0 = r13
            r4 = 0
            goto L_0x0347
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            java.lang.Object r4 = r2.L$4
            net.safemoon.androidwallet.model.token.room.RoomCustomToken r4 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r4
            java.lang.Object r7 = r2.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r12 = r2.L$2
            xy0 r12 = (p000.xy0) r12
            java.lang.Object r13 = r2.L$1
            ip2 r13 = (p000.ip2) r13
            java.lang.Object r14 = r2.L$0
            java.util.List r14 = (java.util.List) r14
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x034c }
            r0 = r14
            r14 = r8
            goto L_0x02c9
        L_0x0070:
            java.lang.Object r4 = r2.L$2
            xy0 r4 = (p000.xy0) r4
            java.lang.Object r7 = r2.L$1
            ip2 r7 = (p000.ip2) r7
            java.lang.Object r12 = r2.L$0
            java.util.List r12 = (java.util.List) r12
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x034c }
            r0 = r3
            r31 = r8
            goto L_0x0221
        L_0x0084:
            java.lang.Object r4 = r2.L$0
            net.safemoon.androidwallet.utils.PreFetch r4 = (net.safemoon.androidwallet.utils.PreFetch) r4
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x034c }
            goto L_0x00a3
        L_0x008c:
            p000.hg5.m45199b(r1)
            ho3 r1 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x034c }
            k90 r1 = r1.mo52289r()     // Catch:{ Exception -> 0x034c }
            r2.L$0 = r0     // Catch:{ Exception -> 0x034c }
            r2.label = r11     // Catch:{ Exception -> 0x034c }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x034c }
            if (r1 != r3) goto L_0x00a2
            return r3
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x034c }
            boolean r12 = r1.mo50581e()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x034c
            java.lang.Object r12 = r1.mo50578a()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x034c
            java.lang.Object r12 = r1.mo50578a()     // Catch:{ Exception -> 0x034c }
            net.safemoon.androidwallet.model.swap.AllSwapTokens r12 = (net.safemoon.androidwallet.model.swap.AllSwapTokens) r12     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x00e5
            net.safemoon.androidwallet.model.swap.Data r12 = r12.getData()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x00e5
            java.util.List r12 = r12.getTokens()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x00e5
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x00c9:
            boolean r13 = r12.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r12.next()     // Catch:{ Exception -> 0x034c }
            r14 = r13
            net.safemoon.androidwallet.model.swap.Swap r14 = (net.safemoon.androidwallet.model.swap.Swap) r14     // Catch:{ Exception -> 0x034c }
            java.lang.String r14 = r14.symbol     // Catch:{ Exception -> 0x034c }
            java.lang.String r15 = "WETH"
            boolean r14 = p000.vx2.m53586b(r14, r15)     // Catch:{ Exception -> 0x034c }
            if (r14 == 0) goto L_0x00c9
            goto L_0x00e2
        L_0x00e1:
            r13 = 0
        L_0x00e2:
            net.safemoon.androidwallet.model.swap.Swap r13 = (net.safemoon.androidwallet.model.swap.Swap) r13     // Catch:{ Exception -> 0x034c }
            goto L_0x00e6
        L_0x00e5:
            r13 = 0
        L_0x00e6:
            net.safemoon.androidwallet.utils.Common r12 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x034c }
            r12.mo60894D(r13)     // Catch:{ Exception -> 0x034c }
            java.lang.Object r12 = r1.mo50578a()     // Catch:{ Exception -> 0x034c }
            net.safemoon.androidwallet.model.swap.AllSwapTokens r12 = (net.safemoon.androidwallet.model.swap.AllSwapTokens) r12     // Catch:{ Exception -> 0x034c }
            java.lang.String r13 = "it.chainId"
            java.lang.String r14 = "it.decimals"
            java.lang.String r15 = "it.symbol"
            java.lang.String r9 = "it.cmcSlug ?: \"\""
            java.lang.String r11 = "it.cmcId ?: \"\""
            java.lang.String r5 = "it.address"
            java.lang.String r16 = ""
            if (r12 == 0) goto L_0x017e
            net.safemoon.androidwallet.model.swap.Data r12 = r12.getData()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x017e
            java.util.List r12 = r12.getTokens()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x017e
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x0111:
            boolean r17 = r12.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r17 == 0) goto L_0x017e
            java.lang.Object r17 = r12.next()     // Catch:{ Exception -> 0x034c }
            r10 = r17
            net.safemoon.androidwallet.model.swap.Swap r10 = (net.safemoon.androidwallet.model.swap.Swap) r10     // Catch:{ Exception -> 0x034c }
            java.util.ArrayList<w70> r6 = r4.f42590d     // Catch:{ Exception -> 0x034c }
            w70 r7 = new w70     // Catch:{ Exception -> 0x034c }
            java.lang.String r0 = r10.address     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r0, r5)     // Catch:{ Exception -> 0x034c }
            r30 = r12
            java.lang.String r12 = r10.cmcId     // Catch:{ Exception -> 0x034c }
            if (r12 != 0) goto L_0x0130
            r12 = r16
        L_0x0130:
            p000.vx2.m53590f(r12, r11)     // Catch:{ Exception -> 0x034c }
            r31 = r8
            java.lang.String r8 = r10.cmcSlug     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x013b
            r8 = r16
        L_0x013b:
            p000.vx2.m53590f(r8, r9)     // Catch:{ Exception -> 0x034c }
            r32 = r3
            java.lang.String r3 = r10.symbol     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r3, r15)     // Catch:{ Exception -> 0x034c }
            r33 = r2
            java.lang.Integer r2 = r10.decimals     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r2, r14)     // Catch:{ Exception -> 0x034c }
            int r23 = r2.intValue()     // Catch:{ Exception -> 0x034c }
            java.lang.Integer r2 = r10.chainId     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r2, r13)     // Catch:{ Exception -> 0x034c }
            int r24 = r2.intValue()     // Catch:{ Exception -> 0x034c }
            r25 = 0
            r27 = 1
            r28 = 64
            r29 = 0
            r18 = r7
            r19 = r0
            r20 = r12
            r21 = r8
            r22 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)     // Catch:{ Exception -> 0x034c }
            r6.add(r7)     // Catch:{ Exception -> 0x034c }
            r0 = r35
            r12 = r30
            r8 = r31
            r3 = r32
            r2 = r33
            r6 = 3
            r7 = 2
            goto L_0x0111
        L_0x017e:
            r33 = r2
            r32 = r3
            r31 = r8
            net.safemoon.androidwallet.utils.Common r0 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x034c }
            java.util.List r0 = r0.mo60907n()     // Catch:{ Exception -> 0x034c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x018e:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r2 == 0) goto L_0x01e9
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x034c }
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2     // Catch:{ Exception -> 0x034c }
            java.util.ArrayList<w70> r3 = r4.f42590d     // Catch:{ Exception -> 0x034c }
            w70 r6 = new w70     // Catch:{ Exception -> 0x034c }
            java.lang.String r7 = r2.address     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r7, r5)     // Catch:{ Exception -> 0x034c }
            java.lang.String r8 = r2.cmcId     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x01a9
            r8 = r16
        L_0x01a9:
            p000.vx2.m53590f(r8, r11)     // Catch:{ Exception -> 0x034c }
            java.lang.String r10 = r2.cmcSlug     // Catch:{ Exception -> 0x034c }
            if (r10 != 0) goto L_0x01b2
            r10 = r16
        L_0x01b2:
            p000.vx2.m53590f(r10, r9)     // Catch:{ Exception -> 0x034c }
            java.lang.String r12 = r2.symbol     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r12, r15)     // Catch:{ Exception -> 0x034c }
            r30 = r0
            java.lang.Integer r0 = r2.decimals     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r0, r14)     // Catch:{ Exception -> 0x034c }
            int r23 = r0.intValue()     // Catch:{ Exception -> 0x034c }
            java.lang.Integer r0 = r2.chainId     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r0, r13)     // Catch:{ Exception -> 0x034c }
            int r24 = r0.intValue()     // Catch:{ Exception -> 0x034c }
            r25 = 0
            r27 = 1
            r28 = 64
            r29 = 0
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r10
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)     // Catch:{ Exception -> 0x034c }
            r3.add(r6)     // Catch:{ Exception -> 0x034c }
            r0 = r30
            goto L_0x018e
        L_0x01e9:
            java.lang.Object r0 = r1.mo50578a()     // Catch:{ Exception -> 0x034c }
            net.safemoon.androidwallet.model.swap.AllSwapTokens r0 = (net.safemoon.androidwallet.model.swap.AllSwapTokens) r0     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x034c
            net.safemoon.androidwallet.model.swap.Data r0 = r0.getData()     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x034c
            java.util.List r12 = r0.getTokens()     // Catch:{ Exception -> 0x034c }
            if (r12 == 0) goto L_0x034c
            c67 r0 = p000.c67.f37071a     // Catch:{ Exception -> 0x034c }
            android.app.Application r1 = r4.f42587a     // Catch:{ Exception -> 0x034c }
            ip2 r7 = r0.mo50813b(r1)     // Catch:{ Exception -> 0x034c }
            yy0 r0 = p000.yy0.f46294a     // Catch:{ Exception -> 0x034c }
            android.app.Application r1 = r4.f42587a     // Catch:{ Exception -> 0x034c }
            xy0 r4 = r0.mo67189a(r1)     // Catch:{ Exception -> 0x034c }
            r2 = r33
            r2.L$0 = r12     // Catch:{ Exception -> 0x034c }
            r2.L$1 = r7     // Catch:{ Exception -> 0x034c }
            r2.L$2 = r4     // Catch:{ Exception -> 0x034c }
            r0 = 2
            r2.label = r0     // Catch:{ Exception -> 0x034c }
            java.lang.Object r1 = r4.mo66977c(r2)     // Catch:{ Exception -> 0x034c }
            r0 = r32
            if (r1 != r0) goto L_0x0221
            return r0
        L_0x0221:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x034c }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x034c }
            r3.<init>()     // Catch:{ Exception -> 0x034c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x022c:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r5 == 0) goto L_0x0295
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x034c }
            r6 = r5
            net.safemoon.androidwallet.model.token.room.RoomCustomToken r6 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r6     // Catch:{ Exception -> 0x034c }
            java.util.Iterator r8 = r12.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x023d:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r9 == 0) goto L_0x0285
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x034c }
            r10 = r9
            net.safemoon.androidwallet.model.swap.Swap r10 = (net.safemoon.androidwallet.model.swap.Swap) r10     // Catch:{ Exception -> 0x034c }
            java.lang.String r11 = r10.address     // Catch:{ Exception -> 0x034c }
            java.lang.String r13 = "at.address"
            p000.vx2.m53590f(r11, r13)     // Catch:{ Exception -> 0x034c }
            java.util.Locale r13 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x034c }
            java.lang.String r11 = r11.toLowerCase(r13)     // Catch:{ Exception -> 0x034c }
            r14 = r31
            p000.vx2.m53590f(r11, r14)     // Catch:{ Exception -> 0x034c }
            java.lang.String r15 = r6.getContractAddress()     // Catch:{ Exception -> 0x034c }
            java.lang.String r13 = r15.toLowerCase(r13)     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r13, r14)     // Catch:{ Exception -> 0x034c }
            boolean r11 = p000.vx2.m53586b(r11, r13)     // Catch:{ Exception -> 0x034c }
            if (r11 == 0) goto L_0x027e
            int r11 = r6.getChainId()     // Catch:{ Exception -> 0x034c }
            java.lang.Integer r10 = r10.chainId     // Catch:{ Exception -> 0x034c }
            if (r10 != 0) goto L_0x0276
            goto L_0x027e
        L_0x0276:
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x034c }
            if (r11 != r10) goto L_0x027e
            r10 = 1
            goto L_0x027f
        L_0x027e:
            r10 = 0
        L_0x027f:
            if (r10 == 0) goto L_0x0282
            goto L_0x0288
        L_0x0282:
            r31 = r14
            goto L_0x023d
        L_0x0285:
            r14 = r31
            r9 = 0
        L_0x0288:
            if (r9 == 0) goto L_0x028c
            r6 = 1
            goto L_0x028d
        L_0x028c:
            r6 = 0
        L_0x028d:
            if (r6 == 0) goto L_0x0292
            r3.add(r5)     // Catch:{ Exception -> 0x034c }
        L_0x0292:
            r31 = r14
            goto L_0x022c
        L_0x0295:
            r14 = r31
            java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x034c }
            r3 = r0
        L_0x029c:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x034c
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x034c }
            net.safemoon.androidwallet.model.token.room.RoomCustomToken r0 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r0     // Catch:{ Exception -> 0x034c }
            java.lang.String r5 = r0.getSymbolWithType()     // Catch:{ Exception -> 0x034c }
            r2.L$0 = r12     // Catch:{ Exception -> 0x034c }
            r2.L$1 = r7     // Catch:{ Exception -> 0x034c }
            r2.L$2 = r4     // Catch:{ Exception -> 0x034c }
            r2.L$3 = r1     // Catch:{ Exception -> 0x034c }
            r2.L$4 = r0     // Catch:{ Exception -> 0x034c }
            r6 = 3
            r2.label = r6     // Catch:{ Exception -> 0x034c }
            java.lang.Object r5 = r7.mo50494f(r5, r2)     // Catch:{ Exception -> 0x034c }
            if (r5 != r3) goto L_0x02c0
            return r3
        L_0x02c0:
            r13 = r7
            r7 = r1
            r1 = r5
            r34 = r4
            r4 = r0
            r0 = r12
            r12 = r34
        L_0x02c9:
            if (r1 == 0) goto L_0x02cd
            r1 = 1
            goto L_0x02ce
        L_0x02cd:
            r1 = 0
        L_0x02ce:
            if (r1 == 0) goto L_0x032b
            r13.mo50498j(r4)     // Catch:{ Exception -> 0x034c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x034c }
        L_0x02d7:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x034c }
            if (r5 == 0) goto L_0x031a
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x034c }
            r8 = r5
            net.safemoon.androidwallet.model.swap.Swap r8 = (net.safemoon.androidwallet.model.swap.Swap) r8     // Catch:{ Exception -> 0x034c }
            java.lang.String r9 = r8.address     // Catch:{ Exception -> 0x034c }
            java.lang.String r10 = "swap.address"
            p000.vx2.m53590f(r9, r10)     // Catch:{ Exception -> 0x034c }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x034c }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r9, r14)     // Catch:{ Exception -> 0x034c }
            java.lang.String r11 = r4.getContractAddress()     // Catch:{ Exception -> 0x034c }
            java.lang.String r10 = r11.toLowerCase(r10)     // Catch:{ Exception -> 0x034c }
            p000.vx2.m53590f(r10, r14)     // Catch:{ Exception -> 0x034c }
            boolean r9 = p000.vx2.m53586b(r9, r10)     // Catch:{ Exception -> 0x034c }
            if (r9 == 0) goto L_0x0316
            java.lang.Integer r8 = r8.chainId     // Catch:{ Exception -> 0x034c }
            int r9 = r4.getChainId()     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x030e
            goto L_0x0316
        L_0x030e:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x034c }
            if (r8 != r9) goto L_0x0316
            r8 = 1
            goto L_0x0317
        L_0x0316:
            r8 = 0
        L_0x0317:
            if (r8 == 0) goto L_0x02d7
            goto L_0x031b
        L_0x031a:
            r5 = 0
        L_0x031b:
            net.safemoon.androidwallet.model.swap.Swap r5 = (net.safemoon.androidwallet.model.swap.Swap) r5     // Catch:{ Exception -> 0x034c }
            if (r5 == 0) goto L_0x032b
            net.safemoon.androidwallet.model.token.abstraction.IToken r1 = r5.toIToken()     // Catch:{ Exception -> 0x034c }
            java.lang.String r5 = "newSwap.toIToken()"
            p000.vx2.m53590f(r1, r5)     // Catch:{ Exception -> 0x034c }
            r13.mo50495g(r1)     // Catch:{ Exception -> 0x034c }
        L_0x032b:
            java.lang.String r1 = r4.getSymbolWithType()     // Catch:{ Exception -> 0x034c }
            r2.L$0 = r0     // Catch:{ Exception -> 0x034c }
            r2.L$1 = r13     // Catch:{ Exception -> 0x034c }
            r2.L$2 = r12     // Catch:{ Exception -> 0x034c }
            r2.L$3 = r7     // Catch:{ Exception -> 0x034c }
            r4 = 0
            r2.L$4 = r4     // Catch:{ Exception -> 0x034c }
            r5 = 4
            r2.label = r5     // Catch:{ Exception -> 0x034c }
            java.lang.Object r1 = r12.mo66975a(r1, r2)     // Catch:{ Exception -> 0x034c }
            if (r1 != r3) goto L_0x0344
            return r3
        L_0x0344:
            r1 = r7
            r7 = r12
            r12 = r13
        L_0x0347:
            r4 = r7
            r7 = r12
            r12 = r0
            goto L_0x029c
        L_0x034c:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.PreFetch.mo60930e(ns0):java.lang.Object");
    }
}
