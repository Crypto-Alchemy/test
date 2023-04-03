package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import org.web3j.abi.datatypes.Address;
import sun.misc.Unsafe;

/* renamed from: qp8 */
public final class qp8 {

    /* renamed from: a */
    public static final Logger f33215a = Logger.getLogger(qp8.class.getName());

    /* renamed from: b */
    public static final Unsafe f33216b;

    /* renamed from: c */
    public static final Class<?> f33217c = n98.m48706c();

    /* renamed from: d */
    public static final boolean f33218d;

    /* renamed from: e */
    public static final boolean f33219e;

    /* renamed from: f */
    public static final C6423d f33220f;

    /* renamed from: g */
    public static final boolean f33221g = m50729B();

    /* renamed from: h */
    public static final boolean f33222h = m50728A();

    /* renamed from: i */
    public static final long f33223i = ((long) m50732E(byte[].class));

    /* renamed from: j */
    public static final long f33224j;

    /* renamed from: k */
    public static final long f33225k;

    /* renamed from: l */
    public static final long f33226l;

    /* renamed from: m */
    public static final long f33227m;

    /* renamed from: n */
    public static final long f33228n;

    /* renamed from: o */
    public static final long f33229o;

    /* renamed from: p */
    public static final long f33230p;

    /* renamed from: q */
    public static final long f33231q;

    /* renamed from: r */
    public static final long f33232r;

    /* renamed from: s */
    public static final long f33233s;

    /* renamed from: t */
    public static final long f33234t;

    /* renamed from: u */
    public static final long f33235u;

    /* renamed from: v */
    public static final long f33236v = m50762n(m50730C());

    /* renamed from: w */
    public static final long f33237w;

