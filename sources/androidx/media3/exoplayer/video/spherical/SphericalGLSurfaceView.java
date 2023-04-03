package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.spherical.C1030a;
import androidx.media3.exoplayer.video.spherical.C1032b;
import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: A */
    public boolean f5510A;

    /* renamed from: B */
    public boolean f5511B;

    /* renamed from: C */
    public boolean f5512C;

    /* renamed from: a */
    public final CopyOnWriteArrayList<C1029b> f5513a;

    /* renamed from: d */
    public final SensorManager f5514d;

    /* renamed from: e */
    public final Sensor f5515e;

    /* renamed from: g */
    public final C1030a f5516g;

    /* renamed from: k */
    public final Handler f5517k;

    /* renamed from: r */
    public final C1032b f5518r;

    /* renamed from: s */
    public final km5 f5519s;

    /* renamed from: x */
    public SurfaceTexture f5520x;

    /* renamed from: y */
    public Surface f5521y;

    /* renamed from: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$a */
    public final class C1028a implements GLSurfaceView.Renderer, C1032b.C1033a, C1030a.C1031a {

        /* renamed from: A */
        public final float[] f5522A;

        /* renamed from: a */
        public final km5 f5524a;

        /* renamed from: d */
        public final float[] f5525d = new float[16];

        /* renamed from: e */
        public final float[] f5526e = new float[16];

        /* renamed from: g */
        public final float[] f5527g;

        /* renamed from: k */
        public final float[] f5528k;

        /* renamed from: r */
        public final float[] f5529r;

        /* renamed from: s */
        public float f5530s;

        /* renamed from: x */
        public float f5531x;

        /* renamed from: y */
        public final float[] f5532y;

        public C1028a(km5 km5) {
            float[] fArr = new float[16];
            this.f5527g = fArr;
            float[] fArr2 = new float[16];
            this.f5528k = fArr2;
            float[] fArr3 = new float[16];
            this.f5529r = fArr3;
            this.f5532y = new float[16];
            this.f5522A = new float[16];
            this.f5524a = km5;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f5531x = 3.1415927f;
        }

        /* renamed from: a */
        public synchronized void mo7859a(float[] fArr, float f) {
            float[] fArr2 = this.f5527g;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f5531x = -f;
            mo7862d();
        }

        /* renamed from: b */
        public synchronized void mo7860b(PointF pointF) {
            this.f5530s = pointF.y;
            mo7862d();
            Matrix.setRotateM(this.f5529r, 0, -pointF.x, Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON);
        }

        /* renamed from: c */
        public final float mo7861c(float f) {
            boolean z;
            if (f > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        public final void mo7862d() {
            Matrix.setRotateM(this.f5528k, 0, -this.f5530s, (float) Math.cos((double) this.f5531x), (float) Math.sin((double) this.f5531x), Utils.FLOAT_EPSILON);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f5522A, 0, this.f5527g, 0, this.f5529r, 0);
                Matrix.multiplyMM(this.f5532y, 0, this.f5528k, 0, this.f5522A, 0);
            }
            Matrix.multiplyMM(this.f5526e, 0, this.f5525d, 0, this.f5532y, 0);
            this.f5524a.mo22407e(this.f5526e, false);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = ((float) i) / ((float) i2);
            Matrix.perspectiveM(this.f5525d, 0, mo7861c(f), f, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.mo7848g(this.f5524a.mo22408f());
        }
    }

    /* renamed from: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$b */
    public interface C1029b {
        /* renamed from: k */
        void mo7867k(Surface surface);

        /* renamed from: p */
        void mo7868p(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m7584e() {
        Surface surface = this.f5521y;
        if (surface != null) {
            Iterator<C1029b> it = this.f5513a.iterator();
            while (it.hasNext()) {
                it.next().mo7867k(surface);
            }
        }
        m7586h(this.f5520x, surface);
        this.f5520x = null;
        this.f5521y = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m7585f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f5520x;
        Surface surface = this.f5521y;
        Surface surface2 = new Surface(surfaceTexture);
        this.f5520x = surfaceTexture;
        this.f5521y = surface2;
        Iterator<C1029b> it = this.f5513a.iterator();
        while (it.hasNext()) {
            it.next().mo7868p(surface2);
        }
        m7586h(surfaceTexture2, surface);
    }

    /* renamed from: h */
    public static void m7586h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: d */
    public void mo7847d(C1029b bVar) {
        this.f5513a.add(bVar);
    }

    /* renamed from: g */
    public final void mo7848g(SurfaceTexture surfaceTexture) {
        this.f5517k.post(new p66(this, surfaceTexture));
    }

    public ba0 getCameraMotionListener() {
        return this.f5519s;
    }

    public k97 getVideoFrameMetadataListener() {
        return this.f5519s;
    }

    public Surface getVideoSurface() {
        return this.f5521y;
    }

    /* renamed from: i */
    public void mo7852i(C1029b bVar) {
        this.f5513a.remove(bVar);
    }

    /* renamed from: j */
    public final void mo7853j() {
        boolean z;
        if (!this.f5510A || !this.f5511B) {
            z = false;
        } else {
            z = true;
        }
        Sensor sensor = this.f5515e;
        if (sensor != null && z != this.f5512C) {
            if (z) {
                this.f5514d.registerListener(this.f5516g, sensor, 0);
            } else {
                this.f5514d.unregisterListener(this.f5516g);
            }
            this.f5512C = z;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5517k.post(new q66(this));
    }

    public void onPause() {
        this.f5511B = false;
        mo7853j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f5511B = true;
        mo7853j();
    }

    public void setDefaultStereoMode(int i) {
        this.f5519s.mo22409h(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f5510A = z;
        mo7853j();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5513a = new CopyOnWriteArrayList<>();
        this.f5517k = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C2725kr.m20985e(context.getSystemService("sensor"));
        this.f5514d = sensorManager;
        Sensor defaultSensor = w67.f19021a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f5515e = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        km5 km5 = new km5();
        this.f5519s = km5;
        C1028a aVar = new C1028a(km5);
        C1032b bVar = new C1032b(context, aVar, 25.0f);
        this.f5518r = bVar;
        this.f5516g = new C1030a(((WindowManager) C2725kr.m20985e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), bVar, aVar);
        this.f5510A = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }
}
