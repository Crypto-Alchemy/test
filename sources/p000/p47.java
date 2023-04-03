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

/* renamed from: p47 */
/* compiled from: UnsafeUtil */
public final class p47 {

    /* renamed from: a */
    public static final Unsafe f32552a = m49688H();

    /* renamed from: b */
    public static final Class<?> f32553b = C3815ah.m31840b();

    /* renamed from: c */
    public static final boolean f32554c = m49722q(Long.TYPE);

    /* renamed from: d */
    public static final boolean f32555d = m49722q(Integer.TYPE);

    /* renamed from: e */
    public static final C6339e f32556e = m49686F();

    /* renamed from: f */
    public static final boolean f32557f = m49705Y();

    /* renamed from: g */
    public static final boolean f32558g = m49704X();

    /* renamed from: h */
    public static final long f32559h;

    /* renamed from: i */
    public static final long f32560i;

    /* renamed from: j */
    public static final long f32561j;

    /* renamed from: k */
    public static final long f32562k;

    /* renamed from: l */
    public static final long f32563l;

    /* renamed from: m */
    public static final long f32564m;

    /* renamed from: n */
    public static final long f32565n;

    /* renamed from: o */
    public static final long f32566o;

    /* renamed from: p */
    public static final long f32567p;

    /* renamed from: q */
    public static final long f32568q;

    /* renamed from: r */
    public static final long f32569r;

    /* renamed from: s */
    public static final long f32570s;

    /* renamed from: t */
    public static final long f32571t;

    /* renamed from: u */
    public static final long f32572u = m49724s(m49720o());

    /* renamed from: v */
    public static final int f32573v;

    /* renamed from: w */
    public static final boolean f32574w;

    /* renamed from: p47$a */
    /* compiled from: UnsafeUtil */
    public static class C6335a implements PrivilegedExceptionAction<Unsafe> {
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

    /* renamed from: p47$b */
    /* compiled from: UnsafeUtil */
    public static final class C6336b extends C6339e {
        public C6336b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46629c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo46630d(Object obj, long j) {
            if (p47.f32574w) {
                return p47.m49726u(obj, j);
            }
            return p47.m49727v(obj, j);
        }

        /* renamed from: e */
        public byte mo46631e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo46632f(Object obj, long j) {
            if (p47.f32574w) {
                return p47.m49730y(obj, j);
            }
            return p47.m49731z(obj, j);
        }

        /* renamed from: g */
        public double mo46633g(Object obj, long j) {
            return Double.longBitsToDouble(mo46645k(obj, j));
        }

        /* renamed from: h */
        public float mo46634h(Object obj, long j) {
            return Float.intBitsToFloat(mo46644i(obj, j));
        }

