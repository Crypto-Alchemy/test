package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wd7 */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class wd7 {

    /* renamed from: a */
    public final ArrayList<vd7> f19062a = new ArrayList<>();

    /* renamed from: b */
    public long f19063b = -1;

    /* renamed from: c */
    public Interpolator f19064c;

    /* renamed from: d */
    public xd7 f19065d;

    /* renamed from: e */
    public boolean f19066e;

    /* renamed from: f */
    public final yd7 f19067f = new C3533a();

    /* renamed from: wd7$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    public class C3533a extends yd7 {

        /* renamed from: a */
        public boolean f19068a = false;

        /* renamed from: b */
        public int f19069b = 0;

        public C3533a() {
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            int i = this.f19069b + 1;
            this.f19069b = i;
            if (i == wd7.this.f19062a.size()) {
                xd7 xd7 = wd7.this.f19065d;
                if (xd7 != null) {
                    xd7.mo1162b((View) null);
                }
                mo27484d();
            }
        }

        /* renamed from: c */
        public void mo1163c(View view) {
            if (!this.f19068a) {
                this.f19068a = true;
                xd7 xd7 = wd7.this.f19065d;
                if (xd7 != null) {
                    xd7.mo1163c((View) null);
                }
            }
        }

        /* renamed from: d */
        public void mo27484d() {
            this.f19069b = 0;
            this.f19068a = false;
            wd7.this.mo27477b();
        }
    }

    /* renamed from: a */
    public void mo27476a() {
        if (this.f19066e) {
            Iterator<vd7> it = this.f19062a.iterator();
            while (it.hasNext()) {
                it.next().mo27116c();
            }
            this.f19066e = false;
        }
    }

    /* renamed from: b */
    public void mo27477b() {
        this.f19066e = false;
    }

    /* renamed from: c */
    public wd7 mo27478c(vd7 vd7) {
        if (!this.f19066e) {
            this.f19062a.add(vd7);
        }
        return this;
    }

    /* renamed from: d */
    public wd7 mo27479d(vd7 vd7, vd7 vd72) {
        this.f19062a.add(vd7);
        vd72.mo27122j(vd7.mo27117d());
        this.f19062a.add(vd72);
        return this;
    }

    /* renamed from: e */
    public wd7 mo27480e(long j) {
        if (!this.f19066e) {
            this.f19063b = j;
        }
        return this;
    }

    /* renamed from: f */
    public wd7 mo27481f(Interpolator interpolator) {
        if (!this.f19066e) {
            this.f19064c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public wd7 mo27482g(xd7 xd7) {
        if (!this.f19066e) {
            this.f19065d = xd7;
        }
        return this;
    }

    /* renamed from: h */
    public void mo27483h() {
        if (!this.f19066e) {
            Iterator<vd7> it = this.f19062a.iterator();
            while (it.hasNext()) {
                vd7 next = it.next();
                long j = this.f19063b;
                if (j >= 0) {
                    next.mo27118f(j);
                }
                Interpolator interpolator = this.f19064c;
                if (interpolator != null) {
                    next.mo27119g(interpolator);
                }
                if (this.f19065d != null) {
                    next.mo27120h(this.f19067f);
                }
                next.mo27124l();
            }
            this.f19066e = true;
        }
    }
}
