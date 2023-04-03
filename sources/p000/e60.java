package p000;

import androidx.media3.exoplayer.source.C0984l;
import java.io.IOException;

/* renamed from: e60 */
/* compiled from: BundledExtractorsAdapter */
public final class e60 implements C0984l {

    /* renamed from: a */
    public final ny1 f11059a;

    /* renamed from: b */
    public hy1 f11060b;

    /* renamed from: c */
    public iy1 f11061c;

    public e60(ny1 ny1) {
        this.f11059a = ny1;
    }

    /* renamed from: a */
    public void mo7687a() {
        hy1 hy1 = this.f11060b;
        if (hy1 != null) {
            hy1.mo151a();
            this.f11060b = null;
        }
        this.f11061c = null;
    }

    /* renamed from: b */
    public void mo7688b(long j, long j2) {
        ((hy1) C2725kr.m20985e(this.f11060b)).mo152b(j, j2);
    }

    /* renamed from: c */
    public void mo7689c() {
        hy1 hy1 = this.f11060b;
        if (hy1 instanceof dz3) {
            ((dz3) hy1).mo19019k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.getPosition() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.getPosition() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7690d(p000.u11 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p000.jy1 r15) throws java.io.IOException {
        /*
            r7 = this;
            a81 r6 = new a81
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f11061c = r6
            hy1 r8 = r7.f11060b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            ny1 r8 = r7.f11059a
            hy1[] r8 = r8.mo111a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f11060b = r8
            goto L_0x0074
        L_0x0020:
            int r10 = r8.length
            r0 = r13
        L_0x0022:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.mo155e(r6)     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r7.f11060b = r1     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            p000.C2725kr.m20987g(r14)
            r6.mo85e()
            goto L_0x0070
        L_0x0035:
            hy1 r1 = r7.f11060b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0042:
            r8 = move-exception
            hy1 r9 = r7.f11060b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0050
        L_0x004f:
            r13 = r14
        L_0x0050:
            p000.C2725kr.m20987g(r13)
            r6.mo85e()
            throw r8
        L_0x0057:
            hy1 r1 = r7.f11060b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = r13
            goto L_0x0067
        L_0x0066:
            r1 = r14
        L_0x0067:
            p000.C2725kr.m20987g(r1)
            r6.mo85e()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0070:
            hy1 r10 = r7.f11060b
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            hy1 r8 = r7.f11060b
            r8.mo159j(r15)
            return
        L_0x007a:
            androidx.media3.exoplayer.source.UnrecognizedInputFormatException r10 = new androidx.media3.exoplayer.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p000.w67.m29310I(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p000.C2725kr.m20985e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e60.mo7690d(u11, android.net.Uri, java.util.Map, long, long, jy1):void");
    }

    /* renamed from: e */
    public long mo7691e() {
        iy1 iy1 = this.f11061c;
        if (iy1 != null) {
            return iy1.getPosition();
        }
        return -1;
    }

    /* renamed from: f */
    public int mo7692f(mt4 mt4) throws IOException {
        return ((hy1) C2725kr.m20985e(this.f11060b)).mo154d((iy1) C2725kr.m20985e(this.f11061c), mt4);
    }
}
