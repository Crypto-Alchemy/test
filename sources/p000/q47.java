package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.web3j.abi.datatypes.Address;
import sun.misc.Unsafe;

/* renamed from: q47 */
/* compiled from: UnsafeUtil */
public final class q47 {

    /* renamed from: a */
    public static final Unsafe f32917a = m50235H();

    /* renamed from: b */
    public static final Class<?> f32918b = C3894bh.m32521b();

    /* renamed from: c */
    public static final boolean f32919c = m50269q(Long.TYPE);

    /* renamed from: d */
    public static final boolean f32920d = m50269q(Integer.TYPE);

    /* renamed from: e */
    public static final C6387e f32921e = m50233F();

    /* renamed from: f */
    public static final boolean f32922f = m50252Y();

    /* renamed from: g */
    public static final boolean f32923g = m50251X();

    /* renamed from: h */
    public static final long f32924h;

    /* renamed from: i */
    public static final long f32925i;

    /* renamed from: j */
    public static final long f32926j;

    /* renamed from: k */
    public static final long f32927k;

    /* renamed from: l */
    public static final long f32928l;

    /* renamed from: m */
    public static final long f32929m;

    /* renamed from: n */
    public static final long f32930n;

    /* renamed from: o */
    public static final long f32931o;

    /* renamed from: p */
    public static final long f32932p;

    /* renamed from: q */
    public static final long f32933q;

    /* renamed from: r */
    public static final long f32934r;

    /* renamed from: s */
    public static final long f32935s;

    /* renamed from: t */
    public static final long f32936t;

    /* renamed from: u */
    public static final long f32937u = m50271s(m50267o());

    /* renamed from: v */
    public static final int f32938v;

    /* renamed from: w */
    public static final boolean f32939w;

    /* renamed from: q47$a */
    /* compiled from: UnsafeUtil */
    public class C6383a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: q47$b */
    /* compiled from: UnsafeUtil */
    public static final class C6384b extends C6387e {
        public C6384b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46948c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo46949d(Object obj, long j) {
            if (q47.f32939w) {
                return q47.m50273u(obj, j);
            }
            return q47.m50274v(obj, j);
        }

        /* renamed from: e */
        public byte mo46950e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo46951f(Object obj, long j) {
            if (q47.f32939w) {
                return q47.m50277y(obj, j);
            }
            return q47.m50278z(obj, j);
        }

        /* renamed from: g */
        public double mo46952g(Object obj, long j) {
            return Double.longBitsToDouble(mo46964k(obj, j));
        }

        /* renamed from: h */
        public float mo46953h(Object obj, long j) {
            return Float.intBitsToFloat(mo46963i(obj, j));
        }

