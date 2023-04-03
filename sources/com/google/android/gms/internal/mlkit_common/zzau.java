package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzau extends zzao {
    public static final zzao zza = new zzau(new Object[0], 0);

    /* renamed from: e */
    public final transient int f22653e;
    public final transient Object[] zzb;

    public zzau(Object[] objArr, int i) {
        this.zzb = objArr;
        this.f22653e = i;
    }

    public final Object get(int i) {
        v58.m53231a(i, this.f22653e, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f22653e;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.f22653e);
        return this.f22653e;
    }

    public final int zzb() {
        return this.f22653e;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
