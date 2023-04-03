package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.C0821o;
import java.util.List;

/* renamed from: androidx.media3.common.i */
/* compiled from: ForwardingPlayer */
public class C0795i implements C0821o {

    /* renamed from: a */
    public final C0821o f4235a;

    /* renamed from: androidx.media3.common.i$a */
    /* compiled from: ForwardingPlayer */
    public static final class C0796a implements C0821o.C0826d {

        /* renamed from: a */
        public final C0795i f4236a;

        /* renamed from: d */
        public final C0821o.C0826d f4237d;

        public C0796a(C0795i iVar, C0821o.C0826d dVar) {
            this.f4236a = iVar;
            this.f4237d = dVar;
        }

        /* renamed from: D */
        public void mo6715D(int i) {
            this.f4237d.mo6715D(i);
        }

        /* renamed from: E */
        public void mo6716E(boolean z) {
            this.f4237d.mo6727a0(z);
        }

        /* renamed from: H */
        public void mo6717H(boolean z) {
            this.f4237d.mo6717H(z);
        }

        /* renamed from: J */
        public void mo6718J(int i, boolean z) {
            this.f4237d.mo6718J(i, z);
        }

        /* renamed from: L */
        public void mo6719L(C0816l lVar) {
            this.f4237d.mo6719L(lVar);
        }

        /* renamed from: N */
        public void mo6720N(C0840v vVar) {
            this.f4237d.mo6720N(vVar);
        }

        /* renamed from: P */
        public void mo6721P() {
            this.f4237d.mo6721P();
        }

        /* renamed from: Q */
        public void mo6722Q(C0798k kVar, int i) {
            this.f4237d.mo6722Q(kVar, i);
        }

        /* renamed from: T */
        public void mo6723T(PlaybackException playbackException) {
            this.f4237d.mo6723T(playbackException);
        }

        /* renamed from: V */
        public void mo6724V(int i, int i2) {
            this.f4237d.mo6724V(i, i2);
        }

        /* renamed from: W */
        public void mo6725W(C0821o.C0823b bVar) {
            this.f4237d.mo6725W(bVar);
        }

        /* renamed from: Z */
        public void mo6726Z(int i) {
            this.f4237d.mo6726Z(i);
        }

        /* renamed from: a0 */
        public void mo6727a0(boolean z) {
            this.f4237d.mo6727a0(z);
        }

        /* renamed from: b */
        public void mo6728b(boolean z) {
            this.f4237d.mo6728b(z);
        }

        /* renamed from: b0 */
        public void mo6729b0() {
            this.f4237d.mo6729b0();
        }

        /* renamed from: c0 */
        public void mo6730c0(C0821o oVar, C0821o.C0825c cVar) {
            this.f4237d.mo6730c0(this.f4236a, cVar);
        }

        /* renamed from: e0 */
        public void mo6731e0(C0831s sVar, int i) {
            this.f4237d.mo6731e0(sVar, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0796a)) {
                return false;
            }
            C0796a aVar = (C0796a) obj;
            if (!this.f4236a.equals(aVar.f4236a)) {
                return false;
            }
            return this.f4237d.equals(aVar.f4237d);
        }

        /* renamed from: g */
        public void mo6733g(int i) {
            this.f4237d.mo6733g(i);
        }

        /* renamed from: g0 */
        public void mo6734g0(boolean z, int i) {
            this.f4237d.mo6734g0(z, i);
        }

        /* renamed from: h */
        public void mo6735h(C0844x xVar) {
            this.f4237d.mo6735h(xVar);
        }

        /* renamed from: h0 */
        public void mo6736h0(C0842w wVar) {
            this.f4237d.mo6736h0(wVar);
        }

        public int hashCode() {
            return (this.f4236a.hashCode() * 31) + this.f4237d.hashCode();
        }

        /* renamed from: i0 */
        public void mo6738i0(C0788f fVar) {
            this.f4237d.mo6738i0(fVar);
        }

        /* renamed from: k */
        public void mo6739k(C0820n nVar) {
            this.f4237d.mo6739k(nVar);
        }

        /* renamed from: k0 */
        public void mo6740k0(PlaybackException playbackException) {
            this.f4237d.mo6740k0(playbackException);
        }

        /* renamed from: m */
        public void mo6741m(List<dx0> list) {
            this.f4237d.mo6741m(list);
        }

        /* renamed from: o0 */
        public void mo6742o0(C0821o.C0827e eVar, C0821o.C0827e eVar2, int i) {
            this.f4237d.mo6742o0(eVar, eVar2, i);
        }

        /* renamed from: p0 */
        public void mo6743p0(boolean z) {
            this.f4237d.mo6743p0(z);
        }

        /* renamed from: t */
        public void mo6744t(hx0 hx0) {
            this.f4237d.mo6744t(hx0);
        }

        /* renamed from: w */
        public void mo6745w(int i) {
            this.f4237d.mo6745w(i);
        }

        /* renamed from: x */
        public void mo6746x(Metadata metadata) {
            this.f4237d.mo6746x(metadata);
        }

