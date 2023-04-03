package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ul5 */
/* compiled from: ScaleGestureDetectorFixed */
public class ul5 extends ScaleGestureDetector {

    /* renamed from: a */
    public float f18530a;

    /* renamed from: b */
    public float f18531b;

    public ul5(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener) {
        super(context, onScaleGestureListener);
        mo26826b();
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo26825a() {
        if (!isQuickScaleEnabled() || getCurrentSpan() != getCurrentSpanY()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo26826b() {
        long currentTimeMillis = System.currentTimeMillis();
        MotionEvent obtain = MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
        onTouchEvent(obtain);
        obtain.recycle();
    }

    public float getScaleFactor() {
        float scaleFactor = super.getScaleFactor();
        if (!mo26825a()) {
            return scaleFactor;
        }
        float f = this.f18530a;
        float f2 = this.f18531b;
        if ((f <= f2 || scaleFactor <= 1.0f) && (f >= f2 || scaleFactor >= 1.0f)) {
            return 1.0f;
        }
        return Math.max(0.8f, Math.min(scaleFactor, 1.25f));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f18531b = this.f18530a;
        this.f18530a = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.f18531b = motionEvent.getY();
        }
        return onTouchEvent;
    }
}
