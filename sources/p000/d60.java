package p000;

import android.util.SparseArray;
import androidx.media3.common.C0792h;
import java.io.IOException;
import p000.qe0;
import p000.zs6;

/* renamed from: d60 */
/* compiled from: BundledChunkExtractor */
public final class d60 implements jy1, qe0 {

    /* renamed from: A */
    public static final qe0.C3138a f10502A = new c60();

    /* renamed from: B */
    public static final mt4 f10503B = new mt4();

    /* renamed from: a */
    public final hy1 f10504a;

    /* renamed from: d */
    public final int f10505d;

    /* renamed from: e */
    public final C0792h f10506e;

    /* renamed from: g */
    public final SparseArray<C2136a> f10507g = new SparseArray<>();

    /* renamed from: k */
    public boolean f10508k;

    /* renamed from: r */
    public qe0.C3139b f10509r;

    /* renamed from: s */
    public long f10510s;

    /* renamed from: x */
    public xs5 f10511x;

    /* renamed from: y */
    public C0792h[] f10512y;

    /* renamed from: d60$a */
    /* compiled from: BundledChunkExtractor */
    public static final class C2136a implements zs6 {

        /* renamed from: a */
        public final int f10513a;

        /* renamed from: b */
        public final int f10514b;

        /* renamed from: c */
        public final C0792h f10515c;

        /* renamed from: d */
        public final cl1 f10516d = new cl1();

        /* renamed from: e */
        public C0792h f10517e;

        /* renamed from: f */
        public zs6 f10518f;

        /* renamed from: g */
        public long f10519g;

        public C2136a(int i, int i2, C0792h hVar) {
            this.f10513a = i;
            this.f10514b = i2;
            this.f10515c = hVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo7300a(gm4 gm4, int i) {
            ys6.m30779b(this, gm4, i);
        }

        /* renamed from: b */
        public void mo7301b(long j, int i, int i2, int i3, zs6.C3758a aVar) {
            long j2 = this.f10519g;
            if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j >= j2) {
                this.f10518f = this.f10516d;
            }
            ((zs6) w67.m29360j(this.f10518f)).mo7301b(j, i, i2, i3, aVar);
        }

        /* renamed from: c */
        public void mo7302c(gm4 gm4, int i, int i2) {
            ((zs6) w67.m29360j(this.f10518f)).mo7300a(gm4, i);
        }

        /* renamed from: d */
        public void mo7303d(C0792h hVar) {
            C0792h hVar2 = this.f10515c;
            if (hVar2 != null) {
                hVar = hVar.mo6642j(hVar2);
            }
            this.f10517e = hVar;
            ((zs6) w67.m29360j(this.f10518f)).mo7303d(this.f10517e);
        }

        /* renamed from: e */
        public /* synthetic */ int mo7304e(u11 u11, int i, boolean z) {
            return ys6.m30778a(this, u11, i, z);
        }

        /* renamed from: f */
        public int mo7305f(u11 u11, int i, boolean z, int i2) throws IOException {
            return ((zs6) w67.m29360j(this.f10518f)).mo7304e(u11, i, z);
        }

        /* renamed from: g */
        public void mo18529g(qe0.C3139b bVar, long j) {
            if (bVar == null) {
                this.f10518f = this.f10516d;
                return;
            }
            this.f10519g = j;
            zs6 f = bVar.mo25075f(this.f10513a, this.f10514b);
            this.f10518f = f;
            C0792h hVar = this.f10517e;
            if (hVar != null) {
                f.mo7303d(hVar);
            }
        }
    }

    public d60(hy1 hy1, int i, C0792h hVar) {
        this.f10504a = hy1;
        this.f10505d = i;
        this.f10506e = hVar;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [mp3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p000.qe0 m14803i(int r6, androidx.media3.common.C0792h r7, boolean r8, java.util.List r9, p000.zs6 r10, p000.br4 r11) {
        /*
            java.lang.String r11 = r7.f4174B
            boolean r0 = p000.vv3.m29142p(r11)
            if (r0 == 0) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            boolean r11 = p000.vv3.m29141o(r11)
            if (r11 == 0) goto L_0x0017
            mp3 r8 = new mp3
            r9 = 1
            r8.<init>(r9)
            goto L_0x0026
        L_0x0017:
            r11 = 0
            if (r8 == 0) goto L_0x001b
            r11 = 4
        L_0x001b:
            r1 = r11
            sb2 r8 = new sb2
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0026:
            d60 r9 = new d60
            r9.<init>(r8, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d60.m14803i(int, androidx.media3.common.h, boolean, java.util.List, zs6, br4):qe0");
    }

    /* renamed from: a */
    public void mo18524a() {
        this.f10504a.mo151a();
    }

    /* renamed from: b */
    public boolean mo18525b(iy1 iy1) throws IOException {
        boolean z;
        int d = this.f10504a.mo154d(iy1, f10503B);
        if (d != 1) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo18526c(qe0.C3139b bVar, long j, long j2) {
        this.f10509r = bVar;
        this.f10510s = j2;
        if (!this.f10508k) {
            this.f10504a.mo159j(this);
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f10504a.mo152b(0, j);
            }
            this.f10508k = true;
            return;
        }
        hy1 hy1 = this.f10504a;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = 0;
        }
        hy1.mo152b(0, j);
        for (int i = 0; i < this.f10507g.size(); i++) {
            this.f10507g.valueAt(i).mo18529g(bVar, j2);
        }
    }

    /* renamed from: d */
    public se0 mo18527d() {
        xs5 xs5 = this.f10511x;
        if (xs5 instanceof se0) {
            return (se0) xs5;
        }
        return null;
    }

    /* renamed from: e */
    public C0792h[] mo18528e() {
        return this.f10512y;
    }

    /* renamed from: f */
    public zs6 mo7713f(int i, int i2) {
        boolean z;
        C0792h hVar;
        C2136a aVar = this.f10507g.get(i);
        if (aVar == null) {
            if (this.f10512y == null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            if (i2 == this.f10505d) {
                hVar = this.f10506e;
            } else {
                hVar = null;
            }
            aVar = new C2136a(i, i2, hVar);
            aVar.mo18529g(this.f10509r, this.f10510s);
            this.f10507g.put(i, aVar);
        }
        return aVar;
    }

    /* renamed from: g */
    public void mo7715g(xs5 xs5) {
        this.f10511x = xs5;
    }

    /* renamed from: p */
    public void mo7722p() {
        C0792h[] hVarArr = new C0792h[this.f10507g.size()];
        for (int i = 0; i < this.f10507g.size(); i++) {
            hVarArr[i] = (C0792h) C2725kr.m20989i(this.f10507g.valueAt(i).f10517e);
        }
        this.f10512y = hVarArr;
    }
}
