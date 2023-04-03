package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: kk9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class kk9 extends t49 {

    /* renamed from: d */
    public String f30910d;

    /* renamed from: e */
    public Set<Integer> f30911e;

    /* renamed from: f */
    public Map<Integer, wi9> f30912f;

    /* renamed from: g */
    public Long f30913g;

    /* renamed from: h */
    public Long f30914h;

    public kk9(s59 s59) {
        super(s59);
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0302, code lost:
        if (r5 != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x072e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x072f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0731, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0732, code lost:
        r29 = r2;
        r28 = r4;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0750, code lost:
        if (r11 != null) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x075b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x090a, code lost:
        if (r13 == null) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a36, code lost:
        if (r7 != false) goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r5 != null) goto L_0x014f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x072e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:239:0x067b] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a67  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0afb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0 A[Catch:{ SQLiteException -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01be A[SYNTHETIC, Splitter:B:65:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0249  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p000.mq8> mo44820j(java.lang.String r66, java.util.List<p000.wq8> r67, java.util.List<p000.it8> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            r65 = this;
            r10 = r65
            java.lang.String r11 = "current_results"
            p000.cu4.m43217g(r66)
            p000.cu4.m43221k(r67)
            p000.cu4.m43221k(r68)
            r0 = r66
            r10.f30910d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f30911e = r0
            lq r0 = new lq
            r0.<init>()
            r10.f30912f = r0
            r0 = r69
            r10.f30913g = r0
            r0 = r70
            r10.f30914h = r0
            java.util.Iterator r0 = r67.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            wq8 r1 = (p000.wq8) r1
            java.lang.String r1 = r1.mo49247B()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r12
        L_0x0048:
            p000.nd9.m48739a()
            kr8 r0 = r10.f34342a
            n68 r0 = r0.mo45274y()
            java.lang.String r2 = r10.f30910d
            uk8<java.lang.Boolean> r3 = p000.rl8.f33487b0
            boolean r14 = r0.mo45997v(r2, r3)
            p000.nd9.m48739a()
            kr8 r0 = r10.f34342a
            n68 r0 = r0.mo45274y()
            java.lang.String r2 = r10.f30910d
            uk8<java.lang.Boolean> r3 = p000.rl8.f33485a0
            boolean r15 = r0.mo45997v(r2, r3)
            if (r1 == 0) goto L_0x00af
            s59 r0 = r10.f33321b
            m78 r2 = r0.mo47651V()
            java.lang.String r3 = r10.f30910d
            r2.mo47982g()
            r2.mo29006e()
            p000.cu4.m43217g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo45660P()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29670l()
            java.lang.Object r3 = p000.bn8.m32664w(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.mo48771c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x017a
            if (r14 == 0) goto L_0x017a
            s59 r0 = r10.f33321b
            m78 r2 = r0.mo47651V()
            java.lang.String r3 = r10.f30910d
            p000.cu4.m43217g(r3)
            lq r4 = new lq
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.mo45660P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0155 }
            om8 r13 = p000.rm8.m51160K()     // Catch:{ IOException -> 0x012b }
            p79 r0 = p000.w59.m53712J(r13, r0)     // Catch:{ IOException -> 0x012b }
            om8 r0 = (p000.om8) r0     // Catch:{ IOException -> 0x012b }
            s49 r0 = r0.mo48885o()     // Catch:{ IOException -> 0x012b }
            rm8 r0 = (p000.rm8) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.mo47438E()     // Catch:{ SQLiteException -> 0x0155 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0155 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0155 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0155 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            kr8 r12 = r2.f34342a     // Catch:{ SQLiteException -> 0x0155 }
            bn8 r12 = r12.mo45237A()     // Catch:{ SQLiteException -> 0x0155 }
            vm8 r12 = r12.mo29670l()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r13 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x0155 }
            r12.mo48771c(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0155 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017b
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0155 }
        L_0x014f:
            r5.close()
            goto L_0x017a
        L_0x0153:
            r0 = move-exception
            goto L_0x0174
        L_0x0155:
            r0 = move-exception
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r5 = 0
            goto L_0x0174
        L_0x015a:
            r0 = move-exception
            r5 = 0
        L_0x015c:
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0153 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0153 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0153 }
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x0153 }
            r2.mo48771c(r8, r3, r0)     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0153 }
            if (r5 == 0) goto L_0x017a
            goto L_0x014f
        L_0x0174:
            if (r5 == 0) goto L_0x0179
            r5.close()
        L_0x0179:
            throw r0
        L_0x017a:
            r12 = r0
        L_0x017b:
            s59 r0 = r10.f33321b
            m78 r2 = r0.mo47651V()
            java.lang.String r3 = r10.f30910d
            r2.mo47982g()
            r2.mo29006e()
            p000.cu4.m43217g(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.mo45660P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0220 }
            if (r0 != 0) goto L_0x01be
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0220 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024d
        L_0x01be:
            lq r5 = new lq     // Catch:{ SQLiteException -> 0x0220 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0220 }
        L_0x01c3:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0220 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0220 }
            ys8 r13 = p000.at8.m31926I()     // Catch:{ IOException -> 0x01eb }
            p79 r0 = p000.w59.m53712J(r13, r0)     // Catch:{ IOException -> 0x01eb }
            ys8 r0 = (p000.ys8) r0     // Catch:{ IOException -> 0x01eb }
            s49 r0 = r0.mo48885o()     // Catch:{ IOException -> 0x01eb }
            at8 r0 = (p000.at8) r0     // Catch:{ IOException -> 0x01eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0220 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0209
        L_0x01eb:
            r0 = move-exception
            kr8 r13 = r2.f34342a     // Catch:{ SQLiteException -> 0x0220 }
            bn8 r13 = r13.mo45237A()     // Catch:{ SQLiteException -> 0x0220 }
            vm8 r13 = r13.mo29670l()     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x021e }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021c }
            r13.mo48772d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021c }
        L_0x0209:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 != 0) goto L_0x0215
            r4.close()
            r13 = r17
            goto L_0x024d
        L_0x0215:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c3
        L_0x021c:
            r0 = move-exception
            goto L_0x0230
        L_0x021e:
            r0 = move-exception
            goto L_0x0223
        L_0x0220:
            r0 = move-exception
            r18 = r6
        L_0x0223:
            r19 = r7
            goto L_0x0230
        L_0x0226:
            r0 = move-exception
            r5 = 0
            goto L_0x0af9
        L_0x022a:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x0230:
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0af7 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0af7 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0af7 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x0af7 }
            r2.mo48771c(r5, r3, r0)     // Catch:{ all -> 0x0af7 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0af7 }
            if (r4 == 0) goto L_0x024c
            r4.close()
        L_0x024c:
            r13 = r0
        L_0x024d:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025e
        L_0x0254:
            r12 = r8
            r30 = r9
            r28 = r18
            r29 = r19
            r13 = 0
            goto L_0x0587
        L_0x025e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d4
            java.lang.String r1 = r10.f30910d
            p000.cu4.m43217g(r1)
            p000.cu4.m43221k(r13)
            lq r3 = new lq
            r3.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x027e
            goto L_0x03cc
        L_0x027e:
            s59 r0 = r10.f33321b
            m78 r4 = r0.mo47651V()
            r4.mo47982g()
            r4.mo29006e()
            p000.cu4.m43217g(r1)
            lq r0 = new lq
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.mo45660P()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x02db
        L_0x02ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02e3 }
            if (r7 != 0) goto L_0x02c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02e3 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x02c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02e3 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x02ac
        L_0x02d7:
            r5.close()
            goto L_0x0305
        L_0x02db:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02e3 }
            goto L_0x02d7
        L_0x02e0:
            r0 = move-exception
            goto L_0x03ce
        L_0x02e3:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e5:
            r0 = move-exception
            r5 = 0
            goto L_0x03ce
        L_0x02e9:
            r0 = move-exception
            r5 = 0
        L_0x02eb:
            kr8 r4 = r4.f34342a     // Catch:{ all -> 0x02e0 }
            bn8 r4 = r4.mo45237A()     // Catch:{ all -> 0x02e0 }
            vm8 r4 = r4.mo29670l()     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = p000.bn8.m32664w(r1)     // Catch:{ all -> 0x02e0 }
            r4.mo48771c(r6, r1, r0)     // Catch:{ all -> 0x02e0 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02e0 }
            if (r5 == 0) goto L_0x0305
            goto L_0x02d7
        L_0x0305:
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x030d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03cc
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            at8 r6 = (p000.at8) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03bf
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0337
            goto L_0x03bf
        L_0x0337:
            s59 r5 = r10.f33321b
            w59 r5 = r5.mo47655Z()
            r17 = r0
            java.util.List r0 = r6.mo29065z()
            java.util.List r0 = r5.mo48898F(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03bb
            w39 r5 = r6.mo47634s()
            ys8 r5 = (p000.ys8) r5
            r5.mo49743z()
            r5.mo49742y(r0)
            s59 r0 = r10.f33321b
            w59 r0 = r0.mo47655Z()
            r20 = r1
            java.util.List r1 = r6.mo29063x()
            java.util.List r0 = r0.mo48898F(r1, r7)
            r5.mo49741x()
            r5.mo49740w(r0)
            r0 = 0
        L_0x0370:
            int r1 = r6.mo29056D()
            if (r0 >= r1) goto L_0x038e
            tq8 r1 = r6.mo29057E(r0)
            int r1 = r1.mo48159y()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x038b
            r5.mo49737C(r0)
        L_0x038b:
            int r0 = r0 + 1
            goto L_0x0370
        L_0x038e:
            r0 = 0
        L_0x038f:
            int r1 = r6.mo29059G()
            if (r0 >= r1) goto L_0x03ad
            et8 r1 = r6.mo29060H(r0)
            int r1 = r1.mo42416y()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03aa
            r5.mo49739E(r0)
        L_0x03aa:
            int r0 = r0 + 1
            goto L_0x038f
        L_0x03ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            s49 r1 = r5.mo48885o()
            at8 r1 = (p000.at8) r1
            r3.put(r0, r1)
            goto L_0x03c6
        L_0x03bb:
            r0 = r17
            goto L_0x030d
        L_0x03bf:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c6:
            r0 = r17
            r1 = r20
            goto L_0x030d
        L_0x03cc:
            r0 = r3
            goto L_0x03d5
        L_0x03ce:
            if (r5 == 0) goto L_0x03d3
            r5.close()
        L_0x03d3:
            throw r0
        L_0x03d4:
            r0 = r13
        L_0x03d5:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d9:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            at8 r1 = (p000.at8) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            lq r7 = new lq
            r7.<init>()
            if (r1 == 0) goto L_0x0441
            int r2 = r1.mo29056D()
            if (r2 != 0) goto L_0x040b
            goto L_0x0441
        L_0x040b:
            java.util.List r2 = r1.mo29055C()
            java.util.Iterator r2 = r2.iterator()
        L_0x0413:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0441
            java.lang.Object r3 = r2.next()
            tq8 r3 = (p000.tq8) r3
            boolean r4 = r3.mo48158x()
            if (r4 == 0) goto L_0x0413
            int r4 = r3.mo48159y()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.mo48160z()
            if (r21 == 0) goto L_0x043c
            long r21 = r3.mo48157B()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x043d
        L_0x043c:
            r3 = 0
        L_0x043d:
            r7.put(r4, r3)
            goto L_0x0413
        L_0x0441:
            lq r4 = new lq
            r4.<init>()
            if (r1 == 0) goto L_0x0491
            int r2 = r1.mo29059G()
            if (r2 != 0) goto L_0x044f
            goto L_0x0491
        L_0x044f:
            java.util.List r2 = r1.mo29058F()
            java.util.Iterator r2 = r2.iterator()
        L_0x0457:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0491
            java.lang.Object r3 = r2.next()
            et8 r3 = (p000.et8) r3
            boolean r21 = r3.mo42415x()
            if (r21 == 0) goto L_0x0457
            int r21 = r3.mo42413B()
            if (r21 <= 0) goto L_0x0457
            int r21 = r3.mo42416y()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.mo42413B()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.mo42414C(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0457
        L_0x0491:
            r22 = r0
            if (r1 == 0) goto L_0x04e6
            r0 = 0
        L_0x0496:
            int r2 = r1.mo29064y()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e6
            java.util.List r2 = r1.mo29063x()
            boolean r2 = p000.w59.m53710D(r2, r0)
            if (r2 == 0) goto L_0x04d4
            kr8 r2 = r10.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29678v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.mo48771c(r9, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.mo29065z()
            boolean r2 = p000.w59.m53710D(r2, r0)
            if (r2 == 0) goto L_0x04d8
            r5.set(r0)
            goto L_0x04df
        L_0x04d4:
            r21 = r8
            r23 = r9
        L_0x04d8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04df:
            int r0 = r0 + 1
            r8 = r21
            r9 = r23
            goto L_0x0496
        L_0x04e6:
            r21 = r8
            r23 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r8 = r1
            at8 r8 = (p000.at8) r8
            if (r15 == 0) goto L_0x0555
            if (r14 == 0) goto L_0x0555
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f30914h
            if (r1 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f30913g
            if (r1 != 0) goto L_0x050a
            goto L_0x0555
        L_0x050a:
            java.util.Iterator r0 = r0.iterator()
        L_0x050e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0555
            java.lang.Object r1 = r0.next()
            rm8 r1 = (p000.rm8) r1
            int r2 = r1.mo47445y()
            java.lang.Long r3 = r10.f30914h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.mo47441H()
            if (r1 == 0) goto L_0x0536
            java.lang.Long r1 = r10.f30913g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0536:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0547
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0547:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050e
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050e
        L_0x0555:
            wi9 r0 = new wi9
            java.lang.String r3 = r10.f30910d
            r9 = 0
            r1 = r0
            r2 = r65
            r24 = r4
            r4 = r8
            r8 = 0
            r28 = r18
            r29 = r19
            r16 = r12
            r66 = r13
            r12 = r21
            r13 = r8
            r8 = r24
            r30 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, wi9> r1 = r10.f30912f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r66
            r8 = r12
            r12 = r16
            r0 = r22
            r9 = r30
            goto L_0x03d9
        L_0x0587:
            boolean r0 = r67.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0593
        L_0x058f:
            r25 = r11
            goto L_0x0813
        L_0x0593:
            dj9 r2 = new dj9
            r2.<init>(r10, r13)
            lq r3 = new lq
            r3.<init>()
            java.util.Iterator r4 = r67.iterator()
        L_0x05a1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x058f
            java.lang.Object r0 = r4.next()
            wq8 r0 = (p000.wq8) r0
            java.lang.String r5 = r10.f30910d
            wq8 r5 = r2.mo41931a(r5, r0)
            if (r5 == 0) goto L_0x0810
            s59 r6 = r10.f33321b
            m78 r6 = r6.mo47651V()
            java.lang.String r7 = r10.f30910d
            java.lang.String r8 = r5.mo49247B()
            java.lang.String r9 = r0.mo49247B()
            m88 r9 = r6.mo45661Q(r7, r9)
            if (r9 != 0) goto L_0x060a
            kr8 r9 = r6.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29673o()
            java.lang.Object r14 = p000.bn8.m32664w(r7)
            kr8 r6 = r6.f34342a
            mm8 r6 = r6.mo45244H()
            java.lang.String r6 = r6.mo45821m(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.mo48771c(r8, r14, r6)
            m88 r6 = new m88
            r31 = r6
            java.lang.String r33 = r0.mo49247B()
            r34 = 1
            r36 = 1
            r38 = 1
            long r40 = r0.mo49249D()
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r32 = r7
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            goto L_0x063f
        L_0x060a:
            m88 r6 = new m88
            r48 = r6
            java.lang.String r0 = r9.f31538a
            r49 = r0
            java.lang.String r0 = r9.f31539b
            r50 = r0
            long r7 = r9.f31540c
            r14 = 1
            long r51 = r7 + r14
            long r7 = r9.f31541d
            long r53 = r7 + r14
            long r7 = r9.f31542e
            long r55 = r7 + r14
            long r7 = r9.f31543f
            r57 = r7
            long r7 = r9.f31544g
            r59 = r7
            java.lang.Long r0 = r9.f31545h
            r61 = r0
            java.lang.Long r0 = r9.f31546i
            r62 = r0
            java.lang.Long r0 = r9.f31547j
            r63 = r0
            java.lang.Boolean r0 = r9.f31548k
            r64 = r0
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r61, r62, r63, r64)
        L_0x063f:
            s59 r0 = r10.f33321b
            m78 r0 = r0.mo47651V()
            r0.mo45662R(r6)
            long r7 = r6.f31540c
            java.lang.String r9 = r5.mo49247B()
            java.lang.Object r0 = r3.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x075f
            s59 r0 = r10.f33321b
            m78 r14 = r0.mo47651V()
            java.lang.String r15 = r10.f30910d
            r14.mo47982g()
            r14.mo29006e()
            p000.cu4.m43217g(r15)
            p000.cu4.m43217g(r9)
            lq r13 = new lq
            r13.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r14.mo45660P()
            r24 = r2
            r67 = r4
            r4 = r28
            r2 = r29
            java.lang.String[] r18 = new java.lang.String[]{r4, r2}     // Catch:{ SQLiteException -> 0x0731, all -> 0x072e }
            r25 = r11
            r11 = 2
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 0
            r0[r17] = r15     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 1
            r0[r17] = r9     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r11 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0720 }
            if (r0 == 0) goto L_0x0710
            r29 = r2
        L_0x06a4:
            r2 = 1
            byte[] r0 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x070e }
            om8 r2 = p000.rm8.m51160K()     // Catch:{ IOException -> 0x06e1 }
            p79 r0 = p000.w59.m53712J(r2, r0)     // Catch:{ IOException -> 0x06e1 }
            om8 r0 = (p000.om8) r0     // Catch:{ IOException -> 0x06e1 }
            s49 r0 = r0.mo48885o()     // Catch:{ IOException -> 0x06e1 }
            rm8 r0 = (p000.rm8) r0     // Catch:{ IOException -> 0x06e1 }
            r2 = 0
            int r16 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Object r16 = r13.get(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x070e }
            if (r16 != 0) goto L_0x06d5
            r28 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x070c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x070c }
            r13.put(r2, r4)     // Catch:{ SQLiteException -> 0x070c }
            goto L_0x06d9
        L_0x06d5:
            r28 = r4
            r4 = r16
        L_0x06d9:
            r4.add(r0)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            goto L_0x06f9
        L_0x06e1:
            r0 = move-exception
            r28 = r4
            kr8 r2 = r14.f34342a     // Catch:{ SQLiteException -> 0x070c }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x070c }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x070c }
            java.lang.Object r4 = p000.bn8.m32664w(r15)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            r2.mo48771c(r13, r4, r0)     // Catch:{ SQLiteException -> 0x071e }
        L_0x06f9:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x071e }
            if (r0 != 0) goto L_0x0705
            r11.close()
            r0 = r16
            goto L_0x0753
        L_0x0705:
            r30 = r13
            r13 = r16
            r4 = r28
            goto L_0x06a4
        L_0x070c:
            r0 = move-exception
            goto L_0x0725
        L_0x070e:
            r0 = move-exception
            goto L_0x0723
        L_0x0710:
            r29 = r2
            r28 = r4
            r13 = r30
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x071e }
        L_0x071a:
            r11.close()
            goto L_0x0753
        L_0x071e:
            r0 = move-exception
            goto L_0x073b
        L_0x0720:
            r0 = move-exception
            r29 = r2
        L_0x0723:
            r28 = r4
        L_0x0725:
            r13 = r30
            goto L_0x073b
        L_0x0728:
            r0 = move-exception
            r29 = r2
            r28 = r4
            goto L_0x0738
        L_0x072e:
            r0 = move-exception
            r5 = 0
            goto L_0x0759
        L_0x0731:
            r0 = move-exception
            r29 = r2
            r28 = r4
            r25 = r11
        L_0x0738:
            r13 = r30
            r11 = 0
        L_0x073b:
            kr8 r2 = r14.f34342a     // Catch:{ all -> 0x0757 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0757 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0757 }
            java.lang.Object r4 = p000.bn8.m32664w(r15)     // Catch:{ all -> 0x0757 }
            r2.mo48771c(r12, r4, r0)     // Catch:{ all -> 0x0757 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0753
            goto L_0x071a
        L_0x0753:
            r3.put(r9, r0)
            goto L_0x0767
        L_0x0757:
            r0 = move-exception
            r5 = r11
        L_0x0759:
            if (r5 == 0) goto L_0x075e
            r5.close()
        L_0x075e:
            throw r0
        L_0x075f:
            r24 = r2
            r67 = r4
            r25 = r11
            r13 = r30
        L_0x0767:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x076f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0808
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r9 = r10.f30911e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0799
            kr8 r4 = r10.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29678v()
            r4.mo48770b(r1, r11)
            goto L_0x076f
        L_0x0799:
            java.lang.Object r9 = r0.get(r11)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r11 = 1
        L_0x07a4:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x07f3
            java.lang.Object r11 = r9.next()
            rm8 r11 = (p000.rm8) r11
            mj9 r15 = new mj9
            java.lang.String r14 = r10.f30910d
            r15.<init>(r10, r14, r4, r11)
            java.lang.Long r14 = r10.f30913g
            r22 = r0
            java.lang.Long r0 = r10.f30914h
            int r11 = r11.mo47445y()
            boolean r21 = r10.mo44822l(r4, r11)
            r11 = r14
            r14 = r15
            r23 = r2
            r2 = r15
            r15 = r11
            r16 = r0
            r17 = r5
            r18 = r7
            r20 = r6
            boolean r11 = r14.mo45804k(r15, r16, r17, r18, r20, r21)
            if (r11 == 0) goto L_0x07e9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            wi9 r0 = r10.mo44821k(r0)
            r0.mo49200a(r2)
            r0 = r22
            r2 = r23
            goto L_0x07a4
        L_0x07e9:
            java.util.Set<java.lang.Integer> r0 = r10.f30911e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
            goto L_0x07f7
        L_0x07f3:
            r22 = r0
            r23 = r2
        L_0x07f7:
            if (r11 != 0) goto L_0x0802
            java.util.Set<java.lang.Integer> r0 = r10.f30911e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
        L_0x0802:
            r0 = r22
            r2 = r23
            goto L_0x076f
        L_0x0808:
            r4 = r67
            r30 = r13
            r2 = r24
            r11 = r25
        L_0x0810:
            r13 = 0
            goto L_0x05a1
        L_0x0813:
            boolean r0 = r68.isEmpty()
            if (r0 == 0) goto L_0x081d
        L_0x0819:
            r11 = r28
            goto L_0x0a4d
        L_0x081d:
            lq r2 = new lq
            r2.<init>()
            java.util.Iterator r3 = r68.iterator()
        L_0x0826:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0819
            java.lang.Object r0 = r3.next()
            r4 = r0
            it8 r4 = (p000.it8) r4
            java.lang.String r5 = r4.mo43931z()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0919
            s59 r0 = r10.f33321b
            m78 r6 = r0.mo47651V()
            java.lang.String r7 = r10.f30910d
            r6.mo47982g()
            r6.mo29006e()
            p000.cu4.m43217g(r7)
            p000.cu4.m43217g(r5)
            lq r8 = new lq
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.mo45660P()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08ea }
            if (r0 == 0) goto L_0x08de
        L_0x0883:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08ea }
            on8 r15 = p000.rn8.m51180G()     // Catch:{ IOException -> 0x08ba }
            p79 r0 = p000.w59.m53712J(r15, r0)     // Catch:{ IOException -> 0x08ba }
            on8 r0 = (p000.on8) r0     // Catch:{ IOException -> 0x08ba }
            s49 r0 = r0.mo48885o()     // Catch:{ IOException -> 0x08ba }
            rn8 r0 = (p000.rn8) r0     // Catch:{ IOException -> 0x08ba }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08ea }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x08ea }
            if (r16 != 0) goto L_0x08b2
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08ea }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08ea }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08ea }
            goto L_0x08b4
        L_0x08b2:
            r15 = r16
        L_0x08b4:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08ea }
            r67 = r3
            goto L_0x08d0
        L_0x08ba:
            r0 = move-exception
            kr8 r14 = r6.f34342a     // Catch:{ SQLiteException -> 0x08ea }
            bn8 r14 = r14.mo45237A()     // Catch:{ SQLiteException -> 0x08ea }
            vm8 r14 = r14.mo29670l()     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.String r15 = "Failed to merge filter"
            r67 = r3
            java.lang.Object r3 = p000.bn8.m32664w(r7)     // Catch:{ SQLiteException -> 0x08e8 }
            r14.mo48771c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08d0:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08e8 }
            if (r0 != 0) goto L_0x08db
            r13.close()
            r0 = r8
            goto L_0x090d
        L_0x08db:
            r3 = r67
            goto L_0x0883
        L_0x08de:
            r67 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08e4:
            r13.close()
            goto L_0x090d
        L_0x08e8:
            r0 = move-exception
            goto L_0x08f5
        L_0x08ea:
            r0 = move-exception
            r67 = r3
            goto L_0x08f5
        L_0x08ee:
            r0 = move-exception
            r5 = 0
            goto L_0x0913
        L_0x08f1:
            r0 = move-exception
            r67 = r3
            r13 = 0
        L_0x08f5:
            kr8 r3 = r6.f34342a     // Catch:{ all -> 0x0911 }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x0911 }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x0911 }
            java.lang.Object r6 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x0911 }
            r3.mo48771c(r12, r6, r0)     // Catch:{ all -> 0x0911 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0911 }
            if (r13 == 0) goto L_0x090d
            goto L_0x08e4
        L_0x090d:
            r2.put(r5, r0)
            goto L_0x091f
        L_0x0911:
            r0 = move-exception
            r5 = r13
        L_0x0913:
            if (r5 == 0) goto L_0x0918
            r5.close()
        L_0x0918:
            throw r0
        L_0x0919:
            r67 = r3
            r11 = r28
            r9 = r29
        L_0x091f:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0927:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a45
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set<java.lang.Integer> r6 = r10.f30911e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0952
            kr8 r0 = r10.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            r0.mo48770b(r1, r7)
            goto L_0x0a45
        L_0x0952:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x095d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a34
            java.lang.Object r7 = r6.next()
            rn8 r7 = (p000.rn8) r7
            kr8 r8 = r10.f34342a
            bn8 r8 = r8.mo45237A()
            java.lang.String r8 = r8.mo29680y()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09c7
            kr8 r8 = r10.f34342a
            bn8 r8 = r8.mo45237A()
            vm8 r8 = r8.mo29678v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.mo47452x()
            if (r15 == 0) goto L_0x0997
            int r15 = r7.mo47453y()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0998
        L_0x0997:
            r15 = 0
        L_0x0998:
            kr8 r13 = r10.f34342a
            mm8 r13 = r13.mo45244H()
            r68 = r0
            java.lang.String r0 = r7.mo47454z()
            java.lang.String r0 = r13.mo45823o(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.mo48772d(r13, r14, r15, r0)
            kr8 r0 = r10.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            s59 r8 = r10.f33321b
            w59 r8 = r8.mo47655Z()
            java.lang.String r8 = r8.mo48909z(r7)
            java.lang.String r13 = "Filter definition"
            r0.mo48770b(r13, r8)
            goto L_0x09c9
        L_0x09c7:
            r68 = r0
        L_0x09c9:
            boolean r0 = r7.mo47452x()
            if (r0 == 0) goto L_0x0a0a
            int r0 = r7.mo47453y()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09d8
            goto L_0x0a0a
        L_0x09d8:
            ck9 r0 = new ck9
            java.lang.String r8 = r10.f30910d
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.f30913g
            java.lang.Long r13 = r10.f30914h
            int r7 = r7.mo47453y()
            boolean r7 = r10.mo44822l(r5, r7)
            boolean r7 = r0.mo30031k(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            wi9 r8 = r10.mo44821k(r8)
            r8.mo49200a(r0)
            r0 = r68
            goto L_0x095d
        L_0x0a00:
            java.util.Set<java.lang.Integer> r0 = r10.f30911e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a36
        L_0x0a0a:
            kr8 r0 = r10.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29673o()
            java.lang.String r6 = r10.f30910d
            java.lang.Object r6 = p000.bn8.m32664w(r6)
            boolean r8 = r7.mo47452x()
            if (r8 == 0) goto L_0x0a29
            int r7 = r7.mo47453y()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a2a
        L_0x0a29:
            r7 = 0
        L_0x0a2a:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.mo48771c(r8, r6, r7)
            goto L_0x0a38
        L_0x0a34:
            r68 = r0
        L_0x0a36:
            if (r7 != 0) goto L_0x0a41
        L_0x0a38:
            java.util.Set<java.lang.Integer> r0 = r10.f30911e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a41:
            r0 = r68
            goto L_0x0927
        L_0x0a45:
            r3 = r67
            r29 = r9
            r28 = r11
            goto L_0x0826
        L_0x0a4d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, wi9> r0 = r10.f30912f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f30911e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0af6
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, wi9> r3 = r10.f30912f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            wi9 r3 = (p000.wi9) r3
            p000.cu4.m43221k(r3)
            mq8 r0 = r3.mo49201b(r0)
            r1.add(r0)
            s59 r3 = r10.f33321b
            m78 r3 = r3.mo47651V()
            java.lang.String r5 = r10.f30910d
            at8 r0 = r0.mo45858z()
            r3.mo47982g()
            r3.mo29006e()
            p000.cu4.m43217g(r5)
            p000.cu4.m43221k(r0)
            byte[] r0 = r0.mo30879c()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r25
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.mo45660P()     // Catch:{ SQLiteException -> 0x0add }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0adb }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0af2
            kr8 r0 = r3.f34342a     // Catch:{ SQLiteException -> 0x0adb }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x0adb }
            vm8 r0 = r0.mo29670l()     // Catch:{ SQLiteException -> 0x0adb }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = p000.bn8.m32664w(r5)     // Catch:{ SQLiteException -> 0x0adb }
            r0.mo48770b(r6, r7)     // Catch:{ SQLiteException -> 0x0adb }
            goto L_0x0af2
        L_0x0adb:
            r0 = move-exception
            goto L_0x0adf
        L_0x0add:
            r0 = move-exception
            r9 = 0
        L_0x0adf:
            kr8 r3 = r3.f34342a
            bn8 r3 = r3.mo45237A()
            vm8 r3 = r3.mo29670l()
            java.lang.Object r5 = p000.bn8.m32664w(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.mo48771c(r6, r5, r0)
        L_0x0af2:
            r25 = r4
            goto L_0x0a61
        L_0x0af6:
            return r1
        L_0x0af7:
            r0 = move-exception
            r5 = r4
        L_0x0af9:
            if (r5 == 0) goto L_0x0afe
            r5.close()
        L_0x0afe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kk9.mo44820j(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    /* renamed from: k */
    public final wi9 mo44821k(Integer num) {
        if (this.f30912f.containsKey(num)) {
            return this.f30912f.get(num);
        }
        wi9 wi9 = new wi9(this, this.f30910d, (ki9) null);
        this.f30912f.put(num, wi9);
        return wi9;
    }

    /* renamed from: l */
    public final boolean mo44822l(int i, int i2) {
        wi9 wi9 = this.f30912f.get(Integer.valueOf(i));
        if (wi9 == null) {
            return false;
        }
        return wi9.f35341d.get(i2);
    }
}
