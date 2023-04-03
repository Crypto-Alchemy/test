package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n\u0001\u0012\u0001\u00020\u0011ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lbu0;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", "d", "(J)F", "getX$annotations", "()V", "x", "e", "getY$annotations", "y", "", "packedValue", "b", "(J)J", "a", "ui-geometry_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bu0 */
/* compiled from: CornerRadius.kt */
public final class bu0 {

    /* renamed from: a */
    public static final C1650a f8250a = new C1650a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final long f8251b = cu0.m14497b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 2, (Object) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, mo44877d2 = {"Lbu0$a;", "", "Lbu0;", "Zero", "J", "a", "()J", "getZero-kKHJgLs$annotations", "()V", "<init>", "ui-geometry_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bu0$a */
    /* compiled from: CornerRadius.kt */
    public static final class C1650a {
        public C1650a() {
        }

        public /* synthetic */ C1650a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo11816a() {
            return bu0.f8251b;
        }
    }

    /* renamed from: b */
    public static long m11574b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final boolean m11575c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m11576d(long j) {
        q42 q42 = q42.f32916a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: e */
    public static final float m11577e(long j) {
        q42 q42 = q42.f32916a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: f */
    public static int m11578f(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: g */
    public static String m11579g(long j) {
        boolean z;
        if (m11576d(j) == m11577e(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + mf2.m22276a(m11576d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + mf2.m22276a(m11576d(j), 1) + ", " + mf2.m22276a(m11577e(j), 1) + ')';
    }
}
