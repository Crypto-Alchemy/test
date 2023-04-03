package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.web3j.abi.datatypes.Address;
import sun.misc.Unsafe;

/* renamed from: l99 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class l99 {

    /* renamed from: a */
    public static final Unsafe f31223a;

    /* renamed from: b */
    public static final Class<?> f31224b = hw8.m45400c();

    /* renamed from: c */
    public static final boolean f31225c;

    /* renamed from: d */
    public static final boolean f31226d;

    /* renamed from: e */
    public static final C6212d f31227e;

    /* renamed from: f */
    public static final boolean f31228f = m47672E();

    /* renamed from: g */
    public static final boolean f31229g = m47668A();

    /* renamed from: h */
    public static final long f31230h;

    /* renamed from: i */
    public static final long f31231i;

    /* renamed from: j */
    public static final long f31232j;

    /* renamed from: k */
    public static final long f31233k;

    /* renamed from: l */
    public static final long f31234l;

    /* renamed from: m */
    public static final long f31235m;

    /* renamed from: n */
    public static final long f31236n;

    /* renamed from: o */
    public static final long f31237o;

    /* renamed from: p */
    public static final long f31238p;

    /* renamed from: q */
    public static final long f31239q;

    /* renamed from: r */
    public static final long f31240r;

    /* renamed from: s */
    public static final long f31241s;

    /* renamed from: t */
    public static final long f31242t;

    /* renamed from: u */
    public static final long f31243u;

    /* renamed from: v */
    public static final int f31244v;

    /* renamed from: w */
    public static final boolean f31245w;

    /* renamed from: l99$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C6209a extends C6212d {
        public C6209a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo45391a(Object obj, long j) {
            if (l99.f31245w) {
                return l99.m47679L(obj, j);
            }
            return l99.m47680M(obj, j);
        }

        /* renamed from: b */
        public final void mo45392b(Object obj, long j, byte b) {
            if (l99.f31245w) {
                l99.m47703u(obj, j, b);
            } else {
                l99.m47707y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo45393c(Object obj, long j, double d) {
            mo45400f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo45394d(Object obj, long j, float f) {
            mo45399e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo45395g(Object obj, long j, boolean z) {
            if (l99.f31245w) {
                l99.m47708z(obj, j, z);
            } else {
                l99.m47671D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo45396h(Object obj, long j) {
            if (l99.f31245w) {
                return l99.m47681N(obj, j);
            }
            return l99.m47682O(obj, j);
        }

        /* renamed from: i */
        public final float mo45397i(Object obj, long j) {
            return Float.intBitsToFloat(mo45401k(obj, j));
        }

        /* renamed from: j */
        public final double mo45398j(Object obj, long j) {
            return Double.longBitsToDouble(mo45402l(obj, j));
        }
    }

    /* renamed from: l99$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C6210b extends C6212d {
        public C6210b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo45391a(Object obj, long j) {
            return this.f31246a.getByte(obj, j);
        }

        /* renamed from: b */
        public final void mo45392b(Object obj, long j, byte b) {
            this.f31246a.putByte(obj, j, b);
        }

        /* renamed from: c */
        public final void mo45393c(Object obj, long j, double d) {
            this.f31246a.putDouble(obj, j, d);
        }

        /* renamed from: d */
        public final void mo45394d(Object obj, long j, float f) {
            this.f31246a.putFloat(obj, j, f);
        }

        /* renamed from: g */
        public final void mo45395g(Object obj, long j, boolean z) {
            this.f31246a.putBoolean(obj, j, z);
        }

        /* renamed from: h */
        public final boolean mo45396h(Object obj, long j) {
            return this.f31246a.getBoolean(obj, j);
        }

        /* renamed from: i */
        public final float mo45397i(Object obj, long j) {
            return this.f31246a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final double mo45398j(Object obj, long j) {
            return this.f31246a.getDouble(obj, j);
        }
    }

    /* renamed from: l99$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C6211c extends C6212d {
        public C6211c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo45391a(Object obj, long j) {
            if (l99.f31245w) {
                return l99.m47679L(obj, j);
            }
            return l99.m47680M(obj, j);
        }

        /* renamed from: b */
        public final void mo45392b(Object obj, long j, byte b) {
            if (l99.f31245w) {
                l99.m47703u(obj, j, b);
            } else {
                l99.m47707y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo45393c(Object obj, long j, double d) {
            mo45400f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo45394d(Object obj, long j, float f) {
            mo45399e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo45395g(Object obj, long j, boolean z) {
            if (l99.f31245w) {
                l99.m47708z(obj, j, z);
            } else {
                l99.m47671D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo45396h(Object obj, long j) {
            if (l99.f31245w) {
                return l99.m47681N(obj, j);
            }
            return l99.m47682O(obj, j);
        }

        /* renamed from: i */
        public final float mo45397i(Object obj, long j) {
            return Float.intBitsToFloat(mo45401k(obj, j));
        }

        /* renamed from: j */
        public final double mo45398j(Object obj, long j) {
            return Double.longBitsToDouble(mo45402l(obj, j));
        }
    }

    /* renamed from: l99$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static abstract class C6212d {

        /* renamed from: a */
        public Unsafe f31246a;

        public C6212d(Unsafe unsafe) {
            this.f31246a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo45391a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo45392b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo45393c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo45394d(Object obj, long j, float f);

        /* renamed from: e */
        public final void mo45399e(Object obj, long j, int i) {
            this.f31246a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void mo45400f(Object obj, long j, long j2) {
            this.f31246a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo45395g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo45396h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo45397i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo45398j(Object obj, long j);

        /* renamed from: k */
        public final int mo45401k(Object obj, long j) {
            return this.f31246a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long mo45402l(Object obj, long j) {
            return this.f31246a.getLong(obj, j);
        }
    }

    static {
        long j;
        boolean z;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe t = m47702t();
        f31223a = t;
        boolean B = m47669B(Long.TYPE);
        f31225c = B;
        boolean B2 = m47669B(Integer.TYPE);
        f31226d = B2;
        C6212d dVar = null;
        if (t != null) {
            if (!hw8.m45399b()) {
                dVar = new C6210b(t);
            } else if (B) {
                dVar = new C6211c(t);
            } else if (B2) {
                dVar = new C6209a(t);
            }
        }
        f31227e = dVar;
        long n = (long) m47696n(byte[].class);
        f31230h = n;
        f31231i = (long) m47696n(cls6);
        f31232j = (long) m47701s(cls6);
        f31233k = (long) m47696n(cls5);
        f31234l = (long) m47701s(cls5);
        f31235m = (long) m47696n(cls4);
        f31236n = (long) m47701s(cls4);
        f31237o = (long) m47696n(cls3);
        f31238p = (long) m47701s(cls3);
        f31239q = (long) m47696n(cls2);
        f31240r = (long) m47701s(cls2);
        f31241s = (long) m47696n(cls);
        f31242t = (long) m47701s(cls);
        Field G = m47674G();
        if (G == null || dVar == null) {
            j = -1;
        } else {
            j = dVar.f31246a.objectFieldOffset(G);
        }
        f31243u = j;
        f31244v = (int) (7 & n);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f31245w = z;
    }

    /* renamed from: A */
    public static boolean m47668A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f31223a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (hw8.m45399b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(l99.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    public static boolean m47669B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!hw8.m45399b()) {
            return false;
        }
        try {
            Class<?> cls3 = f31224b;
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

    /* renamed from: C */
    public static double m47670C(Object obj, long j) {
        return f31227e.mo45398j(obj, j);
    }

    /* renamed from: D */
    public static void m47671D(Object obj, long j, boolean z) {
        m47707y(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: E */
    public static boolean m47672E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f31223a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m47674G() == null) {
                return false;
            }
            if (hw8.m45399b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(l99.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    public static Object m47673F(Object obj, long j) {
        return f31227e.f31246a.getObject(obj, j);
    }

    /* renamed from: G */
    public static Field m47674G() {
        Field d;
        if (hw8.m45399b() && (d = m47686d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d;
        }
        Field d2 = m47686d(Buffer.class, Address.TYPE_NAME);
        if (d2 == null || d2.getType() != Long.TYPE) {
            return null;
        }
        return d2;
    }

    /* renamed from: L */
    public static byte m47679L(Object obj, long j) {
        return (byte) (m47684b(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: M */
    public static byte m47680M(Object obj, long j) {
        return (byte) (m47684b(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: N */
    public static boolean m47681N(Object obj, long j) {
        if (m47679L(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m47682O(Object obj, long j) {
        if (m47680M(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static byte m47683a(byte[] bArr, long j) {
        return f31227e.mo45391a(bArr, f31230h + j);
    }

    /* renamed from: b */
    public static int m47684b(Object obj, long j) {
        return f31227e.mo45401k(obj, j);
    }

    /* renamed from: c */
    public static <T> T m47685c(Class<T> cls) {
        try {
            return f31223a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public static Field m47686d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m47688f(Object obj, long j, double d) {
        f31227e.mo45393c(obj, j, d);
    }

    /* renamed from: g */
    public static void m47689g(Object obj, long j, float f) {
        f31227e.mo45394d(obj, j, f);
    }

    /* renamed from: h */
    public static void m47690h(Object obj, long j, int i) {
        f31227e.mo45399e(obj, j, i);
    }

    /* renamed from: i */
    public static void m47691i(Object obj, long j, long j2) {
        f31227e.mo45400f(obj, j, j2);
    }

    /* renamed from: j */
    public static void m47692j(Object obj, long j, Object obj2) {
        f31227e.f31246a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    public static void m47693k(Object obj, long j, boolean z) {
        f31227e.mo45395g(obj, j, z);
    }

    /* renamed from: l */
    public static void m47694l(byte[] bArr, long j, byte b) {
        f31227e.mo45392b(bArr, f31230h + j, b);
    }

    /* renamed from: m */
    public static boolean m47695m() {
        return f31229g;
    }

    /* renamed from: n */
    public static int m47696n(Class<?> cls) {
        if (f31229g) {
            return f31227e.f31246a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static long m47697o(Object obj, long j) {
        return f31227e.mo45402l(obj, j);
    }

    /* renamed from: r */
    public static boolean m47700r() {
        return f31228f;
    }

    /* renamed from: s */
    public static int m47701s(Class<?> cls) {
        if (f31229g) {
            return f31227e.f31246a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    public static Unsafe m47702t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r99());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static void m47703u(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int b2 = m47684b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m47690h(obj, j2, ((255 & b) << i) | (b2 & (~(255 << i))));
    }

    /* renamed from: w */
    public static boolean m47705w(Object obj, long j) {
        return f31227e.mo45396h(obj, j);
    }

    /* renamed from: x */
    public static float m47706x(Object obj, long j) {
        return f31227e.mo45397i(obj, j);
    }

    /* renamed from: y */
    public static void m47707y(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m47690h(obj, j2, ((255 & b) << i) | (m47684b(obj, j2) & (~(255 << i))));
    }

    /* renamed from: z */
    public static void m47708z(Object obj, long j, boolean z) {
        m47703u(obj, j, z ? (byte) 1 : 0);
    }
}
