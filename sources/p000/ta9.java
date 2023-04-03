package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.web3j.abi.datatypes.Address;
import sun.misc.Unsafe;

/* renamed from: ta9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ta9 {

    /* renamed from: a */
    public static final Unsafe f34207a;

    /* renamed from: b */
    public static final Class<?> f34208b = yz8.m54933a();

    /* renamed from: c */
    public static final boolean f34209c;

    /* renamed from: d */
    public static final boolean f34210d;

    /* renamed from: e */
    public static final ra9 f34211e;

    /* renamed from: f */
    public static final boolean f34212f;

    /* renamed from: g */
    public static final boolean f34213g;

    /* renamed from: h */
    public static final long f34214h = ((long) m52160E(byte[].class));

    /* renamed from: i */
    public static final boolean f34215i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m52182v()
            f34207a = r7
            java.lang.Class r8 = p000.yz8.m54933a()
            f34208b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m52183w(r8)
            f34209c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m52183w(r10)
            f34210d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            oa9 r11 = new oa9
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            ma9 r11 = new ma9
            r11.<init>(r7)
        L_0x003d:
            f34211e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = r13
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f33389a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m52162b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = r12
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m52184x(r8)
            goto L_0x0048
        L_0x0073:
            f34212f = r8
            ra9 r8 = f34211e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = r13
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f33389a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = r12
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m52184x(r6)
            goto L_0x0079
        L_0x00f6:
            f34213g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m52160E(r6)
            long r6 = (long) r6
            f34214h = r6
            m52160E(r5)
            m52161a(r5)
            m52160E(r4)
            m52161a(r4)
            m52160E(r3)
            m52161a(r3)
            m52160E(r2)
            m52161a(r2)
            m52160E(r1)
            m52161a(r1)
            m52160E(r0)
            m52161a(r0)
            java.lang.reflect.Field r0 = m52162b()
            if (r0 == 0) goto L_0x0132
            ra9 r1 = f34211e
            if (r1 == 0) goto L_0x0132
            r1.mo47360h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = r13
        L_0x013c:
            f34215i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ta9.<clinit>():void");
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m52156A(Object obj, long j) {
        if (((byte) ((f34211e.mo47363k(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m52157B(Object obj, long j) {
        if (((byte) ((f34211e.mo47363k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static int m52160E(Class<?> cls) {
        if (f34213g) {
            return f34211e.mo47361i(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m52161a(Class<?> cls) {
        if (f34213g) {
            return f34211e.mo47362j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m52162b() {
        int i = yz8.f35974a;
        Field c = m52163c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m52163c(Buffer.class, Address.TYPE_NAME);
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    public static Field m52163c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m52164d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ra9 ra9 = f34211e;
        int k = ra9.mo47363k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        ra9.mo47364l(obj, j2, ((255 & b) << i) | (k & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m52165e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ra9 ra9 = f34211e;
        int i = (((int) j) & 3) << 3;
        ra9.mo47364l(obj, j2, ((255 & b) << i) | (ra9.mo47363k(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static boolean m52166f() {
        return f34213g;
    }

    /* renamed from: g */
    public static boolean m52167g() {
        return f34212f;
    }

    /* renamed from: h */
    public static <T> T m52168h(Class<T> cls) {
        try {
            return f34207a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public static int m52169i(Object obj, long j) {
        return f34211e.mo47363k(obj, j);
    }

    /* renamed from: j */
    public static void m52170j(Object obj, long j, int i) {
        f34211e.mo47364l(obj, j, i);
    }

    /* renamed from: k */
    public static long m52171k(Object obj, long j) {
        return f34211e.mo47365m(obj, j);
    }

    /* renamed from: l */
    public static void m52172l(Object obj, long j, long j2) {
        f34211e.mo47366n(obj, j, j2);
    }

    /* renamed from: m */
    public static boolean m52173m(Object obj, long j) {
        return f34211e.mo45732b(obj, j);
    }

    /* renamed from: n */
    public static void m52174n(Object obj, long j, boolean z) {
        f34211e.mo45733c(obj, j, z);
    }

    /* renamed from: o */
    public static float m52175o(Object obj, long j) {
        return f34211e.mo45734d(obj, j);
    }

    /* renamed from: p */
    public static void m52176p(Object obj, long j, float f) {
        f34211e.mo45735e(obj, j, f);
    }

    /* renamed from: q */
    public static double m52177q(Object obj, long j) {
        return f34211e.mo45736f(obj, j);
    }

    /* renamed from: r */
    public static void m52178r(Object obj, long j, double d) {
        f34211e.mo45737g(obj, j, d);
    }

    /* renamed from: s */
    public static Object m52179s(Object obj, long j) {
        return f34211e.mo47367o(obj, j);
    }

    /* renamed from: t */
    public static void m52180t(Object obj, long j, Object obj2) {
        f34211e.mo47368p(obj, j, obj2);
    }

    /* renamed from: u */
    public static void m52181u(byte[] bArr, long j, byte b) {
        f34211e.mo45731a(bArr, f34214h + j, b);
    }

    /* renamed from: v */
    public static Unsafe m52182v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new la9());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    public static boolean m52183w(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = yz8.f35974a;
        try {
            Class<?> cls3 = f34208b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m52184x(Throwable th) {
        Logger logger = Logger.getLogger(ta9.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
