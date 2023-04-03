package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: ChildHelper */
public class C1280e {

    /* renamed from: a */
    public final C1282b f6630a;

    /* renamed from: b */
    public final C1281a f6631b = new C1281a();

    /* renamed from: c */
    public final List<View> f6632c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: ChildHelper */
    public static class C1281a {

        /* renamed from: a */
        public long f6633a = 0;

        /* renamed from: b */
        public C1281a f6634b;

        /* renamed from: a */
        public void mo9730a(int i) {
            if (i >= 64) {
                C1281a aVar = this.f6634b;
                if (aVar != null) {
                    aVar.mo9730a(i - 64);
                    return;
                }
                return;
            }
            this.f6633a &= ~(1 << i);
        }

        /* renamed from: b */
        public int mo9731b(int i) {
            C1281a aVar = this.f6634b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f6633a);
                }
                return Long.bitCount(this.f6633a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f6633a & ((1 << i) - 1));
            } else {
                return aVar.mo9731b(i - 64) + Long.bitCount(this.f6633a);
            }
        }

        /* renamed from: c */
        public final void mo9732c() {
            if (this.f6634b == null) {
                this.f6634b = new C1281a();
            }
        }

        /* renamed from: d */
        public boolean mo9733d(int i) {
            if (i >= 64) {
                mo9732c();
                return this.f6634b.mo9733d(i - 64);
            } else if ((this.f6633a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void mo9734e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                mo9732c();
                this.f6634b.mo9734e(i - 64, z);
                return;
            }
            long j = this.f6633a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f6633a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo9737h(i);
            } else {
                mo9730a(i);
            }
            if (z2 || this.f6634b != null) {
                mo9732c();
                this.f6634b.mo9734e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo9735f(int i) {
            boolean z;
            if (i >= 64) {
                mo9732c();
                return this.f6634b.mo9735f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f6633a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f6633a = j3;
            long j4 = j - 1;
            this.f6633a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1281a aVar = this.f6634b;
            if (aVar != null) {
                if (aVar.mo9733d(0)) {
                    mo9737h(63);
                }
                this.f6634b.mo9735f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo9736g() {
            this.f6633a = 0;
            C1281a aVar = this.f6634b;
            if (aVar != null) {
                aVar.mo9736g();
            }
        }

        /* renamed from: h */
        public void mo9737h(int i) {
            if (i >= 64) {
                mo9732c();
                this.f6634b.mo9737h(i - 64);
                return;
            }
            this.f6633a |= 1 << i;
        }

        public String toString() {
            if (this.f6634b == null) {
                return Long.toBinaryString(this.f6633a);
            }
            return this.f6634b.toString() + "xx" + Long.toBinaryString(this.f6633a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: ChildHelper */
    public interface C1282b {
        /* renamed from: a */
        View mo9364a(int i);

        /* renamed from: b */
        void mo9365b(View view);

        /* renamed from: c */
        int mo9366c();

        /* renamed from: d */
        RecyclerView.C1231a0 mo9367d(View view);

        /* renamed from: e */
        void mo9368e(int i);

        /* renamed from: f */
        void mo9369f(View view, int i);

        /* renamed from: g */
        void mo9370g();

        /* renamed from: h */
        int mo9371h(View view);

        /* renamed from: i */
        void mo9372i(View view);

        /* renamed from: j */
        void mo9373j(int i);

        /* renamed from: k */
        void mo9374k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public C1280e(C1282b bVar) {
        this.f6630a = bVar;
    }

    /* renamed from: a */
    public void mo9709a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f6630a.mo9366c();
        } else {
            i2 = mo9716h(i);
        }
        this.f6631b.mo9734e(i2, z);
        if (z) {
            mo9720l(view);
        }
        this.f6630a.mo9369f(view, i2);
    }

    /* renamed from: b */
    public void mo9710b(View view, boolean z) {
        mo9709a(view, -1, z);
    }

    /* renamed from: c */
    public void mo9711c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f6630a.mo9366c();
        } else {
            i2 = mo9716h(i);
        }
        this.f6631b.mo9734e(i2, z);
        if (z) {
            mo9720l(view);
        }
        this.f6630a.mo9374k(view, i2, layoutParams);
    }

    /* renamed from: d */
    public void mo9712d(int i) {
        int h = mo9716h(i);
        this.f6631b.mo9735f(h);
        this.f6630a.mo9368e(h);
    }

    /* renamed from: e */
    public View mo9713e(int i) {
        int size = this.f6632c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f6632c.get(i2);
            RecyclerView.C1231a0 d = this.f6630a.mo9367d(view);
            if (d.getLayoutPosition() == i && !d.isInvalid() && !d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View mo9714f(int i) {
        return this.f6630a.mo9364a(mo9716h(i));
    }

    /* renamed from: g */
    public int mo9715g() {
        return this.f6630a.mo9366c() - this.f6632c.size();
    }

    /* renamed from: h */
    public final int mo9716h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f6630a.mo9366c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.f6631b.mo9731b(i2));
            if (b == 0) {
                while (this.f6631b.mo9733d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: i */
    public View mo9717i(int i) {
        return this.f6630a.mo9364a(i);
    }

    /* renamed from: j */
    public int mo9718j() {
        return this.f6630a.mo9366c();
    }

    /* renamed from: k */
    public void mo9719k(View view) {
        int h = this.f6630a.mo9371h(view);
        if (h >= 0) {
            this.f6631b.mo9737h(h);
            mo9720l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void mo9720l(View view) {
        this.f6632c.add(view);
        this.f6630a.mo9365b(view);
    }

    /* renamed from: m */
    public int mo9721m(View view) {
        int h = this.f6630a.mo9371h(view);
        if (h != -1 && !this.f6631b.mo9733d(h)) {
            return h - this.f6631b.mo9731b(h);
        }
        return -1;
    }

    /* renamed from: n */
    public boolean mo9722n(View view) {
        return this.f6632c.contains(view);
    }

    /* renamed from: o */
    public void mo9723o() {
        this.f6631b.mo9736g();
        for (int size = this.f6632c.size() - 1; size >= 0; size--) {
            this.f6630a.mo9372i(this.f6632c.get(size));
            this.f6632c.remove(size);
        }
        this.f6630a.mo9370g();
    }

    /* renamed from: p */
    public void mo9724p(View view) {
        int h = this.f6630a.mo9371h(view);
        if (h >= 0) {
            if (this.f6631b.mo9735f(h)) {
                mo9728t(view);
            }
            this.f6630a.mo9373j(h);
        }
    }

    /* renamed from: q */
    public void mo9725q(int i) {
        int h = mo9716h(i);
        View a = this.f6630a.mo9364a(h);
        if (a != null) {
            if (this.f6631b.mo9735f(h)) {
                mo9728t(a);
            }
            this.f6630a.mo9373j(h);
        }
    }

    /* renamed from: r */
    public boolean mo9726r(View view) {
        int h = this.f6630a.mo9371h(view);
        if (h == -1) {
            mo9728t(view);
            return true;
        } else if (!this.f6631b.mo9733d(h)) {
            return false;
        } else {
            this.f6631b.mo9735f(h);
            mo9728t(view);
            this.f6630a.mo9373j(h);
            return true;
        }
    }

    /* renamed from: s */
    public void mo9727s(View view) {
        int h = this.f6630a.mo9371h(view);
        if (h < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f6631b.mo9733d(h)) {
            this.f6631b.mo9730a(h);
            mo9728t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean mo9728t(View view) {
        if (!this.f6632c.remove(view)) {
            return false;
        }
        this.f6630a.mo9372i(view);
        return true;
    }

    public String toString() {
        return this.f6631b.toString() + ", hidden list:" + this.f6632c.size();
    }
}
