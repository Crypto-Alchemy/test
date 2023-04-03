package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: cs2 */
/* compiled from: ImageViewCompat */
public class cs2 {

    /* renamed from: cs2$a */
    /* compiled from: ImageViewCompat */
    public static class C2118a {
        /* renamed from: a */
        public static ColorStateList m14482a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m14483b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m14484c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m14485d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m14478a(ImageView imageView) {
        return C2118a.m14482a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m14479b(ImageView imageView) {
        return C2118a.m14483b(imageView);
    }

    /* renamed from: c */
    public static void m14480c(ImageView imageView, ColorStateList colorStateList) {
        C2118a.m14484c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m14481d(ImageView imageView, PorterDuff.Mode mode) {
        C2118a.m14485d(imageView, mode);
    }
}
