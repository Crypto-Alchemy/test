package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* renamed from: com.google.android.datatransport.cct.internal.c */
/* compiled from: AutoValue_NetworkConnectionInfo */
public final class C3980c extends NetworkConnectionInfo {

    /* renamed from: a */
    public final NetworkConnectionInfo.NetworkType f21913a;

    /* renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f21914b;

    /* renamed from: com.google.android.datatransport.cct.internal.c$b */
    /* compiled from: AutoValue_NetworkConnectionInfo */
    public static final class C3982b extends NetworkConnectionInfo.C3969a {

        /* renamed from: a */
        public NetworkConnectionInfo.NetworkType f21915a;

        /* renamed from: b */
        public NetworkConnectionInfo.MobileSubtype f21916b;

        /* renamed from: a */
        public NetworkConnectionInfo mo30124a() {
            return new C3980c(this.f21915a, this.f21916b);
        }

        /* renamed from: b */
        public NetworkConnectionInfo.C3969a mo30125b(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f21916b = mobileSubtype;
            return this;
        }

        /* renamed from: c */
        public NetworkConnectionInfo.C3969a mo30126c(NetworkConnectionInfo.NetworkType networkType) {
            this.f21915a = networkType;
            return this;
        }
    }

    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo30120b() {
        return this.f21914b;
    }

    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo30121c() {
        return this.f21913a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f21913a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo30121c()) : networkConnectionInfo.mo30121c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f21914b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo30120b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo30120b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        NetworkConnectionInfo.NetworkType networkType = this.f21913a;
        int i2 = 0;
        if (networkType == null) {
            i = 0;
        } else {
            i = networkType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f21914b;
        if (mobileSubtype != null) {
            i2 = mobileSubtype.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21913a + ", mobileSubtype=" + this.f21914b + "}";
    }

    public C3980c(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f21913a = networkType;
        this.f21914b = mobileSubtype;
    }
}
