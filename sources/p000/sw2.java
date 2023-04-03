package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b@\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0007\u0001\u0011\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo44877d2 = {"Lsw2;", "", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "", "a", "J", "getPackedValue$annotations", "()V", "packedValue", "f", "getWidth$annotations", "width", "e", "getHeight$annotations", "height", "b", "(J)J", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sw2 */
/* compiled from: IntSize.kt */
public final class sw2 {

    /* renamed from: b */
    public static final C3307a f17817b = new C3307a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f17818c = m27139b(0);

    /* renamed from: a */
    public final long f17819a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, mo44877d2 = {"Lsw2$a;", "", "Lsw2;", "Zero", "J", "a", "()J", "<init>", "()V", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sw2$a */
    /* compiled from: IntSize.kt */
    public static final class C3307a {
        public C3307a() {
        }

        public /* synthetic */ C3307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo25975a() {
            return sw2.f17818c;
        }
    }

    /* renamed from: b */
    public static long m27139b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m27140c(long j, Object obj) {
        return (obj instanceof sw2) && j == ((sw2) obj).mo25973i();
    }

    /* renamed from: d */
    public static final boolean m27141d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static final int m27142e(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: f */
    public static final int m27143f(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: g */
    public static int m27144g(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: h */
    public static String m27145h(long j) {
        return m27143f(j) + " x " + m27142e(j);
    }

    public boolean equals(Object obj) {
        return m27140c(this.f17819a, obj);
    }

    public int hashCode() {
        return m27144g(this.f17819a);
    }

    /* renamed from: i */
    public final /* synthetic */ long mo25973i() {
        return this.f17819a;
    }

    public String toString() {
        return m27145h(this.f17819a);
    }
}
