package p000;

/* renamed from: w69 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class w69 extends d88 {

    /* renamed from: d */
    public final n58 f35242d;

    public w69(n58 n58) {
        this.f35242d = n58;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.r88 mo29506o(java.lang.String r17, p000.ps8 r18, java.util.List<p000.r88> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = r6
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = r14
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = r15
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = r7
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = r5
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            r88 r1 = super.mo29506o(r17, r18, r19)
            return r1
        L_0x0064:
            p000.gv8.m44946a(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            r88 r1 = (p000.r88) r1
            r88 r1 = r2.mo46865a(r1)
            java.lang.String r1 = r1.zzc()
            java.lang.Object r3 = r3.get(r15)
            r88 r3 = (p000.r88) r3
            r88 r2 = r2.mo46865a(r3)
            n58 r3 = r0.f35242d
            h58 r3 = r3.mo45972c()
            java.lang.Object r4 = p000.gv8.m44955j(r2)
            r3.mo43088d(r1, r4)
            return r2
        L_0x008d:
            p000.gv8.m44946a(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            r88 r1 = (p000.r88) r1
            r88 r1 = r2.mo46865a(r1)
            r88 r2 = p000.r88.f33330g1
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            r88 r2 = p000.r88.f33331h1
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            n58 r2 = r0.f35242d
            h58 r2 = r2.mo45972c()
            java.lang.String r3 = r1.zzc()
            r2.mo43086c(r3)
            b98 r2 = new b98
            java.lang.String r1 = r1.zzc()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            p000.gv8.m44946a(r12, r5, r3)
            n58 r1 = r0.f35242d
            h58 r1 = r1.mo45972c()
            e78 r2 = new e78
            long r3 = r1.mo43084a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            p000.gv8.m44946a(r10, r5, r3)
            n58 r1 = r0.f35242d
            h58 r1 = r1.mo45972c()
            java.util.Map r1 = r1.mo43091f()
            d88 r2 = new d88
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            r88 r5 = p000.ky8.m47572a(r5)
            r2.mo41863k(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            p000.gv8.m44946a(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            r88 r1 = (p000.r88) r1
            r88 r1 = r2.mo46865a(r1)
            java.lang.String r1 = r1.zzc()
            n58 r2 = r0.f35242d
            h58 r2 = r2.mo45972c()
            java.lang.Object r1 = r2.mo43089e(r1)
            r88 r1 = p000.ky8.m47572a(r1)
            return r1
        L_0x0134:
            p000.gv8.m44946a(r13, r5, r3)
            n58 r1 = r0.f35242d
            h58 r1 = r1.mo45972c()
            b98 r2 = new b98
            java.lang.String r1 = r1.mo43085b()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w69.mo29506o(java.lang.String, ps8, java.util.List):r88");
    }
}
