package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u000e\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lri3;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "other", "", "d", "(ILjava/lang/Object;)Z", "a", "I", "value", "c", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ri3 */
/* compiled from: SemanticsProperties.kt */
public final class ri3 {

    /* renamed from: b */
    public static final C3194a f17249b = new C3194a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f17250c = m26206c(0);

    /* renamed from: d */
    public static final int f17251d = m26206c(1);

    /* renamed from: a */
    public final int f17252a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo44877d2 = {"Lri3$a;", "", "Lri3;", "Polite", "I", "b", "()I", "Assertive", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ri3$a */
    /* compiled from: SemanticsProperties.kt */
    public static final class C3194a {
        public C3194a() {
        }

        public /* synthetic */ C3194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo25390a() {
            return ri3.f17251d;
        }

        /* renamed from: b */
        public final int mo25391b() {
            return ri3.f17250c;
        }
    }

    /* renamed from: c */
    public static int m26206c(int i) {
        return i;
    }

    /* renamed from: d */
    public static boolean m26207d(int i, Object obj) {
        return (obj instanceof ri3) && i == ((ri3) obj).mo25387h();
    }

    /* renamed from: e */
    public static final boolean m26208e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m26209f(int i) {
        return i;
    }

    /* renamed from: g */
    public static String m26210g(int i) {
        if (m26208e(i, f17250c)) {
            return "Polite";
        }
        if (m26208e(i, f17251d)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m26207d(this.f17252a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int mo25387h() {
        return this.f17252a;
    }

    public int hashCode() {
        return m26209f(this.f17252a);
    }

    public String toString() {
        return m26210g(this.f17252a);
    }
}
