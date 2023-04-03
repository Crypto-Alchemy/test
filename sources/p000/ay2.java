package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lay2;", "Lar1;", "<init>", "()V", "a", "Lay2$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ay2 */
/* compiled from: PeerError.kt */
public abstract class ay2 implements ar1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lay2$a;", "Lay2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "method", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ay2$a */
    /* compiled from: PeerError.kt */
    public static final class C3868a extends ay2 {

        /* renamed from: a */
        public final String f21067a;

        /* renamed from: b */
        public final String f21068b;

        /* renamed from: c */
        public final int f21069c = 10001;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3868a(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "method");
            this.f21067a = str;
            this.f21068b = "Unsupported Method Requested: " + str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3868a) && vx2.m53586b(this.f21067a, ((C3868a) obj).f21067a);
        }

        public int getCode() {
            return this.f21069c;
        }

        public String getMessage() {
            return this.f21068b;
        }

        public int hashCode() {
            return this.f21067a.hashCode();
        }

        public String toString() {
            String str = this.f21067a;
            return "MethodUnsupported(method=" + str + ")";
        }
    }

    public ay2() {
    }

    public /* synthetic */ ay2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
