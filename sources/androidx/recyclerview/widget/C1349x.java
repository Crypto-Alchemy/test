package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
/* compiled from: ViewInfoStore */
public class C1349x {

    /* renamed from: a */
    public final y16<RecyclerView.C1231a0, C1350a> f6850a = new y16<>();

    /* renamed from: b */
    public final hl3<RecyclerView.C1231a0> f6851b = new hl3<>();

    /* renamed from: androidx.recyclerview.widget.x$a */
    /* compiled from: ViewInfoStore */
    public static class C1350a {

        /* renamed from: d */
        public static ys4<C1350a> f6852d = new at4(20);

        /* renamed from: a */
        public int f6853a;

        /* renamed from: b */
        public RecyclerView.C1242l.C1245c f6854b;

        /* renamed from: c */
        public RecyclerView.C1242l.C1245c f6855c;

        /* renamed from: a */
        public static void m9760a() {
            do {
            } while (f6852d.mo11139b() != null);
        }

        /* renamed from: b */
        public static C1350a m9761b() {
            C1350a b = f6852d.mo11139b();
            if (b == null) {
                return new C1350a();
            }
            return b;
        }

        /* renamed from: c */
        public static void m9762c(C1350a aVar) {
            aVar.f6853a = 0;
            aVar.f6854b = null;
            aVar.f6855c = null;
            f6852d.mo11138a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.x$b */
    /* compiled from: ViewInfoStore */
    public interface C1351b {
        /* renamed from: a */
        void mo9360a(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2);

        /* renamed from: b */
        void mo9361b(RecyclerView.C1231a0 a0Var);

        /* renamed from: c */
        void mo9362c(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2);

        /* renamed from: d */
        void mo9363d(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2);
    }

    /* renamed from: a */
    public void mo9994a(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null) {
            aVar = C1350a.m9761b();
            this.f6850a.put(a0Var, aVar);
        }
        aVar.f6853a |= 2;
        aVar.f6854b = cVar;
    }

    /* renamed from: b */
    public void mo9995b(RecyclerView.C1231a0 a0Var) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null) {
            aVar = C1350a.m9761b();
            this.f6850a.put(a0Var, aVar);
        }
        aVar.f6853a |= 1;
    }

    /* renamed from: c */
    public void mo9996c(long j, RecyclerView.C1231a0 a0Var) {
        this.f6851b.mo21214o(j, a0Var);
    }

    /* renamed from: d */
    public void mo9997d(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null) {
            aVar = C1350a.m9761b();
            this.f6850a.put(a0Var, aVar);
        }
        aVar.f6855c = cVar;
        aVar.f6853a |= 8;
    }

    /* renamed from: e */
    public void mo9998e(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null) {
            aVar = C1350a.m9761b();
            this.f6850a.put(a0Var, aVar);
        }
        aVar.f6854b = cVar;
        aVar.f6853a |= 4;
    }

    /* renamed from: f */
    public void mo9999f() {
        this.f6850a.clear();
        this.f6851b.mo21204b();
    }

    /* renamed from: g */
    public RecyclerView.C1231a0 mo10000g(long j) {
        return this.f6851b.mo21209h(j);
    }

    /* renamed from: h */
    public boolean mo10001h(RecyclerView.C1231a0 a0Var) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null || (aVar.f6853a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo10002i(RecyclerView.C1231a0 a0Var) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar == null || (aVar.f6853a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo10003j() {
        C1350a.m9760a();
    }

    /* renamed from: k */
    public void mo10004k(RecyclerView.C1231a0 a0Var) {
        mo10009p(a0Var);
    }

    /* renamed from: l */
    public final RecyclerView.C1242l.C1245c mo10005l(RecyclerView.C1231a0 a0Var, int i) {
        C1350a m;
        RecyclerView.C1242l.C1245c cVar;
        int f = this.f6850a.mo27914f(a0Var);
        if (f >= 0 && (m = this.f6850a.mo27921m(f)) != null) {
            int i2 = m.f6853a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.f6853a = i3;
                if (i == 4) {
                    cVar = m.f6854b;
                } else if (i == 8) {
                    cVar = m.f6855c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f6850a.mo22211k(f);
                    C1350a.m9762c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.C1242l.C1245c mo10006m(RecyclerView.C1231a0 a0Var) {
        return mo10005l(a0Var, 8);
    }

    /* renamed from: n */
    public RecyclerView.C1242l.C1245c mo10007n(RecyclerView.C1231a0 a0Var) {
        return mo10005l(a0Var, 4);
    }

    /* renamed from: o */
    public void mo10008o(C1351b bVar) {
        for (int size = this.f6850a.size() - 1; size >= 0; size--) {
            RecyclerView.C1231a0 i = this.f6850a.mo27919i(size);
            C1350a k = this.f6850a.mo22211k(size);
            int i2 = k.f6853a;
            if ((i2 & 3) == 3) {
                bVar.mo9361b(i);
            } else if ((i2 & 1) != 0) {
                RecyclerView.C1242l.C1245c cVar = k.f6854b;
                if (cVar == null) {
                    bVar.mo9361b(i);
                } else {
                    bVar.mo9362c(i, cVar, k.f6855c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.mo9360a(i, k.f6854b, k.f6855c);
            } else if ((i2 & 12) == 12) {
                bVar.mo9363d(i, k.f6854b, k.f6855c);
            } else if ((i2 & 4) != 0) {
                bVar.mo9362c(i, k.f6854b, (RecyclerView.C1242l.C1245c) null);
            } else if ((i2 & 8) != 0) {
                bVar.mo9360a(i, k.f6854b, k.f6855c);
            }
            C1350a.m9762c(k);
        }
    }

    /* renamed from: p */
    public void mo10009p(RecyclerView.C1231a0 a0Var) {
        C1350a aVar = this.f6850a.get(a0Var);
        if (aVar != null) {
            aVar.f6853a &= -2;
        }
    }

    /* renamed from: q */
    public void mo10010q(RecyclerView.C1231a0 a0Var) {
        int u = this.f6851b.mo21219u() - 1;
        while (true) {
            if (u < 0) {
                break;
            } else if (a0Var == this.f6851b.mo21220v(u)) {
                this.f6851b.mo21217t(u);
                break;
            } else {
                u--;
            }
        }
        C1350a remove = this.f6850a.remove(a0Var);
        if (remove != null) {
            C1350a.m9762c(remove);
        }
    }
}
