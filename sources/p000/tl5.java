package p000;

import android.view.ScaleGestureDetector;

/* renamed from: tl5 */
/* compiled from: ScaleGestureDetectorCompat */
public final class tl5 {

    /* renamed from: tl5$a */
    /* compiled from: ScaleGestureDetectorCompat */
    public static class C3374a {
        /* renamed from: a */
        public static boolean m27816a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        /* renamed from: b */
        public static void m27817b(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m27815a(ScaleGestureDetector scaleGestureDetector, boolean z) {
        C3374a.m27817b(scaleGestureDetector, z);
    }
}
