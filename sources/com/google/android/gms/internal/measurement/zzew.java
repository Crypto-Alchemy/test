package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public enum zzew implements x49 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);
    

    /* renamed from: a */
    public static final a59<zzew> f22631a = null;
    private final int zzi;

    /* access modifiers changed from: public */
    static {
        f22631a = new xn8();
    }

    /* access modifiers changed from: public */
    zzew(int i) {
        this.zzi = i;
    }

    public static zzew zza(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static d59 zzb() {
        return ao8.f20977a;
    }

    public final String toString() {
        return "<" + zzew.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }
}
