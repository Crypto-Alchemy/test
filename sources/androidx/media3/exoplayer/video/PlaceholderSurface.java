package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;

public final class PlaceholderSurface extends Surface {

    /* renamed from: g */
    public static int f5484g;

    /* renamed from: k */
    public static boolean f5485k;

    /* renamed from: a */
    public final boolean f5486a;

    /* renamed from: d */
    public final C1026b f5487d;

    /* renamed from: e */
    public boolean f5488e;

    /* renamed from: androidx.media3.exoplayer.video.PlaceholderSurface$b */
    public static class C1026b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        public EGLSurfaceTexture f5489a;

        /* renamed from: d */
        public Handler f5490d;

        /* renamed from: e */
        public Error f5491e;

        /* renamed from: g */
        public RuntimeException f5492g;

        /* renamed from: k */
        public PlaceholderSurface f5493k;

        public C1026b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        public PlaceholderSurface mo7835a(int i) {
            boolean z;
            start();
            this.f5490d = new Handler(getLooper(), this);
            this.f5489a = new EGLSurfaceTexture(this.f5490d);
            synchronized (this) {
                z = false;
                this.f5490d.obtainMessage(1, i, 0).sendToTarget();
                while (this.f5493k == null && this.f5492g == null && this.f5491e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f5492g;
            if (runtimeException == null) {
                Error error = this.f5491e;
                if (error == null) {
                    return (PlaceholderSurface) C2725kr.m20985e(this.f5493k);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: b */
        public final void mo7836b(int i) {
            boolean z;
            C2725kr.m20985e(this.f5489a);
            this.f5489a.mo6928h(i);
            SurfaceTexture g = this.f5489a.mo6927g();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5493k = new PlaceholderSurface(this, g, z);
        }

        /* renamed from: c */
        public void mo7837c() {
            C2725kr.m20985e(this.f5490d);
            this.f5490d.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void mo7838d() {
            C2725kr.m20985e(this.f5489a);
            this.f5489a.mo6929i();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    mo7836b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    gk3.m18127d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f5492g = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        gk3.m18127d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.f5491e = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    mo7838d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static int m7572a(Context context) {
        if (!GlUtil.m5875h(context)) {
            return 0;
        }
        if (GlUtil.m5876i()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static synchronized boolean m7573b(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            z = true;
            if (!f5485k) {
                f5484g = m7572a(context);
                f5485k = true;
            }
            if (f5484g == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public static PlaceholderSurface m7574c(Context context, boolean z) {
        boolean z2;
        int i = 0;
        if (!z || m7573b(context)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20987g(z2);
        C1026b bVar = new C1026b();
        if (z) {
            i = f5484g;
        }
        return bVar.mo7835a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f5487d) {
            if (!this.f5488e) {
                this.f5487d.mo7837c();
                this.f5488e = true;
            }
        }
    }

    public PlaceholderSurface(C1026b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f5487d = bVar;
        this.f5486a = z;
    }
}
