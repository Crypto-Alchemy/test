package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: c */
    public Object mo30698c(String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo30700e(String str) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo30696a().values()) {
            if (mo30699d(next)) {
                if (!fastJsonResponse.mo30699d(next) || !if4.m45709a(mo30697b(next), fastJsonResponse.mo30697b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo30699d(next)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo30696a().values()) {
            if (mo30699d(next)) {
                i = (i * 31) + cu4.m43221k(mo30697b(next)).hashCode();
            }
        }
        return i;
    }
}
