package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzct extends zzcf {

    /* renamed from: e */
    public final transient zzce f22678e;

    /* renamed from: g */
    public final transient Object[] f22679g;

    /* renamed from: k */
    public final transient int f22680k;

    public zzct(zzce zzce, Object[] objArr, int i, int i2) {
        this.f22678e = zzce;
        this.f22679g = objArr;
        this.f22680k = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f22678e.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    public final int size() {
        return this.f22680k;
    }

    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    public final gi8 zzd() {
        return zzf().listIterator(0);
    }

    public final zzcc zzg() {
        return new zzcs(this);
    }
}
