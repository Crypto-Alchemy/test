package com.zendesk.logger;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Logger {

    /* renamed from: a */
    public static final TimeZone f27850a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public static final List<C5713c> f27851b = new ArrayList();

    /* renamed from: c */
    public static C5713c f27852c;

    /* renamed from: d */
    public static boolean f27853d = false;

    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);
        
        /* access modifiers changed from: private */
        public final int priority;

        /* access modifiers changed from: public */
        Priority(int i) {
            this.priority = i;
        }
    }

    /* renamed from: com.zendesk.logger.Logger$a */
    public static class C5711a implements C5713c {
        /* renamed from: a */
        public void mo41603a(Priority priority, String str, String str2, Throwable th) {
            int i;
            Priority priority2;
            String a = wk3.m53942a(str);
            if (mo41604b(str) && (priority2 = Priority.ERROR) == priority) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat.setTimeZone(Logger.f27850a);
                Log.println(priority2.priority, a, "Time in UTC: " + simpleDateFormat.format(new Date()));
            }
            if (th != null) {
                str2 = str2 + kb6.f30798b + Log.getStackTraceString(th);
            }
            for (String next : wk3.m53944c(str2, 4000)) {
                if (priority == null) {
                    i = Priority.INFO.priority;
                } else {
                    i = priority.priority;
                }
                Log.println(i, a, next);
            }
        }

        /* renamed from: b */
        public final boolean mo41604b(String str) {
            if (!kb6.m46949b(str) || (!str.endsWith("Provider") && !str.endsWith("Service"))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.zendesk.logger.Logger$b */
    public static class C5712b implements C5713c {
        /* renamed from: a */
        public void mo41603a(Priority priority, String str, String str2, Throwable th) {
            char c;
            StringBuilder sb = new StringBuilder(100);
            sb.append("[");
            sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date()));
            sb.append("]");
            sb.append(" ");
            if (priority == null) {
                c = wk3.m53943b(Priority.INFO.priority);
            } else {
                c = wk3.m53943b(priority.priority);
            }
            sb.append(c);
            sb.append("/");
            if (!kb6.m46949b(str)) {
                str = "UNKNOWN";
            }
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            System.out.println(sb.toString());
            if (th != null) {
                th.printStackTrace(System.out);
            }
        }
    }

    /* renamed from: com.zendesk.logger.Logger$c */
    public interface C5713c {
        /* renamed from: a */
        void mo41603a(Priority priority, String str, String str2, Throwable th);
    }

    static {
        try {
            Class.forName("android.os.Build");
            f27852c = new C5711a();
        } catch (ClassNotFoundException unused) {
            if (f27852c == null) {
                f27852c = new C5712b();
            }
        } catch (Throwable th) {
            if (f27852c == null) {
                f27852c = new C5712b();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static void m43078b(String str, String str2, Object... objArr) {
        m43085i(Priority.DEBUG, str, str2, (Throwable) null, objArr);
    }

    /* renamed from: c */
    public static void m43079c(String str, hr1 hr1) {
        StringBuilder sb = new StringBuilder();
        if (hr1 != null) {
            sb.append("Network Error: ");
            sb.append(hr1.mo43363f());
            sb.append(", Status Code: ");
            sb.append(hr1.mo43362e());
            if (kb6.m46949b(hr1.mo43366h())) {
                sb.append(", Reason: ");
                sb.append(hr1.mo43366h());
            }
        }
        String sb2 = sb.toString();
        Priority priority = Priority.ERROR;
        if (!kb6.m46949b(sb2)) {
            sb2 = "Unknown error";
        }
        m43085i(priority, str, sb2, (Throwable) null, new Object[0]);
    }

    /* renamed from: d */
    public static void m43080d(String str, String str2, Throwable th, Object... objArr) {
        m43085i(Priority.ERROR, str, str2, th, objArr);
    }

    /* renamed from: e */
    public static void m43081e(String str, String str2, Object... objArr) {
        m43085i(Priority.ERROR, str, str2, (Throwable) null, objArr);
    }

    /* renamed from: f */
    public static void m43082f(String str, String str2, Throwable th, Object... objArr) {
        m43085i(Priority.INFO, str, str2, th, objArr);
    }

    /* renamed from: g */
    public static void m43083g(String str, String str2, Object... objArr) {
        m43085i(Priority.INFO, str, str2, (Throwable) null, objArr);
    }

    /* renamed from: h */
    public static boolean m43084h() {
        return f27853d;
    }

    /* renamed from: i */
    public static void m43085i(Priority priority, String str, String str2, Throwable th, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (f27853d) {
            f27852c.mo41603a(priority, str, str2, th);
            for (C5713c a : f27851b) {
                a.mo41603a(priority, str, str2, th);
            }
        }
    }

    /* renamed from: j */
    public static void m43086j(String str, String str2, Throwable th, Object... objArr) {
        m43085i(Priority.WARN, str, str2, th, objArr);
    }

    /* renamed from: k */
    public static void m43087k(String str, String str2, Object... objArr) {
        m43085i(Priority.WARN, str, str2, (Throwable) null, objArr);
    }
}
