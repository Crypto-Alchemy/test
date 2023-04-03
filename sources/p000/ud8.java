package p000;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ud8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ud8 extends if8 {

    /* renamed from: a */
    public final AtomicReference<Bundle> f34581a = new AtomicReference<>();

    /* renamed from: b */
    public boolean f34582b;

    /* renamed from: s1 */
    public static final <T> T m52790s1(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()});
            throw e;
        }
    }

    /* renamed from: X0 */
    public final void mo43180X0(Bundle bundle) {
        synchronized (this.f34581a) {
            try {
                this.f34581a.set(bundle);
                this.f34582b = true;
                this.f34581a.notify();
            } catch (Throwable th) {
                this.f34581a.notify();
                throw th;
            }
        }
    }

    /* renamed from: q1 */
    public final String mo48387q1(long j) {
        return (String) m52790s1(mo48388r1(j), String.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo48388r1(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f34581a
            monitor-enter(r0)
            boolean r1 = r2.f34582b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f34581a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f34581a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ud8.mo48388r1(long):android.os.Bundle");
    }
}
