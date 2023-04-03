package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzcs extends zzcc {
    public final /* synthetic */ zzct zza;

    public zzcs(zzct zzct) {
        this.zza = zzct;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        t88.m52124a(i, this.zza.f22680k, "index");
        zzct zzct = this.zza;
        int i2 = i + i;
        Object obj = zzct.f22679g[i2];
        obj.getClass();
        Object obj2 = zzct.f22679g[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.f22680k;
    }
}
