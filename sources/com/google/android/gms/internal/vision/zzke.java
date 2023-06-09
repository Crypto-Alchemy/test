package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzke<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final zzke f23046a;
    private boolean zza = true;

    static {
        zzke zzke = new zzke();
        f23046a = zzke;
        zzke.zza = false;
    }

    private zzke() {
    }

    /* renamed from: a */
    public static int m34481a(Object obj) {
        if (obj instanceof byte[]) {
            return t19.m52053j((byte[]) obj);
        }
        if (!(obj instanceof q19)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> zzke<K, V> zza() {
        return f23046a;
    }

    /* renamed from: b */
    public final void mo31310b() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo31310b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzke.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m34481a(entry.getValue()) ^ m34481a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        mo31310b();
        t19.m52047d(k);
        t19.m52047d(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo31310b();
        for (Object next : map.keySet()) {
            t19.m52047d(next);
            t19.m52047d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo31310b();
        return super.remove(obj);
    }

    public final zzke<K, V> zzb() {
        if (isEmpty()) {
            return new zzke<>();
        }
        return new zzke<>(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    public final void zza(zzke<K, V> zzke) {
        mo31310b();
        if (!zzke.isEmpty()) {
            putAll(zzke);
        }
    }

    public zzke(Map<K, V> map) {
        super(map);
    }
}
