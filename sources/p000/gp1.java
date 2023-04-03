package p000;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: gp1 */
/* compiled from: EncodedImage */
public class gp1 implements Closeable {

    /* renamed from: H */
    public static boolean f12523H;

    /* renamed from: A */
    public i70 f12524A;

    /* renamed from: B */
    public ColorSpace f12525B;

    /* renamed from: C */
    public boolean f12526C;

    /* renamed from: a */
    public final nh0<PooledByteBuffer> f12527a;

    /* renamed from: d */
    public final td6<FileInputStream> f12528d;

    /* renamed from: e */
    public rq2 f12529e;

    /* renamed from: g */
    public int f12530g;

    /* renamed from: k */
    public int f12531k;

    /* renamed from: r */
    public int f12532r;

    /* renamed from: s */
    public int f12533s;

    /* renamed from: x */
    public int f12534x;

    /* renamed from: y */
    public int f12535y;

    public gp1(nh0<PooledByteBuffer> nh0) {
        this.f12529e = rq2.f17332c;
        this.f12530g = -1;
        this.f12531k = 0;
        this.f12532r = -1;
        this.f12533s = -1;
        this.f12534x = 1;
        this.f12535y = -1;
        au4.m10787b(Boolean.valueOf(nh0.m23180p(nh0)));
        this.f12527a = nh0.clone();
        this.f12528d = null;
    }

