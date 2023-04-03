package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzcv extends zzcc {

    /* renamed from: e */
    public final transient Object[] f22683e;

    /* renamed from: g */
    public final transient int f22684g;

    /* renamed from: k */
    public final transient int f22685k;

    public zzcv(Object[] objArr, int i, int i2) {
        this.f22683e = objArr;
        this.f22684g = i;
        this.f22685k = i2;
    }

    public final Object get(int i) {
        t88.m52124a(i, this.f22685k, "index");
        Object obj = this.f22683e[i + i + this.f22684g];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f22685k;
    }
}
