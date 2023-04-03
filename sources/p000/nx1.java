package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lnx1;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "seconds", "<init>", "(J)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nx1 */
/* compiled from: Expiry.kt */
public final class nx1 {

    /* renamed from: a */
    public final long f32210a;

    public nx1(long j) {
        this.f32210a = j;
    }

    /* renamed from: a */
    public final long mo46241a() {
        return this.f32210a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx1) && this.f32210a == ((nx1) obj).f32210a;
    }

    public int hashCode() {
        return au0.m10781a(this.f32210a);
    }

    public String toString() {
        long j = this.f32210a;
        return "Expiry(seconds=" + j + ")";
    }
}
