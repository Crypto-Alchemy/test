package com.google.android.gms.internal.mlkit_vision_common;

import java.util.List;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
final class zzo extends zzp {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzp zzc;

    public zzo(zzp zzp, int i, int i2) {
        this.zzc = zzp;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        oo8.m49376a(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzp zzf(int i, int i2) {
        oo8.m49378c(i, i2, this.zzb);
        zzp zzp = this.zzc;
        int i3 = this.zza;
        return zzp.subList(i + i3, i2 + i3);
    }
}
