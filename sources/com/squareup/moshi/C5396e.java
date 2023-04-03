package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;

/* renamed from: com.squareup.moshi.e */
/* compiled from: JsonUtf8Reader */
public final class C5396e extends JsonReader {

    /* renamed from: H */
    public static final ByteString f26713H = ByteString.encodeUtf8("'\\");

    /* renamed from: I */
    public static final ByteString f26714I = ByteString.encodeUtf8("\"\\");

    /* renamed from: L */
    public static final ByteString f26715L = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: M */
    public static final ByteString f26716M = ByteString.encodeUtf8("\n\r");

    /* renamed from: P */
    public static final ByteString f26717P = ByteString.encodeUtf8("*/");

    /* renamed from: A */
    public long f26718A;

    /* renamed from: B */
    public int f26719B;

    /* renamed from: C */
    public String f26720C;

    /* renamed from: s */
    public final w40 f26721s;

    /* renamed from: x */
    public final m40 f26722x;

    /* renamed from: y */
    public int f26723y = 0;

    public C5396e(w40 w40) {
        if (w40 != null) {
            this.f26721s = w40;
            this.f26722x = w40.mo56081r();
            mo39293x(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    public int mo39269A(JsonReader.C5372b bVar) throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return mo39375P(this.f26720C, bVar);
        }
        int J0 = this.f26721s.mo56026J0(bVar.f26671b);
        if (J0 != -1) {
            this.f26723y = 0;
            int[] iArr = this.f26665g;
            int i2 = this.f26662a - 1;
            iArr[i2] = iArr[i2] + 1;
            return J0;
        }
        String n = mo39289n();
        int P = mo39375P(n, bVar);
        if (P == -1) {
            this.f26723y = 11;
            this.f26720C = n;
            int[] iArr2 = this.f26665g;
            int i3 = this.f26662a - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return P;
    }

    /* renamed from: I */
    public void mo39272I() throws IOException {
        if (!this.f26667r) {
            int i = this.f26723y;
            if (i == 0) {
                i = mo39373N();
            }
            if (i == 14) {
                mo39387i0();
            } else if (i == 13) {
                mo39384e0(f26714I);
            } else if (i == 12) {
                mo39384e0(f26713H);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + mo39290q() + " at path " + getPath());
            }
            this.f26723y = 0;
            this.f26664e[this.f26662a - 1] = "null";
            return;
        }
        JsonReader.Token q = mo39290q();
        mo39287l();
        throw new JsonDataException("Cannot skip unexpected " + q + " at " + getPath());
    }

    /* renamed from: J */
    public void mo39273J() throws IOException {
        if (!this.f26667r) {
            int i = 0;
            do {
                int i2 = this.f26723y;
                if (i2 == 0) {
                    i2 = mo39373N();
                }
                if (i2 == 3) {
                    mo39293x(1);
                } else if (i2 == 1) {
                    mo39293x(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f26662a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo39290q() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f26662a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo39290q() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        mo39387i0();
                    } else if (i2 == 9 || i2 == 13) {
                        mo39384e0(f26714I);
                    } else if (i2 == 8 || i2 == 12) {
                        mo39384e0(f26713H);
                    } else if (i2 == 17) {
                        this.f26722x.skip((long) this.f26719B);
                    } else if (i2 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo39290q() + " at path " + getPath());
                    }
                    this.f26723y = 0;
                }
                i++;
                this.f26723y = 0;
            } while (i != 0);
            int[] iArr = this.f26665g;
            int i3 = this.f26662a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f26664e[i3 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + mo39290q() + " at " + getPath());
    }

    /* renamed from: L */
    public final void mo39372L() throws IOException {
        if (!this.f26666k) {
            throw mo39274K("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: N */
    public final int mo39373N() throws IOException {
        int[] iArr = this.f26663d;
        int i = this.f26662a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int S = mo39377S(true);
            this.f26722x.readByte();
            if (S != 44) {
                if (S == 59) {
                    mo39372L();
                } else if (S == 93) {
                    this.f26723y = 4;
                    return 4;
                } else {
                    throw mo39274K("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int S2 = mo39377S(true);
                this.f26722x.readByte();
                if (S2 != 44) {
                    if (S2 == 59) {
                        mo39372L();
                    } else if (S2 == 125) {
                        this.f26723y = 2;
                        return 2;
                    } else {
                        throw mo39274K("Unterminated object");
                    }
                }
            }
            int S3 = mo39377S(true);
            if (S3 == 34) {
                this.f26722x.readByte();
                this.f26723y = 13;
                return 13;
            } else if (S3 == 39) {
                this.f26722x.readByte();
                mo39372L();
                this.f26723y = 12;
                return 12;
            } else if (S3 != 125) {
                mo39372L();
                if (mo39376Q((char) S3)) {
                    this.f26723y = 14;
                    return 14;
                }
                throw mo39274K("Expected name");
            } else if (i2 != 5) {
                this.f26722x.readByte();
                this.f26723y = 2;
                return 2;
            } else {
                throw mo39274K("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int S4 = mo39377S(true);
            this.f26722x.readByte();
            if (S4 != 58) {
                if (S4 == 61) {
                    mo39372L();
                    if (this.f26721s.request(1) && this.f26722x.mo56066j(0) == 62) {
                        this.f26722x.readByte();
                    }
                } else {
                    throw mo39274K("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (mo39377S(false) == -1) {
                this.f26723y = 18;
                return 18;
            }
            mo39372L();
        } else if (i2 == 9) {
            throw null;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int S5 = mo39377S(true);
        if (S5 == 34) {
            this.f26722x.readByte();
            this.f26723y = 9;
            return 9;
        } else if (S5 != 39) {
            if (!(S5 == 44 || S5 == 59)) {
                if (S5 == 91) {
                    this.f26722x.readByte();
                    this.f26723y = 3;
                    return 3;
                } else if (S5 != 93) {
                    if (S5 != 123) {
                        int Y = mo39380Y();
                        if (Y != 0) {
                            return Y;
                        }
                        int b0 = mo39381b0();
                        if (b0 != 0) {
                            return b0;
                        }
                        if (mo39376Q(this.f26722x.mo56066j(0))) {
                            mo39372L();
                            this.f26723y = 10;
                            return 10;
                        }
                        throw mo39274K("Expected value");
                    }
                    this.f26722x.readByte();
                    this.f26723y = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f26722x.readByte();
                    this.f26723y = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo39372L();
                this.f26723y = 7;
                return 7;
            }
            throw mo39274K("Unexpected value");
        } else {
            mo39372L();
            this.f26722x.readByte();
            this.f26723y = 8;
            return 8;
        }
    }

    /* renamed from: O */
    public final int mo39374O(String str, JsonReader.C5372b bVar) {
        int length = bVar.f26670a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f26670a[i])) {
                this.f26723y = 0;
                this.f26664e[this.f26662a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public final int mo39375P(String str, JsonReader.C5372b bVar) {
        int length = bVar.f26670a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f26670a[i])) {
                this.f26723y = 0;
                int[] iArr = this.f26665g;
                int i2 = this.f26662a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public final boolean mo39376Q(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo39372L();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f26722x.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f26721s.request(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        mo39372L();
        r3 = r6.f26722x.mo56066j(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f26722x.readByte();
        r6.f26722x.readByte();
        mo39386h0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f26722x.readByte();
        r6.f26722x.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (mo39385g0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo39274K("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        mo39372L();
        mo39386h0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39377S(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            w40 r2 = r6.f26721s
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L_0x0082
            m40 r2 = r6.f26722x
            long r4 = (long) r1
            byte r1 = r2.mo56066j(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            m40 r2 = r6.f26722x
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            w40 r3 = r6.f26721s
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.mo39372L()
            m40 r3 = r6.f26722x
            r4 = 1
            byte r3 = r3.mo56066j(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            m40 r1 = r6.f26722x
            r1.readByte()
            m40 r1 = r6.f26722x
            r1.readByte()
            r6.mo39386h0()
            goto L_0x0001
        L_0x005c:
            m40 r1 = r6.f26722x
            r1.readByte()
            m40 r1 = r6.f26722x
            r1.readByte()
            boolean r1 = r6.mo39385g0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.mo39274K(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.mo39372L()
            r6.mo39386h0()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C5396e.mo39377S(boolean):int");
    }

    /* renamed from: W */
    public final String mo39378W(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long T = this.f26721s.mo56037T(byteString);
            if (T == -1) {
                throw mo39274K("Unterminated string");
            } else if (this.f26722x.mo56066j(T) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f26722x.mo56023I(T));
                this.f26722x.readByte();
                sb.append(mo39382c0());
            } else if (sb == null) {
                String I = this.f26722x.mo56023I(T);
                this.f26722x.readByte();
                return I;
            } else {
                sb.append(this.f26722x.mo56023I(T));
                this.f26722x.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: X */
    public final String mo39379X() throws IOException {
        long T = this.f26721s.mo56037T(f26715L);
        if (T != -1) {
            return this.f26722x.mo56023I(T);
        }
        return this.f26722x.mo56048b1();
    }

    /* renamed from: Y */
    public final int mo39380Y() throws IOException {
        String str;
        String str2;
        int i;
        byte j = this.f26722x.mo56066j(0);
        if (j == 116 || j == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (j == 102 || j == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (j != 110 && j != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f26721s.request((long) i3)) {
                return 0;
            }
            byte j2 = this.f26722x.mo56066j((long) i2);
            if (j2 != str2.charAt(i2) && j2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f26721s.request((long) (length + 1)) && mo39376Q(this.f26722x.mo56066j((long) length))) {
            return 0;
        }
        this.f26722x.skip((long) length);
        this.f26723y = i;
        return i;
    }

    /* renamed from: a */
    public void mo39275a() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 3) {
            mo39293x(1);
            this.f26665g[this.f26662a - 1] = 0;
            this.f26723y = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo39290q() + " at path " + getPath());
    }

    /* renamed from: b */
    public void mo39276b() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 1) {
            mo39293x(3);
            this.f26723y = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo39290q() + " at path " + getPath());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39381b0() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r3 = 1
            r4 = 0
            r8 = r1
            r7 = r3
            r5 = r4
            r6 = r5
            r10 = r6
        L_0x000b:
            w40 r11 = r0.f26721s
            int r12 = r5 + 1
            long r13 = (long) r12
            boolean r11 = r11.request(r13)
            r15 = 2
            if (r11 != 0) goto L_0x0019
            goto L_0x0084
        L_0x0019:
            m40 r11 = r0.f26722x
            long r13 = (long) r5
            byte r11 = r11.mo56066j(r13)
            r13 = 43
            r14 = 5
            if (r11 == r13) goto L_0x00d3
            r13 = 69
            if (r11 == r13) goto L_0x00ca
            r13 = 101(0x65, float:1.42E-43)
            if (r11 == r13) goto L_0x00ca
            r13 = 45
            if (r11 == r13) goto L_0x00c0
            r13 = 46
            if (r11 == r13) goto L_0x00bb
            r13 = 48
            if (r11 < r13) goto L_0x007e
            r13 = 57
            if (r11 <= r13) goto L_0x003e
            goto L_0x007e
        L_0x003e:
            if (r6 == r3) goto L_0x0077
            if (r6 != 0) goto L_0x0043
            goto L_0x0077
        L_0x0043:
            if (r6 != r15) goto L_0x0067
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004a
            return r4
        L_0x004a:
            r13 = 10
            long r13 = r13 * r8
            int r11 = r11 + -48
            long r3 = (long) r11
            long r13 = r13 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0063
            if (r3 != 0) goto L_0x0061
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r3 = 0
            goto L_0x0064
        L_0x0063:
            r3 = 1
        L_0x0064:
            r7 = r7 & r3
            r8 = r13
            goto L_0x007c
        L_0x0067:
            r3 = 3
            if (r6 != r3) goto L_0x006e
            r4 = 0
            r6 = 4
            goto L_0x00d7
        L_0x006e:
            if (r6 == r14) goto L_0x0073
            r3 = 6
            if (r6 != r3) goto L_0x007c
        L_0x0073:
            r4 = 0
            r6 = 7
            goto L_0x00d7
        L_0x0077:
            int r11 = r11 + -48
            int r3 = -r11
            long r8 = (long) r3
            r6 = r15
        L_0x007c:
            r4 = 0
            goto L_0x00d7
        L_0x007e:
            boolean r3 = r0.mo39376Q(r11)
            if (r3 != 0) goto L_0x00b9
        L_0x0084:
            if (r6 != r15) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            r3 = -9223372036854775808
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0090
            if (r10 == 0) goto L_0x00a7
        L_0x0090:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0096
            if (r10 != 0) goto L_0x00a7
        L_0x0096:
            if (r10 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            long r8 = -r8
        L_0x009a:
            r0.f26718A = r8
            m40 r1 = r0.f26722x
            long r2 = (long) r5
            r1.skip(r2)
            r1 = 16
            r0.f26723y = r1
            return r1
        L_0x00a7:
            if (r6 == r15) goto L_0x00b2
            r1 = 4
            if (r6 == r1) goto L_0x00b2
            r1 = 7
            if (r6 != r1) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r4 = 0
            return r4
        L_0x00b2:
            r0.f26719B = r5
            r1 = 17
            r0.f26723y = r1
            return r1
        L_0x00b9:
            r4 = 0
            return r4
        L_0x00bb:
            r3 = 3
            if (r6 != r15) goto L_0x00bf
            goto L_0x00d6
        L_0x00bf:
            return r4
        L_0x00c0:
            r3 = 6
            if (r6 != 0) goto L_0x00c6
            r6 = 1
            r10 = 1
            goto L_0x00d7
        L_0x00c6:
            if (r6 != r14) goto L_0x00c9
            goto L_0x00d6
        L_0x00c9:
            return r4
        L_0x00ca:
            if (r6 == r15) goto L_0x00d1
            r3 = 4
            if (r6 != r3) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            return r4
        L_0x00d1:
            r6 = r14
            goto L_0x00d7
        L_0x00d3:
            r3 = 6
            if (r6 != r14) goto L_0x00db
        L_0x00d6:
            r6 = r3
        L_0x00d7:
            r5 = r12
            r3 = 1
            goto L_0x000b
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C5396e.mo39381b0():int");
    }

    /* renamed from: c */
    public void mo39277c() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 4) {
            int i2 = this.f26662a - 1;
            this.f26662a = i2;
            int[] iArr = this.f26665g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f26723y = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + mo39290q() + " at path " + getPath());
    }

    /* renamed from: c0 */
    public final char mo39382c0() throws IOException {
        int i;
        int i2;
        if (this.f26721s.request(1)) {
            byte readByte = this.f26722x.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f26666k) {
                    return (char) readByte;
                }
                throw mo39274K("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f26721s.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte j = this.f26722x.mo56066j((long) i3);
                    char c2 = (char) (c << 4);
                    if (j < 48 || j > 57) {
                        if (j >= 97 && j <= 102) {
                            i = j - 97;
                        } else if (j < 65 || j > 70) {
                            throw mo39274K("\\u" + this.f26722x.mo56023I(4));
                        } else {
                            i = j - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = j - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f26722x.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            throw mo39274K("Unterminated escape sequence");
        }
    }

    public void close() throws IOException {
        this.f26723y = 0;
        this.f26663d[0] = 8;
        this.f26662a = 1;
        this.f26722x.mo56045a();
        this.f26721s.close();
    }

    /* renamed from: d */
    public void mo39278d() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 2) {
            int i2 = this.f26662a - 1;
            this.f26662a = i2;
            this.f26664e[i2] = null;
            int[] iArr = this.f26665g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f26723y = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + mo39290q() + " at path " + getPath());
    }

    /* renamed from: e0 */
    public final void mo39384e0(ByteString byteString) throws IOException {
        while (true) {
            long T = this.f26721s.mo56037T(byteString);
            if (T == -1) {
                throw mo39274K("Unterminated string");
            } else if (this.f26722x.mo56066j(T) == 92) {
                this.f26722x.skip(T + 1);
                mo39382c0();
            } else {
                this.f26722x.skip(T + 1);
                return;
            }
        }
    }

    /* renamed from: f */
    public boolean mo39280f() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    public final boolean mo39385g0() throws IOException {
        boolean z;
        long j;
        w40 w40 = this.f26721s;
        ByteString byteString = f26717P;
        long M = w40.mo56030M(byteString);
        if (M != -1) {
            z = true;
        } else {
            z = false;
        }
        m40 m40 = this.f26722x;
        if (z) {
            j = M + ((long) byteString.size());
        } else {
            j = m40.size();
        }
        m40.skip(j);
        return z;
    }

    /* renamed from: h */
    public boolean mo39283h() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 5) {
            this.f26723y = 0;
            int[] iArr = this.f26665g;
            int i2 = this.f26662a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f26723y = 0;
            int[] iArr2 = this.f26665g;
            int i3 = this.f26662a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + mo39290q() + " at path " + getPath());
        }
    }

    /* renamed from: h0 */
    public final void mo39386h0() throws IOException {
        long j;
        long T = this.f26721s.mo56037T(f26716M);
        m40 m40 = this.f26722x;
        if (T != -1) {
            j = T + 1;
        } else {
            j = m40.size();
        }
        m40.skip(j);
    }

    /* renamed from: i */
    public double mo39284i() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 16) {
            this.f26723y = 0;
            int[] iArr = this.f26665g;
            int i2 = this.f26662a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f26718A;
        }
        if (i == 17) {
            this.f26720C = this.f26722x.mo56023I((long) this.f26719B);
        } else if (i == 9) {
            this.f26720C = mo39378W(f26714I);
        } else if (i == 8) {
            this.f26720C = mo39378W(f26713H);
        } else if (i == 10) {
            this.f26720C = mo39379X();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + mo39290q() + " at path " + getPath());
        }
        this.f26723y = 11;
        try {
            double parseDouble = Double.parseDouble(this.f26720C);
            if (this.f26666k || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f26720C = null;
                this.f26723y = 0;
                int[] iArr2 = this.f26665g;
                int i3 = this.f26662a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f26720C + " at path " + getPath());
        }
    }

    /* renamed from: i0 */
    public final void mo39387i0() throws IOException {
        long T = this.f26721s.mo56037T(f26715L);
        m40 m40 = this.f26722x;
        if (T == -1) {
            T = m40.size();
        }
        m40.skip(T);
    }

    /* renamed from: j */
    public int mo39285j() throws IOException {
        String str;
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 16) {
            long j = this.f26718A;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f26723y = 0;
                int[] iArr = this.f26665g;
                int i3 = this.f26662a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f26718A + " at path " + getPath());
        }
        if (i == 17) {
            this.f26720C = this.f26722x.mo56023I((long) this.f26719B);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo39378W(f26714I);
            } else {
                str = mo39378W(f26713H);
            }
            this.f26720C = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f26723y = 0;
                int[] iArr2 = this.f26665g;
                int i4 = this.f26662a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + mo39290q() + " at path " + getPath());
        }
        this.f26723y = 11;
        try {
            double parseDouble = Double.parseDouble(this.f26720C);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f26720C = null;
                this.f26723y = 0;
                int[] iArr3 = this.f26665g;
                int i6 = this.f26662a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f26720C + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f26720C + " at path " + getPath());
        }
    }

    /* renamed from: k */
    public long mo39286k() throws IOException {
        String str;
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 16) {
            this.f26723y = 0;
            int[] iArr = this.f26665g;
            int i2 = this.f26662a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f26718A;
        }
        if (i == 17) {
            this.f26720C = this.f26722x.mo56023I((long) this.f26719B);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo39378W(f26714I);
            } else {
                str = mo39378W(f26713H);
            }
            this.f26720C = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f26723y = 0;
                int[] iArr2 = this.f26665g;
                int i3 = this.f26662a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected a long but was " + mo39290q() + " at path " + getPath());
        }
        this.f26723y = 11;
        try {
            long longValueExact = new BigDecimal(this.f26720C).longValueExact();
            this.f26720C = null;
            this.f26723y = 0;
            int[] iArr3 = this.f26665g;
            int i4 = this.f26662a - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f26720C + " at path " + getPath());
        }
    }

    /* renamed from: l */
    public String mo39287l() throws IOException {
        String str;
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 14) {
            str = mo39379X();
        } else if (i == 13) {
            str = mo39378W(f26714I);
        } else if (i == 12) {
            str = mo39378W(f26713H);
        } else if (i == 15) {
            str = this.f26720C;
            this.f26720C = null;
        } else {
            throw new JsonDataException("Expected a name but was " + mo39290q() + " at path " + getPath());
        }
        this.f26723y = 0;
        this.f26664e[this.f26662a - 1] = str;
        return str;
    }

    /* renamed from: m */
    public <T> T mo39288m() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 7) {
            this.f26723y = 0;
            int[] iArr = this.f26665g;
            int i2 = this.f26662a - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo39290q() + " at path " + getPath());
    }

    /* renamed from: n */
    public String mo39289n() throws IOException {
        String str;
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i == 10) {
            str = mo39379X();
        } else if (i == 9) {
            str = mo39378W(f26714I);
        } else if (i == 8) {
            str = mo39378W(f26713H);
        } else if (i == 11) {
            str = this.f26720C;
            this.f26720C = null;
        } else if (i == 16) {
            str = Long.toString(this.f26718A);
        } else if (i == 17) {
            str = this.f26722x.mo56023I((long) this.f26719B);
        } else {
            throw new JsonDataException("Expected a string but was " + mo39290q() + " at path " + getPath());
        }
        this.f26723y = 0;
        int[] iArr = this.f26665g;
        int i2 = this.f26662a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: q */
    public JsonReader.Token mo39290q() throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: s */
    public JsonReader mo39291s() {
        return new C5396e(this);
    }

    public String toString() {
        return "JsonReader(" + this.f26721s + ")";
    }

    /* renamed from: v */
    public void mo39292v() throws IOException {
        if (mo39280f()) {
            this.f26720C = mo39287l();
            this.f26723y = 11;
        }
    }

    /* renamed from: z */
    public int mo39295z(JsonReader.C5372b bVar) throws IOException {
        int i = this.f26723y;
        if (i == 0) {
            i = mo39373N();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo39374O(this.f26720C, bVar);
        }
        int J0 = this.f26721s.mo56026J0(bVar.f26671b);
        if (J0 != -1) {
            this.f26723y = 0;
            this.f26664e[this.f26662a - 1] = bVar.f26670a[J0];
            return J0;
        }
        String str = this.f26664e[this.f26662a - 1];
        String l = mo39287l();
        int O = mo39374O(l, bVar);
        if (O == -1) {
            this.f26723y = 15;
            this.f26720C = l;
            this.f26664e[this.f26662a - 1] = str;
        }
        return O;
    }

    public C5396e(C5396e eVar) {
        super(eVar);
        w40 peek = eVar.f26721s.peek();
        this.f26721s = peek;
        this.f26722x = peek.mo56081r();
        this.f26723y = eVar.f26723y;
        this.f26718A = eVar.f26718A;
        this.f26719B = eVar.f26719B;
        this.f26720C = eVar.f26720C;
        try {
            peek.mo56094u0(eVar.f26722x.size());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
