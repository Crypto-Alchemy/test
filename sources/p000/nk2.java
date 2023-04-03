package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nk2 */
public class nk2 extends od3 {

    /* renamed from: d */
    public final int f43491d;

    /* renamed from: e */
    public final boolean f43492e;

    /* renamed from: g */
    public List<pd3> f43493g;

    /* renamed from: k */
    public List<rd3> f43494k;

    /* renamed from: r */
    public final long f43495r;

    /* renamed from: s */
    public long f43496s = 0;

    /* renamed from: x */
    public ok2 f43497x;

    public nk2(int i, List<pd3> list, List<rd3> list2, long j, long j2, boolean z) {
        super(true);
        this.f43491d = i;
        this.f43493g = Collections.unmodifiableList(list);
        this.f43494k = Collections.unmodifiableList(list2);
        this.f43496s = j;
        this.f43495r = j2;
        this.f43492e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.nk2 m69788c(java.lang.Object r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof p000.nk2
            if (r0 == 0) goto L_0x0007
            nk2 r11 = (p000.nk2) r11
            return r11
        L_0x0007:
            boolean r0 = r11 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0059
            r0 = r11
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0051
            int r3 = r0.readInt()
            long r6 = r0.readLong()
            long r8 = r0.readLong()
            boolean r10 = r0.readBoolean()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r1 = r0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            pd3 r2 = p000.pd3.m70985h(r11)
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r3 + -1
            if (r0 >= r1) goto L_0x004a
            rd3 r1 = p000.rd3.m71510a(r11)
            r5.add(r1)
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004a:
            nk2 r11 = new nk2
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            return r11
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown version for hss private key"
            r11.<init>(r0)
            throw r11
        L_0x0059:
            boolean r0 = r11 instanceof byte[]
            if (r0 == 0) goto L_0x007c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0075 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0075 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x0075 }
            r2.<init>(r11)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            nk2 r11 = m69788c(r1)     // Catch:{ all -> 0x0072 }
            r1.close()
            return r11
        L_0x0072:
            r11 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0075:
            r11 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()
        L_0x007b:
            throw r11
        L_0x007c:
            boolean r0 = r11 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r11 = (java.io.InputStream) r11
            byte[] r11 = p000.ya6.m74322c(r11)
            nk2 r11 = m69788c(r11)
            return r11
        L_0x008b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nk2.m69788c(java.lang.Object):nk2");
    }

    /* renamed from: d */
    public static nk2 m69789d(byte[] bArr, byte[] bArr2) throws IOException {
        nk2 c = m69788c(bArr);
        c.f43497x = ok2.m70298a(bArr2);
        return c;
    }

