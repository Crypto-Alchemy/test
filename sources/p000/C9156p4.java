package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: p4 */
public class C9156p4 extends C9326t4 {

    /* renamed from: e */
    public static final C7119g5 f43980e = new C9157a(C9156p4.class, 6);

    /* renamed from: g */
    public static final ConcurrentMap<C9158b, C9156p4> f43981g = new ConcurrentHashMap();

    /* renamed from: a */
    public final String f43982a;

    /* renamed from: d */
    public byte[] f43983d;

    /* renamed from: p4$a */
    public static class C9157a extends C7119g5 {
        public C9157a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9156p4.m70909J(yz0.mo65418M(), false);
        }
    }

    /* renamed from: p4$b */
    public static class C9158b {

        /* renamed from: a */
        public final int f43984a;

        /* renamed from: b */
        public final byte[] f43985b;

        public C9158b(byte[] bArr) {
            this.f43984a = C9367tq.m72437u(bArr);
            this.f43985b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9158b) {
                return C9367tq.m72417a(this.f43985b, ((C9158b) obj).f43985b);
            }
            return false;
        }

        public int hashCode() {
            return this.f43984a;
        }
    }

    public C9156p4(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        } else if (m70911R(str)) {
            this.f43982a = str;
        } else {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
    }

    public C9156p4(C9156p4 p4Var, String str) {
        if (C9436v4.m73055N(str, 0)) {
            this.f43982a = p4Var.mo65220N() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }

    public C9156p4(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f43982a = stringBuffer.toString();
        this.f43983d = z ? C9367tq.m72422f(bArr) : bArr2;
    }

    /* renamed from: J */
    public static C9156p4 m70909J(byte[] bArr, boolean z) {
        C9156p4 p4Var = f43981g.get(new C9158b(bArr));
        return p4Var == null ? new C9156p4(bArr, z) : p4Var;
    }

    /* renamed from: O */
    public static C9156p4 m70910O(Object obj) {
        if (obj == null || (obj instanceof C9156p4)) {
            return (C9156p4) obj;
        }
        if (obj instanceof C6843b4) {
            C9326t4 n = ((C6843b4) obj).mo50158n();
            if (n instanceof C9156p4) {
                return (C9156p4) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C9156p4) f43980e.mo51868b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: R */
    public static boolean m70911R(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return C9436v4.m73055N(str, 2);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, mo65219M().length);
    }

    /* renamed from: H */
    public C9156p4 mo65217H(String str) {
        return new C9156p4(this, str);
    }

    /* renamed from: L */
    public final void mo65218L(ByteArrayOutputStream byteArrayOutputStream) {
        qc4 qc4 = new qc4(this.f43982a);
        int parseInt = Integer.parseInt(qc4.mo65440b()) * 40;
        String b = qc4.mo65440b();
        if (b.length() <= 18) {
            C9436v4.m73056O(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(b));
        } else {
            C9436v4.m73057Q(byteArrayOutputStream, new BigInteger(b).add(BigInteger.valueOf((long) parseInt)));
        }
        while (qc4.mo65439a()) {
            String b2 = qc4.mo65440b();
            if (b2.length() <= 18) {
                C9436v4.m73056O(byteArrayOutputStream, Long.parseLong(b2));
            } else {
                C9436v4.m73057Q(byteArrayOutputStream, new BigInteger(b2));
            }
        }
    }

    /* renamed from: M */
    public final synchronized byte[] mo65219M() {
        if (this.f43983d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo65218L(byteArrayOutputStream);
            this.f43983d = byteArrayOutputStream.toByteArray();
        }
        return this.f43983d;
    }

    /* renamed from: N */
    public String mo65220N() {
        return this.f43982a;
    }

    /* renamed from: Q */
    public C9156p4 mo65221Q() {
        C9158b bVar = new C9158b(mo65219M());
        ConcurrentMap<C9158b, C9156p4> concurrentMap = f43981g;
        C9156p4 p4Var = concurrentMap.get(bVar);
        if (p4Var != null) {
            return p4Var;
        }
        C9156p4 putIfAbsent = concurrentMap.putIfAbsent(bVar, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    /* renamed from: S */
    public boolean mo65222S(C9156p4 p4Var) {
        String N = mo65220N();
        String N2 = p4Var.mo65220N();
        return N.length() > N2.length() && N.charAt(N2.length()) == '.' && N.startsWith(N2);
    }

    public int hashCode() {
        return this.f43982a.hashCode();
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (t4Var == this) {
            return true;
        }
        if (!(t4Var instanceof C9156p4)) {
            return false;
        }
        return this.f43982a.equals(((C9156p4) t4Var).f43982a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 6, mo65219M());
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo65220N();
    }
}