    /* renamed from: x */
    public static final boolean f33238x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: qp8$a */
    public static final class C6420a extends C6423d {
        public C6420a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo47226b(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: c */
        public final void mo47227c(Object obj, long j, double d) {
            mo47238f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo47228d(Object obj, long j, float f) {
            mo47237e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo47229g(Object obj, long j, boolean z) {
            if (qp8.f33238x) {
                qp8.m50766r(obj, j, z);
            } else {
                qp8.m50768t(obj, j, z);
            }
        }

        /* renamed from: h */
        public final void mo47230h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        /* renamed from: i */
        public final void mo47231i(Object obj, long j, byte b) {
            if (qp8.f33238x) {
                qp8.m50752d(obj, j, b);
            } else {
                qp8.m50765q(obj, j, b);
            }
        }

        /* renamed from: l */
        public final boolean mo47232l(Object obj, long j) {
            return qp8.f33238x ? qp8.m50743P(obj, j) : qp8.m50744Q(obj, j);
        }

        /* renamed from: m */
        public final float mo47233m(Object obj, long j) {
            return Float.intBitsToFloat(mo47239j(obj, j));
        }

        /* renamed from: n */
        public final double mo47234n(Object obj, long j) {
            return Double.longBitsToDouble(mo47240k(obj, j));
        }

        /* renamed from: o */
        public final byte mo47235o(Object obj, long j) {
            return qp8.f33238x ? qp8.m50741N(obj, j) : qp8.m50742O(obj, j);
        }
    }

    /* renamed from: qp8$b */
    public static final class C6421b extends C6423d {
        public C6421b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo47226b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: c */
        public final void mo47227c(Object obj, long j, double d) {
            mo47238f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo47228d(Object obj, long j, float f) {
            mo47237e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo47229g(Object obj, long j, boolean z) {
            if (qp8.f33238x) {
                qp8.m50766r(obj, j, z);
            } else {
                qp8.m50768t(obj, j, z);
            }
        }

        /* renamed from: h */
        public final void mo47230h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        /* renamed from: i */
        public final void mo47231i(Object obj, long j, byte b) {
            if (qp8.f33238x) {
                qp8.m50752d(obj, j, b);
            } else {
                qp8.m50765q(obj, j, b);
            }
        }

        /* renamed from: l */
        public final boolean mo47232l(Object obj, long j) {
            return qp8.f33238x ? qp8.m50743P(obj, j) : qp8.m50744Q(obj, j);
        }

        /* renamed from: m */
        public final float mo47233m(Object obj, long j) {
            return Float.intBitsToFloat(mo47239j(obj, j));
        }

        /* renamed from: n */
        public final double mo47234n(Object obj, long j) {
            return Double.longBitsToDouble(mo47240k(obj, j));
        }

        /* renamed from: o */
        public final byte mo47235o(Object obj, long j) {
            return qp8.f33238x ? qp8.m50741N(obj, j) : qp8.m50742O(obj, j);
        }
    }

    /* renamed from: qp8$c */
    public static final class C6422c extends C6423d {
        public C6422c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo47226b(long j, byte b) {
            this.f33239a.putByte(j, b);
        }

        /* renamed from: c */
        public final void mo47227c(Object obj, long j, double d) {
            this.f33239a.putDouble(obj, j, d);
        }

        /* renamed from: d */
        public final void mo47228d(Object obj, long j, float f) {
            this.f33239a.putFloat(obj, j, f);
        }

        /* renamed from: g */
        public final void mo47229g(Object obj, long j, boolean z) {
            this.f33239a.putBoolean(obj, j, z);
        }

        /* renamed from: h */
        public final void mo47230h(byte[] bArr, long j, long j2, long j3) {
            this.f33239a.copyMemory(bArr, qp8.f33223i + j, (Object) null, j2, j3);
        }

        /* renamed from: i */
        public final void mo47231i(Object obj, long j, byte b) {
            this.f33239a.putByte(obj, j, b);
        }

        /* renamed from: l */
        public final boolean mo47232l(Object obj, long j) {
            return this.f33239a.getBoolean(obj, j);
        }

        /* renamed from: m */
        public final float mo47233m(Object obj, long j) {
            return this.f33239a.getFloat(obj, j);
        }

        /* renamed from: n */
        public final double mo47234n(Object obj, long j) {
            return this.f33239a.getDouble(obj, j);
        }

        /* renamed from: o */
        public final byte mo47235o(Object obj, long j) {
            return this.f33239a.getByte(obj, j);
        }
    }

    /* renamed from: qp8$d */
    public static abstract class C6423d {

        /* renamed from: a */
        public Unsafe f33239a;

        public C6423d(Unsafe unsafe) {
            this.f33239a = unsafe;
        }

        /* renamed from: a */
        public final long mo47236a(Field field) {
            return this.f33239a.objectFieldOffset(field);
        }

        /* renamed from: b */
        public abstract void mo47226b(long j, byte b);

        /* renamed from: c */
        public abstract void mo47227c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo47228d(Object obj, long j, float f);

        /* renamed from: e */
        public final void mo47237e(Object obj, long j, int i) {
            this.f33239a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void mo47238f(Object obj, long j, long j2) {
            this.f33239a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo47229g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract void mo47230h(byte[] bArr, long j, long j2, long j3);

        /* renamed from: i */
        public abstract void mo47231i(Object obj, long j, byte b);

        /* renamed from: j */
        public final int mo47239j(Object obj, long j) {
            return this.f33239a.getInt(obj, j);
        }

        /* renamed from: k */
        public final long mo47240k(Object obj, long j) {
            return this.f33239a.getLong(obj, j);
        }

        /* renamed from: l */
        public abstract boolean mo47232l(Object obj, long j);

        /* renamed from: m */
        public abstract float mo47233m(Object obj, long j);

        /* renamed from: n */
        public abstract double mo47234n(Object obj, long j);

        /* renamed from: o */
        public abstract byte mo47235o(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<qp8> r6 = p000.qp8.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f33215a = r6
            sun.misc.Unsafe r6 = m50774z()
            f33216b = r6
            java.lang.Class r7 = p000.n98.m48706c()
            f33217c = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = m50734G(r7)
            f33218d = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = m50734G(r8)
            f33219e = r8
            r9 = 0
            if (r6 != 0) goto L_0x0039
        L_0x0037:
            r7 = r9
            goto L_0x0054
        L_0x0039:
            boolean r10 = p000.n98.m48705b()
            if (r10 == 0) goto L_0x004f
            if (r7 == 0) goto L_0x0047
            qp8$b r7 = new qp8$b
            r7.<init>(r6)
            goto L_0x0054
        L_0x0047:
            if (r8 == 0) goto L_0x0037
            qp8$a r7 = new qp8$a
            r7.<init>(r6)
            goto L_0x0054
        L_0x004f:
            qp8$c r7 = new qp8$c
            r7.<init>(r6)
        L_0x0054:
            f33220f = r7
            boolean r6 = m50729B()
            f33221g = r6
            boolean r6 = m50728A()
            f33222h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m50732E(r6)
            long r6 = (long) r6
            f33223i = r6
            int r6 = m50732E(r5)
            long r6 = (long) r6
            f33224j = r6
            int r5 = m50733F(r5)
            long r5 = (long) r5
            f33225k = r5
            int r5 = m50732E(r4)
            long r5 = (long) r5
            f33226l = r5
            int r4 = m50733F(r4)
            long r4 = (long) r4
            f33227m = r4
            int r4 = m50732E(r3)
            long r4 = (long) r4
            f33228n = r4
            int r3 = m50733F(r3)
            long r3 = (long) r3
            f33229o = r3
            int r3 = m50732E(r2)
            long r3 = (long) r3
            f33230p = r3
            int r2 = m50733F(r2)
            long r2 = (long) r2
            f33231q = r2
            int r2 = m50732E(r1)
            long r2 = (long) r2
            f33232r = r2
            int r1 = m50733F(r1)
            long r1 = (long) r1
            f33233s = r1
            int r1 = m50732E(r0)
            long r1 = (long) r1
            f33234t = r1
            int r0 = m50733F(r0)
            long r0 = (long) r0
            f33235u = r0
            java.lang.reflect.Field r0 = m50730C()
            long r0 = m50762n(r0)
            f33236v = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = m50764p(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00dc
            r9 = r0
        L_0x00dc:
            long r0 = m50762n(r9)
            f33237w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            f33238x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qp8.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m50728A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f33216b;
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
            if (n98.m48705b()) {
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
            Logger logger = f33215a;
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
    public static boolean m50729B() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f33216b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m50730C() == null) {
                return false;
            }
            if (n98.m48705b()) {
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
            Logger logger = f33215a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: C */
    public static Field m50730C() {
        Field p;
        if (n98.m48705b() && (p = m50764p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m50764p(Buffer.class, Address.TYPE_NAME);
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: E */
    public static int m50732E(Class<?> cls) {
        if (f33222h) {
            return f33220f.f33239a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: F */
    public static int m50733F(Class<?> cls) {
        if (f33222h) {
            return f33220f.f33239a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: G */
    public static boolean m50734G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!n98.m48705b()) {
            return false;
        }
        try {
            Class<?> cls3 = f33217c;
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

    /* renamed from: H */
    public static int m50735H(Object obj, long j) {
        return f33220f.mo47239j(obj, j);
    }

    /* renamed from: I */
    public static long m50736I(Object obj, long j) {
        return f33220f.mo47240k(obj, j);
    }

    /* renamed from: J */
    public static boolean m50737J(Object obj, long j) {
        return f33220f.mo47232l(obj, j);
    }

    /* renamed from: K */
    public static float m50738K(Object obj, long j) {
        return f33220f.mo47233m(obj, j);
    }

    /* renamed from: L */
    public static double m50739L(Object obj, long j) {
        return f33220f.mo47234n(obj, j);
    }

    /* renamed from: M */
    public static Object m50740M(Object obj, long j) {
        return f33220f.f33239a.getObject(obj, j);
    }

    /* renamed from: N */
    public static byte m50741N(Object obj, long j) {
        return (byte) (m50735H(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: O */
    public static byte m50742O(Object obj, long j) {
        return (byte) (m50735H(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: P */
    public static boolean m50743P(Object obj, long j) {
        return m50741N(obj, j) != 0;
    }

    /* renamed from: Q */
    public static boolean m50744Q(Object obj, long j) {
        return m50742O(obj, j) != 0;
    }

    /* renamed from: a */
    public static byte m50749a(byte[] bArr, long j) {
        return f33220f.mo47235o(bArr, f33223i + j);
    }

    /* renamed from: b */
    public static long m50750b(Field field) {
        return f33220f.mo47236a(field);
    }

    /* renamed from: c */
    public static void m50751c(long j, byte b) {
        f33220f.mo47226b(j, b);
    }

    /* renamed from: d */
    public static void m50752d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int H = m50735H(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m50755g(obj, j2, ((255 & b) << i) | (H & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m50753e(Object obj, long j, double d) {
        f33220f.mo47227c(obj, j, d);
    }

    /* renamed from: f */
    public static void m50754f(Object obj, long j, float f) {
        f33220f.mo47228d(obj, j, f);
    }

    /* renamed from: g */
    public static void m50755g(Object obj, long j, int i) {
        f33220f.mo47237e(obj, j, i);
    }

    /* renamed from: h */
    public static void m50756h(Object obj, long j, long j2) {
        f33220f.mo47238f(obj, j, j2);
    }

    /* renamed from: i */
    public static void m50757i(Object obj, long j, Object obj2) {
        f33220f.f33239a.putObject(obj, j, obj2);
    }

    /* renamed from: j */
    public static void m50758j(Object obj, long j, boolean z) {
        f33220f.mo47229g(obj, j, z);
    }

    /* renamed from: k */
    public static void m50759k(byte[] bArr, long j, byte b) {
        f33220f.mo47231i(bArr, f33223i + j, b);
    }

    /* renamed from: l */
    public static void m50760l(byte[] bArr, long j, long j2, long j3) {
        f33220f.mo47230h(bArr, j, j2, j3);
    }

    /* renamed from: n */
    public static long m50762n(Field field) {
        C6423d dVar;
        if (field == null || (dVar = f33220f) == null) {
            return -1;
        }
        return dVar.mo47236a(field);
    }

    /* renamed from: o */
    public static long m50763o(ByteBuffer byteBuffer) {
        return f33220f.mo47240k(byteBuffer, f33236v);
    }

    /* renamed from: p */
    public static Field m50764p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m50765q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m50755g(obj, j2, ((255 & b) << i) | (m50735H(obj, j2) & (~(255 << i))));
    }

    /* renamed from: r */
    public static void m50766r(Object obj, long j, boolean z) {
        m50752d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: t */
    public static void m50768t(Object obj, long j, boolean z) {
        m50765q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: x */
    public static boolean m50772x() {
        return f33222h;
    }

    /* renamed from: y */
    public static boolean m50773y() {
        return f33221g;
    }

    /* renamed from: z */
    public static Unsafe m50774z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new xp8());
        } catch (Throwable unused) {
            return null;
        }
    }
}
