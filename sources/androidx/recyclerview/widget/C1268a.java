package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1332p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
public final class C1268a implements C1332p.C1333a {

    /* renamed from: a */
    public ys4<C1270b> f6592a;

    /* renamed from: b */
    public final ArrayList<C1270b> f6593b;

    /* renamed from: c */
    public final ArrayList<C1270b> f6594c;

    /* renamed from: d */
    public final C1269a f6595d;

    /* renamed from: e */
    public Runnable f6596e;

    /* renamed from: f */
    public final boolean f6597f;

    /* renamed from: g */
    public final C1332p f6598g;

    /* renamed from: h */
    public int f6599h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    public interface C1269a {
        /* renamed from: a */
        void mo9375a(int i, int i2);

        /* renamed from: b */
        void mo9376b(C1270b bVar);

        /* renamed from: c */
        void mo9377c(C1270b bVar);

        /* renamed from: d */
        void mo9378d(int i, int i2);

        /* renamed from: e */
        void mo9379e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.C1231a0 mo9380f(int i);

        /* renamed from: g */
        void mo9381g(int i, int i2);

        /* renamed from: h */
        void mo9382h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    public static final class C1270b {

        /* renamed from: a */
        public int f6600a;

        /* renamed from: b */
        public int f6601b;

        /* renamed from: c */
        public Object f6602c;

        /* renamed from: d */
        public int f6603d;

        public C1270b(int i, int i2, int i3, Object obj) {
            this.f6600a = i;
            this.f6601b = i2;
            this.f6603d = i3;
            this.f6602c = obj;
        }

        /* renamed from: a */
        public String mo9682a() {
            int i = this.f6600a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1270b)) {
                return false;
            }
            C1270b bVar = (C1270b) obj;
            int i = this.f6600a;
            if (i != bVar.f6600a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f6603d - this.f6601b) == 1 && this.f6603d == bVar.f6601b && this.f6601b == bVar.f6603d) {
                return true;
            }
            if (this.f6603d != bVar.f6603d || this.f6601b != bVar.f6601b) {
                return false;
            }
            Object obj2 = this.f6602c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f6602c)) {
                    return false;
                }
            } else if (bVar.f6602c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6600a * 31) + this.f6601b) * 31) + this.f6603d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo9682a() + ",s:" + this.f6601b + "c:" + this.f6603d + ",p:" + this.f6602c + "]";
        }
    }

    public C1268a(C1269a aVar) {
        this(aVar, false);
    }

    /* renamed from: a */
    public C1270b mo9656a(int i, int i2, int i3, Object obj) {
        C1270b b = this.f6592a.mo11139b();
        if (b == null) {
            return new C1270b(i, i2, i3, obj);
        }
        b.f6600a = i;
        b.f6601b = i2;
        b.f6603d = i3;
        b.f6602c = obj;
        return b;
    }

    /* renamed from: b */
    public void mo9657b(C1270b bVar) {
        if (!this.f6597f) {
            bVar.f6602c = null;
            this.f6592a.mo11138a(bVar);
        }
    }

    /* renamed from: c */
    public final void mo9658c(C1270b bVar) {
        mo9677v(bVar);
    }

    /* renamed from: d */
    public final void mo9659d(C1270b bVar) {
        mo9677v(bVar);
    }

    /* renamed from: e */
    public int mo9660e(int i) {
        int size = this.f6593b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1270b bVar = this.f6593b.get(i2);
            int i3 = bVar.f6600a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f6601b;
                    if (i4 <= i) {
                        int i5 = bVar.f6603d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f6601b;
                    if (i6 == i) {
                        i = bVar.f6603d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f6603d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f6601b <= i) {
                i += bVar.f6603d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void mo9661f(C1270b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f6601b;
        int i2 = bVar.f6603d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f6595d.mo9380f(i3) != null || mo9663h(i3)) {
                if (c2 == 0) {
                    mo9666k(mo9656a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    mo9677v(mo9656a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f6603d) {
            mo9657b(bVar);
            bVar = mo9656a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            mo9666k(bVar);
        } else {
            mo9677v(bVar);
        }
    }

    /* renamed from: g */
    public final void mo9662g(C1270b bVar) {
        int i = bVar.f6601b;
        int i2 = bVar.f6603d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f6595d.mo9380f(i) != null || mo9663h(i)) {
                if (!z) {
                    mo9666k(mo9656a(4, i4, i3, bVar.f6602c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    mo9677v(mo9656a(4, i4, i3, bVar.f6602c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f6603d) {
            Object obj = bVar.f6602c;
            mo9657b(bVar);
            bVar = mo9656a(4, i4, i3, obj);
        }
        if (!z) {
            mo9666k(bVar);
        } else {
            mo9677v(bVar);
        }
    }

    /* renamed from: h */
    public final boolean mo9663h(int i) {
        int size = this.f6594c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1270b bVar = this.f6594c.get(i2);
            int i3 = bVar.f6600a;
            if (i3 == 8) {
                if (mo9669n(bVar.f6603d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f6601b;
                int i5 = bVar.f6603d + i4;
                while (i4 < i5) {
                    if (mo9669n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo9664i() {
        int size = this.f6594c.size();
        for (int i = 0; i < size; i++) {
            this.f6595d.mo9377c(this.f6594c.get(i));
        }
        mo9679x(this.f6594c);
        this.f6599h = 0;
    }

    /* renamed from: j */
    public void mo9665j() {
        mo9664i();
        int size = this.f6593b.size();
        for (int i = 0; i < size; i++) {
            C1270b bVar = this.f6593b.get(i);
            int i2 = bVar.f6600a;
            if (i2 == 1) {
                this.f6595d.mo9377c(bVar);
                this.f6595d.mo9381g(bVar.f6601b, bVar.f6603d);
            } else if (i2 == 2) {
                this.f6595d.mo9377c(bVar);
                this.f6595d.mo9382h(bVar.f6601b, bVar.f6603d);
            } else if (i2 == 4) {
                this.f6595d.mo9377c(bVar);
                this.f6595d.mo9379e(bVar.f6601b, bVar.f6603d, bVar.f6602c);
            } else if (i2 == 8) {
                this.f6595d.mo9377c(bVar);
                this.f6595d.mo9375a(bVar.f6601b, bVar.f6603d);
            }
            Runnable runnable = this.f6596e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo9679x(this.f6593b);
        this.f6599h = 0;
    }

    /* renamed from: k */
    public final void mo9666k(C1270b bVar) {
        int i;
        boolean z;
        int i2 = bVar.f6600a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z2 = mo9681z(bVar.f6601b, i2);
        int i3 = bVar.f6601b;
        int i4 = bVar.f6600a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f6603d; i6++) {
            int z3 = mo9681z(bVar.f6601b + (i * i6), bVar.f6600a);
            int i7 = bVar.f6600a;
            if (i7 == 2 ? z3 != z2 : !(i7 == 4 && z3 == z2 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i5++;
            } else {
                C1270b a = mo9656a(i7, z2, i5, bVar.f6602c);
                mo9667l(a, i3);
                mo9657b(a);
                if (bVar.f6600a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                z2 = z3;
            }
        }
        Object obj = bVar.f6602c;
        mo9657b(bVar);
        if (i5 > 0) {
            C1270b a2 = mo9656a(bVar.f6600a, z2, i5, obj);
            mo9667l(a2, i3);
            mo9657b(a2);
        }
    }

    /* renamed from: l */
    public void mo9667l(C1270b bVar, int i) {
        this.f6595d.mo9376b(bVar);
        int i2 = bVar.f6600a;
        if (i2 == 2) {
            this.f6595d.mo9382h(i, bVar.f6603d);
        } else if (i2 == 4) {
            this.f6595d.mo9379e(i, bVar.f6603d, bVar.f6602c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: m */
    public int mo9668m(int i) {
        return mo9669n(i, 0);
    }

    /* renamed from: n */
    public int mo9669n(int i, int i2) {
        int size = this.f6594c.size();
        while (i2 < size) {
            C1270b bVar = this.f6594c.get(i2);
            int i3 = bVar.f6600a;
            if (i3 == 8) {
                int i4 = bVar.f6601b;
                if (i4 == i) {
                    i = bVar.f6603d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f6603d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f6601b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f6603d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f6603d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean mo9670o(int i) {
        if ((i & this.f6599h) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo9671p() {
        if (this.f6593b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo9672q() {
        if (this.f6594c.isEmpty() || this.f6593b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo9673r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f6593b.add(mo9656a(4, i, i2, obj));
        this.f6599h |= 4;
        if (this.f6593b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo9674s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f6593b.add(mo9656a(1, i, i2, (Object) null));
        this.f6599h |= 1;
        if (this.f6593b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo9675t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f6593b.add(mo9656a(8, i, i2, (Object) null));
            this.f6599h |= 8;
            if (this.f6593b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: u */
    public boolean mo9676u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f6593b.add(mo9656a(2, i, i2, (Object) null));
        this.f6599h |= 2;
        if (this.f6593b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo9677v(C1270b bVar) {
        this.f6594c.add(bVar);
        int i = bVar.f6600a;
        if (i == 1) {
            this.f6595d.mo9381g(bVar.f6601b, bVar.f6603d);
        } else if (i == 2) {
            this.f6595d.mo9378d(bVar.f6601b, bVar.f6603d);
        } else if (i == 4) {
            this.f6595d.mo9379e(bVar.f6601b, bVar.f6603d, bVar.f6602c);
        } else if (i == 8) {
            this.f6595d.mo9375a(bVar.f6601b, bVar.f6603d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: w */
    public void mo9678w() {
        this.f6598g.mo9926b(this.f6593b);
        int size = this.f6593b.size();
        for (int i = 0; i < size; i++) {
            C1270b bVar = this.f6593b.get(i);
            int i2 = bVar.f6600a;
            if (i2 == 1) {
                mo9658c(bVar);
            } else if (i2 == 2) {
                mo9661f(bVar);
            } else if (i2 == 4) {
                mo9662g(bVar);
            } else if (i2 == 8) {
                mo9659d(bVar);
            }
            Runnable runnable = this.f6596e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6593b.clear();
    }

    /* renamed from: x */
    public void mo9679x(List<C1270b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo9657b(list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void mo9680y() {
        mo9679x(this.f6593b);
        mo9679x(this.f6594c);
        this.f6599h = 0;
    }

    /* renamed from: z */
    public final int mo9681z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f6594c.size() - 1; size >= 0; size--) {
            C1270b bVar = this.f6594c.get(size);
            int i5 = bVar.f6600a;
            if (i5 == 8) {
                int i6 = bVar.f6601b;
                int i7 = bVar.f6603d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f6601b = i6 + 1;
                            bVar.f6603d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f6601b = i6 - 1;
                            bVar.f6603d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f6603d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f6603d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f6601b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f6601b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f6601b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f6603d;
                    } else if (i5 == 2) {
                        i += bVar.f6603d;
                    }
                } else if (i2 == 1) {
                    bVar.f6601b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f6601b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f6594c.size() - 1; size2 >= 0; size2--) {
            C1270b bVar2 = this.f6594c.get(size2);
            if (bVar2.f6600a == 8) {
                int i9 = bVar2.f6603d;
                if (i9 == bVar2.f6601b || i9 < 0) {
                    this.f6594c.remove(size2);
                    mo9657b(bVar2);
                }
            } else if (bVar2.f6603d <= 0) {
                this.f6594c.remove(size2);
                mo9657b(bVar2);
            }
        }
        return i;
    }

    public C1268a(C1269a aVar, boolean z) {
        this.f6592a = new at4(30);
        this.f6593b = new ArrayList<>();
        this.f6594c = new ArrayList<>();
        this.f6599h = 0;
        this.f6595d = aVar;
        this.f6597f = z;
        this.f6598g = new C1332p(this);
    }
}
