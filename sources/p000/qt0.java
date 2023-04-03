package p000;

import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.p011rd.animation.type.AnimationType;
import com.p011rd.draw.data.Orientation;

/* renamed from: qt0 */
/* compiled from: CoordinatesUtils */
public class qt0 {
    /* renamed from: a */
    public static int m50855a(zt2 zt2, int i) {
        if (zt2 == null) {
            return 0;
        }
        if (zt2.mo49951g() == Orientation.HORIZONTAL) {
            return m50861g(zt2, i);
        }
        return m50862h(zt2, i);
    }

    /* renamed from: b */
    public static int m50856b(zt2 zt2, float f, float f2) {
        int i;
        int i2;
        boolean z;
        int c = zt2.mo49947c();
        int m = zt2.mo49957m();
        int s = zt2.mo49963s();
        int h = zt2.mo49952h();
        if (zt2.mo49951g() == Orientation.HORIZONTAL) {
            i = zt2.mo49948d();
        } else {
            i = zt2.mo49966v();
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < c) {
            if (i3 > 0) {
                i2 = h;
            } else {
                i2 = h / 2;
            }
            int i5 = (m * 2) + (s / 2) + i2 + i4;
            boolean z2 = true;
            if (f < ((float) i4) || f > ((float) i5)) {
                z = false;
            } else {
                z = true;
            }
            if (f2 < Utils.FLOAT_EPSILON || f2 > ((float) i)) {
                z2 = false;
            }
            if (z && z2) {
                return i3;
            }
            i3++;
            i4 = i5;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m50857c(zt2 zt2, int i) {
        int c = zt2.mo49947c();
        int m = zt2.mo49957m();
        int s = zt2.mo49963s();
        int h = zt2.mo49952h();
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            int i4 = s / 2;
            int i5 = i2 + m + i4;
            if (i == i3) {
                return i5;
            }
            i2 = i5 + m + h + i4;
        }
        if (zt2.mo49946b() == AnimationType.DROP) {
            return i2 + (m * 2);
        }
        return i2;
    }

    /* renamed from: d */
    public static int m50858d(zt2 zt2, float f, float f2) {
        if (zt2 == null) {
            return -1;
        }
        if (zt2.mo49951g() != Orientation.HORIZONTAL) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        return m50856b(zt2, f, f2);
    }

    /* renamed from: e */
    public static Pair<Integer, Float> m50859e(zt2 zt2, int i, float f, boolean z) {
        boolean z2;
        boolean z3;
        int c = zt2.mo49947c();
        int q = zt2.mo49961q();
        if (z) {
            i = (c - 1) - i;
        }
        boolean z4 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = c - 1;
            if (i > i2) {
                i = i2;
            }
        }
        if (i > q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z ? i + 1 >= q : i - 1 >= q) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            zt2.mo49939V(i);
            q = i;
        }
        float f2 = Utils.FLOAT_EPSILON;
        if (q == i && f != Utils.FLOAT_EPSILON) {
            z4 = true;
        }
        if (!z4) {
            f = 1.0f - f;
        } else if (z) {
            i--;
        } else {
            i++;
        }
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f >= Utils.FLOAT_EPSILON) {
            f2 = f;
        }
        return new Pair<>(Integer.valueOf(i), Float.valueOf(f2));
    }

    /* renamed from: f */
    public static int m50860f(zt2 zt2) {
        int m = zt2.mo49957m();
        if (zt2.mo49946b() == AnimationType.DROP) {
            return m * 3;
        }
        return m;
    }

    /* renamed from: g */
    public static int m50861g(zt2 zt2, int i) {
        int i2;
        if (zt2 == null) {
            return 0;
        }
        if (zt2.mo49951g() == Orientation.HORIZONTAL) {
            i2 = m50857c(zt2, i);
        } else {
            i2 = m50860f(zt2);
        }
        return i2 + zt2.mo49954j();
    }

    /* renamed from: h */
    public static int m50862h(zt2 zt2, int i) {
        int i2;
        if (zt2 == null) {
            return 0;
        }
        if (zt2.mo49951g() == Orientation.HORIZONTAL) {
            i2 = m50860f(zt2);
        } else {
            i2 = m50857c(zt2, i);
        }
        return i2 + zt2.mo49956l();
    }
}
