package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzar implements Map, Serializable {

    /* renamed from: a */
    public transient zzas f22649a;

    /* renamed from: d */
    public transient zzas f22650d;

    /* renamed from: e */
    public transient zzak f22651e;

    public static zzar zzc(Object obj, Object obj2) {
        t68.m52122a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzaz.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (s88) null);
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
        return cb8.m32910a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzas zzas = this.f22650d;
        if (zzas != null) {
            return zzas;
        }
        zzas zze = zze();
        this.f22650d = zze;
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
        if (size >= 0) {
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
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }

    public abstract zzak zza();

    /* renamed from: zzb */
    public final zzak values() {
        zzak zzak = this.f22651e;
        if (zzak != null) {
            return zzak;
        }
        zzak zza = zza();
        this.f22651e = zza;
        return zza;
    }

    public abstract zzas zzd();

    public abstract zzas zze();

    /* renamed from: zzf */
    public final zzas entrySet() {
        zzas zzas = this.f22649a;
        if (zzas != null) {
            return zzas;
        }
        zzas zzd = zzd();
        this.f22649a = zzd;
        return zzd;
    }
}
