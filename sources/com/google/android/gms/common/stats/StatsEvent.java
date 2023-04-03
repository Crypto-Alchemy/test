package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: r1 */
    public abstract long mo30728r1();

    /* renamed from: s1 */
    public abstract long mo30729s1();

    /* renamed from: t1 */
    public abstract String mo30730t1();

    public final String toString() {
        long s1 = mo30729s1();
        int zza = zza();
        long r1 = mo30728r1();
        String t1 = mo30730t1();
        return s1 + "\t" + zza + "\t" + r1 + t1;
    }

    public abstract int zza();
}
