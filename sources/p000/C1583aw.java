package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import p000.xs5;

/* renamed from: aw */
/* compiled from: AviExtractor */
public final class C1583aw implements hy1 {

    /* renamed from: a */
    public final gm4 f7765a = new gm4(12);

    /* renamed from: b */
    public final C1586c f7766b = new C1586c();

    /* renamed from: c */
    public int f7767c;

    /* renamed from: d */
    public jy1 f7768d = new bl1();

    /* renamed from: e */
    public C1657bw f7769e;

    /* renamed from: f */
    public long f7770f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: g */
    public te0[] f7771g = new te0[0];

    /* renamed from: h */
    public long f7772h;

    /* renamed from: i */
    public te0 f7773i;

    /* renamed from: j */
    public int f7774j = -1;

    /* renamed from: k */
    public long f7775k = -1;

    /* renamed from: l */
    public long f7776l = -1;

    /* renamed from: m */
    public int f7777m;

    /* renamed from: n */
    public boolean f7778n;

    /* renamed from: aw$b */
    /* compiled from: AviExtractor */
    public class C1585b implements xs5 {

        /* renamed from: a */
        public final long f7779a;

        public C1585b(long j) {
            this.f7779a = j;
        }

        /* renamed from: f */
        public xs5.C3641a mo11155f(long j) {
            xs5.C3641a i = C1583aw.this.f7771g[0].mo26425i(j);
            for (int i2 = 1; i2 < C1583aw.this.f7771g.length; i2++) {
                xs5.C3641a i3 = C1583aw.this.f7771g[i2].mo26425i(j);
                if (i3.f19968a.f20676b < i.f19968a.f20676b) {
                    i = i3;
                }
            }
            return i;
        }

        /* renamed from: h */
        public boolean mo11156h() {
            return true;
        }

        /* renamed from: i */
        public long mo11157i() {
            return this.f7779a;
        }
    }

    /* renamed from: aw$c */
    /* compiled from: AviExtractor */
    public static class C1586c {

        /* renamed from: a */
        public int f7781a;

        /* renamed from: b */
        public int f7782b;

        /* renamed from: c */
        public int f7783c;

        public C1586c() {
        }

        /* renamed from: a */
        public void mo11158a(gm4 gm4) {
            this.f7781a = gm4.mo20692q();
            this.f7782b = gm4.mo20692q();
            this.f7783c = 0;
        }

