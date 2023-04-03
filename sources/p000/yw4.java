package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: yw4 */
/* compiled from: Projection */
public final class yw4 {

    /* renamed from: a */
    public final C3698a f20390a;

    /* renamed from: b */
    public final C3698a f20391b;

    /* renamed from: c */
    public final int f20392c;

    /* renamed from: d */
    public final boolean f20393d;

    /* renamed from: yw4$a */
    /* compiled from: Projection */
    public static final class C3698a {

        /* renamed from: a */
        public final C3699b[] f20394a;

        public C3698a(C3699b... bVarArr) {
            this.f20394a = bVarArr;
        }

        /* renamed from: a */
        public C3699b mo28263a(int i) {
            return this.f20394a[i];
        }

        /* renamed from: b */
        public int mo28264b() {
            return this.f20394a.length;
        }
    }

    /* renamed from: yw4$b */
    /* compiled from: Projection */
    public static final class C3699b {

        /* renamed from: a */
        public final int f20395a;

        /* renamed from: b */
        public final int f20396b;

        /* renamed from: c */
        public final float[] f20397c;

        /* renamed from: d */
        public final float[] f20398d;

        public C3699b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f20395a = i;
            if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            this.f20397c = fArr;
            this.f20398d = fArr2;
            this.f20396b = i2;
        }

        /* renamed from: a */
        public int mo28265a() {
            return this.f20397c.length / 3;
        }
    }

    public yw4(C3698a aVar, int i) {
        this(aVar, aVar, i);
    }

    /* renamed from: a */
    public static yw4 m30843a(float f, int i, int i2, float f2, float f3, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float f4;
        int i5;
        float[] fArr;
        int i6;
        int i7;
        int i8;
        float f5 = f;
        int i9 = i;
        int i10 = i2;
        float f6 = f2;
        float f7 = f3;
        if (f5 > Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (i9 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        if (i10 >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2725kr.m20981a(z3);
        if (f6 <= Utils.FLOAT_EPSILON || f6 > 180.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        C2725kr.m20981a(z4);
        if (f7 <= Utils.FLOAT_EPSILON || f7 > 360.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        C2725kr.m20981a(z5);
        float radians = (float) Math.toRadians((double) f6);
        float radians2 = (float) Math.toRadians((double) f7);
        float f8 = radians / ((float) i9);
        float f9 = radians2 / ((float) i10);
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[(i12 * 3)];
        float[] fArr3 = new float[(i12 * 2)];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f10 = radians / 2.0f;
            float f11 = (((float) i13) * f8) - f10;
            int i16 = i13 + 1;
            float f12 = (((float) i16) * f8) - f10;
            int i17 = 0;
            while (i17 < i11) {
                float f13 = f11;
                int i18 = i16;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    if (i19 == 0) {
                        f4 = f13;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f12;
                    }
                    float f14 = ((float) i17) * f9;
                    float f15 = f9;
                    int i21 = i14 + 1;
                    int i22 = i17;
                    double d = (double) f5;
                    float f16 = f8;
                    double d2 = (double) ((f14 + 3.1415927f) - (radians2 / 2.0f));
                    int i23 = i19;
                    double d3 = (double) f4;
                    float[] fArr4 = fArr3;
                    float f17 = f12;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i24 = i21 + 1;
                    int i25 = i13;
                    fArr2[i21] = (float) (d * Math.sin(d3));
                    int i26 = i24 + 1;
                    fArr2[i24] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i27 = i15 + 1;
                    fArr4[i15] = f14 / radians2;
                    int i28 = i27 + 1;
                    fArr4[i27] = (((float) (i25 + i23)) * f16) / radians;
                    if (i22 == 0 && i23 == 0) {
                        i8 = i2;
                        i7 = i22;
                        i6 = i23;
                    } else {
                        i8 = i2;
                        i7 = i22;
                        i6 = i23;
                        if (!(i7 == i8 && i6 == 1)) {
                            fArr = fArr4;
                            i5 = 2;
                            i15 = i28;
                            i14 = i26;
                            i19 = i6 + 1;
                            i10 = i8;
                            i17 = i7;
                            fArr3 = fArr;
                            i20 = i5;
                            i13 = i25;
                            i11 = i4;
                            f9 = f15;
                            f8 = f16;
                            f12 = f17;
                        }
                    }
                    System.arraycopy(fArr2, i26 - 3, fArr2, i26, 3);
                    i26 += 3;
                    fArr = fArr4;
                    i5 = 2;
                    System.arraycopy(fArr, i28 - 2, fArr, i28, 2);
                    i28 += 2;
                    i15 = i28;
                    i14 = i26;
                    i19 = i6 + 1;
                    i10 = i8;
                    i17 = i7;
                    fArr3 = fArr;
                    i20 = i5;
                    i13 = i25;
                    i11 = i4;
                    f9 = f15;
                    f8 = f16;
                    f12 = f17;
                }
                float f18 = f8;
                float f19 = f9;
                int i29 = i11;
                float f20 = f12;
                int i30 = i13;
                int i31 = i17;
                int i32 = i10;
                int i33 = i20;
                float[] fArr5 = fArr3;
                int i34 = i31 + 1;
                f11 = f13;
                i16 = i18;
                i11 = i29;
                f8 = f18;
                f12 = f20;
                int i35 = i34;
                i10 = i32;
                i17 = i35;
            }
            i9 = i;
            i13 = i16;
        }
        return new yw4(new C3698a(new C3699b(0, fArr2, fArr3, 1)), i3);
    }

    /* renamed from: b */
    public static yw4 m30844b(int i) {
        return m30843a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public yw4(C3698a aVar, C3698a aVar2, int i) {
        this.f20390a = aVar;
        this.f20391b = aVar2;
        this.f20392c = i;
        this.f20393d = aVar == aVar2;
    }
}
