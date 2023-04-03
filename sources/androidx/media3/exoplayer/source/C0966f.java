package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.source.f */
/* compiled from: MaskingMediaPeriod */
public final class C0966f implements C0971h, C0971h.C0972a {

    /* renamed from: a */
    public final C0973i.C0975b f5238a;

    /* renamed from: d */
    public final long f5239d;

    /* renamed from: e */
    public final C2891nf f5240e;

    /* renamed from: g */
    public C0973i f5241g;

    /* renamed from: k */
    public C0971h f5242k;

    /* renamed from: r */
    public C0971h.C0972a f5243r;

    /* renamed from: s */
    public C0967a f5244s;

    /* renamed from: x */
    public boolean f5245x;

    /* renamed from: y */
    public long f5246y = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: androidx.media3.exoplayer.source.f$a */
    /* compiled from: MaskingMediaPeriod */
    public interface C0967a {
        /* renamed from: a */
        void mo7628a(C0973i.C0975b bVar, IOException iOException);

        /* renamed from: b */
        void mo7629b(C0973i.C0975b bVar);
    }

    public C0966f(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        this.f5238a = bVar;
        this.f5240e = nfVar;
        this.f5239d = j;
    }

    /* renamed from: a */
    public long mo7241a() {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7241a();
    }

    /* renamed from: b */
    public void mo7620b(C0973i.C0975b bVar) {
        long p = mo7623p(this.f5239d);
        C0971h c = ((C0973i) C2725kr.m20985e(this.f5241g)).mo7197c(bVar, this.f5240e, p);
        this.f5242k = c;
        if (this.f5243r != null) {
            c.mo7254q(this, p);
        }
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7243c(j, ys5);
    }

    /* renamed from: d */
    public boolean mo7244d() {
        C0971h hVar = this.f5242k;
        if (hVar == null || !hVar.mo7244d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        C0971h hVar = this.f5242k;
        if (hVar == null || !hVar.mo7245e(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo7587f(C0971h hVar) {
        ((C0971h.C0972a) w67.m29360j(this.f5243r)).mo7587f(this);
        C0967a aVar = this.f5244s;
        if (aVar != null) {
            aVar.mo7629b(this.f5238a);
        }
    }

    /* renamed from: h */
    public long mo7247h() {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7247h();
    }

    /* renamed from: i */
    public void mo7248i(long j) {
        ((C0971h) w67.m29360j(this.f5242k)).mo7248i(j);
    }

    /* renamed from: j */
    public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f5246y;
        if (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j != this.f5239d) {
            j2 = j;
        } else {
            this.f5246y = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            j2 = j3;
        }
        return ((C0971h) w67.m29360j(this.f5242k)).mo7249j(dx1Arr, zArr, yk5Arr, zArr2, j2);
    }

    /* renamed from: k */
    public long mo7621k() {
        return this.f5246y;
    }

    /* renamed from: l */
    public long mo7250l(long j) {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7250l(j);
    }

    /* renamed from: m */
    public long mo7251m() {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7251m();
    }

    /* renamed from: n */
    public long mo7622n() {
        return this.f5239d;
    }

    /* renamed from: o */
    public void mo7252o() throws IOException {
        try {
            C0971h hVar = this.f5242k;
            if (hVar != null) {
                hVar.mo7252o();
                return;
            }
            C0973i iVar = this.f5241g;
            if (iVar != null) {
                iVar.mo7204m();
            }
        } catch (IOException e) {
            C0967a aVar = this.f5244s;
            if (aVar == null) {
                throw e;
            } else if (!this.f5245x) {
                this.f5245x = true;
                aVar.mo7628a(this.f5238a, e);
            }
        }
    }

    /* renamed from: p */
    public final long mo7623p(long j) {
        long j2 = this.f5246y;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return j2;
        }
        return j;
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        this.f5243r = aVar;
        C0971h hVar = this.f5242k;
        if (hVar != null) {
            hVar.mo7254q(this, mo7623p(this.f5239d));
        }
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        return ((C0971h) w67.m29360j(this.f5242k)).mo7255r();
    }

    /* renamed from: s */
    public void mo7246g(C0971h hVar) {
        ((C0971h.C0972a) w67.m29360j(this.f5243r)).mo7246g(this);
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
        ((C0971h) w67.m29360j(this.f5242k)).mo7256t(j, z);
    }

    /* renamed from: u */
    public void mo7625u(long j) {
        this.f5246y = j;
    }

    /* renamed from: v */
    public void mo7626v() {
        if (this.f5242k != null) {
            ((C0973i) C2725kr.m20985e(this.f5241g)).mo7203g(this.f5242k);
        }
    }

    /* renamed from: w */
    public void mo7627w(C0973i iVar) {
        boolean z;
        if (this.f5241g == null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f5241g = iVar;
    }
}
