package p000;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: gk3 */
/* compiled from: Log */
public final class gk3 {

    /* renamed from: a */
    public static final Object f12403a = new Object();

    /* renamed from: b */
    public static int f12404b = 0;

    /* renamed from: c */
    public static boolean f12405c = true;

    /* renamed from: d */
    public static C2390a f12406d = C2390a.f12407a;

    /* renamed from: gk3$a */
    /* compiled from: Log */
    public interface C2390a {

        /* renamed from: a */
        public static final C2390a f12407a = new C2391a();

        /* renamed from: gk3$a$a */
        /* compiled from: Log */
        public class C2391a implements C2390a {
            /* renamed from: a */
            public void mo20625a(String str, String str2) {
            }

            /* renamed from: b */
            public void mo20626b(String str, String str2) {
            }

            /* renamed from: c */
            public void mo20627c(String str, String str2) {
            }

            /* renamed from: d */
            public void mo20628d(String str, String str2) {
            }
        }

        /* renamed from: a */
        void mo20625a(String str, String str2);

        /* renamed from: b */
        void mo20626b(String str, String str2);

        /* renamed from: c */
        void mo20627c(String str, String str2);

        /* renamed from: d */
        void mo20628d(String str, String str2);
    }

    @Pure
    /* renamed from: a */
    public static String m18124a(String str, Throwable th) {
        String e = m18128e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        return str + "\n  " + e.replace("\n", "\n  ") + 10;
    }

    @Pure
    /* renamed from: b */
    public static void m18125b(String str, String str2) {
        synchronized (f12403a) {
            if (f12404b == 0) {
                f12406d.mo20627c(str, str2);
            }
        }
    }

    @Pure
    /* renamed from: c */
    public static void m18126c(String str, String str2) {
        synchronized (f12403a) {
            if (f12404b <= 3) {
                f12406d.mo20626b(str, str2);
            }
        }
    }

    @Pure
    /* renamed from: d */
    public static void m18127d(String str, String str2, Throwable th) {
        m18126c(str, m18124a(str2, th));
    }

    @Pure
    /* renamed from: e */
    public static String m18128e(Throwable th) {
        synchronized (f12403a) {
            if (th == null) {
                return null;
            }
            if (m18131h(th)) {
                return "UnknownHostException (no network)";
            }
            if (!f12405c) {
                String message = th.getMessage();
                return message;
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }

    @Pure
    /* renamed from: f */
    public static void m18129f(String str, String str2) {
        synchronized (f12403a) {
            if (f12404b <= 1) {
                f12406d.mo20628d(str, str2);
            }
        }
    }

    @Pure
    /* renamed from: g */
    public static void m18130g(String str, String str2, Throwable th) {
        m18129f(str, m18124a(str2, th));
    }

    @Pure
    /* renamed from: h */
    public static boolean m18131h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    /* renamed from: i */
    public static void m18132i(String str, String str2) {
        synchronized (f12403a) {
            if (f12404b <= 2) {
                f12406d.mo20625a(str, str2);
            }
        }
    }

    @Pure
    /* renamed from: j */
    public static void m18133j(String str, String str2, Throwable th) {
        m18132i(str, m18124a(str2, th));
    }
}
