package p000;

import com.google.android.gms.internal.vision.C4095b0;
import com.google.android.gms.internal.vision.zzht;

/* renamed from: d39 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class d39 {

    /* renamed from: d */
    public static final C4095b0 f28018d = C4095b0.m34203b();

    /* renamed from: a */
    public zzht f28019a;

    /* renamed from: b */
    public volatile k59 f28020b;

    /* renamed from: c */
    public volatile zzht f28021c;

    /* renamed from: a */
    public final k59 mo41817a(k59 k59) {
        k59 k592 = this.f28020b;
        this.f28019a = null;
        this.f28021c = null;
        this.f28020b = k59;
        return k592;
    }

    /* renamed from: b */
    public final int mo41818b() {
        if (this.f28021c != null) {
            return this.f28021c.zza();
        }
        if (this.f28020b != null) {
            return this.f28020b.mo31175j();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.k59 mo41819c(p000.k59 r2) {
        /*
            r1 = this;
            k59 r0 = r1.f28020b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            k59 r0 = r1.f28020b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f28020b = r2     // Catch:{ zzjk -> 0x0012 }
            com.google.android.gms.internal.vision.zzht r0 = com.google.android.gms.internal.vision.zzht.zza     // Catch:{ zzjk -> 0x0012 }
            r1.f28021c = r0     // Catch:{ zzjk -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f28020b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.vision.zzht r2 = com.google.android.gms.internal.vision.zzht.zza     // Catch:{ all -> 0x001a }
            r1.f28021c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            k59 r2 = r1.f28020b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d39.mo41819c(k59):k59");
    }

    /* renamed from: d */
    public final zzht mo41820d() {
        if (this.f28021c != null) {
            return this.f28021c;
        }
        synchronized (this) {
            if (this.f28021c != null) {
                zzht zzht = this.f28021c;
                return zzht;
            }
            if (this.f28020b == null) {
                this.f28021c = zzht.zza;
            } else {
                this.f28021c = this.f28020b.mo31222h();
            }
            zzht zzht2 = this.f28021c;
            return zzht2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d39)) {
            return false;
        }
        d39 d39 = (d39) obj;
        k59 k59 = this.f28020b;
        k59 k592 = d39.f28020b;
        if (k59 == null && k592 == null) {
            return mo41820d().equals(d39.mo41820d());
        }
        if (k59 != null && k592 != null) {
            return k59.equals(k592);
        }
        if (k59 != null) {
            return k59.equals(d39.mo41819c(k59.mo31174i()));
        }
        return mo41819c(k592.mo31174i()).equals(k592);
    }

    public int hashCode() {
        return 1;
    }
}
