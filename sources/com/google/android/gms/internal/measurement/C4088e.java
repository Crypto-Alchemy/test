package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public class C4088e {

    /* renamed from: c */
    public static final t29 f22615c = t29.m52054a();

    /* renamed from: a */
    public volatile r79 f22616a;

    /* renamed from: b */
    public volatile zzjd f22617b;

    /* renamed from: a */
    public final int mo30904a() {
        if (this.f22617b != null) {
            return ((zzjb) this.f22617b).zza.length;
        }
        if (this.f22616a != null) {
            return this.f22616a.mo47346g();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzjd mo30905b() {
        if (this.f22617b != null) {
            return this.f22617b;
        }
        synchronized (this) {
            if (this.f22617b != null) {
                zzjd zzjd = this.f22617b;
                return zzjd;
            }
            if (this.f22616a == null) {
                this.f22617b = zzjd.zzb;
            } else {
                this.f22617b = this.f22616a.mo30880d();
            }
            zzjd zzjd2 = this.f22617b;
            return zzjd2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30906c(p000.r79 r2) {
        /*
            r1 = this;
            r79 r0 = r1.f22616a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            r79 r0 = r1.f22616a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f22616a = r2     // Catch:{ zzkn -> 0x0011 }
            com.google.android.gms.internal.measurement.zzjd r0 = com.google.android.gms.internal.measurement.zzjd.zzb     // Catch:{ zzkn -> 0x0011 }
            r1.f22617b = r0     // Catch:{ zzkn -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f22616a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzjd r2 = com.google.android.gms.internal.measurement.zzjd.zzb     // Catch:{ all -> 0x001b }
            r1.f22617b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4088e.mo30906c(r79):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4088e)) {
            return false;
        }
        C4088e eVar = (C4088e) obj;
        r79 r79 = this.f22616a;
        r79 r792 = eVar.f22616a;
        if (r79 == null && r792 == null) {
            return mo30905b().equals(eVar.mo30905b());
        }
        if (r79 != null && r792 != null) {
            return r79.equals(r792);
        }
        if (r79 != null) {
            eVar.mo30906c(r79.mo47631f());
            return r79.equals(eVar.f22616a);
        }
        mo30906c(r792.mo47631f());
        return this.f22616a.equals(r792);
    }

    public int hashCode() {
        return 1;
    }
}
