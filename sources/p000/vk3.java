package p000;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: vk3 */
/* compiled from: LoggerFactory */
public final class vk3 {

    /* renamed from: a */
    public static volatile int f45319a;

    /* renamed from: b */
    public static final vc6 f45320b = new vc6();

    /* renamed from: c */
    public static final o24 f45321c = new o24();

    /* renamed from: d */
    public static boolean f45322d = v67.m73100f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    public static final String[] f45323e = {"1.6", "1.7"};

    /* renamed from: f */
    public static String f45324f = "org/slf4j/impl/StaticLoggerBinder.class";

    /* renamed from: a */
    public static final void m73264a() {
        Set<URL> set = null;
        try {
            if (!m73275l()) {
                set = m73269f();
                m73283t(set);
            }
            StaticLoggerBinder.getSingleton();
            f45319a = 3;
            m73282s(set);
        } catch (NoClassDefFoundError e) {
            if (m73276m(e.getMessage())) {
                f45319a = 4;
                v67.m73097c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                v67.m73097c("Defaulting to no-operation (NOP) logger implementation");
                v67.m73097c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } else {
                m73268e(e);
                throw e;
            }
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f45319a = 2;
                v67.m73097c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                v67.m73097c("Your binding is version 1.5.5 or earlier.");
                v67.m73097c("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m73268e(e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        } catch (Throwable th) {
            m73279p();
            throw th;
        }
        m73279p();
    }

    /* renamed from: b */
    public static void m73265b(wc6 wc6, int i) {
        if (wc6.mo66679a().mo66229c()) {
            m73266c(i);
        } else if (!wc6.mo66679a().mo66230d()) {
            m73267d();
        }
    }

    /* renamed from: c */
    public static void m73266c(int i) {
        v67.m73097c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        v67.m73097c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        v67.m73097c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    public static void m73267d() {
        v67.m73097c("The following set of substitute loggers may have been accessed");
        v67.m73097c("during the initialization phase. Logging calls during this");
        v67.m73097c("phase were not honored. However, subsequent logging calls to these");
        v67.m73097c("loggers will work as normally expected.");
        v67.m73097c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    public static void m73268e(Throwable th) {
        f45319a = 2;
        v67.m73098d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    public static Set<URL> m73269f() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = vk3.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f45324f);
            } else {
                enumeration = classLoader.getResources(f45324f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            v67.m73098d("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public static void m73270g() {
        vc6 vc6 = f45320b;
        synchronized (vc6) {
            vc6.mo66486e();
            for (uc6 next : vc6.mo66485d()) {
                next.mo66234g(m73273j(next.getName()));
            }
        }
    }

    /* renamed from: h */
    public static io2 m73271h() {
        if (f45319a == 0) {
            synchronized (vk3.class) {
                if (f45319a == 0) {
                    f45319a = 1;
                    m73278o();
                }
            }
        }
        int i = f45319a;
        if (i == 1) {
            return f45320b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f45321c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: i */
    public static uk3 m73272i(Class<?> cls) {
        Class<?> a;
        uk3 j = m73273j(cls.getName());
        if (f45322d && (a = v67.m73095a()) != null && m73277n(cls, a)) {
            v67.m73097c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{j.getName(), a.getName()}));
            v67.m73097c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return j;
    }

    /* renamed from: j */
    public static uk3 m73273j(String str) {
        return m73271h().mo52516a(str);
    }

    /* renamed from: k */
    public static boolean m73274k(Set<URL> set) {
        if (set.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m73275l() {
        String g = v67.m73101g("java.vendor.url");
        if (g == null) {
            return false;
        }
        return g.toLowerCase().contains("android");
    }

    /* renamed from: m */
    public static boolean m73276m(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("org/slf4j/impl/StaticLoggerBinder") && !str.contains("org.slf4j.impl.StaticLoggerBinder")) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m73277n(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: o */
    public static final void m73278o() {
        m73264a();
        if (f45319a == 3) {
            m73284u();
        }
    }

    /* renamed from: p */
    public static void m73279p() {
        m73270g();
        m73280q();
        f45320b.mo66483b();
    }

    /* renamed from: q */
    public static void m73280q() {
        LinkedBlockingQueue<wc6> c = f45320b.mo66484c();
        int size = c.size();
        ArrayList<wc6> arrayList = new ArrayList<>(128);
        int i = 0;
        while (c.drainTo(arrayList, 128) != 0) {
            for (wc6 wc6 : arrayList) {
                m73281r(wc6);
                int i2 = i + 1;
                if (i == 0) {
                    m73265b(wc6, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: r */
    public static void m73281r(wc6 wc6) {
        if (wc6 != null) {
            uc6 a = wc6.mo66679a();
            String name = a.getName();
            if (a.mo66231e()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!a.mo66230d()) {
                if (a.mo66229c()) {
                    a.mo66233f(wc6);
                } else {
                    v67.m73097c(name);
                }
            }
        }
    }

    /* renamed from: s */
    public static void m73282s(Set<URL> set) {
        if (set != null && m73274k(set)) {
            v67.m73097c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    /* renamed from: t */
    public static void m73283t(Set<URL> set) {
        if (m73274k(set)) {
            v67.m73097c("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                v67.m73097c("Found binding in [" + url + "]");
            }
            v67.m73097c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: u */
    public static final void m73284u() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : f45323e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                v67.m73097c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f45323e).toString());
                v67.m73097c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            v67.m73098d("Unexpected problem occured during version sanity check", th);
        }
    }
}
