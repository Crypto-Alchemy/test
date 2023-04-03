package p000;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* renamed from: gl6 */
/* compiled from: TLRandom */
public final class gl6 {

    /* renamed from: a */
    public static final Unsafe f29269a;

    /* renamed from: b */
    public static final boolean f29270b;

    /* renamed from: c */
    public static final boolean f29271c;

    /* renamed from: d */
    public static final long f29272d;

    /* renamed from: e */
    public static final long f29273e;

    /* renamed from: f */
    public static final long f29274f;

    /* renamed from: g */
    public static final long f29275g;

    /* renamed from: h */
    public static final ThreadLocal<C5869c> f29276h = new C5867a();

    /* renamed from: i */
    public static final AtomicInteger f29277i = new AtomicInteger();

    /* renamed from: j */
    public static final AtomicLong f29278j = new AtomicLong(m44764k(System.currentTimeMillis()) ^ m44764k(System.nanoTime()));

    /* renamed from: gl6$a */
    /* compiled from: TLRandom */
    public static class C5867a extends ThreadLocal<C5869c> {
        /* renamed from: a */
        public C5869c initialValue() {
            return new C5869c((C5867a) null);
        }
    }

    /* renamed from: gl6$b */
    /* compiled from: TLRandom */
    public static class C5868b implements PrivilegedAction<Boolean> {
        /* renamed from: a */
        public Boolean run() {
            return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }

    /* renamed from: gl6$c */
    /* compiled from: TLRandom */
    public static final class C5869c {

        /* renamed from: a */
        public long f29279a;

        /* renamed from: b */
        public int f29280b;

        /* renamed from: c */
        public int f29281c;

        public C5869c() {
        }

        public /* synthetic */ C5869c(C5867a aVar) {
            this();
        }
    }

    static {
        String str;
        Unsafe unsafe = n47.f31967a;
        f29269a = unsafe;
        try {
            boolean h = m44761h();
            f29270b = h;
            boolean f = m44759f();
            f29271c = f;
            if (!f) {
                f29272d = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f29273e = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                if (h) {
                    str = "accessControlContext";
                } else {
                    str = "inheritedAccessControlContext";
                }
                f29274f = unsafe.objectFieldOffset(Thread.class.getDeclaredField(str));
                f29275g = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f29272d = 0;
                f29273e = 0;
                f29274f = 0;
                f29275g = 0;
            }
            if (((Boolean) AccessController.doPrivileged(new C5868b())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j = (j << 8) | (((long) seed[i]) & 255);
                }
                f29278j.set(j);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static final int m44754a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        m44768o(i4);
        return i4;
    }

    /* renamed from: b */
    public static final void m44755b(Thread thread) {
        if (!f29271c) {
            Unsafe unsafe = f29269a;
            unsafe.putObject(thread, f29272d, (Object) null);
            unsafe.putObject(thread, f29273e, (Object) null);
        }
    }

    /* renamed from: c */
    public static final int m44756c() {
        return m44757d();
    }

    /* renamed from: d */
    public static int m44757d() {
        return f29276h.get().f29280b;
    }

    /* renamed from: e */
    public static int m44758e() {
        return f29276h.get().f29281c;
    }

    /* renamed from: f */
    public static boolean m44759f() {
        if (m44760g("android.util.DisplayMetrics")) {
            return true;
        }
        return m44760g("org.robovm.rt.bro.Bro");
    }

    /* renamed from: g */
    public static boolean m44760g(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, gl6.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m44761h() {
        String property;
        if (!m44760g("com.ibm.misc.JarVersion") || (property = System.getProperty("java.class.version", "45")) == null || property.length() < 2 || "52".compareTo(property.substring(0, 2)) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final void m44762i() {
        int addAndGet = f29277i.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        m44770q(m44764k(f29278j.getAndAdd(-4942790177534073029L)));
        m44768o(addAndGet);
    }

    /* renamed from: j */
    public static int m44763j(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    /* renamed from: k */
    public static long m44764k(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: l */
    public static final int m44765l() {
        int i;
        int e = m44758e();
        if (e != 0) {
            int i2 = e ^ (e << 13);
            int i3 = i2 ^ (i2 >>> 17);
            i = i3 ^ (i3 << 5);
        } else {
            i = m44763j(f29278j.getAndAdd(-4942790177534073029L));
            if (i == 0) {
                i = 1;
            }
        }
        m44769p(i);
        return i;
    }

    /* renamed from: m */
    public static final void m44766m(Thread thread, ClassLoader classLoader) {
        if (!f29271c) {
            f29269a.putObject(thread, f29275g, classLoader);
        }
    }

    /* renamed from: n */
    public static final void m44767n(Thread thread, AccessControlContext accessControlContext) {
        if (!f29271c) {
            f29269a.putOrderedObject(thread, f29274f, accessControlContext);
        }
    }

    /* renamed from: o */
    public static void m44768o(int i) {
        f29276h.get().f29280b = i;
    }

    /* renamed from: p */
    public static void m44769p(int i) {
        f29276h.get().f29281c = i;
    }

    /* renamed from: q */
    public static void m44770q(long j) {
        f29276h.get().f29279a = j;
    }
}
