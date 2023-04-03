package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.iy6;
import p000.xs5;

/* renamed from: hy6 */
/* compiled from: TsExtractor */
public final class hy6 implements hy1 {

    /* renamed from: t */
    public static final ny1 f13094t = new gy6();

    /* renamed from: a */
    public final int f13095a;

    /* renamed from: b */
    public final int f13096b;

    /* renamed from: c */
    public final List<sq6> f13097c;

    /* renamed from: d */
    public final gm4 f13098d;

    /* renamed from: e */
    public final SparseIntArray f13099e;

    /* renamed from: f */
    public final iy6.C2578c f13100f;

    /* renamed from: g */
    public final SparseArray<iy6> f13101g;

    /* renamed from: h */
    public final SparseBooleanArray f13102h;

    /* renamed from: i */
    public final SparseBooleanArray f13103i;

    /* renamed from: j */
    public final fy6 f13104j;

    /* renamed from: k */
    public ey6 f13105k;

    /* renamed from: l */
    public jy1 f13106l;

    /* renamed from: m */
    public int f13107m;

    /* renamed from: n */
    public boolean f13108n;

    /* renamed from: o */
    public boolean f13109o;

    /* renamed from: p */
    public boolean f13110p;

    /* renamed from: q */
    public iy6 f13111q;

    /* renamed from: r */
    public int f13112r;

    /* renamed from: s */
    public int f13113s;

    /* renamed from: hy6$a */
    /* compiled from: TsExtractor */
    public class C2516a implements vr5 {

        /* renamed from: a */
        public final fm4 f13114a = new fm4(new byte[4]);

        public C2516a() {
        }

        /* renamed from: a */
        public void mo21424a(gm4 gm4) {
            if (gm4.mo20662D() == 0 && (gm4.mo20662D() & 128) != 0) {
                gm4.mo20675Q(6);
                int a = gm4.mo20676a() / 4;
                for (int i = 0; i < a; i++) {
                    gm4.mo20684i(this.f13114a, 4);
                    int h = this.f13114a.mo20004h(16);
                    this.f13114a.mo20014r(3);
                    if (h == 0) {
                        this.f13114a.mo20014r(13);
                    } else {
                        int h2 = this.f13114a.mo20004h(13);
                        if (hy6.this.f13101g.get(h2) == null) {
                            hy6.this.f13101g.put(h2, new wr5(new C2517b(h2)));
                            hy6.m19310l(hy6.this);
                        }
                    }
                }
                if (hy6.this.f13095a != 2) {
                    hy6.this.f13101g.remove(0);
                }
            }
        }

        /* renamed from: b */
        public void mo21425b(sq6 sq6, jy1 jy1, iy6.C2579d dVar) {
        }
    }

    /* renamed from: hy6$b */
    /* compiled from: TsExtractor */
    public class C2517b implements vr5 {

        /* renamed from: a */
        public final fm4 f13116a = new fm4(new byte[5]);

        /* renamed from: b */
        public final SparseArray<iy6> f13117b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f13118c = new SparseIntArray();

        /* renamed from: d */
        public final int f13119d;

        public C2517b(int i) {
            this.f13119d = i;
        }

