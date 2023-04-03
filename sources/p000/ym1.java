package p000;

import com.github.mikephil.charting.utils.Utils;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: ym1 */
/* compiled from: Easing */
public class ym1 {

    /* renamed from: b */
    public static ym1 f20290b = new ym1();

    /* renamed from: c */
    public static String[] f20291c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public String f20292a = "identity";

    /* renamed from: ym1$a */
    /* compiled from: Easing */
    public static class C3687a extends ym1 {

        /* renamed from: h */
        public static double f20293h = 0.01d;

        /* renamed from: i */
        public static double f20294i = 1.0E-4d;

        /* renamed from: d */
        public double f20295d;

        /* renamed from: e */
        public double f20296e;

        /* renamed from: f */
        public double f20297f;

        /* renamed from: g */
        public double f20298g;

        public C3687a(String str) {
            this.f20292a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f20295d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f20296e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f20297f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f20298g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public double mo21311a(double d) {
            if (d <= Utils.DOUBLE_EPSILON) {
                return Utils.DOUBLE_EPSILON;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f20293h) {
                d2 *= 0.5d;
                if (mo28163d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = mo28163d(d4);
            double d6 = d3 + d2;
            double d7 = mo28163d(d6);
            double e = mo28164e(d4);
            return (((mo28164e(d6) - e) * (d - d5)) / (d7 - d5)) + e;
        }

        /* renamed from: b */
        public double mo21312b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f20294i) {
                d2 *= 0.5d;
                if (mo28163d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = mo28163d(d4);
            double d6 = d3 + d2;
            return (mo28164e(d6) - mo28164e(d4)) / (mo28163d(d6) - d5);
        }

        /* renamed from: d */
        public final double mo28163d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f20295d * d2 * d3 * d) + (this.f20297f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: e */
        public final double mo28164e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f20296e * d2 * d3 * d) + (this.f20298g * d3 * d * d) + (d * d * d);
        }
    }

    /* renamed from: c */
    public static ym1 m30704c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C3687a(str);
        }
        if (str.startsWith("spline")) {
            return new v96(str);
        }
        if (str.startsWith("Schlick")) {
            return new hn5(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3687a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C3687a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C3687a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C3687a("cubic(1, 1, 0, 0)");
            case 4:
                return new C3687a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C3687a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f20291c));
                return f20290b;
        }
    }

    /* renamed from: a */
    public double mo21311a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo21312b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f20292a;
    }
}
