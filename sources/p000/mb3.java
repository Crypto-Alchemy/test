package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0001\b\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"Lmb3;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", "value", "e", "a", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mb3 */
/* compiled from: KeyboardCapitalization.kt */
public final class mb3 {

    /* renamed from: a */
    public static final C2821a f14923a = new C2821a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f14924b = m22143e(0);

    /* renamed from: c */
    public static final int f14925c = m22143e(1);

    /* renamed from: d */
    public static final int f14926d = m22143e(2);

    /* renamed from: e */
    public static final int f14927e = m22143e(3);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, mo44877d2 = {"Lmb3$a;", "", "Lmb3;", "None", "I", "b", "()I", "Characters", "a", "Words", "d", "Sentences", "c", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mb3$a */
    /* compiled from: KeyboardCapitalization.kt */
    public static final class C2821a {
        public C2821a() {
        }

        public /* synthetic */ C2821a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo23119a() {
            return mb3.f14925c;
        }

        /* renamed from: b */
        public final int mo23120b() {
            return mb3.f14924b;
        }

        /* renamed from: c */
        public final int mo23121c() {
            return mb3.f14927e;
        }

        /* renamed from: d */
        public final int mo23122d() {
            return mb3.f14926d;
        }
    }

    /* renamed from: e */
    public static int m22143e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m22144f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m22145g(int i) {
        return i;
    }

    /* renamed from: h */
    public static String m22146h(int i) {
        if (m22144f(i, f14924b)) {
            return "None";
        }
        if (m22144f(i, f14925c)) {
            return "Characters";
        }
        if (m22144f(i, f14926d)) {
            return "Words";
        }
        if (m22144f(i, f14927e)) {
            return "Sentences";
        }
        return "Invalid";
    }
}
