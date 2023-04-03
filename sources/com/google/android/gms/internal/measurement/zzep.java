package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public enum zzep implements x49 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    

    /* renamed from: a */
    public static final a59<zzep> f22629a = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        f22629a = new dn8();
    }

    /* access modifiers changed from: public */
    zzep(int i) {
        this.zzg = i;
    }

    public static zzep zza(int i) {
        if (i == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i == 1) {
            return LESS_THAN;
        }
        if (i == 2) {
            return GREATER_THAN;
        }
        if (i == 3) {
            return EQUAL;
        }
        if (i != 4) {
            return null;
        }
        return BETWEEN;
    }

    public static d59 zzb() {
        return gn8.f29296a;
    }

    public final String toString() {
        return "<" + zzep.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
