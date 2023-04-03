package com.google.android.gms.internal.mlkit_common;

import java.util.List;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzan extends zzao {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzao zzc;

    public zzan(zzao zzao, int i, int i2) {
        this.zzc = zzao;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        v58.m53231a(i, this.zzb, "index");
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

    public final zzao zzf(int i, int i2) {
        v58.m53233c(i, i2, this.zzb);
        zzao zzao = this.zzc;
        int i3 = this.zza;
        return zzao.subList(i + i3, i2 + i3);
    }
}
