package p000;

import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* renamed from: oc1 */
/* compiled from: DeprecationInfo.kt */
public abstract class oc1 implements Comparable<oc1> {
    /* renamed from: a */
    public int compareTo(oc1 oc1) {
        vx2.m53591g(oc1, "other");
        int compareTo = mo56446d().compareTo(oc1.mo56446d());
        if (compareTo != 0 || mo62878e() || !oc1.mo62878e()) {
            return compareTo;
        }
        return 1;
    }

    /* renamed from: d */
    public abstract DeprecationLevelValue mo56446d();

    /* renamed from: e */
    public abstract boolean mo62878e();
}
