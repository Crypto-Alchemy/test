package p000;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: j4 */
public class C7243j4 extends FilterInputStream {

    /* renamed from: a */
    public final int f38588a;

    /* renamed from: d */
    public final boolean f38589d;

    /* renamed from: e */
    public final byte[][] f38590e;

    public C7243j4(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public C7243j4(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public C7243j4(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.f38588a = i;
        this.f38589d = z;
        this.f38590e = bArr;
    }

    public C7243j4(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    public C7243j4(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    /* renamed from: d */
    public static C9326t4 m59243d(int i, db1 db1, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return C9663z3.m74736H(m59245f(db1, bArr));
            case 2:
                return C7333k4.m59686H(db1.mo51167e());
            case 3:
                return C9584x3.m73850H(db1.mo51167e());
            case 4:
                return C9203q4.m71174H(db1.mo51167e());
            case 5:
                return C7820l4.m63689H(db1.mo51167e());
            case 6:
                return C9156p4.m70909J(m59245f(db1, bArr), true);
            case 7:
                return C9013o4.m70136H(db1.mo51167e());
            case 10:
                return C6961d4.m56734H(m59245f(db1, bArr), true);
            case 12:
                return C7018e5.m57179H(db1.mo51167e());
            case 13:
                return C9436v4.m73054H(db1.mo51167e(), false);
            case 18:
                return C7859m4.m64068H(db1.mo51167e());
            case 19:
                return C9385u4.m72584H(db1.mo51167e());
            case 20:
                return C9665z4.m74745H(db1.mo51167e());
            case 21:
                return C7245j5.m59258H(db1.mo51167e());
            case 22:
                return C7205i4.m58846H(db1.mo51167e());
            case 23:
                return C6963d5.m56740H(db1.mo51167e());
            case 24:
                return C7117g4.m58041H(db1.mo51167e());
            case 25:
                return C7159h4.m58466H(db1.mo51167e());
            case 26:
                return C7336k5.m59712H(db1.mo51167e());
            case 27:
                return C7065f4.m57587H(db1.mo51167e());
            case 28:
                return C7067f5.m57604H(db1.mo51167e());
            case 30:
                return C9478w3.m73416J(m59244e(db1));
            default:
                throw new IOException("unknown tag " + i + " encountered");
        }
    }

    /* renamed from: e */
    public static char[] m59244e(db1 db1) throws IOException {
        int i;
        int c = db1.mo51165c();
        if ((c & 1) == 0) {
            int i2 = c / 2;
            char[] cArr = new char[i2];
            byte[] bArr = new byte[8];
            int i3 = 0;
            int i4 = 0;
            while (c >= 8) {
                if (ya6.m74323d(db1, bArr, 0, 8) == 8) {
                    cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i4 += 4;
                    c -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (c > 0) {
                if (ya6.m74323d(db1, bArr, 0, c) == c) {
                    while (true) {
                        int i5 = i3 + 1;
                        int i6 = i5 + 1;
                        i = i4 + 1;
                        cArr[i4] = (char) ((bArr[i3] << 8) | (bArr[i5] & 255));
                        if (i6 >= c) {
                            break;
                        }
                        i3 = i6;
                        i4 = i;
                    }
                    i4 = i;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (db1.mo51165c() == 0 && i2 == i4) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    /* renamed from: f */
    public static byte[] m59245f(db1 db1, byte[][] bArr) throws IOException {
        int c = db1.mo51165c();
        if (c >= bArr.length) {
            return db1.mo51167e();
        }
        byte[] bArr2 = bArr[c];
        if (bArr2 == null) {
            bArr2 = new byte[c];
            bArr[c] = bArr2;
        }
        db1.mo51166d(bArr2);
        return bArr2;
    }

    /* renamed from: h */
    public static int m59246h(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (255 != read) {
            int i2 = read & 127;
            int i3 = 0;
            int i4 = 0;
            do {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                } else if ((i3 >>> 23) == 0) {
                    i3 = (i3 << 8) + read2;
                    i4++;
                } else {
                    throw new IOException("long form definite-length more than 31 bits");
                }
            } while (i4 < i2);
            if (i3 < i || z) {
                return i3;
            }
            throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
        } else {
            throw new IOException("invalid long form definite-length 0xFF");
        }
    }

    /* renamed from: j */
    public static int m59247j(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        } else if ((read & 127) != 0) {
            while ((read & 128) != 0) {
                if ((i3 >>> 24) == 0) {
                    i3 = (i3 | (read & 127)) << 7;
                    read = inputStream.read();
                    if (read < 0) {
                        throw new EOFException("EOF found inside tag value.");
                    }
                } else {
                    throw new IOException("Tag number more than 31 bits");
                }
            }
            return i3 | (read & 127);
        } else {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
    }

    /* renamed from: a */
    public C9584x3 mo52616a(C6923c4 c4Var) throws IOException {
        int f = c4Var.mo50809f();
        C9584x3[] x3VarArr = new C9584x3[f];
        int i = 0;
        while (i != f) {
            C6843b4 d = c4Var.mo50807d(i);
            if (d instanceof C9584x3) {
                x3VarArr[i] = (C9584x3) d;
                i++;
            } else {
                throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + d.getClass());
            }
        }
        return new C7194hw(x3VarArr);
    }

    /* renamed from: b */
    public C9203q4 mo52617b(C6923c4 c4Var) throws IOException {
        int f = c4Var.mo50809f();
        C9203q4[] q4VarArr = new C9203q4[f];
        int i = 0;
        while (i != f) {
            C6843b4 d = c4Var.mo50807d(i);
            if (d instanceof C9203q4) {
                q4VarArr[i] = (C9203q4) d;
                i++;
            } else {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + d.getClass());
            }
        }
        return new C7808kw(q4VarArr);
    }

    /* renamed from: c */
    public C9326t4 mo52618c(int i, int i2, int i3) throws IOException {
        db1 db1 = new db1(this, i3, this.f38588a);
        if ((i & 224) == 0) {
            return m59243d(i2, db1, this.f38590e);
        }
        int i4 = i & 192;
        boolean z = true;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                z = false;
            }
            return mo52621k(i4, i2, z, db1);
        } else if (i2 == 3) {
            return mo52616a(mo52623m(db1));
        } else {
            if (i2 == 4) {
                return mo52617b(mo52623m(db1));
            }
            if (i2 == 8) {
                return r01.m71419a(mo52623m(db1)).mo50763Q();
            }
            if (i2 == 16) {
                return db1.mo51165c() < 1 ? r01.f44269a : this.f38589d ? new jf3(db1.mo51167e()) : r01.m71419a(mo52623m(db1));
            }
            if (i2 == 17) {
                return r01.m71420b(mo52623m(db1));
            }
            throw new IOException("unknown tag " + i2 + " encountered");
        }
    }

    /* renamed from: g */
    public int mo52619g() throws IOException {
        return m59246h(this, this.f38588a, false);
    }

    /* renamed from: i */
    public C9326t4 mo52620i() throws IOException {
        int read = read();
        if (read > 0) {
            int j = m59247j(this, read);
            int g = mo52619g();
            if (g >= 0) {
                try {
                    return mo52618c(read, j, g);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            } else if ((read & 32) != 0) {
                C9626y4 y4Var = new C9626y4(new qt2(this, this.f38588a), this.f38588a, this.f38590e);
                int i = read & 192;
                if (i != 0) {
                    return y4Var.mo67029c(i, j);
                }
                if (j == 3) {
                    return C7227iw.m59122a(y4Var);
                }
                if (j == 4) {
                    return C7850lw.m64019a(y4Var);
                }
                if (j == 8) {
                    return rz0.m71719a(y4Var);
                }
                if (j == 16) {
                    return C9007nw.m70095a(y4Var);
                }
                if (j == 17) {
                    return C9196pw.m71119a(y4Var);
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    /* renamed from: k */
    public C9326t4 mo52621k(int i, int i2, boolean z, db1 db1) throws IOException {
        return !z ? C6848b5.m55749M(i, i2, db1.mo51167e()) : C6848b5.m55747J(i, i2, mo52623m(db1));
    }

    /* renamed from: l */
    public C6923c4 mo52622l() throws IOException {
        C9326t4 i = mo52620i();
        if (i == null) {
            return new C6923c4(0);
        }
        C6923c4 c4Var = new C6923c4();
        do {
            c4Var.mo50805a(i);
            i = mo52620i();
        } while (i != null);
        return c4Var;
    }

    /* renamed from: m */
    public C6923c4 mo52623m(db1 db1) throws IOException {
        int c = db1.mo51165c();
        return c < 1 ? new C6923c4(0) : new C7243j4(db1, c, this.f38589d, this.f38590e).mo52622l();
    }
}
