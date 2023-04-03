package p000;

import java.io.PrintStream;

/* renamed from: v67 */
/* compiled from: Util */
public final class v67 {

    /* renamed from: a */
    public static C9444b f45226a = null;

    /* renamed from: b */
    public static boolean f45227b = false;

    /* renamed from: v67$b */
    /* compiled from: Util */
    public static final class C9444b extends SecurityManager {
        public C9444b() {
        }

        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* renamed from: a */
    public static Class<?> m73095a() {
        int i;
        C9444b b = m73096b();
        if (b == null) {
            return null;
        }
        Class<?>[] classContext = b.getClassContext();
        String name = v67.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    public static C9444b m73096b() {
        C9444b bVar = f45226a;
        if (bVar != null) {
            return bVar;
        }
        if (f45227b) {
            return null;
        }
        C9444b e = m73099e();
        f45226a = e;
        f45227b = true;
        return e;
    }

    /* renamed from: c */
    public static final void m73097c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: d */
    public static final void m73098d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: e */
    public static C9444b m73099e() {
        try {
            return new C9444b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m73100f(String str) {
        String g = m73101g(str);
        if (g == null) {
            return false;
        }
        return g.equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public static String m73101g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }
}
