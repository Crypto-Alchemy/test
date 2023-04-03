package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.j */
public final class C4478j {

    /* renamed from: d */
    public static final pq7 f24748d = new pq7("ExtractorTaskFinder");

    /* renamed from: a */
    public final C4477i f24749a;

    /* renamed from: b */
    public final C4469b f24750b;

    /* renamed from: c */
    public final C4472d f24751c;

    public C4478j(C4477i iVar, C4469b bVar, C4472d dVar) {
        this.f24749a = iVar;
        this.f24750b = bVar;
        this.f24751c = dVar;
    }

    /* renamed from: c */
    public static boolean m36446c(jt7 jt7) {
        int i = jt7.f30613f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: hu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: hu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: fu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: fu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: uu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: uu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: uu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: fu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: hu7} */
    /* JADX WARNING: type inference failed for: r0v11, types: [ut7] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f24748d.mo46852a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f29725a), r4.f29727c.f28965a);
        r11 = r4.f29725a;
        r8 = r4.f29727c;
        r10 = new p000.hu7(r11, r8.f28965a, r4.f29726b, r8.f28966b);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ut7 mo34221a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.i r0 = r1.f24749a     // Catch:{ all -> 0x0384 }
            r0.mo34203a()     // Catch:{ all -> 0x0384 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0384 }
            r2.<init>()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.i r0 = r1.f24749a     // Catch:{ all -> 0x0384 }
            java.util.Map r0 = r0.mo34205c()     // Catch:{ all -> 0x0384 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0384 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0384 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0384 }
            ht7 r3 = (p000.ht7) r3     // Catch:{ all -> 0x0384 }
            ft7 r4 = r3.f29727c     // Catch:{ all -> 0x0384 }
            int r4 = r4.f28967c     // Catch:{ all -> 0x0384 }
            boolean r4 = p000.cu7.m43234f(r4)     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0384 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x037d
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            ht7 r4 = (p000.ht7) r4     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b r8 = r1.f24750b     // Catch:{ IOException -> 0x008d }
            ft7 r9 = r4.f29727c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f28965a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f29726b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f28966b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.mo34183y(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            ft7 r9 = r4.f29727c     // Catch:{ IOException -> 0x008d }
            java.util.List<jt7> r9 = r9.f28969e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            pq7 r0 = f24748d     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r9 = r4.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r8[r7] = r9     // Catch:{ all -> 0x0384 }
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f28965a     // Catch:{ all -> 0x0384 }
            r8[r6] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo46852a(r9, r8)     // Catch:{ all -> 0x0384 }
            hu7 r0 = new hu7     // Catch:{ all -> 0x0384 }
            int r11 = r4.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r8 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r8.f28965a     // Catch:{ all -> 0x0384 }
            int r13 = r4.f29726b     // Catch:{ all -> 0x0384 }
            long r14 = r8.f28966b     // Catch:{ all -> 0x0384 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x0384 }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.bj r2 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r5 = r4.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r3[r7] = r5     // Catch:{ all -> 0x0384 }
            ft7 r5 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f28965a     // Catch:{ all -> 0x0384 }
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0384 }
            int r4 = r4.f29725a     // Catch:{ all -> 0x0384 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0384 }
            throw r2     // Catch:{ all -> 0x0384 }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            ht7 r4 = (p000.ht7) r4     // Catch:{ all -> 0x0384 }
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            int r9 = r9.f28967c     // Catch:{ all -> 0x0384 }
            boolean r9 = p000.cu7.m43234f(r9)     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x00b3
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.util.List<jt7> r9 = r9.f28969e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0384 }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0384 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0384 }
            jt7 r10 = (p000.jt7) r10     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b r11 = r1.f24750b     // Catch:{ all -> 0x0384 }
            ft7 r12 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = r12.f28965a     // Catch:{ all -> 0x0384 }
            int r14 = r4.f29726b     // Catch:{ all -> 0x0384 }
            long r5 = r12.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r10.f30608a     // Catch:{ all -> 0x0384 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo34181w(r12, r13, r14, r16)     // Catch:{ all -> 0x0384 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0384 }
            if (r5 == 0) goto L_0x0134
            pq7 r0 = f24748d     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0384 }
            int r6 = r4.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0384 }
            r5[r7] = r6     // Catch:{ all -> 0x0384 }
            ft7 r6 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r6.f28965a     // Catch:{ all -> 0x0384 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r10.f30608a     // Catch:{ all -> 0x0384 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo46852a(r6, r5)     // Catch:{ all -> 0x0384 }
            fu7 r0 = new fu7     // Catch:{ all -> 0x0384 }
            int r5 = r4.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r6 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f28965a     // Catch:{ all -> 0x0384 }
            int r4 = r4.f29726b     // Catch:{ all -> 0x0384 }
            long r11 = r6.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r10.f30608a     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0384 }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            ht7 r4 = (p000.ht7) r4     // Catch:{ all -> 0x0384 }
            ft7 r5 = r4.f29727c     // Catch:{ all -> 0x0384 }
            int r5 = r5.f28967c     // Catch:{ all -> 0x0384 }
            boolean r5 = p000.cu7.m43234f(r5)     // Catch:{ all -> 0x0384 }
            if (r5 == 0) goto L_0x013e
            ft7 r5 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.util.List<jt7> r5 = r5.f28969e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0384 }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0384 }
            jt7 r6 = (p000.jt7) r6     // Catch:{ all -> 0x0384 }
            boolean r9 = r1.mo34222b(r4, r6)     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.b r10 = r1.f24750b     // Catch:{ all -> 0x0384 }
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r9.f28965a     // Catch:{ all -> 0x0384 }
            int r12 = r4.f29726b     // Catch:{ all -> 0x0384 }
            long r13 = r9.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r6.f30608a     // Catch:{ all -> 0x0384 }
            java.io.File r9 = r10.mo34180v(r11, r12, r13, r15)     // Catch:{ all -> 0x0384 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x015c
            pq7 r0 = f24748d     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0384 }
            int r9 = r4.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r5[r7] = r9     // Catch:{ all -> 0x0384 }
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f28965a     // Catch:{ all -> 0x0384 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f30608a     // Catch:{ all -> 0x0384 }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo46852a(r9, r5)     // Catch:{ all -> 0x0384 }
            uu7 r0 = new uu7     // Catch:{ all -> 0x0384 }
            int r5 = r4.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r9 = r4.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r10 = r9.f28965a     // Catch:{ all -> 0x0384 }
            int r4 = r4.f29726b     // Catch:{ all -> 0x0384 }
            long r11 = r9.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f30608a     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r6.f30609b     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0384 }
            goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x01ca:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0384 }
            r5 = 4
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0384 }
            r6 = r0
            ht7 r6 = (p000.ht7) r6     // Catch:{ all -> 0x0384 }
            ft7 r0 = r6.f29727c     // Catch:{ all -> 0x0384 }
            int r0 = r0.f28967c     // Catch:{ all -> 0x0384 }
            boolean r0 = p000.cu7.m43234f(r0)     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x01ca
            ft7 r0 = r6.f29727c     // Catch:{ all -> 0x0384 }
            java.util.List<jt7> r0 = r0.f28969e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0384 }
        L_0x01ea:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0384 }
            r10 = r0
            jt7 r10 = (p000.jt7) r10     // Catch:{ all -> 0x0384 }
            boolean r0 = m36446c(r10)     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x01ea
            com.google.android.play.core.assetpacks.n r0 = new com.google.android.play.core.assetpacks.n     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b r11 = r1.f24750b     // Catch:{ all -> 0x0384 }
            ft7 r12 = r6.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = r12.f28965a     // Catch:{ all -> 0x0384 }
            int r14 = r6.f29726b     // Catch:{ all -> 0x0384 }
            r16 = r4
            long r3 = r12.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r10.f30608a     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r3
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0384 }
            int r0 = r0.mo34237k()     // Catch:{ IOException -> 0x0221 }
            goto L_0x0230
        L_0x0221:
            r0 = move-exception
            r3 = r0
            pq7 r0 = f24748d     // Catch:{ all -> 0x0384 }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0384 }
            r11[r7] = r3     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo46853b(r3, r11)     // Catch:{ all -> 0x0384 }
            r0 = r7
        L_0x0230:
            r3 = -1
            if (r0 == r3) goto L_0x02ae
            java.util.List<dt7> r3 = r10.f30611d     // Catch:{ all -> 0x0384 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0384 }
            dt7 r3 = (p000.dt7) r3     // Catch:{ all -> 0x0384 }
            boolean r3 = r3.f28294a     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x02ae
            pq7 r3 = f24748d     // Catch:{ all -> 0x0384 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0384 }
            int r9 = r10.f30612e     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r4[r7] = r9     // Catch:{ all -> 0x0384 }
            int r9 = r6.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x0384 }
            ft7 r9 = r6.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f28965a     // Catch:{ all -> 0x0384 }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r10.f30608a     // Catch:{ all -> 0x0384 }
            r4[r8] = r9     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0384 }
            r4[r5] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo46852a(r9, r4)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.d r3 = r1.f24751c     // Catch:{ all -> 0x0384 }
            int r4 = r6.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r9 = r6.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f28965a     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r10.f30608a     // Catch:{ all -> 0x0384 }
            java.io.InputStream r32 = r3.mo34189a(r4, r9, r11, r0)     // Catch:{ all -> 0x0384 }
            os7 r3 = new os7     // Catch:{ all -> 0x0384 }
            int r4 = r6.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r9 = r6.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r9.f28965a     // Catch:{ all -> 0x0384 }
            int r12 = r6.f29726b     // Catch:{ all -> 0x0384 }
            long r13 = r9.f28966b     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r10.f30608a     // Catch:{ all -> 0x0384 }
            int r15 = r10.f30612e     // Catch:{ all -> 0x0384 }
            java.util.List<dt7> r10 = r10.f30611d     // Catch:{ all -> 0x0384 }
            int r28 = r10.size()     // Catch:{ all -> 0x0384 }
            ft7 r6 = r6.f29727c     // Catch:{ all -> 0x0384 }
            long r7 = r6.f28968d     // Catch:{ all -> 0x0384 }
            int r6 = r6.f28967c     // Catch:{ all -> 0x0384 }
            r19 = r3
            r20 = r4
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r9
            r26 = r15
            r27 = r0
            r29 = r7
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0384 }
            r15 = r3
            goto L_0x02b3
        L_0x02ae:
            r4 = r16
            goto L_0x01ea
        L_0x02b2:
            r15 = 0
        L_0x02b3:
            if (r15 != 0) goto L_0x0371
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x02b9:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r2 == 0) goto L_0x0366
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0384 }
            ht7 r2 = (p000.ht7) r2     // Catch:{ all -> 0x0384 }
            ft7 r3 = r2.f29727c     // Catch:{ all -> 0x0384 }
            int r3 = r3.f28967c     // Catch:{ all -> 0x0384 }
            boolean r3 = p000.cu7.m43234f(r3)     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x02b9
            ft7 r3 = r2.f29727c     // Catch:{ all -> 0x0384 }
            java.util.List<jt7> r3 = r3.f28969e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0384 }
        L_0x02d7:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x02b9
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0384 }
            jt7 r4 = (p000.jt7) r4     // Catch:{ all -> 0x0384 }
            boolean r6 = m36446c(r4)     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x02d7
            java.util.List<dt7> r6 = r4.f30611d     // Catch:{ all -> 0x0384 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0384 }
            dt7 r6 = (p000.dt7) r6     // Catch:{ all -> 0x0384 }
            boolean r6 = r6.f28294a     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x02d7
            boolean r6 = r1.mo34222b(r2, r4)     // Catch:{ all -> 0x0384 }
            if (r6 != 0) goto L_0x02d7
            pq7 r0 = f24748d     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r5 = r4.f30613f     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            int r5 = r2.f29725a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            ft7 r5 = r2.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f28965a     // Catch:{ all -> 0x0384 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r4.f30608a     // Catch:{ all -> 0x0384 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo46852a(r5, r3)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.d r0 = r1.f24751c     // Catch:{ all -> 0x0384 }
            int r3 = r2.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r5 = r2.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f28965a     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r4.f30608a     // Catch:{ all -> 0x0384 }
            r9 = 0
            java.io.InputStream r23 = r0.mo34189a(r3, r5, r6, r9)     // Catch:{ all -> 0x0384 }
            mu7 r0 = new mu7     // Catch:{ all -> 0x0384 }
            int r11 = r2.f29725a     // Catch:{ all -> 0x0384 }
            ft7 r3 = r2.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r3.f28965a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b r3 = r1.f24750b     // Catch:{ all -> 0x0384 }
            int r13 = r3.mo34159G(r12)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b r3 = r1.f24750b     // Catch:{ all -> 0x0384 }
            ft7 r5 = r2.f29727c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f28965a     // Catch:{ all -> 0x0384 }
            long r14 = r3.mo34160H(r5)     // Catch:{ all -> 0x0384 }
            int r3 = r2.f29726b     // Catch:{ all -> 0x0384 }
            ft7 r2 = r2.f29727c     // Catch:{ all -> 0x0384 }
            long r5 = r2.f28966b     // Catch:{ all -> 0x0384 }
            int r2 = r4.f30613f     // Catch:{ all -> 0x0384 }
            java.lang.String r7 = r4.f30608a     // Catch:{ all -> 0x0384 }
            long r8 = r4.f30610c     // Catch:{ all -> 0x0384 }
            r10 = r0
            r16 = r3
            r17 = r5
            r19 = r2
            r20 = r7
            r21 = r8
            r10.<init>(r11, r12, r13, r14, r16, r17, r19, r20, r21, r23)     // Catch:{ all -> 0x0384 }
            r15 = r0
            goto L_0x0367
        L_0x0366:
            r15 = 0
        L_0x0367:
            com.google.android.play.core.assetpacks.i r0 = r1.f24749a
            r0.mo34204b()
            if (r15 == 0) goto L_0x036f
            return r15
        L_0x036f:
            r2 = 0
            return r2
        L_0x0371:
            com.google.android.play.core.assetpacks.i r0 = r1.f24749a
            r0.mo34204b()
            return r15
        L_0x0377:
            com.google.android.play.core.assetpacks.i r2 = r1.f24749a
            r2.mo34204b()
            return r0
        L_0x037d:
            com.google.android.play.core.assetpacks.i r0 = r1.f24749a
            r0.mo34204b()
            r2 = 0
            return r2
        L_0x0384:
            r0 = move-exception
            com.google.android.play.core.assetpacks.i r2 = r1.f24749a
            r2.mo34204b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4478j.mo34221a():ut7");
    }

    /* renamed from: b */
    public final boolean mo34222b(ht7 ht7, jt7 jt7) {
        C4469b bVar = this.f24750b;
        ft7 ft7 = ht7.f29727c;
        return new C4482n(bVar, ft7.f28965a, ht7.f29726b, ft7.f28966b, jt7.f30608a).mo34238l();
    }
}
