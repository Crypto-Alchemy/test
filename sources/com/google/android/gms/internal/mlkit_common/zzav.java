package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzav extends zzao {
    public final /* synthetic */ zzaw zza;

    public zzav(zzaw zzaw) {
        this.zza = zzaw;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        v58.m53231a(i, this.zza.f22656k, "index");
        zzaw zzaw = this.zza;
        int i2 = i + i;
        Object obj = zzaw.f22655g[i2];
        obj.getClass();
        Object obj2 = zzaw.f22655g[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.f22656k;
    }
}
