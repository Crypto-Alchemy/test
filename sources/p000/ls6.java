package p000;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ls6 */
/* compiled from: Trace */
public final class ls6 {

    /* renamed from: a */
    public static long f14713a;

    /* renamed from: b */
    public static Method f14714b;

    /* renamed from: a */
    public static void m21841a(String str) {
        ns6.m23461a(str);
    }

    /* renamed from: b */
    public static void m21842b() {
        ns6.m23462b();
    }

    /* renamed from: c */
    public static void m21843c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m21844d() {
        try {
            if (f14714b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m21845e();
    }

    /* renamed from: e */
    public static boolean m21845e() {
        try {
            if (f14714b == null) {
                f14713a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f14714b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f14714b.invoke((Object) null, new Object[]{Long.valueOf(f14713a)})).booleanValue();
        } catch (Exception e) {
            m21843c("isTagEnabled", e);
            return false;
        }
    }
}
