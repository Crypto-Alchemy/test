package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzcb extends zzcc {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzcc, int i, int i2) {
        this.zzc = zzcc;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        t88.m52124a(i, this.zzb, "index");
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

    public final zzcc zzf(int i, int i2) {
        t88.m52126c(i, i2, this.zzb);
        zzcc zzcc = this.zzc;
        int i3 = this.zza;
        return zzcc.subList(i + i3, i2 + i3);
    }
}
