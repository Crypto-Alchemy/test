package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: pf2 */
/* compiled from: GestureDetector */
public class pf2 {

    /* renamed from: a */
    public C3053a f16422a;

    /* renamed from: b */
    public final float f16423b;

    /* renamed from: c */
    public boolean f16424c;

    /* renamed from: d */
    public boolean f16425d;

    /* renamed from: e */
    public long f16426e;

    /* renamed from: f */
    public float f16427f;

    /* renamed from: g */
    public float f16428g;

    /* renamed from: pf2$a */
    /* compiled from: GestureDetector */
    public interface C3053a {
        /* renamed from: d */
        boolean mo11392d();
    }

    public pf2(Context context) {
        this.f16423b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo24548a();
    }

    /* renamed from: c */
    public static pf2 m24858c(Context context) {
        return new pf2(context);
    }

    /* renamed from: a */
    public void mo24548a() {
        this.f16422a = null;
        mo24551e();
    }

    /* renamed from: b */
    public boolean mo24549b() {
        return this.f16424c;
    }

    /* renamed from: d */
    public boolean mo24550d(MotionEvent motionEvent) {
        C3053a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16424c = true;
            this.f16425d = true;
            this.f16426e = motionEvent.getEventTime();
            this.f16427f = motionEvent.getX();
            this.f16428g = motionEvent.getY();
        } else if (action == 1) {
            this.f16424c = false;
            if (Math.abs(motionEvent.getX() - this.f16427f) > this.f16423b || Math.abs(motionEvent.getY() - this.f16428g) > this.f16423b) {
                this.f16425d = false;
            }
            if (this.f16425d && motionEvent.getEventTime() - this.f16426e <= ((long) ViewConfiguration.getLongPressTimeout()) && (aVar = this.f16422a) != null) {
                aVar.mo11392d();
            }
            this.f16425d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f16424c = false;
                this.f16425d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f16427f) > this.f16423b || Math.abs(motionEvent.getY() - this.f16428g) > this.f16423b) {
            this.f16425d = false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo24551e() {
        this.f16424c = false;
        this.f16425d = false;
    }

    /* renamed from: f */
    public void mo24552f(C3053a aVar) {
        this.f16422a = aVar;
    }
}
