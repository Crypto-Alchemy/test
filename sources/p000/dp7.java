package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dp7 */
public class dp7 {

    /* renamed from: dp7$a */
    public static class C6995a extends ObjectInputStream {

        /* renamed from: e */
        public static final Set f37365e;

        /* renamed from: a */
        public final Class f37366a;

        /* renamed from: d */
        public boolean f37367d = false;

        static {
            HashSet hashSet = new HashSet();
            f37365e = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public C6995a(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.f37366a = cls;
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (!this.f37367d) {
                if (objectStreamClass.getName().equals(this.f37366a.getName())) {
                    this.f37367d = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!f37365e.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* renamed from: a */
    public static long m56991a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | ((long) (bArr[i3] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public static int m56992b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static byte[] m56993c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: d */
    public static byte[][] m56994d(byte[][] bArr) {
        if (!m57001k(bArr)) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr3 = new byte[bArr[i].length];
                bArr2[i] = bArr3;
                byte[] bArr4 = bArr[i];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    /* renamed from: e */
    public static void m56995e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    /* renamed from: f */
    public static Object m56996f(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        C6995a aVar = new C6995a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    /* renamed from: g */
    public static byte[] m56997g(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    /* renamed from: h */
    public static int m56998h(ig1 ig1) {
        if (ig1 != null) {
            String d = ig1.mo50201d();
            if (d.equals("SHAKE128")) {
                return 32;
            }
            if (d.equals("SHAKE256")) {
                return 64;
            }
            return ig1.mo50202e();
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: i */
    public static int m56999i(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    /* renamed from: j */
    public static long m57000j(long j, int i) {
        return j >> i;
    }

    /* renamed from: k */
    public static boolean m57001k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m57002l(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    /* renamed from: m */
    public static boolean m57003m(long j, int i, int i2) {
        return j != 0 && (j + 1) % ((long) Math.pow((double) (1 << i), (double) i2)) == 0;
    }

    /* renamed from: n */
    public static boolean m57004n(long j, int i, int i2) {
        return j != 0 && j % ((long) Math.pow((double) (1 << i), (double) (i2 + 1))) == 0;
    }

    /* renamed from: o */
    public static int m57005o(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: p */
    public static byte[] m57006p(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: q */
    public static byte[] m57007q(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }
}
