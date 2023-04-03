package p000;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vg2 */
/* compiled from: GlProgram */
public final class vg2 {

    /* renamed from: a */
    public final int f18773a;

    /* renamed from: b */
    public final C3484a[] f18774b;

    /* renamed from: c */
    public final C3485b[] f18775c;

    /* renamed from: d */
    public final Map<String, C3484a> f18776d;

    /* renamed from: e */
    public final Map<String, C3485b> f18777e;

    /* renamed from: vg2$a */
    /* compiled from: GlProgram */
    public static final class C3484a {

        /* renamed from: a */
        public final String f18778a;

        /* renamed from: b */
        public final int f18779b;

        /* renamed from: c */
        public final int f18780c;

        public C3484a(String str, int i, int i2) {
            this.f18778a = str;
            this.f18779b = i;
            this.f18780c = i2;
        }

        /* renamed from: a */
        public static C3484a m28802a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, vg2.m28797h(bArr));
            return new C3484a(str, i2, vg2.m28796f(i, str));
        }
    }

    /* renamed from: vg2$b */
    /* compiled from: GlProgram */
    public static final class C3485b {

        /* renamed from: a */
        public final String f18781a;

        /* renamed from: b */
        public final int f18782b;

        /* renamed from: c */
        public final int f18783c;

        /* renamed from: d */
        public final float[] f18784d = new float[16];

        public C3485b(String str, int i, int i2) {
            this.f18781a = str;
            this.f18782b = i;
            this.f18783c = i2;
        }

        /* renamed from: a */
        public static C3485b m28803a(int i, int i2) {
            int i3 = i;
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i4 = iArr[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveUniform(i, i2, i4, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, vg2.m28797h(bArr));
            return new C3485b(str, vg2.m28798i(i, str), iArr2[0]);
        }
    }

    public vg2(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f18773a = glCreateProgram;
        GlUtil.m5870c();
        m28795d(glCreateProgram, 35633, str);
        m28795d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.m5877j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.f18776d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f18774b = new C3484a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C3484a a = C3484a.m28802a(this.f18773a, i);
            this.f18774b[i] = a;
            this.f18776d.put(a.f18778a, a);
        }
        this.f18777e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f18773a, 35718, iArr3, 0);
        this.f18775c = new C3485b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C3485b a2 = C3485b.m28803a(this.f18773a, i2);
            this.f18775c[i2] = a2;
            this.f18777e.put(a2.f18781a, a2);
        }
        GlUtil.m5870c();
    }

    /* renamed from: d */
    public static void m28795d(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.m5877j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.m5870c();
    }

    /* renamed from: f */
    public static int m28796f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* renamed from: h */
    public static int m28797h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* renamed from: i */
    public static int m28798i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    /* renamed from: e */
    public int mo27145e(String str) {
        int g = mo27146g(str);
        GLES20.glEnableVertexAttribArray(g);
        GlUtil.m5870c();
        return g;
    }

    /* renamed from: g */
    public final int mo27146g(String str) {
        return m28796f(this.f18773a, str);
    }

    /* renamed from: j */
    public int mo27147j(String str) {
        return m28798i(this.f18773a, str);
    }
}
