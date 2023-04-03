package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzay extends zzao {

    /* renamed from: e */
    public final transient Object[] f22659e;

    /* renamed from: g */
    public final transient int f22660g;

    /* renamed from: k */
    public final transient int f22661k;

    public zzay(Object[] objArr, int i, int i2) {
        this.f22659e = objArr;
        this.f22660g = i;
        this.f22661k = i2;
    }

    public final Object get(int i) {
        v58.m53231a(i, this.f22661k, "index");
        Object obj = this.f22659e[i + i + this.f22660g];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f22661k;
    }
}
