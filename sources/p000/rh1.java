package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: rh1 */
/* compiled from: DisplayCutoutCompat */
public final class rh1 {

    /* renamed from: a */
    public final DisplayCutout f17248a;

    /* renamed from: rh1$a */
    /* compiled from: DisplayCutoutCompat */
    public static class C3193a {
        /* renamed from: a */
        public static DisplayCutout m26197a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m26198b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        public static int m26199c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        public static int m26200d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        public static int m26201e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        public static int m26202f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public rh1(DisplayCutout displayCutout) {
        this.f17248a = displayCutout;
    }

    /* renamed from: e */
    public static rh1 m26192e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new rh1(displayCutout);
    }

    /* renamed from: a */
    public int mo25378a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3193a.m26199c(this.f17248a);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo25379b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3193a.m26200d(this.f17248a);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo25380c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3193a.m26201e(this.f17248a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo25381d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3193a.m26202f(this.f17248a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rh1.class != obj.getClass()) {
            return false;
        }
        return mf4.m22283a(this.f17248a, ((rh1) obj).f17248a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f17248a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f17248a + "}";
    }
}
