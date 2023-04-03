package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzcr extends zzcc {
    public static final zzcc zza = new zzcr(new Object[0], 0);

    /* renamed from: e */
    public final transient int f22677e;
    public final transient Object[] zzb;

    public zzcr(Object[] objArr, int i) {
        this.zzb = objArr;
        this.f22677e = i;
    }

    public final Object get(int i) {
        t88.m52124a(i, this.f22677e, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f22677e;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.f22677e);
        return i + this.f22677e;
    }

    public final int zzb() {
        return this.f22677e;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