        /* renamed from: z */
        public void mo6747z(boolean z, int i) {
            this.f4237d.mo6747z(z, i);
        }
    }

    /* renamed from: A */
    public void mo6595A() {
        this.f4235a.mo6595A();
    }

    /* renamed from: B */
    public void mo6676B(TextureView textureView) {
        this.f4235a.mo6676B(textureView);
    }

    /* renamed from: C */
    public void mo6677C(int i, long j) {
        this.f4235a.mo6677C(i, j);
    }

    /* renamed from: E */
    public boolean mo6678E() {
        return this.f4235a.mo6678E();
    }

    /* renamed from: F */
    public void mo6679F(boolean z) {
        this.f4235a.mo6679F(z);
    }

    /* renamed from: H */
    public int mo6680H() {
        return this.f4235a.mo6680H();
    }

    /* renamed from: I */
    public void mo6681I(TextureView textureView) {
        this.f4235a.mo6681I(textureView);
    }

    /* renamed from: J */
    public C0844x mo6682J() {
        return this.f4235a.mo6682J();
    }

    /* renamed from: K */
    public boolean mo6596K() {
        return this.f4235a.mo6596K();
    }

    /* renamed from: L */
    public int mo6683L() {
        return this.f4235a.mo6683L();
    }

    /* renamed from: M */
    public long mo6684M() {
        return this.f4235a.mo6684M();
    }

    /* renamed from: N */
    public long mo6685N() {
        return this.f4235a.mo6685N();
    }

    /* renamed from: O */
    public boolean mo6597O() {
        return this.f4235a.mo6597O();
    }

    /* renamed from: P */
    public int mo6686P() {
        return this.f4235a.mo6686P();
    }

    /* renamed from: Q */
    public boolean mo6598Q() {
        return this.f4235a.mo6598Q();
    }

    /* renamed from: R */
    public int mo6687R() {
        return this.f4235a.mo6687R();
    }

    /* renamed from: S */
    public void mo6688S(int i) {
        this.f4235a.mo6688S(i);
    }

    /* renamed from: T */
    public void mo6689T(C0840v vVar) {
        this.f4235a.mo6689T(vVar);
    }

    /* renamed from: U */
    public void mo6690U(SurfaceView surfaceView) {
        this.f4235a.mo6690U(surfaceView);
    }

    /* renamed from: V */
    public int mo6691V() {
        return this.f4235a.mo6691V();
    }

    /* renamed from: W */
    public boolean mo6692W() {
        return this.f4235a.mo6692W();
    }

    /* renamed from: X */
    public long mo6693X() {
        return this.f4235a.mo6693X();
    }

    /* renamed from: Y */
    public void mo6599Y() {
        this.f4235a.mo6599Y();
    }

    /* renamed from: Z */
    public void mo6600Z() {
        this.f4235a.mo6600Z();
    }

    /* renamed from: a0 */
    public C0816l mo6694a0() {
        return this.f4235a.mo6694a0();
    }

    /* renamed from: b */
    public void mo6695b(C0820n nVar) {
        this.f4235a.mo6695b(nVar);
    }

    /* renamed from: b0 */
    public long mo6696b0() {
        return this.f4235a.mo6696b0();
    }

    /* renamed from: c */
    public void mo6601c() {
        this.f4235a.mo6601c();
    }

    /* renamed from: c0 */
    public long mo6697c0() {
        return this.f4235a.mo6697c0();
    }

    /* renamed from: d */
    public C0820n mo6698d() {
        return this.f4235a.mo6698d();
    }

    /* renamed from: d0 */
    public boolean mo6602d0() {
        return this.f4235a.mo6602d0();
    }

    /* renamed from: e */
    public void mo6699e() {
        this.f4235a.mo6699e();
    }

    /* renamed from: e0 */
    public C0821o mo6700e0() {
        return this.f4235a;
    }

    /* renamed from: f */
    public void mo6604f() {
        this.f4235a.mo6604f();
    }

    /* renamed from: g */
    public boolean mo6701g() {
        return this.f4235a.mo6701g();
    }

    public long getDuration() {
        return this.f4235a.getDuration();
    }

    /* renamed from: h */
    public long mo6703h() {
        return this.f4235a.mo6703h();
    }

    /* renamed from: j */
    public void mo6704j(SurfaceView surfaceView) {
        this.f4235a.mo6704j(surfaceView);
    }

    /* renamed from: k */
    public void mo6610k() {
        this.f4235a.mo6610k();
    }

    /* renamed from: l */
    public PlaybackException mo6705l() {
        return this.f4235a.mo6705l();
    }

    /* renamed from: o */
    public C0842w mo6706o() {
        return this.f4235a.mo6706o();
    }

    /* renamed from: p */
    public boolean mo6617p() {
        return this.f4235a.mo6617p();
    }

    /* renamed from: q */
    public hx0 mo6707q() {
        return this.f4235a.mo6707q();
    }

    /* renamed from: r */
    public void mo6708r(C0821o.C0826d dVar) {
        this.f4235a.mo6708r(new C0796a(this, dVar));
    }

    /* renamed from: s */
    public int mo6709s() {
        return this.f4235a.mo6709s();
    }

    /* renamed from: t */
    public boolean mo6618t(int i) {
        return this.f4235a.mo6618t(i);
    }

    /* renamed from: u */
    public boolean mo6619u() {
        return this.f4235a.mo6619u();
    }

    /* renamed from: v */
    public void mo6710v(C0821o.C0826d dVar) {
        this.f4235a.mo6710v(new C0796a(this, dVar));
    }

    /* renamed from: w */
    public int mo6711w() {
        return this.f4235a.mo6711w();
    }

    /* renamed from: x */
    public C0831s mo6712x() {
        return this.f4235a.mo6712x();
    }

    /* renamed from: y */
    public Looper mo6713y() {
        return this.f4235a.mo6713y();
    }

    /* renamed from: z */
    public C0840v mo6714z() {
        return this.f4235a.mo6714z();
    }
}
