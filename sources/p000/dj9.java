package p000;

/* renamed from: dj9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class dj9 {

    /* renamed from: a */
    public wq8 f28206a;

    /* renamed from: b */
    public Long f28207b;

    /* renamed from: c */
    public long f28208c;

    /* renamed from: d */
    public final /* synthetic */ kk9 f28209d;

    public /* synthetic */ dj9(kk9 kk9, ki9 ki9) {
        this.f28209d = kk9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.wq8 mo41931a(java.lang.String r18, p000.wq8 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo49247B()
            java.util.List r9 = r19.mo49255x()
            kk9 r2 = r1.f28209d
            s59 r2 = r2.f33321b
            r2.mo47655Z()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = p000.w59.m53719k(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            p000.cu4.m43221k(r4)
            kk9 r0 = r1.f28209d
            s59 r0 = r0.f33321b
            r0.mo47655Z()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = p000.w59.m53719k(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            kk9 r0 = r1.f28209d
            kr8 r0 = r0.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29671m()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo48770b(r2, r4)
            return r5
        L_0x0055:
            wq8 r0 = r1.f28206a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f28207b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f28207b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            kk9 r0 = r1.f28209d
            s59 r0 = r0.f33321b
            m78 r13 = r0.mo47651V()
            r13.mo29006e()
            r13.mo47982g()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo45660P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            kr8 r0 = r13.f34342a     // Catch:{ SQLiteException -> 0x00e3 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x00e3 }
            vm8 r0 = r0.mo29678v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo48769a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            uq8 r5 = p000.wq8.m54013I()     // Catch:{ IOException -> 0x00ce }
            p79 r0 = p000.w59.m53712J(r5, r0)     // Catch:{ IOException -> 0x00ce }
            uq8 r0 = (p000.uq8) r0     // Catch:{ IOException -> 0x00ce }
            s49 r0 = r0.mo48885o()     // Catch:{ IOException -> 0x00ce }
            wq8 r0 = (p000.wq8) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            kr8 r5 = r13.f34342a     // Catch:{ SQLiteException -> 0x00e3 }
            bn8 r5 = r5.mo45237A()     // Catch:{ SQLiteException -> 0x00e3 }
            vm8 r5 = r5.mo29670l()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = p000.bn8.m32664w(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo48772d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            kr8 r5 = r13.f34342a     // Catch:{ all -> 0x01de }
            bn8 r5 = r5.mo45237A()     // Catch:{ all -> 0x01de }
            vm8 r5 = r5.mo29670l()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo48770b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            wq8 r5 = (p000.wq8) r5
            r1.f28206a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f28208c = r12
            kk9 r0 = r1.f28209d
            s59 r0 = r0.f33321b
            r0.mo47655Z()
            wq8 r0 = r1.f28206a
            java.lang.Object r0 = p000.w59.m53719k(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f28207b = r0
        L_0x0127:
            long r12 = r1.f28208c
            r14 = -1
            long r12 = r12 + r14
            r1.f28208c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            kk9 r0 = r1.f28209d
            s59 r0 = r0.f33321b
            m78 r2 = r0.mo47651V()
            r2.mo29006e()
            kr8 r0 = r2.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo48770b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo45660P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29670l()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo48770b(r3, r0)
            goto L_0x017d
        L_0x016c:
            kk9 r0 = r1.f28209d
            s59 r0 = r0.f33321b
            m78 r2 = r0.mo47651V()
            long r5 = r1.f28208c
            wq8 r7 = r1.f28206a
            r3 = r18
            r2.mo45690u(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            wq8 r2 = r1.f28206a
            java.util.List r2 = r2.mo49255x()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            er8 r3 = (p000.er8) r3
            kk9 r4 = r1.f28209d
            s59 r4 = r4.f33321b
            r4.mo47655Z()
            java.lang.String r4 = r3.mo42393y()
            er8 r4 = p000.w59.m53718j(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            kk9 r0 = r1.f28209d
            kr8 r0 = r0.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29671m()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo48770b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            kk9 r0 = r1.f28209d
            kr8 r0 = r0.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29671m()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo48771c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f28207b = r4
            r1.f28206a = r8
            kk9 r2 = r1.f28209d
            s59 r2 = r2.f33321b
            r2.mo47655Z()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = p000.w59.m53719k(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f28208c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            kk9 r2 = r1.f28209d
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29671m()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo48770b(r3, r0)
            goto L_0x0233
        L_0x021c:
            kk9 r2 = r1.f28209d
            s59 r2 = r2.f33321b
            m78 r2 = r2.mo47651V()
            java.lang.Object r4 = p000.cu4.m43221k(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f28208c
            r3 = r18
            r7 = r19
            r2.mo45690u(r3, r4, r5, r7)
        L_0x0233:
            w39 r2 = r19.mo47634s()
            uq8 r2 = (p000.uq8) r2
            r2.mo48493I(r0)
            r2.mo48490F()
            r2.mo48489E(r9)
            s49 r0 = r2.mo48885o()
            wq8 r0 = (p000.wq8) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dj9.mo41931a(java.lang.String, wq8):wq8");
    }
}