    /* renamed from: k */
    public static nk2 m69790k(nk2 nk2) {
        try {
            return m69788c(nk2.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public nk2 mo62702a(int i) {
        nk2 k;
        synchronized (this) {
            long j = (long) i;
            if (mo62712j() >= j) {
                long j2 = this.f43496s;
                this.f43496s = j + j2;
                ArrayList arrayList = new ArrayList(mo62705e());
                ArrayList arrayList2 = new ArrayList(mo62711i());
                k = m69790k(new nk2(this.f43491d, arrayList, arrayList2, j2, j2 + j, true));
                mo62713l();
            } else {
                throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
            }
        }
        return k;
    }

    /* renamed from: b */
    public synchronized long mo62703b() {
        return this.f43496s;
    }

    public Object clone() throws CloneNotSupportedException {
        return m69790k(this);
    }

    /* renamed from: e */
    public synchronized List<pd3> mo62705e() {
        return this.f43493g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nk2 nk2 = (nk2) obj;
        if (this.f43491d == nk2.f43491d && this.f43492e == nk2.f43492e && this.f43495r == nk2.f43495r && this.f43496s == nk2.f43496s && this.f43493g.equals(nk2.f43493g)) {
            return this.f43494k.equals(nk2.f43494k);
        }
        return false;
    }

    /* renamed from: f */
    public int mo62707f() {
        return this.f43491d;
    }

    /* renamed from: g */
    public synchronized ok2 mo62708g() {
        return new ok2(this.f43491d, mo62709h().mo65289m());
    }

    public synchronized byte[] getEncoded() throws IOException {
        on0 a;
        a = on0.m70404f().mo64504i(0).mo64504i(this.f43491d).mo64505j(this.f43496s).mo64505j(this.f43495r).mo64497a(this.f43492e);
        for (pd3 c : this.f43493g) {
            a.mo64499c(c);
        }
        for (rd3 c2 : this.f43494k) {
            a.mo64499c(c2);
        }
        return a.mo64498b();
    }

    /* renamed from: h */
    public pd3 mo62709h() {
        return this.f43493g.get(0);
    }

    public int hashCode() {
        long j = this.f43495r;
        long j2 = this.f43496s;
        return (((((((((this.f43491d * 31) + (this.f43492e ? 1 : 0)) * 31) + this.f43493g.hashCode()) * 31) + this.f43494k.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    /* renamed from: i */
    public synchronized List<rd3> mo62711i() {
        return this.f43494k;
    }

    /* renamed from: j */
    public long mo62712j() {
        return this.f43495r - this.f43496s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00d1, code lost:
        if (r3[r9] == ((long) (r4[r9].mo65284g() - 1))) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0130  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62713l() {
        /*
            r18 = this;
            r0 = r18
            java.util.List r1 = r18.mo62705e()
            int r2 = r1.size()
            long[] r3 = new long[r2]
            long r4 = r18.mo62703b()
            int r6 = r1.size()
            r7 = 1
            int r6 = r6 - r7
        L_0x0016:
            if (r6 < 0) goto L_0x0035
            java.lang.Object r8 = r1.get(r6)
            pd3 r8 = (p000.pd3) r8
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r8 = r8.mo65290n()
            int r9 = r8.mo64589c()
            int r9 = r7 << r9
            int r9 = r9 - r7
            long r9 = (long) r9
            long r9 = r9 & r4
            r3[r6] = r9
            int r8 = r8.mo64589c()
            long r4 = r4 >>> r8
            int r6 = r6 + -1
            goto L_0x0016
        L_0x0035:
            int r4 = r1.size()
            pd3[] r4 = new p000.pd3[r4]
            java.lang.Object[] r4 = r1.toArray(r4)
            pd3[] r4 = (p000.pd3[]) r4
            java.util.List<rd3> r5 = r0.f43494k
            int r6 = r5.size()
            rd3[] r6 = new p000.rd3[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            rd3[] r5 = (p000.rd3[]) r5
            pd3 r6 = r18.mo62709h()
            r8 = 0
            r9 = r4[r8]
            int r9 = r9.mo65284g()
            int r9 = r9 - r7
            long r9 = (long) r9
            r11 = r3[r8]
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x007d
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r9 = r6.mo65290n()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r10 = r6.mo65288l()
            r11 = r3[r8]
            int r11 = (int) r11
            byte[] r12 = r6.mo65283f()
            byte[] r6 = r6.mo65286j()
            pd3 r6 = p000.ld3.m63803a(r9, r10, r11, r12, r6)
            r4[r8] = r6
            r6 = r7
            goto L_0x007e
        L_0x007d:
            r6 = r8
        L_0x007e:
            r9 = r7
        L_0x007f:
            if (r9 >= r2) goto L_0x0156
            int r10 = r9 + -1
            r11 = r4[r10]
            r12 = 16
            byte[] r13 = new byte[r12]
            r14 = 32
            byte[] r15 = new byte[r14]
            ws5 r12 = new ws5
            byte[] r8 = r11.mo65283f()
            byte[] r14 = r11.mo65286j()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r11 = r11.mo65288l()
            p4 r11 = r11.mo64582b()
            ig1 r11 = p000.mg1.m64327a(r11)
            r12.<init>(r8, r14, r11)
            r7 = r3[r10]
            int r7 = (int) r7
            r12.mo66769e(r7)
            r7 = -2
            r12.mo66768d(r7)
            r7 = 1
            r12.mo66765a(r15, r7)
            r8 = 32
            byte[] r8 = new byte[r8]
            r11 = 0
            r12.mo66765a(r8, r11)
            r12 = 16
            java.lang.System.arraycopy(r8, r11, r13, r11, r12)
            int r8 = r2 + -1
            if (r9 >= r8) goto L_0x00d4
            r16 = r3[r9]
            r8 = r4[r9]
            int r8 = r8.mo65284g()
            int r8 = r8 - r7
            long r7 = (long) r8
            int r7 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00e4
            goto L_0x00e1
        L_0x00d4:
            r7 = r3[r9]
            r14 = r4[r9]
            int r14 = r14.mo65284g()
            long r11 = (long) r14
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x00e3
        L_0x00e1:
            r11 = 1
            goto L_0x00e4
        L_0x00e3:
            r11 = 0
        L_0x00e4:
            r7 = r4[r9]
            byte[] r7 = r7.mo65283f()
            boolean r7 = p000.C9367tq.m72417a(r13, r7)
            if (r7 == 0) goto L_0x00fe
            r7 = r4[r9]
            byte[] r7 = r7.mo65286j()
            boolean r7 = p000.C9367tq.m72417a(r15, r7)
            if (r7 == 0) goto L_0x00fe
            r7 = 1
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            if (r7 != 0) goto L_0x0130
            java.lang.Object r6 = r1.get(r9)
            pd3 r6 = (p000.pd3) r6
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r6 = r6.mo65290n()
            java.lang.Object r7 = r1.get(r9)
            pd3 r7 = (p000.pd3) r7
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r7 = r7.mo65288l()
            r11 = r3[r9]
            int r8 = (int) r11
            pd3 r6 = p000.ld3.m63803a(r6, r7, r8, r13, r15)
            r4[r9] = r6
            r7 = r4[r10]
            qd3 r6 = r6.mo65289m()
            byte[] r6 = r6.mo65460b()
            rd3 r6 = p000.ld3.m63805c(r7, r6)
            r5[r10] = r6
        L_0x012e:
            r6 = 1
            goto L_0x0150
        L_0x0130:
            if (r11 != 0) goto L_0x0150
            java.lang.Object r6 = r1.get(r9)
            pd3 r6 = (p000.pd3) r6
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r6 = r6.mo65290n()
            java.lang.Object r7 = r1.get(r9)
            pd3 r7 = (p000.pd3) r7
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r7 = r7.mo65288l()
            r10 = r3[r9]
            int r8 = (int) r10
            pd3 r6 = p000.ld3.m63803a(r6, r7, r8, r13, r15)
            r4[r9] = r6
            goto L_0x012e
        L_0x0150:
            int r9 = r9 + 1
            r7 = 1
            r8 = 0
            goto L_0x007f
        L_0x0156:
            if (r6 == 0) goto L_0x015b
            r0.mo62714m(r4, r5)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nk2.mo62713l():void");
    }

    /* renamed from: m */
    public void mo62714m(pd3[] pd3Arr, rd3[] rd3Arr) {
        synchronized (this) {
            this.f43493g = Collections.unmodifiableList(Arrays.asList(pd3Arr));
            this.f43494k = Collections.unmodifiableList(Arrays.asList(rd3Arr));
        }
    }
}
