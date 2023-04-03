package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0013\u0018B\u0007¢\u0006\u0004\b\"\u0010#J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007J(\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJM\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u0010\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH@ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u00020\u000b8\u0002X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010 \u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "Ly62;", "font", "Lfp4;", "platformFontLoader", "result", "", "forever", "Lr37;", "e", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "d", "(Ly62;Lfp4;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "Lkotlin/Function1;", "Lns0;", "block", "g", "(Ly62;Lfp4;ZLrc2;Lns0;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Lcm3;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "b", "Lcm3;", "resultCache", "Lx16;", "c", "Lx16;", "permanentCache", "Lck6;", "Lck6;", "cacheLock", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncTypefaceCache {

    /* renamed from: a */
    public final Object f2188a = C0457a.m3265b((Object) null);

    /* renamed from: b */
    public final cm3<C0458b, C0457a> f2189b = new cm3<>(16);

    /* renamed from: c */
    public final x16<C0458b, C0457a> f2190c = new x16<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d */
    public final ck6 f2191d = bk6.m11432a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b@\u0018\u00002\u00020\u0001B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0001\u0010\u0001\u0004\u0018\u00010\u0001ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "", "", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", "d", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "result", "e", "(Ljava/lang/Object;)Z", "isPermanentFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$a */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class C0457a {

        /* renamed from: a */
        public final Object f2192a;

        public /* synthetic */ C0457a(Object obj) {
            this.f2192a = obj;
        }

        /* renamed from: a */
        public static final /* synthetic */ C0457a m3264a(Object obj) {
            return new C0457a(obj);
        }

        /* renamed from: b */
        public static Object m3265b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        public static boolean m3266c(Object obj, Object obj2) {
            return (obj2 instanceof C0457a) && vx2.m53586b(obj, ((C0457a) obj2).mo4101g());
        }

        /* renamed from: d */
        public static int m3267d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: e */
        public static final boolean m3268e(Object obj) {
            return obj == null;
        }

        /* renamed from: f */
        public static String m3269f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m3266c(this.f2192a, obj);
        }

        /* renamed from: g */
        public final /* synthetic */ Object mo4101g() {
            return this.f2192a;
        }

        public int hashCode() {
            return m3267d(this.f2192a);
        }

        public String toString() {
            return m3269f(this.f2192a);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ly62;", "a", "Ly62;", "getFont", "()Ly62;", "font", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "loaderKey", "<init>", "(Ly62;Ljava/lang/Object;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$b */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class C0458b {

        /* renamed from: a */
        public final y62 f2193a;

        /* renamed from: b */
        public final Object f2194b;

        public C0458b(y62 y62, Object obj) {
            vx2.m53591g(y62, "font");
            this.f2193a = y62;
            this.f2194b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0458b)) {
                return false;
            }
            C0458b bVar = (C0458b) obj;
            return vx2.m53586b(this.f2193a, bVar.f2193a) && vx2.m53586b(this.f2194b, bVar.f2194b);
        }

        public int hashCode() {
            int hashCode = this.f2193a.hashCode() * 31;
            Object obj = this.f2194b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f2193a + ", loaderKey=" + this.f2194b + ')';
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m3260f(AsyncTypefaceCache asyncTypefaceCache, y62 y62, fp4 fp4, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.mo4098e(y62, fp4, obj, z);
    }

    /* renamed from: d */
    public final C0457a mo4097d(y62 y62, fp4 fp4) {
        C0457a d;
        vx2.m53591g(y62, "font");
        vx2.m53591g(fp4, "platformFontLoader");
        C0458b bVar = new C0458b(y62, fp4.mo4086b());
        synchronized (this.f2191d) {
            d = this.f2189b.mo12115d(bVar);
            if (d == null) {
                d = this.f2190c.mo27649b(bVar);
            }
        }
        return d;
    }

    /* renamed from: e */
    public final void mo4098e(y62 y62, fp4 fp4, Object obj, boolean z) {
        vx2.m53591g(y62, "font");
        vx2.m53591g(fp4, "platformFontLoader");
        C0458b bVar = new C0458b(y62, fp4.mo4086b());
        synchronized (this.f2191d) {
            if (obj == null) {
                try {
                    C0457a h = this.f2190c.mo27656h(bVar, C0457a.m3264a(this.f2188a));
                } catch (Throwable th) {
                    throw th;
                }
            } else if (z) {
                C0457a h2 = this.f2190c.mo27656h(bVar, C0457a.m3264a(C0457a.m3265b(obj)));
            } else {
                C0457a e = this.f2189b.mo12116e(bVar, C0457a.m3264a(C0457a.m3265b(obj)));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    public final java.lang.Object mo4099g(p000.y62 r6, p000.fp4 r7, boolean r8, p000.rc2<? super p000.ns0<java.lang.Object>, ? extends java.lang.Object> r9, p000.ns0<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.p004ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r6 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0458b) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache) r7
            p000.hg5.m45199b(r10)
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            p000.hg5.m45199b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            java.lang.Object r7 = r7.mo4086b()
            r10.<init>(r6, r7)
            ck6 r6 = r5.f2191d
            monitor-enter(r6)
            cm3<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f2189b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.mo12115d(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r7     // Catch:{ all -> 0x00b0 }
            if (r7 != 0) goto L_0x005c
            x16<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f2190c     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.mo27649b(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r7     // Catch:{ all -> 0x00b0 }
        L_0x005c:
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r7.mo4101g()     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            return r7
        L_0x0064:
            r37 r7 = p000.r37.f33317a     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x007a:
            ck6 r9 = r7.f2191d
            monitor-enter(r9)
            if (r10 != 0) goto L_0x008d
            x16<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r7.f2190c     // Catch:{ all -> 0x008b }
            java.lang.Object r7 = r7.f2188a     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3264a(r7)     // Catch:{ all -> 0x008b }
            r8.mo27656h(r6, r7)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x008b:
            r6 = move-exception
            goto L_0x00ae
        L_0x008d:
            if (r8 == 0) goto L_0x009d
            x16<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f2190c     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3265b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3264a(r8)     // Catch:{ all -> 0x008b }
            r7.mo27656h(r6, r8)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x009d:
            cm3<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f2189b     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3265b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3264a(r8)     // Catch:{ all -> 0x008b }
            r7.mo12116e(r6, r8)     // Catch:{ all -> 0x008b }
        L_0x00aa:
            r37 r6 = p000.r37.f33317a     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return r10
        L_0x00ae:
            monitor-exit(r9)
            throw r6
        L_0x00b0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncTypefaceCache.mo4099g(y62, fp4, boolean, rc2, ns0):java.lang.Object");
    }
}
