package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: cu4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class cu4 {
    /* renamed from: a */
    public static void m43211a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m43212b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m43213c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m43214d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    /* renamed from: e */
    public static void m43215e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static void m43216f(String str) {
        if (!wa8.m53784a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m43217g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: h */
    public static String m43218h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m43219i() {
        m43220j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m43220j(String str) {
        if (wa8.m53784a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m43221k(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: l */
    public static <T> T m43222l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: m */
    public static int m43223m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static long m43224n(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    /* renamed from: o */
    public static void m43225o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m43226p(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m43227q(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
