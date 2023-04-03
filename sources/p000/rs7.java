package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rs7 */
public final class rs7 {

    /* renamed from: a */
    public final Map<String, Double> f33561a = new HashMap();

    /* renamed from: a */
    public final synchronized void mo47475a(String str) {
        this.f33561a.put(str, Double.valueOf(Utils.DOUBLE_EPSILON));
    }

    /* renamed from: b */
    public final synchronized double mo47476b(String str) {
        Double d = this.f33561a.get(str);
        if (d == null) {
            return Utils.DOUBLE_EPSILON;
        }
        return d.doubleValue();
    }

    /* renamed from: c */
    public final synchronized double mo47477c(String str, ut7 ut7) {
        double d;
        d = (((double) ((os7) ut7).f32429g) + 1.0d) / ((double) ((os7) ut7).f32430h);
        this.f33561a.put(str, Double.valueOf(d));
        return d;
    }
}
