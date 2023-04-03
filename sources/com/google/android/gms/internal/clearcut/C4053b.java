package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.b */
public final class C4053b {

    /* renamed from: a */
    public final zzbn f22444a;

    /* renamed from: b */
    public final byte[] f22445b;

    public C4053b(int i) {
        byte[] bArr = new byte[i];
        this.f22445b = bArr;
        this.f22444a = zzbn.m33966S(bArr);
    }

    public /* synthetic */ C4053b(int i, lb8 lb8) {
        this(i);
    }

    /* renamed from: a */
    public final zzbb mo30757a() {
        if (this.f22444a.mo30849u() == 0) {
            return new zzbi(this.f22445b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzbn mo30758b() {
        return this.f22444a;
    }
}
