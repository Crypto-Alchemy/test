package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: dc5 */
/* compiled from: RelativeCornerSize */
public final class dc5 implements du0 {

    /* renamed from: a */
    public final float f28145a;

    public dc5(float f) {
        this.f28145a = f;
    }

    /* renamed from: a */
    public float mo29529a(RectF rectF) {
        return this.f28145a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc5)) {
            return false;
        }
        if (this.f28145a == ((dc5) obj).f28145a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28145a)});
    }
}
