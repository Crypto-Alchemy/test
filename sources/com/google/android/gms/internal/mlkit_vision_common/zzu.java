package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
final class zzu extends zzp {
    public static final zzp zza = new zzu(new Object[0], 0);

    /* renamed from: e */
    public final transient int f22850e;
    public final transient Object[] zzb;

    public zzu(Object[] objArr, int i) {
        this.zzb = objArr;
        this.f22850e = i;
    }

    public final Object get(int i) {
        oo8.m49376a(i, this.f22850e, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f22850e;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.f22850e);
        return this.f22850e;
    }

    public final int zzb() {
        return this.f22850e;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
