package p000;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: rh5 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class rh5 {

    /* renamed from: b */
    public static rh5 f33434b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f33435c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    public RootTelemetryConfiguration f33436a;

    /* renamed from: b */
    public static synchronized rh5 m51097b() {
        rh5 rh5;
        synchronized (rh5.class) {
            if (f33434b == null) {
                f33434b = new rh5();
            }
            rh5 = f33434b;
        }
        return rh5;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration mo47416a() {
        return this.f33436a;
    }

    /* renamed from: c */
    public final synchronized void mo47417c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f33436a = f33435c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f33436a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.mo30655v1() < rootTelemetryConfiguration.mo30655v1()) {
            this.f33436a = rootTelemetryConfiguration;
        }
    }
}
