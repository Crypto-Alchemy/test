package p000;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: df7 */
/* compiled from: ViewUtilsBase */
public class df7 {

    /* renamed from: a */
    public static Field f10704a;

    /* renamed from: b */
    public static boolean f10705b;

    /* renamed from: a */
    public void mo18759a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo12053b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo18760c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo12054d(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: e */
    public void mo12055e(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: f */
    public void mo12056f(View view, float f) {
        throw null;
    }

    /* renamed from: g */
    public void mo11638g(View view, int i) {
        if (!f10705b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f10704a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10705b = true;
        }
        Field field = f10704a;
        if (field != null) {
            try {
                f10704a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo12057h(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: i */
    public void mo12058i(View view, Matrix matrix) {
        throw null;
    }
}
