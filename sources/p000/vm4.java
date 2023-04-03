package p000;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: vm4 */
/* compiled from: PathInterpolatorCompat */
public final class vm4 {

    /* renamed from: vm4$a */
    /* compiled from: PathInterpolatorCompat */
    public static class C3498a {
        /* renamed from: a */
        public static PathInterpolator m28893a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        public static PathInterpolator m28894b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        public static PathInterpolator m28895c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m28892a(float f, float f2, float f3, float f4) {
        return C3498a.m28894b(f, f2, f3, f4);
    }
}
