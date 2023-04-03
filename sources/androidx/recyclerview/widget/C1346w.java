package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.w */
/* compiled from: ViewBoundsCheck */
public class C1346w {

    /* renamed from: a */
    public final C1348b f6843a;

    /* renamed from: b */
    public C1347a f6844b = new C1347a();

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* compiled from: ViewBoundsCheck */
    public static class C1347a {

        /* renamed from: a */
        public int f6845a = 0;

        /* renamed from: b */
        public int f6846b;

        /* renamed from: c */
        public int f6847c;

        /* renamed from: d */
        public int f6848d;

        /* renamed from: e */
        public int f6849e;

        /* renamed from: a */
        public void mo9989a(int i) {
            this.f6845a = i | this.f6845a;
        }

        /* renamed from: b */
        public boolean mo9990b() {
            int i = this.f6845a;
            if ((i & 7) != 0 && (i & (mo9991c(this.f6848d, this.f6846b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f6845a;
            if ((i2 & 112) != 0 && (i2 & (mo9991c(this.f6848d, this.f6847c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f6845a;
            if ((i3 & 1792) != 0 && (i3 & (mo9991c(this.f6849e, this.f6846b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f6845a;
            if ((i4 & 28672) == 0 || (i4 & (mo9991c(this.f6849e, this.f6847c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int mo9991c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void mo9992d() {
            this.f6845a = 0;
        }

        /* renamed from: e */
        public void mo9993e(int i, int i2, int i3, int i4) {
            this.f6846b = i;
            this.f6847c = i2;
            this.f6848d = i3;
            this.f6849e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    /* compiled from: ViewBoundsCheck */
    public interface C1348b {
        /* renamed from: a */
        View mo9297a(int i);

        /* renamed from: b */
        int mo9298b(View view);

        /* renamed from: c */
        int mo9299c();

        /* renamed from: d */
        int mo9300d();

        /* renamed from: e */
        int mo9301e(View view);
    }

    public C1346w(C1348b bVar) {
        this.f6843a = bVar;
    }

    /* renamed from: a */
    public View mo9987a(int i, int i2, int i3, int i4) {
        int i5;
        int c = this.f6843a.mo9299c();
        int d = this.f6843a.mo9300d();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a = this.f6843a.mo9297a(i);
            this.f6844b.mo9993e(c, d, this.f6843a.mo9298b(a), this.f6843a.mo9301e(a));
            if (i3 != 0) {
                this.f6844b.mo9992d();
                this.f6844b.mo9989a(i3);
                if (this.f6844b.mo9990b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f6844b.mo9992d();
                this.f6844b.mo9989a(i4);
                if (this.f6844b.mo9990b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo9988b(View view, int i) {
        this.f6844b.mo9993e(this.f6843a.mo9299c(), this.f6843a.mo9300d(), this.f6843a.mo9298b(view), this.f6843a.mo9301e(view));
        if (i == 0) {
            return false;
        }
        this.f6844b.mo9992d();
        this.f6844b.mo9989a(i);
        return this.f6844b.mo9990b();
    }
}
