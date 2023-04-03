package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0005"}, mo44877d2 = {"", "", "a", "", "b", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/math/MathKt")
/* renamed from: ap3 */
/* compiled from: MathJVM.kt */
public class ap3 extends zo3 {
    /* renamed from: a */
    public static final int m31898a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    /* renamed from: b */
    public static final int m31899b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
