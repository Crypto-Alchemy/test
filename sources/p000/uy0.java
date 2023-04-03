package p000;

import android.graphics.drawable.Drawable;

/* renamed from: uy0 */
/* compiled from: CustomTarget */
public abstract class uy0<T> implements pl6<T> {

    /* renamed from: a */
    public final int f18603a;

    /* renamed from: d */
    public final int f18604d;

    /* renamed from: e */
    public ae5 f18605e;

    public uy0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo21090a(x36 x36) {
        x36.mo12666e(this.f18603a, this.f18604d);
    }

    /* renamed from: b */
    public void mo19468b() {
    }

    /* renamed from: c */
    public void mo20968c() {
    }

    /* renamed from: f */
    public void mo19470f(Drawable drawable) {
    }

    /* renamed from: g */
    public final ae5 mo21093g() {
        return this.f18605e;
    }

    /* renamed from: j */
    public final void mo21099j(ae5 ae5) {
        this.f18605e = ae5;
    }

    /* renamed from: k */
    public final void mo21100k(x36 x36) {
    }

    /* renamed from: m */
    public void mo19472m(Drawable drawable) {
    }

    /* renamed from: n */
    public void mo19473n() {
    }

    public uy0(int i, int i2) {
        if (p67.m24692t(i, i2)) {
            this.f18603a = i;
            this.f18604d = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
