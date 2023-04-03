package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzaz extends zzar {
    public static final zzar zza = new zzaz((Object) null, new Object[0], 0);

    /* renamed from: g */
    public final transient Object f22662g;

    /* renamed from: k */
    public final transient int f22663k;
    public final transient Object[] zzb;

    public zzaz(Object obj, Object[] objArr, int i) {
        this.f22662g = obj;
        this.zzb = objArr;
        this.f22663k = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.mlkit_common.zzaz zzg(int r16, java.lang.Object[] r17, p000.s88 r18) {
        /*
            r0 = r16
            r1 = r17
            if (r0 != 0) goto L_0x000b
            com.google.android.gms.internal.mlkit_common.zzar r0 = zza
            com.google.android.gms.internal.mlkit_common.zzaz r0 = (com.google.android.gms.internal.mlkit_common.zzaz) r0
            return r0
        L_0x000b:
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0023
            r0 = r1[r3]
            r0.getClass()
            r3 = r1[r4]
            r3.getClass()
            p000.t68.m52122a(r0, r3)
            com.google.android.gms.internal.mlkit_common.zzaz r0 = new com.google.android.gms.internal.mlkit_common.zzaz
            r0.<init>(r2, r1, r4)
            return r0
        L_0x0023:
            int r5 = r1.length
            int r5 = r5 >> r4
            java.lang.String r6 = "index"
            p000.v58.m53232b(r0, r5, r6)
            r5 = 2
            int r6 = java.lang.Math.max(r0, r5)
            r7 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r7) goto L_0x004c
            int r7 = r6 + -1
            int r7 = java.lang.Integer.highestOneBit(r7)
            int r7 = r7 + r7
            r8 = r7
        L_0x003e:
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r6
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x004e
            int r8 = r8 + r8
            goto L_0x003e
        L_0x004c:
            if (r6 >= r8) goto L_0x01bf
        L_0x004e:
            if (r0 != r4) goto L_0x0060
            r3 = r1[r3]
            r3.getClass()
            r4 = r1[r4]
            r4.getClass()
            p000.t68.m52122a(r3, r4)
            r3 = r5
            goto L_0x01aa
        L_0x0060:
            int r6 = r8 + -1
            r7 = 128(0x80, float:1.794E-43)
            r9 = 3
            r10 = -1
            if (r8 > r7) goto L_0x00d6
            byte[] r7 = new byte[r8]
            java.util.Arrays.fill(r7, r10)
            r8 = r3
            r10 = r8
        L_0x006f:
            if (r8 >= r0) goto L_0x00c0
            int r11 = r8 + r8
            int r12 = r10 + r10
            r13 = r1[r11]
            r13.getClass()
            r11 = r11 ^ r4
            r11 = r1[r11]
            r11.getClass()
            p000.t68.m52122a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = p000.f78.m44230a(r14)
        L_0x008b:
            r14 = r14 & r6
            byte r15 = r7[r14]
            r5 = 255(0xff, float:3.57E-43)
            r15 = r15 & r5
            if (r15 != r5) goto L_0x00a1
            byte r5 = (byte) r12
            r7[r14] = r5
            if (r10 >= r8) goto L_0x009e
            r1[r12] = r13
            r5 = r12 ^ 1
            r1[r5] = r11
        L_0x009e:
            int r10 = r10 + 1
            goto L_0x00b8
        L_0x00a1:
            r5 = r1[r15]
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x00bc
            r2 = r15 ^ 1
            o88 r5 = new o88
            r12 = r1[r2]
            r12.getClass()
            r5.<init>(r13, r11, r12)
            r1[r2] = r11
            r2 = r5
        L_0x00b8:
            int r8 = r8 + 1
            r5 = 2
            goto L_0x006f
        L_0x00bc:
            int r14 = r14 + 1
            r5 = 2
            goto L_0x008b
        L_0x00c0:
            if (r10 != r0) goto L_0x00c6
            r2 = r7
        L_0x00c3:
            r3 = 2
            goto L_0x01aa
        L_0x00c6:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r3] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5[r4] = r3
            r3 = 2
            r5[r3] = r2
            r2 = r5
            goto L_0x01aa
        L_0x00d6:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r5) goto L_0x0143
            short[] r5 = new short[r8]
            java.util.Arrays.fill(r5, r10)
            r7 = r3
            r8 = r7
        L_0x00e2:
            if (r7 >= r0) goto L_0x0132
            int r10 = r7 + r7
            int r11 = r8 + r8
            r12 = r1[r10]
            r12.getClass()
            r10 = r10 ^ r4
            r10 = r1[r10]
            r10.getClass()
            p000.t68.m52122a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = p000.f78.m44230a(r13)
        L_0x00fe:
            r13 = r13 & r6
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x0115
            short r14 = (short) r11
            r5[r13] = r14
            if (r8 >= r7) goto L_0x0112
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r10
        L_0x0112:
            int r8 = r8 + 1
            goto L_0x012c
        L_0x0115:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x012f
            r2 = r14 ^ 1
            o88 r11 = new o88
            r13 = r1[r2]
            r13.getClass()
            r11.<init>(r12, r10, r13)
            r1[r2] = r10
            r2 = r11
        L_0x012c:
            int r7 = r7 + 1
            goto L_0x00e2
        L_0x012f:
            int r13 = r13 + 1
            goto L_0x00fe
        L_0x0132:
            if (r8 != r0) goto L_0x0135
            goto L_0x0199
        L_0x0135:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r6[r4] = r3
            r3 = 2
            r6[r3] = r2
            goto L_0x01a9
        L_0x0143:
            int[] r5 = new int[r8]
            java.util.Arrays.fill(r5, r10)
            r7 = r3
            r8 = r7
        L_0x014a:
            if (r7 >= r0) goto L_0x0197
            int r11 = r7 + r7
            int r12 = r8 + r8
            r13 = r1[r11]
            r13.getClass()
            r11 = r11 ^ r4
            r11 = r1[r11]
            r11.getClass()
            p000.t68.m52122a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = p000.f78.m44230a(r14)
        L_0x0166:
            r14 = r14 & r6
            r15 = r5[r14]
            if (r15 != r10) goto L_0x0178
            r5[r14] = r12
            if (r8 >= r7) goto L_0x0175
            r1[r12] = r13
            r12 = r12 ^ 1
            r1[r12] = r11
        L_0x0175:
            int r8 = r8 + 1
            goto L_0x018f
        L_0x0178:
            r10 = r1[r15]
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x0193
            r2 = r15 ^ 1
            o88 r10 = new o88
            r12 = r1[r2]
            r12.getClass()
            r10.<init>(r13, r11, r12)
            r1[r2] = r11
            r2 = r10
        L_0x018f:
            int r7 = r7 + 1
            r10 = -1
            goto L_0x014a
        L_0x0193:
            int r14 = r14 + 1
            r10 = -1
            goto L_0x0166
        L_0x0197:
            if (r8 != r0) goto L_0x019c
        L_0x0199:
            r2 = r5
            goto L_0x00c3
        L_0x019c:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r6[r4] = r3
            r3 = 2
            r6[r3] = r2
        L_0x01a9:
            r2 = r6
        L_0x01aa:
            boolean r4 = r2 instanceof java.lang.Object[]
            if (r4 != 0) goto L_0x01b4
            com.google.android.gms.internal.mlkit_common.zzaz r3 = new com.google.android.gms.internal.mlkit_common.zzaz
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01b4:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = r2[r3]
            o88 r0 = (p000.o88) r0
            java.lang.IllegalArgumentException r0 = r0.mo46343a()
            throw r0
        L_0x01bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaz.zzg(int, java.lang.Object[], s88):com.google.android.gms.internal.mlkit_common.zzaz");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f22662g
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.f22663k
            r3 = 0
            if (r10 != 0) goto L_0x000c
        L_0x0009:
            r10 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0009
            r10 = r1[r4]
            r10.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = p000.f78.m44230a(r0)
        L_0x0038:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = p000.f78.m44230a(r0)
        L_0x0063:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = p000.f78.m44230a(r6)
        L_0x0089:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaz.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f22663k;
    }

    public final zzak zza() {
        return new zzay(this.zzb, 1, this.f22663k);
    }

    public final zzas zzd() {
        return new zzaw(this, this.zzb, 0, this.f22663k);
    }

    public final zzas zze() {
        return new zzax(this, new zzay(this.zzb, 0, this.f22663k));
    }
}
