package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: vp2 */
/* compiled from: Id3Decoder */
public final class vp2 extends q26 {

    /* renamed from: b */
    public static final C3504a f18877b = new up2();

    /* renamed from: a */
    public final C3504a f18878a;

    /* renamed from: vp2$a */
    /* compiled from: Id3Decoder */
    public interface C3504a {
        /* renamed from: a */
        boolean mo18389a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: vp2$b */
    /* compiled from: Id3Decoder */
    public static final class C3505b {

        /* renamed from: a */
        public final int f18879a;

        /* renamed from: b */
        public final boolean f18880b;

        /* renamed from: c */
        public final int f18881c;

        public C3505b(int i, boolean z, int i2) {
            this.f18879a = i;
            this.f18880b = z;
            this.f18881c = i2;
        }
    }

    public vp2() {
        this((C3504a) null);
    }

    /* renamed from: A */
    public static int m29029A(gm4 gm4, int i) {
        byte[] d = gm4.mo20679d();
        int e = gm4.mo20680e();
        int i2 = e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= e + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - e)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098 A[SYNTHETIC, Splitter:B:46:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0094 A[SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29030B(p000.gm4 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo20680e()
        L_0x0008:
            int r3 = r18.mo20676a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo20689n()     // Catch:{ all -> 0x00af }
            long r8 = r18.mo20664F()     // Catch:{ all -> 0x00af }
            int r10 = r18.mo20668J()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo20665G()     // Catch:{ all -> 0x00af }
            int r8 = r18.mo20665G()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = r6
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo20674P(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            r1.mo20674P(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r6
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = r6
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = r4
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = r6
            r4 = r3
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            r1.mo20674P(r2)
            return r6
        L_0x0098:
            int r3 = r18.mo20676a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a5
            r1.mo20674P(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.mo20675Q(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.mo20674P(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.mo20674P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vp2.m29030B(gm4, int, int, boolean):boolean");
    }

    /* renamed from: d */
    public static byte[] m29032d(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return w67.f19026f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: f */
    public static ApicFrame m29033f(gm4 gm4, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int D = gm4.mo20662D();
        String v = m29049v(D);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        gm4.mo20685j(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + C5876gr.m44841e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m29052y(bArr, 0);
            String e = C5876gr.m44841e(new String(bArr, 0, i3, "ISO-8859-1"));
            if (e.indexOf(47) == -1) {
                str = "image/" + e;
            } else {
                str = e;
            }
        }
        int i5 = i3 + 2;
        int x = m29051x(bArr, i5, D);
        return new ApicFrame(str, new String(bArr, i5, x - i5, v), bArr[i3 + 1] & 255, m29032d(bArr, x + m29048u(D), i4));
    }

    /* renamed from: g */
    public static BinaryFrame m29034g(gm4 gm4, int i, String str) {
        byte[] bArr = new byte[i];
        gm4.mo20685j(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: h */
    public static ChapterFrame m29035h(gm4 gm4, int i, int i2, boolean z, int i3, C3504a aVar) throws UnsupportedEncodingException {
        long j;
        long j2;
        gm4 gm42 = gm4;
        int e = gm4.mo20680e();
        int y = m29052y(gm4.mo20679d(), e);
        String str = new String(gm4.mo20679d(), e, y - e, "ISO-8859-1");
        gm4.mo20674P(y + 1);
        int n = gm4.mo20689n();
        int n2 = gm4.mo20689n();
        long F = gm4.mo20664F();
        if (F == 4294967295L) {
            j = -1;
        } else {
            j = F;
        }
        long F2 = gm4.mo20664F();
        if (F2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = F2;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = e + i;
        while (gm4.mo20680e() < i4) {
            Id3Frame k = m29038k(i2, gm4, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new ChapterFrame(str, n, n2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: i */
    public static ChapterTocFrame m29036i(gm4 gm4, int i, int i2, boolean z, int i3, C3504a aVar) throws UnsupportedEncodingException {
        boolean z2;
        boolean z3;
        gm4 gm42 = gm4;
        int e = gm4.mo20680e();
        int y = m29052y(gm4.mo20679d(), e);
        String str = new String(gm4.mo20679d(), e, y - e, "ISO-8859-1");
        gm42.mo20674P(y + 1);
        int D = gm4.mo20662D();
        if ((D & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((D & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int D2 = gm4.mo20662D();
        String[] strArr = new String[D2];
        for (int i4 = 0; i4 < D2; i4++) {
            int e2 = gm4.mo20680e();
            int y2 = m29052y(gm4.mo20679d(), e2);
            strArr[i4] = new String(gm4.mo20679d(), e2, y2 - e2, "ISO-8859-1");
            gm42.mo20674P(y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = e + i;
        while (gm4.mo20680e() < i5) {
            Id3Frame k = m29038k(i2, gm42, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: j */
    public static CommentFrame m29037j(gm4 gm4, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int D = gm4.mo20662D();
        String v = m29049v(D);
        byte[] bArr = new byte[3];
        gm4.mo20685j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        gm4.mo20685j(bArr2, 0, i2);
        int x = m29051x(bArr2, 0, D);
        String str2 = new String(bArr2, 0, x, v);
        int u = x + m29048u(D);
        return new CommentFrame(str, str2, m29043p(bArr2, u, m29051x(bArr2, u, D), v));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.metadata.id3.Id3Frame m29038k(int r19, p000.gm4 r20, boolean r21, int r22, p000.vp2.C3504a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo20662D()
            int r9 = r20.mo20662D()
            int r10 = r20.mo20662D()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo20662D()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo20666H()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo20666H()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo20665G()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo20668J()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo20681f()
            r7.mo20674P(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo20680e()
            int r5 = r1 + r15
            int r1 = r20.mo20681f()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            p000.gk3.m18132i(r4, r0)
            int r0 = r20.mo20681f()
            r7.mo20674P(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo18389a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo20674P(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = r1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = r1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = r1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = r1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = r1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = r1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo20675Q(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo20675Q(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m29029A(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            androidx.media3.extractor.metadata.id3.TextInformationFrame r1 = m29045r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m29050w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r1 = m29044q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r1 = m29047t(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m29050w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r1 = m29046s(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            androidx.media3.extractor.metadata.id3.PrivFrame r1 = m29042o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            androidx.media3.extractor.metadata.id3.GeobFrame r1 = m29039l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            androidx.media3.extractor.metadata.id3.ApicFrame r1 = m29033f(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            androidx.media3.extractor.metadata.id3.CommentFrame r1 = m29037j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            androidx.media3.extractor.metadata.id3.ChapterFrame r1 = m29035h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            androidx.media3.extractor.metadata.id3.ChapterTocFrame r1 = m29036i(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            androidx.media3.extractor.metadata.id3.MlltFrame r1 = m29041n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = m29050w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            androidx.media3.extractor.metadata.id3.BinaryFrame r1 = m29034g(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = m29050w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            p000.gk3.m18132i(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.mo20674P(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            p000.gk3.m18132i(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo20674P(r14)
            return r16
        L_0x0221:
            r7.mo20674P(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            p000.gk3.m18132i(r12, r0)
            r7.mo20674P(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vp2.m29038k(int, gm4, boolean, int, vp2$a):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    /* renamed from: l */
    public static GeobFrame m29039l(gm4 gm4, int i) throws UnsupportedEncodingException {
        int D = gm4.mo20662D();
        String v = m29049v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        gm4.mo20685j(bArr, 0, i2);
        int y = m29052y(bArr, 0);
        String str = new String(bArr, 0, y, "ISO-8859-1");
        int i3 = y + 1;
        int x = m29051x(bArr, i3, D);
        String p = m29043p(bArr, i3, x, v);
        int u = x + m29048u(D);
        int x2 = m29051x(bArr, u, D);
        return new GeobFrame(str, p, m29043p(bArr, u, x2, v), m29032d(bArr, x2 + m29048u(D), i2));
    }

    /* renamed from: m */
    public static C3505b m29040m(gm4 gm4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (gm4.mo20676a() < 10) {
            gk3.m18132i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int G = gm4.mo20665G();
        boolean z5 = false;
        if (G != 4801587) {
            gk3.m18132i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(G)}));
            return null;
        }
        int D = gm4.mo20662D();
        gm4.mo20675Q(1);
        int D2 = gm4.mo20662D();
        int C = gm4.mo20661C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                gk3.m18132i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int n = gm4.mo20689n();
                gm4.mo20675Q(n);
                C -= n + 4;
            }
        } else if (D == 4) {
            if ((D2 & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int C2 = gm4.mo20661C();
                gm4.mo20675Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C -= 10;
            }
        } else {
            gk3.m18132i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + D);
            return null;
        }
        if (D < 4 && (D2 & 128) != 0) {
            z5 = true;
        }
        return new C3505b(D, z5, C);
    }

    /* renamed from: n */
    public static MlltFrame m29041n(gm4 gm4, int i) {
        int J = gm4.mo20668J();
        int G = gm4.mo20665G();
        int G2 = gm4.mo20665G();
        int D = gm4.mo20662D();
        int D2 = gm4.mo20662D();
        fm4 fm4 = new fm4();
        fm4.mo20009m(gm4);
        int i2 = ((i - 10) * 8) / (D + D2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = fm4.mo20004h(D);
            int h2 = fm4.mo20004h(D2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new MlltFrame(J, G, G2, iArr, iArr2);
    }

    /* renamed from: o */
    public static PrivFrame m29042o(gm4 gm4, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        gm4.mo20685j(bArr, 0, i);
        int y = m29052y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, y, "ISO-8859-1"), m29032d(bArr, y + 1, i));
    }

    /* renamed from: p */
    public static String m29043p(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* renamed from: q */
    public static TextInformationFrame m29044q(gm4 gm4, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = gm4.mo20662D();
        String v = m29049v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        gm4.mo20685j(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m29051x(bArr, 0, D), v));
    }

    /* renamed from: r */
    public static TextInformationFrame m29045r(gm4 gm4, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = gm4.mo20662D();
        String v = m29049v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        gm4.mo20685j(bArr, 0, i2);
        int x = m29051x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m29048u(D);
        return new TextInformationFrame("TXXX", str, m29043p(bArr, u, m29051x(bArr, u, D), v));
    }

    /* renamed from: s */
    public static UrlLinkFrame m29046s(gm4 gm4, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        gm4.mo20685j(bArr, 0, i);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m29052y(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: t */
    public static UrlLinkFrame m29047t(gm4 gm4, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int D = gm4.mo20662D();
        String v = m29049v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        gm4.mo20685j(bArr, 0, i2);
        int x = m29051x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m29048u(D);
        return new UrlLinkFrame("WXXX", str, m29043p(bArr, u, m29052y(bArr, u), "ISO-8859-1"));
    }

    /* renamed from: u */
    public static int m29048u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: v */
    public static String m29049v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: w */
    public static String m29050w(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: x */
    public static int m29051x(byte[] bArr, int i, int i2) {
        int y = m29052y(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return y;
        }
        while (y < bArr.length - 1) {
            if ((y - i) % 2 == 0 && bArr[y + 1] == 0) {
                return y;
            }
            y = m29052y(bArr, y + 1);
        }
        return bArr.length;
    }

    /* renamed from: y */
    public static int m29052y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m29053z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: b */
    public Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer) {
        return mo27289e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public Metadata mo27289e(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        gm4 gm4 = new gm4(bArr, i);
        C3505b m = m29040m(gm4);
        if (m == null) {
            return null;
        }
        int e = gm4.mo20680e();
        if (m.f18879a == 2) {
            i2 = 6;
        } else {
            i2 = 10;
        }
        int b = m.f18881c;
        if (m.f18880b) {
            b = m29029A(gm4, m.f18881c);
        }
        gm4.mo20673O(e + b);
        boolean z = false;
        if (!m29030B(gm4, m.f18879a, i2, false)) {
            if (m.f18879a != 4 || !m29030B(gm4, 4, i2, true)) {
                gk3.m18132i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m.f18879a);
                return null;
            }
            z = true;
        }
        while (gm4.mo20676a() >= i2) {
            Id3Frame k = m29038k(m.f18879a, gm4, z, i2, this.f18878a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public vp2(C3504a aVar) {
        this.f18878a = aVar;
    }
}
