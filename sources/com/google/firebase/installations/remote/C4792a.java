package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
/* compiled from: AutoValue_InstallationResponse */
public final class C4792a extends InstallationResponse {

    /* renamed from: a */
    public final String f25368a;

    /* renamed from: b */
    public final String f25369b;

    /* renamed from: c */
    public final String f25370c;

    /* renamed from: d */
    public final TokenResult f25371d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f25372e;

    /* renamed from: com.google.firebase.installations.remote.a$b */
    /* compiled from: AutoValue_InstallationResponse */
    public static final class C4794b extends InstallationResponse.C4790a {

        /* renamed from: a */
        public String f25373a;

        /* renamed from: b */
        public String f25374b;

        /* renamed from: c */
        public String f25375c;

        /* renamed from: d */
        public TokenResult f25376d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f25377e;

        /* renamed from: a */
        public InstallationResponse mo36168a() {
            return new C4792a(this.f25373a, this.f25374b, this.f25375c, this.f25376d, this.f25377e);
        }

        /* renamed from: b */
        public InstallationResponse.C4790a mo36169b(TokenResult tokenResult) {
            this.f25376d = tokenResult;
            return this;
        }

        /* renamed from: c */
        public InstallationResponse.C4790a mo36170c(String str) {
            this.f25374b = str;
            return this;
        }

        /* renamed from: d */
        public InstallationResponse.C4790a mo36171d(String str) {
            this.f25375c = str;
            return this;
        }

        /* renamed from: e */
        public InstallationResponse.C4790a mo36172e(InstallationResponse.ResponseCode responseCode) {
            this.f25377e = responseCode;
            return this;
        }

        /* renamed from: f */
        public InstallationResponse.C4790a mo36173f(String str) {
            this.f25373a = str;
            return this;
        }
    }

    /* renamed from: b */
    public TokenResult mo36163b() {
        return this.f25371d;
    }

    /* renamed from: c */
    public String mo36164c() {
        return this.f25369b;
    }

    /* renamed from: d */
    public String mo36165d() {
        return this.f25370c;
    }

    /* renamed from: e */
    public InstallationResponse.ResponseCode mo36166e() {
        return this.f25372e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f25368a;
        if (str != null ? str.equals(installationResponse.mo36167f()) : installationResponse.mo36167f() == null) {
            String str2 = this.f25369b;
            if (str2 != null ? str2.equals(installationResponse.mo36164c()) : installationResponse.mo36164c() == null) {
                String str3 = this.f25370c;
                if (str3 != null ? str3.equals(installationResponse.mo36165d()) : installationResponse.mo36165d() == null) {
                    TokenResult tokenResult = this.f25371d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo36163b()) : installationResponse.mo36163b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f25372e;
                        if (responseCode == null) {
                            if (installationResponse.mo36166e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo36166e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo36167f() {
        return this.f25368a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f25368a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f25369b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f25370c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        TokenResult tokenResult = this.f25371d;
        if (tokenResult == null) {
            i4 = 0;
        } else {
            i4 = tokenResult.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f25372e;
        if (responseCode != null) {
            i5 = responseCode.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f25368a + ", fid=" + this.f25369b + ", refreshToken=" + this.f25370c + ", authToken=" + this.f25371d + ", responseCode=" + this.f25372e + "}";
    }

    public C4792a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f25368a = str;
        this.f25369b = str2;
        this.f25370c = str3;
        this.f25371d = tokenResult;
        this.f25372e = responseCode;
    }
}
