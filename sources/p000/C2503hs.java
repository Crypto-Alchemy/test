package p000;

import android.util.Pair;
import androidx.media3.common.C0787e;
import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C2420gs;

/* renamed from: hs */
/* compiled from: AtomParsers */
public final class C2503hs {

    /* renamed from: a */
    public static final byte[] f13024a = w67.m29361j0("OpusHead");

    /* renamed from: hs$a */
    /* compiled from: AtomParsers */
    public static final class C2504a {

        /* renamed from: a */
        public final int f13025a;

        /* renamed from: b */
        public int f13026b;

        /* renamed from: c */
        public int f13027c;

        /* renamed from: d */
        public long f13028d;

        /* renamed from: e */
        public final boolean f13029e;

        /* renamed from: f */
        public final gm4 f13030f;

        /* renamed from: g */
        public final gm4 f13031g;

        /* renamed from: h */
        public int f13032h;

        /* renamed from: i */
        public int f13033i;

        public C2504a(gm4 gm4, gm4 gm42, boolean z) throws ParserException {
            this.f13031g = gm4;
            this.f13030f = gm42;
            this.f13029e = z;
            gm42.mo20674P(12);
            this.f13025a = gm42.mo20666H();
            gm4.mo20674P(12);
            this.f13033i = gm4.mo20666H();
            ky1.m21099a(gm4.mo20689n() != 1 ? false : true, "first_chunk must be 1");
            this.f13026b = -1;
        }

        /* renamed from: a */
        public boolean mo21365a() {
            long j;
            int i;
            int i2 = this.f13026b + 1;
            this.f13026b = i2;
            if (i2 == this.f13025a) {
                return false;
            }
            if (this.f13029e) {
                j = this.f13030f.mo20667I();
            } else {
                j = this.f13030f.mo20664F();
            }
            this.f13028d = j;
            if (this.f13026b == this.f13032h) {
                this.f13027c = this.f13031g.mo20666H();
                this.f13031g.mo20675Q(4);
                int i3 = this.f13033i - 1;
                this.f13033i = i3;
                if (i3 > 0) {
                    i = this.f13031g.mo20666H() - 1;
                } else {
                    i = -1;
                }
                this.f13032h = i;
            }
            return true;
        }
    }

    /* renamed from: hs$b */
    /* compiled from: AtomParsers */
    public static final class C2505b {

        /* renamed from: a */
        public final String f13034a;

        /* renamed from: b */
        public final byte[] f13035b;

        /* renamed from: c */
        public final long f13036c;

        /* renamed from: d */
        public final long f13037d;

        public C2505b(String str, byte[] bArr, long j, long j2) {
            this.f13034a = str;
            this.f13035b = bArr;
            this.f13036c = j;
            this.f13037d = j2;
        }
    }

    /* renamed from: hs$c */
    /* compiled from: AtomParsers */
    public interface C2506c {
        /* renamed from: a */
        int mo21366a();

        /* renamed from: b */
        int mo21367b();

        /* renamed from: c */
        int mo21368c();
    }

    /* renamed from: hs$d */
    /* compiled from: AtomParsers */
    public static final class C2507d {

        /* renamed from: a */
        public final rs6[] f13038a;

        /* renamed from: b */
        public C0792h f13039b;

        /* renamed from: c */
        public int f13040c;

        /* renamed from: d */
        public int f13041d = 0;

        public C2507d(int i) {
            this.f13038a = new rs6[i];
        }
    }

    /* renamed from: hs$e */
    /* compiled from: AtomParsers */
    public static final class C2508e implements C2506c {

        /* renamed from: a */
        public final int f13042a;

        /* renamed from: b */
        public final int f13043b;

        /* renamed from: c */
        public final gm4 f13044c;

        public C2508e(C2420gs.C2422b bVar, C0792h hVar) {
            gm4 gm4 = bVar.f12588b;
            this.f13044c = gm4;
            gm4.mo20674P(12);
            int H = gm4.mo20666H();
            if ("audio/raw".equals(hVar.f4175C)) {
                int a0 = w67.m29343a0(hVar.f4191e1, hVar.f4202v0);
                if (H == 0 || H % a0 != 0) {
                    gk3.m18132i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + a0 + ", stsz sample size: " + H);
                    H = a0;
                }
            }
            this.f13042a = H == 0 ? -1 : H;
            this.f13043b = gm4.mo20666H();
        }

        /* renamed from: a */
        public int mo21366a() {
            int i = this.f13042a;
            if (i == -1) {
                return this.f13044c.mo20666H();
            }
            return i;
        }

        /* renamed from: b */
        public int mo21367b() {
            return this.f13042a;
        }

