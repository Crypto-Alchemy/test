package p000;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import com.github.mikephil.charting.utils.Utils;
import java.nio.FloatBuffer;
import p000.yw4;

/* renamed from: ax4 */
/* compiled from: ProjectionRenderer */
public final class ax4 {

    /* renamed from: j */
    public static final float[] f7865j = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};

    /* renamed from: k */
    public static final float[] f7866k = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, 1.0f};

    /* renamed from: l */
    public static final float[] f7867l = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};

    /* renamed from: m */
    public static final float[] f7868m = {0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};

    /* renamed from: n */
    public static final float[] f7869n = {0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f7870a;

    /* renamed from: b */
    public C1596a f7871b;

    /* renamed from: c */
    public C1596a f7872c;

    /* renamed from: d */
    public vg2 f7873d;

    /* renamed from: e */
    public int f7874e;

    /* renamed from: f */
    public int f7875f;

    /* renamed from: g */
    public int f7876g;

    /* renamed from: h */
    public int f7877h;

    /* renamed from: i */
    public int f7878i;

    /* renamed from: ax4$a */
    /* compiled from: ProjectionRenderer */
    public static class C1596a {

        /* renamed from: a */
        public final int f7879a;

        /* renamed from: b */
        public final FloatBuffer f7880b;

        /* renamed from: c */
        public final FloatBuffer f7881c;

        /* renamed from: d */
        public final int f7882d;

        public C1596a(yw4.C3699b bVar) {
            this.f7879a = bVar.mo28265a();
            this.f7880b = GlUtil.m5872e(bVar.f20397c);
            this.f7881c = GlUtil.m5872e(bVar.f20398d);
            int i = bVar.f20396b;
            if (i == 1) {
                this.f7882d = 5;
            } else if (i != 2) {
                this.f7882d = 4;
            } else {
                this.f7882d = 6;
            }
        }
    }

    /* renamed from: c */
    public static boolean m10983c(yw4 yw4) {
        yw4.C3698a aVar = yw4.f20390a;
        yw4.C3698a aVar2 = yw4.f20391b;
        if (aVar.mo28264b() == 1 && aVar.mo28263a(0).f20395a == 0 && aVar2.mo28264b() == 1 && aVar2.mo28263a(0).f20395a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo11290a(int i, float[] fArr, boolean z) {
        C1596a aVar;
        float[] fArr2;
        if (z) {
            aVar = this.f7872c;
        } else {
            aVar = this.f7871b;
        }
        if (aVar != null) {
            int i2 = this.f7870a;
            if (i2 == 1) {
                if (z) {
                    fArr2 = f7867l;
                } else {
                    fArr2 = f7866k;
                }
            } else if (i2 != 2) {
                fArr2 = f7865j;
            } else if (z) {
                fArr2 = f7869n;
            } else {
                fArr2 = f7868m;
            }
            GLES20.glUniformMatrix3fv(this.f7875f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f7874e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f7878i, 0);
            GlUtil.m5870c();
            GLES20.glVertexAttribPointer(this.f7876g, 3, 5126, false, 12, aVar.f7880b);
            GlUtil.m5870c();
            GLES20.glVertexAttribPointer(this.f7877h, 2, 5126, false, 8, aVar.f7881c);
            GlUtil.m5870c();
            GLES20.glDrawArrays(aVar.f7882d, 0, aVar.f7879a);
            GlUtil.m5870c();
        }
    }

    /* renamed from: b */
    public void mo11291b() {
        vg2 vg2 = new vg2("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.f7873d = vg2;
        this.f7874e = vg2.mo27147j("uMvpMatrix");
        this.f7875f = this.f7873d.mo27147j("uTexMatrix");
        this.f7876g = this.f7873d.mo27145e("aPosition");
        this.f7877h = this.f7873d.mo27145e("aTexCoords");
        this.f7878i = this.f7873d.mo27147j("uTexture");
    }

    /* renamed from: d */
    public void mo11292d(yw4 yw4) {
        if (m10983c(yw4)) {
            this.f7870a = yw4.f20392c;
            C1596a aVar = new C1596a(yw4.f20390a.mo28263a(0));
            this.f7871b = aVar;
            if (!yw4.f20393d) {
                aVar = new C1596a(yw4.f20391b.mo28263a(0));
            }
            this.f7872c = aVar;
        }
    }
}
