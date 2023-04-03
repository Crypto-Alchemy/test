package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: p5 */
/* compiled from: AbsoluteCornerSize */
public final class C6340p5 implements du0 {

    /* renamed from: a */
    public final float f32579a;

    public C6340p5(float f) {
        this.f32579a = f;
    }

    /* renamed from: a */
    public float mo29529a(RectF rectF) {
        return this.f32579a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6340p5)) {
            return false;
        }
        if (this.f32579a == ((C6340p5) obj).f32579a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f32579a)});
    }
}
