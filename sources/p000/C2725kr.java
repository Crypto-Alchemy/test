package p000;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: kr */
/* compiled from: Assertions */
public final class C2725kr {
    @Pure
    /* renamed from: a */
    public static void m20981a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m20982b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    /* renamed from: c */
    public static int m20983c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: d */
    public static String m20984d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: e */
    public static <T> T m20985e(T t) {
        t.getClass();
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: f */
    public static <T> T m20986f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    /* renamed from: g */
    public static void m20987g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: h */
    public static void m20988h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: i */
    public static <T> T m20989i(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: j */
    public static <T> T m20990j(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
