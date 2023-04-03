package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class zzlc<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final zzlc f22644a;
    private boolean zza = true;

    static {
        zzlc zzlc = new zzlc();
        f22644a = zzlc;
        zzlc.zza = false;
    }

    private zzlc() {
    }

    /* renamed from: a */
    public static int m34188a(Object obj) {
        if (obj instanceof byte[]) {
            return p59.m49802g((byte[]) obj);
        }
        if (!(obj instanceof x49)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> zzlc<K, V> zza() {
        return f22644a;
    }

    /* renamed from: b */
    public final void mo30946b() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo30946b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m34188a(entry.getValue()) ^ m34188a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        mo30946b();
        p59.m49796a(k);
        p59.m49796a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo30946b();
        for (Object next : map.keySet()) {
            p59.m49796a(next);
            p59.m49796a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo30946b();
        return super.remove(obj);
    }

    public final void zzb(zzlc<K, V> zzlc) {
        mo30946b();
        if (!zzlc.isEmpty()) {
            putAll(zzlc);
        }
    }

    public final zzlc<K, V> zzc() {
        if (isEmpty()) {
            return new zzlc<>();
        }
        return new zzlc<>(this);
    }

    public final void zzd() {
        this.zza = false;
    }

    public final boolean zze() {
        return this.zza;
    }

    public zzlc(Map<K, V> map) {
        super(map);
    }
}
