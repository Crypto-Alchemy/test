package p000;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: z60 */
/* compiled from: ByteSourceJsonBootstrapper */
public final class z60 {

    /* renamed from: a */
    public final po2 f20458a;

    /* renamed from: b */
    public final InputStream f20459b;

    /* renamed from: c */
    public final byte[] f20460c;

    /* renamed from: d */
    public int f20461d;

    /* renamed from: e */
    public int f20462e;

    /* renamed from: f */
    public final boolean f20463f;

    /* renamed from: g */
    public boolean f20464g = true;

    /* renamed from: h */
    public int f20465h;

    public z60(po2 po2, InputStream inputStream) {
        this.f20458a = po2;
        this.f20459b = inputStream;
        this.f20460c = po2.mo24737g();
        this.f20461d = 0;
        this.f20462e = 0;
        this.f20463f = true;
    }

    /* renamed from: h */
    public static MatchStrength m30974h(su2 su2) throws IOException {
        if (!su2.mo25964a()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte e = su2.mo25965e();
        if (e == -17) {
            if (!su2.mo25964a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (su2.mo25965e() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!su2.mo25964a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (su2.mo25965e() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!su2.mo25964a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            e = su2.mo25965e();
        }
        int k = m30976k(su2, e);
        if (k < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (k == 123) {
            int j = m30975j(su2);
            if (j < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (j == 34 || j == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        } else if (k == 91) {
            int j2 = m30975j(su2);
            if (j2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (j2 == 93 || j2 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (k == 34) {
                return matchStrength;
            }
            if (k <= 57 && k >= 48) {
                return matchStrength;
            }
            if (k == 45) {
                int j3 = m30975j(su2);
                if (j3 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                if (j3 > 57 || j3 < 48) {
                    return MatchStrength.NO_MATCH;
                }
                return matchStrength;
            } else if (k == 110) {
                return m30978m(su2, "ull", matchStrength);
            } else {
                if (k == 116) {
                    return m30978m(su2, "rue", matchStrength);
                }
                if (k == 102) {
                    return m30978m(su2, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
    }

    /* renamed from: j */
    public static int m30975j(su2 su2) throws IOException {
        if (!su2.mo25964a()) {
            return -1;
        }
        return m30976k(su2, su2.mo25965e());
    }

    /* renamed from: k */
    public static int m30976k(su2 su2, byte b) throws IOException {
        while (true) {
            byte b2 = b & 255;
            if (b2 != 32 && b2 != 13 && b2 != 10 && b2 != 9) {
                return b2;
            }
            if (!su2.mo25964a()) {
                return -1;
            }
            b = su2.mo25965e();
        }
    }

    /* renamed from: l */
    public static int m30977l(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 == 187) {
            int readUnsignedByte3 = dataInput.readUnsignedByte();
            if (readUnsignedByte3 == 191) {
                return dataInput.readUnsignedByte();
            }
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
    }

    /* renamed from: m */
    public static MatchStrength m30978m(su2 su2, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!su2.mo25964a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (su2.mo25965e() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    /* renamed from: a */
    public final boolean mo28317a(int i) {
        if ((65280 & i) == 0) {
            this.f20464g = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f20464g = false;
        }
        this.f20465h = 2;
        return true;
    }

    /* renamed from: b */
    public final boolean mo28318b(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.f20464g = true;
        } else if ((16777215 & i) == 0) {
            this.f20464g = false;
        } else if ((-16711681 & i) == 0) {
            mo28324i("3412");
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            mo28324i("2143");
        }
        this.f20465h = 4;
        return true;
    }

    /* renamed from: c */
    public JsonParser mo28319c(int i, xe4 xe4, y60 y60, yd0 yd0, int i2) throws IOException {
        int i3 = i2;
        int i4 = this.f20461d;
        JsonEncoding e = mo28321e();
        int i5 = this.f20461d - i4;
        if (e != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new q75(this.f20458a, i, mo28320d(), xe4, yd0.mo28025n(i2));
        }
        return new f37(this.f20458a, i, this.f20459b, xe4, y60.mo27933A(i3), this.f20460c, this.f20461d, this.f20462e, i5, this.f20463f);
    }

    /* renamed from: d */
    public Reader mo28320d() throws IOException {
        JsonEncoding m = this.f20458a.mo24743m();
        int bits = m.bits();
        if (bits == 8 || bits == 16) {
            InputStream inputStream = this.f20459b;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(this.f20460c, this.f20461d, this.f20462e);
            } else if (this.f20461d < this.f20462e) {
                inputStream = new hu3(this.f20458a, inputStream, this.f20460c, this.f20461d, this.f20462e);
            }
            return new InputStreamReader(inputStream, m.getJavaName());
        } else if (bits == 32) {
            po2 po2 = this.f20458a;
            return new b37(po2, this.f20459b, this.f20460c, this.f20461d, this.f20462e, po2.mo24743m().isBigEndian());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (mo28317a((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (mo28317a(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonEncoding mo28321e() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.mo28322f(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8.f20460c
            int r5 = r8.f20461d
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.mo28323g(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.mo28318b(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.mo28317a(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.mo28322f(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8.f20460c
            int r5 = r8.f20461d
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.mo28317a(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 != 0) goto L_0x0064
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L_0x008a
        L_0x0064:
            int r1 = r8.f20465h
            if (r1 == r3) goto L_0x0088
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8.f20464g
            if (r0 == 0) goto L_0x0073
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L_0x008a
        L_0x0073:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L_0x008a
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8.f20464g
            if (r0 == 0) goto L_0x0085
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L_0x008a
        L_0x0085:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L_0x008a
        L_0x0088:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L_0x008a:
            po2 r1 = r8.f20458a
            r1.mo24751u(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z60.mo28321e():com.fasterxml.jackson.core.JsonEncoding");
    }

    /* renamed from: f */
    public boolean mo28322f(int i) throws IOException {
        int i2;
        int i3 = this.f20462e - this.f20461d;
        while (i3 < i) {
            InputStream inputStream = this.f20459b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f20460c;
                int i4 = this.f20462e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f20462e += i2;
            i3 += i2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo28323g(int i) throws IOException {
        if (i == -16842752) {
            mo28324i("3412");
        } else if (i == -131072) {
            this.f20461d += 4;
            this.f20465h = 4;
            this.f20464g = false;
            return true;
        } else if (i == 65279) {
            this.f20464g = true;
            this.f20461d += 4;
            this.f20465h = 4;
            return true;
        } else if (i == 65534) {
            mo28324i("2143");
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.f20461d += 2;
            this.f20465h = 2;
            this.f20464g = true;
            return true;
        } else if (i2 == 65534) {
            this.f20461d += 2;
            this.f20465h = 2;
            this.f20464g = false;
            return true;
        } else if ((i >>> 8) != 15711167) {
            return false;
        } else {
            this.f20461d += 3;
            this.f20465h = 1;
            this.f20464g = true;
            return true;
        }
    }

    /* renamed from: i */
    public final void mo28324i(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public z60(po2 po2, byte[] bArr, int i, int i2) {
        this.f20458a = po2;
        this.f20459b = null;
        this.f20460c = bArr;
        this.f20461d = i;
        this.f20462e = i + i2;
        this.f20463f = false;
    }
}
