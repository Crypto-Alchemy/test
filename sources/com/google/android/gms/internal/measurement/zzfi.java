package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public enum zzfi implements x49 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    

    /* renamed from: a */
    public static final a59<zzfi> f22633a = null;
    private final int zzh;

    /* access modifiers changed from: public */
    static {
        f22633a = new eq8();
    }

    /* access modifiers changed from: public */
    zzfi(int i) {
        this.zzh = i;
    }

    public static zzfi zza(int i) {
        if (i == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static d59 zzb() {
        return hq8.f29696a;
    }

    public final String toString() {
        return "<" + zzfi.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }
}
