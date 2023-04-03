package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
/* compiled from: AutoValue_TokenResult */
public final class C4795b extends TokenResult {

    /* renamed from: a */
    public final String f25378a;

    /* renamed from: b */
    public final long f25379b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f25380c;

    /* renamed from: com.google.firebase.installations.remote.b$b */
    /* compiled from: AutoValue_TokenResult */
    public static final class C4797b extends TokenResult.C4791a {

        /* renamed from: a */
        public String f25381a;

        /* renamed from: b */
        public Long f25382b;

        /* renamed from: c */
        public TokenResult.ResponseCode f25383c;

        /* renamed from: a */
        public TokenResult mo36177a() {
            String str = "";
            if (this.f25382b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C4795b(this.f25381a, this.f25382b.longValue(), this.f25383c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TokenResult.C4791a mo36178b(TokenResult.ResponseCode responseCode) {
            this.f25383c = responseCode;
            return this;
        }

        /* renamed from: c */
        public TokenResult.C4791a mo36179c(String str) {
            this.f25381a = str;
            return this;
        }

        /* renamed from: d */
        public TokenResult.C4791a mo36180d(long j) {
            this.f25382b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public TokenResult.ResponseCode mo36174b() {
        return this.f25380c;
    }

    /* renamed from: c */
    public String mo36175c() {
        return this.f25378a;
    }

    /* renamed from: d */
    public long mo36176d() {
        return this.f25379b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f25378a;
        if (str != null ? str.equals(tokenResult.mo36175c()) : tokenResult.mo36175c() == null) {
            if (this.f25379b == tokenResult.mo36176d()) {
                TokenResult.ResponseCode responseCode = this.f25380c;
                if (responseCode == null) {
                    if (tokenResult.mo36174b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo36174b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f25378a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f25379b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f25380c;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f25378a + ", tokenExpirationTimestamp=" + this.f25379b + ", responseCode=" + this.f25380c + "}";
    }

    public C4795b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f25378a = str;
        this.f25379b = j;
        this.f25380c = responseCode;
    }
}
