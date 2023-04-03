package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* renamed from: r7 */
/* compiled from: Ac3Util */
public final class C3182r7 {

    /* renamed from: a */
    public static final int[] f17137a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f17138b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f17139c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f17140d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f17141e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, 576, 640};

    /* renamed from: f */
    public static final int[] f17142f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: r7$b */
    /* compiled from: Ac3Util */
    public static final class C3184b {

        /* renamed from: a */
        public final String f17143a;

        /* renamed from: b */
        public final int f17144b;

        /* renamed from: c */
        public final int f17145c;

        /* renamed from: d */
        public final int f17146d;

        /* renamed from: e */
        public final int f17147e;

        /* renamed from: f */
        public final int f17148f;

        public C3184b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f17143a = str;
            this.f17144b = i;
            this.f17146d = i2;
            this.f17145c = i3;
            this.f17147e = i4;
            this.f17148f = i5;
        }
    }

    /* renamed from: a */
    public static int m26079a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((w67.m29306G(byteBuffer, i + 4) & -2) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m26080b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f17138b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f17142f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f17141e[i3];
        if (i4 == 32000) {
            return i5 * 6;
        }
        return i5 * 4;
    }

    /* renamed from: c */
    public static C0792h m26081c(gm4 gm4, String str, String str2, DrmInitData drmInitData) {
        int i = f17138b[(gm4.mo20662D() & 192) >> 6];
        int D = gm4.mo20662D();
        int i2 = f17140d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i2++;
        }
        return new C0792h.C0794b().mo6658S(str).mo6670e0("audio/ac3").mo6647H(i2).mo6671f0(i).mo6652M(drmInitData).mo6661V(str2).mo6644E();
    }

    /* renamed from: d */
    public static int m26082d(ByteBuffer byteBuffer) {
        boolean z;
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f17137a[i] * 256;
    }

    /* renamed from: e */
    public static C3184b m26083e(fm4 fm4) {
        boolean z;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        String str3;
        int i10;
        int i11;
        fm4 fm42 = fm4;
        int e = fm4.mo20001e();
        fm42.mo20014r(40);
        if (fm42.mo20004h(5) > 10) {
            z = true;
        } else {
            z = false;
        }
        fm42.mo20012p(e);
        int i12 = -1;
        if (z) {
            fm42.mo20014r(16);
            int h = fm42.mo20004h(2);
            if (h == 0) {
                i12 = 0;
            } else if (h == 1) {
                i12 = 1;
            } else if (h == 2) {
                i12 = 2;
            }
            fm42.mo20014r(3);
            i4 = (fm42.mo20004h(11) + 1) * 2;
            int h2 = fm42.mo20004h(2);
            if (h2 == 3) {
                i3 = f17139c[fm42.mo20004h(2)];
                i7 = 6;
                i8 = 3;
            } else {
                i8 = fm42.mo20004h(2);
                i7 = f17137a[i8];
                i3 = f17138b[h2];
            }
            i5 = i7 * 256;
            int h3 = fm42.mo20004h(3);
            boolean g = fm4.mo20003g();
            i2 = f17140d[h3] + (g ? 1 : 0);
            fm42.mo20014r(10);
            if (fm4.mo20003g()) {
                fm42.mo20014r(8);
            }
            if (h3 == 0) {
                fm42.mo20014r(5);
                if (fm4.mo20003g()) {
                    fm42.mo20014r(8);
                }
            }
            if (i12 == 1 && fm4.mo20003g()) {
                fm42.mo20014r(16);
            }
            if (fm4.mo20003g()) {
                if (h3 > 2) {
                    fm42.mo20014r(2);
                }
                if ((h3 & 1) == 0 || h3 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    fm42.mo20014r(6);
                }
                if ((h3 & 4) != 0) {
                    fm42.mo20014r(i10);
                }
                if (g && fm4.mo20003g()) {
                    fm42.mo20014r(5);
                }
                if (i12 == 0) {
                    if (fm4.mo20003g()) {
                        i11 = 6;
                        fm42.mo20014r(6);
                    } else {
                        i11 = 6;
                    }
                    if (h3 == 0 && fm4.mo20003g()) {
                        fm42.mo20014r(i11);
                    }
                    if (fm4.mo20003g()) {
                        fm42.mo20014r(i11);
                    }
                    int h4 = fm42.mo20004h(2);
                    if (h4 == 1) {
                        fm42.mo20014r(5);
                    } else if (h4 == 2) {
                        fm42.mo20014r(12);
                    } else if (h4 == 3) {
                        int h5 = fm42.mo20004h(5);
                        if (fm4.mo20003g()) {
                            fm42.mo20014r(5);
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(4);
                            }
                            if (fm4.mo20003g()) {
                                if (fm4.mo20003g()) {
                                    fm42.mo20014r(4);
                                }
                                if (fm4.mo20003g()) {
                                    fm42.mo20014r(4);
                                }
                            }
                        }
                        if (fm4.mo20003g()) {
                            fm42.mo20014r(5);
                            if (fm4.mo20003g()) {
                                fm42.mo20014r(7);
                                if (fm4.mo20003g()) {
                                    fm42.mo20014r(8);
                                }
                            }
                        }
                        fm42.mo20014r((h5 + 2) * 8);
                        fm4.mo19999c();
                    }
                    if (h3 < 2) {
                        if (fm4.mo20003g()) {
                            fm42.mo20014r(14);
                        }
                        if (h3 == 0 && fm4.mo20003g()) {
                            fm42.mo20014r(14);
                        }
                    }
                    if (fm4.mo20003g()) {
                        if (i8 == 0) {
                            fm42.mo20014r(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (fm4.mo20003g()) {
                                    fm42.mo20014r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (fm4.mo20003g()) {
                fm42.mo20014r(5);
                if (h3 == 2) {
                    fm42.mo20014r(4);
                }
                if (h3 >= 6) {
                    fm42.mo20014r(2);
                }
                if (fm4.mo20003g()) {
                    fm42.mo20014r(8);
                }
                if (h3 == 0 && fm4.mo20003g()) {
                    fm42.mo20014r(8);
                }
                if (h2 < 3) {
                    fm4.mo20013q();
                }
            }
            if (i12 == 0 && i8 != 3) {
                fm4.mo20013q();
            }
            if (i12 != 2 || (i8 != 3 && !fm4.mo20003g())) {
                i9 = 6;
            } else {
                i9 = 6;
                fm42.mo20014r(6);
            }
            if (fm4.mo20003g() && fm42.mo20004h(i9) == 1 && fm42.mo20004h(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str = str3;
            i = i12;
        } else {
            fm42.mo20014r(32);
            int h6 = fm42.mo20004h(2);
            if (h6 == 3) {
                str2 = null;
            } else {
                str2 = "audio/ac3";
            }
            i4 = m26080b(h6, fm42.mo20004h(6));
            fm42.mo20014r(8);
            int h7 = fm42.mo20004h(3);
            if (!((h7 & 1) == 0 || h7 == 1)) {
                fm42.mo20014r(2);
            }
            if ((h7 & 4) != 0) {
                fm42.mo20014r(2);
            }
            if (h7 == 2) {
                fm42.mo20014r(2);
            }
            int[] iArr = f17138b;
            if (h6 < iArr.length) {
                i6 = iArr[h6];
            } else {
                i6 = -1;
            }
            i5 = 1536;
            i2 = f17140d[h7] + (fm4.mo20003g() ? 1 : 0);
            i = -1;
            str = str2;
        }
        return new C3184b(str, i, i2, i3, i4, i5);
    }

    /* renamed from: f */
    public static int m26084f(byte[] bArr) {
        boolean z;
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m26080b((b & 192) >> 6, b & 63);
    }

    /* renamed from: g */
    public static C0792h m26085g(gm4 gm4, String str, String str2, DrmInitData drmInitData) {
        String str3;
        gm4.mo20675Q(2);
        int i = f17138b[(gm4.mo20662D() & 192) >> 6];
        int D = gm4.mo20662D();
        int i2 = f17140d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i2++;
        }
        if (((gm4.mo20662D() & 30) >> 1) > 0 && (2 & gm4.mo20662D()) != 0) {
            i2 += 2;
        }
        if (gm4.mo20676a() <= 0 || (gm4.mo20662D() & 1) == 0) {
            str3 = "audio/eac3";
        } else {
            str3 = "audio/eac3-joc";
        }
        return new C0792h.C0794b().mo6658S(str).mo6670e0(str3).mo6647H(i2).mo6671f0(i).mo6652M(drmInitData).mo6661V(str2).mo6644E();
    }

    /* renamed from: h */
    public static int m26086h(ByteBuffer byteBuffer, int i) {
        boolean z;
        int i2;
        if ((byteBuffer.get(byteBuffer.position() + i + 7) & 255) == 187) {
            z = true;
        } else {
            z = false;
        }
        int position = byteBuffer.position() + i;
        if (z) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        return 40 << ((byteBuffer.get(position + i2) >> 4) & 7);
    }

    /* renamed from: i */
    public static int m26087i(byte[] bArr) {
        char c;
        boolean z = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                if ((b & 255) == 187) {
                    z = true;
                }
                if (z) {
                    c = 9;
                } else {
                    c = 8;
                }
                return 40 << ((bArr[c] >> 4) & 7);
            }
        }
        return 0;
    }
}
