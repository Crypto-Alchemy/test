package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0001\b\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"Lf72;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "value", "d", "a", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f72 */
/* compiled from: FontLoadingStrategy.kt */
public final class f72 {

    /* renamed from: a */
    public static final C2266a f11555a = new C2266a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f11556b = m16636d(0);

    /* renamed from: c */
    public static final int f11557c = m16636d(1);

    /* renamed from: d */
    public static final int f11558d = m16636d(2);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, mo44877d2 = {"Lf72$a;", "", "Lf72;", "Blocking", "I", "b", "()I", "OptionalLocal", "c", "Async", "a", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: f72$a */
    /* compiled from: FontLoadingStrategy.kt */
    public static final class C2266a {
        public C2266a() {
        }

        public /* synthetic */ C2266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo19709a() {
            return f72.f11558d;
        }

        /* renamed from: b */
        public final int mo19710b() {
            return f72.f11556b;
        }

        /* renamed from: c */
        public final int mo19711c() {
            return f72.f11557c;
        }
    }

    /* renamed from: d */
    public static int m16636d(int i) {
        return i;
    }

    /* renamed from: e */
    public static final boolean m16637e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m16638f(int i) {
        return i;
    }

    /* renamed from: g */
    public static String m16639g(int i) {
        if (m16637e(i, f11556b)) {
            return "Blocking";
        }
        if (m16637e(i, f11557c)) {
            return "Optional";
        }
        if (m16637e(i, f11558d)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }
}
