package p000;

import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: ga3 */
/* compiled from: KeyCycleOscillator */
public abstract class ga3 {

    /* renamed from: a */
    public ux0 f12211a;

    /* renamed from: b */
    public C2349b f12212b;

    /* renamed from: c */
    public String f12213c;

    /* renamed from: d */
    public int f12214d = 0;

    /* renamed from: e */
    public String f12215e = null;

    /* renamed from: f */
    public int f12216f = 0;

    /* renamed from: g */
    public ArrayList<C2350c> f12217g = new ArrayList<>();

    /* renamed from: ga3$a */
    /* compiled from: KeyCycleOscillator */
    public class C2348a implements Comparator<C2350c> {
        public C2348a() {
        }

        /* renamed from: a */
        public int compare(C2350c cVar, C2350c cVar2) {
            return Integer.compare(cVar.f12235a, cVar2.f12235a);
        }
    }

    /* renamed from: ga3$b */
    /* compiled from: KeyCycleOscillator */
    public static class C2349b {

        /* renamed from: a */
        public final int f12219a;

        /* renamed from: b */
        public cj4 f12220b;

        /* renamed from: c */
        public final int f12221c = 0;

        /* renamed from: d */
        public final int f12222d = 1;

        /* renamed from: e */
        public final int f12223e = 2;

        /* renamed from: f */
        public float[] f12224f;

        /* renamed from: g */
        public double[] f12225g;

        /* renamed from: h */
        public float[] f12226h;

        /* renamed from: i */
        public float[] f12227i;

        /* renamed from: j */
        public float[] f12228j;

        /* renamed from: k */
        public float[] f12229k;

        /* renamed from: l */
        public int f12230l;

        /* renamed from: m */
        public ux0 f12231m;

        /* renamed from: n */
        public double[] f12232n;

        /* renamed from: o */
        public double[] f12233o;

        /* renamed from: p */
        public float f12234p;

        public C2349b(int i, String str, int i2, int i3) {
            cj4 cj4 = new cj4();
            this.f12220b = cj4;
            this.f12230l = i;
            this.f12219a = i2;
            cj4.mo12075g(i, str);
            this.f12224f = new float[i3];
            this.f12225g = new double[i3];
            this.f12226h = new float[i3];
            this.f12227i = new float[i3];
            this.f12228j = new float[i3];
            this.f12229k = new float[i3];
        }

        /* renamed from: a */
        public double mo20451a(float f) {
            ux0 ux0 = this.f12231m;
            if (ux0 != null) {
                double d = (double) f;
                ux0.mo22304g(d, this.f12233o);
                this.f12231m.mo22301d(d, this.f12232n);
            } else {
                double[] dArr = this.f12233o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = (double) f;
            double e = this.f12220b.mo12073e(d2, this.f12232n[1]);
            double d3 = this.f12220b.mo12072d(d2, this.f12232n[1], this.f12233o[1]);
            double[] dArr2 = this.f12233o;
            return dArr2[0] + (e * dArr2[2]) + (d3 * this.f12232n[2]);
        }

        /* renamed from: b */
        public double mo20452b(float f) {
            ux0 ux0 = this.f12231m;
            if (ux0 != null) {
                ux0.mo22301d((double) f, this.f12232n);
            } else {
                double[] dArr = this.f12232n;
                dArr[0] = (double) this.f12227i[0];
                dArr[1] = (double) this.f12228j[0];
                dArr[2] = (double) this.f12224f[0];
            }
            double[] dArr2 = this.f12232n;
            return dArr2[0] + (this.f12220b.mo12073e((double) f, dArr2[1]) * this.f12232n[2]);
        }

        /* renamed from: c */
        public void mo20453c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f12225g[i] = ((double) i2) / 100.0d;
            this.f12226h[i] = f;
            this.f12227i[i] = f2;
            this.f12228j[i] = f3;
            this.f12224f[i] = f4;
        }

        /* renamed from: d */
        public void mo20454d(float f) {
            this.f12234p = f;
            int length = this.f12225g.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
            float[] fArr = this.f12224f;
            this.f12232n = new double[(fArr.length + 2)];
            this.f12233o = new double[(fArr.length + 2)];
            if (this.f12225g[0] > Utils.DOUBLE_EPSILON) {
                this.f12220b.mo12069a(Utils.DOUBLE_EPSILON, this.f12226h[0]);
            }
            double[] dArr2 = this.f12225g;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f12220b.mo12069a(1.0d, this.f12226h[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = (double) this.f12227i[i];
                dArr3[1] = (double) this.f12228j[i];
                dArr3[2] = (double) this.f12224f[i];
                this.f12220b.mo12069a(this.f12225g[i], this.f12226h[i]);
            }
            this.f12220b.mo12074f();
            double[] dArr4 = this.f12225g;
            if (dArr4.length > 1) {
                this.f12231m = ux0.m28444a(0, dArr4, dArr);
            } else {
                this.f12231m = null;
            }
        }
    }

    /* renamed from: ga3$c */
    /* compiled from: KeyCycleOscillator */
    public static class C2350c {

        /* renamed from: a */
        public int f12235a;

        /* renamed from: b */
        public float f12236b;

        /* renamed from: c */
        public float f12237c;

        /* renamed from: d */
        public float f12238d;

        /* renamed from: e */
        public float f12239e;

        public C2350c(int i, float f, float f2, float f3, float f4) {
            this.f12235a = i;
            this.f12236b = f4;
            this.f12237c = f2;
            this.f12238d = f;
            this.f12239e = f3;
        }
    }

    /* renamed from: a */
    public float mo20440a(float f) {
        return (float) this.f12212b.mo20452b(f);
    }

    /* renamed from: b */
    public float mo20441b(float f) {
        return (float) this.f12212b.mo20451a(f);
    }

    /* renamed from: c */
    public void mo20442c(Object obj) {
    }

    /* renamed from: d */
    public void mo20443d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        int i4 = i3;
        this.f12217g.add(new C2350c(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f12216f = i4;
        }
        this.f12214d = i2;
        this.f12215e = str;
    }

    /* renamed from: e */
    public void mo20444e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        int i4 = i3;
        this.f12217g.add(new C2350c(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f12216f = i4;
        }
        this.f12214d = i2;
        mo20442c(obj);
        this.f12215e = str;
    }

    /* renamed from: f */
    public void mo20445f(String str) {
        this.f12213c = str;
    }

    /* renamed from: g */
    public void mo20446g(float f) {
        int size = this.f12217g.size();
        if (size != 0) {
            Collections.sort(this.f12217g, new C2348a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f12212b = new C2349b(this.f12214d, this.f12215e, this.f12216f, size);
            Iterator<C2350c> it = this.f12217g.iterator();
            int i = 0;
            while (it.hasNext()) {
                C2350c next = it.next();
                float f2 = next.f12238d;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.f12236b;
                dArr3[c] = (double) f3;
                float f4 = next.f12237c;
                dArr3[1] = (double) f4;
                float f5 = next.f12239e;
                dArr3[2] = (double) f5;
                this.f12212b.mo20453c(i, next.f12235a, f2, f4, f5, f3);
                i++;
                c = 0;
            }
            this.f12212b.mo20454d(f);
            this.f12211a = ux0.m28444a(0, dArr, dArr2);
        }
    }

    /* renamed from: h */
    public boolean mo20447h() {
        if (this.f12216f == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f12213c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C2350c> it = this.f12217g.iterator();
        while (it.hasNext()) {
            C2350c next = it.next();
            str = str + "[" + next.f12235a + " , " + decimalFormat.format((double) next.f12236b) + "] ";
        }
        return str;
    }
}
