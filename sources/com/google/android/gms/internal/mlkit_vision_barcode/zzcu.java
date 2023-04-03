package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
final class zzcu extends zzcf {

    /* renamed from: e */
    public final transient zzce f22681e;

    /* renamed from: g */
    public final transient zzcc f22682g;

    public zzcu(zzce zzce, zzcc zzcc) {
        this.f22681e = zzce;
        this.f22682g = zzcc;
    }

    public final boolean contains(Object obj) {
        if (this.f22681e.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f22682g.listIterator(0);
    }

    public final int size() {
        return this.f22681e.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.f22682g.zza(objArr, i);
    }

    public final gi8 zzd() {
        return this.f22682g.listIterator(0);
    }
}
