package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b@\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0001\u0010\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Ln72;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "other", "", "d", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "value", "c", "b", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n72 */
/* compiled from: FontStyle.kt */
public final class n72 {

    /* renamed from: b */
    public static final C2869a f15367b = new C2869a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f15368c = m22831c(0);

    /* renamed from: d */
    public static final int f15369d = m22831c(1);

    /* renamed from: a */
    public final int f15370a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo44877d2 = {"Ln72$a;", "", "Ln72;", "Normal", "I", "b", "()I", "Italic", "a", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: n72$a */
    /* compiled from: FontStyle.kt */
    public static final class C2869a {
        public C2869a() {
        }

        public /* synthetic */ C2869a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo23532a() {
            return n72.f15369d;
        }

        /* renamed from: b */
        public final int mo23533b() {
            return n72.f15368c;
        }
    }

    /* renamed from: c */
    public static int m22831c(int i) {
        return i;
    }

    /* renamed from: d */
    public static boolean m22832d(int i, Object obj) {
        return (obj instanceof n72) && i == ((n72) obj).mo23529h();
    }

    /* renamed from: e */
    public static final boolean m22833e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m22834f(int i) {
        return i;
    }

    /* renamed from: g */
    public static String m22835g(int i) {
        if (m22833e(i, f15368c)) {
            return "Normal";
        }
        if (m22833e(i, f15369d)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m22832d(this.f15370a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int mo23529h() {
        return this.f15370a;
    }

    public int hashCode() {
        return m22834f(this.f15370a);
    }

    public String toString() {
        return m22835g(this.f15370a);
    }
}
