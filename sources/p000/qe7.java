package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: qe7 */
/* compiled from: ViewUtils */
public class qe7 {

    /* renamed from: a */
    public static final df7 f16929a;

    /* renamed from: b */
    public static final Property<View, Float> f16930b = new C3140a(Float.class, "translationAlpha");

    /* renamed from: c */
    public static final Property<View, Rect> f16931c = new C3141b(Rect.class, "clipBounds");

    /* renamed from: qe7$a */
    /* compiled from: ViewUtils */
    public static class C3140a extends Property<View, Float> {
        public C3140a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(qe7.m25627c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            qe7.m25632h(view, f.floatValue());
        }
    }

    /* renamed from: qe7$b */
    /* compiled from: ViewUtils */
    public static class C3141b extends Property<View, Rect> {
        public C3141b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return ga7.m17794u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            ga7.m17799w0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f16929a = new cf7();
        } else {
            f16929a = new bf7();
        }
    }

    /* renamed from: a */
    public static void m25625a(View view) {
        f16929a.mo18759a(view);
    }

    /* renamed from: b */
    public static od7 m25626b(View view) {
        return new md7(view);
    }

    /* renamed from: c */
    public static float m25627c(View view) {
        return f16929a.mo12053b(view);
    }

    /* renamed from: d */
    public static el7 m25628d(View view) {
        return new dl7(view);
    }

    /* renamed from: e */
    public static void m25629e(View view) {
        f16929a.mo18760c(view);
    }

    /* renamed from: f */
    public static void m25630f(View view, Matrix matrix) {
        f16929a.mo12054d(view, matrix);
    }

    /* renamed from: g */
    public static void m25631g(View view, int i, int i2, int i3, int i4) {
        f16929a.mo12055e(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    public static void m25632h(View view, float f) {
        f16929a.mo12056f(view, f);
    }

    /* renamed from: i */
    public static void m25633i(View view, int i) {
        f16929a.mo11638g(view, i);
    }

    /* renamed from: j */
    public static void m25634j(View view, Matrix matrix) {
        f16929a.mo12057h(view, matrix);
    }

    /* renamed from: k */
    public static void m25635k(View view, Matrix matrix) {
        f16929a.mo12058i(view, matrix);
    }
}
