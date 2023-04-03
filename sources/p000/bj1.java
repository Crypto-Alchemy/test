package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import p000.aj1;

/* renamed from: bj1 */
/* compiled from: DrawManager */
public class bj1 {

    /* renamed from: a */
    public zt2 f21348a;

    /* renamed from: b */
    public aj1 f21349b;

    /* renamed from: c */
    public kq3 f21350c = new kq3();

    /* renamed from: d */
    public C6226ls f21351d = new C6226ls(this.f21348a);

    public bj1() {
        zt2 zt2 = new zt2();
        this.f21348a = zt2;
        this.f21349b = new aj1(zt2);
    }

    /* renamed from: a */
    public void mo29616a(Canvas canvas) {
        this.f21349b.mo28990a(canvas);
    }

    /* renamed from: b */
    public zt2 mo29617b() {
        if (this.f21348a == null) {
            this.f21348a = new zt2();
        }
        return this.f21348a;
    }

    /* renamed from: c */
    public void mo29618c(Context context, AttributeSet attributeSet) {
        this.f21351d.mo45500c(context, attributeSet);
    }

    /* renamed from: d */
    public Pair<Integer, Integer> mo29619d(int i, int i2) {
        return this.f21350c.mo45233a(this.f21348a, i, i2);
    }

    /* renamed from: e */
    public void mo29620e(aj1.C3817b bVar) {
        this.f21349b.mo28994e(bVar);
    }

    /* renamed from: f */
    public void mo29621f(MotionEvent motionEvent) {
        this.f21349b.mo28995f(motionEvent);
    }

    /* renamed from: g */
    public void mo29622g(c87 c87) {
        this.f21349b.mo28996g(c87);
    }
}
