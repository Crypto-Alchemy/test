package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import p000.xs5;
import p000.zs6;

/* renamed from: te0 */
/* compiled from: ChunkReader */
public final class te0 {

    /* renamed from: a */
    public final zs6 f18120a;

    /* renamed from: b */
    public final int f18121b;

    /* renamed from: c */
    public final int f18122c;

    /* renamed from: d */
    public final long f18123d;

    /* renamed from: e */
    public final int f18124e;

    /* renamed from: f */
    public int f18125f;

    /* renamed from: g */
    public int f18126g;

    /* renamed from: h */
    public int f18127h;

    /* renamed from: i */
    public int f18128i;

    /* renamed from: j */
    public int f18129j;

    /* renamed from: k */
    public long[] f18130k;

    /* renamed from: l */
    public int[] f18131l;

    public te0(int i, int i2, long j, int i3, zs6 zs6) {
        int i4;
        int i5;
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f18123d = j;
        this.f18124e = i3;
        this.f18120a = zs6;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        this.f18121b = m27688d(i, i4);
        if (i2 == 2) {
            i5 = m27688d(i, 1650720768);
        } else {
            i5 = -1;
        }
        this.f18122c = i5;
        this.f18130k = new long[RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN];
        this.f18131l = new int[RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN];
    }

    /* renamed from: d */
    public static int m27688d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* renamed from: a */
    public void mo26418a() {
        this.f18127h++;
    }

    /* renamed from: b */
    public void mo26419b(long j) {
        if (this.f18129j == this.f18131l.length) {
            long[] jArr = this.f18130k;
            this.f18130k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f18131l;
            this.f18131l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f18130k;
        int i = this.f18129j;
        jArr2[i] = j;
        this.f18131l[i] = this.f18128i;
        this.f18129j = i + 1;
    }

    /* renamed from: c */
    public void mo26420c() {
        this.f18130k = Arrays.copyOf(this.f18130k, this.f18129j);
        this.f18131l = Arrays.copyOf(this.f18131l, this.f18129j);
    }

    /* renamed from: e */
    public final long mo26421e(int i) {
        return (this.f18123d * ((long) i)) / ((long) this.f18124e);
    }

    /* renamed from: f */
    public long mo26422f() {
        return mo26421e(this.f18127h);
    }

    /* renamed from: g */
    public long mo26423g() {
        return mo26421e(1);
    }

    /* renamed from: h */
    public final zs5 mo26424h(int i) {
        return new zs5(((long) this.f18131l[i]) * mo26423g(), this.f18130k[i]);
    }

    /* renamed from: i */
    public xs5.C3641a mo26425i(long j) {
        int g = (int) (j / mo26423g());
        int h = w67.m29356h(this.f18131l, g, true, true);
        if (this.f18131l[h] == g) {
            return new xs5.C3641a(mo26424h(h));
        }
        zs5 h2 = mo26424h(h);
        int i = h + 1;
        if (i < this.f18130k.length) {
            return new xs5.C3641a(h2, mo26424h(i));
        }
        return new xs5.C3641a(h2);
    }

    /* renamed from: j */
    public boolean mo26426j(int i) {
        if (this.f18121b == i || this.f18122c == i) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo26427k() {
        this.f18128i++;
    }

    /* renamed from: l */
    public boolean mo26428l() {
        if (Arrays.binarySearch(this.f18131l, this.f18127h) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo26429m(iy1 iy1) throws IOException {
        int i = this.f18126g;
        boolean z = false;
        int e = i - this.f18120a.mo7304e(iy1, i, false);
        this.f18126g = e;
        if (e == 0) {
            z = true;
        }
        if (z) {
            if (this.f18125f > 0) {
                zs6 zs6 = this.f18120a;
                long f = mo26422f();
                boolean l = mo26428l();
                zs6.mo7301b(f, l ? 1 : 0, this.f18125f, 0, (zs6.C3758a) null);
            }
            mo26418a();
        }
        return z;
    }

    /* renamed from: n */
    public void mo26430n(int i) {
        this.f18125f = i;
        this.f18126g = i;
    }

    /* renamed from: o */
    public void mo26431o(long j) {
        if (this.f18129j == 0) {
            this.f18127h = 0;
            return;
        }
        this.f18127h = this.f18131l[w67.m29358i(this.f18130k, j, true, true)];
    }
}
