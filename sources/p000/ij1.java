package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ij1 */
/* compiled from: DrawableCompat */
public final class ij1 {

    /* renamed from: ij1$a */
    /* compiled from: DrawableCompat */
    public static class C2546a {
        /* renamed from: a */
        public static int m19660a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m19661b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        public static Drawable m19662c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m19663d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m19664e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: ij1$b */
    /* compiled from: DrawableCompat */
    public static class C2547b {
        /* renamed from: a */
        public static void m19665a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m19666b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m19667c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m19668d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m19669e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        public static void m19670f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m19671g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        public static void m19672h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m19673i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: ij1$c */
    /* compiled from: DrawableCompat */
    public static class C2548c {
        /* renamed from: a */
        public static int m19674a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m19675b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m19642a(Drawable drawable, Resources.Theme theme) {
        C2547b.m19665a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m19643b(Drawable drawable) {
        return C2547b.m19666b(drawable);
    }

    /* renamed from: c */
    public static void m19644c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m19645d(Drawable drawable) {
        return C2546a.m19660a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m19646e(Drawable drawable) {
        return C2547b.m19667c(drawable);
    }

    /* renamed from: f */
    public static int m19647f(Drawable drawable) {
        return C2548c.m19674a(drawable);
    }

    /* renamed from: g */
    public static void m19648g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C2547b.m19668d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m19649h(Drawable drawable) {
        return C2546a.m19663d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m19650i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m19651j(Drawable drawable, boolean z) {
        C2546a.m19664e(drawable, z);
    }

    /* renamed from: k */
    public static void m19652k(Drawable drawable, float f, float f2) {
        C2547b.m19669e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m19653l(Drawable drawable, int i, int i2, int i3, int i4) {
        C2547b.m19670f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m19654m(Drawable drawable, int i) {
        return C2548c.m19675b(drawable, i);
    }

    /* renamed from: n */
    public static void m19655n(Drawable drawable, int i) {
        C2547b.m19671g(drawable, i);
    }

    /* renamed from: o */
    public static void m19656o(Drawable drawable, ColorStateList colorStateList) {
        C2547b.m19672h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m19657p(Drawable drawable, PorterDuff.Mode mode) {
        C2547b.m19673i(drawable, mode);
    }

    /* renamed from: q */
    public static <T extends Drawable> T m19658q(Drawable drawable) {
        if (drawable instanceof nn7) {
            return ((nn7) drawable).mo23756a();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m19659r(Drawable drawable) {
        return drawable;
    }
}
