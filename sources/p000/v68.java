package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: v68 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class v68<T> implements o68<T> {

    /* renamed from: a */
    public final Object f34855a = new Object();

    /* renamed from: b */
    public final int f34856b;

    /* renamed from: c */
    public final uj9 f34857c;

    /* renamed from: d */
    public int f34858d;

    /* renamed from: e */
    public int f34859e;

    /* renamed from: f */
    public int f34860f;

    /* renamed from: g */
    public Exception f34861g;

    /* renamed from: h */
    public boolean f34862h;

    public v68(int i, uj9 uj9) {
        this.f34856b = i;
        this.f34857c = uj9;
    }

    /* renamed from: a */
    public final void mo42787a(Exception exc) {
        synchronized (this.f34855a) {
            this.f34859e++;
            this.f34861g = exc;
            mo48686b();
        }
    }

    /* renamed from: b */
    public final void mo48686b() {
        if (this.f34858d + this.f34859e + this.f34860f != this.f34856b) {
            return;
        }
        if (this.f34861g != null) {
            uj9 uj9 = this.f34857c;
            int i = this.f34859e;
            int i2 = this.f34856b;
            uj9.mo48402s(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f34861g));
        } else if (this.f34862h) {
            this.f34857c.mo48404u();
        } else {
            this.f34857c.mo48403t((Object) null);
        }
    }

    /* renamed from: c */
    public final void mo28978c() {
        synchronized (this.f34855a) {
            this.f34860f++;
            this.f34862h = true;
            mo48686b();
        }
    }

    public final void onSuccess(T t) {
        synchronized (this.f34855a) {
            this.f34858d++;
            mo48686b();
        }
    }
}