        /* renamed from: b */
        public void mo11159b(gm4 gm4) throws ParserException {
            mo11158a(gm4);
            if (this.f7781a == 1414744396) {
                this.f7783c = gm4.mo20692q();
                return;
            }
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.f7781a, (Throwable) null);
        }
    }

    /* renamed from: f */
    public static void m10815f(iy1 iy1) throws IOException {
        if ((iy1.getPosition() & 1) == 1) {
            iy1.mo92k(1);
        }
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f7772h = -1;
        this.f7773i = null;
        for (te0 o : this.f7771g) {
            o.mo26431o(j);
        }
        if (j != 0) {
            this.f7767c = 6;
        } else if (this.f7771g.length == 0) {
            this.f7767c = 0;
        } else {
            this.f7767c = 3;
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        if (mo11154n(iy1, mt4)) {
            return 1;
        }
        switch (this.f7767c) {
            case 0:
                if (mo155e(iy1)) {
                    iy1.mo92k(12);
                    this.f7767c = 1;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("AVI Header List not found", (Throwable) null);
            case 1:
                iy1.readFully(this.f7765a.mo20679d(), 0, 12);
                this.f7765a.mo20674P(0);
                this.f7766b.mo11159b(this.f7765a);
                C1586c cVar = this.f7766b;
                if (cVar.f7783c == 1819436136) {
                    this.f7774j = cVar.f7782b;
                    this.f7767c = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.f7766b.f7783c, (Throwable) null);
            case 2:
                int i = this.f7774j - 4;
                gm4 gm4 = new gm4(i);
                iy1.readFully(gm4.mo20679d(), 0, i);
                mo11149h(gm4);
                this.f7767c = 3;
                return 0;
            case 3:
                if (this.f7775k != -1) {
                    long position = iy1.getPosition();
                    long j = this.f7775k;
                    if (position != j) {
                        this.f7772h = j;
                        return 0;
                    }
                }
                iy1.mo94n(this.f7765a.mo20679d(), 0, 12);
                iy1.mo85e();
                this.f7765a.mo20674P(0);
                this.f7766b.mo11158a(this.f7765a);
                int q = this.f7765a.mo20692q();
                int i2 = this.f7766b.f7781a;
                if (i2 == 1179011410) {
                    iy1.mo92k(12);
                    return 0;
                } else if (i2 == 1414744396 && q == 1769369453) {
                    long position2 = iy1.getPosition();
                    this.f7775k = position2;
                    this.f7776l = position2 + ((long) this.f7766b.f7782b) + 8;
                    if (!this.f7778n) {
                        if (((C1657bw) C2725kr.m20985e(this.f7769e)).mo11893a()) {
                            this.f7767c = 4;
                            this.f7772h = this.f7776l;
                            return 0;
                        }
                        this.f7768d.mo7715g(new xs5.C3642b(this.f7770f));
                        this.f7778n = true;
                    }
                    this.f7772h = iy1.getPosition() + 12;
                    this.f7767c = 6;
                    return 0;
                } else {
                    this.f7772h = iy1.getPosition() + ((long) this.f7766b.f7782b) + 8;
                    return 0;
                }
            case 4:
                iy1.readFully(this.f7765a.mo20679d(), 0, 8);
                this.f7765a.mo20674P(0);
                int q2 = this.f7765a.mo20692q();
                int q3 = this.f7765a.mo20692q();
                if (q2 == 829973609) {
                    this.f7767c = 5;
                    this.f7777m = q3;
                } else {
                    this.f7772h = iy1.getPosition() + ((long) q3);
                }
                return 0;
            case 5:
                gm4 gm42 = new gm4(this.f7777m);
                iy1.readFully(gm42.mo20679d(), 0, this.f7777m);
                mo11150i(gm42);
                this.f7767c = 6;
                this.f7772h = this.f7775k;
                return 0;
            case 6:
                return mo11153m(iy1);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        iy1.mo94n(this.f7765a.mo20679d(), 0, 12);
        this.f7765a.mo20674P(0);
        if (this.f7765a.mo20692q() != 1179011410) {
            return false;
        }
        this.f7765a.mo20675Q(4);
        if (this.f7765a.mo20692q() == 541677121) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final te0 mo11148g(int i) {
        for (te0 te0 : this.f7771g) {
            if (te0.mo26426j(i)) {
                return te0;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final void mo11149h(gm4 gm4) throws IOException {
        xh3 c = xh3.m30100c(1819436136, gm4);
        if (c.getType() == 1819436136) {
            C1657bw bwVar = (C1657bw) c.mo27734b(C1657bw.class);
            if (bwVar != null) {
                this.f7769e = bwVar;
                this.f7770f = ((long) bwVar.f8271c) * ((long) bwVar.f8269a);
                ArrayList arrayList = new ArrayList();
                c47<C3763zv> it = c.f19833a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C3763zv next = it.next();
                    if (next.getType() == 1819440243) {
                        int i2 = i + 1;
                        te0 l = mo11152l((xh3) next, i);
                        if (l != null) {
                            arrayList.add(l);
                        }
                        i = i2;
                    }
                }
                this.f7771g = (te0[]) arrayList.toArray(new te0[0]);
                this.f7768d.mo7722p();
                return;
            }
            throw ParserException.createForMalformedContainer("AviHeader not found", (Throwable) null);
        }
        throw ParserException.createForMalformedContainer("Unexpected header list type " + c.getType(), (Throwable) null);
    }

    /* renamed from: i */
    public final void mo11150i(gm4 gm4) {
        long k = mo11151k(gm4);
        while (gm4.mo20676a() >= 16) {
            int q = gm4.mo20692q();
            int q2 = gm4.mo20692q();
            long q3 = ((long) gm4.mo20692q()) + k;
            gm4.mo20692q();
            te0 g = mo11148g(q);
            if (g != null) {
                if ((q2 & 16) == 16) {
                    g.mo26419b(q3);
                }
                g.mo26427k();
            }
        }
        for (te0 c : this.f7771g) {
            c.mo26420c();
        }
        this.f7778n = true;
        this.f7768d.mo7715g(new C1585b(this.f7770f));
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f7767c = 0;
        this.f7768d = jy1;
        this.f7772h = -1;
    }

    /* renamed from: k */
    public final long mo11151k(gm4 gm4) {
        long j = 0;
        if (gm4.mo20676a() < 16) {
            return 0;
        }
        int e = gm4.mo20680e();
        gm4.mo20675Q(8);
        long j2 = this.f7775k;
        if (((long) gm4.mo20692q()) <= j2) {
            j = 8 + j2;
        }
        gm4.mo20674P(e);
        return j;
    }

    /* renamed from: l */
    public final te0 mo11152l(xh3 xh3, int i) {
        C2125cw cwVar = (C2125cw) xh3.mo27734b(C2125cw.class);
        na6 na6 = (na6) xh3.mo27734b(na6.class);
        if (cwVar == null) {
            gk3.m18132i("AviExtractor", "Missing Stream Header");
            return null;
        } else if (na6 == null) {
            gk3.m18132i("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a = cwVar.mo18363a();
            C0792h hVar = na6.f15512a;
            C0792h.C0794b b = hVar.mo6636b();
            b.mo6657R(i);
            int i2 = cwVar.f10396f;
            if (i2 != 0) {
                b.mo6662W(i2);
            }
            qa6 qa6 = (qa6) xh3.mo27734b(qa6.class);
            if (qa6 != null) {
                b.mo6660U(qa6.f16894a);
            }
            int i3 = vv3.m29135i(hVar.f4175C);
            if (i3 != 1 && i3 != 2) {
                return null;
            }
            zs6 f = this.f7768d.mo7713f(i, i3);
            f.mo7303d(b.mo6644E());
            te0 te0 = new te0(i, i3, a, cwVar.f10395e, f);
            this.f7770f = a;
            return te0;
        }
    }

    /* renamed from: m */
    public final int mo11153m(iy1 iy1) throws IOException {
        if (iy1.getPosition() >= this.f7776l) {
            return -1;
        }
        te0 te0 = this.f7773i;
        if (te0 == null) {
            m10815f(iy1);
            int i = 12;
            iy1.mo94n(this.f7765a.mo20679d(), 0, 12);
            this.f7765a.mo20674P(0);
            int q = this.f7765a.mo20692q();
            if (q == 1414744396) {
                this.f7765a.mo20674P(8);
                if (this.f7765a.mo20692q() != 1769369453) {
                    i = 8;
                }
                iy1.mo92k(i);
                iy1.mo85e();
                return 0;
            }
            int q2 = this.f7765a.mo20692q();
            if (q == 1263424842) {
                this.f7772h = iy1.getPosition() + ((long) q2) + 8;
                return 0;
            }
            iy1.mo92k(8);
            iy1.mo85e();
            te0 g = mo11148g(q);
            if (g == null) {
                this.f7772h = iy1.getPosition() + ((long) q2);
                return 0;
            }
            g.mo26430n(q2);
            this.f7773i = g;
        } else if (te0.mo26429m(iy1)) {
            this.f7773i = null;
        }
        return 0;
    }

    /* renamed from: n */
    public final boolean mo11154n(iy1 iy1, mt4 mt4) throws IOException {
        boolean z;
        if (this.f7772h != -1) {
            long position = iy1.getPosition();
            long j = this.f7772h;
            if (j < position || j > 262144 + position) {
                mt4.f15249a = j;
                z = true;
                this.f7772h = -1;
                return z;
            }
            iy1.mo92k((int) (j - position));
        }
        z = false;
        this.f7772h = -1;
        return z;
    }
}
