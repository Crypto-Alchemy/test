package p000;

import java.io.IOException;

/* renamed from: ts6 */
/* compiled from: TrackFragment */
public final class ts6 {

    /* renamed from: a */
    public n91 f18225a;

    /* renamed from: b */
    public long f18226b;

    /* renamed from: c */
    public long f18227c;

    /* renamed from: d */
    public long f18228d;

    /* renamed from: e */
    public int f18229e;

    /* renamed from: f */
    public int f18230f;

    /* renamed from: g */
    public long[] f18231g = new long[0];

    /* renamed from: h */
    public int[] f18232h = new int[0];

    /* renamed from: i */
    public int[] f18233i = new int[0];

    /* renamed from: j */
    public long[] f18234j = new long[0];

    /* renamed from: k */
    public boolean[] f18235k = new boolean[0];

    /* renamed from: l */
    public boolean f18236l;

    /* renamed from: m */
    public boolean[] f18237m = new boolean[0];

    /* renamed from: n */
    public rs6 f18238n;

    /* renamed from: o */
    public final gm4 f18239o = new gm4();

    /* renamed from: p */
    public boolean f18240p;

    /* renamed from: q */
    public long f18241q;

    /* renamed from: r */
    public boolean f18242r;

    /* renamed from: a */
    public void mo26536a(iy1 iy1) throws IOException {
        iy1.readFully(this.f18239o.mo20679d(), 0, this.f18239o.mo20681f());
        this.f18239o.mo20674P(0);
        this.f18240p = false;
    }

    /* renamed from: b */
    public void mo26537b(gm4 gm4) {
        gm4.mo20685j(this.f18239o.mo20679d(), 0, this.f18239o.mo20681f());
        this.f18239o.mo20674P(0);
        this.f18240p = false;
    }

    /* renamed from: c */
    public long mo26538c(int i) {
        return this.f18234j[i];
    }

    /* renamed from: d */
    public void mo26539d(int i) {
        this.f18239o.mo20670L(i);
        this.f18236l = true;
        this.f18240p = true;
    }

    /* renamed from: e */
    public void mo26540e(int i, int i2) {
        this.f18229e = i;
        this.f18230f = i2;
        if (this.f18232h.length < i) {
            this.f18231g = new long[i];
            this.f18232h = new int[i];
        }
        if (this.f18233i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f18233i = new int[i3];
            this.f18234j = new long[i3];
            this.f18235k = new boolean[i3];
            this.f18237m = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void mo26541f() {
        this.f18229e = 0;
        this.f18241q = 0;
        this.f18242r = false;
        this.f18236l = false;
        this.f18240p = false;
        this.f18238n = null;
    }

    /* renamed from: g */
    public boolean mo26542g(int i) {
        if (!this.f18236l || !this.f18237m[i]) {
            return false;
        }
        return true;
    }
}
