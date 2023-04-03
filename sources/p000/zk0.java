package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, mo44877d2 = {"", "red", "green", "blue", "alpha", "Lcl0;", "colorSpace", "Luk0;", "a", "(FFFFLcl0;)J", "", "color", "b", "(I)J", "", "c", "(J)J", "", "d", "(J)[F", "e", "(J)I", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: zk0 */
/* compiled from: Color.kt */
public final class zk0 {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m31343a(float r9, float r10, float r11, float r12, p000.cl0 r13) {
        /*
            java.lang.String r0 = "colorSpace"
            p000.vx2.m53591g(r13, r0)
            r0 = 0
            float r1 = r13.mo3286e(r0)
            float r2 = r13.mo3285d(r0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r13.mo3286e(r3)
            float r5 = r13.mo3285d(r3)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r13.mo3286e(r1)
            float r1 = r13.mo3285d(r1)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            if (r1 == 0) goto L_0x0148
            boolean r1 = r13.mo3288h()
            r5 = 32
            r6 = 16
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0097
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 * r13
            float r12 = r12 + r7
            int r12 = (int) r12
            int r12 = r12 << 24
            float r9 = r9 * r13
            float r9 = r9 + r7
            int r9 = (int) r9
            int r9 = r9 << r6
            r9 = r9 | r12
            float r10 = r10 * r13
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << 8
            r9 = r9 | r10
            float r11 = r11 * r13
            float r11 = r11 + r7
            int r10 = (int) r11
            r9 = r9 | r10
            long r9 = (long) r9
            long r9 = p000.x27.m54165d(r9)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r9 = p000.x27.m54165d(r9)
            long r9 = r9 << r5
            long r9 = p000.x27.m54165d(r9)
            long r9 = p000.uk0.m28329f(r9)
            return r9
        L_0x0097:
            int r1 = r13.mo12098b()
            r8 = 3
            if (r1 != r8) goto L_0x00a0
            r1 = r3
            goto L_0x00a1
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            if (r1 == 0) goto L_0x013c
            int r13 = r13.mo12099c()
            r1 = -1
            if (r13 == r1) goto L_0x00ab
            r0 = r3
        L_0x00ab:
            if (r0 == 0) goto L_0x0130
            short r9 = p000.o42.m23655a(r9)
            short r10 = p000.o42.m23655a(r10)
            short r11 = p000.o42.m23655a(r11)
            float r12 = java.lang.Math.min(r12, r2)
            float r12 = java.lang.Math.max(r4, r12)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r12 = r12 * r0
            float r12 = r12 + r7
            int r12 = (int) r12
            long r0 = (long) r9
            long r0 = p000.x27.m54165d(r0)
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = p000.x27.m54165d(r0)
            r9 = 48
            long r0 = r0 << r9
            long r0 = p000.x27.m54165d(r0)
            long r9 = (long) r10
            long r9 = p000.x27.m54165d(r9)
            long r9 = r9 & r2
            long r9 = p000.x27.m54165d(r9)
            long r9 = r9 << r5
            long r9 = p000.x27.m54165d(r9)
            long r9 = r9 | r0
            long r9 = p000.x27.m54165d(r9)
            long r0 = (long) r11
            long r0 = p000.x27.m54165d(r0)
            long r0 = r0 & r2
            long r0 = p000.x27.m54165d(r0)
            long r0 = r0 << r6
            long r0 = p000.x27.m54165d(r0)
            long r9 = r9 | r0
            long r9 = p000.x27.m54165d(r9)
            long r11 = (long) r12
            long r11 = p000.x27.m54165d(r11)
            r0 = 1023(0x3ff, double:5.054E-321)
            long r11 = r11 & r0
            long r11 = p000.x27.m54165d(r11)
            r0 = 6
            long r11 = r11 << r0
            long r11 = p000.x27.m54165d(r11)
            long r9 = r9 | r11
            long r9 = p000.x27.m54165d(r9)
            long r11 = (long) r13
            long r11 = p000.x27.m54165d(r11)
            r0 = 63
            long r11 = r11 & r0
            long r11 = p000.x27.m54165d(r11)
            long r9 = r9 | r11
            long r9 = p000.x27.m54165d(r9)
            long r9 = p000.uk0.m28329f(r9)
            return r9
        L_0x0130:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x013c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ", green = "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ", blue = "
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ", alpha = "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = " outside the range for "
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zk0.m31343a(float, float, float, float, cl0):long");
    }

    /* renamed from: b */
    public static final long m31344b(int i) {
        return uk0.m28329f(x27.m54165d(x27.m54165d((long) i) << 32));
    }

    /* renamed from: c */
    public static final long m31345c(long j) {
        return uk0.m28329f(x27.m54165d(x27.m54165d(x27.m54165d(j) & 4294967295L) << 32));
    }

    /* renamed from: d */
    public static final float[] m31346d(long j) {
        return new float[]{uk0.m28336m(j), uk0.m28335l(j), uk0.m28333j(j), uk0.m28332i(j)};
    }

    /* renamed from: e */
    public static final int m31347e(long j) {
        cl0 k = uk0.m28334k(j);
        if (k.mo3288h()) {
            return (int) x27.m54165d(j >>> 32);
        }
        float[] d = m31346d(j);
        dl0.m15158i(k, (cl0) null, 0, 3, (Object) null).mo28543a(d);
        return ((int) ((d[2] * 255.0f) + 0.5f)) | (((int) ((d[3] * 255.0f) + 0.5f)) << 24) | (((int) ((d[0] * 255.0f) + 0.5f)) << 16) | (((int) ((d[1] * 255.0f) + 0.5f)) << 8);
    }
}
