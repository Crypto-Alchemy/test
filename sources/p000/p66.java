package p000;

import android.graphics.SurfaceTexture;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* renamed from: p66 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p66 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SphericalGLSurfaceView f16323a;

    /* renamed from: d */
    public final /* synthetic */ SurfaceTexture f16324d;

    public /* synthetic */ p66(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        this.f16323a = sphericalGLSurfaceView;
        this.f16324d = surfaceTexture;
    }

    public final void run() {
        this.f16323a.m7585f(this.f16324d);
    }
}
