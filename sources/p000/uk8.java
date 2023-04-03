package p000;

/* renamed from: uk8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class uk8<V> {

    /* renamed from: h */
    public static final Object f34617h = new Object();

    /* renamed from: a */
    public final String f34618a;

    /* renamed from: b */
    public final ok8<V> f34619b;

    /* renamed from: c */
    public final V f34620c;

    /* renamed from: d */
    public final V f34621d;

    /* renamed from: e */
    public final Object f34622e = new Object();

    /* renamed from: f */
    public volatile V f34623f = null;

    /* renamed from: g */
    public volatile V f34624g = null;

    public /* synthetic */ uk8(String str, Object obj, Object obj2, ok8 ok8, mk8 mk8) {
        this.f34618a = str;
        this.f34620c = obj;
        this.f34621d = obj2;
        this.f34619b = ok8;
    }

    /* renamed from: a */
    public final String mo48411a() {
        return this.f34618a;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    /* renamed from: b */
    public final V mo48412b(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f34622e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            rk9 r4 = p000.rk8.f33449a
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = f34617h
            monitor-enter(r4)
            boolean r0 = p000.rk9.m51151a()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f34624g     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f34620c     // Catch:{ all -> 0x0067 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f34624g     // Catch:{ all -> 0x0067 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            java.util.List r4 = p000.rl8.f33484a     // Catch:{ SecurityException -> 0x0055 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0055 }
        L_0x0028:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0055 }
            uk8 r0 = (p000.uk8) r0     // Catch:{ SecurityException -> 0x0055 }
            boolean r1 = p000.rk9.m51151a()     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x004d
            r1 = 0
            ok8<V> r2 = r0.f34619b     // Catch:{ IllegalStateException -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0043 }
        L_0x0043:
            java.lang.Object r2 = f34617h     // Catch:{ SecurityException -> 0x0055 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0055 }
            r0.f34624g = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0028
        L_0x004a:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x004d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0055 }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x0055:
            ok8<V> r4 = r3.f34619b
            if (r4 != 0) goto L_0x005c
            V r4 = r3.f34620c
            return r4
        L_0x005c:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0064, IllegalStateException -> 0x0061 }
            return r4
        L_0x0061:
            V r4 = r3.f34620c
            return r4
        L_0x0064:
            V r4 = r3.f34620c
            return r4
        L_0x0067:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            throw r0
        L_0x006a:
            V r4 = r3.f34620c
            return r4
        L_0x006d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uk8.mo48412b(java.lang.Object):java.lang.Object");
    }
}
