package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static BackendResponse m33171a() {
        return new C3983a(Status.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m33172d(long j) {
        return new C3983a(Status.OK, j);
    }

    /* renamed from: e */
    public static BackendResponse m33173e() {
        return new C3983a(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo30141b();

    /* renamed from: c */
    public abstract Status mo30142c();
}
