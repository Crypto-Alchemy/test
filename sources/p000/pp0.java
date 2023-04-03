package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lpp0;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "isAvailable", "", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "throwable", "<init>", "(ZLjava/lang/Throwable;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pp0 */
/* compiled from: ConnectionState.kt */
public final class pp0 implements bq1 {

    /* renamed from: a */
    public final boolean f32778a;

    /* renamed from: b */
    public final Throwable f32779b;

    public pp0(boolean z, Throwable th) {
        this.f32778a = z;
        this.f32779b = th;
    }

    /* renamed from: a */
    public final boolean mo46838a() {
        return this.f32778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0 = (pp0) obj;
        return this.f32778a == pp0.f32778a && vx2.m53586b(this.f32779b, pp0.f32779b);
    }

    public int hashCode() {
        boolean z = this.f32778a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Throwable th = this.f32779b;
        return i + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        boolean z = this.f32778a;
        Throwable th = this.f32779b;
        return "ConnectionState(isAvailable=" + z + ", throwable=" + th + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp0(boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : th);
    }
}
