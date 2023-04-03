package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: x */
    public static final int[] f4477x = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    public final Handler f4478a;

    /* renamed from: d */
    public final int[] f4479d;

    /* renamed from: e */
    public final C0839b f4480e;

    /* renamed from: g */
    public EGLDisplay f4481g;

    /* renamed from: k */
    public EGLContext f4482k;

    /* renamed from: r */
    public EGLSurface f4483r;

    /* renamed from: s */
    public SurfaceTexture f4484s;

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.media3.common.util.EGLSurfaceTexture$b */
    public interface C0839b {
        /* renamed from: a */
        void mo6932a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, (C0839b) null);
    }

    /* renamed from: a */
    public static EGLConfig m5858a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f4477x, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new GlException(w67.m29294A("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    public static EGLContext m5859b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    /* renamed from: c */
    public static EGLSurface m5860c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    /* renamed from: e */
    public static void m5861e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.m5870c();
    }

    /* renamed from: f */
    public static EGLDisplay m5862f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new GlException("eglInitialize failed");
        }
        throw new GlException("eglGetDisplay failed");
    }

    /* renamed from: d */
    public final void mo6926d() {
        C0839b bVar = this.f4480e;
        if (bVar != null) {
            bVar.mo6932a();
        }
    }

    /* renamed from: g */
    public SurfaceTexture mo6927g() {
        return (SurfaceTexture) C2725kr.m20985e(this.f4484s);
    }

    /* renamed from: h */
    public void mo6928h(int i) {
        EGLDisplay f = m5862f();
        this.f4481g = f;
        EGLConfig a = m5858a(f);
        EGLContext b = m5859b(this.f4481g, a, i);
        this.f4482k = b;
        this.f4483r = m5860c(this.f4481g, a, b, i);
        m5861e(this.f4479d);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4479d[0]);
        this.f4484s = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void mo6929i() {
        this.f4478a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f4484s;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f4479d, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f4481g;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f4481g;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f4483r;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4481g, this.f4483r);
            }
            EGLContext eGLContext = this.f4482k;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f4481g, eGLContext);
            }
            if (w67.f19021a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f4481g;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4481g);
            }
            this.f4481g = null;
            this.f4482k = null;
            this.f4483r = null;
            this.f4484s = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4478a.post(this);
    }

    public void run() {
        mo6926d();
        SurfaceTexture surfaceTexture = this.f4484s;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, C0839b bVar) {
        this.f4478a = handler;
        this.f4480e = bVar;
        this.f4479d = new int[1];
    }
}
