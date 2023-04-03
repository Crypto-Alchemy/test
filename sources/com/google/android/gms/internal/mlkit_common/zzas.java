package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzas extends zzak implements Set {

    /* renamed from: d */
    public transient zzao f22652d;

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
        return cb8.m32910a(this);
    }

    /* renamed from: zzd */
    public abstract fb8 iterator();

    public final zzao zzf() {
        zzao zzao = this.f22652d;
        if (zzao != null) {
            return zzao;
        }
        zzao zzg = zzg();
        this.f22652d = zzg;
        return zzg;
    }

    public zzao zzg() {
        return zzao.zzh(toArray());
    }
}
