package p000;

import com.google.android.gms.internal.clearcut.zzbb;

/* renamed from: xg8 */
public class xg8 {

    /* renamed from: d */
    public static final fd8 f35629d = fd8.m44259b();

    /* renamed from: a */
    public zzbb f35630a;

    /* renamed from: b */
    public volatile tj8 f35631b;

    /* renamed from: c */
    public volatile zzbb f35632c;

    /* renamed from: a */
    public final int mo49479a() {
        if (this.f35632c != null) {
            return this.f35632c.size();
        }
        if (this.f35631b != null) {
            return this.f35631b.mo30774o();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.tj8 mo49480b(p000.tj8 r2) {
        /*
            r1 = this;
            tj8 r0 = r1.f35631b
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            tj8 r0 = r1.f35631b     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f35631b = r2     // Catch:{ zzco -> 0x0012 }
            com.google.android.gms.internal.clearcut.zzbb r0 = com.google.android.gms.internal.clearcut.zzbb.zzfi     // Catch:{ zzco -> 0x0012 }
            r1.f35632c = r0     // Catch:{ zzco -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f35631b = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.clearcut.zzbb r2 = com.google.android.gms.internal.clearcut.zzbb.zzfi     // Catch:{ all -> 0x0019 }
            r1.f35632c = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            tj8 r2 = r1.f35631b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xg8.mo49480b(tj8):tj8");
    }

    /* renamed from: c */
    public final tj8 mo49481c(tj8 tj8) {
        tj8 tj82 = this.f35631b;
        this.f35630a = null;
        this.f35632c = null;
        this.f35631b = tj8;
        return tj82;
    }

    /* renamed from: d */
    public final zzbb mo49482d() {
        if (this.f35632c != null) {
            return this.f35632c;
        }
        synchronized (this) {
            if (this.f35632c != null) {
                zzbb zzbb = this.f35632c;
                return zzbb;
            }
            this.f35632c = this.f35631b == null ? zzbb.zzfi : this.f35631b.mo30756i();
            zzbb zzbb2 = this.f35632c;
            return zzbb2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg8)) {
            return false;
        }
        xg8 xg8 = (xg8) obj;
        tj8 tj8 = this.f35631b;
        tj8 tj82 = xg8.f35631b;
        return (tj8 == null && tj82 == null) ? mo49482d().equals(xg8.mo49482d()) : (tj8 == null || tj82 == null) ? tj8 != null ? tj8.equals(xg8.mo49480b(tj8.mo30766a())) : mo49480b(tj82.mo30766a()).equals(tj82) : tj8.equals(tj82);
    }

    public int hashCode() {
        return 1;
    }
}
