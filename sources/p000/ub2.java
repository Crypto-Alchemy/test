package p000;

import android.opengl.Matrix;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ub2 */
/* compiled from: FrameRotationQueue */
public final class ub2 {

    /* renamed from: a */
    public final float[] f18416a = new float[16];

    /* renamed from: b */
    public final float[] f18417b = new float[16];

    /* renamed from: c */
    public final mq6<float[]> f18418c = new mq6<>();

    /* renamed from: d */
    public boolean f18419d;

    /* renamed from: a */
    public static void m28130a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    /* renamed from: b */
    public static void m28131b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != Utils.FLOAT_EPSILON) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: c */
    public boolean mo26726c(float[] fArr, long j) {
        float[] j2 = this.f18418c.mo23312j(j);
        if (j2 == null) {
            return false;
        }
        m28131b(this.f18417b, j2);
        if (!this.f18419d) {
            m28130a(this.f18416a, this.f18417b);
            this.f18419d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f18416a, 0, this.f18417b, 0);
        return true;
    }

    /* renamed from: d */
    public void mo26727d() {
        this.f18418c.mo23306c();
        this.f18419d = false;
    }

    /* renamed from: e */
    public void mo26728e(long j, float[] fArr) {
        this.f18418c.mo23304a(j, fArr);
    }
}
