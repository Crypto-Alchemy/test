package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* compiled from: AutoValue_BackendResponse */
public final class C3983a extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f21919a;

    /* renamed from: b */
    public final long f21920b;

    public C3983a(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f21919a = status;
            this.f21920b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo30141b() {
        return this.f21920b;
    }

    /* renamed from: c */
    public BackendResponse.Status mo30142c() {
        return this.f21919a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f21919a.equals(backendResponse.mo30142c()) || this.f21920b != backendResponse.mo30141b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f21920b;
        return ((this.f21919a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f21919a + ", nextRequestWaitMillis=" + this.f21920b + "}";
    }
}
