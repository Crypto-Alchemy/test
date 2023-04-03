package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzaw extends zzas {

    /* renamed from: e */
    public final transient zzar f22654e;

    /* renamed from: g */
    public final transient Object[] f22655g;

    /* renamed from: k */
    public final transient int f22656k;

    public zzaw(zzar zzar, Object[] objArr, int i, int i2) {
        this.f22654e = zzar;
        this.f22655g = objArr;
        this.f22656k = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f22654e.get(key))) {
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
        return this.f22656k;
    }

    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    public final fb8 zzd() {
        return zzf().listIterator(0);
    }

    public final zzao zzg() {
        return new zzav(this);
    }
}
