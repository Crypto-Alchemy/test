package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public abstract class zzce implements Map, Serializable {

    /* renamed from: a */
    public transient zzcf f22673a;

    /* renamed from: d */
    public transient zzcf f22674d;

    /* renamed from: e */
    public transient zzbx f22675e;

    public static zzce zzc(Object obj, Object obj2) {
        cc8.m32947b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzcw.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (ff8) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return eh8.m43974a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcf zzcf = this.f22674d;
        if (zzcf != null) {
            return zzcf;
        }
        zzcf zze = zze();
        this.f22674d = zze;
        return zze;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        cc8.m32946a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzbx zza();

    /* renamed from: zzb */
    public final zzbx values() {
        zzbx zzbx = this.f22675e;
        if (zzbx != null) {
            return zzbx;
        }
        zzbx zza = zza();
        this.f22675e = zza;
        return zza;
    }

    public abstract zzcf zzd();

    public abstract zzcf zze();

    /* renamed from: zzf */
    public final zzcf entrySet() {
        zzcf zzcf = this.f22673a;
        if (zzcf != null) {
            return zzcf;
        }
        zzcf zzd = zzd();
        this.f22673a = zzd;
        return zzd;
    }
}
