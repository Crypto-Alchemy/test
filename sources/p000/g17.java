package p000;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;

/* renamed from: g17 */
/* compiled from: TypeProjectionBase */
public abstract class g17 implements f17 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f17)) {
            return false;
        }
        f17 f17 = (f17) obj;
        if (mo51408b() == f17.mo51408b() && mo51409c() == f17.mo51409c() && getType().equals(f17.getType())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = mo51409c().hashCode();
        if (x17.m73838v(getType())) {
            return (hashCode * 31) + 19;
        }
        int i2 = hashCode * 31;
        if (mo51408b()) {
            i = 17;
        } else {
            i = getType().hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        if (mo51408b()) {
            return Marker.ANY_MARKER;
        }
        if (mo51409c() == Variance.INVARIANT) {
            return getType().toString();
        }
        return mo51409c() + " " + getType();
    }
}
