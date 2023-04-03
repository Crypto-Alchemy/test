package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public enum zzgs implements x49 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);
    

    /* renamed from: a */
    public static final a59<zzgs> f22637a = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        f22637a = new au8();
    }

    /* access modifiers changed from: public */
    zzgs(int i) {
        this.zzg = i;
    }

    public static zzgs zza(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STRING;
        }
        if (i == 2) {
            return NUMBER;
        }
        if (i == 3) {
            return BOOLEAN;
        }
        if (i != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static d59 zzb() {
        return bu8.f21482a;
    }

    public final String toString() {
        return "<" + zzgs.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
