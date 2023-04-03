package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0004"}, mo44877d2 = {"Lfp3;", "", "a", "([F)Z", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: jp3 */
/* compiled from: Matrix.kt */
public final class jp3 {
    /* renamed from: a */
    public static final boolean m20329a(float[] fArr) {
        float f;
        boolean z;
        vx2.m53591g(fArr, "$this$isIdentity");
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = Utils.FLOAT_EPSILON;
                }
                if (fArr[(i * 4) + i2] == f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }
}
