package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.C3977b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        /* access modifiers changed from: public */
        ClientType(int i) {
            this.value = i;
        }
    }

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.ClientInfo$a */
    public static abstract class C3968a {
        /* renamed from: a */
        public abstract ClientInfo mo30117a();

        /* renamed from: b */
        public abstract C3968a mo30118b(C6153kh khVar);

        /* renamed from: c */
        public abstract C3968a mo30119c(ClientType clientType);
    }

    /* renamed from: a */
    public static C3968a m33136a() {
        return new C3977b.C3979b();
    }

    /* renamed from: b */
    public abstract C6153kh mo30115b();

    /* renamed from: c */
    public abstract ClientType mo30116c();
}
