package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.drm.C0908a;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0984l;
import androidx.media3.exoplayer.source.C0986m;
import androidx.media3.exoplayer.upstream.C1018a;
import androidx.media3.exoplayer.upstream.C1019b;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.source.n */
/* compiled from: ProgressiveMediaSource */
public final class C0992n extends C0955a implements C0986m.C0988b {

    /* renamed from: h */
    public final C0798k f5344h;

    /* renamed from: i */
    public final C0798k.C0809h f5345i;

    /* renamed from: j */
    public final x11.C3565a f5346j;

    /* renamed from: k */
    public final C0984l.C0985a f5347k;

    /* renamed from: l */
    public final C0912c f5348l;

    /* renamed from: m */
    public final C1019b f5349m;

    /* renamed from: n */
    public final int f5350n;

    /* renamed from: o */
    public boolean f5351o;

    /* renamed from: p */
    public long f5352p;

    /* renamed from: q */
    public boolean f5353q;

    /* renamed from: r */
    public boolean f5354r;

    /* renamed from: s */
    public ov6 f5355s;

    /* renamed from: androidx.media3.exoplayer.source.n$a */
    /* compiled from: ProgressiveMediaSource */
    public class C0993a extends r82 {
        public C0993a(C0992n nVar, C0831s sVar) {
            super(sVar);
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            super.mo6873k(i, bVar, z);
            bVar.f4441r = true;
            return bVar;
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            super.mo6881s(i, dVar, j);
            dVar.f4453C = true;
            return dVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.n$b */
    /* compiled from: ProgressiveMediaSource */
    public static final class C0994b implements C0973i.C0974a {

        /* renamed from: a */
        public final x11.C3565a f5356a;

        /* renamed from: b */
        public C0984l.C0985a f5357b;

        /* renamed from: c */
        public rk1 f5358c;

        /* renamed from: d */
        public C1019b f5359d;

        /* renamed from: e */
        public int f5360e;

        /* renamed from: f */
        public String f5361f;

        /* renamed from: g */
        public Object f5362g;

        public C0994b(x11.C3565a aVar, ny1 ny1) {
            this(aVar, (C0984l.C0985a) new ww4(ny1));
        }

        /* renamed from: f */
        public static /* synthetic */ C0984l m7395f(ny1 ny1, br4 br4) {
            return new e60(ny1);
        }

        /* renamed from: e */
        public C0992n mo7206a(C0798k kVar) {
            boolean z;
            C2725kr.m20985e(kVar.f4244d);
            C0798k.C0809h hVar = kVar.f4244d;
            boolean z2 = true;
            if (hVar.f4314h != null || this.f5362g == null) {
                z = false;
            } else {
                z = true;
            }
            if (hVar.f4311e != null || this.f5361f == null) {
                z2 = false;
            }
            if (z && z2) {
                kVar = kVar.mo6750b().mo6758f(this.f5362g).mo6754b(this.f5361f).mo6753a();
            } else if (z) {
                kVar = kVar.mo6750b().mo6758f(this.f5362g).mo6753a();
            } else if (z2) {
                kVar = kVar.mo6750b().mo6754b(this.f5361f).mo6753a();
            }
            C0798k kVar2 = kVar;
            return new C0992n(kVar2, this.f5356a, this.f5357b, this.f5358c.mo7378a(kVar2), this.f5359d, this.f5360e, (C0993a) null);
        }

        /* renamed from: g */
        public C0994b mo7207b(rk1 rk1) {
            this.f5358c = (rk1) C2725kr.m20986f(rk1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: h */
        public C0994b mo7208c(C1019b bVar) {
            this.f5359d = (C1019b) C2725kr.m20986f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public C0994b(x11.C3565a aVar, C0984l.C0985a aVar2) {
            this(aVar, aVar2, new C0908a(), new C1018a(), 1048576);
        }

        public C0994b(x11.C3565a aVar, C0984l.C0985a aVar2, rk1 rk1, C1019b bVar, int i) {
            this.f5356a = aVar;
            this.f5357b = aVar2;
            this.f5358c = rk1;
            this.f5359d = bVar;
            this.f5360e = i;
        }
    }

    public /* synthetic */ C0992n(C0798k kVar, x11.C3565a aVar, C0984l.C0985a aVar2, C0912c cVar, C1019b bVar, int i, C0993a aVar3) {
        this(kVar, aVar, aVar2, cVar, bVar, i);
    }

    /* renamed from: A */
    public void mo7181A() {
        this.f5348l.mo7358a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.media3.exoplayer.source.n$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7730B() {
        /*
            r9 = this;
            m36 r8 = new m36
            long r1 = r9.f5352p
            boolean r3 = r9.f5353q
            boolean r5 = r9.f5354r
            androidx.media3.common.k r7 = r9.f5344h
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f5351o
            if (r0 == 0) goto L_0x001a
            androidx.media3.exoplayer.source.n$a r0 = new androidx.media3.exoplayer.source.n$a
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.mo7585z(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0992n.mo7730B():void");
    }

    /* renamed from: c */
    public C0971h mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        x11 a = this.f5346j.mo21778a();
        ov6 ov6 = this.f5355s;
        if (ov6 != null) {
            a.mo7617g(ov6);
        }
        return new C0986m(this.f5345i.f4307a, a, this.f5347k.mo7693a(mo7583w()), this.f5348l, mo7577q(bVar), this.f5349m, mo7579s(bVar), this, nfVar, this.f5345i.f4311e, this.f5350n);
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        return this.f5344h;
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        ((C0986m) hVar).mo7714f0();
    }

    /* renamed from: l */
    public void mo7727l(long j, boolean z, boolean z2) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = this.f5352p;
        }
        if (this.f5351o || this.f5352p != j || this.f5353q != z || this.f5354r != z2) {
            this.f5352p = j;
            this.f5353q = z;
            this.f5354r = z2;
            this.f5351o = false;
            mo7730B();
        }
    }

    /* renamed from: m */
    public void mo7204m() {
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        this.f5355s = ov6;
        this.f5348l.mo7362e();
        this.f5348l.mo7359b((Looper) C2725kr.m20985e(Looper.myLooper()), mo7583w());
        mo7730B();
    }

    public C0992n(C0798k kVar, x11.C3565a aVar, C0984l.C0985a aVar2, C0912c cVar, C1019b bVar, int i) {
        this.f5345i = (C0798k.C0809h) C2725kr.m20985e(kVar.f4244d);
        this.f5344h = kVar;
        this.f5346j = aVar;
        this.f5347k = aVar2;
        this.f5348l = cVar;
        this.f5349m = bVar;
        this.f5350n = i;
        this.f5351o = true;
        this.f5352p = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
