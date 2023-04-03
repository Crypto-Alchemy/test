package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.C4795b;

@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class C4791a {
        /* renamed from: a */
        public abstract TokenResult mo36177a();

        /* renamed from: b */
        public abstract C4791a mo36178b(ResponseCode responseCode);

        /* renamed from: c */
        public abstract C4791a mo36179c(String str);

        /* renamed from: d */
        public abstract C4791a mo36180d(long j);
    }

    /* renamed from: a */
    public static C4791a m38525a() {
        return new C4795b.C4797b().mo36180d(0);
    }

    /* renamed from: b */
    public abstract ResponseCode mo36174b();

    /* renamed from: c */
    public abstract String mo36175c();

    /* renamed from: d */
    public abstract long mo36176d();
}
