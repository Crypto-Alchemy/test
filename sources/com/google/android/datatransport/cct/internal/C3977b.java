package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* renamed from: com.google.android.datatransport.cct.internal.b */
/* compiled from: AutoValue_ClientInfo */
public final class C3977b extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f21909a;

    /* renamed from: b */
    public final C6153kh f21910b;

    /* renamed from: com.google.android.datatransport.cct.internal.b$b */
    /* compiled from: AutoValue_ClientInfo */
    public static final class C3979b extends ClientInfo.C3968a {

        /* renamed from: a */
        public ClientInfo.ClientType f21911a;

        /* renamed from: b */
        public C6153kh f21912b;

        /* renamed from: a */
        public ClientInfo mo30117a() {
            return new C3977b(this.f21911a, this.f21912b);
        }

        /* renamed from: b */
        public ClientInfo.C3968a mo30118b(C6153kh khVar) {
            this.f21912b = khVar;
            return this;
        }

        /* renamed from: c */
        public ClientInfo.C3968a mo30119c(ClientInfo.ClientType clientType) {
            this.f21911a = clientType;
            return this;
        }
    }

    /* renamed from: b */
    public C6153kh mo30115b() {
        return this.f21910b;
    }

    /* renamed from: c */
    public ClientInfo.ClientType mo30116c() {
        return this.f21909a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f21909a;
        if (clientType != null ? clientType.equals(clientInfo.mo30116c()) : clientInfo.mo30116c() == null) {
            C6153kh khVar = this.f21910b;
            if (khVar == null) {
                if (clientInfo.mo30115b() == null) {
                    return true;
                }
            } else if (khVar.equals(clientInfo.mo30115b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        ClientInfo.ClientType clientType = this.f21909a;
        int i2 = 0;
        if (clientType == null) {
            i = 0;
        } else {
            i = clientType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C6153kh khVar = this.f21910b;
        if (khVar != null) {
            i2 = khVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f21909a + ", androidClientInfo=" + this.f21910b + "}";
    }

    public C3977b(ClientInfo.ClientType clientType, C6153kh khVar) {
        this.f21909a = clientType;
        this.f21910b = khVar;
    }
}
