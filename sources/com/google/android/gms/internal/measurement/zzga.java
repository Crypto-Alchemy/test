package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public enum zzga implements x49 {
    RADS(1),
    PROVISIONING(2);
    

    /* renamed from: a */
    public static final a59<zzga> f22635a = null;
    private final int zzd;

    /* access modifiers changed from: public */
    static {
        f22635a = new ur8();
    }

    /* access modifiers changed from: public */
    zzga(int i) {
        this.zzd = i;
    }

    public static zzga zza(int i) {
        if (i == 1) {
            return RADS;
        }
        if (i != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static d59 zzb() {
        return yr8.f35916a;
    }

    public final String toString() {
        return "<" + zzga.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
    }
}
