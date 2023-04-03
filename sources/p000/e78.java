package p000;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: e78 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class e78 implements r88 {

    /* renamed from: a */
    public final Double f28414a;

    public e78(Double d) {
        if (d == null) {
            this.f28414a = Double.valueOf(Double.NaN);
        } else {
            this.f28414a = d;
        }
    }

    /* renamed from: b */
    public final Double mo29499b() {
        return this.f28414a;
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        boolean z = false;
        if (!Double.isNaN(this.f28414a.doubleValue()) && this.f28414a.doubleValue() != Utils.DOUBLE_EPSILON) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e78)) {
            return false;
        }
        return this.f28414a.equals(((e78) obj).f28414a);
    }

    public final int hashCode() {
        return this.f28414a.hashCode();
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        return new e78(this.f28414a);
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        if ("toString".equals(str)) {
            return new b98(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzc(), str}));
    }

    public final String toString() {
        return zzc();
    }

    public final String zzc() {
        int i;
        if (Double.isNaN(this.f28414a.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(this.f28414a.doubleValue())) {
            BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f28414a.doubleValue()).stripTrailingZeros();
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (stripTrailingZeros.scale() > 0) {
                i = stripTrailingZeros.precision();
            } else {
                i = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(i - 1);
            String format = decimalFormat.format(stripTrailingZeros);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return stripTrailingZeros.toPlainString();
        } else if (this.f28414a.doubleValue() > Utils.DOUBLE_EPSILON) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }
}
