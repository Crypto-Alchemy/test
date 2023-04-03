package p000;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: qf2 */
/* compiled from: GestureDetectorCompat */
public final class qf2 {

    /* renamed from: a */
    public final C3143a f16933a;

    /* renamed from: qf2$a */
    /* compiled from: GestureDetectorCompat */
    public interface C3143a {
        /* renamed from: b */
        boolean mo25091b(MotionEvent motionEvent);
    }

    /* renamed from: qf2$b */
    /* compiled from: GestureDetectorCompat */
    public static class C3144b implements C3143a {

        /* renamed from: a */
        public final GestureDetector f16934a;

        public C3144b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f16934a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: b */
        public boolean mo25091b(MotionEvent motionEvent) {
            return this.f16934a.onTouchEvent(motionEvent);
        }
    }

    public qf2(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    /* renamed from: a */
    public boolean mo25090a(MotionEvent motionEvent) {
        return this.f16933a.mo25091b(motionEvent);
    }

    public qf2(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f16933a = new C3144b(context, onGestureListener, handler);
    }
}
