package p000;

import android.util.Base64;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0973i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C0020ag;
import p000.bq4;

/* renamed from: k91 */
/* compiled from: DefaultPlaybackSessionManager */
public final class k91 implements bq4 {

    /* renamed from: h */
    public static final rd6<String> f14003h = new j91();

    /* renamed from: i */
    public static final Random f14004i = new Random();

    /* renamed from: a */
    public final C0831s.C0835d f14005a;

    /* renamed from: b */
    public final C0831s.C0833b f14006b;

    /* renamed from: c */
    public final HashMap<String, C2649a> f14007c;

    /* renamed from: d */
    public final rd6<String> f14008d;

    /* renamed from: e */
    public bq4.C1643a f14009e;

    /* renamed from: f */
    public C0831s f14010f;

    /* renamed from: g */
    public String f14011g;

    /* renamed from: k91$a */
    /* compiled from: DefaultPlaybackSessionManager */
    public final class C2649a {

        /* renamed from: a */
        public final String f14012a;

        /* renamed from: b */
        public int f14013b;

        /* renamed from: c */
        public long f14014c;

        /* renamed from: d */
        public C0973i.C0975b f14015d;

        /* renamed from: e */
        public boolean f14016e;

        /* renamed from: f */
        public boolean f14017f;

        public C2649a(String str, int i, C0973i.C0975b bVar) {
            long j;
            this.f14012a = str;
            this.f14013b = i;
            if (bVar == null) {
                j = -1;
            } else {
                j = bVar.f15662d;
            }
            this.f14014c = j;
            if (bVar != null && bVar.mo23781b()) {
                this.f14015d = bVar;
            }
        }

