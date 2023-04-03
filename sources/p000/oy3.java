package p000;

import android.view.MotionEvent;

/* renamed from: oy3 */
/* compiled from: MotionEventCompat */
public final class oy3 {
    /* renamed from: a */
    public static boolean m24440a(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }
}
