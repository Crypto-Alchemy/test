package p000;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: pv2 */
/* compiled from: InsetDialogOnTouchListener */
public class pv2 implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f32843a;

    /* renamed from: d */
    public final int f32844d;

    /* renamed from: e */
    public final int f32845e;

    /* renamed from: g */
    public final int f32846g;

    public pv2(Dialog dialog, Rect rect) {
        this.f32843a = dialog;
        this.f32844d = rect.left;
        this.f32845e = rect.top;
        this.f32846g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f32844d + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f32845e + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f32846g;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f32843a.onTouchEvent(obtain);
    }
}
