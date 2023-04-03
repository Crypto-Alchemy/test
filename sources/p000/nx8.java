package p000;

import android.net.Uri;

/* renamed from: nx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class nx8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f32216a;

    /* renamed from: d */
    public final /* synthetic */ Uri f32217d;

    /* renamed from: e */
    public final /* synthetic */ String f32218e;

    /* renamed from: g */
    public final /* synthetic */ String f32219g;

    /* renamed from: k */
    public final /* synthetic */ qx8 f32220k;

    public nx8(qx8 qx8, boolean z, Uri uri, String str, String str2) {
        this.f32220k = qx8;
        this.f32216a = z;
        this.f32217d = uri;
        this.f32218e = str;
        this.f32219g = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r2.f33296a.f34342a.mo45274y().mo45997v((java.lang.String) null, p000.rl8.f33493e0) == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab A[SYNTHETIC, Splitter:B:31:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc A[Catch:{ RuntimeException -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110 A[SYNTHETIC, Splitter:B:47:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143 A[Catch:{ RuntimeException -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0145 A[Catch:{ RuntimeException -> 0x01d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            qx8 r2 = r1.f32220k
            boolean r0 = r1.f32216a
            android.net.Uri r3 = r1.f32217d
            java.lang.String r4 = r1.f32218e
            java.lang.String r5 = r1.f32219g
            sx8 r6 = r2.f33296a
            r6.mo29006e()
            sx8 r6 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r6 = r6.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r6 = r6.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r7 = p000.rl8.f33491d0     // Catch:{ RuntimeException -> 0x01d6 }
            r8 = 0
            boolean r6 = r6.mo45997v(r8, r7)     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r14 = "gclid"
            if (r6 != 0) goto L_0x004e
            sx8 r6 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r6 = r6.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r6 = r6.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r15 = p000.rl8.f33495f0     // Catch:{ RuntimeException -> 0x01d6 }
            boolean r6 = r6.mo45997v(r8, r15)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r6 != 0) goto L_0x004e
            sx8 r6 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r6 = r6.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r6 = r6.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r15 = p000.rl8.f33493e0     // Catch:{ RuntimeException -> 0x01d6 }
            boolean r6 = r6.mo45997v(r8, r15)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r6 == 0) goto L_0x005c
        L_0x004e:
            sx8 r6 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r6 = r6.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            g69 r6 = r6.mo45243G()     // Catch:{ RuntimeException -> 0x01d6 }
            boolean r15 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r15 == 0) goto L_0x005e
        L_0x005c:
            r6 = r8
            goto L_0x00a6
        L_0x005e:
            boolean r15 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r15 != 0) goto L_0x0084
            boolean r15 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r15 != 0) goto L_0x0084
            boolean r15 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r15 != 0) goto L_0x0084
            boolean r15 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r15 != 0) goto L_0x0084
            kr8 r6 = r6.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            bn8 r6 = r6.mo45237A()     // Catch:{ RuntimeException -> 0x01d6 }
            vm8 r6 = r6.mo29677u()     // Catch:{ RuntimeException -> 0x01d6 }
            r6.mo48769a(r9)     // Catch:{ RuntimeException -> 0x01d6 }
            goto L_0x005c
        L_0x0084:
            java.lang.String r15 = "https://google.com/search?"
            int r16 = r5.length()     // Catch:{ RuntimeException -> 0x01d6 }
            if (r16 == 0) goto L_0x0091
            java.lang.String r15 = r15.concat(r5)     // Catch:{ RuntimeException -> 0x01d6 }
            goto L_0x0097
        L_0x0091:
            java.lang.String r8 = new java.lang.String     // Catch:{ RuntimeException -> 0x01d6 }
            r8.<init>(r15)     // Catch:{ RuntimeException -> 0x01d6 }
            r15 = r8
        L_0x0097:
            android.net.Uri r8 = android.net.Uri.parse(r15)     // Catch:{ RuntimeException -> 0x01d6 }
            android.os.Bundle r6 = r6.mo42814k0(r8)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r6 == 0) goto L_0x00a6
            java.lang.String r8 = "referrer"
            r6.putString(r10, r8)     // Catch:{ RuntimeException -> 0x01d6 }
        L_0x00a6:
            java.lang.String r8 = "_cmp"
            r15 = 1
            if (r0 == 0) goto L_0x00fc
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r0 = r0.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            g69 r0 = r0.mo45243G()     // Catch:{ RuntimeException -> 0x01d6 }
            android.os.Bundle r0 = r0.mo42814k0(r3)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 == 0) goto L_0x00fd
            java.lang.String r3 = "intent"
            r0.putString(r10, r3)     // Catch:{ RuntimeException -> 0x01d6 }
            sx8 r3 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r3 = r3.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r3 = r3.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            r10 = 0
            boolean r3 = r3.mo45997v(r10, r7)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r3 == 0) goto L_0x00ef
            boolean r3 = r0.containsKey(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r3 != 0) goto L_0x00ef
            if (r6 == 0) goto L_0x00ef
            boolean r3 = r6.containsKey(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r3 == 0) goto L_0x00ef
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ RuntimeException -> 0x01d6 }
            r7 = 0
            java.lang.String r10 = r6.getString(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            r3[r7] = r10     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r7 = "_cer"
            java.lang.String r10 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r10, r3)     // Catch:{ RuntimeException -> 0x01d6 }
            r0.putString(r7, r3)     // Catch:{ RuntimeException -> 0x01d6 }
        L_0x00ef:
            sx8 r3 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            r3.mo47916X(r4, r8, r0)     // Catch:{ RuntimeException -> 0x01d6 }
            sx8 r3 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            bi9 r3 = r3.f34054n     // Catch:{ RuntimeException -> 0x01d6 }
            r3.mo29612b(r4, r0)     // Catch:{ RuntimeException -> 0x01d6 }
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            sx8 r3 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r3 = r3.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r3 = r3.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r7 = p000.rl8.f33495f0     // Catch:{ RuntimeException -> 0x01d6 }
            r10 = 0
            boolean r3 = r3.mo45997v(r10, r7)     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r7 = "auto"
            if (r3 == 0) goto L_0x013d
            sx8 r3 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r3 = r3.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r3 = r3.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r10 = p000.rl8.f33493e0     // Catch:{ RuntimeException -> 0x01d6 }
            r15 = 0
            boolean r3 = r3.mo45997v(r15, r10)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r3 != 0) goto L_0x013d
            if (r6 == 0) goto L_0x013d
            boolean r3 = r6.containsKey(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r3 == 0) goto L_0x013d
            if (r0 == 0) goto L_0x0131
            boolean r0 = r0.containsKey(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x013d
        L_0x0131:
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r3 = "_lgclid"
            java.lang.String r10 = r6.getString(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            r15 = 1
            r0.mo47921c0(r7, r3, r10, r15)     // Catch:{ RuntimeException -> 0x01d6 }
        L_0x013d:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 == 0) goto L_0x0145
            goto L_0x01c5
        L_0x0145:
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r0 = r0.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            bn8 r0 = r0.mo45237A()     // Catch:{ RuntimeException -> 0x01d6 }
            vm8 r0 = r0.mo29677u()     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo48770b(r3, r5)     // Catch:{ RuntimeException -> 0x01d6 }
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r0 = r0.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            n68 r0 = r0.mo45274y()     // Catch:{ RuntimeException -> 0x01d6 }
            uk8<java.lang.Boolean> r3 = p000.rl8.f33493e0     // Catch:{ RuntimeException -> 0x01d6 }
            r10 = 0
            boolean r0 = r0.mo45997v(r10, r3)     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r3 = "_ldl"
            if (r0 == 0) goto L_0x0191
            if (r6 == 0) goto L_0x0178
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            r0.mo47916X(r4, r8, r6)     // Catch:{ RuntimeException -> 0x01d6 }
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            bi9 r0 = r0.f34054n     // Catch:{ RuntimeException -> 0x01d6 }
            r0.mo29612b(r4, r6)     // Catch:{ RuntimeException -> 0x01d6 }
            goto L_0x0189
        L_0x0178:
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r0 = r0.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            bn8 r0 = r0.mo45237A()     // Catch:{ RuntimeException -> 0x01d6 }
            vm8 r0 = r0.mo29677u()     // Catch:{ RuntimeException -> 0x01d6 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo48770b(r4, r5)     // Catch:{ RuntimeException -> 0x01d6 }
        L_0x0189:
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            r4 = 1
            r5 = 0
            r0.mo47921c0(r7, r3, r5, r4)     // Catch:{ RuntimeException -> 0x01d6 }
            return
        L_0x0191:
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 == 0) goto L_0x01c6
        L_0x01b9:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01d6 }
            if (r0 != 0) goto L_0x01c5
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            r4 = 1
            r0.mo47921c0(r7, r3, r5, r4)     // Catch:{ RuntimeException -> 0x01d6 }
        L_0x01c5:
            return
        L_0x01c6:
            sx8 r0 = r2.f33296a     // Catch:{ RuntimeException -> 0x01d6 }
            kr8 r0 = r0.f34342a     // Catch:{ RuntimeException -> 0x01d6 }
            bn8 r0 = r0.mo45237A()     // Catch:{ RuntimeException -> 0x01d6 }
            vm8 r0 = r0.mo29677u()     // Catch:{ RuntimeException -> 0x01d6 }
            r0.mo48769a(r9)     // Catch:{ RuntimeException -> 0x01d6 }
            return
        L_0x01d6:
            r0 = move-exception
            sx8 r2 = r2.f33296a
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29670l()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo48770b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nx8.run():void");
    }
}
