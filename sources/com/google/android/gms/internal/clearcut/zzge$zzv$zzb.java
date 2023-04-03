package com.google.android.gms.internal.clearcut;

public enum zzge$zzv$zzb implements yf8 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: k */
    public static final bg8<zzge$zzv$zzb> f22597k = null;
    private final int value;

    /* access modifiers changed from: public */
    static {
        f22597k = new du8();
    }

    /* access modifiers changed from: public */
    zzge$zzv$zzb(int i) {
        this.value = i;
    }

    public static zzge$zzv$zzb zzbc(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public static bg8<zzge$zzv$zzb> zzd() {
        return f22597k;
    }

    public final int zzc() {
        return this.value;
    }
}
