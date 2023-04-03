package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: kr4 */
/* compiled from: PointerIconCompat */
public final class kr4 {

    /* renamed from: a */
    public final PointerIcon f14297a;

    /* renamed from: kr4$a */
    /* compiled from: PointerIconCompat */
    public static class C2726a {
        /* renamed from: a */
        public static PointerIcon m21022a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        public static PointerIcon m21023b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        public static PointerIcon m21024c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public kr4(PointerIcon pointerIcon) {
        this.f14297a = pointerIcon;
    }

    /* renamed from: b */
    public static kr4 m21020b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new kr4(C2726a.m21023b(context, i));
        }
        return new kr4((PointerIcon) null);
    }

    /* renamed from: a */
    public Object mo22516a() {
        return this.f14297a;
    }
}
