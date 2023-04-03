package androidx.media3.exoplayer.source;

import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0977j;
import androidx.media3.exoplayer.upstream.C1019b;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.source.r */
/* compiled from: SingleSampleMediaPeriod */
public final class C1004r implements C0971h, Loader.C1012b<C1007c> {

    /* renamed from: A */
    public final C0792h f5412A;

    /* renamed from: B */
    public final boolean f5413B;

    /* renamed from: C */
    public boolean f5414C;

    /* renamed from: H */
    public byte[] f5415H;

    /* renamed from: I */
    public int f5416I;

    /* renamed from: a */
    public final d21 f5417a;

    /* renamed from: d */
    public final x11.C3565a f5418d;

    /* renamed from: e */
    public final ov6 f5419e;

    /* renamed from: g */
    public final C1019b f5420g;

    /* renamed from: k */
    public final C0977j.C0978a f5421k;

    /* renamed from: r */
    public final ws6 f5422r;

    /* renamed from: s */
    public final ArrayList<C1006b> f5423s = new ArrayList<>();

    /* renamed from: x */
    public final long f5424x;

    /* renamed from: y */
    public final Loader f5425y = new Loader("SingleSampleMediaPeriod");

    /* renamed from: androidx.media3.exoplayer.source.r$b */
    /* compiled from: SingleSampleMediaPeriod */
    public final class C1006b implements yk5 {

        /* renamed from: a */
        public int f5426a;

        /* renamed from: d */
        public boolean f5427d;

        public C1006b() {
        }

        /* renamed from: a */
        public final void mo7802a() {
            if (!this.f5427d) {
                C1004r.this.f5421k.mo7648i(vv3.m29135i(C1004r.this.f5412A.f4175C), C1004r.this.f5412A, 0, (Object) null, 0);
                this.f5427d = true;
            }
        }

        /* renamed from: b */
        public void mo7593b() throws IOException {
            C1004r rVar = C1004r.this;
            if (!rVar.f5413B) {
                rVar.f5425y.mo7226b();
            }
        }

        /* renamed from: c */
        public void mo7803c() {
            if (this.f5426a == 2) {
                this.f5426a = 1;
            }
        }

        /* renamed from: f */
        public int mo7594f(long j) {
            mo7802a();
            if (j <= 0 || this.f5426a == 2) {
                return 0;
            }
            this.f5426a = 2;
            return 1;
        }

        /* renamed from: g */
        public boolean mo7595g() {
            return C1004r.this.f5414C;
        }

