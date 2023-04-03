package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0001\b\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"Lyr4;", "", "", "i", "(I)Ljava/lang/String;", "", "h", "(I)I", "value", "f", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yr4 */
/* compiled from: PointerEvent.kt */
public final class yr4 {

    /* renamed from: a */
    public static final C3689a f20321a = new C3689a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f20322b = m30763f(0);

    /* renamed from: c */
    public static final int f20323c = m30763f(1);

    /* renamed from: d */
    public static final int f20324d = m30763f(2);

    /* renamed from: e */
    public static final int f20325e = m30763f(3);

    /* renamed from: f */
    public static final int f20326f = m30763f(4);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, mo44877d2 = {"Lyr4$a;", "", "Lyr4;", "Unknown", "I", "e", "()I", "Touch", "d", "Mouse", "b", "Stylus", "c", "Eraser", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: yr4$a */
    /* compiled from: PointerEvent.kt */
    public static final class C3689a {
        public C3689a() {
        }

        public /* synthetic */ C3689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo28196a() {
            return yr4.f20326f;
        }

        /* renamed from: b */
        public final int mo28197b() {
            return yr4.f20324d;
        }

        /* renamed from: c */
        public final int mo28198c() {
            return yr4.f20325e;
        }

        /* renamed from: d */
        public final int mo28199d() {
            return yr4.f20323c;
        }

        /* renamed from: e */
        public final int mo28200e() {
            return yr4.f20322b;
        }
    }

    /* renamed from: f */
    public static int m30763f(int i) {
        return i;
    }

    /* renamed from: g */
    public static final boolean m30764g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m30765h(int i) {
        return i;
    }

    /* renamed from: i */
    public static String m30766i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