    /* renamed from: C */
    public static boolean m18283C(gp1 gp1) {
        if (gp1 == null || !gp1.mo20730A()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static gp1 m18284b(gp1 gp1) {
        if (gp1 != null) {
            return gp1.mo20742a();
        }
        return null;
    }

    /* renamed from: c */
    public static void m18285c(gp1 gp1) {
        if (gp1 != null) {
            gp1.close();
        }
    }

    /* renamed from: z */
    public static boolean m18286z(gp1 gp1) {
        if (gp1.f12530g < 0 || gp1.f12532r < 0 || gp1.f12533s < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public synchronized boolean mo20730A() {
        boolean z;
        if (nh0.m23180p(this.f12527a) || this.f12528d != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: G */
    public void mo20731G() {
        if (!f12523H) {
            mo20759x();
        } else if (!this.f12526C) {
            mo20759x();
            this.f12526C = true;
        }
    }

    /* renamed from: I */
    public final void mo20732I() {
        if (this.f12532r < 0 || this.f12533s < 0) {
            mo20731G();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.zq2 mo20733J() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.mo20752l()     // Catch:{ all -> 0x0030 }
            zq2 r1 = p000.b30.m11038b(r0)     // Catch:{ all -> 0x002e }
            android.graphics.ColorSpace r2 = r1.mo28560a()     // Catch:{ all -> 0x002e }
            r4.f12525B = r2     // Catch:{ all -> 0x002e }
            android.util.Pair r2 = r1.mo28561b()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002e }
            r4.f12532r = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002e }
            r4.f12533s = r2     // Catch:{ all -> 0x002e }
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x0032
        L_0x0030:
            r1 = move-exception
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gp1.mo20733J():zq2");
    }

    /* renamed from: K */
    public final Pair<Integer, Integer> mo20734K() {
        Pair<Integer, Integer> g = jk7.m20210g(mo20752l());
        if (g != null) {
            this.f12532r = ((Integer) g.first).intValue();
            this.f12533s = ((Integer) g.second).intValue();
        }
        return g;
    }

    /* renamed from: L */
    public void mo20735L(i70 i70) {
        this.f12524A = i70;
    }

    /* renamed from: N */
    public void mo20736N(int i) {
        this.f12531k = i;
    }

    /* renamed from: O */
    public void mo20737O(int i) {
        this.f12533s = i;
    }

    /* renamed from: P */
    public void mo20738P(rq2 rq2) {
        this.f12529e = rq2;
    }

    /* renamed from: Q */
    public void mo20739Q(int i) {
        this.f12530g = i;
    }

    /* renamed from: S */
    public void mo20740S(int i) {
        this.f12534x = i;
    }

    /* renamed from: W */
    public void mo20741W(int i) {
        this.f12532r = i;
    }

    /* renamed from: a */
    public gp1 mo20742a() {
        gp1 gp1;
        td6<FileInputStream> td6 = this.f12528d;
        if (td6 != null) {
            gp1 = new gp1(td6, this.f12535y);
        } else {
            nh0<PooledByteBuffer> f = nh0.m23176f(this.f12527a);
            if (f == null) {
                gp1 = null;
            } else {
                try {
                    gp1 = new gp1(f);
                } catch (Throwable th) {
                    nh0.m23178h(f);
                    throw th;
                }
            }
            nh0.m23178h(f);
        }
        if (gp1 != null) {
            gp1.mo20744d(this);
        }
        return gp1;
    }

    public void close() {
        nh0.m23178h(this.f12527a);
    }

    /* renamed from: d */
    public void mo20744d(gp1 gp1) {
        this.f12529e = gp1.mo20751k();
        this.f12532r = gp1.mo20757s();
        this.f12533s = gp1.mo20750j();
        this.f12530g = gp1.mo20754n();
        this.f12531k = gp1.mo20748h();
        this.f12534x = gp1.mo20755p();
        this.f12535y = gp1.mo20756q();
        this.f12524A = gp1.mo20746f();
        this.f12525B = gp1.mo20747g();
        this.f12526C = gp1.mo20758v();
    }

    /* renamed from: e */
    public nh0<PooledByteBuffer> mo20745e() {
        return nh0.m23176f(this.f12527a);
    }

    /* renamed from: f */
    public i70 mo20746f() {
        return this.f12524A;
    }

    /* renamed from: g */
    public ColorSpace mo20747g() {
        mo20732I();
        return this.f12525B;
    }

    /* renamed from: h */
    public int mo20748h() {
        mo20732I();
        return this.f12531k;
    }

    /* renamed from: i */
    public String mo20749i(int i) {
        nh0<PooledByteBuffer> e = mo20745e();
        if (e == null) {
            return "";
        }
        int min = Math.min(mo20756q(), i);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer j = e.mo23684j();
            if (j == null) {
                return "";
            }
            j.mo13167t(0, bArr, 0, min);
            e.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            e.close();
        }
    }

    /* renamed from: j */
    public int mo20750j() {
        mo20732I();
        return this.f12533s;
    }

    /* renamed from: k */
    public rq2 mo20751k() {
        mo20732I();
        return this.f12529e;
    }

    /* renamed from: l */
    public InputStream mo20752l() {
        td6<FileInputStream> td6 = this.f12528d;
        if (td6 != null) {
            return td6.get();
        }
        nh0<PooledByteBuffer> f = nh0.m23176f(this.f12527a);
        if (f == null) {
            return null;
        }
        try {
            return new rs4(f.mo23684j());
        } finally {
            nh0.m23178h(f);
        }
    }

    /* renamed from: m */
    public InputStream mo20753m() {
        return (InputStream) au4.m10792g(mo20752l());
    }

    /* renamed from: n */
    public int mo20754n() {
        mo20732I();
        return this.f12530g;
    }

    /* renamed from: p */
    public int mo20755p() {
        return this.f12534x;
    }

    /* renamed from: q */
    public int mo20756q() {
        nh0<PooledByteBuffer> nh0 = this.f12527a;
        if (nh0 == null || nh0.mo23684j() == null) {
            return this.f12535y;
        }
        return this.f12527a.mo23684j().size();
    }

    /* renamed from: s */
    public int mo20757s() {
        mo20732I();
        return this.f12532r;
    }

    /* renamed from: v */
    public boolean mo20758v() {
        return this.f12526C;
    }

    /* renamed from: x */
    public final void mo20759x() {
        Pair<Integer, Integer> pair;
        rq2 c = sq2.m27065c(mo20752l());
        this.f12529e = c;
        if (r81.m26116b(c)) {
            pair = mo20734K();
        } else {
            pair = mo20733J().mo28561b();
        }
        if (c == r81.f17197a && this.f12530g == -1) {
            if (pair != null) {
                int b = x23.m29843b(mo20752l());
                this.f12531k = b;
                this.f12530g = x23.m29842a(b);
            }
        } else if (c == r81.f17207k && this.f12530g == -1) {
            int a = HeifExifUtil.m13705a(mo20752l());
            this.f12531k = a;
            this.f12530g = x23.m29842a(a);
        } else if (this.f12530g == -1) {
            this.f12530g = 0;
        }
    }

    /* renamed from: y */
    public boolean mo20760y(int i) {
        rq2 rq2 = this.f12529e;
        if ((rq2 != r81.f17197a && rq2 != r81.f17208l) || this.f12528d != null) {
            return true;
        }
        au4.m10792g(this.f12527a);
        PooledByteBuffer j = this.f12527a.mo23684j();
        if (j.mo13169w(i - 2) == -1 && j.mo13169w(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public gp1(td6<FileInputStream> td6) {
        this.f12529e = rq2.f17332c;
        this.f12530g = -1;
        this.f12531k = 0;
        this.f12532r = -1;
        this.f12533s = -1;
        this.f12534x = 1;
        this.f12535y = -1;
        au4.m10792g(td6);
        this.f12527a = null;
        this.f12528d = td6;
    }

    public gp1(td6<FileInputStream> td6, int i) {
        this(td6);
        this.f12535y = i;
    }
}
