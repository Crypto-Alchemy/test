package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: xl5 */
/* compiled from: ScalingUtils */
public class xl5 {

    /* renamed from: xl5$a */
    /* compiled from: ScalingUtils */
    public static abstract class C3615a implements C3616b {
        /* renamed from: a */
        public Matrix mo27804a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo27805b(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }

        /* renamed from: b */
        public abstract void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: xl5$b */
    /* compiled from: ScalingUtils */
    public interface C3616b {

        /* renamed from: a */
        public static final C3616b f19893a = C3625k.f19912l;

        /* renamed from: b */
        public static final C3616b f19894b = C3624j.f19911l;

        /* renamed from: c */
        public static final C3616b f19895c = C3626l.f19913l;

        /* renamed from: d */
        public static final C3616b f19896d = C3623i.f19910l;

        /* renamed from: e */
        public static final C3616b f19897e = C3621g.f19908l;

        /* renamed from: f */
        public static final C3616b f19898f = C3622h.f19909l;

        /* renamed from: g */
        public static final C3616b f19899g = C3617c.f19904l;

        /* renamed from: h */
        public static final C3616b f19900h = C3619e.f19906l;

        /* renamed from: i */
        public static final C3616b f19901i = C3618d.f19905l;

        /* renamed from: j */
        public static final C3616b f19902j = C3627m.f19914l;

        /* renamed from: k */
        public static final C3616b f19903k = C3620f.f19907l;

        /* renamed from: a */
        Matrix mo27804a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: xl5$c */
    /* compiled from: ScalingUtils */
    public static class C3617c extends C3615a {

        /* renamed from: l */
        public static final C3616b f19904l = new C3617c();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: xl5$d */
    /* compiled from: ScalingUtils */
    public static class C3618d extends C3615a {

        /* renamed from: l */
        public static final C3616b f19905l = new C3618d();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                f5 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
                f5 = (float) rect.left;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: xl5$e */
    /* compiled from: ScalingUtils */
    public static class C3619e extends C3615a {

        /* renamed from: l */
        public static final C3616b f19906l = new C3619e();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: xl5$f */
    /* compiled from: ScalingUtils */
    public static class C3620f extends C3615a {

        /* renamed from: l */
        public static final C3616b f19907l = new C3620f();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: xl5$g */
    /* compiled from: ScalingUtils */
    public static class C3621g extends C3615a {

        /* renamed from: l */
        public static final C3616b f19908l = new C3621g();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: xl5$h */
    /* compiled from: ScalingUtils */
    public static class C3622h extends C3615a {

        /* renamed from: l */
        public static final C3616b f19909l = new C3622h();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + (((float) rect.width()) - (((float) i) * min)) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: xl5$i */
    /* compiled from: ScalingUtils */
    public static class C3623i extends C3615a {

        /* renamed from: l */
        public static final C3616b f19910l = new C3623i();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: xl5$j */
    /* compiled from: ScalingUtils */
    public static class C3624j extends C3615a {

        /* renamed from: l */
        public static final C3616b f19911l = new C3624j();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f);
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* renamed from: xl5$k */
    /* compiled from: ScalingUtils */
    public static class C3625k extends C3615a {

        /* renamed from: l */
        public static final C3616b f19912l = new C3625k();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: xl5$l */
    /* compiled from: ScalingUtils */
    public static class C3626l extends C3615a {

        /* renamed from: l */
        public static final C3616b f19913l = new C3626l();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* renamed from: xl5$m */
    /* compiled from: ScalingUtils */
    public static class C3627m extends C3615a {

        /* renamed from: l */
        public static final C3616b f19914l = new C3627m();

        /* renamed from: b */
        public void mo27805b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), Utils.FLOAT_EPSILON), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                f6 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f8), Utils.FLOAT_EPSILON), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: xl5$n */
    /* compiled from: ScalingUtils */
    public interface C3628n {
        Object getState();
    }

    /* renamed from: a */
    public static vl5 m30190a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof vl5) {
            return (vl5) drawable;
        }
        if (drawable instanceof nj1) {
            return m30190a(((nj1) drawable).mo20787j());
        }
        if (drawable instanceof C2415gq) {
            C2415gq gqVar = (C2415gq) drawable;
            int e = gqVar.mo20765e();
            for (int i = 0; i < e; i++) {
                vl5 a = m30190a(gqVar.mo20762b(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
