package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.media3.exoplayer.video.spherical.a */
/* compiled from: OrientationListener */
public final class C1030a implements SensorEventListener {

    /* renamed from: a */
    public final float[] f5533a = new float[16];

    /* renamed from: b */
    public final float[] f5534b = new float[16];

    /* renamed from: c */
    public final float[] f5535c = new float[16];

    /* renamed from: d */
    public final float[] f5536d = new float[3];

    /* renamed from: e */
    public final Display f5537e;

    /* renamed from: f */
    public final C1031a[] f5538f;

    /* renamed from: g */
    public boolean f5539g;

    /* renamed from: androidx.media3.exoplayer.video.spherical.a$a */
    /* compiled from: OrientationListener */
    public interface C1031a {
        /* renamed from: a */
        void mo7859a(float[] fArr, float f);
    }

    public C1030a(Display display, C1031a... aVarArr) {
        this.f5537e = display;
        this.f5538f = aVarArr;
    }

    /* renamed from: e */
    public static void m7597e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: a */
    public final float mo7869a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f5534b);
        SensorManager.getOrientation(this.f5534b, this.f5536d);
        return this.f5536d[2];
    }

    /* renamed from: b */
    public final void mo7870b(float[] fArr, float f) {
        for (C1031a a : this.f5538f) {
            a.mo7859a(fArr, f);
        }
    }

    /* renamed from: c */
    public final void mo7871c(float[] fArr) {
        if (!this.f5539g) {
            ub2.m28130a(this.f5535c, fArr);
            this.f5539g = true;
        }
        float[] fArr2 = this.f5534b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f5534b, 0, this.f5535c, 0);
    }

    /* renamed from: d */
    public final void mo7872d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 130;
            int i3 = 129;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
                i2 = 129;
            } else if (i == 3) {
                i3 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f5534b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f5534b, i2, i3, fArr);
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f5533a, sensorEvent.values);
        mo7872d(this.f5533a, this.f5537e.getRotation());
        float a = mo7869a(this.f5533a);
        m7597e(this.f5533a);
        mo7871c(this.f5533a);
        mo7870b(this.f5533a, a);
    }
}
