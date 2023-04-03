package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.media3.common.util.GlUtil;
import com.github.mikephil.charting.utils.Utils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements j97 {

    /* renamed from: a */
    public final C1027a f5494a;

    /* renamed from: androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView$a */
    public static final class C1027a implements GLSurfaceView.Renderer {

        /* renamed from: B */
        public static final float[] f5495B = {1.164f, 1.164f, 1.164f, Utils.FLOAT_EPSILON, -0.392f, 2.017f, 1.596f, -0.813f, Utils.FLOAT_EPSILON};

        /* renamed from: C */
        public static final float[] f5496C = {1.164f, 1.164f, 1.164f, Utils.FLOAT_EPSILON, -0.213f, 2.112f, 1.793f, -0.533f, Utils.FLOAT_EPSILON};

        /* renamed from: H */
        public static final float[] f5497H = {1.168f, 1.168f, 1.168f, Utils.FLOAT_EPSILON, -0.188f, 2.148f, 1.683f, -0.652f, Utils.FLOAT_EPSILON};

        /* renamed from: I */
        public static final String[] f5498I = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: L */
        public static final FloatBuffer f5499L = GlUtil.m5872e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: A */
        public i97 f5500A;

        /* renamed from: a */
        public final GLSurfaceView f5501a;

        /* renamed from: d */
        public final int[] f5502d = new int[3];

        /* renamed from: e */
        public final int[] f5503e = new int[3];

        /* renamed from: g */
        public final int[] f5504g = new int[3];

        /* renamed from: k */
        public final int[] f5505k = new int[3];

        /* renamed from: r */
        public final AtomicReference<i97> f5506r = new AtomicReference<>();

        /* renamed from: s */
        public final FloatBuffer[] f5507s = new FloatBuffer[3];

        /* renamed from: x */
        public vg2 f5508x;

        /* renamed from: y */
        public int f5509y;

        public C1027a(GLSurfaceView gLSurfaceView) {
            this.f5501a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f5504g;
                this.f5505k[i] = -1;
                iArr[i] = -1;
            }
        }

        /* renamed from: a */
        public void mo7842a(i97 i97) {
            i97 andSet = this.f5506r.getAndSet(i97);
            if (andSet != null) {
                andSet.mo19507v();
            }
            this.f5501a.requestRender();
        }

        @RequiresNonNull({"program"})
        /* renamed from: b */
        public final void mo7843b() {
            GLES20.glGenTextures(3, this.f5502d, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(this.f5508x.mo27147j(f5498I[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GlUtil.m5868a(3553, this.f5502d[i]);
            }
            GlUtil.m5870c();
        }

        public void onDrawFrame(GL10 gl10) {
            boolean z;
            int i;
            i97 andSet = this.f5506r.getAndSet((Object) null);
            if (andSet != null || this.f5500A != null) {
                if (andSet != null) {
                    i97 i97 = this.f5500A;
                    if (i97 != null) {
                        i97.mo19507v();
                    }
                    this.f5500A = andSet;
                }
                i97 i972 = (i97) C2725kr.m20985e(this.f5500A);
                float[] fArr = f5496C;
                int i2 = i972.f13223x;
                if (i2 == 1) {
                    fArr = f5495B;
                } else if (i2 == 3) {
                    fArr = f5497H;
                }
                GLES20.glUniformMatrix3fv(this.f5509y, 1, false, fArr, 0);
                int[] iArr = (int[]) C2725kr.m20985e(i972.f13222s);
                ByteBuffer[] byteBufferArr = (ByteBuffer[]) C2725kr.m20985e(i972.f13221r);
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == 0) {
                        i = i972.f13220k;
                    } else {
                        i = (i972.f13220k + 1) / 2;
                    }
                    GLES20.glActiveTexture(33984 + i3);
                    GLES20.glBindTexture(3553, this.f5502d[i3]);
                    GLES20.glPixelStorei(3317, 1);
                    GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i, 0, 6409, 5121, byteBufferArr[i3]);
                }
                int[] iArr2 = new int[3];
                int i4 = i972.f13219g;
                iArr2[0] = i4;
                int i5 = (i4 + 1) / 2;
                iArr2[2] = i5;
                iArr2[1] = i5;
                for (int i6 = 0; i6 < 3; i6++) {
                    if (this.f5504g[i6] != iArr2[i6] || this.f5505k[i6] != iArr[i6]) {
                        if (iArr[i6] != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C2725kr.m20987g(z);
                        float f = ((float) iArr2[i6]) / ((float) iArr[i6]);
                        this.f5507s[i6] = GlUtil.m5872e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                        GLES20.glVertexAttribPointer(this.f5503e[i6], 2, 5126, false, 0, this.f5507s[i6]);
                        this.f5504g[i6] = iArr2[i6];
                        this.f5505k[i6] = iArr[i6];
                    }
                }
                GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
                GLES20.glDrawArrays(5, 0, 4);
                GlUtil.m5870c();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            vg2 vg2 = new vg2("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f5508x = vg2;
            GLES20.glVertexAttribPointer(vg2.mo27145e("in_pos"), 2, 5126, false, 0, f5499L);
            this.f5503e[0] = this.f5508x.mo27145e("in_tc_y");
            this.f5503e[1] = this.f5508x.mo27145e("in_tc_u");
            this.f5503e[2] = this.f5508x.mo27145e("in_tc_v");
            this.f5509y = this.f5508x.mo27147j("mColorConversion");
            GlUtil.m5870c();
            mo7843b();
            GlUtil.m5870c();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public j97 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(i97 i97) {
        this.f5494a.mo7842a(i97);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1027a aVar = new C1027a(this);
        this.f5494a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
