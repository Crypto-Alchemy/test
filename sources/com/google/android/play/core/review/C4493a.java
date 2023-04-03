package com.google.android.play.core.review;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.review.a */
final class C4493a extends ReviewInfo {

    /* renamed from: a */
    public final PendingIntent f24778a;

    /* renamed from: a */
    public final PendingIntent mo34284a() {
        return this.f24778a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f24778a.equals(((ReviewInfo) obj).mo34284a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f24778a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24778a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
