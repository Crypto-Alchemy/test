package p000;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.C0792h;
import androidx.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* renamed from: km5 */
/* compiled from: SceneRenderer */
public final class km5 implements k97, ba0 {

    /* renamed from: A */
    public SurfaceTexture f14201A;

    /* renamed from: B */
    public volatile int f14202B = 0;

    /* renamed from: C */
    public int f14203C = -1;

    /* renamed from: H */
    public byte[] f14204H;

    /* renamed from: a */
    public final AtomicBoolean f14205a = new AtomicBoolean();

    /* renamed from: d */
    public final AtomicBoolean f14206d = new AtomicBoolean(true);

    /* renamed from: e */
    public final ax4 f14207e = new ax4();

    /* renamed from: g */
    public final ub2 f14208g = new ub2();

    /* renamed from: k */
    public final mq6<Long> f14209k = new mq6<>();

    /* renamed from: r */
    public final mq6<yw4> f14210r = new mq6<>();

    /* renamed from: s */
    public final float[] f14211s = new float[16];

    /* renamed from: x */
    public final float[] f14212x = new float[16];

    /* renamed from: y */
    public int f14213y;

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m20904g(SurfaceTexture surfaceTexture) {
        this.f14205a.set(true);
    }

    /* renamed from: a */
    public void mo11460a(long j, float[] fArr) {
        this.f14208g.mo26728e(j, fArr);
    }

    /* renamed from: b */
    public void mo11461b() {
        this.f14209k.mo23306c();
        this.f14208g.mo26727d();
        this.f14206d.set(true);
    }

    /* renamed from: d */
    public void mo22236d(long j, long j2, C0792h hVar, MediaFormat mediaFormat) {
        this.f14209k.mo23304a(j2, Long.valueOf(j));
        mo22410i(hVar.f4185Z, hVar.f4190e0, j2);
    }

    /* renamed from: e */
    public void mo22407e(float[] fArr, boolean z) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        GlUtil.m5870c();
        if (this.f14205a.compareAndSet(true, false)) {
            ((SurfaceTexture) C2725kr.m20985e(this.f14201A)).updateTexImage();
            GlUtil.m5870c();
            if (this.f14206d.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f14211s, 0);
            }
            long timestamp = this.f14201A.getTimestamp();
            Long g = this.f14209k.mo23309g(timestamp);
            if (g != null) {
                this.f14208g.mo26726c(this.f14211s, g.longValue());
            }
            yw4 j = this.f14210r.mo23312j(timestamp);
            if (j != null) {
                this.f14207e.mo11292d(j);
            }
        }
        Matrix.multiplyMM(this.f14212x, 0, fArr, 0, this.f14211s, 0);
        this.f14207e.mo11290a(this.f14213y, this.f14212x, z);
    }

    /* renamed from: f */
    public SurfaceTexture mo22408f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.m5870c();
        this.f14207e.mo11291b();
        GlUtil.m5870c();
        this.f14213y = GlUtil.m5873f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14213y);
        this.f14201A = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new jm5(this));
        return this.f14201A;
    }

    /* renamed from: h */
    public void mo22409h(int i) {
        this.f14202B = i;
    }

    /* renamed from: i */
    public final void mo22410i(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f14204H;
        int i2 = this.f14203C;
        this.f14204H = bArr;
        if (i == -1) {
            i = this.f14202B;
        }
        this.f14203C = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f14204H)) {
            yw4 yw4 = null;
            byte[] bArr3 = this.f14204H;
            if (bArr3 != null) {
                yw4 = zw4.m31556a(bArr3, this.f14203C);
            }
            if (yw4 == null || !ax4.m10983c(yw4)) {
                yw4 = yw4.m30844b(this.f14203C);
            }
            this.f14210r.mo23304a(j, yw4);
        }
    }
}
