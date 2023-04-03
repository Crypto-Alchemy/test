package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzax extends zzas {

    /* renamed from: e */
    public final transient zzar f22657e;

    /* renamed from: g */
    public final transient zzao f22658g;

    public zzax(zzar zzar, zzao zzao) {
        this.f22657e = zzar;
        this.f22658g = zzao;
    }

    public final boolean contains(Object obj) {
        if (this.f22657e.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f22658g.listIterator(0);
    }

    public final int size() {
        return this.f22657e.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.f22658g.zza(objArr, 0);
    }

    public final fb8 zzd() {
        return this.f22658g.listIterator(0);
    }
}
