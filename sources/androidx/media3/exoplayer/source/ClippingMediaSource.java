package androidx.media3.exoplayer.source;

import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0973i;
import java.io.IOException;
import java.util.ArrayList;

public final class ClippingMediaSource extends C0958c<Void> {

    /* renamed from: k */
    public final C0973i f5158k;

    /* renamed from: l */
    public final long f5159l;

    /* renamed from: m */
    public final long f5160m;

    /* renamed from: n */
    public final boolean f5161n;

    /* renamed from: o */
    public final boolean f5162o;

    /* renamed from: p */
    public final boolean f5163p;

    /* renamed from: q */
    public final ArrayList<C0956b> f5164q;

    /* renamed from: r */
    public final C0831s.C0835d f5165r;

    /* renamed from: s */
    public C0953a f5166s;

    /* renamed from: t */
    public IllegalClippingException f5167t;

    /* renamed from: u */
    public long f5168u;

    /* renamed from: v */
    public long f5169v;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + m6983a(i));
            this.reason = i;
        }

        /* renamed from: a */
        public static String m6983a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.ClippingMediaSource$a */
    public static final class C0953a extends r82 {

        /* renamed from: g */
        public final long f5170g;

        /* renamed from: k */
        public final long f5171k;

        /* renamed from: r */
        public final long f5172r;

        /* renamed from: s */
        public final boolean f5173s;

        public C0953a(C0831s sVar, long j, long j2) throws IllegalClippingException {
            super(sVar);
            long j3;
            long j4;
            boolean z = false;
            if (sVar.mo6875m() == 1) {
                C0831s.C0835d r = sVar.mo6880r(0, new C0831s.C0835d());
                long max = Math.max(0, j);
                if (r.f4453C || max == 0 || r.f4466x) {
                    if (j2 == Long.MIN_VALUE) {
                        j3 = r.f4455I;
                    } else {
                        j3 = Math.max(0, j2);
                    }
                    long j5 = r.f4455I;
                    if (j5 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        j3 = j3 > j5 ? j5 : j3;
                        if (max > j3) {
                            throw new IllegalClippingException(2);
                        }
                    }
                    this.f5170g = max;
                    this.f5171k = j3;
                    int i = (j3 > CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 1 : (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 0 : -1));
                    if (i == 0) {
                        j4 = -9223372036854775807L;
                    } else {
                        j4 = j3 - max;
                    }
                    this.f5172r = j4;
                    if (r.f4467y && (i == 0 || (j5 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j3 == j5))) {
                        z = true;
                    }
                    this.f5173s = z;
                    return;
                }
                throw new IllegalClippingException(1);
            }
            throw new IllegalClippingException(0);
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            long j;
            this.f17209e.mo6873k(0, bVar, z);
            long q = bVar.mo6901q() - this.f5170g;
            long j2 = this.f5172r;
            if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j = -9223372036854775807L;
            } else {
                j = j2 - q;
            }
            return bVar.mo6905v(bVar.f4436a, bVar.f4437d, 0, j, q);
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            this.f17209e.mo6881s(0, dVar, 0);
            long j2 = dVar.f4458P;
            long j3 = this.f5170g;
            dVar.f4458P = j2 + j3;
            dVar.f4455I = this.f5172r;
            dVar.f4467y = this.f5173s;
            long j4 = dVar.f4454H;
            if (j4 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                long max = Math.max(j4, j3);
                dVar.f4454H = max;
                long j5 = this.f5171k;
                if (j5 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    max = Math.min(max, j5);
                }
                dVar.f4454H = max - this.f5170g;
            }
            long U0 = w67.m29335U0(this.f5170g);
            long j6 = dVar.f4463k;
            if (j6 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                dVar.f4463k = j6 + U0;
            }
            long j7 = dVar.f4464r;
            if (j7 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                dVar.f4464r = j7 + U0;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(C0973i iVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (j >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C2725kr.m20981a(z4);
        this.f5158k = (C0973i) C2725kr.m20985e(iVar);
        this.f5159l = j;
        this.f5160m = j2;
        this.f5161n = z;
        this.f5162o = z2;
        this.f5163p = z3;
        this.f5164q = new ArrayList<>();
        this.f5165r = new C0831s.C0835d();
    }

    /* renamed from: A */
    public void mo7181A() {
        super.mo7181A();
        this.f5167t = null;
        this.f5166s = null;
    }

    /* renamed from: I */
    public void mo7558G(Void voidR, C0973i iVar, C0831s sVar) {
        if (this.f5167t == null) {
            mo7560J(sVar);
        }
    }

    /* renamed from: J */
    public final void mo7560J(C0831s sVar) {
        long j;
        sVar.mo6880r(0, this.f5165r);
        long h = this.f5165r.mo6912h();
        long j2 = Long.MIN_VALUE;
        if (this.f5166s == null || this.f5164q.isEmpty() || this.f5162o) {
            long j3 = this.f5159l;
            long j4 = this.f5160m;
            if (this.f5163p) {
                long f = this.f5165r.mo6910f();
                j3 += f;
                j4 += f;
            }
            this.f5168u = h + j3;
            if (this.f5160m != Long.MIN_VALUE) {
                j2 = h + j4;
            }
            this.f5169v = j2;
            int size = this.f5164q.size();
            for (int i = 0; i < size; i++) {
                this.f5164q.get(i).mo7591u(this.f5168u, this.f5169v);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.f5168u - h;
            if (this.f5160m != Long.MIN_VALUE) {
                j2 = this.f5169v - h;
            }
            j = j5;
        }
        try {
            C0953a aVar = new C0953a(sVar, j, j2);
            this.f5166s = aVar;
            mo7585z(aVar);
        } catch (IllegalClippingException e) {
            this.f5167t = e;
            for (int i2 = 0; i2 < this.f5164q.size(); i2++) {
                this.f5164q.get(i2).mo7590p(this.f5167t);
            }
        }
    }

    /* renamed from: c */
    public C0971h mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        C0956b bVar2 = new C0956b(this.f5158k.mo7197c(bVar, nfVar, j), this.f5161n, this.f5168u, this.f5169v);
        this.f5164q.add(bVar2);
        return bVar2;
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        return this.f5158k.mo7199d();
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        C2725kr.m20987g(this.f5164q.remove(hVar));
        this.f5158k.mo7203g(((C0956b) hVar).f5195a);
        if (this.f5164q.isEmpty() && !this.f5162o) {
            mo7560J(((C0953a) C2725kr.m20985e(this.f5166s)).f17209e);
        }
    }

    /* renamed from: m */
    public void mo7204m() throws IOException {
        IllegalClippingException illegalClippingException = this.f5167t;
        if (illegalClippingException == null) {
            super.mo7204m();
            return;
        }
        throw illegalClippingException;
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        super.mo7205y(ov6);
        mo7599H(null, this.f5158k);
    }
}
