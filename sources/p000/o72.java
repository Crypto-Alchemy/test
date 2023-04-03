package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b@\u0018\u0000 \u00142\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0001\u000e\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lo72;", "", "", "h", "(I)Ljava/lang/String;", "", "e", "(I)I", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "value", "g", "(I)Z", "isWeightOn", "f", "isStyleOn", "b", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: o72 */
/* compiled from: FontSynthesis.kt */
public final class o72 {

    /* renamed from: b */
    public static final C2943a f15827b = new C2943a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f15828c = m23694b(0);

    /* renamed from: d */
    public static final int f15829d = m23694b(1);

    /* renamed from: e */
    public static final int f15830e = m23694b(2);

    /* renamed from: f */
    public static final int f15831f = m23694b(3);

    /* renamed from: a */
    public final int f15832a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, mo44877d2 = {"Lo72$a;", "", "Lo72;", "All", "I", "a", "()I", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: o72$a */
    /* compiled from: FontSynthesis.kt */
    public static final class C2943a {
        public C2943a() {
        }

        public /* synthetic */ C2943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo23913a() {
            return o72.f15829d;
        }
    }

    /* renamed from: b */
    public static int m23694b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m23695c(int i, Object obj) {
        return (obj instanceof o72) && i == ((o72) obj).mo23911i();
    }

    /* renamed from: d */
    public static final boolean m23696d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m23697e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m23698f(int i) {
        if (m23696d(i, f15829d) || m23696d(i, f15831f)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m23699g(int i) {
        if (m23696d(i, f15829d) || m23696d(i, f15830e)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static String m23700h(int i) {
        if (m23696d(i, f15828c)) {
            return "None";
        }
        if (m23696d(i, f15829d)) {
            return "All";
        }
        if (m23696d(i, f15830e)) {
            return "Weight";
        }
        if (m23696d(i, f15831f)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m23695c(this.f15832a, obj);
    }

    public int hashCode() {
        return m23697e(this.f15832a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo23911i() {
        return this.f15832a;
    }

    public String toString() {
        return m23700h(this.f15832a);
    }
}
