package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.dl4;
import p000.gf7;
import p000.xi3;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0001\u0012\b\u0010H\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I\u0012\u0006\u0010R\u001a\u00020O\u0012\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010W\u001a\u00020U\u0012\u0016\b\u0002\u0010\\\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010X\u0012\u0016\b\u0002\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020\b0_¢\u0006\u0004\bb\u0010cJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\bJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u001d\u001a\u00020\b*\u00020\u001cH\u0002J'\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b \u0010!J9\u0010$\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000103028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001030\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010H\u001a\u0004\u0018\u00018\u00008\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I8\u0000X\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010@R\u0014\u0010W\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR%\u0010\\\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010X8\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bZ\u0010[R\"\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\b0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010`\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, mo44877d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Lgf7;", "viewportHint", "Lr37;", "w", "(Landroidx/paging/LoadType;Lgf7;Lns0;)Ljava/lang/Object;", "l", "m", "Lfl4;", "o", "(Lns0;)Ljava/lang/Object;", "Lz42;", "", "n", "(Lz42;Landroidx/paging/LoadType;Lns0;)Ljava/lang/Object;", "p", "Lcf2;", "generationalHint", "q", "(Landroidx/paging/LoadType;Lcf2;Lns0;)Ljava/lang/Object;", "Landroidx/paging/PageFetcherSnapshotState;", "x", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lns0;)Ljava/lang/Object;", "Lhu0;", "y", "key", "Ldl4$a;", "u", "(Landroidx/paging/LoadType;Ljava/lang/Object;)Ldl4$a;", "generationId", "presentedItemsBeyondAnchor", "v", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "Lr04;", "a", "Lr04;", "hintSharedFlow", "Lgf7$a;", "b", "Lgf7$a;", "lastHint", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "Lfd0;", "Lvk4;", "d", "Lfd0;", "pageEventCh", "Landroidx/paging/PageFetcherSnapshotState$a;", "e", "Landroidx/paging/PageFetcherSnapshotState$a;", "stateHolder", "Lhm0;", "f", "Lhm0;", "pageEventChannelFlowJob", "g", "Lz42;", "r", "()Lz42;", "pageEventFlow", "h", "Ljava/lang/Object;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "initialKey", "Ldl4;", "i", "Ldl4;", "s", "()Ldl4;", "pagingSource", "Lbl4;", "j", "Lbl4;", "config", "k", "retryFlow", "", "Z", "triggerRemoteRefresh", "Luc5;", "Luc5;", "t", "()Luc5;", "remoteMediatorConnection", "Lfl4;", "previousPagingState", "Lkotlin/Function0;", "Lpc2;", "invalidate", "<init>", "(Ljava/lang/Object;Ldl4;Lbl4;Lz42;ZLuc5;Lfl4;Lpc2;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot<Key, Value> {

    /* renamed from: a */
    public final r04<gf7> f6163a;

    /* renamed from: b */
    public gf7.C2383a f6164b;

    /* renamed from: c */
    public final AtomicBoolean f6165c;

    /* renamed from: d */
    public final fd0<vk4<Value>> f6166d;

    /* renamed from: e */
    public final PageFetcherSnapshotState.C1180a<Key, Value> f6167e;

    /* renamed from: f */
    public final hm0 f6168f;

    /* renamed from: g */
    public final z42<vk4<Value>> f6169g;

    /* renamed from: h */
    public final Key f6170h;

    /* renamed from: i */
    public final dl4<Key, Value> f6171i;

    /* renamed from: j */
    public final bl4 f6172j;

    /* renamed from: k */
    public final z42<r37> f6173k;

    /* renamed from: l */
    public final boolean f6174l;

    /* renamed from: m */
    public final uc5<Key, Value> f6175m;

    /* renamed from: n */
    public final fl4<Key, Value> f6176n;

    /* renamed from: o */
    public final pc2<r37> f6177o;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"androidx/paging/PageFetcherSnapshot$a", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PageFetcherSnapshot$a */
    /* compiled from: Collect.kt */
    public static final class C1163a implements a52<cf2> {

        /* renamed from: a */
        public final /* synthetic */ PageFetcherSnapshot f6178a;

        /* renamed from: d */
        public final /* synthetic */ LoadType f6179d;

        public C1163a(PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
            this.f6178a = pageFetcherSnapshot;
            this.f6179d = loadType;
        }

        public Object emit(Object obj, ns0 ns0) {
            Object q = this.f6178a.mo8682q(this.f6179d, (cf2) obj, ns0);
            if (q == wx2.m54101d()) {
                return q;
            }
            return r37.f33317a;
        }
    }

    public PageFetcherSnapshot(Key key, dl4<Key, Value> dl4, bl4 bl4, z42<r37> z42, boolean z, uc5<Key, Value> uc5, fl4<Key, Value> fl4, pc2<r37> pc2) {
        boolean z2;
        vx2.m53591g(dl4, "pagingSource");
        vx2.m53591g(bl4, "config");
        vx2.m53591g(z42, "retryFlow");
        vx2.m53591g(pc2, "invalidate");
        this.f6170h = key;
        this.f6171i = dl4;
        this.f6172j = bl4;
        this.f6173k = z42;
        this.f6174l = z;
        this.f6175m = uc5;
        this.f6176n = fl4;
        this.f6177o = pc2;
        if (bl4.f8183f == Integer.MIN_VALUE || dl4.mo8654b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f6163a = yz5.m74703b(1, 0, (BufferOverflow) null, 6, (Object) null);
            this.f6165c = new AtomicBoolean(false);
            this.f6166d = od0.m70236b(-2, (BufferOverflow) null, (rc2) null, 6, (Object) null);
            this.f6167e = new PageFetcherSnapshotState.C1180a<>(bl4);
            hm0 b = i33.m58814b((y23) null, 1, (Object) null);
            this.f6168f = b;
            this.f6169g = CancelableChannelFlowKt.m8403a(b, new PageFetcherSnapshot$pageEventFlow$1(this, (ns0) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    /* renamed from: l */
    public final void mo8677l(gf7 gf7) {
        vx2.m53591g(gf7, "viewportHint");
        if (gf7 instanceof gf7.C2383a) {
            this.f6164b = (gf7.C2383a) gf7;
        }
        this.f6163a.mo55645b(gf7);
    }

    /* renamed from: m */
    public final void mo8678m() {
        y23.C9621a.m74226a(this.f6168f, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo8679n(z42<Integer> z42, LoadType loadType, ns0<? super r37> ns0) {
        Object a = e52.m57219k(FlowExtKt.m8410b(FlowExtKt.m8412d(z42, new C1164xe29ec4fd((ns0) null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, (ns0) null))).mo8646a(new C1163a(this, loadType), ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8680o(p000.ns0<? super p000.fl4<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r1 = r0.L$2
            y04 r1 = (p000.y04) r1
            java.lang.Object r2 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$a r2 = (androidx.paging.PageFetcherSnapshotState.C1180a) r2
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            p000.hg5.m45199b(r6)
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003e:
            p000.hg5.m45199b(r6)
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r2 = r5.f6167e
            y04 r6 = r2.f6204a
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r0 = r6.mo55746a(r3, r0)
            if (r0 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
            r1 = r6
        L_0x0058:
            androidx.paging.PageFetcherSnapshotState r6 = r2.f6205b     // Catch:{ all -> 0x0066 }
            gf7$a r0 = r0.f6164b     // Catch:{ all -> 0x0066 }
            fl4 r6 = r6.mo8695g(r0)     // Catch:{ all -> 0x0066 }
            r1.mo55747b(r3)
            return r6
        L_0x0066:
            r6 = move-exception
            r1.mo55747b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.mo8680o(ns0):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0268, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0269, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026a, code lost:
        r2.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026d, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0270, code lost:
        if ((r6 instanceof p000.dl4.C2176b.C2177a) == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0272, code lost:
        r5 = r7.f6167e;
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r5);
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r12;
        r0.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0288, code lost:
        if (r12.mo55746a((java.lang.Object) null, r0) != r1) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r2 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r5 = new p000.xi3.C3603a(((p000.dl4.C2176b.C2177a) r6).mo18818a());
        r6 = androidx.paging.LoadType.REFRESH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a0, code lost:
        if (r2.mo8709u(r6, r5) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a2, code lost:
        r2 = r7.f6166d;
        r7 = new p000.vk4.C3495c(r6, false, r5);
        r0.L$0 = r12;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b9, code lost:
        if (r2.mo26027u(r7, r0) != r1) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02bb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02bc, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r12 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bf, code lost:
        r0.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c4, code lost:
        r10 = r0;
        r0 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c7, code lost:
        r0.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ca, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cd, code lost:
        return p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r5 = androidx.paging.LoadType.REFRESH;
        r0.L$0 = r6;
        r0.L$1 = r2;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0110, code lost:
        if (r6.mo8689x(r12, r5, r0) != r1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        r12 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        r2.mo55747b((java.lang.Object) null);
        r12 = r5.mo8686u(androidx.paging.LoadType.REFRESH, r5.f6170h);
        r2 = r5.f6171i;
        r0.L$0 = r5;
        r0.L$1 = null;
        r0.label = 3;
        r12 = r2.mo8656f(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012e, code lost:
        if (r12 != r1) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0130, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r6 = (p000.dl4.C2176b) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        if ((r6 instanceof p000.dl4.C2176b.C2178b) == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0139, code lost:
        r5 = r7.f6167e;
        r2 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r5);
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r2;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014e, code lost:
        if (r2.mo55746a((java.lang.Object) null, r0) != r1) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0150, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12 = p000.a40.m31670a(androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5).mo8706r(0, androidx.paging.LoadType.REFRESH, (p000.dl4.C2176b.C2178b) r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0162, code lost:
        r2.mo55747b((java.lang.Object) null);
        r2 = r12.booleanValue();
        r5 = r7.f6167e;
        r3 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r5);
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r3;
        r0.Z$0 = r2;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0180, code lost:
        if (r3.mo55746a((java.lang.Object) null, r0) != r1) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0182, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r5 = androidx.paging.LoadType.REFRESH;
        r8 = p000.xi3.C3605c.f19851d;
        r12.mo8709u(r5, r8.mo27759b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0199, code lost:
        if (((p000.dl4.C2176b.C2178b) r6).mo18826e() != null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        r12.mo8709u(androidx.paging.LoadType.PREPEND, r8.mo27758a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ab, code lost:
        if (((p000.dl4.C2176b.C2178b) r6).mo18825d() != null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ad, code lost:
        r12.mo8709u(androidx.paging.LoadType.APPEND, r8.mo27758a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b6, code lost:
        r12 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bb, code lost:
        if (r2 == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bd, code lost:
        r3 = r7.f6167e;
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r3);
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r3;
        r0.L$3 = r12;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d2, code lost:
        if (r12.mo55746a((java.lang.Object) null, r0) != r1) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d5, code lost:
        r2 = r12;
        r5 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r3);
        r3 = r6.f6166d;
        r12 = r12.mo8710v((p000.dl4.C2176b.C2178b) r5, androidx.paging.LoadType.REFRESH);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r2;
        r0.L$3 = null;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f6, code lost:
        if (r3.mo26027u(r12, r0) != r1) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f9, code lost:
        r3 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fb, code lost:
        r12 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fd, code lost:
        r2.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0205, code lost:
        r3 = r6;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0209, code lost:
        if (r5.f6175m == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020b, code lost:
        r12 = (p000.dl4.C2176b.C2178b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0212, code lost:
        if (r12.mo18826e() == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0218, code lost:
        if (r12.mo18825d() != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021a, code lost:
        r2 = r5.f6167e;
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r2);
        r0.L$0 = r5;
        r0.L$1 = r3;
        r0.L$2 = r2;
        r0.L$3 = r12;
        r0.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0230, code lost:
        if (r12.mo55746a((java.lang.Object) null, r0) != r1) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0232, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0233, code lost:
        r1 = r12;
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r2).mo8695g(r0.f6164b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023f, code lost:
        r1.mo55747b((java.lang.Object) null);
        r3 = (p000.dl4.C2176b.C2178b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0248, code lost:
        if (r3.mo18826e() != null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024a, code lost:
        r0.f6175m.mo26731a(androidx.paging.LoadType.PREPEND, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0255, code lost:
        if (r3.mo18825d() != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0257, code lost:
        r0.f6175m.mo26731a(androidx.paging.LoadType.APPEND, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025f, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0260, code lost:
        r1.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0263, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0264, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0265, code lost:
        r3.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo8681p(p000.ns0<? super p000.r37> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = (androidx.paging.PageFetcherSnapshot$doInitialLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = new androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00a4;
                case 5: goto L_0x008d;
                case 6: goto L_0x0078;
                case 7: goto L_0x0064;
                case 8: goto L_0x004f;
                case 9: goto L_0x0039;
                case 10: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002d:
            java.lang.Object r0 = r0.L$0
            y04 r0 = (p000.y04) r0
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0036 }
            goto L_0x02bd
        L_0x0036:
            r12 = move-exception
            goto L_0x02c7
        L_0x0039:
            java.lang.Object r2 = r0.L$3
            y04 r2 = (p000.y04) r2
            java.lang.Object r5 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r0.L$1
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            p000.hg5.m45199b(r12)
            r12 = r2
            goto L_0x028b
        L_0x004f:
            java.lang.Object r1 = r0.L$3
            y04 r1 = (p000.y04) r1
            java.lang.Object r2 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$a r2 = (androidx.paging.PageFetcherSnapshotState.C1180a) r2
            java.lang.Object r3 = r0.L$1
            dl4$b r3 = (p000.dl4.C2176b) r3
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            p000.hg5.m45199b(r12)
            goto L_0x0235
        L_0x0064:
            java.lang.Object r2 = r0.L$2
            y04 r2 = (p000.y04) r2
            java.lang.Object r3 = r0.L$1
            dl4$b r3 = (p000.dl4.C2176b) r3
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0075 }
            goto L_0x01fb
        L_0x0075:
            r12 = move-exception
            goto L_0x0201
        L_0x0078:
            java.lang.Object r2 = r0.L$3
            y04 r2 = (p000.y04) r2
            java.lang.Object r3 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$a r3 = (androidx.paging.PageFetcherSnapshotState.C1180a) r3
            java.lang.Object r5 = r0.L$1
            dl4$b r5 = (p000.dl4.C2176b) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            p000.hg5.m45199b(r12)
            goto L_0x01d8
        L_0x008d:
            boolean r2 = r0.Z$0
            java.lang.Object r3 = r0.L$3
            y04 r3 = (p000.y04) r3
            java.lang.Object r5 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r0.L$1
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            p000.hg5.m45199b(r12)
            goto L_0x0183
        L_0x00a4:
            java.lang.Object r2 = r0.L$3
            y04 r2 = (p000.y04) r2
            java.lang.Object r5 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r0.L$1
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            p000.hg5.m45199b(r12)
            goto L_0x0151
        L_0x00b9:
            java.lang.Object r2 = r0.L$0
            androidx.paging.PageFetcherSnapshot r2 = (androidx.paging.PageFetcherSnapshot) r2
            p000.hg5.m45199b(r12)
            r7 = r2
            goto L_0x0132
        L_0x00c3:
            java.lang.Object r2 = r0.L$1
            y04 r2 = (p000.y04) r2
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x00cf }
            goto L_0x0114
        L_0x00cf:
            r12 = move-exception
            goto L_0x02ce
        L_0x00d2:
            java.lang.Object r2 = r0.L$2
            y04 r2 = (p000.y04) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            p000.hg5.m45199b(r12)
            goto L_0x00fd
        L_0x00e2:
            p000.hg5.m45199b(r12)
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r11.f6167e
            y04 r12 = r5.f6204a
            r0.L$0 = r11
            r0.L$1 = r5
            r0.L$2 = r12
            r2 = 1
            r0.label = r2
            java.lang.Object r2 = r12.mo55746a(r4, r0)
            if (r2 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r6 = r11
            r2 = r12
        L_0x00fd:
            androidx.paging.PageFetcherSnapshotState r12 = r5.f6205b     // Catch:{ all -> 0x00cf }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x00cf }
            r0.L$0 = r6     // Catch:{ all -> 0x00cf }
            r0.L$1 = r2     // Catch:{ all -> 0x00cf }
            r0.L$2 = r4     // Catch:{ all -> 0x00cf }
            r7 = 2
            r0.label = r7     // Catch:{ all -> 0x00cf }
            java.lang.Object r12 = r6.mo8689x(r12, r5, r0)     // Catch:{ all -> 0x00cf }
            if (r12 != r1) goto L_0x0113
            return r1
        L_0x0113:
            r5 = r6
        L_0x0114:
            r37 r12 = p000.r37.f33317a     // Catch:{ all -> 0x00cf }
            r2.mo55747b(r4)
            androidx.paging.LoadType r12 = androidx.paging.LoadType.REFRESH
            Key r2 = r5.f6170h
            dl4$a r12 = r5.mo8686u(r12, r2)
            dl4<Key, Value> r2 = r5.f6171i
            r0.L$0 = r5
            r0.L$1 = r4
            r6 = 3
            r0.label = r6
            java.lang.Object r12 = r2.mo8656f(r12, r0)
            if (r12 != r1) goto L_0x0131
            return r1
        L_0x0131:
            r7 = r5
        L_0x0132:
            r6 = r12
            dl4$b r6 = (p000.dl4.C2176b) r6
            boolean r12 = r6 instanceof p000.dl4.C2176b.C2178b
            if (r12 == 0) goto L_0x026e
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r7.f6167e
            y04 r2 = r5.f6204a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r2
            r12 = 4
            r0.label = r12
            java.lang.Object r12 = r2.mo55746a(r4, r0)
            if (r12 != r1) goto L_0x0151
            return r1
        L_0x0151:
            androidx.paging.PageFetcherSnapshotState r12 = r5.f6205b     // Catch:{ all -> 0x0269 }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0269 }
            r8 = r6
            dl4$b$b r8 = (p000.dl4.C2176b.C2178b) r8     // Catch:{ all -> 0x0269 }
            boolean r12 = r12.mo8706r(r3, r5, r8)     // Catch:{ all -> 0x0269 }
            java.lang.Boolean r12 = p000.a40.m31670a(r12)     // Catch:{ all -> 0x0269 }
            r2.mo55747b(r4)
            boolean r2 = r12.booleanValue()
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r7.f6167e
            y04 r3 = r5.f6204a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r3
            r0.Z$0 = r2
            r12 = 5
            r0.label = r12
            java.lang.Object r12 = r3.mo55746a(r4, r0)
            if (r12 != r1) goto L_0x0183
            return r1
        L_0x0183:
            androidx.paging.PageFetcherSnapshotState r12 = r5.f6205b     // Catch:{ all -> 0x0264 }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0264 }
            xi3$c$a r8 = p000.xi3.C3605c.f19851d     // Catch:{ all -> 0x0264 }
            xi3$c r9 = r8.mo27759b()     // Catch:{ all -> 0x0264 }
            r12.mo8709u(r5, r9)     // Catch:{ all -> 0x0264 }
            r5 = r6
            dl4$b$b r5 = (p000.dl4.C2176b.C2178b) r5     // Catch:{ all -> 0x0264 }
            java.lang.Object r5 = r5.mo18826e()     // Catch:{ all -> 0x0264 }
            if (r5 != 0) goto L_0x01a4
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND     // Catch:{ all -> 0x0264 }
            xi3$c r9 = r8.mo27758a()     // Catch:{ all -> 0x0264 }
            r12.mo8709u(r5, r9)     // Catch:{ all -> 0x0264 }
        L_0x01a4:
            r5 = r6
            dl4$b$b r5 = (p000.dl4.C2176b.C2178b) r5     // Catch:{ all -> 0x0264 }
            java.lang.Object r5 = r5.mo18825d()     // Catch:{ all -> 0x0264 }
            if (r5 != 0) goto L_0x01b6
            androidx.paging.LoadType r5 = androidx.paging.LoadType.APPEND     // Catch:{ all -> 0x0264 }
            xi3$c r8 = r8.mo27758a()     // Catch:{ all -> 0x0264 }
            r12.mo8709u(r5, r8)     // Catch:{ all -> 0x0264 }
        L_0x01b6:
            r37 r12 = p000.r37.f33317a     // Catch:{ all -> 0x0264 }
            r3.mo55747b(r4)
            if (r2 == 0) goto L_0x0205
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r3 = r7.f6167e
            y04 r12 = r3.f6204a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r3
            r0.L$3 = r12
            r2 = 6
            r0.label = r2
            java.lang.Object r2 = r12.mo55746a(r4, r0)
            if (r2 != r1) goto L_0x01d5
            return r1
        L_0x01d5:
            r2 = r12
            r5 = r6
            r6 = r7
        L_0x01d8:
            androidx.paging.PageFetcherSnapshotState r12 = r3.f6205b     // Catch:{ all -> 0x0075 }
            fd0<vk4<Value>> r3 = r6.f6166d     // Catch:{ all -> 0x0075 }
            r7 = r5
            dl4$b$b r7 = (p000.dl4.C2176b.C2178b) r7     // Catch:{ all -> 0x0075 }
            androidx.paging.LoadType r8 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0075 }
            vk4 r12 = r12.mo8710v(r7, r8)     // Catch:{ all -> 0x0075 }
            r0.L$0 = r6     // Catch:{ all -> 0x0075 }
            r0.L$1 = r5     // Catch:{ all -> 0x0075 }
            r0.L$2 = r2     // Catch:{ all -> 0x0075 }
            r0.L$3 = r4     // Catch:{ all -> 0x0075 }
            r7 = 7
            r0.label = r7     // Catch:{ all -> 0x0075 }
            java.lang.Object r12 = r3.mo26027u(r12, r0)     // Catch:{ all -> 0x0075 }
            if (r12 != r1) goto L_0x01f9
            return r1
        L_0x01f9:
            r3 = r5
            r5 = r6
        L_0x01fb:
            r37 r12 = p000.r37.f33317a     // Catch:{ all -> 0x0075 }
            r2.mo55747b(r4)
            goto L_0x0207
        L_0x0201:
            r2.mo55747b(r4)
            throw r12
        L_0x0205:
            r3 = r6
            r5 = r7
        L_0x0207:
            uc5<Key, Value> r12 = r5.f6175m
            if (r12 == 0) goto L_0x02cb
            r12 = r3
            dl4$b$b r12 = (p000.dl4.C2176b.C2178b) r12
            java.lang.Object r2 = r12.mo18826e()
            if (r2 == 0) goto L_0x021a
            java.lang.Object r12 = r12.mo18825d()
            if (r12 != 0) goto L_0x02cb
        L_0x021a:
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r2 = r5.f6167e
            y04 r12 = r2.f6204a
            r0.L$0 = r5
            r0.L$1 = r3
            r0.L$2 = r2
            r0.L$3 = r12
            r6 = 8
            r0.label = r6
            java.lang.Object r0 = r12.mo55746a(r4, r0)
            if (r0 != r1) goto L_0x0233
            return r1
        L_0x0233:
            r1 = r12
            r0 = r5
        L_0x0235:
            androidx.paging.PageFetcherSnapshotState r12 = r2.f6205b     // Catch:{ all -> 0x025f }
            gf7$a r2 = r0.f6164b     // Catch:{ all -> 0x025f }
            fl4 r12 = r12.mo8695g(r2)     // Catch:{ all -> 0x025f }
            r1.mo55747b(r4)
            dl4$b$b r3 = (p000.dl4.C2176b.C2178b) r3
            java.lang.Object r1 = r3.mo18826e()
            if (r1 != 0) goto L_0x0251
            uc5<Key, Value> r1 = r0.f6175m
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            r1.mo26731a(r2, r12)
        L_0x0251:
            java.lang.Object r1 = r3.mo18825d()
            if (r1 != 0) goto L_0x02cb
            uc5<Key, Value> r0 = r0.f6175m
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            r0.mo26731a(r1, r12)
            goto L_0x02cb
        L_0x025f:
            r12 = move-exception
            r1.mo55747b(r4)
            throw r12
        L_0x0264:
            r12 = move-exception
            r3.mo55747b(r4)
            throw r12
        L_0x0269:
            r12 = move-exception
            r2.mo55747b(r4)
            throw r12
        L_0x026e:
            boolean r12 = r6 instanceof p000.dl4.C2176b.C2177a
            if (r12 == 0) goto L_0x02cb
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r7.f6167e
            y04 r12 = r5.f6204a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r12
            r2 = 9
            r0.label = r2
            java.lang.Object r2 = r12.mo55746a(r4, r0)
            if (r2 != r1) goto L_0x028b
            return r1
        L_0x028b:
            androidx.paging.PageFetcherSnapshotState r2 = r5.f6205b     // Catch:{ all -> 0x02c3 }
            xi3$a r5 = new xi3$a     // Catch:{ all -> 0x02c3 }
            dl4$b$a r6 = (p000.dl4.C2176b.C2177a) r6     // Catch:{ all -> 0x02c3 }
            java.lang.Throwable r6 = r6.mo18818a()     // Catch:{ all -> 0x02c3 }
            r5.<init>(r6)     // Catch:{ all -> 0x02c3 }
            androidx.paging.LoadType r6 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x02c3 }
            boolean r2 = r2.mo8709u(r6, r5)     // Catch:{ all -> 0x02c3 }
            if (r2 == 0) goto L_0x02bc
            fd0<vk4<Value>> r2 = r7.f6166d     // Catch:{ all -> 0x02c3 }
            vk4$c r7 = new vk4$c     // Catch:{ all -> 0x02c3 }
            r7.<init>(r6, r3, r5)     // Catch:{ all -> 0x02c3 }
            r0.L$0 = r12     // Catch:{ all -> 0x02c3 }
            r0.L$1 = r4     // Catch:{ all -> 0x02c3 }
            r0.L$2 = r4     // Catch:{ all -> 0x02c3 }
            r0.L$3 = r4     // Catch:{ all -> 0x02c3 }
            r3 = 10
            r0.label = r3     // Catch:{ all -> 0x02c3 }
            java.lang.Object r0 = r2.mo26027u(r7, r0)     // Catch:{ all -> 0x02c3 }
            if (r0 != r1) goto L_0x02bc
            return r1
        L_0x02bc:
            r0 = r12
        L_0x02bd:
            r37 r12 = p000.r37.f33317a     // Catch:{ all -> 0x0036 }
            r0.mo55747b(r4)
            goto L_0x02cb
        L_0x02c3:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x02c7:
            r0.mo55747b(r4)
            throw r12
        L_0x02cb:
            r37 r12 = p000.r37.f33317a
            return r12
        L_0x02ce:
            r2.mo55747b(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.mo8681p(ns0):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: dl4$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: vk4$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v82, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: y04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: y04} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03a7, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a8, code lost:
        r2 = ((p000.dl4.C2176b.C2178b) r6).mo18826e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03b6, code lost:
        if (r9.f6171i.mo18810c() != false) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c0, code lost:
        if ((!p000.vx2.m53586b(r2, r10.element)) == false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c3, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03c5, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c6, code lost:
        if (r2 != false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03ca, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03cc, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03cf, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0400, code lost:
        throw new java.lang.IllegalStateException(kotlin.text.StringsKt__IndentKt.m63059h("The same value, " + r10.element + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", (java.lang.String) null, 1, (java.lang.Object) null).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0401, code lost:
        r2 = r9.f6167e;
        r14 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r2);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r11;
        r3.L$4 = r10;
        r3.L$5 = r0;
        r3.L$6 = r8;
        r3.L$7 = r6;
        r3.L$8 = r2;
        r3.L$9 = r14;
        r3.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0423, code lost:
        if (r14.mo55746a((java.lang.Object) null, r3) != r4) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0425, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0426, code lost:
        r5 = r2;
        r16 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r2 = p000.a40.m31670a(androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5).mo8706r(r12.mo12043a(), r13, (p000.dl4.C2176b.C2178b) r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x043f, code lost:
        r14.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0447, code lost:
        if (r2.booleanValue() != false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x044b, code lost:
        r5 = (p000.dl4.C2176b.C2178b) r6;
        r11.element += r5.mo18822a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x045d, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0463, code lost:
        if (r5.mo18826e() == null) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x046a, code lost:
        if (r13 != androidx.paging.LoadType.APPEND) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0470, code lost:
        if (r5.mo18825d() != null) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0473, code lost:
        r9.element = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0475, code lost:
        r16 = r9;
        r9 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x047d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x047e, code lost:
        r14.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0482, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0485, code lost:
        if ((r6 instanceof p000.dl4.C2176b.C2177a) == false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0487, code lost:
        r5 = r9.f6167e;
        r0 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r5);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r6;
        r3.L$4 = r5;
        r3.L$5 = r0;
        r3.L$6 = null;
        r3.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04a3, code lost:
        if (r0.mo55746a((java.lang.Object) null, r3) != r4) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04a5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a6, code lost:
        r2 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r5 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r7 = new p000.xi3.C3603a(((p000.dl4.C2176b.C2177a) r6).mo18818a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04bd, code lost:
        if (r5.mo8709u(r3, r7) == false) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04bf, code lost:
        r6 = r9.f6166d;
        r8 = new p000.vk4.C3495c(r3, false, r7);
        r0.L$0 = r3;
        r0.L$1 = r12;
        r0.L$2 = r4;
        r0.L$3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r0.L$4 = null;
        r0.L$5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04db, code lost:
        if (r6.mo26027u(r8, r0) != r2) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04dd, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04de, code lost:
        r0 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04e0, code lost:
        r12 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04e4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04e6, code lost:
        r5.mo8699k().put(r3, r12.mo12044b());
        r0 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04f3, code lost:
        r4.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04f9, code lost:
        return p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0508, code lost:
        if (p000.wk4.f19153e[r13.ordinal()] == 1) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x050a, code lost:
        r2 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x050d, code lost:
        r2 = androidx.paging.LoadType.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x050f, code lost:
        r15 = r9.f6167e;
        r5 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r15);
        r3.L$0 = r9;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r11;
        r3.L$4 = r10;
        r3.L$5 = r0;
        r3.L$6 = r8;
        r3.L$7 = r6;
        r3.L$8 = r2;
        r3.L$9 = r15;
        r3.L$10 = r5;
        r3.label = 8;
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0536, code lost:
        if (r5.mo55746a((java.lang.Object) null, r3) != r4) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0538, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0539, code lost:
        r14 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r6;
        r6 = r2;
        r2 = r5;
        r5 = r15;
        r15 = r13;
        r13 = r11;
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r0 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r5 = r0.mo8697i(r6, r14.mo12044b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0550, code lost:
        if (r5 == 0) goto L_0x058f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0552, code lost:
        r0.mo8696h(r5);
        r6 = r9.f6166d;
        r3.L$0 = r9;
        r3.L$1 = r15;
        r3.L$2 = r14;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r10;
        r3.L$7 = r8;
        r3.L$8 = r2;
        r3.L$9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x056b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x056c, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r3.L$10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r3.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0576, code lost:
        if (r6.mo26027u(r5, r3) != r4) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0578, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0579, code lost:
        r5 = r2;
        r6 = r8;
        r8 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0582, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r1 = p000.r37.f33317a;
        r9 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x058f, code lost:
        r5 = r2;
        r6 = r8;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0592, code lost:
        r1 = r9.mo8687v(r0, r15, r14.mo12043a(), r14.mo12045c(r15) + r13.element);
        r12.element = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05a3, code lost:
        if (r1 != null) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05af, code lost:
        if ((r0.mo8704p().mo28080d(r15) instanceof p000.xi3.C3603a) != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05b3, code lost:
        if (r11.element == false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05b5, code lost:
        r1 = p000.xi3.C3605c.f19851d.mo27758a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05bc, code lost:
        r1 = p000.xi3.C3605c.f19851d.mo27759b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        r1 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05c2, code lost:
        r0.mo8709u(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05c5, code lost:
        r0 = r0.mo8710v((p000.dl4.C2176b.C2178b) r6, r15);
        r1 = r9.f6166d;
        r3.L$0 = r9;
        r3.L$1 = r15;
        r3.L$2 = r14;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r8;
        r3.L$7 = r6;
        r3.L$8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r3.L$9 = null;
        r3.L$10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05e7, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r3.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05ed, code lost:
        if (r1.mo26027u(r0, r3) != r4) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05ef, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05f0, code lost:
        r0 = r6;
        r6 = r8;
        r10 = r9;
        r8 = r14;
        r14 = r12;
        r16 = r13;
        r13 = r11;
        r11 = r15;
        r15 = r16;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05fb, code lost:
        r1 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05fd, code lost:
        r5.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0603, code lost:
        if ((r6 instanceof p000.dl4.C2171a.C2174c) == false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x060c, code lost:
        if (((p000.dl4.C2176b.C2178b) r0).mo18826e() != null) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x060e, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0610, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0613, code lost:
        if ((r6 instanceof p000.dl4.C2171a.C2172a) == false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x061b, code lost:
        if (((p000.dl4.C2176b.C2178b) r0).mo18825d() != null) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x061d, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x061f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0622, code lost:
        if (r10.f6175m == null) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0624, code lost:
        if (r5 != 0) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0626, code lost:
        if (r0 == 0) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0628, code lost:
        r12 = r10.f6167e;
        r6 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r12);
        r3.L$0 = r10;
        r3.L$1 = r11;
        r3.L$2 = r8;
        r3.L$3 = r15;
        r3.L$4 = r14;
        r3.L$5 = r13;
        r3.L$6 = r12;
        r3.L$7 = r6;
        r3.L$8 = null;
        r3.I$0 = r5;
        r3.I$1 = r0;
        r3.label = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x064d, code lost:
        if (r6.mo55746a((java.lang.Object) null, r3) != r4) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x064f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r1 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r12).mo8695g(r10.f6164b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x065e, code lost:
        if (r5 == 0) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0660, code lost:
        r10.f6175m.mo26731a(androidx.paging.LoadType.PREPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0667, code lost:
        if (r0 == 0) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0669, code lost:
        r10.f6175m.mo26731a(androidx.paging.LoadType.APPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0670, code lost:
        r12 = r10;
        r0 = r13;
        r2 = r14;
        r9 = r15;
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0676, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0677, code lost:
        r6.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x067b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x067c, code lost:
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0680, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0681, code lost:
        r1 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0683, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0684, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0108, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x068d, code lost:
        return p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x068e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x068f, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0696, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0697, code lost:
        r2.mo55747b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x069b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0109, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015c, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r5);
        r10 = p000.wk4.f19151c[r0.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0239, code lost:
        if (r10 == 1) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x023c, code lost:
        if (r10 == 2) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x023e, code lost:
        if (r10 == 3) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0247, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0248, code lost:
        r10 = (r5.mo8700l() + r9.mo12044b().mo20565b()) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0257, code lost:
        if (r10 >= 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0259, code lost:
        r8.element += r11.f6172j.f8178a * (-r10);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0265, code lost:
        r12 = p000.ck0.m33064l(r5.mo8701m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026d, code lost:
        if (r10 > r12) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026f, code lost:
        r8.element += ((p000.dl4.C2176b.C2178b) r5.mo8701m().get(r10)).mo18822a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0286, code lost:
        if (r10 == r12) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0288, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x028b, code lost:
        r10 = (r5.mo8700l() + r9.mo12044b().mo20564a()) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02a2, code lost:
        if (r10 <= p000.ck0.m33064l(r5.mo8701m())) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02a4, code lost:
        r8.element += r11.f6172j.f8178a * (r10 - p000.ck0.m33064l(r5.mo8701m()));
        r10 = p000.ck0.m33064l(r5.mo8701m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02bf, code lost:
        if (r10 < 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02c1, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02c2, code lost:
        r8.element += ((p000.dl4.C2176b.C2178b) r5.mo8701m().get(r12)).mo18822a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02d9, code lost:
        if (r12 == r10) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02db, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02de, code lost:
        r5 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02e0, code lost:
        r2.mo55747b((java.lang.Object) null);
        r2 = new kotlin.jvm.internal.Ref$ObjectRef();
        r5 = r11.f6167e;
        r10 = androidx.paging.PageFetcherSnapshotState.C1180a.m8487a(r5);
        r3.L$0 = r11;
        r3.L$1 = r0;
        r3.L$2 = r9;
        r3.L$3 = r8;
        r3.L$4 = r2;
        r3.L$5 = r5;
        r3.L$6 = r10;
        r3.L$7 = r2;
        r3.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0307, code lost:
        if (r10.mo55746a((java.lang.Object) null, r3) != r4) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0309, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x030a, code lost:
        r12 = r11;
        r11 = r0;
        r0 = r2;
        r16 = r8;
        r8 = r5;
        r5 = r10;
        r10 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r8 = androidx.paging.PageFetcherSnapshotState.C1180a.m8488b(r8);
        r13 = r12.mo8687v(r8, r11, r10.mo12043a(), r10.mo12045c(r11) + r9.element);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0327, code lost:
        if (r13 == null) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0329, code lost:
        r3.L$0 = r12;
        r3.L$1 = r11;
        r3.L$2 = r10;
        r3.L$3 = r9;
        r3.L$4 = r2;
        r3.L$5 = r5;
        r3.L$6 = r13;
        r3.L$7 = r0;
        r3.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x033f, code lost:
        if (r12.mo8689x(r8, r11, r3) != r4) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0341, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0342, code lost:
        r8 = r2;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0344, code lost:
        r5 = r6;
        r2 = r8;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0348, code lost:
        r6 = null;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x034a, code lost:
        r5.mo55747b(r6);
        r0.element = r13;
        r0 = new kotlin.jvm.internal.Ref$BooleanRef();
        r0.element = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0357, code lost:
        r5 = r2.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0359, code lost:
        if (r5 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x035b, code lost:
        r5 = r12.mo8686u(r11, r5);
        r6 = r12.f6171i;
        r3.L$0 = r12;
        r3.L$1 = r11;
        r3.L$2 = r10;
        r3.L$3 = r9;
        r3.L$4 = r2;
        r3.L$5 = r0;
        r3.L$6 = r5;
        r3.L$7 = null;
        r3.L$8 = null;
        r3.label = 4;
        r6 = r6.mo8656f(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x037b, code lost:
        if (r6 != r4) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x037d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x037e, code lost:
        r8 = r5;
        r13 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r10;
        r10 = r2;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0385, code lost:
        r6 = (p000.dl4.C2176b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x038a, code lost:
        if ((r6 instanceof p000.dl4.C2176b.C2178b) == false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x038c, code lost:
        r2 = p000.wk4.f19152d[r13.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0395, code lost:
        if (r2 == 1) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0398, code lost:
        if (r2 != 2) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x039a, code lost:
        r2 = ((p000.dl4.C2176b.C2178b) r6).mo18825d();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:22:0x0103, B:149:0x04d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo8682q(androidx.paging.LoadType r18, p000.cf2 r19, p000.ns0<? super p000.r37> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.paging.PageFetcherSnapshot$doLoad$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = (androidx.paging.PageFetcherSnapshot$doLoad$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = new androidx.paging.PageFetcherSnapshot$doLoad$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            r6 = 3
            java.lang.String r7 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r5) {
                case 0: goto L_0x01f8;
                case 1: goto L_0x01da;
                case 2: goto L_0x01b0;
                case 3: goto L_0x0188;
                case 4: goto L_0x0160;
                case 5: goto L_0x012e;
                case 6: goto L_0x010c;
                case 7: goto L_0x00f3;
                case 8: goto L_0x00c1;
                case 9: goto L_0x0090;
                case 10: goto L_0x005d;
                case 11: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            int r0 = r3.I$1
            int r5 = r3.I$0
            java.lang.Object r6 = r3.L$7
            y04 r6 = (p000.y04) r6
            java.lang.Object r12 = r3.L$6
            androidx.paging.PageFetcherSnapshotState$a r12 = (androidx.paging.PageFetcherSnapshotState.C1180a) r12
            java.lang.Object r13 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r13 = (kotlin.jvm.internal.Ref$BooleanRef) r13
            java.lang.Object r14 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref$ObjectRef) r14
            java.lang.Object r15 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r15 = (kotlin.jvm.internal.Ref$IntRef) r15
            java.lang.Object r8 = r3.L$2
            cf2 r8 = (p000.cf2) r8
            java.lang.Object r11 = r3.L$1
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r10 = r3.L$0
            androidx.paging.PageFetcherSnapshot r10 = (androidx.paging.PageFetcherSnapshot) r10
            p000.hg5.m45199b(r2)
            goto L_0x0650
        L_0x005d:
            java.lang.Object r0 = r3.L$8
            r5 = r0
            y04 r5 = (p000.y04) r5
            java.lang.Object r0 = r3.L$7
            dl4$b r0 = (p000.dl4.C2176b) r0
            java.lang.Object r6 = r3.L$6
            dl4$a r6 = (p000.dl4.C2171a) r6
            java.lang.Object r8 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref$BooleanRef) r8
            java.lang.Object r10 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            java.lang.Object r12 = r3.L$2
            cf2 r12 = (p000.cf2) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            p000.hg5.m45199b(r2)     // Catch:{ all -> 0x00bd }
            r15 = r11
            r11 = r13
            r13 = r8
            r8 = r12
            r16 = r14
            r14 = r10
            r10 = r16
            goto L_0x05fb
        L_0x0090:
            java.lang.Object r0 = r3.L$9
            androidx.paging.PageFetcherSnapshotState r0 = (androidx.paging.PageFetcherSnapshotState) r0
            java.lang.Object r5 = r3.L$8
            y04 r5 = (p000.y04) r5
            java.lang.Object r6 = r3.L$7
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r8 = r3.L$6
            dl4$a r8 = (p000.dl4.C2171a) r8
            java.lang.Object r10 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r10 = (kotlin.jvm.internal.Ref$BooleanRef) r10
            java.lang.Object r11 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref$ObjectRef) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r12 = (kotlin.jvm.internal.Ref$IntRef) r12
            java.lang.Object r13 = r3.L$2
            cf2 r13 = (p000.cf2) r13
            java.lang.Object r14 = r3.L$1
            androidx.paging.LoadType r14 = (androidx.paging.LoadType) r14
            java.lang.Object r15 = r3.L$0
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            p000.hg5.m45199b(r2)     // Catch:{ all -> 0x00bd }
            goto L_0x0582
        L_0x00bd:
            r0 = move-exception
        L_0x00be:
            r1 = 0
            goto L_0x0687
        L_0x00c1:
            java.lang.Object r0 = r3.L$10
            y04 r0 = (p000.y04) r0
            java.lang.Object r5 = r3.L$9
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r3.L$8
            androidx.paging.LoadType r6 = (androidx.paging.LoadType) r6
            java.lang.Object r8 = r3.L$7
            dl4$b r8 = (p000.dl4.C2176b) r8
            java.lang.Object r10 = r3.L$6
            dl4$a r10 = (p000.dl4.C2171a) r10
            java.lang.Object r11 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r11 = (kotlin.jvm.internal.Ref$BooleanRef) r11
            java.lang.Object r12 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r13 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r13 = (kotlin.jvm.internal.Ref$IntRef) r13
            java.lang.Object r14 = r3.L$2
            cf2 r14 = (p000.cf2) r14
            java.lang.Object r15 = r3.L$1
            androidx.paging.LoadType r15 = (androidx.paging.LoadType) r15
            java.lang.Object r9 = r3.L$0
            androidx.paging.PageFetcherSnapshot r9 = (androidx.paging.PageFetcherSnapshot) r9
            p000.hg5.m45199b(r2)
            r2 = r0
            goto L_0x0544
        L_0x00f3:
            java.lang.Object r0 = r3.L$3
            androidx.paging.PageFetcherSnapshotState r0 = (androidx.paging.PageFetcherSnapshotState) r0
            java.lang.Object r4 = r3.L$2
            y04 r4 = (p000.y04) r4
            java.lang.Object r5 = r3.L$1
            cf2 r5 = (p000.cf2) r5
            java.lang.Object r3 = r3.L$0
            androidx.paging.LoadType r3 = (androidx.paging.LoadType) r3
            p000.hg5.m45199b(r2)     // Catch:{ all -> 0x0108 }
            goto L_0x04e0
        L_0x0108:
            r0 = move-exception
            r2 = 0
            goto L_0x04fa
        L_0x010c:
            java.lang.Object r0 = r3.L$5
            y04 r0 = (p000.y04) r0
            java.lang.Object r5 = r3.L$4
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r3.L$3
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r7 = r3.L$2
            cf2 r7 = (p000.cf2) r7
            java.lang.Object r8 = r3.L$1
            androidx.paging.LoadType r8 = (androidx.paging.LoadType) r8
            java.lang.Object r9 = r3.L$0
            androidx.paging.PageFetcherSnapshot r9 = (androidx.paging.PageFetcherSnapshot) r9
            p000.hg5.m45199b(r2)
            r2 = r4
            r12 = r7
            r4 = r0
            r0 = r3
            r3 = r8
            goto L_0x04aa
        L_0x012e:
            java.lang.Object r0 = r3.L$9
            y04 r0 = (p000.y04) r0
            java.lang.Object r5 = r3.L$8
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r6 = r3.L$7
            dl4$b r6 = (p000.dl4.C2176b) r6
            java.lang.Object r8 = r3.L$6
            dl4$a r8 = (p000.dl4.C2171a) r8
            java.lang.Object r9 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            java.lang.Object r12 = r3.L$2
            cf2 r12 = (p000.cf2) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            p000.hg5.m45199b(r2)
            r16 = r14
            r14 = r0
        L_0x015c:
            r0 = r16
            goto L_0x042c
        L_0x0160:
            java.lang.Object r0 = r3.L$6
            dl4$a r0 = (p000.dl4.C2171a) r0
            java.lang.Object r5 = r3.L$5
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            java.lang.Object r6 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r8 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref$IntRef) r8
            java.lang.Object r9 = r3.L$2
            cf2 r9 = (p000.cf2) r9
            java.lang.Object r10 = r3.L$1
            androidx.paging.LoadType r10 = (androidx.paging.LoadType) r10
            java.lang.Object r11 = r3.L$0
            androidx.paging.PageFetcherSnapshot r11 = (androidx.paging.PageFetcherSnapshot) r11
            p000.hg5.m45199b(r2)
            r12 = r9
            r13 = r10
            r9 = r11
            r10 = r6
            r11 = r8
            r8 = r0
            r0 = r5
            goto L_0x0385
        L_0x0188:
            java.lang.Object r0 = r3.L$7
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r5 = r3.L$6
            java.lang.Object r6 = r3.L$5
            y04 r6 = (p000.y04) r6
            java.lang.Object r8 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref$IntRef) r9
            java.lang.Object r10 = r3.L$2
            cf2 r10 = (p000.cf2) r10
            java.lang.Object r11 = r3.L$1
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r12 = r3.L$0
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            p000.hg5.m45199b(r2)     // Catch:{ all -> 0x01ac }
            r13 = r5
            goto L_0x0344
        L_0x01ac:
            r0 = move-exception
        L_0x01ad:
            r1 = 0
            goto L_0x0692
        L_0x01b0:
            java.lang.Object r0 = r3.L$7
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r5 = r3.L$6
            y04 r5 = (p000.y04) r5
            java.lang.Object r8 = r3.L$5
            androidx.paging.PageFetcherSnapshotState$a r8 = (androidx.paging.PageFetcherSnapshotState.C1180a) r8
            java.lang.Object r9 = r3.L$4
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref$IntRef) r10
            java.lang.Object r11 = r3.L$2
            cf2 r11 = (p000.cf2) r11
            java.lang.Object r12 = r3.L$1
            androidx.paging.LoadType r12 = (androidx.paging.LoadType) r12
            java.lang.Object r13 = r3.L$0
            androidx.paging.PageFetcherSnapshot r13 = (androidx.paging.PageFetcherSnapshot) r13
            p000.hg5.m45199b(r2)
            r2 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            goto L_0x0314
        L_0x01da:
            java.lang.Object r0 = r3.L$5
            y04 r0 = (p000.y04) r0
            java.lang.Object r5 = r3.L$4
            androidx.paging.PageFetcherSnapshotState$a r5 = (androidx.paging.PageFetcherSnapshotState.C1180a) r5
            java.lang.Object r8 = r3.L$3
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref$IntRef) r8
            java.lang.Object r9 = r3.L$2
            cf2 r9 = (p000.cf2) r9
            java.lang.Object r10 = r3.L$1
            androidx.paging.LoadType r10 = (androidx.paging.LoadType) r10
            java.lang.Object r11 = r3.L$0
            androidx.paging.PageFetcherSnapshot r11 = (androidx.paging.PageFetcherSnapshot) r11
            p000.hg5.m45199b(r2)
            r2 = r0
            r0 = r10
            goto L_0x022c
        L_0x01f8:
            p000.hg5.m45199b(r2)
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            if (r0 == r2) goto L_0x0201
            r2 = 1
            goto L_0x0202
        L_0x0201:
            r2 = 0
        L_0x0202:
            if (r2 == 0) goto L_0x069c
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            r2 = 0
            r8.element = r2
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r1.f6167e
            y04 r2 = r5.f6204a
            r3.L$0 = r1
            r3.L$1 = r0
            r9 = r19
            r3.L$2 = r9
            r3.L$3 = r8
            r3.L$4 = r5
            r3.L$5 = r2
            r10 = 1
            r3.label = r10
            r10 = 0
            java.lang.Object r11 = r2.mo55746a(r10, r3)
            if (r11 != r4) goto L_0x022b
            return r4
        L_0x022b:
            r11 = r1
        L_0x022c:
            androidx.paging.PageFetcherSnapshotState r5 = r5.f6205b     // Catch:{ all -> 0x0696 }
            int[] r10 = p000.wk4.f19151c     // Catch:{ all -> 0x0696 }
            int r12 = r0.ordinal()     // Catch:{ all -> 0x0696 }
            r10 = r10[r12]     // Catch:{ all -> 0x0696 }
            r12 = 1
            if (r10 == r12) goto L_0x028b
            r12 = 2
            if (r10 == r12) goto L_0x0248
            if (r10 == r6) goto L_0x0242
            goto L_0x02de
        L_0x0242:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0696 }
            r0.<init>(r7)     // Catch:{ all -> 0x0696 }
            throw r0     // Catch:{ all -> 0x0696 }
        L_0x0248:
            int r10 = r5.mo8700l()     // Catch:{ all -> 0x0696 }
            gf7 r12 = r9.mo12044b()     // Catch:{ all -> 0x0696 }
            int r12 = r12.mo20565b()     // Catch:{ all -> 0x0696 }
            int r10 = r10 + r12
            r12 = 1
            int r10 = r10 + r12
            if (r10 >= 0) goto L_0x0265
            int r12 = r8.element     // Catch:{ all -> 0x0696 }
            bl4 r13 = r11.f6172j     // Catch:{ all -> 0x0696 }
            int r13 = r13.f8178a     // Catch:{ all -> 0x0696 }
            int r10 = -r10
            int r13 = r13 * r10
            int r12 = r12 + r13
            r8.element = r12     // Catch:{ all -> 0x0696 }
            r10 = 0
        L_0x0265:
            java.util.List r12 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            int r12 = p000.ck0.m33064l(r12)     // Catch:{ all -> 0x0696 }
            if (r10 > r12) goto L_0x02de
        L_0x026f:
            int r13 = r8.element     // Catch:{ all -> 0x0696 }
            java.util.List r14 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            java.lang.Object r14 = r14.get(r10)     // Catch:{ all -> 0x0696 }
            dl4$b$b r14 = (p000.dl4.C2176b.C2178b) r14     // Catch:{ all -> 0x0696 }
            java.util.List r14 = r14.mo18822a()     // Catch:{ all -> 0x0696 }
            int r14 = r14.size()     // Catch:{ all -> 0x0696 }
            int r13 = r13 + r14
            r8.element = r13     // Catch:{ all -> 0x0696 }
            if (r10 == r12) goto L_0x02de
            int r10 = r10 + 1
            goto L_0x026f
        L_0x028b:
            int r10 = r5.mo8700l()     // Catch:{ all -> 0x0696 }
            gf7 r12 = r9.mo12044b()     // Catch:{ all -> 0x0696 }
            int r12 = r12.mo20564a()     // Catch:{ all -> 0x0696 }
            int r10 = r10 + r12
            r12 = 1
            int r10 = r10 - r12
            java.util.List r12 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            int r12 = p000.ck0.m33064l(r12)     // Catch:{ all -> 0x0696 }
            if (r10 <= r12) goto L_0x02bf
            int r12 = r8.element     // Catch:{ all -> 0x0696 }
            bl4 r13 = r11.f6172j     // Catch:{ all -> 0x0696 }
            int r13 = r13.f8178a     // Catch:{ all -> 0x0696 }
            java.util.List r14 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            int r14 = p000.ck0.m33064l(r14)     // Catch:{ all -> 0x0696 }
            int r10 = r10 - r14
            int r13 = r13 * r10
            int r12 = r12 + r13
            r8.element = r12     // Catch:{ all -> 0x0696 }
            java.util.List r10 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            int r10 = p000.ck0.m33064l(r10)     // Catch:{ all -> 0x0696 }
        L_0x02bf:
            if (r10 < 0) goto L_0x02de
            r12 = 0
        L_0x02c2:
            int r13 = r8.element     // Catch:{ all -> 0x0696 }
            java.util.List r14 = r5.mo8701m()     // Catch:{ all -> 0x0696 }
            java.lang.Object r14 = r14.get(r12)     // Catch:{ all -> 0x0696 }
            dl4$b$b r14 = (p000.dl4.C2176b.C2178b) r14     // Catch:{ all -> 0x0696 }
            java.util.List r14 = r14.mo18822a()     // Catch:{ all -> 0x0696 }
            int r14 = r14.size()     // Catch:{ all -> 0x0696 }
            int r13 = r13 + r14
            r8.element = r13     // Catch:{ all -> 0x0696 }
            if (r12 == r10) goto L_0x02de
            int r12 = r12 + 1
            goto L_0x02c2
        L_0x02de:
            r37 r5 = p000.r37.f33317a     // Catch:{ all -> 0x0696 }
            r5 = 0
            r2.mo55747b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r11.f6167e
            y04 r10 = r5.f6204a
            r3.L$0 = r11
            r3.L$1 = r0
            r3.L$2 = r9
            r3.L$3 = r8
            r3.L$4 = r2
            r3.L$5 = r5
            r3.L$6 = r10
            r3.L$7 = r2
            r12 = 2
            r3.label = r12
            r12 = 0
            java.lang.Object r13 = r10.mo55746a(r12, r3)
            if (r13 != r4) goto L_0x030a
            return r4
        L_0x030a:
            r12 = r11
            r11 = r0
            r0 = r2
            r16 = r8
            r8 = r5
            r5 = r10
            r10 = r9
            r9 = r16
        L_0x0314:
            androidx.paging.PageFetcherSnapshotState r8 = r8.f6205b     // Catch:{ all -> 0x068e }
            int r13 = r10.mo12043a()     // Catch:{ all -> 0x068e }
            int r14 = r10.mo12045c(r11)     // Catch:{ all -> 0x068e }
            int r15 = r9.element     // Catch:{ all -> 0x068e }
            int r14 = r14 + r15
            java.lang.Object r13 = r12.mo8687v(r8, r11, r13, r14)     // Catch:{ all -> 0x068e }
            if (r13 == 0) goto L_0x0348
            r3.L$0 = r12     // Catch:{ all -> 0x068e }
            r3.L$1 = r11     // Catch:{ all -> 0x068e }
            r3.L$2 = r10     // Catch:{ all -> 0x068e }
            r3.L$3 = r9     // Catch:{ all -> 0x068e }
            r3.L$4 = r2     // Catch:{ all -> 0x068e }
            r3.L$5 = r5     // Catch:{ all -> 0x068e }
            r3.L$6 = r13     // Catch:{ all -> 0x068e }
            r3.L$7 = r0     // Catch:{ all -> 0x068e }
            r3.label = r6     // Catch:{ all -> 0x068e }
            java.lang.Object r6 = r12.mo8689x(r8, r11, r3)     // Catch:{ all -> 0x068e }
            if (r6 != r4) goto L_0x0342
            return r4
        L_0x0342:
            r8 = r2
            r6 = r5
        L_0x0344:
            r5 = r6
            r2 = r8
            r6 = 0
            goto L_0x034a
        L_0x0348:
            r6 = 0
            r13 = 0
        L_0x034a:
            r5.mo55747b(r6)
            r0.element = r13
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r5 = 0
            r0.element = r5
        L_0x0357:
            T r5 = r2.element
            if (r5 == 0) goto L_0x068b
            dl4$a r5 = r12.mo8686u(r11, r5)
            dl4<Key, Value> r6 = r12.f6171i
            r3.L$0 = r12
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r9
            r3.L$4 = r2
            r3.L$5 = r0
            r3.L$6 = r5
            r8 = 0
            r3.L$7 = r8
            r3.L$8 = r8
            r8 = 4
            r3.label = r8
            java.lang.Object r6 = r6.mo8656f(r5, r3)
            if (r6 != r4) goto L_0x037e
            return r4
        L_0x037e:
            r8 = r5
            r13 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r2
            r2 = r6
        L_0x0385:
            r6 = r2
            dl4$b r6 = (p000.dl4.C2176b) r6
            boolean r2 = r6 instanceof p000.dl4.C2176b.C2178b
            if (r2 == 0) goto L_0x0483
            int[] r2 = p000.wk4.f19152d
            int r5 = r13.ordinal()
            r2 = r2[r5]
            r5 = 1
            if (r2 == r5) goto L_0x03a8
            r5 = 2
            if (r2 != r5) goto L_0x03a2
            r2 = r6
            dl4$b$b r2 = (p000.dl4.C2176b.C2178b) r2
            java.lang.Object r2 = r2.mo18825d()
            goto L_0x03b0
        L_0x03a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x03a8:
            r5 = 2
            r2 = r6
            dl4$b$b r2 = (p000.dl4.C2176b.C2178b) r2
            java.lang.Object r2 = r2.mo18826e()
        L_0x03b0:
            dl4<Key, Value> r14 = r9.f6171i
            boolean r14 = r14.mo18810c()
            if (r14 != 0) goto L_0x03c5
            T r14 = r10.element
            boolean r2 = p000.vx2.m53586b(r2, r14)
            r14 = 1
            r2 = r2 ^ r14
            if (r2 == 0) goto L_0x03c3
            goto L_0x03c5
        L_0x03c3:
            r2 = 0
            goto L_0x03c6
        L_0x03c5:
            r2 = 1
        L_0x03c6:
            if (r2 != 0) goto L_0x0401
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            if (r13 != r0) goto L_0x03cf
            java.lang.String r0 = "prevKey"
            goto L_0x03d1
        L_0x03cf:
            java.lang.String r0 = "nextKey"
        L_0x03d1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The same value, "
            r2.append(r3)
            T r3 = r10.element
            r2.append(r3)
            java.lang.String r3 = ", was passed as the "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1
            r3 = 0
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.m63059h(r0, r3, r2, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0401:
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r2 = r9.f6167e
            y04 r14 = r2.f6204a
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r0
            r3.L$6 = r8
            r3.L$7 = r6
            r3.L$8 = r2
            r3.L$9 = r14
            r15 = 5
            r3.label = r15
            r15 = 0
            java.lang.Object r5 = r14.mo55746a(r15, r3)
            if (r5 != r4) goto L_0x0426
            return r4
        L_0x0426:
            r5 = r2
            r16 = r9
            r9 = r0
            goto L_0x015c
        L_0x042c:
            androidx.paging.PageFetcherSnapshotState r2 = r5.f6205b     // Catch:{ all -> 0x047d }
            int r5 = r12.mo12043a()     // Catch:{ all -> 0x047d }
            r15 = r6
            dl4$b$b r15 = (p000.dl4.C2176b.C2178b) r15     // Catch:{ all -> 0x047d }
            boolean r2 = r2.mo8706r(r5, r13, r15)     // Catch:{ all -> 0x047d }
            java.lang.Boolean r2 = p000.a40.m31670a(r2)     // Catch:{ all -> 0x047d }
            r5 = 0
            r14.mo55747b(r5)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x044b
            goto L_0x068b
        L_0x044b:
            int r2 = r11.element
            r5 = r6
            dl4$b$b r5 = (p000.dl4.C2176b.C2178b) r5
            java.util.List r14 = r5.mo18822a()
            int r14 = r14.size()
            int r2 = r2 + r14
            r11.element = r2
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r13 != r2) goto L_0x0468
            java.lang.Object r2 = r5.mo18826e()
            if (r2 == 0) goto L_0x0466
            goto L_0x0468
        L_0x0466:
            r2 = 1
            goto L_0x0473
        L_0x0468:
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            if (r13 != r2) goto L_0x0475
            java.lang.Object r2 = r5.mo18825d()
            if (r2 != 0) goto L_0x0475
            goto L_0x0466
        L_0x0473:
            r9.element = r2
        L_0x0475:
            r14 = 0
            r16 = r9
            r9 = r0
            r0 = r16
            goto L_0x04ff
        L_0x047d:
            r0 = move-exception
            r2 = 0
            r14.mo55747b(r2)
            throw r0
        L_0x0483:
            boolean r2 = r6 instanceof p000.dl4.C2176b.C2177a
            if (r2 == 0) goto L_0x04fe
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r5 = r9.f6167e
            y04 r0 = r5.f6204a
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r6
            r3.L$4 = r5
            r3.L$5 = r0
            r2 = 0
            r3.L$6 = r2
            r7 = 6
            r3.label = r7
            java.lang.Object r7 = r0.mo55746a(r2, r3)
            if (r7 != r4) goto L_0x04a6
            return r4
        L_0x04a6:
            r2 = r4
            r4 = r0
            r0 = r3
            r3 = r13
        L_0x04aa:
            androidx.paging.PageFetcherSnapshotState r5 = r5.f6205b     // Catch:{ all -> 0x0108 }
            xi3$a r7 = new xi3$a     // Catch:{ all -> 0x0108 }
            dl4$b$a r6 = (p000.dl4.C2176b.C2177a) r6     // Catch:{ all -> 0x0108 }
            java.lang.Throwable r6 = r6.mo18818a()     // Catch:{ all -> 0x0108 }
            r7.<init>(r6)     // Catch:{ all -> 0x0108 }
            boolean r6 = r5.mo8709u(r3, r7)     // Catch:{ all -> 0x0108 }
            if (r6 == 0) goto L_0x04e6
            fd0<vk4<Value>> r6 = r9.f6166d     // Catch:{ all -> 0x0108 }
            vk4$c r8 = new vk4$c     // Catch:{ all -> 0x0108 }
            r14 = 0
            r8.<init>(r3, r14, r7)     // Catch:{ all -> 0x0108 }
            r0.L$0 = r3     // Catch:{ all -> 0x0108 }
            r0.L$1 = r12     // Catch:{ all -> 0x0108 }
            r0.L$2 = r4     // Catch:{ all -> 0x0108 }
            r0.L$3 = r5     // Catch:{ all -> 0x0108 }
            r7 = 0
            r0.L$4 = r7     // Catch:{ all -> 0x04e3 }
            r0.L$5 = r7     // Catch:{ all -> 0x04e3 }
            r7 = 7
            r0.label = r7     // Catch:{ all -> 0x0108 }
            java.lang.Object r0 = r6.mo26027u(r8, r0)     // Catch:{ all -> 0x0108 }
            if (r0 != r2) goto L_0x04de
            return r2
        L_0x04de:
            r0 = r5
            r5 = r12
        L_0x04e0:
            r12 = r5
            r5 = r0
            goto L_0x04e6
        L_0x04e3:
            r0 = move-exception
            r2 = r7
            goto L_0x04fa
        L_0x04e6:
            java.util.Map r0 = r5.mo8699k()     // Catch:{ all -> 0x0108 }
            gf7 r2 = r12.mo12044b()     // Catch:{ all -> 0x0108 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0108 }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0108 }
            r2 = 0
            r4.mo55747b(r2)
            r37 r0 = p000.r37.f33317a
            return r0
        L_0x04fa:
            r4.mo55747b(r2)
            throw r0
        L_0x04fe:
            r14 = 0
        L_0x04ff:
            int[] r2 = p000.wk4.f19153e
            int r5 = r13.ordinal()
            r2 = r2[r5]
            r5 = 1
            if (r2 == r5) goto L_0x050d
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            goto L_0x050f
        L_0x050d:
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
        L_0x050f:
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r15 = r9.f6167e
            y04 r5 = r15.f6204a
            r3.L$0 = r9
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r0
            r3.L$6 = r8
            r3.L$7 = r6
            r3.L$8 = r2
            r3.L$9 = r15
            r3.L$10 = r5
            r14 = 8
            r3.label = r14
            r18 = r0
            r14 = 0
            java.lang.Object r0 = r5.mo55746a(r14, r3)
            if (r0 != r4) goto L_0x0539
            return r4
        L_0x0539:
            r14 = r12
            r12 = r10
            r10 = r8
            r8 = r6
            r6 = r2
            r2 = r5
            r5 = r15
            r15 = r13
            r13 = r11
            r11 = r18
        L_0x0544:
            androidx.paging.PageFetcherSnapshotState r0 = r5.f6205b     // Catch:{ all -> 0x0683 }
            gf7 r5 = r14.mo12044b()     // Catch:{ all -> 0x0683 }
            vk4$a r5 = r0.mo8697i(r6, r5)     // Catch:{ all -> 0x0683 }
            if (r5 == 0) goto L_0x058f
            r0.mo8696h(r5)     // Catch:{ all -> 0x0683 }
            fd0<vk4<Value>> r6 = r9.f6166d     // Catch:{ all -> 0x0683 }
            r3.L$0 = r9     // Catch:{ all -> 0x0683 }
            r3.L$1 = r15     // Catch:{ all -> 0x0683 }
            r3.L$2 = r14     // Catch:{ all -> 0x0683 }
            r3.L$3 = r13     // Catch:{ all -> 0x0683 }
            r3.L$4 = r12     // Catch:{ all -> 0x0683 }
            r3.L$5 = r11     // Catch:{ all -> 0x0683 }
            r3.L$6 = r10     // Catch:{ all -> 0x0683 }
            r3.L$7 = r8     // Catch:{ all -> 0x0683 }
            r3.L$8 = r2     // Catch:{ all -> 0x0683 }
            r3.L$9 = r0     // Catch:{ all -> 0x0683 }
            r1 = 0
            r3.L$10 = r1     // Catch:{ all -> 0x058b }
            r1 = 9
            r3.label = r1     // Catch:{ all -> 0x0683 }
            java.lang.Object r1 = r6.mo26027u(r5, r3)     // Catch:{ all -> 0x0683 }
            if (r1 != r4) goto L_0x0579
            return r4
        L_0x0579:
            r5 = r2
            r6 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r9
        L_0x0582:
            r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x00bd }
            r9 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            goto L_0x0592
        L_0x058b:
            r0 = move-exception
            r5 = r2
            goto L_0x0687
        L_0x058f:
            r5 = r2
            r6 = r8
            r8 = r10
        L_0x0592:
            int r1 = r14.mo12043a()     // Catch:{ all -> 0x00bd }
            int r2 = r14.mo12045c(r15)     // Catch:{ all -> 0x00bd }
            int r10 = r13.element     // Catch:{ all -> 0x00bd }
            int r2 = r2 + r10
            java.lang.Object r1 = r9.mo8687v(r0, r15, r1, r2)     // Catch:{ all -> 0x00bd }
            r12.element = r1     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x05c5
            yi3 r1 = r0.mo8704p()     // Catch:{ all -> 0x00bd }
            xi3 r1 = r1.mo28080d(r15)     // Catch:{ all -> 0x00bd }
            boolean r1 = r1 instanceof p000.xi3.C3603a     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x05c5
            boolean r1 = r11.element     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x05bc
            xi3$c$a r1 = p000.xi3.C3605c.f19851d     // Catch:{ all -> 0x00bd }
            xi3$c r1 = r1.mo27758a()     // Catch:{ all -> 0x00bd }
            goto L_0x05c2
        L_0x05bc:
            xi3$c$a r1 = p000.xi3.C3605c.f19851d     // Catch:{ all -> 0x00bd }
            xi3$c r1 = r1.mo27759b()     // Catch:{ all -> 0x00bd }
        L_0x05c2:
            r0.mo8709u(r15, r1)     // Catch:{ all -> 0x00bd }
        L_0x05c5:
            r1 = r6
            dl4$b$b r1 = (p000.dl4.C2176b.C2178b) r1     // Catch:{ all -> 0x00bd }
            vk4 r0 = r0.mo8710v(r1, r15)     // Catch:{ all -> 0x00bd }
            fd0<vk4<Value>> r1 = r9.f6166d     // Catch:{ all -> 0x00bd }
            r3.L$0 = r9     // Catch:{ all -> 0x00bd }
            r3.L$1 = r15     // Catch:{ all -> 0x00bd }
            r3.L$2 = r14     // Catch:{ all -> 0x00bd }
            r3.L$3 = r13     // Catch:{ all -> 0x00bd }
            r3.L$4 = r12     // Catch:{ all -> 0x00bd }
            r3.L$5 = r11     // Catch:{ all -> 0x00bd }
            r3.L$6 = r8     // Catch:{ all -> 0x00bd }
            r3.L$7 = r6     // Catch:{ all -> 0x00bd }
            r3.L$8 = r5     // Catch:{ all -> 0x00bd }
            r2 = 0
            r3.L$9 = r2     // Catch:{ all -> 0x0680 }
            r3.L$10 = r2     // Catch:{ all -> 0x0680 }
            r2 = 10
            r3.label = r2     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r1.mo26027u(r0, r3)     // Catch:{ all -> 0x00bd }
            if (r0 != r4) goto L_0x05f0
            return r4
        L_0x05f0:
            r0 = r6
            r6 = r8
            r10 = r9
            r8 = r14
            r14 = r12
            r16 = r13
            r13 = r11
            r11 = r15
            r15 = r16
        L_0x05fb:
            r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x00bd }
            r1 = 0
            r5.mo55747b(r1)
            boolean r1 = r6 instanceof p000.dl4.C2171a.C2174c
            if (r1 == 0) goto L_0x0610
            r1 = r0
            dl4$b$b r1 = (p000.dl4.C2176b.C2178b) r1
            java.lang.Object r1 = r1.mo18826e()
            if (r1 != 0) goto L_0x0610
            r5 = 1
            goto L_0x0611
        L_0x0610:
            r5 = 0
        L_0x0611:
            boolean r1 = r6 instanceof p000.dl4.C2171a.C2172a
            if (r1 == 0) goto L_0x061f
            dl4$b$b r0 = (p000.dl4.C2176b.C2178b) r0
            java.lang.Object r0 = r0.mo18825d()
            if (r0 != 0) goto L_0x061f
            r0 = 1
            goto L_0x0620
        L_0x061f:
            r0 = 0
        L_0x0620:
            uc5<Key, Value> r1 = r10.f6175m
            if (r1 == 0) goto L_0x0670
            if (r5 != 0) goto L_0x0628
            if (r0 == 0) goto L_0x0670
        L_0x0628:
            androidx.paging.PageFetcherSnapshotState$a<Key, Value> r12 = r10.f6167e
            y04 r6 = r12.f6204a
            r3.L$0 = r10
            r3.L$1 = r11
            r3.L$2 = r8
            r3.L$3 = r15
            r3.L$4 = r14
            r3.L$5 = r13
            r3.L$6 = r12
            r3.L$7 = r6
            r1 = 0
            r3.L$8 = r1
            r3.I$0 = r5
            r3.I$1 = r0
            r2 = 11
            r3.label = r2
            java.lang.Object r2 = r6.mo55746a(r1, r3)
            if (r2 != r4) goto L_0x0650
            return r4
        L_0x0650:
            androidx.paging.PageFetcherSnapshotState r1 = r12.f6205b     // Catch:{ all -> 0x0676 }
            gf7$a r2 = r10.f6164b     // Catch:{ all -> 0x0676 }
            fl4 r1 = r1.mo8695g(r2)     // Catch:{ all -> 0x0676 }
            r2 = 0
            r6.mo55747b(r2)
            if (r5 == 0) goto L_0x0667
            uc5<Key, Value> r2 = r10.f6175m
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            r2.mo26731a(r5, r1)
        L_0x0667:
            if (r0 == 0) goto L_0x0670
            uc5<Key, Value> r0 = r10.f6175m
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            r0.mo26731a(r2, r1)
        L_0x0670:
            r12 = r10
            r0 = r13
            r2 = r14
            r9 = r15
            r10 = r8
            goto L_0x067c
        L_0x0676:
            r0 = move-exception
            r1 = 0
            r6.mo55747b(r1)
            throw r0
        L_0x067c:
            r1 = r17
            goto L_0x0357
        L_0x0680:
            r0 = move-exception
            r1 = r2
            goto L_0x0687
        L_0x0683:
            r0 = move-exception
            r5 = r2
            goto L_0x00be
        L_0x0687:
            r5.mo55747b(r1)
            throw r0
        L_0x068b:
            r37 r0 = p000.r37.f33317a
            return r0
        L_0x068e:
            r0 = move-exception
            r6 = r5
            goto L_0x01ad
        L_0x0692:
            r6.mo55747b(r1)
            throw r0
        L_0x0696:
            r0 = move-exception
            r1 = 0
            r2.mo55747b(r1)
            throw r0
        L_0x069c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.mo8682q(androidx.paging.LoadType, cf2, ns0):java.lang.Object");
    }

    /* renamed from: r */
    public final z42<vk4<Value>> mo8683r() {
        return this.f6169g;
    }

    /* renamed from: s */
    public final dl4<Key, Value> mo8684s() {
        return this.f6171i;
    }

    /* renamed from: t */
    public final uc5<Key, Value> mo8685t() {
        return this.f6175m;
    }

    /* renamed from: u */
    public final dl4.C2171a<Key> mo8686u(LoadType loadType, Key key) {
        int i;
        dl4.C2171a.C2173b bVar = dl4.C2171a.f10760c;
        if (loadType == LoadType.REFRESH) {
            i = this.f6172j.f8181d;
        } else {
            i = this.f6172j.f8178a;
        }
        return bVar.mo18817a(loadType, key, i, this.f6172j.f8180c);
    }

    /* renamed from: v */
    public final Key mo8687v(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.mo8698j(loadType) || (pageFetcherSnapshotState.mo8704p().mo28080d(loadType) instanceof xi3.C3603a) || i2 >= this.f6172j.f8179b) {
            return null;
        }
        if (loadType == LoadType.PREPEND) {
            return ((dl4.C2176b.C2178b) CollectionsKt___CollectionsKt.m47329Z(pageFetcherSnapshotState.mo8701m())).mo18826e();
        }
        return ((dl4.C2176b.C2178b) CollectionsKt___CollectionsKt.m47340k0(pageFetcherSnapshotState.mo8701m())).mo18825d();
    }

    /* renamed from: w */
    public final /* synthetic */ Object mo8688w(LoadType loadType, gf7 gf7, ns0<? super r37> ns0) {
        boolean z = true;
        if (wk4.f19150b[loadType.ordinal()] != 1) {
            if (gf7 == null) {
                z = false;
            }
            if (z) {
                this.f6163a.mo55645b(gf7);
            } else {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
        } else {
            Object p = mo8681p(ns0);
            if (p == wx2.m54101d()) {
                return p;
            }
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo8689x(androidx.paging.PageFetcherSnapshotState<Key, Value> r6, androidx.paging.LoadType r7, p000.ns0<? super p000.r37> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.paging.PageFetcherSnapshot$setLoading$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.paging.PageFetcherSnapshot$setLoading$1 r0 = (androidx.paging.PageFetcherSnapshot$setLoading$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$setLoading$1 r0 = new androidx.paging.PageFetcherSnapshot$setLoading$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r8)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p000.hg5.m45199b(r8)
            xi3$b r8 = p000.xi3.C3604b.f19848b
            boolean r6 = r6.mo8709u(r7, r8)
            if (r6 == 0) goto L_0x004d
            fd0<vk4<Value>> r6 = r5.f6166d
            vk4$c r2 = new vk4$c
            r4 = 0
            r2.<init>(r7, r4, r8)
            r0.label = r3
            java.lang.Object r6 = r6.mo26027u(r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.mo8689x(androidx.paging.PageFetcherSnapshotState, androidx.paging.LoadType, ns0):java.lang.Object");
    }

    /* renamed from: y */
    public final void mo8690y(hu0 hu0) {
        if (this.f6172j.f8183f != Integer.MIN_VALUE) {
            y23 unused = d50.m56748b(hu0, (CoroutineContext) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$1(this, (ns0) null), 3, (Object) null);
        }
        y23 unused2 = d50.m56748b(hu0, (CoroutineContext) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$2(this, (ns0) null), 3, (Object) null);
        y23 unused3 = d50.m56748b(hu0, (CoroutineContext) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$3(this, (ns0) null), 3, (Object) null);
    }
}
