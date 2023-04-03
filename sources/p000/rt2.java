package p000;

import android.animation.Animator;

/* renamed from: rt2 */
/* compiled from: IndeterminateAnimatorDelegate */
public abstract class rt2<T extends Animator> {

    /* renamed from: a */
    public st2 f33576a;

    /* renamed from: b */
    public final float[] f33577b;

    /* renamed from: c */
    public final int[] f33578c;

    public rt2(int i) {
        this.f33577b = new float[(i * 2)];
        this.f33578c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo28932a();

    /* renamed from: b */
    public float mo47484b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo28933c();

    /* renamed from: d */
    public abstract void mo28934d(C3681yj yjVar);

    /* renamed from: e */
    public void mo47485e(st2 st2) {
        this.f33576a = st2;
    }

    /* renamed from: f */
    public abstract void mo28935f();

    /* renamed from: g */
    public abstract void mo28936g();

    /* renamed from: h */
    public abstract void mo28937h();
}
