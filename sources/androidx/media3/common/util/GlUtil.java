package androidx.media3.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class GlUtil {

    /* renamed from: a */
    public static boolean f4485a = false;

    /* renamed from: b */
    public static final int[] f4486b = {12344};

    /* renamed from: c */
    public static final int[] f4487c = {12445, 13120, 12344};

    /* renamed from: d */
    public static final int[] f4488d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: e */
    public static final int[] f4489e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m5868a(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        m5870c();
        GLES20.glTexParameteri(i, 10240, 9729);
        m5870c();
        GLES20.glTexParameteri(i, 10241, 9729);
        m5870c();
        GLES20.glTexParameteri(i, 10242, 33071);
        m5870c();
        GLES20.glTexParameteri(i, 10243, 33071);
        m5870c();
    }

    /* renamed from: b */
    public static void m5869b(boolean z, String str) {
        if (!z) {
            m5877j(str);
        }
    }

    /* renamed from: c */
    public static void m5870c() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            gk3.m18126c("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            m5877j("glError: " + GLU.gluErrorString(i));
        }
    }

    /* renamed from: d */
    public static FloatBuffer m5871d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: e */
    public static FloatBuffer m5872e(float[] fArr) {
        return (FloatBuffer) m5871d(fArr.length).put(fArr).flip();
    }

    /* renamed from: f */
    public static int m5873f() {
        int g = m5874g();
        m5868a(36197, g);
        return g;
    }

    /* renamed from: g */
    public static int m5874g() {
        m5869b(!w67.m29346c(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m5870c();
        return iArr[0];
    }

    /* renamed from: h */
    public static boolean m5875h(Context context) {
        String eglQueryString;
        int i = w67.f19021a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(w67.f19023c) || "XT1650".equals(w67.f19024d))) {
            return false;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m5876i() {
        String eglQueryString;
        if (w67.f19021a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static void m5877j(String str) {
        if (!f4485a) {
            gk3.m18126c("GlUtil", str);
            return;
        }
        throw new GlException(str);
    }
}
