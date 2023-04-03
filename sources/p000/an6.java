package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u000e\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lan6;", "", "", "e", "(I)Ljava/lang/String;", "", "d", "(I)I", "other", "", "b", "(ILjava/lang/Object;)Z", "a", "I", "value", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: an6 */
/* compiled from: TextAlign.kt */
public final class an6 {

    /* renamed from: b */
    public static final C0039a f194b = new C0039a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f195c = m410a(1);

    /* renamed from: d */
    public static final int f196d = m410a(2);

    /* renamed from: e */
    public static final int f197e = m410a(3);

    /* renamed from: f */
    public static final int f198f = m410a(4);

    /* renamed from: g */
    public static final int f199g = m410a(5);

    /* renamed from: h */
    public static final int f200h = m410a(6);

    /* renamed from: a */
    public final int f201a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lan6$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: an6$a */
    /* compiled from: TextAlign.kt */
    public static final class C0039a {
        public C0039a() {
        }

        public /* synthetic */ C0039a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static int m410a(int i) {
        return i;
    }

    /* renamed from: b */
    public static boolean m411b(int i, Object obj) {
        return (obj instanceof an6) && i == ((an6) obj).mo428f();
    }

    /* renamed from: c */
    public static final boolean m412c(int i, int i2) {
        return i == i2;
    }

    /* renamed from: d */
    public static int m413d(int i) {
        return i;
    }

    /* renamed from: e */
    public static String m414e(int i) {
        if (m412c(i, f195c)) {
            return "Left";
        }
        if (m412c(i, f196d)) {
            return "Right";
        }
        if (m412c(i, f197e)) {
            return "Center";
        }
        if (m412c(i, f198f)) {
            return "Justify";
        }
        if (m412c(i, f199g)) {
            return "Start";
        }
        if (m412c(i, f200h)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m411b(this.f201a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int mo428f() {
        return this.f201a;
    }

    public int hashCode() {
        return m413d(this.f201a);
    }

    public String toString() {
        return m414e(this.f201a);
    }
}
