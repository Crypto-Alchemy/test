package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class zzhz<T> implements Serializable {
    public static <T> zzhz<T> zzc() {
        return zzhx.zza;
    }

    public static <T> zzhz<T> zzd(T t) {
        return new zzia(t);
    }

    public abstract boolean zza();

    public abstract T zzb();
}
