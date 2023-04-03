package p000;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: os6 */
/* compiled from: TraceCompat */
public final class os6 {

    /* renamed from: a */
    public static long f16061a;

    /* renamed from: b */
    public static Method f16062b;

    /* renamed from: c */
    public static Method f16063c;

    /* renamed from: d */
    public static Method f16064d;

    /* renamed from: e */
    public static Method f16065e;

    /* renamed from: os6$a */
    /* compiled from: TraceCompat */
    public static class C2991a {
        /* renamed from: a */
        public static void m24035a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m24036b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f16061a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f16062b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f16063c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f16064d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f16065e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m24033a(String str) {
        C2991a.m24035a(str);
    }

    /* renamed from: b */
    public static void m24034b() {
        C2991a.m24036b();
    }
}
