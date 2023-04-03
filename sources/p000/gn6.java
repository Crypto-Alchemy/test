package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u000e\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lgn6;", "", "", "e", "(I)Ljava/lang/String;", "", "d", "(I)I", "other", "", "b", "(ILjava/lang/Object;)Z", "a", "I", "value", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gn6 */
/* compiled from: TextDirection.kt */
public final class gn6 {

    /* renamed from: b */
    public static final C2409a f12497b = new C2409a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f12498c = m18259a(1);

    /* renamed from: d */
    public static final int f12499d = m18259a(2);

    /* renamed from: e */
    public static final int f12500e = m18259a(3);

    /* renamed from: f */
    public static final int f12501f = m18259a(4);

    /* renamed from: g */
    public static final int f12502g = m18259a(5);

    /* renamed from: a */
    public final int f12503a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lgn6$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gn6$a */
    /* compiled from: TextDirection.kt */
    public static final class C2409a {
        public C2409a() {
        }

        public /* synthetic */ C2409a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static int m18259a(int i) {
        return i;
    }

    /* renamed from: b */
    public static boolean m18260b(int i, Object obj) {
        return (obj instanceof gn6) && i == ((gn6) obj).mo20707f();
    }

    /* renamed from: c */
    public static final boolean m18261c(int i, int i2) {
        return i == i2;
    }

    /* renamed from: d */
    public static int m18262d(int i) {
        return i;
    }

    /* renamed from: e */
    public static String m18263e(int i) {
        if (m18261c(i, f12498c)) {
            return "Ltr";
        }
        if (m18261c(i, f12499d)) {
            return "Rtl";
        }
        if (m18261c(i, f12500e)) {
            return "Content";
        }
        if (m18261c(i, f12501f)) {
            return "ContentOrLtr";
        }
        if (m18261c(i, f12502g)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m18260b(this.f12503a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int mo20707f() {
        return this.f12503a;
    }

    public int hashCode() {
        return m18262d(this.f12503a);
    }

    public String toString() {
        return m18263e(this.f12503a);
    }
}
