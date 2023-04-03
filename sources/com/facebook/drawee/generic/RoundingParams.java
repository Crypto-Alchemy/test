package com.facebook.drawee.generic;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

public class RoundingParams {

    /* renamed from: a */
    public RoundingMethod f9564a = RoundingMethod.BITMAP_ONLY;

    /* renamed from: b */
    public boolean f9565b = false;

    /* renamed from: c */
    public float[] f9566c = null;

    /* renamed from: d */
    public int f9567d = 0;

    /* renamed from: e */
    public float f9568e = Utils.FLOAT_EPSILON;

    /* renamed from: f */
    public int f9569f = 0;

    /* renamed from: g */
    public float f9570g = Utils.FLOAT_EPSILON;

    /* renamed from: h */
    public boolean f9571h = false;

    /* renamed from: i */
    public boolean f9572i = false;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public int mo13253a() {
        return this.f9569f;
    }

    /* renamed from: b */
    public float mo13254b() {
        return this.f9568e;
    }

    /* renamed from: c */
    public float[] mo13255c() {
        return this.f9566c;
    }

    /* renamed from: d */
    public final float[] mo13256d() {
        if (this.f9566c == null) {
            this.f9566c = new float[8];
        }
        return this.f9566c;
    }

    /* renamed from: e */
    public int mo13257e() {
        return this.f9567d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f9565b == roundingParams.f9565b && this.f9567d == roundingParams.f9567d && Float.compare(roundingParams.f9568e, this.f9568e) == 0 && this.f9569f == roundingParams.f9569f && Float.compare(roundingParams.f9570g, this.f9570g) == 0 && this.f9564a == roundingParams.f9564a && this.f9571h == roundingParams.f9571h && this.f9572i == roundingParams.f9572i) {
            return Arrays.equals(this.f9566c, roundingParams.f9566c);
        }
        return false;
    }

    /* renamed from: f */
    public float mo13259f() {
        return this.f9570g;
    }

    /* renamed from: g */
    public boolean mo13260g() {
        return this.f9572i;
    }

    /* renamed from: h */
    public boolean mo13261h() {
        return this.f9565b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        RoundingMethod roundingMethod = this.f9564a;
        int i4 = 0;
        if (roundingMethod != null) {
            i = roundingMethod.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f9565b ? 1 : 0)) * 31;
        float[] fArr = this.f9566c;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f9567d) * 31;
        float f = this.f9568e;
        if (f != Utils.FLOAT_EPSILON) {
            i3 = Float.floatToIntBits(f);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f9569f) * 31;
        float f2 = this.f9570g;
        if (f2 != Utils.FLOAT_EPSILON) {
            i4 = Float.floatToIntBits(f2);
        }
        return ((((i7 + i4) * 31) + (this.f9571h ? 1 : 0)) * 31) + (this.f9572i ? 1 : 0);
    }

    /* renamed from: i */
    public RoundingMethod mo13263i() {
        return this.f9564a;
    }

    /* renamed from: j */
    public boolean mo13264j() {
        return this.f9571h;
    }

    /* renamed from: k */
    public RoundingParams mo13265k(int i) {
        this.f9569f = i;
        return this;
    }

    /* renamed from: l */
    public RoundingParams mo13266l(float f) {
        boolean z;
        if (f >= Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        au4.m10788c(z, "the border width cannot be < 0");
        this.f9568e = f;
        return this;
    }

    /* renamed from: m */
    public RoundingParams mo13267m(float f, float f2, float f3, float f4) {
        float[] d = mo13256d();
        d[1] = f;
        d[0] = f;
        d[3] = f2;
        d[2] = f2;
        d[5] = f3;
        d[4] = f3;
        d[7] = f4;
        d[6] = f4;
        return this;
    }

    /* renamed from: n */
    public RoundingParams mo13268n(int i) {
        this.f9567d = i;
        this.f9564a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: o */
    public RoundingParams mo13269o(float f) {
        boolean z;
        if (f >= Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        au4.m10788c(z, "the padding cannot be < 0");
        this.f9570g = f;
        return this;
    }

    /* renamed from: p */
    public RoundingParams mo13270p(boolean z) {
        this.f9565b = z;
        return this;
    }
}
