package p000;

/* renamed from: hn5 */
/* compiled from: Schlick */
public class hn5 extends ym1 {

    /* renamed from: d */
    public double f12976d;

    /* renamed from: e */
    public double f12977e;

    public hn5(String str) {
        this.f20292a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f12976d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f12977e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: a */
    public double mo21311a(double d) {
        return mo21314e(d);
    }

    /* renamed from: b */
    public double mo21312b(double d) {
        return mo21313d(d);
    }

    /* renamed from: d */
    public final double mo21313d(double d) {
        double d2 = this.f12977e;
        if (d < d2) {
            double d3 = this.f12976d;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f12976d;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    public final double mo21314e(double d) {
        double d2 = this.f12977e;
        if (d < d2) {
            return (d2 * d) / (d + (this.f12976d * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f12976d * (d2 - d)));
    }
}
