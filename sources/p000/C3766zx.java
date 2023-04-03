package p000;

/* renamed from: zx */
/* compiled from: BaseConsumer */
public abstract class C3766zx<T> implements vq0<T> {

    /* renamed from: a */
    public boolean f20718a = false;

    /* renamed from: e */
    public static boolean m31566e(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: f */
    public static boolean m31567f(int i) {
        return !m31566e(i);
    }

    /* renamed from: l */
    public static int m31568l(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: m */
    public static boolean m31569m(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: n */
    public static boolean m31570n(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: o */
    public static int m31571o(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: a */
    public synchronized void mo27292a() {
        if (!this.f20718a) {
            this.f20718a = true;
            try {
                mo13424g();
            } catch (Exception e) {
                mo28669k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: b */
    public synchronized void mo27293b(Throwable th) {
        if (!this.f20718a) {
            this.f20718a = true;
            try {
                mo11351h(th);
            } catch (Exception e) {
                mo28669k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: c */
    public synchronized void mo27294c(T t, int i) {
        if (!this.f20718a) {
            this.f20718a = m31566e(i);
            try {
                mo11352i(t, i);
            } catch (Exception e) {
                mo28669k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: d */
    public synchronized void mo27295d(float f) {
        if (!this.f20718a) {
            try {
                mo13425j(f);
            } catch (Exception e) {
                mo28669k(e);
            }
        } else {
            return;
        }
    }

    /* renamed from: g */
    public abstract void mo13424g();

    /* renamed from: h */
    public abstract void mo11351h(Throwable th);

    /* renamed from: i */
    public abstract void mo11352i(T t, int i);

    /* renamed from: j */
    public abstract void mo13425j(float f);

    /* renamed from: k */
    public void mo28669k(Exception exc) {
        oy1.m24438y(getClass(), "unhandled exception", exc);
    }
}
