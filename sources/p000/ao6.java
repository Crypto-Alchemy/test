package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b@\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0001\u000f\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo44877d2 = {"Lao6;", "", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "", "a", "J", "packedValue", "j", "start", "g", "end", "i", "min", "h", "max", "f", "(J)Z", "collapsed", "c", "(J)J", "b", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ao6 */
/* compiled from: TextRange.kt */
public final class ao6 {

    /* renamed from: b */
    public static final C1564a f7681b = new C1564a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f7682c = bo6.m11527a(0);

    /* renamed from: a */
    public final long f7683a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, mo44877d2 = {"Lao6$a;", "", "Lao6;", "Zero", "J", "a", "()J", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ao6$a */
    /* compiled from: TextRange.kt */
    public static final class C1564a {
        public C1564a() {
        }

        public /* synthetic */ C1564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo11073a() {
            return ao6.f7682c;
        }
    }

    public /* synthetic */ ao6(long j) {
        this.f7683a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ ao6 m10675b(long j) {
        return new ao6(j);
    }

    /* renamed from: c */
    public static long m10676c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m10677d(long j, Object obj) {
        return (obj instanceof ao6) && j == ((ao6) obj).mo11071m();
    }

    /* renamed from: e */
    public static final boolean m10678e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final boolean m10679f(long j) {
        if (m10683j(j) == m10680g(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final int m10680g(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: h */
    public static final int m10681h(long j) {
        if (m10683j(j) > m10680g(j)) {
            return m10683j(j);
        }
        return m10680g(j);
    }

    /* renamed from: i */
    public static final int m10682i(long j) {
        if (m10683j(j) > m10680g(j)) {
            return m10680g(j);
        }
        return m10683j(j);
    }

    /* renamed from: j */
    public static final int m10683j(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: k */
    public static int m10684k(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: l */
    public static String m10685l(long j) {
        return "TextRange(" + m10683j(j) + ", " + m10680g(j) + ')';
    }

    public boolean equals(Object obj) {
        return m10677d(this.f7683a, obj);
    }

    public int hashCode() {
        return m10684k(this.f7683a);
    }

    /* renamed from: m */
    public final /* synthetic */ long mo11071m() {
        return this.f7683a;
    }

    public String toString() {
        return m10685l(this.f7683a);
    }
}
