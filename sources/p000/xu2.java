package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: xu2 */
/* compiled from: InputFilterMinMax */
public class xu2 implements InputFilter {

    /* renamed from: a */
    public Double f46012a;

    /* renamed from: b */
    public Double f46013b;

    public xu2(Double d, Double d2) {
        this.f46012a = d;
        this.f46013b = d2;
    }

    /* renamed from: a */
    public final boolean mo66938a(Double d, Double d2, Double d3) {
        int i = (d2.doubleValue() > d.doubleValue() ? 1 : (d2.doubleValue() == d.doubleValue() ? 0 : -1));
        double doubleValue = d3.doubleValue();
        if (i > 0) {
            if (doubleValue >= d.doubleValue() && d3.doubleValue() <= d2.doubleValue()) {
                return true;
            }
        } else if (doubleValue >= d2.doubleValue() && d3.doubleValue() <= d.doubleValue()) {
            return true;
        }
        return false;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            String str = spanned.toString() + charSequence.toString();
            if (!ol0.m70364i0(str)) {
                return "";
            }
            if (mo66938a(this.f46012a, this.f46013b, Double.valueOf(ol0.m70330J(str)))) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
        }
    }

    public xu2(String str, String str2) {
        this.f46012a = Double.valueOf(ol0.m70330J(str));
        this.f46013b = Double.valueOf(ol0.m70330J(str2));
    }
}
