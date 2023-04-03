package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n\u0001\u0012\u0001\u00020\u0011ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lt36;", "", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "", "f", "(J)F", "getWidth$annotations", "()V", "width", "e", "getHeight$annotations", "height", "", "packedValue", "c", "(J)J", "a", "ui-geometry_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t36 */
/* compiled from: Size.kt */
public final class t36 {

    /* renamed from: a */
    public static final C3324a f17886a = new C3324a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final long f17887b = w36.m29258a(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);

    /* renamed from: c */
    public static final long f17888c = w36.m29258a(Float.NaN, Float.NaN);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, mo44877d2 = {"Lt36$a;", "", "Lt36;", "Zero", "J", "b", "()J", "getZero-NH-jbRc$annotations", "()V", "Unspecified", "a", "getUnspecified-NH-jbRc$annotations", "<init>", "ui-geometry_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t36$a */
    /* compiled from: Size.kt */
    public static final class C3324a {
        public C3324a() {
        }

        public /* synthetic */ C3324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo26030a() {
            return t36.f17888c;
        }

        /* renamed from: b */
        public final long mo26031b() {
            return t36.f17887b;
        }
    }

    /* renamed from: c */
    public static long m27269c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final boolean m27270d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static final float m27271e(long j) {
        boolean z;
        if (j != f17888c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q42 q42 = q42.f32916a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: f */
    public static final float m27272f(long j) {
        boolean z;
        if (j != f17888c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q42 q42 = q42.f32916a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: g */
    public static int m27273g(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: h */
    public static String m27274h(long j) {
        boolean z;
        if (j != f17886a.mo26030a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "Size.Unspecified";
        }
        return "Size(" + mf2.m22276a(m27272f(j), 1) + ", " + mf2.m22276a(m27271e(j), 1) + ')';
    }
}