        /* renamed from: c */
        public int mo21368c() {
            return this.f13043b;
        }
    }

    /* renamed from: hs$f */
    /* compiled from: AtomParsers */
    public static final class C2509f implements C2506c {

        /* renamed from: a */
        public final gm4 f13045a;

        /* renamed from: b */
        public final int f13046b;

        /* renamed from: c */
        public final int f13047c;

        /* renamed from: d */
        public int f13048d;

        /* renamed from: e */
        public int f13049e;

        public C2509f(C2420gs.C2422b bVar) {
            gm4 gm4 = bVar.f12588b;
            this.f13045a = gm4;
            gm4.mo20674P(12);
            this.f13047c = gm4.mo20666H() & 255;
            this.f13046b = gm4.mo20666H();
        }

        /* renamed from: a */
        public int mo21366a() {
            int i = this.f13047c;
            if (i == 8) {
                return this.f13045a.mo20662D();
            }
            if (i == 16) {
                return this.f13045a.mo20668J();
            }
            int i2 = this.f13048d;
            this.f13048d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f13049e & 15;
            }
            int D = this.f13045a.mo20662D();
            this.f13049e = D;
            return (D & 240) >> 4;
        }

        /* renamed from: b */
        public int mo21367b() {
            return -1;
        }

        /* renamed from: c */
        public int mo21368c() {
            return this.f13046b;
        }
    }

    /* renamed from: hs$g */
    /* compiled from: AtomParsers */
    public static final class C2510g {

        /* renamed from: a */
        public final int f13050a;

        /* renamed from: b */
        public final long f13051b;

        /* renamed from: c */
        public final int f13052c;

        public C2510g(int i, long j, int i2) {
            this.f13050a = i;
            this.f13051b = j;
            this.f13052c = i2;
        }
    }

    /* renamed from: A */
    public static List<at6> m19196A(C2420gs.C2421a aVar, we2 we2, long j, DrmInitData drmInitData, boolean z, boolean z2, hd2<qs6, qs6> hd2) throws ParserException {
        C2420gs.C2421a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar2.f12587d.size(); i++) {
            C2420gs.C2421a aVar3 = aVar2.f12587d.get(i);
            if (aVar3.f12584a != 1953653099) {
                we2 we22 = we2;
                hd2<qs6, qs6> hd22 = hd2;
            } else {
                qs6 apply = hd2.apply(m19225z(aVar3, (C2420gs.C2422b) C2725kr.m20985e(aVar.mo20826g(1836476516)), j, drmInitData, z, z2));
                if (apply == null) {
                    we2 we23 = we2;
                } else {
                    we2 we24 = we2;
                    arrayList.add(m19221v(apply, (C2420gs.C2421a) C2725kr.m20985e(((C2420gs.C2421a) C2725kr.m20985e(((C2420gs.C2421a) C2725kr.m20985e(aVar3.mo20825f(1835297121))).mo20825f(1835626086))).mo20825f(1937007212)), we2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static Pair<Metadata, Metadata> m19197B(C2420gs.C2422b bVar) {
        gm4 gm4 = bVar.f12588b;
        gm4.mo20674P(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (gm4.mo20676a() >= 8) {
            int e = gm4.mo20680e();
            int n = gm4.mo20689n();
            int n2 = gm4.mo20689n();
            if (n2 == 1835365473) {
                gm4.mo20674P(e);
                metadata = m19198C(gm4, e + n);
            } else if (n2 == 1936553057) {
                gm4.mo20674P(e);
                metadata2 = m19220u(gm4, e + n);
            }
            gm4.mo20674P(e + n);
        }
        return Pair.create(metadata, metadata2);
    }

    /* renamed from: C */
    public static Metadata m19198C(gm4 gm4, int i) {
        gm4.mo20675Q(8);
        m19204e(gm4);
        while (gm4.mo20680e() < i) {
            int e = gm4.mo20680e();
            int n = gm4.mo20689n();
            if (gm4.mo20689n() == 1768715124) {
                gm4.mo20674P(e);
                return m19211l(gm4, e + n);
            }
            gm4.mo20674P(e + n);
        }
        return null;
    }

    /* renamed from: D */
    public static void m19199D(gm4 gm4, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C2507d dVar, int i6) throws ParserException {
        String str;
        DrmInitData drmInitData2;
        byte[] bArr;
        boolean z;
        int i7;
        int i8;
        float f;
        byte[] bArr2;
        List<byte[]> list;
        boolean z2;
        boolean z3;
        boolean z4;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean z5;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        gm4 gm42 = gm4;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitData3 = drmInitData;
        C2507d dVar2 = dVar;
        gm42.mo20674P(i9 + 8 + 8);
        gm42.mo20675Q(16);
        int J = gm4.mo20668J();
        int J2 = gm4.mo20668J();
        gm42.mo20675Q(50);
        int e = gm4.mo20680e();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair<Integer, rs6> s = m19218s(gm42, i9, i10);
            if (s != null) {
                i11 = ((Integer) s.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.mo6519c(((rs6) s.second).f17362b);
                }
                dVar2.f13038a[i6] = (rs6) s.second;
            }
            gm42.mo20674P(e);
        }
        String str3 = "video/3gpp";
        if (i11 == 1831958048) {
            str = "video/mpeg";
        } else if (i11 == 1211250227) {
            str = str3;
        } else {
            str = null;
        }
        float f2 = 1.0f;
        byte[] bArr3 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        ByteBuffer byteBuffer3 = null;
        C2505b bVar = null;
        boolean z9 = false;
        while (true) {
            if (e - i9 >= i10) {
                drmInitData2 = drmInitData3;
                break;
            }
            gm42.mo20674P(e);
            int e2 = gm4.mo20680e();
            String str5 = str3;
            int n = gm4.mo20689n();
            if (n == 0) {
                drmInitData2 = drmInitData3;
                if (gm4.mo20680e() - i9 == i10) {
                    break;
                }
            } else {
                drmInitData2 = drmInitData3;
            }
            if (n > 0) {
                z = true;
            } else {
                z = false;
            }
            ky1.m21099a(z, "childAtomSize must be positive");
            int n2 = gm4.mo20689n();
            if (n2 == 1635148611) {
                if (str == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ky1.m21099a(z8, (String) null);
                gm42.mo20674P(e2 + 8);
                C3697yv b = C3697yv.m30841b(gm4);
                list2 = b.f20382a;
                dVar2.f13040c = b.f20383b;
                if (!z9) {
                    f2 = b.f20386e;
                }
                str4 = b.f20387f;
                str2 = "video/avc";
            } else if (n2 == 1752589123) {
                if (str == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ky1.m21099a(z7, (String) null);
                gm42.mo20674P(e2 + 8);
                xl2 a = xl2.m30169a(gm4);
                list2 = a.f19878a;
                dVar2.f13040c = a.f19879b;
                if (!z9) {
                    f2 = a.f19882e;
                }
                str4 = a.f19883f;
                str2 = "video/hevc";
            } else {
                if (n2 == 1685480259 || n2 == 1685485123) {
                    i7 = J2;
                    i8 = i11;
                    bArr2 = bArr3;
                    f = f2;
                    list = list2;
                    ki1 a2 = ki1.m20745a(gm4);
                    if (a2 != null) {
                        str4 = a2.f14093c;
                        str = "video/dolby-vision";
                    }
                } else if (n2 == 1987076931) {
                    if (str == null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    ky1.m21099a(z6, (String) null);
                    if (i11 == 1987063864) {
                        str2 = "video/x-vnd.on2.vp8";
                    } else {
                        str2 = "video/x-vnd.on2.vp9";
                    }
                } else if (n2 == 1635135811) {
                    if (str == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ky1.m21099a(z5, (String) null);
                    str2 = "video/av01";
                } else if (n2 == 1668050025) {
                    if (byteBuffer3 == null) {
                        byteBuffer2 = m19200a();
                    } else {
                        byteBuffer2 = byteBuffer3;
                    }
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(gm4.mo20701z());
                    byteBuffer2.putShort(gm4.mo20701z());
                    byteBuffer3 = byteBuffer2;
                    i7 = J2;
                    i8 = i11;
                    e += n;
                    i9 = i2;
                    i10 = i3;
                    dVar2 = dVar;
                    str3 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    J2 = i7;
                } else if (n2 == 1835295606) {
                    if (byteBuffer3 == null) {
                        byteBuffer = m19200a();
                    } else {
                        byteBuffer = byteBuffer3;
                    }
                    short z10 = gm4.mo20701z();
                    short z11 = gm4.mo20701z();
                    short z12 = gm4.mo20701z();
                    i8 = i11;
                    short z13 = gm4.mo20701z();
                    short z14 = gm4.mo20701z();
                    List<byte[]> list3 = list2;
                    short z15 = gm4.mo20701z();
                    byte[] bArr4 = bArr3;
                    short z16 = gm4.mo20701z();
                    float f3 = f2;
                    short z17 = gm4.mo20701z();
                    long F = gm4.mo20664F();
                    long F2 = gm4.mo20664F();
                    i7 = J2;
                    byteBuffer.position(1);
                    byteBuffer.putShort(z14);
                    byteBuffer.putShort(z15);
                    byteBuffer.putShort(z10);
                    byteBuffer.putShort(z11);
                    byteBuffer.putShort(z12);
                    byteBuffer.putShort(z13);
                    byteBuffer.putShort(z16);
                    byteBuffer.putShort(z17);
                    byteBuffer.putShort((short) ((int) (F / 10000)));
                    byteBuffer.putShort((short) ((int) (F2 / 10000)));
                    byteBuffer3 = byteBuffer;
                    list2 = list3;
                    bArr3 = bArr4;
                    f2 = f3;
                    e += n;
                    i9 = i2;
                    i10 = i3;
                    dVar2 = dVar;
                    str3 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    J2 = i7;
                } else {
                    i7 = J2;
                    i8 = i11;
                    bArr2 = bArr3;
                    f = f2;
                    list = list2;
                    if (n2 == 1681012275) {
                        if (str == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ky1.m21099a(z4, (String) null);
                        str = str5;
                    } else if (n2 == 1702061171) {
                        if (str == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ky1.m21099a(z3, (String) null);
                        bVar = m19208i(gm42, e2);
                        String a3 = bVar.f13034a;
                        byte[] b2 = bVar.f13035b;
                        if (b2 != null) {
                            list2 = ImmutableList.m36628of(b2);
                        } else {
                            list2 = list;
                        }
                        str = a3;
                        bArr3 = bArr2;
                        f2 = f;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1885434736) {
                        f2 = m19216q(gm42, e2);
                        list2 = list;
                        bArr3 = bArr2;
                        z9 = true;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1937126244) {
                        bArr3 = m19217r(gm42, e2, n);
                        list2 = list;
                        f2 = f;
                        e += n;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        J2 = i7;
                    } else if (n2 == 1936995172) {
                        int D = gm4.mo20662D();
                        gm42.mo20675Q(3);
                        if (D == 0) {
                            int D2 = gm4.mo20662D();
                            if (D2 == 0) {
                                i12 = 0;
                            } else if (D2 == 1) {
                                i12 = 1;
                            } else if (D2 == 2) {
                                i12 = 2;
                            } else if (D2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (n2 == 1668246642) {
                        int n3 = gm4.mo20689n();
                        if (n3 == 1852009592 || n3 == 1852009571) {
                            int J3 = gm4.mo20668J();
                            int J4 = gm4.mo20668J();
                            gm42.mo20675Q(2);
                            if (n != 19 || (gm4.mo20662D() & 128) == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            i13 = C0787e.m5330b(J3);
                            if (z2) {
                                i14 = 1;
                            } else {
                                i14 = 2;
                            }
                            i15 = C0787e.m5331c(J4);
                        } else {
                            gk3.m18132i("AtomParsers", "Unsupported color type: " + C2420gs.m18382a(n3));
                        }
                    }
                }
                list2 = list;
                bArr3 = bArr2;
                f2 = f;
                e += n;
                i9 = i2;
                i10 = i3;
                dVar2 = dVar;
                str3 = str5;
                drmInitData3 = drmInitData2;
                i11 = i8;
                J2 = i7;
            }
            str = str2;
            i7 = J2;
            i8 = i11;
            e += n;
            i9 = i2;
            i10 = i3;
            dVar2 = dVar;
            str3 = str5;
            drmInitData3 = drmInitData2;
            i11 = i8;
            J2 = i7;
        }
        int i16 = J2;
        byte[] bArr5 = bArr3;
        float f4 = f2;
        List<byte[]> list4 = list2;
        if (str != null) {
            C0792h.C0794b M = new C0792h.C0794b().mo6657R(i4).mo6670e0(str).mo6648I(str4).mo6675j0(J).mo6656Q(i16).mo6666a0(f4).mo6669d0(i5).mo6667b0(bArr5).mo6673h0(i12).mo6659T(list4).mo6652M(drmInitData2);
            int i17 = i13;
            int i18 = i14;
            int i19 = i15;
            if (!(i17 == -1 && i18 == -1 && i19 == -1 && byteBuffer3 == null)) {
                if (byteBuffer3 != null) {
                    bArr = byteBuffer3.array();
                } else {
                    bArr = null;
                }
                M.mo6649J(new C0787e(i17, i18, i19, bArr));
            }
            if (bVar != null) {
                M.mo6646G(Ints.m37051j(bVar.f13036c)).mo6665Z(Ints.m37051j(bVar.f13037d));
            }
            dVar.f13039b = M.mo6644E();
        }
    }

    /* renamed from: a */
    public static ByteBuffer m19200a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    public static boolean m19201b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int q = w67.m29374q(4, 0, length);
        int q2 = w67.m29374q(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[q] || jArr[q2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m19202c(gm4 gm4, int i, int i2, int i3) throws ParserException {
        boolean z;
        boolean z2;
        int e = gm4.mo20680e();
        if (e >= i2) {
            z = true;
        } else {
            z = false;
        }
        ky1.m21099a(z, (String) null);
        while (e - i2 < i3) {
            gm4.mo20674P(e);
            int n = gm4.mo20689n();
            if (n > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ky1.m21099a(z2, "childAtomSize must be positive");
            if (gm4.mo20689n() == i) {
                return e;
            }
            e += n;
        }
        return -1;
    }

    /* renamed from: d */
    public static int m19203d(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: e */
    public static void m19204e(gm4 gm4) {
        int e = gm4.mo20680e();
        gm4.mo20675Q(4);
        if (gm4.mo20689n() != 1751411826) {
            e += 4;
        }
        gm4.mo20674P(e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x030f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0165  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19205f(p000.gm4 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, androidx.media3.common.DrmInitData r29, p000.C2503hs.C2507d r30, int r31) throws androidx.media3.common.ParserException {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r29
            r6 = r30
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.mo20674P(r7)
            r7 = 6
            if (r28 == 0) goto L_0x0021
            int r8 = r22.mo20668J()
            r0.mo20675Q(r7)
            goto L_0x0025
        L_0x0021:
            r0.mo20675Q(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 4
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x0049
            if (r8 != r13) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            if (r8 != r12) goto L_0x0048
            r0.mo20675Q(r10)
            double r7 = r22.mo20687l()
            long r7 = java.lang.Math.round(r7)
            int r7 = (int) r7
            int r8 = r22.mo20666H()
            r10 = 20
            r0.mo20675Q(r10)
            r15 = 0
            goto L_0x0066
        L_0x0048:
            return
        L_0x0049:
            int r14 = r22.mo20668J()
            r0.mo20675Q(r7)
            int r7 = r22.mo20663E()
            int r15 = r22.mo20680e()
            int r15 = r15 - r11
            r0.mo20674P(r15)
            int r15 = r22.mo20689n()
            if (r8 != r13) goto L_0x0065
            r0.mo20675Q(r10)
        L_0x0065:
            r8 = r14
        L_0x0066:
            int r10 = r22.mo20680e()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r23
            if (r12 != r14) goto L_0x0098
            android.util.Pair r14 = m19218s(r0, r1, r2)
            if (r14 == 0) goto L_0x0095
            java.lang.Object r12 = r14.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r5 != 0) goto L_0x0083
            r5 = 0
            goto L_0x008d
        L_0x0083:
            java.lang.Object r13 = r14.second
            rs6 r13 = (p000.rs6) r13
            java.lang.String r13 = r13.f17362b
            androidx.media3.common.DrmInitData r5 = r5.mo6519c(r13)
        L_0x008d:
            rs6[] r13 = r6.f13038a
            java.lang.Object r14 = r14.second
            rs6 r14 = (p000.rs6) r14
            r13[r31] = r14
        L_0x0095:
            r0.mo20674P(r10)
        L_0x0098:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            if (r12 != r13) goto L_0x00a7
            java.lang.String r19 = "audio/ac3"
        L_0x00a4:
            r12 = -1
            goto L_0x0159
        L_0x00a7:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00af
            java.lang.String r19 = "audio/eac3"
            goto L_0x00a4
        L_0x00af:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00b7
            java.lang.String r19 = "audio/ac4"
            goto L_0x00a4
        L_0x00b7:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00bf
            java.lang.String r19 = "audio/vnd.dts"
            goto L_0x00a4
        L_0x00bf:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x0155
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00cb
            goto L_0x0155
        L_0x00cb:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d3
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00a4
        L_0x00d3:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00db
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00a4
        L_0x00db:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e3
            java.lang.String r19 = "audio/3gpp"
            goto L_0x00a4
        L_0x00e3:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00eb
            java.lang.String r19 = "audio/amr-wb"
            goto L_0x00a4
        L_0x00eb:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0153
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00f6
            goto L_0x0153
        L_0x00f6:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x00fe
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0159
        L_0x00fe:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x014f
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x0109
            goto L_0x014f
        L_0x0109:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0111
            java.lang.String r19 = "audio/mha1"
            goto L_0x00a4
        L_0x0111:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x0119
            java.lang.String r19 = "audio/mhm1"
            goto L_0x00a4
        L_0x0119:
            if (r12 != r14) goto L_0x011e
            java.lang.String r19 = "audio/alac"
            goto L_0x00a4
        L_0x011e:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x0127
            java.lang.String r19 = "audio/g711-alaw"
            goto L_0x00a4
        L_0x0127:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0130
            java.lang.String r19 = "audio/g711-mlaw"
            goto L_0x00a4
        L_0x0130:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x0139
            java.lang.String r19 = "audio/opus"
            goto L_0x00a4
        L_0x0139:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0142
            java.lang.String r19 = "audio/flac"
            goto L_0x00a4
        L_0x0142:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x014b
            java.lang.String r19 = "audio/true-hd"
            goto L_0x00a4
        L_0x014b:
            r12 = -1
            r19 = 0
            goto L_0x0159
        L_0x014f:
            java.lang.String r19 = "audio/mpeg"
            goto L_0x00a4
        L_0x0153:
            r12 = 2
            goto L_0x0159
        L_0x0155:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto L_0x00a4
        L_0x0159:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0161:
            int r11 = r10 - r1
            if (r11 >= r2) goto L_0x030b
            r0.mo20674P(r10)
            int r11 = r22.mo20689n()
            if (r11 <= 0) goto L_0x0170
            r14 = 1
            goto L_0x0171
        L_0x0170:
            r14 = 0
        L_0x0171:
            java.lang.String r9 = "childAtomSize must be positive"
            p000.ky1.m21099a(r14, r9)
            int r9 = r22.mo20689n()
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r14) goto L_0x019a
            int r9 = r11 + -13
            byte[] r14 = new byte[r9]
            int r1 = r10 + 13
            r0.mo20674P(r1)
            r1 = 0
            r0.mo20685j(r14, r1, r9)
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.m36628of(r14)
        L_0x0190:
            r9 = -1
            r14 = 1
            r16 = 4
            r17 = 2
        L_0x0196:
            r18 = 0
            goto L_0x0301
        L_0x019a:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x02c6
            if (r28 == 0) goto L_0x01a8
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r14) goto L_0x01a8
            goto L_0x02c6
        L_0x01a8:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01c7
            int r1 = r10 + 8
            r0.mo20674P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            androidx.media3.common.h r1 = p000.C3182r7.m26081c(r0, r1, r4, r5)
            r6.f13039b = r1
        L_0x01bc:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            goto L_0x02c2
        L_0x01c7:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01dc
            int r1 = r10 + 8
            r0.mo20674P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            androidx.media3.common.h r1 = p000.C3182r7.m26085g(r0, r1, r4, r5)
            r6.f13039b = r1
            goto L_0x01bc
        L_0x01dc:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01f1
            int r1 = r10 + 8
            r0.mo20674P(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            androidx.media3.common.h r1 = p000.C3467v7.m28676b(r0, r1, r4, r5)
            r6.f13039b = r1
            goto L_0x01bc
        L_0x01f1:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r9 != r1) goto L_0x0212
            if (r15 <= 0) goto L_0x01fb
            r7 = r15
            r8 = 2
            goto L_0x0190
        L_0x01fb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r14 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedContainer(r0, r14)
            throw r0
        L_0x0212:
            r14 = 0
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r1) goto L_0x023c
            androidx.media3.common.h$b r1 = new androidx.media3.common.h$b
            r1.<init>()
            androidx.media3.common.h$b r1 = r1.mo6657R(r3)
            androidx.media3.common.h$b r1 = r1.mo6670e0(r13)
            androidx.media3.common.h$b r1 = r1.mo6647H(r8)
            androidx.media3.common.h$b r1 = r1.mo6671f0(r7)
            androidx.media3.common.h$b r1 = r1.mo6652M(r5)
            androidx.media3.common.h$b r1 = r1.mo6661V(r4)
            androidx.media3.common.h r1 = r1.mo6644E()
            r6.f13039b = r1
            goto L_0x01bc
        L_0x023c:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x025a
            int r1 = r11 + -8
            byte[] r9 = f13024a
            int r14 = r9.length
            int r14 = r14 + r1
            byte[] r14 = java.util.Arrays.copyOf(r9, r14)
            int r2 = r10 + 8
            r0.mo20674P(r2)
            int r2 = r9.length
            r0.mo20685j(r14, r2, r1)
            java.util.List r21 = p000.zi4.m31246a(r14)
            goto L_0x0190
        L_0x025a:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x028c
            int r1 = r11 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r9
            r9 = 76
            r14 = 1
            r2[r14] = r9
            r9 = 97
            r17 = 2
            r2[r17] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.mo20674P(r9)
            r9 = 4
            r0.mo20685j(r2, r9, r1)
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.m36628of(r2)
            r16 = r9
            r9 = -1
            goto L_0x0196
        L_0x028c:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            if (r9 != r2) goto L_0x02c1
            int r1 = r11 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.mo20674P(r8)
            r9 = 0
            r0.mo20685j(r7, r9, r1)
            android.util.Pair r1 = p000.yh0.m30588e(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.m36628of(r7)
            r7 = r8
            r18 = r9
            r9 = -1
            r8 = r1
            goto L_0x0301
        L_0x02c1:
            r9 = 0
        L_0x02c2:
            r18 = r9
            r9 = -1
            goto L_0x0301
        L_0x02c6:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            r18 = 0
            if (r9 != r1) goto L_0x02d4
            r1 = r10
            goto L_0x02d8
        L_0x02d4:
            int r1 = m19202c(r0, r1, r10, r11)
        L_0x02d8:
            r9 = -1
            if (r1 == r9) goto L_0x0301
            hs$b r19 = m19208i(r0, r1)
            java.lang.String r13 = r19.f13034a
            byte[] r1 = r19.f13035b
            if (r1 == 0) goto L_0x0301
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x02fd
            l5$b r2 = p000.C2740l5.m21231e(r1)
            int r7 = r2.f14414a
            int r8 = r2.f14415b
            java.lang.String r2 = r2.f14416c
            r20 = r2
        L_0x02fd:
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.m36628of(r1)
        L_0x0301:
            int r10 = r10 + r11
            r1 = r24
            r2 = r25
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0161
        L_0x030b:
            androidx.media3.common.h r0 = r6.f13039b
            if (r0 != 0) goto L_0x035d
            if (r13 == 0) goto L_0x035d
            androidx.media3.common.h$b r0 = new androidx.media3.common.h$b
            r0.<init>()
            androidx.media3.common.h$b r0 = r0.mo6657R(r3)
            androidx.media3.common.h$b r0 = r0.mo6670e0(r13)
            r1 = r20
            androidx.media3.common.h$b r0 = r0.mo6648I(r1)
            androidx.media3.common.h$b r0 = r0.mo6647H(r8)
            androidx.media3.common.h$b r0 = r0.mo6671f0(r7)
            androidx.media3.common.h$b r0 = r0.mo6664Y(r12)
            r1 = r21
            androidx.media3.common.h$b r0 = r0.mo6659T(r1)
            androidx.media3.common.h$b r0 = r0.mo6652M(r5)
            androidx.media3.common.h$b r0 = r0.mo6661V(r4)
            if (r19 == 0) goto L_0x0357
            long r1 = r19.f13036c
            int r1 = com.google.common.primitives.Ints.m37051j(r1)
            androidx.media3.common.h$b r1 = r0.mo6646G(r1)
            long r2 = r19.f13037d
            int r2 = com.google.common.primitives.Ints.m37051j(r2)
            r1.mo6665Z(r2)
        L_0x0357:
            androidx.media3.common.h r0 = r0.mo6644E()
            r6.f13039b = r0
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2503hs.m19205f(gm4, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, hs$d, int):void");
    }

    /* renamed from: g */
    public static Pair<Integer, rs6> m19206g(gm4 gm4, int i, int i2) throws ParserException {
        boolean z;
        boolean z2;
        int i3 = i + 8;
        boolean z3 = false;
        int i4 = -1;
        String str = null;
        Integer num = null;
        int i5 = 0;
        while (i3 - i < i2) {
            gm4.mo20674P(i3);
            int n = gm4.mo20689n();
            int n2 = gm4.mo20689n();
            if (n2 == 1718775137) {
                num = Integer.valueOf(gm4.mo20689n());
            } else if (n2 == 1935894637) {
                gm4.mo20675Q(4);
                str = gm4.mo20659A(4);
            } else if (n2 == 1935894633) {
                i4 = i3;
                i5 = n;
            }
            i3 += n;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        ky1.m21099a(z, "frma atom is mandatory");
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        ky1.m21099a(z2, "schi atom is mandatory");
        rs6 t = m19219t(gm4, i4, i5, str);
        if (t != null) {
            z3 = true;
        }
        ky1.m21099a(z3, "tenc atom is mandatory");
        return Pair.create(num, (rs6) w67.m29360j(t));
    }

    /* renamed from: h */
    public static Pair<long[], long[]> m19207h(C2420gs.C2421a aVar) {
        long j;
        long j2;
        C2420gs.C2422b g = aVar.mo20826g(1701606260);
        if (g == null) {
            return null;
        }
        gm4 gm4 = g.f12588b;
        gm4.mo20674P(8);
        int c = C2420gs.m18384c(gm4.mo20689n());
        int H = gm4.mo20666H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        int i = 0;
        while (i < H) {
            if (c == 1) {
                j = gm4.mo20667I();
            } else {
                j = gm4.mo20664F();
            }
            jArr[i] = j;
            if (c == 1) {
                j2 = gm4.mo20698w();
            } else {
                j2 = (long) gm4.mo20689n();
            }
            jArr2[i] = j2;
            if (gm4.mo20701z() == 1) {
                gm4.mo20675Q(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    public static C2505b m19208i(gm4 gm4, int i) {
        long j;
        long j2;
        gm4.mo20674P(i + 8 + 4);
        gm4.mo20675Q(1);
        m19209j(gm4);
        gm4.mo20675Q(2);
        int D = gm4.mo20662D();
        if ((D & 128) != 0) {
            gm4.mo20675Q(2);
        }
        if ((D & 64) != 0) {
            gm4.mo20675Q(gm4.mo20662D());
        }
        if ((D & 32) != 0) {
            gm4.mo20675Q(2);
        }
        gm4.mo20675Q(1);
        m19209j(gm4);
        String f = vv3.m29132f(gm4.mo20662D());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return new C2505b(f, (byte[]) null, -1, -1);
        }
        gm4.mo20675Q(4);
        long F = gm4.mo20664F();
        long F2 = gm4.mo20664F();
        gm4.mo20675Q(1);
        int j3 = m19209j(gm4);
        byte[] bArr = new byte[j3];
        gm4.mo20685j(bArr, 0, j3);
        if (F2 > 0) {
            j = F2;
        } else {
            j = -1;
        }
        if (F > 0) {
            j2 = F;
        } else {
            j2 = -1;
        }
        return new C2505b(f, bArr, j, j2);
    }

    /* renamed from: j */
    public static int m19209j(gm4 gm4) {
        int D = gm4.mo20662D();
        int i = D & 127;
        while ((D & 128) == 128) {
            D = gm4.mo20662D();
            i = (i << 7) | (D & 127);
        }
        return i;
    }

    /* renamed from: k */
    public static int m19210k(gm4 gm4) {
        gm4.mo20674P(16);
        return gm4.mo20689n();
    }

    /* renamed from: l */
    public static Metadata m19211l(gm4 gm4, int i) {
        gm4.mo20675Q(8);
        ArrayList arrayList = new ArrayList();
        while (gm4.mo20680e() < i) {
            Metadata.Entry c = lv3.m21876c(gm4);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: m */
    public static Pair<Long, String> m19212m(gm4 gm4) {
        int i;
        int i2 = 8;
        gm4.mo20674P(8);
        int c = C2420gs.m18384c(gm4.mo20689n());
        if (c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        gm4.mo20675Q(i);
        long F = gm4.mo20664F();
        if (c == 0) {
            i2 = 4;
        }
        gm4.mo20675Q(i2);
        int J = gm4.mo20668J();
        return Pair.create(Long.valueOf(F), "" + ((char) (((J >> 10) & 31) + 96)) + ((char) (((J >> 5) & 31) + 96)) + ((char) ((J & 31) + 96)));
    }

    /* renamed from: n */
    public static Metadata m19213n(C2420gs.C2421a aVar) {
        C2420gs.C2422b g = aVar.mo20826g(1751411826);
        C2420gs.C2422b g2 = aVar.mo20826g(1801812339);
        C2420gs.C2422b g3 = aVar.mo20826g(1768715124);
        if (g == null || g2 == null || g3 == null || m19210k(g.f12588b) != 1835299937) {
            return null;
        }
        gm4 gm4 = g2.f12588b;
        gm4.mo20674P(12);
        int n = gm4.mo20689n();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            int n2 = gm4.mo20689n();
            gm4.mo20675Q(4);
            strArr[i] = gm4.mo20659A(n2 - 8);
        }
        gm4 gm42 = g3.f12588b;
        gm42.mo20674P(8);
        ArrayList arrayList = new ArrayList();
        while (gm42.mo20676a() > 8) {
            int e = gm42.mo20680e();
            int n3 = gm42.mo20689n();
            int n4 = gm42.mo20689n() - 1;
            if (n4 < 0 || n4 >= n) {
                gk3.m18132i("AtomParsers", "Skipped metadata with unknown key index: " + n4);
            } else {
                MdtaMetadataEntry f = lv3.m21879f(gm42, e + n3, strArr[n4]);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            gm42.mo20674P(e + n3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: o */
    public static void m19214o(gm4 gm4, int i, int i2, int i3, C2507d dVar) {
        gm4.mo20674P(i2 + 8 + 8);
        if (i == 1835365492) {
            gm4.mo20699x();
            String x = gm4.mo20699x();
            if (x != null) {
                dVar.f13039b = new C0792h.C0794b().mo6657R(i3).mo6670e0(x).mo6644E();
            }
        }
    }

    /* renamed from: p */
    public static long m19215p(gm4 gm4) {
        int i = 8;
        gm4.mo20674P(8);
        if (C2420gs.m18384c(gm4.mo20689n()) != 0) {
            i = 16;
        }
        gm4.mo20675Q(i);
        return gm4.mo20664F();
    }

    /* renamed from: q */
    public static float m19216q(gm4 gm4, int i) {
        gm4.mo20674P(i + 8);
        return ((float) gm4.mo20666H()) / ((float) gm4.mo20666H());
    }

    /* renamed from: r */
    public static byte[] m19217r(gm4 gm4, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            gm4.mo20674P(i3);
            int n = gm4.mo20689n();
            if (gm4.mo20689n() == 1886547818) {
                return Arrays.copyOfRange(gm4.mo20679d(), i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: s */
    public static Pair<Integer, rs6> m19218s(gm4 gm4, int i, int i2) throws ParserException {
        boolean z;
        Pair<Integer, rs6> g;
        int e = gm4.mo20680e();
        while (e - i < i2) {
            gm4.mo20674P(e);
            int n = gm4.mo20689n();
            if (n > 0) {
                z = true;
            } else {
                z = false;
            }
            ky1.m21099a(z, "childAtomSize must be positive");
            if (gm4.mo20689n() == 1936289382 && (g = m19206g(gm4, e, n)) != null) {
                return g;
            }
            e += n;
        }
        return null;
    }

    /* renamed from: t */
    public static rs6 m19219t(gm4 gm4, int i, int i2, String str) {
        int i3;
        int i4;
        boolean z;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            gm4.mo20674P(i5);
            int n = gm4.mo20689n();
            if (gm4.mo20689n() == 1952804451) {
                int c = C2420gs.m18384c(gm4.mo20689n());
                gm4.mo20675Q(1);
                if (c == 0) {
                    gm4.mo20675Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int D = gm4.mo20662D();
                    i3 = D & 15;
                    i4 = (D & 240) >> 4;
                }
                if (gm4.mo20662D() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int D2 = gm4.mo20662D();
                byte[] bArr2 = new byte[16];
                gm4.mo20685j(bArr2, 0, 16);
                if (z && D2 == 0) {
                    int D3 = gm4.mo20662D();
                    bArr = new byte[D3];
                    gm4.mo20685j(bArr, 0, D3);
                }
                return new rs6(z, str, D2, bArr2, i4, i3, bArr);
            }
            i5 += n;
        }
    }

    /* renamed from: u */
    public static Metadata m19220u(gm4 gm4, int i) {
        float f;
        gm4.mo20675Q(12);
        while (gm4.mo20680e() < i) {
            int e = gm4.mo20680e();
            int n = gm4.mo20689n();
            if (gm4.mo20689n() != 1935766900) {
                gm4.mo20674P(e + n);
            } else if (n < 14) {
                return null;
            } else {
                gm4.mo20675Q(5);
                int D = gm4.mo20662D();
                if (D != 12 && D != 13) {
                    return null;
                }
                if (D == 12) {
                    f = 240.0f;
                } else {
                    f = 120.0f;
                }
                gm4.mo20675Q(1);
                return new Metadata(new SmtaMetadataEntry(f, gm4.mo20662D()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ab  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.at6 m19221v(p000.qs6 r38, p000.C2420gs.C2421a r39, p000.we2 r40) throws androidx.media3.common.ParserException {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            gs$b r3 = r0.mo20826g(r3)
            if (r3 == 0) goto L_0x0017
            hs$e r5 = new hs$e
            androidx.media3.common.h r6 = r1.f17058f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            gs$b r3 = r0.mo20826g(r3)
            if (r3 == 0) goto L_0x0514
            hs$f r5 = new hs$f
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.mo21368c()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            at6 r9 = new at6
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            gs$b r7 = r0.mo20826g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            gs$b r7 = r0.mo20826g(r7)
            java.lang.Object r7 = p000.C2725kr.m20985e(r7)
            gs$b r7 = (p000.C2420gs.C2422b) r7
            r9 = r8
            goto L_0x005a
        L_0x0059:
            r9 = r6
        L_0x005a:
            gm4 r7 = r7.f12588b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            gs$b r10 = r0.mo20826g(r10)
            java.lang.Object r10 = p000.C2725kr.m20985e(r10)
            gs$b r10 = (p000.C2420gs.C2422b) r10
            gm4 r10 = r10.f12588b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            gs$b r11 = r0.mo20826g(r11)
            java.lang.Object r11 = p000.C2725kr.m20985e(r11)
            gs$b r11 = (p000.C2420gs.C2422b) r11
            gm4 r11 = r11.f12588b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            gs$b r12 = r0.mo20826g(r12)
            if (r12 == 0) goto L_0x0086
            gm4 r12 = r12.f12588b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            gs$b r0 = r0.mo20826g(r13)
            if (r0 == 0) goto L_0x0093
            gm4 r0 = r0.f12588b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            hs$a r13 = new hs$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.mo20674P(r7)
            int r9 = r11.mo20666H()
            int r9 = r9 - r8
            int r10 = r11.mo20666H()
            int r14 = r11.mo20666H()
            if (r0 == 0) goto L_0x00b5
            r0.mo20674P(r7)
            int r15 = r0.mo20666H()
            goto L_0x00b6
        L_0x00b5:
            r15 = r6
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cd
            r12.mo20674P(r7)
            int r7 = r12.mo20666H()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.mo20666H()
            int r16 = r16 + -1
            goto L_0x00d0
        L_0x00c9:
            r16 = r4
            r12 = 0
            goto L_0x00d0
        L_0x00cd:
            r16 = r4
            r7 = r6
        L_0x00d0:
            int r6 = r5.mo21367b()
            androidx.media3.common.h r8 = r1.f17058f
            java.lang.String r8 = r8.f4175C
            if (r6 == r4) goto L_0x00fc
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fc
        L_0x00f2:
            if (r9 != 0) goto L_0x00fc
            if (r15 != 0) goto L_0x00fc
            if (r7 != 0) goto L_0x00fc
            r39 = r7
            r4 = 1
            goto L_0x00ff
        L_0x00fc:
            r39 = r7
            r4 = 0
        L_0x00ff:
            if (r4 == 0) goto L_0x0133
            int r0 = r13.f13025a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0107:
            boolean r5 = r13.mo21365a()
            if (r5 == 0) goto L_0x0118
            int r5 = r13.f13026b
            long r9 = r13.f13028d
            r4[r5] = r9
            int r9 = r13.f13027c
            r0[r5] = r9
            goto L_0x0107
        L_0x0118:
            long r9 = (long) r14
            n32$b r0 = p000.n32.m22778a(r6, r4, r0, r9)
            long[] r4 = r0.f15318a
            int[] r5 = r0.f15319b
            int r6 = r0.f15320c
            long[] r9 = r0.f15321d
            int[] r10 = r0.f15322e
            long r11 = r0.f15323f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x029e
        L_0x0133:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r24 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r37 = r9
            r9 = r39
        L_0x0153:
            r39 = r37
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x0217
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x015f:
            if (r27 != 0) goto L_0x017c
            boolean r22 = r13.mo21365a()
            if (r22 == 0) goto L_0x017c
            r30 = r14
            r31 = r15
            long r14 = r13.f13028d
            r32 = r3
            int r3 = r13.f13027c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015f
        L_0x017c:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x01a0
            java.lang.String r2 = "Unexpected end of chunk data"
            p000.gk3.m18132i(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x021f
        L_0x01a0:
            if (r0 == 0) goto L_0x01b3
        L_0x01a2:
            if (r23 != 0) goto L_0x01b1
            if (r16 <= 0) goto L_0x01b1
            int r23 = r0.mo20666H()
            int r21 = r0.mo20689n()
            int r16 = r16 + -1
            goto L_0x01a2
        L_0x01b1:
            int r23 = r23 + -1
        L_0x01b3:
            r3 = r21
            r4[r1] = r28
            int r10 = r5.mo21366a()
            r6[r1] = r10
            if (r10 <= r11) goto L_0x01c0
            r11 = r10
        L_0x01c0:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01c9
            r10 = 1
            goto L_0x01ca
        L_0x01c9:
            r10 = 0
        L_0x01ca:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e0
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e0
            java.lang.Object r2 = p000.C2725kr.m20985e(r12)
            gm4 r2 = (p000.gm4) r2
            int r2 = r2.mo20666H()
            int r2 = r2 - r10
        L_0x01e0:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01f8
            if (r39 <= 0) goto L_0x01f8
            int r2 = r24.mo20666H()
            int r3 = r24.mo20689n()
            int r14 = r39 + -1
            goto L_0x01fb
        L_0x01f8:
            r3 = r14
            r14 = r39
        L_0x01fb:
            r39 = r2
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r10
            r37 = r14
            r14 = r39
            goto L_0x0153
        L_0x0217:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x021f:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x0234
        L_0x0224:
            if (r16 <= 0) goto L_0x0234
            int r2 = r0.mo20666H()
            if (r2 == 0) goto L_0x022e
            r0 = 0
            goto L_0x0235
        L_0x022e:
            r0.mo20689n()
            int r16 = r16 + -1
            goto L_0x0224
        L_0x0234:
            r0 = 1
        L_0x0235:
            if (r9 != 0) goto L_0x0247
            if (r30 != 0) goto L_0x0247
            if (r1 != 0) goto L_0x0247
            if (r39 != 0) goto L_0x0247
            r2 = r23
            if (r2 != 0) goto L_0x0249
            if (r0 != 0) goto L_0x0244
            goto L_0x0249
        L_0x0244:
            r14 = r38
            goto L_0x0297
        L_0x0247:
            r2 = r23
        L_0x0249:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f17053a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r39
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x028b
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028d
        L_0x028b:
            java.lang.String r0 = ""
        L_0x028d:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            p000.gk3.m18132i(r10, r0)
        L_0x0297:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x029e:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.f17055c
            r5 = r15
            long r7 = p000.w67.m29313J0(r5, r7, r9)
            long[] r1 = r14.f17060h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02bf
            long r0 = r14.f17055c
            p000.w67.m29315K0(r12, r10, r0)
            at6 r9 = new at6
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02bf:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x035c
            int r1 = r14.f17054b
            if (r1 != r5) goto L_0x035c
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x035c
            long[] r1 = r14.f17061i
            java.lang.Object r1 = p000.C2725kr.m20985e(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f17060h
            r23 = r1[r5]
            long r5 = r14.f17055c
            long r7 = r14.f17056d
            r25 = r5
            r27 = r7
            long r5 = p000.w67.m29313J0(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = m19201b(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x035e
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            androidx.media3.common.h r5 = r14.f17058f
            int r5 = r5.f4187b1
            long r8 = (long) r5
            long r10 = r14.f17055c
            r28 = r8
            r30 = r10
            long r10 = p000.w67.m29313J0(r26, r28, r30)
            androidx.media3.common.h r5 = r14.f17058f
            int r5 = r5.f4187b1
            long r8 = (long) r5
            long r0 = r14.f17055c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = p000.w67.m29313J0(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0326
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0360
        L_0x0326:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0360
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0360
            int r4 = (int) r4
            r5 = r40
            r5.f19072a = r4
            int r0 = (int) r0
            r5.f19073b = r0
            long r0 = r14.f17055c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            p000.w67.m29315K0(r12, r4, r0)
            long[] r0 = r14.f17060h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f17056d
            long r7 = p000.w67.m29313J0(r4, r6, r8)
            at6 r9 = new at6
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035c:
            r25 = r0
        L_0x035e:
            r39 = r4
        L_0x0360:
            long[] r0 = r14.f17060h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03ab
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x03ab
            long[] r0 = r14.f17061i
            java.lang.Object r0 = p000.C2725kr.m20985e(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x037a:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0391
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f17055c
            r21 = r0
            long r0 = p000.w67.m29313J0(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x037a
        L_0x0391:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f17055c
            r21 = r0
            long r7 = p000.w67.m29313J0(r17, r19, r21)
            at6 r9 = new at6
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03ab:
            int r1 = r14.f17054b
            r4 = 1
            if (r1 != r4) goto L_0x03b2
            r10 = 1
            goto L_0x03b3
        L_0x03b2:
            r10 = 0
        L_0x03b3:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r4 = r14.f17061i
            java.lang.Object r4 = p000.C2725kr.m20985e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03c5:
            long[] r9 = r14.f17060h
            int r11 = r9.length
            if (r5 >= r11) goto L_0x0426
            r11 = r2
            r15 = r3
            r2 = r4[r5]
            r21 = -1
            int r16 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0415
            r26 = r9[r5]
            r16 = r8
            long r8 = r14.f17055c
            r40 = r6
            r21 = r7
            long r6 = r14.f17056d
            r28 = r8
            r30 = r6
            long r6 = p000.w67.m29313J0(r26, r28, r30)
            r8 = 1
            int r9 = p000.w67.m29358i(r12, r2, r8, r8)
            r1[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = p000.w67.m29350e(r12, r2, r10, r6)
            r0[r5] = r2
        L_0x03f7:
            r2 = r1[r5]
            r3 = r0[r5]
            if (r2 >= r3) goto L_0x0407
            r7 = r13[r2]
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0407
            int r2 = r2 + 1
            r1[r5] = r2
            goto L_0x03f7
        L_0x0407:
            int r7 = r3 - r2
            int r7 = r21 + r7
            r9 = r16
            if (r9 == r2) goto L_0x0411
            r2 = r8
            goto L_0x0412
        L_0x0411:
            r2 = r6
        L_0x0412:
            r2 = r40 | r2
            goto L_0x041f
        L_0x0415:
            r40 = r6
            r21 = r7
            r9 = r8
            r6 = 0
            r8 = 1
            r2 = r40
            r3 = r9
        L_0x041f:
            int r5 = r5 + 1
            r6 = r2
            r8 = r3
            r2 = r11
            r3 = r15
            goto L_0x03c5
        L_0x0426:
            r11 = r2
            r15 = r3
            r40 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x0431
            goto L_0x0432
        L_0x0431:
            r8 = r6
        L_0x0432:
            r2 = r40 | r8
            if (r2 == 0) goto L_0x0439
            long[] r3 = new long[r7]
            goto L_0x043a
        L_0x0439:
            r3 = r11
        L_0x043a:
            if (r2 == 0) goto L_0x043f
            int[] r4 = new int[r7]
            goto L_0x0440
        L_0x043f:
            r4 = r15
        L_0x0440:
            if (r2 == 0) goto L_0x0444
            r5 = r6
            goto L_0x0446
        L_0x0444:
            r5 = r39
        L_0x0446:
            if (r2 == 0) goto L_0x044b
            int[] r8 = new int[r7]
            goto L_0x044c
        L_0x044b:
            r8 = r13
        L_0x044c:
            long[] r7 = new long[r7]
            r40 = r5
            r39 = r15
            r9 = 0
            r15 = r6
        L_0x0455:
            long[] r5 = r14.f17060h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x04f4
            long[] r5 = r14.f17061i
            r16 = r5[r6]
            r5 = r1[r6]
            r18 = r1
            r1 = r0[r6]
            r27 = r0
            if (r2 == 0) goto L_0x0478
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r39
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x047c
        L_0x0478:
            r28 = r11
            r11 = r39
        L_0x047c:
            r0 = r40
        L_0x047e:
            if (r5 >= r1) goto L_0x04ce
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r0
            r39 = r1
            long r0 = r14.f17056d
            r21 = r9
            r25 = r0
            long r0 = p000.w67.m29313J0(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r24 = r13
            long r12 = r21 - r16
            r30 = r8
            r21 = r9
            r8 = 0
            long r31 = java.lang.Math.max(r8, r12)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.f17055c
            r35 = r12
            long r12 = p000.w67.m29313J0(r31, r33, r35)
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04bc
            r0 = r4[r15]
            r1 = r29
            if (r0 <= r1) goto L_0x04be
            r0 = r11[r5]
            goto L_0x04bf
        L_0x04bc:
            r1 = r29
        L_0x04be:
            r0 = r1
        L_0x04bf:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r1 = r39
            r9 = r21
            r12 = r23
            r13 = r24
            r8 = r30
            goto L_0x047e
        L_0x04ce:
            r1 = r0
            r30 = r8
            r21 = r9
            r23 = r12
            r24 = r13
            r8 = 0
            long[] r0 = r14.f17060h
            r12 = r0[r6]
            long r12 = r21 + r12
            int r6 = r6 + 1
            r40 = r1
            r39 = r11
            r9 = r12
            r1 = r18
            r12 = r23
            r13 = r24
            r0 = r27
            r11 = r28
            r8 = r30
            goto L_0x0455
        L_0x04f4:
            r30 = r8
            r21 = r9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f17056d
            r25 = r0
            long r8 = p000.w67.m29313J0(r21, r23, r25)
            at6 r10 = new at6
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r40
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x0514:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedContainer(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2503hs.m19221v(qs6, gs$a, we2):at6");
    }

    /* renamed from: w */
    public static C2507d m19222w(gm4 gm4, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        boolean z2;
        int i3;
        gm4 gm42 = gm4;
        int i4 = i;
        gm42.mo20674P(12);
        int n = gm4.mo20689n();
        C2507d dVar = new C2507d(n);
        for (int i5 = 0; i5 < n; i5++) {
            int e = gm4.mo20680e();
            int n2 = gm4.mo20689n();
            if (n2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ky1.m21099a(z2, "childAtomSize must be positive");
            int n3 = gm4.mo20689n();
            if (n3 == 1635148593 || n3 == 1635148595 || n3 == 1701733238 || n3 == 1831958048 || n3 == 1836070006 || n3 == 1752589105 || n3 == 1751479857 || n3 == 1932670515 || n3 == 1211250227 || n3 == 1987063864 || n3 == 1987063865 || n3 == 1635135537 || n3 == 1685479798 || n3 == 1685479729 || n3 == 1685481573 || n3 == 1685481521) {
                i3 = e;
                m19199D(gm4, n3, i3, n2, i, i2, drmInitData, dVar, i5);
            } else if (n3 == 1836069985 || n3 == 1701733217 || n3 == 1633889587 || n3 == 1700998451 || n3 == 1633889588 || n3 == 1835823201 || n3 == 1685353315 || n3 == 1685353317 || n3 == 1685353320 || n3 == 1685353324 || n3 == 1685353336 || n3 == 1935764850 || n3 == 1935767394 || n3 == 1819304813 || n3 == 1936684916 || n3 == 1953984371 || n3 == 778924082 || n3 == 778924083 || n3 == 1835557169 || n3 == 1835560241 || n3 == 1634492771 || n3 == 1634492791 || n3 == 1970037111 || n3 == 1332770163 || n3 == 1716281667) {
                i3 = e;
                m19205f(gm4, n3, e, n2, i, str, z, drmInitData, dVar, i5);
            } else {
                if (n3 == 1414810956 || n3 == 1954034535 || n3 == 2004251764 || n3 == 1937010800 || n3 == 1664495672) {
                    m19223x(gm4, n3, e, n2, i, str, dVar);
                } else if (n3 == 1835365492) {
                    m19214o(gm42, n3, e, i4, dVar);
                } else if (n3 == 1667329389) {
                    dVar.f13039b = new C0792h.C0794b().mo6657R(i4).mo6670e0("application/x-camera-motion").mo6644E();
                }
                i3 = e;
            }
            gm42.mo20674P(i3 + n2);
        }
        return dVar;
    }

    /* renamed from: x */
    public static void m19223x(gm4 gm4, int i, int i2, int i3, int i4, String str, C2507d dVar) {
        gm4.mo20674P(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                gm4.mo20685j(bArr, 0, i5);
                immutableList = ImmutableList.m36628of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                dVar.f13041d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f13039b = new C0792h.C0794b().mo6657R(i4).mo6670e0(str2).mo6661V(str).mo6674i0(j).mo6659T(immutableList).mo6644E();
    }

    /* renamed from: y */
    public static C2510g m19224y(gm4 gm4) {
        int i;
        boolean z;
        long j;
        int i2 = 8;
        gm4.mo20674P(8);
        int c = C2420gs.m18384c(gm4.mo20689n());
        if (c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        gm4.mo20675Q(i);
        int n = gm4.mo20689n();
        gm4.mo20675Q(4);
        int e = gm4.mo20680e();
        if (c == 0) {
            i2 = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            } else if (gm4.mo20679d()[e + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (z) {
            gm4.mo20675Q(i2);
        } else {
            if (c == 0) {
                j = gm4.mo20664F();
            } else {
                j = gm4.mo20667I();
            }
            if (j != 0) {
                j2 = j;
            }
        }
        gm4.mo20675Q(16);
        int n2 = gm4.mo20689n();
        int n3 = gm4.mo20689n();
        gm4.mo20675Q(4);
        int n4 = gm4.mo20689n();
        int n5 = gm4.mo20689n();
        if (n2 == 0 && n3 == 65536 && n4 == -65536 && n5 == 0) {
            i3 = 90;
        } else if (n2 == 0 && n3 == -65536 && n4 == 65536 && n5 == 0) {
            i3 = 270;
        } else if (n2 == -65536 && n3 == 0 && n4 == 0 && n5 == -65536) {
            i3 = 180;
        }
        return new C2510g(n, j2, i3);
    }

    /* renamed from: z */
    public static qs6 m19225z(C2420gs.C2421a aVar, C2420gs.C2422b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long j2;
        C2420gs.C2422b bVar2;
        long[] jArr;
        long[] jArr2;
        C2420gs.C2421a f;
        Pair<long[], long[]> h;
        C2420gs.C2421a aVar2 = aVar;
        C2420gs.C2421a aVar3 = (C2420gs.C2421a) C2725kr.m20985e(aVar2.mo20825f(1835297121));
        int d = m19203d(m19210k(((C2420gs.C2422b) C2725kr.m20985e(aVar3.mo20826g(1751411826))).f12588b));
        if (d == -1) {
            return null;
        }
        C2510g y = m19224y(((C2420gs.C2422b) C2725kr.m20985e(aVar2.mo20826g(1953196132))).f12588b);
        long j3 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            bVar2 = bVar;
            j2 = y.f13051b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long p = m19215p(bVar2.f12588b);
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j3 = w67.m29313J0(j2, 1000000, p);
        }
        long j4 = j3;
        Pair<Long, String> m = m19212m(((C2420gs.C2422b) C2725kr.m20985e(aVar3.mo20826g(1835296868))).f12588b);
        C2507d w = m19222w(((C2420gs.C2422b) C2725kr.m20985e(((C2420gs.C2421a) C2725kr.m20985e(((C2420gs.C2421a) C2725kr.m20985e(aVar3.mo20825f(1835626086))).mo20825f(1937007212))).mo20826g(1937011556))).f12588b, y.f13050a, y.f13052c, (String) m.second, drmInitData, z2);
        if (z || (f = aVar2.mo20825f(1701082227)) == null || (h = m19207h(f)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) h.second;
            jArr2 = (long[]) h.first;
        }
        if (w.f13039b == null) {
            return null;
        }
        return new qs6(y.f13050a, d, ((Long) m.first).longValue(), p, j4, w.f13039b, w.f13041d, w.f13038a, w.f13040c, jArr2, jArr);
    }
}
