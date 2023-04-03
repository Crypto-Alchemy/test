package p000;

import android.graphics.Bitmap;
import p000.f20;

/* renamed from: w93 */
/* compiled from: KeepLastFrameCache */
public class w93 implements f20 {

    /* renamed from: a */
    public int f19047a = -1;

    /* renamed from: b */
    public f20.C2260a f19048b;

    /* renamed from: c */
    public nh0<Bitmap> f19049c;

    /* renamed from: a */
    public void mo19585a(int i, nh0<Bitmap> nh0, int i2) {
    }

    /* renamed from: b */
    public synchronized nh0<Bitmap> mo19586b(int i) {
        return nh0.m23176f(this.f19049c);
    }

    /* renamed from: c */
    public synchronized nh0<Bitmap> mo19587c(int i, int i2, int i3) {
        nh0<Bitmap> f;
        try {
            f = nh0.m23176f(this.f19049c);
            mo27471g();
        } catch (Throwable th) {
            mo27471g();
            throw th;
        }
        return f;
    }

    public synchronized void clear() {
        mo27471g();
    }

    /* renamed from: d */
    public synchronized void mo19589d(int i, nh0<Bitmap> nh0, int i2) {
        int i3;
        if (nh0 != null) {
            if (this.f19049c != null && nh0.mo23684j().equals(this.f19049c.mo23684j())) {
                return;
            }
        }
        nh0.m23178h(this.f19049c);
        f20.C2260a aVar = this.f19048b;
        if (!(aVar == null || (i3 = this.f19047a) == -1)) {
            aVar.mo19592a(this, i3);
        }
        this.f19049c = nh0.m23176f(nh0);
        f20.C2260a aVar2 = this.f19048b;
        if (aVar2 != null) {
            aVar2.mo19593b(this, i);
        }
        this.f19047a = i;
    }

    /* renamed from: e */
    public synchronized boolean mo19590e(int i) {
        boolean z;
        if (i != this.f19047a || !nh0.m23180p(this.f19049c)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized nh0<Bitmap> mo19591f(int i) {
        if (this.f19047a != i) {
            return null;
        }
        return nh0.m23176f(this.f19049c);
    }

    /* renamed from: g */
    public final synchronized void mo27471g() {
        int i;
        f20.C2260a aVar = this.f19048b;
        if (!(aVar == null || (i = this.f19047a) == -1)) {
            aVar.mo19592a(this, i);
        }
        nh0.m23178h(this.f19049c);
        this.f19049c = null;
        this.f19047a = -1;
    }
}
