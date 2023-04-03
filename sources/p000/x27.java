package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0001\u0012\u0001\u00020\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lx27;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", "other", "", "e", "(JLjava/lang/Object;)Z", "", "a", "J", "getData$annotations", "()V", "data", "d", "(J)J", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: x27 */
/* compiled from: ULong.kt */
public final class x27 implements Comparable<x27> {

    /* renamed from: d */
    public static final C6679a f35498d = new C6679a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f35499a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\b\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, mo44877d2 = {"Lx27$a;", "", "Lx27;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: x27$a */
    /* compiled from: ULong.kt */
    public static final class C6679a {
        public C6679a() {
        }

        public /* synthetic */ C6679a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ x27(long j) {
        this.f35499a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ x27 m54164a(long j) {
        return new x27(j);
    }

    /* renamed from: d */
    public static long m54165d(long j) {
        return j;
    }

    /* renamed from: e */
    public static boolean m54166e(long j, Object obj) {
        return (obj instanceof x27) && j == ((x27) obj).mo49338h();
    }

    /* renamed from: f */
    public static int m54167f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static String m54168g(long j) {
        return r47.m50943c(j);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return r47.m50941a(mo49338h(), ((x27) obj).mo49338h());
    }

    public boolean equals(Object obj) {
        return m54166e(this.f35499a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ long mo49338h() {
        return this.f35499a;
    }

    public int hashCode() {
        return m54167f(this.f35499a);
    }

    public String toString() {
        return m54168g(this.f35499a);
    }
}