        /* renamed from: j */
        public long mo46635j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo46636n(Object obj, long j, boolean z) {
            if (p47.f32574w) {
                p47.m49694N(obj, j, z);
            } else {
                p47.m49695O(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo46637o(Object obj, long j, byte b) {
            if (p47.f32574w) {
                p47.m49697Q(obj, j, b);
            } else {
                p47.m49698R(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo46638p(Object obj, long j, double d) {
            mo46649s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo46639q(Object obj, long j, float f) {
            mo46648r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo46640v() {
            return false;
        }
    }

    /* renamed from: p47$c */
    /* compiled from: UnsafeUtil */
    public static final class C6337c extends C6339e {
        public C6337c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46629c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo46630d(Object obj, long j) {
            if (p47.f32574w) {
                return p47.m49726u(obj, j);
            }
            return p47.m49727v(obj, j);
        }

        /* renamed from: e */
        public byte mo46631e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo46632f(Object obj, long j) {
            if (p47.f32574w) {
                return p47.m49730y(obj, j);
            }
            return p47.m49731z(obj, j);
        }

        /* renamed from: g */
        public double mo46633g(Object obj, long j) {
            return Double.longBitsToDouble(mo46645k(obj, j));
        }

        /* renamed from: h */
        public float mo46634h(Object obj, long j) {
            return Float.intBitsToFloat(mo46644i(obj, j));
        }

        /* renamed from: j */
        public long mo46635j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo46636n(Object obj, long j, boolean z) {
            if (p47.f32574w) {
                p47.m49694N(obj, j, z);
            } else {
                p47.m49695O(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo46637o(Object obj, long j, byte b) {
            if (p47.f32574w) {
                p47.m49697Q(obj, j, b);
            } else {
                p47.m49698R(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo46638p(Object obj, long j, double d) {
            mo46649s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo46639q(Object obj, long j, float f) {
            mo46648r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo46640v() {
            return false;
        }
    }

    /* renamed from: p47$d */
    /* compiled from: UnsafeUtil */
    public static final class C6338d extends C6339e {
        public C6338d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo46629c(long j, byte[] bArr, long j2, long j3) {
            this.f32575a.copyMemory((Object) null, j, bArr, p47.f32559h + j2, j3);
        }

        /* renamed from: d */
        public boolean mo46630d(Object obj, long j) {
            return this.f32575a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo46631e(long j) {
            return this.f32575a.getByte(j);
        }

        /* renamed from: f */
        public byte mo46632f(Object obj, long j) {
            return this.f32575a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo46633g(Object obj, long j) {
            return this.f32575a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo46634h(Object obj, long j) {
            return this.f32575a.getFloat(obj, j);
        }

        /* renamed from: j */
        public long mo46635j(long j) {
            return this.f32575a.getLong(j);
        }

        /* renamed from: n */
        public void mo46636n(Object obj, long j, boolean z) {
            this.f32575a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo46637o(Object obj, long j, byte b) {
            this.f32575a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo46638p(Object obj, long j, double d) {
            this.f32575a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo46639q(Object obj, long j, float f) {
            this.f32575a.putFloat(obj, j, f);
        }

        /* renamed from: u */
        public boolean mo46641u() {
            Class<Object> cls = Object.class;
            if (!super.mo46641u()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f32575a.getClass();
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
                p47.m49691K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo46640v() {
            Class<Object> cls = Object.class;
            if (!super.mo46640v()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f32575a.getClass();
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
                p47.m49691K(th);
                return false;
            }
        }
    }

    /* renamed from: p47$e */
    /* compiled from: UnsafeUtil */
    public static abstract class C6339e {

        /* renamed from: a */
        public Unsafe f32575a;

        public C6339e(Unsafe unsafe) {
            this.f32575a = unsafe;
        }

        /* renamed from: a */
        public final int mo46642a(Class<?> cls) {
            return this.f32575a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo46643b(Class<?> cls) {
            return this.f32575a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo46629c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo46630d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo46631e(long j);

        /* renamed from: f */
        public abstract byte mo46632f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo46633g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo46634h(Object obj, long j);

        /* renamed from: i */
        public final int mo46644i(Object obj, long j) {
            return this.f32575a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo46635j(long j);

        /* renamed from: k */
        public final long mo46645k(Object obj, long j) {
            return this.f32575a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo46646l(Object obj, long j) {
            return this.f32575a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo46647m(Field field) {
            return this.f32575a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo46636n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo46637o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo46638p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo46639q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo46648r(Object obj, long j, int i) {
            this.f32575a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo46649s(Object obj, long j, long j2) {
            this.f32575a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo46650t(Object obj, long j, Object obj2) {
            this.f32575a.putObject(obj, j, obj2);
        }

        /* renamed from: u */
        public boolean mo46641u() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f32575a;
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
                p47.m49691K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo46640v() {
            Unsafe unsafe = this.f32575a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (p47.m49720o() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                p47.m49691K(th);
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
        long m = (long) m49718m(byte[].class);
        f32559h = m;
        f32560i = (long) m49718m(cls6);
        f32561j = (long) m49719n(cls6);
        f32562k = (long) m49718m(cls5);
        f32563l = (long) m49719n(cls5);
        f32564m = (long) m49718m(cls4);
        f32565n = (long) m49719n(cls4);
        f32566o = (long) m49718m(cls3);
        f32567p = (long) m49719n(cls3);
        f32568q = (long) m49718m(cls2);
        f32569r = (long) m49719n(cls2);
        f32570s = (long) m49718m(cls);
        f32571t = (long) m49719n(cls);
        f32573v = (int) (7 & m);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f32574w = z;
    }

    /* renamed from: A */
    public static double m49681A(Object obj, long j) {
        return f32556e.mo46633g(obj, j);
    }

    /* renamed from: B */
    public static float m49682B(Object obj, long j) {
        return f32556e.mo46634h(obj, j);
    }

    /* renamed from: C */
    public static int m49683C(Object obj, long j) {
        return f32556e.mo46644i(obj, j);
    }

    /* renamed from: D */
    public static long m49684D(long j) {
        return f32556e.mo46635j(j);
    }

    /* renamed from: E */
    public static long m49685E(Object obj, long j) {
        return f32556e.mo46645k(obj, j);
    }

    /* renamed from: F */
    public static C6339e m49686F() {
        Unsafe unsafe = f32552a;
        if (unsafe == null) {
            return null;
        }
        if (!C3815ah.m31841c()) {
            return new C6338d(unsafe);
        }
        if (f32554c) {
            return new C6337c(unsafe);
        }
        if (f32555d) {
            return new C6336b(unsafe);
        }
        return null;
    }

    /* renamed from: G */
    public static Object m49687G(Object obj, long j) {
        return f32556e.mo46646l(obj, j);
    }

    /* renamed from: H */
    public static Unsafe m49688H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6335a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static boolean m49689I() {
        return f32558g;
    }

    /* renamed from: J */
    public static boolean m49690J() {
        return f32557f;
    }

    /* renamed from: K */
    public static void m49691K(Throwable th) {
        Logger logger = Logger.getLogger(p47.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: L */
    public static long m49692L(Field field) {
        return f32556e.mo46647m(field);
    }

    /* renamed from: M */
    public static void m49693M(Object obj, long j, boolean z) {
        f32556e.mo46636n(obj, j, z);
    }

    /* renamed from: N */
    public static void m49694N(Object obj, long j, boolean z) {
        m49697Q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: O */
    public static void m49695O(Object obj, long j, boolean z) {
        m49698R(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: P */
    public static void m49696P(byte[] bArr, long j, byte b) {
        f32556e.mo46637o(bArr, f32559h + j, b);
    }

    /* renamed from: Q */
    public static void m49697Q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int C = m49683C(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m49701U(obj, j2, ((255 & b) << i) | (C & (~(255 << i))));
    }

    /* renamed from: R */
    public static void m49698R(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m49701U(obj, j2, ((255 & b) << i) | (m49683C(obj, j2) & (~(255 << i))));
    }

    /* renamed from: S */
    public static void m49699S(Object obj, long j, double d) {
        f32556e.mo46638p(obj, j, d);
    }

    /* renamed from: T */
    public static void m49700T(Object obj, long j, float f) {
        f32556e.mo46639q(obj, j, f);
    }

    /* renamed from: U */
    public static void m49701U(Object obj, long j, int i) {
        f32556e.mo46648r(obj, j, i);
    }

    /* renamed from: V */
    public static void m49702V(Object obj, long j, long j2) {
        f32556e.mo46649s(obj, j, j2);
    }

    /* renamed from: W */
    public static void m49703W(Object obj, long j, Object obj2) {
        f32556e.mo46650t(obj, j, obj2);
    }

    /* renamed from: X */
    public static boolean m49704X() {
        C6339e eVar = f32556e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo46641u();
    }

    /* renamed from: Y */
    public static boolean m49705Y() {
        C6339e eVar = f32556e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo46640v();
    }

    /* renamed from: k */
    public static long m49716k(ByteBuffer byteBuffer) {
        return f32556e.mo46645k(byteBuffer, f32572u);
    }

    /* renamed from: l */
    public static <T> T m49717l(Class<T> cls) {
        try {
            return f32552a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    public static int m49718m(Class<?> cls) {
        if (f32558g) {
            return f32556e.mo46642a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m49719n(Class<?> cls) {
        if (f32558g) {
            return f32556e.mo46643b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m49720o() {
        Field r;
        if (C3815ah.m31841c() && (r = m49723r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r;
        }
        Field r2 = m49723r(Buffer.class, Address.TYPE_NAME);
        if (r2 == null || r2.getType() != Long.TYPE) {
            return null;
        }
        return r2;
    }

    /* renamed from: p */
    public static void m49721p(long j, byte[] bArr, long j2, long j3) {
        f32556e.mo46629c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    public static boolean m49722q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C3815ah.m31841c()) {
            return false;
        }
        try {
            Class<?> cls3 = f32553b;
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
    public static Field m49723r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static long m49724s(Field field) {
        C6339e eVar;
        if (field == null || (eVar = f32556e) == null) {
            return -1;
        }
        return eVar.mo46647m(field);
    }

    /* renamed from: t */
    public static boolean m49725t(Object obj, long j) {
        return f32556e.mo46630d(obj, j);
    }

    /* renamed from: u */
    public static boolean m49726u(Object obj, long j) {
        if (m49730y(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m49727v(Object obj, long j) {
        if (m49731z(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static byte m49728w(long j) {
        return f32556e.mo46631e(j);
    }

    /* renamed from: x */
    public static byte m49729x(byte[] bArr, long j) {
        return f32556e.mo46632f(bArr, f32559h + j);
    }

    /* renamed from: y */
    public static byte m49730y(Object obj, long j) {
        return (byte) ((m49683C(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: z */
    public static byte m49731z(Object obj, long j) {
        return (byte) ((m49683C(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }
}
