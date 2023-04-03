package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public abstract class zzcf extends zzbx implements Set {

    /* renamed from: d */
    public transient zzcc f22676d;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return eh8.m43974a(this);
    }

    /* renamed from: zzd */
    public abstract gi8 iterator();

    public final zzcc zzf() {
        zzcc zzcc = this.f22676d;
        if (zzcc != null) {
            return zzcc;
        }
        zzcc zzg = zzg();
        this.f22676d = zzg;
        return zzg;
    }

    public zzcc zzg() {
        return zzcc.zzg(toArray());
    }
}