        /* renamed from: a */
        public void mo21424a(gm4 gm4) {
            sq6 sq6;
            int i;
            int i2;
            iy6 iy6;
            gm4 gm42 = gm4;
            if (gm4.mo20662D() == 2) {
                if (hy6.this.f13095a == 1 || hy6.this.f13095a == 2 || hy6.this.f13107m == 1) {
                    sq6 = (sq6) hy6.this.f13097c.get(0);
                } else {
                    sq6 = new sq6(((sq6) hy6.this.f13097c.get(0)).mo25934c());
                    hy6.this.f13097c.add(sq6);
                }
                if ((gm4.mo20662D() & 128) != 0) {
                    gm42.mo20675Q(1);
                    int J = gm4.mo20668J();
                    int i3 = 3;
                    gm42.mo20675Q(3);
                    gm42.mo20684i(this.f13116a, 2);
                    this.f13116a.mo20014r(3);
                    int i4 = 13;
                    int unused = hy6.this.f13113s = this.f13116a.mo20004h(13);
                    gm42.mo20684i(this.f13116a, 2);
                    int i5 = 4;
                    this.f13116a.mo20014r(4);
                    gm42.mo20675Q(this.f13116a.mo20004h(12));
                    if (hy6.this.f13095a == 2 && hy6.this.f13111q == null) {
                        iy6.C2577b bVar = new iy6.C2577b(21, (String) null, (List<iy6.C2576a>) null, w67.f19026f);
                        hy6 hy6 = hy6.this;
                        iy6 unused2 = hy6.f13111q = hy6.f13100f.mo21669b(21, bVar);
                        if (hy6.this.f13111q != null) {
                            hy6.this.f13111q.mo21666b(sq6, hy6.this.f13106l, new iy6.C2579d(J, 21, 8192));
                        }
                    }
                    this.f13117b.clear();
                    this.f13118c.clear();
                    int a = gm4.mo20676a();
                    while (a > 0) {
                        gm42.mo20684i(this.f13116a, 5);
                        int h = this.f13116a.mo20004h(8);
                        this.f13116a.mo20014r(i3);
                        int h2 = this.f13116a.mo20004h(i4);
                        this.f13116a.mo20014r(i5);
                        int h3 = this.f13116a.mo20004h(12);
                        iy6.C2577b c = mo21426c(gm42, h3);
                        if (h == 6 || h == 5) {
                            h = c.f13447a;
                        }
                        a -= h3 + 5;
                        if (hy6.this.f13095a == 2) {
                            i2 = h;
                        } else {
                            i2 = h2;
                        }
                        if (!hy6.this.f13102h.get(i2)) {
                            if (hy6.this.f13095a == 2 && h == 21) {
                                iy6 = hy6.this.f13111q;
                            } else {
                                iy6 = hy6.this.f13100f.mo21669b(h, c);
                            }
                            if (hy6.this.f13095a != 2 || h2 < this.f13118c.get(i2, 8192)) {
                                this.f13118c.put(i2, h2);
                                this.f13117b.put(i2, iy6);
                            }
                        }
                        i3 = 3;
                        i5 = 4;
                        i4 = 13;
                    }
                    int size = this.f13118c.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = this.f13118c.keyAt(i6);
                        int valueAt = this.f13118c.valueAt(i6);
                        hy6.this.f13102h.put(keyAt, true);
                        hy6.this.f13103i.put(valueAt, true);
                        iy6 valueAt2 = this.f13117b.valueAt(i6);
                        if (valueAt2 != null) {
                            if (valueAt2 != hy6.this.f13111q) {
                                valueAt2.mo21666b(sq6, hy6.this.f13106l, new iy6.C2579d(J, keyAt, 8192));
                            }
                            hy6.this.f13101g.put(valueAt, valueAt2);
                        }
                    }
                    if (hy6.this.f13095a != 2) {
                        hy6.this.f13101g.remove(this.f13119d);
                        hy6 hy62 = hy6.this;
                        if (hy62.f13095a == 1) {
                            i = 0;
                        } else {
                            i = hy6.this.f13107m - 1;
                        }
                        int unused3 = hy62.f13107m = i;
                        if (hy6.this.f13107m == 0) {
                            hy6.this.f13106l.mo7722p();
                            boolean unused4 = hy6.this.f13108n = true;
                        }
                    } else if (!hy6.this.f13108n) {
                        hy6.this.f13106l.mo7722p();
                        int unused5 = hy6.this.f13107m = 0;
                        boolean unused6 = hy6.this.f13108n = true;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo21425b(sq6 sq6, jy1 jy1, iy6.C2579d dVar) {
        }

        /* renamed from: c */
        public final iy6.C2577b mo21426c(gm4 gm4, int i) {
            int e = gm4.mo20680e();
            int i2 = i + e;
            String str = null;
            int i3 = -1;
            ArrayList arrayList = null;
            while (gm4.mo20680e() < i2) {
                int D = gm4.mo20662D();
                int e2 = gm4.mo20680e() + gm4.mo20662D();
                if (e2 > i2) {
                    break;
                }
                if (D == 5) {
                    long F = gm4.mo20664F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i3 = 36;
                                }
                                gm4.mo20675Q(e2 - gm4.mo20680e());
                            }
                        }
                        i3 = 135;
                        gm4.mo20675Q(e2 - gm4.mo20680e());
                    }
                    i3 = 129;
                    gm4.mo20675Q(e2 - gm4.mo20680e());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (gm4.mo20662D() != 21) {
                                }
                            } else if (D == 123) {
                                i3 = 138;
                            } else if (D == 10) {
                                str = gm4.mo20659A(3).trim();
                            } else if (D == 89) {
                                arrayList = new ArrayList();
                                while (gm4.mo20680e() < e2) {
                                    String trim = gm4.mo20659A(3).trim();
                                    int D2 = gm4.mo20662D();
                                    byte[] bArr = new byte[4];
                                    gm4.mo20685j(bArr, 0, 4);
                                    arrayList.add(new iy6.C2576a(trim, D2, bArr));
                                }
                                i3 = 89;
                            } else if (D == 111) {
                                i3 = 257;
                            }
                            gm4.mo20675Q(e2 - gm4.mo20680e());
                        }
                        i3 = 135;
                        gm4.mo20675Q(e2 - gm4.mo20680e());
                    }
                    i3 = 129;
                    gm4.mo20675Q(e2 - gm4.mo20680e());
                }
                i3 = 172;
                gm4.mo20675Q(e2 - gm4.mo20680e());
            }
            gm4.mo20674P(i2);
            return new iy6.C2577b(i3, str, arrayList, Arrays.copyOfRange(gm4.mo20679d(), e, i2));
        }
    }

    public hy6() {
        this(0);
    }

    /* renamed from: l */
    public static /* synthetic */ int m19310l(hy6 hy6) {
        int i = hy6.f13107m;
        hy6.f13107m = i + 1;
        return i;
    }

    /* renamed from: x */
    public static /* synthetic */ hy1[] m19320x() {
        return new hy1[]{new hy6()};
    }

    /* renamed from: A */
    public final boolean mo21419A(int i) {
        if (this.f13095a == 2 || this.f13108n || !this.f13103i.get(i, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        boolean z;
        ey6 ey6;
        boolean z2;
        if (this.f13095a != 2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        int size = this.f13097c.size();
        for (int i = 0; i < size; i++) {
            sq6 sq6 = this.f13097c.get(i);
            if (sq6.mo25936e() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long c = sq6.mo25934c();
                if (c == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || c == 0 || c == j2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                sq6.mo25937g(j2);
            }
        }
        if (!(j2 == 0 || (ey6 = this.f13105k) == null)) {
            ey6.mo23006h(j2);
        }
        this.f13098d.mo20670L(0);
        this.f13099e.clear();
        for (int i2 = 0; i2 < this.f13101g.size(); i2++) {
            this.f13101g.valueAt(i2).mo21667c();
        }
        this.f13112r = 0;
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        int i;
        boolean z;
        boolean z2;
        iy6 iy6;
        int i2;
        boolean z3;
        iy1 iy12 = iy1;
        mt4 mt42 = mt4;
        long length = iy1.getLength();
        if (this.f13108n) {
            if (length == -1 || this.f13095a == 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && !this.f13104j.mo20269d()) {
                return this.f13104j.mo20270e(iy12, mt42, this.f13113s);
            }
            mo21422y(length);
            if (this.f13110p) {
                this.f13110p = false;
                mo152b(0, 0);
                if (iy1.getPosition() != 0) {
                    mt42.f15249a = 0;
                    return 1;
                }
            }
            ey6 ey6 = this.f13105k;
            if (ey6 != null && ey6.mo23002d()) {
                return this.f13105k.mo23001c(iy12, mt42);
            }
        }
        if (!mo21420v(iy1)) {
            return -1;
        }
        int w = mo21421w();
        int f = this.f13098d.mo20681f();
        if (w > f) {
            return 0;
        }
        int n = this.f13098d.mo20689n();
        if ((8388608 & n) != 0) {
            this.f13098d.mo20674P(w);
            return 0;
        }
        if ((4194304 & n) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i | 0;
        int i4 = (2096896 & n) >> 8;
        if ((n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((n & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            iy6 = this.f13101g.get(i4);
        } else {
            iy6 = null;
        }
        if (iy6 == null) {
            this.f13098d.mo20674P(w);
            return 0;
        }
        if (this.f13095a != 2) {
            int i5 = n & 15;
            int i6 = this.f13099e.get(i4, i5 - 1);
            this.f13099e.put(i4, i5);
            if (i6 == i5) {
                this.f13098d.mo20674P(w);
                return 0;
            } else if (i5 != ((i6 + 1) & 15)) {
                iy6.mo21667c();
            }
        }
        if (z) {
            int D = this.f13098d.mo20662D();
            if ((this.f13098d.mo20662D() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i3 |= i2;
            this.f13098d.mo20675Q(D - 1);
        }
        boolean z4 = this.f13108n;
        if (mo21419A(i4)) {
            this.f13098d.mo20673O(w);
            iy6.mo21665a(this.f13098d, i3);
            this.f13098d.mo20673O(f);
        }
        if (this.f13095a != 2 && !z4 && this.f13108n && length != -1) {
            this.f13110p = true;
        }
        this.f13098d.mo20674P(w);
        return 0;
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        boolean z;
        byte[] d = this.f13098d.mo20679d();
        iy1.mo94n(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                iy1.mo92k(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f13106l = jy1;
    }

    /* renamed from: v */
    public final boolean mo21420v(iy1 iy1) throws IOException {
        byte[] d = this.f13098d.mo20679d();
        if (9400 - this.f13098d.mo20680e() < 188) {
            int a = this.f13098d.mo20676a();
            if (a > 0) {
                System.arraycopy(d, this.f13098d.mo20680e(), d, 0, a);
            }
            this.f13098d.mo20672N(d, a);
        }
        while (this.f13098d.mo20676a() < 188) {
            int f = this.f13098d.mo20681f();
            int read = iy1.read(d, f, 9400 - f);
            if (read == -1) {
                return false;
            }
            this.f13098d.mo20673O(f + read);
        }
        return true;
    }

    /* renamed from: w */
    public final int mo21421w() throws ParserException {
        int e = this.f13098d.mo20680e();
        int f = this.f13098d.mo20681f();
        int a = jy6.m20476a(this.f13098d.mo20679d(), e, f);
        this.f13098d.mo20674P(a);
        int i = a + 188;
        if (i > f) {
            int i2 = this.f13112r + (a - e);
            this.f13112r = i2;
            if (this.f13095a == 2 && i2 > 376) {
                throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f13112r = 0;
        }
        return i;
    }

    /* renamed from: y */
    public final void mo21422y(long j) {
        if (!this.f13109o) {
            this.f13109o = true;
            if (this.f13104j.mo20267b() != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                ey6 ey6 = new ey6(this.f13104j.mo20268c(), this.f13104j.mo20267b(), j, this.f13113s, this.f13096b);
                this.f13105k = ey6;
                this.f13106l.mo7715g(ey6.mo23000b());
                return;
            }
            this.f13106l.mo7715g(new xs5.C3642b(this.f13104j.mo20267b()));
        }
    }

    /* renamed from: z */
    public final void mo21423z() {
        this.f13102h.clear();
        this.f13101g.clear();
        SparseArray<iy6> a = this.f13100f.mo21668a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f13101g.put(a.keyAt(i), a.valueAt(i));
        }
        this.f13101g.put(0, new wr5(new C2516a()));
        this.f13111q = null;
    }

    public hy6(int i) {
        this(1, i, 112800);
    }

    public hy6(int i, int i2, int i3) {
        this(i, new sq6(0), new sa1(i2), i3);
    }

    public hy6(int i, sq6 sq6, iy6.C2578c cVar, int i2) {
        this.f13100f = (iy6.C2578c) C2725kr.m20985e(cVar);
        this.f13096b = i2;
        this.f13095a = i;
        if (i == 1 || i == 2) {
            this.f13097c = Collections.singletonList(sq6);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f13097c = arrayList;
            arrayList.add(sq6);
        }
        this.f13098d = new gm4(new byte[9400], 0);
        this.f13102h = new SparseBooleanArray();
        this.f13103i = new SparseBooleanArray();
        this.f13101g = new SparseArray<>();
        this.f13099e = new SparseIntArray();
        this.f13104j = new fy6(i2);
        this.f13106l = jy1.f13901j;
        this.f13113s = -1;
        mo21423z();
    }
}
