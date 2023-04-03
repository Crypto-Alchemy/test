package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b@\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0001\u000f\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Lio6;", "", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "", "a", "J", "type", "e", "(J)J", "b", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: io6 */
/* compiled from: TextUnit.kt */
public final class io6 {

    /* renamed from: b */
    public static final C2564a f13355b = new C2564a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f13356c = m19756e(0);

    /* renamed from: d */
    public static final long f13357d = m19756e(4294967296L);

    /* renamed from: e */
    public static final long f13358e = m19756e(8589934592L);

    /* renamed from: a */
    public final long f13359a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, mo44877d2 = {"Lio6$a;", "", "Lio6;", "Unspecified", "J", "c", "()J", "Sp", "b", "Em", "a", "<init>", "()V", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: io6$a */
    /* compiled from: TextUnit.kt */
    public static final class C2564a {
        public C2564a() {
        }

        public /* synthetic */ C2564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo21604a() {
            return io6.f13358e;
        }

        /* renamed from: b */
        public final long mo21605b() {
            return io6.f13357d;
        }

        /* renamed from: c */
        public final long mo21606c() {
            return io6.f13356c;
        }
    }

    public /* synthetic */ io6(long j) {
        this.f13359a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ io6 m19755d(long j) {
        return new io6(j);
    }

    /* renamed from: e */
    public static long m19756e(long j) {
        return j;
    }

    /* renamed from: f */
    public static boolean m19757f(long j, Object obj) {
        return (obj instanceof io6) && j == ((io6) obj).mo21602j();
    }

    /* renamed from: g */
    public static final boolean m19758g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static int m19759h(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: i */
    public static String m19760i(long j) {
        if (m19758g(j, f13356c)) {
            return "Unspecified";
        }
        if (m19758g(j, f13357d)) {
            return "Sp";
        }
        if (m19758g(j, f13358e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m19757f(this.f13359a, obj);
    }

    public int hashCode() {
        return m19759h(this.f13359a);
    }

    /* renamed from: j */
    public final /* synthetic */ long mo21602j() {
        return this.f13359a;
    }

    public String toString() {
        return m19760i(this.f13359a);
    }
}
