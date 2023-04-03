package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0014\b\u0000\u0012\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0007\u0001\r\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lal0;", "", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "f", "getComponentCount$annotations", "()V", "componentCount", "", "packedValue", "d", "(J)J", "a", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: al0 */
/* compiled from: ColorModel.kt */
public final class al0 {

    /* renamed from: a */
    public static final C0034a f181a = new C0034a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final long f182b;

    /* renamed from: c */
    public static final long f183c;

    /* renamed from: d */
    public static final long f184d;

    /* renamed from: e */
    public static final long f185e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, mo44877d2 = {"Lal0$a;", "", "Lal0;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: al0$a */
    /* compiled from: ColorModel.kt */
    public static final class C0034a {
        public C0034a() {
        }

        public /* synthetic */ C0034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo357a() {
            return al0.f184d;
        }

        /* renamed from: b */
        public final long mo358b() {
            return al0.f182b;
        }

        /* renamed from: c */
        public final long mo359c() {
            return al0.f183c;
        }
    }

    static {
        long j = (long) 3;
        long j2 = j << 32;
        f182b = m354d((((long) 0) & 4294967295L) | j2);
        f183c = m354d((((long) 1) & 4294967295L) | j2);
        f184d = m354d(j2 | (((long) 2) & 4294967295L));
        f185e = m354d((j & 4294967295L) | (((long) 4) << 32));
    }

    /* renamed from: d */
    public static long m354d(long j) {
        return j;
    }

    /* renamed from: e */
    public static final boolean m355e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m356f(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: g */
    public static int m357g(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: h */
    public static String m358h(long j) {
        if (m355e(j, f182b)) {
            return "Rgb";
        }
        if (m355e(j, f183c)) {
            return "Xyz";
        }
        if (m355e(j, f184d)) {
            return "Lab";
        }
        if (m355e(j, f185e)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
