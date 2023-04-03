package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u000e\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lbv2;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "value", "d", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bv2 */
/* compiled from: InputModeManager.kt */
public final class bv2 {

    /* renamed from: b */
    public static final C1656a f8265b = new C1656a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f8266c = m11596d(1);

    /* renamed from: d */
    public static final int f8267d = m11596d(2);

    /* renamed from: a */
    public final int f8268a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo44877d2 = {"Lbv2$a;", "", "Lbv2;", "Touch", "I", "b", "()I", "Keyboard", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bv2$a */
    /* compiled from: InputModeManager.kt */
    public static final class C1656a {
        public C1656a() {
        }

        public /* synthetic */ C1656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo11891a() {
            return bv2.f8267d;
        }

        /* renamed from: b */
        public final int mo11892b() {
            return bv2.f8266c;
        }
    }

    public /* synthetic */ bv2(int i) {
        this.f8268a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ bv2 m11595c(int i) {
        return new bv2(i);
    }

    /* renamed from: d */
    public static int m11596d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m11597e(int i, Object obj) {
        return (obj instanceof bv2) && i == ((bv2) obj).mo11889i();
    }

    /* renamed from: f */
    public static final boolean m11598f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m11599g(int i) {
        return i;
    }

    /* renamed from: h */
    public static String m11600h(int i) {
        if (m11598f(i, f8266c)) {
            return "Touch";
        }
        if (m11598f(i, f8267d)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m11597e(this.f8268a, obj);
    }

    public int hashCode() {
        return m11599g(this.f8268a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo11889i() {
        return this.f8268a;
    }

    public String toString() {
        return m11600h(this.f8268a);
    }
}