        /* renamed from: j */
        public long mo46954j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo46955n(Object obj, long j, boolean z) {
            if (q47.f32939w) {
                q47.m50241N(obj, j, z);
            } else {
                q47.m50242O(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo46956o(Object obj, long j, byte b) {
            if (q47.f32939w) {
                q47.m50244Q(obj, j, b);
            } else {
                q47.m50245R(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo46957p(Object obj, long j, double d) {
            mo46968s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo46958q(Object obj, long j, float f) {
            mo46967r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo46959v() {
            return false;
        }
    }

    /* renamed from: q47$c */
    /* compiled from: UnsafeUtil */
    public static final class C6385c extends C6387e {
        public C6385c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46948c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo46949d(Object obj, long j) {
            if (q47.f32939w) {
                return q47.m50273u(obj, j);
            }
            return q47.m50274v(obj, j);
        }

        /* renamed from: e */
        public byte mo46950e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo46951f(Object obj, long j) {
            if (q47.f32939w) {
                return q47.m50277y(obj, j);
            }
            return q47.m50278z(obj, j);
        }

        /* renamed from: g */
        public double mo46952g(Object obj, long j) {
            return Double.longBitsToDouble(mo46964k(obj, j));
        }

        /* renamed from: h */
        public float mo46953h(Object obj, long j) {
            return Float.intBitsToFloat(mo46963i(obj, j));
        }

        /* renamed from: j */
        public long mo46954j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo46955n(Object obj, long j, boolean z) {
            if (q47.f32939w) {
                q47.m50241N(obj, j, z);
            } else {
                q47.m50242O(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo46956o(Object obj, long j, byte b) {
            if (q47.f32939w) {
                q47.m50244Q(obj, j, b);
            } else {
                q47.m50245R(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo46957p(Object obj, long j, double d) {
            mo46968s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo46958q(Object obj, long j, float f) {
            mo46967r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo46959v() {
            return false;
        }
    }

    /* renamed from: q47$d */
    /* compiled from: UnsafeUtil */
    public static final class C6386d extends C6387e {
        public C6386d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46948c(long j, byte[] bArr, long j2, long j3) {
            this.f32940a.copyMemory((Object) null, j, bArr, q47.f32924h + j2, j3);
        }

        /* renamed from: d */
        public boolean mo46949d(Object obj, long j) {
            return this.f32940a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo46950e(long j) {
            return this.f32940a.getByte(j);
        }

        /* renamed from: f */
        public byte mo46951f(Object obj, long j) {
            return this.f32940a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo46952g(Object obj, long j) {
            return this.f32940a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo46953h(Object obj, long j) {
            return this.f32940a.getFloat(obj, j);
        }

        /* renamed from: j */
        public long mo46954j(long j) {
            return this.f32940a.getLong(j);
        }

        /* renamed from: n */
        public void mo46955n(Object obj, long j, boolean z) {
            this.f32940a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo46956o(Object obj, long j, byte b) {
            this.f32940a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo46957p(Object obj, long j, double d) {
            this.f32940a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo46958q(Object obj, long j, float f) {
            this.f32940a.putFloat(obj, j, f);
        }

        /* renamed from: u */
        public boolean mo46960u() {
            Class<Object> cls = Object.class;
            if (!super.mo46960u()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f32940a.getClass();
                Class cls3 = Long.TYPE;
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
                q47.m50238K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo46959v() {
            Class<Object> cls = Object.class;
            if (!super.mo46959v()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f32940a.getClass();
                Class cls3 = Long.TYPE;
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
                q47.m50238K(th);
                return false;
            }
        }
    }

    /* renamed from: q47$e */
    /* compiled from: UnsafeUtil */
    public static abstract class C6387e {

        /* renamed from: a */
        public Unsafe f32940a;

        public C6387e(Unsafe unsafe) {
            this.f32940a = unsafe;
        }

        /* renamed from: a */
        public final int mo46961a(Class<?> cls) {
            return this.f32940a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo46962b(Class<?> cls) {
            return this.f32940a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo46948c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo46949d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo46950e(long j);

        /* renamed from: f */
        public abstract byte mo46951f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo46952g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo46953h(Object obj, long j);

        /* renamed from: i */
        public final int mo46963i(Object obj, long j) {
            return this.f32940a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo46954j(long j);

        /* renamed from: k */
        public final long mo46964k(Object obj, long j) {
            return this.f32940a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo46965l(Object obj, long j) {
            return this.f32940a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo46966m(Field field) {
            return this.f32940a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo46955n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo46956o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo46957p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo46958q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo46967r(Object obj, long j, int i) {
            this.f32940a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo46968s(Object obj, long j, long j2) {
            this.f32940a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo46969t(Object obj, long j, Object obj2) {
            this.f32940a.putObject(obj, j, obj2);
        }

        /* renamed from: u */
        public boolean mo46960u() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f32940a;
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
                return true;
            } catch (Throwable th) {
                q47.m50238K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo46959v() {
            Unsafe unsafe = this.f32940a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (q47.m50267o() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                q47.m50238K(th);
                return false;
            }
        }
    }

    static {
        boolean z;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long m = (long) m50265m(byte[].class);
        f32924h = m;
        f32925i = (long) m50265m(cls6);
        f32926j = (long) m50266n(cls6);
        f32927k = (long) m50265m(cls5);
        f32928l = (long) m50266n(cls5);
        f32929m = (long) m50265m(cls4);
        f32930n = (long) m50266n(cls4);
        f32931o = (long) m50265m(cls3);
        f32932p = (long) m50266n(cls3);
        f32933q = (long) m50265m(cls2);
        f32934r = (long) m50266n(cls2);
        f32935s = (long) m50265m(cls);
        f32936t = (long) m50266n(cls);
        f32938v = (int) (7 & m);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f32939w = z;
    }

    /* renamed from: A */
    public static double m50228A(Object obj, long j) {
        return f32921e.mo46952g(obj, j);
    }

    /* renamed from: B */
    public static float m50229B(Object obj, long j) {
        return f32921e.mo46953h(obj, j);
    }

    /* renamed from: C */
    public static int m50230C(Object obj, long j) {
        return f32921e.mo46963i(obj, j);
    }

    /* renamed from: D */
    public static long m50231D(long j) {
        return f32921e.mo46954j(j);
    }

    /* renamed from: E */
    public static long m50232E(Object obj, long j) {
        return f32921e.mo46964k(obj, j);
    }

    /* renamed from: F */
    public static C6387e m50233F() {
        Unsafe unsafe = f32917a;
        if (unsafe == null) {
            return null;
        }
        if (!C3894bh.m32522c()) {
            return new C6386d(unsafe);
        }
        if (f32919c) {
            return new C6385c(unsafe);
        }
        if (f32920d) {
            return new C6384b(unsafe);
        }
        return null;
    }

    /* renamed from: G */
    public static Object m50234G(Object obj, long j) {
        return f32921e.mo46965l(obj, j);
    }

    /* renamed from: H */
    public static Unsafe m50235H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6383a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static boolean m50236I() {
        return f32923g;
    }

    /* renamed from: J */
    public static boolean m50237J() {
        return f32922f;
    }

    /* renamed from: K */
    public static void m50238K(Throwable th) {
        Logger logger = Logger.getLogger(q47.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: L */
    public static long m50239L(Field field) {
        return f32921e.mo46966m(field);
    }

    /* renamed from: M */
    public static void m50240M(Object obj, long j, boolean z) {
        f32921e.mo46955n(obj, j, z);
    }

    /* renamed from: N */
    public static void m50241N(Object obj, long j, boolean z) {
        m50244Q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: O */
    public static void m50242O(Object obj, long j, boolean z) {
        m50245R(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: P */
    public static void m50243P(byte[] bArr, long j, byte b) {
        f32921e.mo46956o(bArr, f32924h + j, b);
    }

    /* renamed from: Q */
    public static void m50244Q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int C = m50230C(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m50248U(obj, j2, ((255 & b) << i) | (C & (~(255 << i))));
    }

    /* renamed from: R */
    public static void m50245R(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m50248U(obj, j2, ((255 & b) << i) | (m50230C(obj, j2) & (~(255 << i))));
    }

    /* renamed from: S */
    public static void m50246S(Object obj, long j, double d) {
        f32921e.mo46957p(obj, j, d);
    }

    /* renamed from: T */
    public static void m50247T(Object obj, long j, float f) {
        f32921e.mo46958q(obj, j, f);
    }

    /* renamed from: U */
    public static void m50248U(Object obj, long j, int i) {
        f32921e.mo46967r(obj, j, i);
    }

    /* renamed from: V */
    public static void m50249V(Object obj, long j, long j2) {
        f32921e.mo46968s(obj, j, j2);
    }

    /* renamed from: W */
    public static void m50250W(Object obj, long j, Object obj2) {
        f32921e.mo46969t(obj, j, obj2);
    }

    /* renamed from: X */
    public static boolean m50251X() {
        C6387e eVar = f32921e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo46960u();
    }

    /* renamed from: Y */
    public static boolean m50252Y() {
        C6387e eVar = f32921e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo46959v();
    }

    /* renamed from: k */
    public static long m50263k(ByteBuffer byteBuffer) {
        return f32921e.mo46964k(byteBuffer, f32937u);
    }

    /* renamed from: l */
    public static <T> T m50264l(Class<T> cls) {
        try {
            return f32917a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    public static int m50265m(Class<?> cls) {
        if (f32923g) {
            return f32921e.mo46961a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m50266n(Class<?> cls) {
        if (f32923g) {
            return f32921e.mo46962b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m50267o() {
        Field r;
        if (C3894bh.m32522c() && (r = m50270r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r;
        }
        Field r2 = m50270r(Buffer.class, Address.TYPE_NAME);
        if (r2 == null || r2.getType() != Long.TYPE) {
            return null;
        }
        return r2;
    }

    /* renamed from: p */
    public static void m50268p(long j, byte[] bArr, long j2, long j3) {
        f32921e.mo46948c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    public static boolean m50269q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C3894bh.m32522c()) {
            return false;
        }
        try {
            Class<?> cls3 = f32918b;
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

    /* renamed from: r */
    public static Field m50270r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static long m50271s(Field field) {
        C6387e eVar;
        if (field == null || (eVar = f32921e) == null) {
            return -1;
        }
        return eVar.mo46966m(field);
    }

    /* renamed from: t */
    public static boolean m50272t(Object obj, long j) {
        return f32921e.mo46949d(obj, j);
    }

    /* renamed from: u */
    public static boolean m50273u(Object obj, long j) {
        if (m50277y(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m50274v(Object obj, long j) {
        if (m50278z(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static byte m50275w(long j) {
        return f32921e.mo46950e(j);
    }

    /* renamed from: x */
    public static byte m50276x(byte[] bArr, long j) {
        return f32921e.mo46951f(bArr, f32924h + j);
    }

    /* renamed from: y */
    public static byte m50277y(Object obj, long j) {
        return (byte) ((m50230C(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: z */
    public static byte m50278z(Object obj, long j) {
        return (byte) ((m50230C(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }
}