        /* renamed from: p */
        public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
            mo7802a();
            C1004r rVar = C1004r.this;
            boolean z = rVar.f5414C;
            if (z && rVar.f5415H == null) {
                this.f5426a = 2;
            }
            int i2 = this.f5426a;
            if (i2 == 2) {
                decoderInputBuffer.mo23888g(4);
                return -4;
            } else if ((i & 2) != 0 || i2 == 0) {
                c82.f8368b = rVar.f5412A;
                this.f5426a = 1;
                return -5;
            } else if (!z) {
                return -3;
            } else {
                C2725kr.m20985e(rVar.f5415H);
                decoderInputBuffer.mo23888g(1);
                decoderInputBuffer.f4594k = 0;
                if ((i & 4) == 0) {
                    decoderInputBuffer.mo6970w(C1004r.this.f5416I);
                    ByteBuffer byteBuffer = decoderInputBuffer.f4592e;
                    C1004r rVar2 = C1004r.this;
                    byteBuffer.put(rVar2.f5415H, 0, rVar2.f5416I);
                }
                if ((i & 1) == 0) {
                    this.f5426a = 2;
                }
                return -4;
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.r$c */
    /* compiled from: SingleSampleMediaPeriod */
    public static final class C1007c implements Loader.C1015e {

        /* renamed from: a */
        public final long f5429a = vi3.m28818a();

        /* renamed from: b */
        public final d21 f5430b;

        /* renamed from: c */
        public final n96 f5431c;

        /* renamed from: d */
        public byte[] f5432d;

        public C1007c(d21 d21, x11 x11) {
            this.f5430b = d21;
            this.f5431c = new n96(x11);
        }

        /* renamed from: a */
        public void mo7723a() throws IOException {
            this.f5431c.mo23542r();
            try {
                this.f5431c.mo6964b(this.f5430b);
                int i = 0;
                while (i != -1) {
                    int o = (int) this.f5431c.mo23539o();
                    byte[] bArr = this.f5432d;
                    if (bArr == null) {
                        this.f5432d = new byte[RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE];
                    } else if (o == bArr.length) {
                        this.f5432d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    n96 n96 = this.f5431c;
                    byte[] bArr2 = this.f5432d;
                    i = n96.read(bArr2, o, bArr2.length - o);
                }
            } finally {
                b21.m11033a(this.f5431c);
            }
        }

        /* renamed from: c */
        public void mo7724c() {
        }
    }

    public C1004r(d21 d21, x11.C3565a aVar, ov6 ov6, C0792h hVar, long j, C1019b bVar, C0977j.C0978a aVar2, boolean z) {
        this.f5417a = d21;
        this.f5418d = aVar;
        this.f5419e = ov6;
        this.f5412A = hVar;
        this.f5424x = j;
        this.f5420g = bVar;
        this.f5421k = aVar2;
        this.f5413B = z;
        this.f5422r = new ws6(new C0836t(hVar));
    }

    /* renamed from: a */
    public long mo7241a() {
        if (this.f5414C || this.f5425y.mo7809j()) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        return j;
    }

    /* renamed from: d */
    public boolean mo7244d() {
        return this.f5425y.mo7809j();
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        if (this.f5414C || this.f5425y.mo7809j() || this.f5425y.mo7808i()) {
            return false;
        }
        x11 a = this.f5418d.mo21778a();
        ov6 ov6 = this.f5419e;
        if (ov6 != null) {
            a.mo7617g(ov6);
        }
        C1007c cVar = new C1007c(this.f5417a, a);
        this.f5421k.mo7640A(new vi3(cVar.f5429a, this.f5417a, this.f5425y.mo7813n(cVar, this, this.f5420g.mo7825b(1))), 1, -1, this.f5412A, 0, (Object) null, 0, this.f5424x);
        return true;
    }

    /* renamed from: f */
    public void mo7224u(C1007c cVar, long j, long j2, boolean z) {
        C1007c cVar2 = cVar;
        n96 b = cVar.f5431c;
        vi3 vi3 = new vi3(cVar2.f5429a, cVar2.f5430b, b.mo23540p(), b.mo23541q(), j, j2, b.mo23539o());
        this.f5420g.mo7826c(cVar2.f5429a);
        this.f5421k.mo7651r(vi3, 1, -1, (C0792h) null, 0, (Object) null, 0, this.f5424x);
    }

    /* renamed from: g */
    public void mo7223s(C1007c cVar, long j, long j2) {
        C1007c cVar2 = cVar;
        this.f5416I = (int) cVar.f5431c.mo23539o();
        this.f5415H = (byte[]) C2725kr.m20985e(cVar.f5432d);
        this.f5414C = true;
        n96 b = cVar.f5431c;
        vi3 vi3 = new vi3(cVar2.f5429a, cVar2.f5430b, b.mo23540p(), b.mo23541q(), j, j2, (long) this.f5416I);
        this.f5420g.mo7826c(cVar2.f5429a);
        this.f5421k.mo7654u(vi3, 1, -1, this.f5412A, 0, (Object) null, 0, this.f5424x);
    }

    /* renamed from: h */
    public long mo7247h() {
        if (this.f5414C) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    /* renamed from: i */
    public void mo7248i(long j) {
    }

    /* renamed from: j */
    public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < dx1Arr.length; i++) {
            yk5 yk5 = yk5Arr[i];
            if (yk5 != null && (dx1Arr[i] == null || !zArr[i])) {
                this.f5423s.remove(yk5);
                yk5Arr[i] = null;
            }
            if (yk5Arr[i] == null && dx1Arr[i] != null) {
                C1006b bVar = new C1006b();
                this.f5423s.add(bVar);
                yk5Arr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    /* renamed from: l */
    public long mo7250l(long j) {
        for (int i = 0; i < this.f5423s.size(); i++) {
            this.f5423s.get(i).mo7803c();
        }
        return j;
    }

    /* renamed from: m */
    public long mo7251m() {
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: n */
    public Loader.C1013c mo7222k(C1007c cVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        Loader.C1013c cVar2;
        C1007c cVar3 = cVar;
        IOException iOException2 = iOException;
        int i2 = i;
        n96 b = cVar.f5431c;
        vi3 vi3 = new vi3(cVar3.f5429a, cVar3.f5430b, b.mo23540p(), b.mo23541q(), j, j2, b.mo23539o());
        long a = this.f5420g.mo7824a(new C1019b.C1022c(vi3, new jr3(1, -1, this.f5412A, 0, (Object) null, 0, w67.m29335U0(this.f5424x)), iOException2, i2));
        int i3 = (a > CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 1 : (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 0 : -1));
        if (i3 == 0 || i2 >= this.f5420g.mo7825b(1)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5413B && z) {
            gk3.m18133j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f5414C = true;
            cVar2 = Loader.f5449f;
        } else if (i3 != 0) {
            cVar2 = Loader.m7530h(false, a);
        } else {
            cVar2 = Loader.f5450g;
        }
        Loader.C1013c cVar4 = cVar2;
        boolean z2 = !cVar4.mo7814c();
        this.f5421k.mo7656w(vi3, 1, -1, this.f5412A, 0, (Object) null, 0, this.f5424x, iOException, z2);
        if (z2) {
            this.f5420g.mo7826c(cVar3.f5429a);
        }
        return cVar4;
    }

    /* renamed from: o */
    public void mo7252o() {
    }

    /* renamed from: p */
    public void mo7801p() {
        this.f5425y.mo7811l();
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        aVar.mo7587f(this);
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        return this.f5422r;
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
    }
}
