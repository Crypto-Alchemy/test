package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.C1030a;

/* renamed from: androidx.media3.exoplayer.video.spherical.b */
/* compiled from: TouchTracker */
public final class C1032b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C1030a.C1031a {

    /* renamed from: a */
    public final PointF f5540a = new PointF();

    /* renamed from: d */
    public final PointF f5541d = new PointF();

    /* renamed from: e */
    public final C1033a f5542e;

    /* renamed from: g */
    public final float f5543g;

    /* renamed from: k */
    public final GestureDetector f5544k;

    /* renamed from: r */
    public volatile float f5545r;

    /* renamed from: androidx.media3.exoplayer.video.spherical.b$a */
    /* compiled from: TouchTracker */
    public interface C1033a {
        /* renamed from: b */
        void mo7860b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public C1032b(Context context, C1033a aVar, float f) {
        this.f5542e = aVar;
        this.f5543g = f;
        this.f5544k = new GestureDetector(context, this);
        this.f5545r = 3.1415927f;
    }

    /* renamed from: a */
    public void mo7859a(float[] fArr, float f) {
        this.f5545r = -f;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f5540a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f5540a.x) / this.f5543g;
        float y = motionEvent2.getY();
        PointF pointF = this.f5540a;
        float f3 = (y - pointF.y) / this.f5543g;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f5545r;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f5541d;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f5542e.mo7860b(this.f5541d);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f5542e.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f5544k.onTouchEvent(motionEvent);
    }
}