        /* renamed from: i */
        public boolean mo22227i(int i, C0973i.C0975b bVar) {
            if (bVar != null) {
                C0973i.C0975b bVar2 = this.f14015d;
                if (bVar2 == null) {
                    if (bVar.mo23781b() || bVar.f15662d != this.f14014c) {
                        return false;
                    }
                    return true;
                } else if (bVar.f15662d == bVar2.f15662d && bVar.f15660b == bVar2.f15660b && bVar.f15661c == bVar2.f15661c) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == this.f14013b) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: j */
        public boolean mo22228j(C0020ag.C0021a aVar) {
            long j = this.f14014c;
            if (j == -1) {
                return false;
            }
            C0973i.C0975b bVar = aVar.f118d;
            if (bVar == null) {
                if (this.f14013b != aVar.f117c) {
                    return true;
                }
                return false;
            } else if (bVar.f15662d > j) {
                return true;
            } else {
                if (this.f14015d == null) {
                    return false;
                }
                int f = aVar.f116b.mo6867f(bVar.f15659a);
                int f2 = aVar.f116b.mo6867f(this.f14015d.f15659a);
                C0973i.C0975b bVar2 = aVar.f118d;
                if (bVar2.f15662d < this.f14015d.f15662d || f < f2) {
                    return false;
                }
                if (f > f2) {
                    return true;
                }
                if (bVar2.mo23781b()) {
                    C0973i.C0975b bVar3 = aVar.f118d;
                    int i = bVar3.f15660b;
                    int i2 = bVar3.f15661c;
                    C0973i.C0975b bVar4 = this.f14015d;
                    int i3 = bVar4.f15660b;
                    if (i > i3 || (i == i3 && i2 > bVar4.f15661c)) {
                        return true;
                    }
                    return false;
                }
                int i4 = aVar.f118d.f15663e;
                if (i4 == -1 || i4 > this.f14015d.f15660b) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: k */
        public void mo22229k(int i, C0973i.C0975b bVar) {
            if (this.f14014c == -1 && i == this.f14013b && bVar != null) {
                this.f14014c = bVar.f15662d;
            }
        }

        /* renamed from: l */
        public final int mo22230l(C0831s sVar, C0831s sVar2, int i) {
            if (i < sVar.mo6882t()) {
                sVar.mo6880r(i, k91.this.f14005a);
                for (int i2 = k91.this.f14005a.f4456L; i2 <= k91.this.f14005a.f4457M; i2++) {
                    int f = sVar2.mo6867f(sVar.mo6879q(i2));
                    if (f != -1) {
                        return sVar2.mo6872j(f, k91.this.f14006b).f4438e;
                    }
                }
                return -1;
            } else if (i < sVar2.mo6882t()) {
                return i;
            } else {
                return -1;
            }
        }

        /* renamed from: m */
        public boolean mo22231m(C0831s sVar, C0831s sVar2) {
            int l = mo22230l(sVar, sVar2, this.f14013b);
            this.f14013b = l;
            if (l == -1) {
                return false;
            }
            C0973i.C0975b bVar = this.f14015d;
            if (bVar == null) {
                return true;
            }
            if (sVar2.mo6867f(bVar.f15659a) != -1) {
                return true;
            }
            return false;
        }
    }

    public k91() {
        this(f14003h);
    }

    /* renamed from: k */
    public static String m20576k() {
        byte[] bArr = new byte[12];
        f14004i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: a */
    public synchronized String mo11772a() {
        return this.f14011g;
    }

    /* renamed from: b */
    public synchronized String mo11773b(C0831s sVar, C0973i.C0975b bVar) {
        return mo22225l(sVar.mo6874l(bVar.f15659a, this.f14006b).f4438e, bVar).f14012a;
    }

    /* renamed from: c */
    public synchronized void mo11774c(C0020ag.C0021a aVar) {
        C2725kr.m20985e(this.f14009e);
        C0831s sVar = this.f14010f;
        this.f14010f = aVar.f116b;
        Iterator<C2649a> it = this.f14007c.values().iterator();
        while (it.hasNext()) {
            C2649a next = it.next();
            if (!next.mo22231m(sVar, this.f14010f) || next.mo22228j(aVar)) {
                it.remove();
                if (next.f14016e) {
                    if (next.f14012a.equals(this.f14011g)) {
                        this.f14011g = null;
                    }
                    this.f14009e.mo11780K(aVar, next.f14012a, false);
                }
            }
        }
        mo22226m(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo11775d(p000.C0020ag.C0021a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            bq4$a r2 = r1.f14009e     // Catch:{ all -> 0x0118 }
            p000.C2725kr.m20985e(r2)     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s r2 = r0.f116b     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.mo6883u()     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap<java.lang.String, k91$a> r2 = r1.f14007c     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f14011g     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0118 }
            k91$a r2 = (p000.k91.C2649a) r2     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r3 = r0.f118d     // Catch:{ all -> 0x0118 }
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            long r5 = r2.f14014c     // Catch:{ all -> 0x0118 }
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 0
            if (r3 != 0) goto L_0x003a
            int r2 = r2.f14013b     // Catch:{ all -> 0x0118 }
            int r3 = r0.f117c     // Catch:{ all -> 0x0118 }
            if (r2 == r3) goto L_0x0047
        L_0x0038:
            r5 = r4
            goto L_0x0047
        L_0x003a:
            androidx.media3.exoplayer.source.i$b r3 = r0.f118d     // Catch:{ all -> 0x0118 }
            long r6 = r3.f15662d     // Catch:{ all -> 0x0118 }
            long r2 = r2.f14014c     // Catch:{ all -> 0x0118 }
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            if (r5 == 0) goto L_0x004b
            monitor-exit(r24)
            return
        L_0x004b:
            int r2 = r0.f117c     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r3 = r0.f118d     // Catch:{ all -> 0x0118 }
            k91$a r2 = r1.mo22225l(r2, r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f14011g     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = r2.f14012a     // Catch:{ all -> 0x0118 }
            r1.f14011g = r3     // Catch:{ all -> 0x0118 }
        L_0x005d:
            androidx.media3.exoplayer.source.i$b r3 = r0.f118d     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r3.mo23781b()     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            androidx.media3.exoplayer.source.i$b r10 = new androidx.media3.exoplayer.source.i$b     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r3 = r0.f118d     // Catch:{ all -> 0x0118 }
            java.lang.Object r5 = r3.f15659a     // Catch:{ all -> 0x0118 }
            long r6 = r3.f15662d     // Catch:{ all -> 0x0118 }
            int r3 = r3.f15660b     // Catch:{ all -> 0x0118 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0118 }
            int r3 = r0.f117c     // Catch:{ all -> 0x0118 }
            k91$a r3 = r1.mo22225l(r3, r10)     // Catch:{ all -> 0x0118 }
            boolean r5 = r3.f14016e     // Catch:{ all -> 0x0118 }
            if (r5 != 0) goto L_0x00d9
            boolean unused = r3.f14016e = r4     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s r5 = r0.f116b     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r6 = r0.f118d     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r6.f15659a     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s$b r7 = r1.f14006b     // Catch:{ all -> 0x0118 }
            r5.mo6874l(r6, r7)     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s$b r5 = r1.f14006b     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r6 = r0.f118d     // Catch:{ all -> 0x0118 }
            int r6 = r6.f15660b     // Catch:{ all -> 0x0118 }
            long r5 = r5.mo6893i(r6)     // Catch:{ all -> 0x0118 }
            long r5 = p000.w67.m29335U0(r5)     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s$b r7 = r1.f14006b     // Catch:{ all -> 0x0118 }
            long r7 = r7.mo6900p()     // Catch:{ all -> 0x0118 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0118 }
            ag$a r15 = new ag$a     // Catch:{ all -> 0x0118 }
            long r6 = r0.f115a     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s r8 = r0.f116b     // Catch:{ all -> 0x0118 }
            int r9 = r0.f117c     // Catch:{ all -> 0x0118 }
            androidx.media3.common.s r13 = r0.f120f     // Catch:{ all -> 0x0118 }
            int r14 = r0.f121g     // Catch:{ all -> 0x0118 }
            androidx.media3.exoplayer.source.i$b r5 = r0.f122h     // Catch:{ all -> 0x0118 }
            r16 = r5
            long r4 = r0.f123i     // Catch:{ all -> 0x0118 }
            r20 = r2
            r21 = r3
            long r2 = r0.f124j     // Catch:{ all -> 0x0118 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0118 }
            bq4$a r2 = r1.f14009e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r21.f14012a     // Catch:{ all -> 0x0118 }
            r2.mo11779H(r0, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00db
        L_0x00d9:
            r20 = r2
        L_0x00db:
            boolean r0 = r20.f14016e     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00f3
            r0 = r20
            r2 = 1
            boolean unused = r0.f14016e = r2     // Catch:{ all -> 0x0118 }
            bq4$a r2 = r1.f14009e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r0.f14012a     // Catch:{ all -> 0x0118 }
            r4 = r25
            r2.mo11779H(r4, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00f7
        L_0x00f3:
            r4 = r25
            r0 = r20
        L_0x00f7:
            java.lang.String r2 = r0.f14012a     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f14011g     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.f14017f     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0116
            r2 = 1
            boolean unused = r0.f14017f = r2     // Catch:{ all -> 0x0118 }
            bq4$a r2 = r1.f14009e     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.f14012a     // Catch:{ all -> 0x0118 }
            r2.mo11781q(r4, r0)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r24)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k91.mo11775d(ag$a):void");
    }

    /* renamed from: e */
    public synchronized void mo11776e(C0020ag.C0021a aVar, int i) {
        boolean z;
        boolean z2;
        C2725kr.m20985e(this.f14009e);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator<C2649a> it = this.f14007c.values().iterator();
        while (it.hasNext()) {
            C2649a next = it.next();
            if (next.mo22228j(aVar)) {
                it.remove();
                if (next.f14016e) {
                    boolean equals = next.f14012a.equals(this.f14011g);
                    if (!z || !equals || !next.f14017f) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (equals) {
                        this.f14011g = null;
                    }
                    this.f14009e.mo11780K(aVar, next.f14012a, z2);
                }
            }
        }
        mo22226m(aVar);
    }

    /* renamed from: f */
    public synchronized void mo11777f(C0020ag.C0021a aVar) {
        bq4.C1643a aVar2;
        this.f14011g = null;
        Iterator<C2649a> it = this.f14007c.values().iterator();
        while (it.hasNext()) {
            C2649a next = it.next();
            it.remove();
            if (next.f14016e && (aVar2 = this.f14009e) != null) {
                aVar2.mo11780K(aVar, next.f14012a, false);
            }
        }
    }

    /* renamed from: g */
    public void mo11778g(bq4.C1643a aVar) {
        this.f14009e = aVar;
    }

    /* renamed from: l */
    public final C2649a mo22225l(int i, C0973i.C0975b bVar) {
        int i2;
        C2649a aVar = null;
        long j = Long.MAX_VALUE;
        for (C2649a next : this.f14007c.values()) {
            next.mo22229k(i, bVar);
            if (next.mo22227i(i, bVar)) {
                long b = next.f14014c;
                if (b == -1 || b < j) {
                    aVar = next;
                    j = b;
                } else if (!(i2 != 0 || ((C2649a) w67.m29360j(aVar)).f14015d == null || next.f14015d == null)) {
                    aVar = next;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f14008d.get();
        C2649a aVar2 = new C2649a(str, i, bVar);
        this.f14007c.put(str, aVar2);
        return aVar2;
    }

    @RequiresNonNull({"listener"})
    /* renamed from: m */
    public final void mo22226m(C0020ag.C0021a aVar) {
        if (aVar.f116b.mo6883u()) {
            this.f14011g = null;
            return;
        }
        C2649a aVar2 = this.f14007c.get(this.f14011g);
        C2649a l = mo22225l(aVar.f117c, aVar.f118d);
        this.f14011g = l.f14012a;
        mo11775d(aVar);
        C0973i.C0975b bVar = aVar.f118d;
        if (bVar != null && bVar.mo23781b()) {
            if (aVar2 == null || aVar2.f14014c != aVar.f118d.f15662d || aVar2.f14015d == null || aVar2.f14015d.f15660b != aVar.f118d.f15660b || aVar2.f14015d.f15661c != aVar.f118d.f15661c) {
                C0973i.C0975b bVar2 = aVar.f118d;
                this.f14009e.mo11782v(aVar, mo22225l(aVar.f117c, new C0973i.C0975b(bVar2.f15659a, bVar2.f15662d)).f14012a, l.f14012a);
            }
        }
    }

    public k91(rd6<String> rd6) {
        this.f14008d = rd6;
        this.f14005a = new C0831s.C0835d();
        this.f14006b = new C0831s.C0833b();
        this.f14007c = new HashMap<>();
        this.f14010f = C0831s.f4433a;
    }
}
