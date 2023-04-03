package p000;

import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: bd */
/* compiled from: AdjustedCornerSize */
public final class C3889bd implements du0 {

    /* renamed from: a */
    public final du0 f21244a;

    /* renamed from: b */
    public final float f21245b;

    public C3889bd(float f, du0 du0) {
        while (du0 instanceof C3889bd) {
            du0 = ((C3889bd) du0).f21244a;
            f += ((C3889bd) du0).f21245b;
        }
        this.f21244a = du0;
        this.f21245b = f;
    }

    /* renamed from: a */
    public float mo29529a(RectF rectF) {
        return Math.max(Utils.FLOAT_EPSILON, this.f21244a.mo29529a(rectF) + this.f21245b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3889bd)) {
            return false;
        }
        C3889bd bdVar = (C3889bd) obj;
        if (!this.f21244a.equals(bdVar.f21244a) || this.f21245b != bdVar.f21245b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21244a, Float.valueOf(this.f21245b)});
    }
}
