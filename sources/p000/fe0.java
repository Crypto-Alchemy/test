package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: fe0 */
/* compiled from: CheckedTextViewCompat */
public final class fe0 {

    /* renamed from: fe0$a */
    /* compiled from: CheckedTextViewCompat */
    public static class C2289a {
        /* renamed from: a */
        public static Drawable m16951a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: fe0$b */
    /* compiled from: CheckedTextViewCompat */
    public static class C2290b {
        /* renamed from: a */
        public static void m16952a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        public static void m16953b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m16948a(CheckedTextView checkedTextView) {
        return C2289a.m16951a(checkedTextView);
    }

    /* renamed from: b */
    public static void m16949b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C2290b.m16952a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m16950c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C2290b.m16953b(checkedTextView, mode);
    }
}
