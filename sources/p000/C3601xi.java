package p000;

import android.graphics.Matrix;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, mo44877d2 = {"Lfp3;", "Landroid/graphics/Matrix;", "matrix", "Lr37;", "b", "([FLandroid/graphics/Matrix;)V", "a", "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: xi */
/* compiled from: AndroidMatrixConversions.android.kt */
public final class C3601xi {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m30110a(android.graphics.Matrix r23, float[] r24) {
        /*
            r0 = r24
            java.lang.String r1 = "$this$setFrom"
            r2 = r23
            p000.vx2.m53591g(r2, r1)
            java.lang.String r1 = "matrix"
            p000.vx2.m53591g(r0, r1)
            r1 = 2
            r3 = r0[r1]
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x001a
            r5 = r6
            goto L_0x001b
        L_0x001a:
            r5 = r7
        L_0x001b:
            r8 = 8
            r9 = 6
            if (r5 == 0) goto L_0x006e
            r5 = r0[r9]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0028
            r5 = r6
            goto L_0x0029
        L_0x0028:
            r5 = r7
        L_0x0029:
            if (r5 == 0) goto L_0x006e
            r5 = 10
            r5 = r0[r5]
            r10 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0037
            r5 = r6
            goto L_0x0038
        L_0x0037:
            r5 = r7
        L_0x0038:
            if (r5 == 0) goto L_0x006e
            r5 = 14
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0044
            r5 = r6
            goto L_0x0045
        L_0x0044:
            r5 = r7
        L_0x0045:
            if (r5 == 0) goto L_0x006e
            r5 = r0[r8]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = r6
            goto L_0x0050
        L_0x004f:
            r5 = r7
        L_0x0050:
            if (r5 == 0) goto L_0x006e
            r5 = 9
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x005c
            r5 = r6
            goto L_0x005d
        L_0x005c:
            r5 = r7
        L_0x005d:
            if (r5 == 0) goto L_0x006e
            r5 = 11
            r5 = r0[r5]
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0069
            r4 = r6
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            if (r4 == 0) goto L_0x006e
            r4 = r6
            goto L_0x006f
        L_0x006e:
            r4 = r7
        L_0x006f:
            if (r4 == 0) goto L_0x00ba
            r4 = r0[r7]
            r5 = r0[r6]
            r10 = 3
            r11 = r0[r10]
            r12 = 4
            r13 = r0[r12]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r9]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r8]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r7] = r4
            r0[r6] = r13
            r0[r1] = r20
            r0[r10] = r5
            r0[r12] = r15
            r0[r14] = r21
            r0[r9] = r11
            r0[r17] = r18
            r0[r8] = r22
            r23.setValues(r24)
            r0[r7] = r4
            r0[r6] = r5
            r0[r1] = r3
            r0[r10] = r11
            r0[r12] = r13
            r0[r14] = r15
            r0[r9] = r16
            r0[r17] = r18
            r0[r8] = r19
            return
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Android does not support arbitrary transforms"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3601xi.m30110a(android.graphics.Matrix, float[]):void");
    }

    /* renamed from: b */
    public static final void m30111b(float[] fArr, Matrix matrix) {
        float[] fArr2 = fArr;
        Matrix matrix2 = matrix;
        vx2.m53591g(fArr2, "$this$setFrom");
        vx2.m53591g(matrix2, "matrix");
        matrix2.getValues(fArr2);
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        float f6 = fArr2[5];
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        float f9 = fArr2[8];
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = 0.0f;
        fArr2[3] = f7;
        fArr2[4] = f2;
        fArr2[5] = f5;
        fArr2[6] = 0.0f;
        fArr2[7] = f8;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f3;
        fArr2[13] = f6;
        fArr2[14] = 0.0f;
        fArr2[15] = f9;
    }
}
