package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.C4792a;

@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class C4790a {
        /* renamed from: a */
        public abstract InstallationResponse mo36168a();

        /* renamed from: b */
        public abstract C4790a mo36169b(TokenResult tokenResult);

        /* renamed from: c */
        public abstract C4790a mo36170c(String str);

        /* renamed from: d */
        public abstract C4790a mo36171d(String str);

        /* renamed from: e */
        public abstract C4790a mo36172e(ResponseCode responseCode);

        /* renamed from: f */
        public abstract C4790a mo36173f(String str);
    }

    /* renamed from: a */
    public static C4790a m38513a() {
        return new C4792a.C4794b();
    }

    /* renamed from: b */
    public abstract TokenResult mo36163b();

    /* renamed from: c */
    public abstract String mo36164c();

    /* renamed from: d */
    public abstract String mo36165d();

    /* renamed from: e */
    public abstract ResponseCode mo36166e();

    /* renamed from: f */
    public abstract String mo36167f();
}
